package demo;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.concurrent.TimeUnit;
import java.util.jar.Attributes;
import java.util.jar.JarFile;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  10:26 2018/6/27.
 */
public class MultipleApps {
    public static void main(String[] args) throws Exception {
        launchApp(new File(
                "/Users/patrickjiang/dev/github/my_springcloud_tutorial/single-eureka-service/build/libs/single"
                        + "-eureka-service.jar"));
        TimeUnit.SECONDS.sleep(60);
        
        launchApp(new File(
                "/Users/patrickjiang/dev/github/my_springcloud_tutorial/single-config-service/build/libs/single"
                        + "-config-service.jar"));
        TimeUnit.SECONDS.sleep(30);
        
        launchApp(new File(
                "/Users/patrickjiang/dev/github/my_springcloud_tutorial/single-vender-service/build/libs/single"
                        + "-vender-service.jar"));
        TimeUnit.SECONDS.sleep(30);
        
        launchApp(new File(
                "/Users/patrickjiang/dev/github/my_springcloud_tutorial/single-consumer-service/build/libs/single"
                        + "-consumer-service.jar"));
        TimeUnit.SECONDS.sleep(30);
        
        //        Thread eureka = new Thread(()->
        //        {
        //            try {
        //                launchApp(new File("/Users/patrickjiang/dev/github/my_springcloud_tutorial/single-eureka
        // -service/build/libs/single-eureka-service.jar"));
        //                TimeUnit.SECONDS.wait(30);
        //            } catch (Exception e) {
        //                e.printStackTrace();
        //            }
        //        });
        //        Thread config = new Thread(()->
        //        {
        //            try {
        //                launchApp(new File("/Users/patrickjiang/dev/github/my_springcloud_tutorial/single-config
        // -service/build/libs/single-config-service.jar"));
        //                TimeUnit.SECONDS.wait(30);
        //            } catch (Exception e) {
        //                e.printStackTrace();
        //            }
        //        });
        //        Thread vendor = new Thread(()->
        //        {
        //            try {
        //                launchApp(new File("/Users/patrickjiang/dev/github/my_springcloud_tutorial/single-vender
        // -service/build/libs/single-vender-service.jar"));
        //                TimeUnit.SECONDS.wait(30);
        //            } catch (Exception e) {
        //                e.printStackTrace();
        //            }
        //        });
        //        Thread consumer = new Thread(()->
        //        {
        //            try {
        //                launchApp(new File("/Users/patrickjiang/dev/github/my_springcloud_tutorial/single-consumer
        // -service/build/libs/single-consumer-service.jar"));
        //                TimeUnit.SECONDS.wait(30);
        //            } catch (Exception e) {
        //                e.printStackTrace();
        //            }
        //        });
        //        eureka.start();
        //        eureka.join();
        //        config.start();
        //        config.join();
        //        vendor.start();
        //        vendor.join();
        //        consumer.start();
        //        consumer.join();
        
    }
    
    private synchronized static void launchApp(File fatJar, String... args) throws Exception {
        ClassLoader classLoader = new URLClassLoader(new URL[] { fatJar.toURI().toURL() });
        Class<?> mainClass = classLoader.loadClass(getMainClassName(fatJar));
        Method mainMethod = mainClass.getMethod("main", String[].class);
        mainMethod.invoke(null, new Object[] { args });
    }
    
    private static String getMainClassName(File fatJar) throws IOException {
        try (JarFile jarFile = new JarFile(fatJar)) {
            return jarFile.getManifest().getMainAttributes().getValue(Attributes.Name.MAIN_CLASS);
        }
    }
    
}

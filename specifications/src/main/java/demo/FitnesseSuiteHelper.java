package demo;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  10:12 2018/6/27.
 */
public class FitnesseSuiteHelper {
    private static final List<Backend> activeBackends = new ArrayList<>();
    
    public FitnesseSuiteHelper() {
    }
    
    public static void startBackends() throws Exception {
        startBackend("locations-query", "demo.LocationsQueryBackendRunner");
        startBackend("locations-command", "demo.LocationsCommandBackendRunner");
    }
    
    private static void startBackend(final String backendProjectName, final String backendClassName) throws Exception {
        URL backendRunnerUrl = new File("servicerunners/backend-runner/build/classes/main")
                .toURI().toURL();
        URL runnerUrl = new File("servicerunners/" + backendProjectName
                + "/build/classes/main").toURI().toURL();
        URL backendUrl = new File(backendProjectName
                + "/build/classes/main").toURI().toURL();
        URL[] urls = new URL[] { backendUrl, backendRunnerUrl, runnerUrl };
        URLClassLoader cl = new URLClassLoader(urls,
                FitnesseSuiteHelper.class.getClassLoader());
        Class<?> runnerClass = cl.loadClass(backendClassName);
        Object runnerInstance = runnerClass.newInstance();
        
        final Backend backend = new Backend(runnerClass, runnerInstance);
        activeBackends.add(backend);
        
        runnerClass.getMethod("run").invoke(runnerInstance);
    }
    
    public static void stopAllBackends()
    throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        for (Backend b : activeBackends) {
            b.runnerClass.getMethod("stop").invoke(b.runnerInstance);
        }
    }
    
    private static class Backend {
        private Class<?> runnerClass;
        private Object runnerInstance;
        
        Backend(final Class<?> runnerClass, final Object runnerInstance) {
            this.runnerClass = runnerClass;
            this.runnerInstance = runnerInstance;
        }
    }
}

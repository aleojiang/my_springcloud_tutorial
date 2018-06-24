package demo.web;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  14:46 2018/6/24.
 */
public class MyData {
    private String vString;
    private Double vDouble;
    private Integer vInteger;
    
    public MyData() {
    }
    
    public MyData(String vString, Double vDouble, Integer vInteger) {
        this.vString = vString;
        this.vDouble = vDouble;
        this.vInteger = vInteger;
    }
    
    public String getvString() {
        return vString;
    }
    
    public void setvString(String vString) {
        this.vString = vString;
    }
    
    public Double getvDouble() {
        return vDouble;
    }
    
    public void setvDouble(Double vDouble) {
        this.vDouble = vDouble;
    }
    
    public Integer getvInteger() {
        return vInteger;
    }
    
    public void setvInteger(Integer vInteger) {
        this.vInteger = vInteger;
    }
}

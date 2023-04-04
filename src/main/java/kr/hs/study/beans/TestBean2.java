package kr.hs.study.beans;

public class TestBean2 {
    private int data1;
    private String data2;
    private double data3;

    public TestBean2(int data1, String data2, double data3){
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public TestBean2() {

    }

    public int getData1(){
        return data1;
    }

    public void setData1(int data1){
        this.data1 = data1;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public double getData3() {
        return data3;
    }
    public void setData3(double data3) {
        this.data3 = data3;
    }

}

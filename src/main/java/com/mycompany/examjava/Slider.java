package com.mycompany.examjava;
public class Slider extends Component {

    private int value;
    private int minValue;
    private int maxValue;

    public Slider() {
        this.enabled = true;
        this.value = 1;
        this.minValue = 1;
        this.maxValue = 5;
    }

    public Slider(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    private void printData() {
        System.out.println("Value is : " + this.value);
        System.out.println("Minimum Value is : " + this.minValue);
        System.out.println("Maximum Value is : " + this.maxValue);

    }

    public void setValue(int value) {
        this.value = value;
        printData();
    }

    public int getMinValue() {
        return this.minValue;
    }

    public int getMaxValue() {
        return this.maxValue;
    }
}

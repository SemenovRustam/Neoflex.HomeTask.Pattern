package Adapter;

public class Computer {

    public void readFromUSB(USB usb) {
        usb.readUSB();
        System.out.println("Computer read data from USB");
    }
}

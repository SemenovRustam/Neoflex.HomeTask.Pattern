package Adapter;

public class Computer {
    USB usb;

    public Computer(USB usb) {
        this.usb = usb;
    }

    public void read() {
        usb.readUSB();
        System.out.println("Computer read data from USB");
    }
}

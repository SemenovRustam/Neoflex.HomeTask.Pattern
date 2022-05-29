package Adapter;

public class Main {
    public static void main(String[] args) {

        USBImpl usb = new USBImpl();
        FlashCard flashCard = new FlashCardImpl();
        USBAdapter usbAdapter = new USBAdapter(flashCard);
        Computer computer = new Computer(usb);
        Computer computer1 = new Computer(usbAdapter);

        computer.read();
        computer1.read();
    }
}

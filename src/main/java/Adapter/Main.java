package Adapter;

public class Main {
    public static void main(String[] args) {

        USBImpl usb = new USBImpl();
        FlashCard flashCard = new FlashCardImpl();
        USBAdapter usbAdapter = new USBAdapter(flashCard);
        Computer computer = new Computer();

        computer.readFromUSB(usb);
        computer.readFromUSB(usbAdapter);
    }
}

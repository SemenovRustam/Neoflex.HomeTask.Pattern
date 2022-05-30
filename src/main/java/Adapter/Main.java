package Adapter;

public class Main {
    public static void main(String[] args) {

        USBImpl usb = new USBImpl();
        MemoryCard memoryCard = new FlashCardImpl();
        USBAdapter usbAdapter = new USBAdapter(memoryCard);
        Computer computer = new Computer();

        computer.readFromUSB(usb);
        computer.readFromUSB(usbAdapter);
    }
}

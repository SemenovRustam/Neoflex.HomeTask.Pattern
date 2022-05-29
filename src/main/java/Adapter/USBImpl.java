package Adapter;

public class USBImpl implements USB{
    @Override
    public void readUSB() {
        System.out.println("USB передает данные компьютеру");
    }
}

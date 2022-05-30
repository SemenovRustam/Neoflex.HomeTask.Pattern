package Adapter;

public class USBAdapter implements USB {

    MemoryCard memoryCard;

    public USBAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void readUSB() {

        memoryCard.readMemoryCard();
        System.out.println("Memory card передает данные через адаптор.");
    }
}

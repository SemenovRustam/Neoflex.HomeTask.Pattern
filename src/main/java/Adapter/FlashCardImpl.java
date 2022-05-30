package Adapter;

public class FlashCardImpl implements MemoryCard {
    @Override
    public void readMemoryCard() {
        System.out.println("Memory card передает данные компьютеру");
    }
}

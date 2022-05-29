package Adapter;

public class FlashCardImpl implements FlashCard{
    @Override
    public void readFlashCard() {
        System.out.println("flashCard передает данные компьютеру");
    }
}

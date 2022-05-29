package Adapter;

public class USBAdapter implements USB {

    FlashCard flashCard;

    public USBAdapter(FlashCard flashCard) {
        this.flashCard = flashCard;
    }

    @Override
    public void readUSB() {

        flashCard.readFlashCard();
        System.out.println("FlashCard передает данные через адаптор.");
    }
}

public class SimpleMessage implements Message { // реализация интерфейса
    private String textMessage;

    @Override//Анотация
    public void setTextMessage(String textMessage) { //Устанавливает сообщение
        this.textMessage = textMessage;
    }

    @Override//Анотация
    public String getTextMessage() { //Выводит сообщение
        return textMessage;
    }

    public String toString(){return "This text message: " + textMessage;} //строка + что-то = строка

}
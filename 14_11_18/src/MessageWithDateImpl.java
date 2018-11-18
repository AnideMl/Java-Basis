public class MessageWithDateImpl implements MessageWithDate {//Реализует интерфейс  MessageWithDate
    private String textMessage;
    private String date;

    @Override
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    @Override
    public String getTextMessage() {
        return textMessage+date;
    }

    public String toString() {return "****Text message: " + textMessage + "****"+'\n' +
            "Date: " + date ;}
}

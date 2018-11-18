public class Runner {
    public static void main(String[] args) {

        SimpleMessage message = new SimpleMessage();
        message.setTextMessage("Hello, Leo!");

        MessageWithDateImpl messageWithDate = new MessageWithDateImpl();
        messageWithDate.setDate("17.11.2018");
        messageWithDate.setTextMessage("Hello,Vasya");

        Message[] messages = new Message[2];
        messages[0] = message;
        //messages[0] = (Message) message; (Message) - каст. Вернулись в (Message) Все превратили в Message.
        messages[1] = messageWithDate;
        //messages[1] = (Message) messageWithDate; Создали из разных обхектов массив. Крутоооо.


        SimpleMessage returnFunctional = (SimpleMessage) messages[0]; // Каст (SimpleMessage)
        for (int i = 0; i < 2; i++) {
            System.out.println();
            System.out.println(messages[i]);
        }
    }
}

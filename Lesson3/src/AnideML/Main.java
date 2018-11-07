public class Main {
    public static void main(String[] args) {
        Private privateObject = new Private(); // Коннструктор класаа Private()
        //privateObject.valuePrivate;

        Pablic publicObject = new Pablic();
        publicObject.array = new short[] {1, 2};

        Protected protectedObject = new Protected();
        protectedObject.protectedValue = 1;

        Default defaultObject = new Default();
        defaultObject.defaultVariable = 5;
        System.out.print(defaultObject.defaultVariable);
    }

}

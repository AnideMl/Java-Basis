package AnideML;

import AnideML.modifire.Default;
import AnideML.modifire.Pablic;
import AnideML.modifire.Private;
import AnideML.modifire.Protected;

public class Main {
    public static void main(String[] args) {
        Private privateObject = new Private(); // Коннструктор класаа AnideML.modifire.Private()
        //privateObject.valuePrivate;

        Pablic publicObject = new Pablic();
        publicObject.array = new short[]{1, 2};

        Protected protectedObject = new Protected();
        protectedObject.protectedValue = 1;

        Default defaultObject = new Default();
        defaultObject.defaultVariable = 5;
        System.out.print(defaultObject.defaultVariable);
    }

}

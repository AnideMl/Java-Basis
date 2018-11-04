public class Main {
    public Main(){
    }
    public static void main (String[] args)
    {
        Summator summator = new Summator();
        int  result;

        summator.setFirstNumber(2);
        summator.setSecondNumber(2);
        result = summator.sum();
        System.out.println(result);

        summator.setFirstNumber(6);
        summator.setSecondNumber(-4);
        result = summator.sum();
        System.out.println(result);

        summator.setFirstNumber(64);
        summator.setSecondNumber(36);
        result = summator.sum();
        System.out.println(result);
                                                                                                                        //[-2 147 483 648; 2 147 483 647]
        summator.setFirstNumber(2000000000); // int занимает 4 байта = 32 бита => 2^32 (Т.К. каждый бит принимает только 2 значения : 0 и 1) значения => result принадлежит [-2^16; 2^16-1] (т.к. 0 тоже значение))) )
        summator.setSecondNumber(2000000000);//2 000 000 000 + 2 000 000 000 = 4 000 000 000. Происходит переполнение 4-байтного целочисленного типа INT 4 000 000 000 - 2^32 = -294967296
        result = summator.sum();
        System.out.println(result + " В INT");

        summator.secondNumber2 = 2000000000;
        summator.firstNumber2 = 2000000000;
        long result2 = summator.sum2(); // long занимает 8 байт = 64 бита => 2^64 значения => [-9 223 372 036 854 775 808; 9 223 372 036 854 775 807]
        System.out.println(result2 + " В Long");
    }
}

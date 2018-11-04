public class Summator {
    //Поля
    private int firstNumber;
    private int secondNumber;
    public long firstNumber2;
    public long secondNumber2;

    //Методы
    public void setFirstNumber(int value)
    {
        firstNumber = value;
    }
    public void setSecondNumber(int value)
    {
        secondNumber = value;
    }
    public int  sum()
    {
        int result = firstNumber + secondNumber;
        return result;

    }

    public long sum2()
    {
        long result2 = firstNumber2 + secondNumber2;
        return result2;
    }
}

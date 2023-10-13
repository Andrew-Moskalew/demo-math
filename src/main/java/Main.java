public class Main {
    public static void main(String[] args) {
        Calc calc1 = new Calc();
        int result;
        double resultDouble;
        result = calc1.summ(1, 2);
        System.out.println(result);
        result = calc1.subtract(6, 2);
        System.out.println(result);
        result = calc1.multiply(8, 4);
        System.out.println(result);
        resultDouble = calc1.divide(10, 4);
        System.out.println(resultDouble);
        resultDouble = calc1.summ(1.4, 5.5);
        System.out.println(resultDouble);
        resultDouble = calc1.subtract(7.5, 5.2);
        System.out.println(resultDouble);
        resultDouble = calc1.multiply(8.2, 4.5);
        System.out.println(resultDouble);
        resultDouble = calc1.summ(1, 5.5);
        System.out.println(resultDouble);
        resultDouble = calc1.summ(1.4, 5);
        System.out.println(resultDouble);
        String resultString = calc1.summ("1", "2");
        System.out.println(resultString);
    }
}

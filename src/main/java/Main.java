public class Main {
    public static void main(String[] args) {
        Calc calc1 = new Calc();
        double result;

        result = calc1.summ(1, 2);
        System.out.println(result + "\n");

        result = calc1.subtract(6, 2);
        System.out.println(result + "\n");

        result = calc1.multiply(8, 4);
        System.out.println(result + "\n");

        result = calc1.divide(10.2, 0);
        if (result == 555555) {
            System.out.println("Деление на 0 не допустимо");
        } else
            System.out.println(result + "\n");
    }
}

public class Calc {

    int summ(int a, int b) {
        return a + b;
    }

    String summ(String a, String b) {
        int i = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = i + y;
        String r = Integer.toString(z);
        return r;
    }

    double summ(double a, double b) {
        return (double) a + b;
    }

    double summ(int a, double b) {
        return (double) a + b;
    }

    double summ(double a, int b) {
        return (double) a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return (double) a - b;
    }

    double subtract(int a, double b) {
        return (double) a - b;
    }

    double subtract(double a, int b) {
        return (double) a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return (double) a * b;
    }

    double multiply(int a, double b) {
        return (double) a * b;
    }

    double multiply(double a, int b) {
        return (double) a * b;
    }

    double divide(double a, double b) {
        return (double) a / b;
    }

    double divide(int a, int b) {
        return (double) a / b;
    }

    double divide(int a, double b) {
        return (double) a / b;
    }

    double divide(double a, int b) {
        return (double) a / b;
    }
}

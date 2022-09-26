package basic_java.day6.junit;

public class SqrtNewtonMethod {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);

        double epsilon = 1e-15;    // relative error tolerance
        double t = c;              // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2;
        }
        System.out.println("Square root of " + c + " = " + t);
    }
}
package calculator;

public class MathOperator {
    public static double calculation(double num1, char sign, double num2) throws DivideByZero, DivideByNeg, BadOperator {
        double result;

        switch (sign){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) { throw new DivideByZero(); }
                if (num2 < 0) { throw new DivideByNeg(); }
                result = num1 / num2;
            }
            case '%' -> result = num1 % num2;
            default -> throw new BadOperator();
        }

        return result;
    }
}

package hello;


public class calculator {
    public double add(double op1, double op2) {
        return op1 + op2;
    }

    public double subtract(double op1, double op2) {
        return op1 - op2;
    }

    public double multiply(double op1, double op2) {
        return op1 * op1;
    }

    public double divide(double op1, double op2) {
        if (op2 != 0) {
            return op1 / op2;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
}

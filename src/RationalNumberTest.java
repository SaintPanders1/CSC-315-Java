public class RationalNumberTest {

    public static void main(String [] args)
    {
        RationalNumber num1 = new RationalNumber();
        RationalNumber num2 = new RationalNumber(5,2);
        RationalNumber num3 = new RationalNumber(num2);

        System.out.println("Default Constructor: " + num1.toString() + "\n" + "Overload Constructor: " + num2.toString() + "\n" + "Copy Constructor: " + num3.toString());
        System.out.println("Setters and Getters Test: \nOrigional num: " + num1.toString());
        num1.setNumerator(6);
        num1.setDenominator(25);
        System.out.println("Denominator of 0 test: ");
        num1.setDenominator(0);
        System.out.print("Negative number test: ");
        num1.setDenominator(-25);
        System.out.println(num1.toString());
        System.out.println("New Num: " + num1.toString());
        System.out.print("Addition: " + num1 + " + " + num2 + " = " );
        System.out.println(num1.add(num2).toString());
        System.out.print("Subtraction: " + num2 + " - " + num1 + " = ");
        System.out.println(num2.sub(num1).toString());
        System.out.print("Multiplication: " + num1 + " * " + num2 + " = " );
        System.out.println(num1.mult(num2).toString());
        System.out.print("Division: " + num2 + " / " + num1 + " = ");
        System.out.println(num2.div(num1).toString());
        System.out.println("Equality(false): " + num1.toString() + " and " + num2.toString() + ", " + num1.isEqual(num2));
        num1.setNumerator(num2.getNumerator());
        num1.setDenominator(num2.getDenominator());
        System.out.println("Equality(true): " + num1.toString() + " and " + num2.toString() + ", " + num1.isEqual(num2));
    }
}

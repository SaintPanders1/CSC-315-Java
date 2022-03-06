public class ComplexNumberTest {
    public static void main(String [] args)
    {
        ComplexNumbers number = new ComplexNumbers(22.2, 15);
        ComplexNumbers number2 = new ComplexNumbers(30, -10);

        System.out.println("a + bi: " +number.toString());
        System.out.println("c + di: " +number2.toString());
        System.out.println("Addition: ");
        number.add(number2);
        System.out.println(number.toString());
        number.setR(22.2);
        number.setI(15);
        System.out.println("Subtraction: ");;
        number.sub(number2);
        System.out.println(number.toString());
        number.setR(22.2);
        number.setI(15);
        System.out.println("Multiplication: ");
        number.mult(number2);
        System.out.println(number.toString());
        number.setR(22.2);
        number.setI(15);
        System.out.println("Division: ");
        number.div(number2);
        System.out.println(number.toString());
        number.setR(22.2);
        number.setI(15);
        System.out.println("Magnitude: ");
        number.mag();
        System.out.println(number.toString());
        number.setR(22.2);
        number.setI(15);
        System.out.println("Square Root: ");
        number.sqrt();
        System.out.println(number.toString());
        number.setR(22.2);
        number.setI(15);
        System.out.println("Conjugate: ");
        number.conj();
        System.out.println(number.toString());
        number.setR(22.2);
        number.setI(15);
        System.out.println("Equality(false): ");
        System.out.println(number.equals(number2));
        System.out.println(number.toString());
        System.out.println(number2.toString());
        System.out.println("Equality(true): ");
        number2.setR(22.2);
        number2.setI(15);
        System.out.println(number.equals(number2));
        System.out.println(number.toString());
        System.out.println(number2.toString());

    }
}

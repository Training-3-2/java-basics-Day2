
public class OperatorsDemo {

    public static void main(String[] args) {

        // Arithmetic Operator
        int a = 10, b = 5;

        System.out.println("Addition of Two Numbers : " + (a + b));
        System.out.println("Difference of Two Numbers : " + (a + b));
        System.out.println("Multiplication of Two Numbers : " + (a * b));
        System.out.println("Division of Two Numbers : " + (a / b));
        System.out.println("Modulus of Two Numbers : " + (a % b));

        // Comparison Operator
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // Logical Operator(Boolean : True or False)

        boolean x = true, y = false;
        System.out.println(x && y); // AND
        System.out.println(x || y); // OR
        System.out.println(!x); // NOT

        // Assignment Operator(Assign Values)

        int c = 10;
        System.out.println(c += 5);
        System.out.println(c -= 5);
        System.out.println(c *= 3);
        System.out.println(c /= 2);
    }
}

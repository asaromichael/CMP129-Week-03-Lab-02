public class CalculatorTest {

    public static void main(String[] args) {


        Calculator calc = new Calculator();

        //Int Sum
        System.out.println("5 and 6 added together is: " + calc.add(5, 6));

        //Double Sum
        System.out.println("5.5 and 6.7 added together is: " + calc.add(5.5, 6.7));

        //Triple Int Sum
        System.out.println("4, 5 and 6 added together is: " + calc.add(4, 5, 6));

        //String concatenation
        System.out.println("Hello and World concatenated is: " + calc.add("Hello ", "World"));
        


    }
    
}

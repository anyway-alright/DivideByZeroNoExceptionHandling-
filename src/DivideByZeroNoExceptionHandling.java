import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Lenovo on 12/3/2016.
 */
public class DivideByZeroNoExceptionHandling {
    public static int quotient(int numerator, int denominator)
    {
        return numerator/denominator;
    }
    public static void main(String args[])
    {
        boolean contLoop=true;
        Scanner scanner=new Scanner(System.in);

        do {
            try {
                System.out.println("Please enter an integer numerator: ");
                int numerator= scanner.nextInt();
                System.out.println("Please enter an integer denominator: ");
                int denominator= scanner.nextInt();

                int result=quotient(  numerator,denominator  );
                System.out.println("Result is "+ result);
                contLoop=false;

            }
            catch (ArithmeticException arithmeticException)
            {
                System.out.println("Try agian");
            } catch (InputMismatchException inputMismatchException)
            {
                scanner.nextLine();
                System.out.println("Try agian");
            }
        }while (contLoop);


    }
}

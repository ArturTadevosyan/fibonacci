import java.util.Scanner;

public class Fibonacci {

    //1 1 2 3 5 8 13 21 34 55 89
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Fibonacci Index: ");
        int index = scanner.nextInt();

        int firstNumber = 1;
        int secondNumber = 1;
        int result = 1;

        if (index == 1 || index == 2) {
            System.out.println(result);
        } else {
            for (int i = 2; i < index; i++) {
                result = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = result;
            }
            System.out.println("Fibonacci: " + index + " index number = " + result);
        }
    }
}

import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        // Create a Scanner object for input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        // Read the input integer
        int number = scanner.nextInt();
        int reversedNumber = 0;

        // Use a while loop to reverse the number
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;
            // Append the digit to the reversed number
            reversedNumber = reversedNumber * 10 + digit;
            // Remove the last digit from the original number
            number /= 10;
        }

        // Print the reversed number
        System.out.println("Reversed number: " + reversedNumber);

        // Close the scanner
        scanner.close();
    }
}
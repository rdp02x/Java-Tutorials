import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = 0;
        int second = 1;
        int counterVariable = 2;

        System.out.print("Enter the number of values required: ");
        int input = sc.nextInt();

        System.out.print("0, 1, ");
        while (counterVariable != input) {
            int temp = first;
            first = second;
            second = second + temp;
            counterVariable++;
            System.out.print(second + ", ");
        }
    }
}
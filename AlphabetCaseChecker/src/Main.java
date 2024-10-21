import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Alphabet: ");
        char ch = input.next().trim().charAt(0);

        if (ch < 'z' && ch > 'a') {
            System.out.println("Lowercase Letter");
        } else {
            System.out.println("UpperCase Letter");
        }

    }
}


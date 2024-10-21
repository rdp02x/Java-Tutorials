import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 424764423; //sc.nextInt();
        int find = 4;
        int counter = 0;

        while (input > 0) {
            if (input % 10 == find) {
                counter++;
            }
            input = input / 10;
        }
        System.out.println("Occured: " + counter);
    }
}
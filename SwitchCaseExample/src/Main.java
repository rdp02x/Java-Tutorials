import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a Fruit: ");
//        String fruit = sc.next();
//
//        switch (fruit) {
//            case ("Mango"):
//                System.out.println("King of Fruits");
//                break;
//            case ("Grape"):
//                System.out.println("Small Fruit");
//                break;
//            case ("Banana"):
//                System.out.println("Sus Fruit");
//                break;
//            case ("Watermelon"):
//                System.out.println("Large Fruit");
//                break;
//            default:
//                System.out.println("That's not a Fruit!!");
//        }

        System.out.print("Enter the day: ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 4:
            case 3:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:System.out.println("Only 7 days are there in a week");
        }
    }
}
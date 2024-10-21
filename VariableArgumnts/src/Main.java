import java.util.Arrays;

public class Main {
    public static void main(String[] Args) {
        System.out.println("This is an example of VarArgs: ");
        sample(1, 2, 3, 4, 5);
        sample(1, 2);
    }

    static void sample(int ...nums) {
        System.out.println(Arrays.toString(nums));
    }
}
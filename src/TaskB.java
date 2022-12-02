import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            int line = scanner.nextInt();
            if (line==1) {
                ++sum;
                if (sum > result) {
                    result = sum;
                }
            } else {
                sum = 0;

            }
        }
        System.out.println(result);

    }
}

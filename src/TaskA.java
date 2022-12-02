import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String j = scanner.nextLine();
        String s = scanner.nextLine();
        
        int result = 0;



            for (int i = 0; i < s.length(); i++) {
                if (j.indexOf(s.charAt(i))>=0){
                    ++result;
                }
            }
            

        System.out.println(result);
    }
}

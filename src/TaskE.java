import java.io.*;
import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
//        File fileInput = new File("inputE.txt");
//        File fileOutput = new File("outputE.txt");
        String s1 = null;
        String s2 = null;
        int result = 0;


        //read file and do task
//        try (Scanner scanner = new Scanner(fileInput)) {
//            s1 = scanner.nextLine();
//            s2 = scanner.nextLine();
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
        Scanner scanner = new Scanner(System.in);
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();


        //body
        if (s2.length() != s1.length()) {
            result = 0;

        } else if (s1.equals(s2)) {
            result = 1;
        } else {
            int[] alf = new int[26];
            result = 1;
            for (int i = 0; i <s1.length(); i++) {
            alf[s1.charAt(i)-'a']++;
            }
            for (int i = 0; i <s2.length(); i++) {
                alf[s2.charAt(i)-'a']--;
            }
            for (int i = 0; i <26; i++) {
                if (alf[i] != 0) {
                    result = 0;
                }
            }
        }

        //write file
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileOutput))){
//
//            bw.write(result);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(result);
    }
}


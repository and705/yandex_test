import java.io.*;
import java.util.Scanner;

public class TaskD {
    static File fileInput = new File("inputD.txt");
    static File fileOutput = new File("outputD.txt");


    public static void main(String[] args) {

        int n = 0;


        //read file and do task
        try (Scanner scanner = new Scanner(fileInput)) {
            n = scanner.nextInt();
            } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        //write file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileOutput))){
            int length = n * 2;

            char[] chrs = new char[length];

            for (int i = 0; i < length/2; i++) {
                chrs[i] = '(';
            }
            for (int i = length/2; i < length; i++) {
                chrs[i] = ')';
            }
            bw.write(chrs);
            bw.write('\n');

            do {
                int i = length - 1;
                int c = 0;
                while (i >= 0) {
                    c += chrs[i] == ')' ? -1 : 1;
                    if ((c < 0) && (chrs[i] == '(')) break;
                    --i;
                }
                if (i < 0) break;

                chrs[i++] = ')';
                int ind = i;
                for (; i < length; i++) {
                    chrs[i] = (i<= (length-ind+c)/2+ind) ? '(' : ')';
                }
                bw.write(chrs);
                bw.write('\n');
            }while (true);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }


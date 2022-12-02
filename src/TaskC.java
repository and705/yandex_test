import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskC {


    public static void main(String[] args) {
         File fileInput = new File("input.txt");
         File fileOutput = new File("output.txt");
        int n = 0;
        int prev =0;
        int cont = 0;
        ArrayList<Integer> result = new ArrayList();
        //read file and do task
        try (Scanner scanner = new Scanner(fileInput)) {
            n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                prev = cont;
                cont=scanner.nextInt();
                if (!(cont == prev)){
                    result.add(cont);
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        //write file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileOutput))){
            for (int i = 0; i < result.size(); i++) {
                if (!(i==0)) {
                bw.write("\n");
                }
                bw.write(result.get(i).toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }

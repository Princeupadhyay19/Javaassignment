import java.io.*;
import java.util.*;

public class Practical_7 {
    public static int readInFile(String line, File file) throws Exception{
        FileReader fr = new FileReader(file);
        Scanner br = new Scanner(fr);
        String s = null;
        int countLine = 0;
        while(br.hasNextLine()){
            s = br.nextLine();
            countLine++;
            if(line.compareToIgnoreCase(s)==0)
                return countLine;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        File file = new File("D:/Java_Assignment/Practical7/Nameofpeople.txt");
        String line = sc.nextLine();
        System.out.println(readInFile(line, file));
    }
}

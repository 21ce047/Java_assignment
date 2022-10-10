//Created By 21CE047 Akshit Joshi.

package Practical7;

import java.io.*;
import java.util.*;

public class Prac_7 {

    private static Scanner br;
    public static int readInFile(String line, File file) throws Exception{
        FileReader fr = new FileReader(file);
        br = new Scanner(fr);
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
        File file = new File("D:\\JAva ASsignment\\Practical7\\Nameofstudents.txt");
        System.out.println("Enter a name: ");
        String line = sc.nextLine();
        System.out.println(readInFile(line, file));
        System.out.println("21ce047-Akshit Joshi");
    }
}
package fileHandling;

import java.util.*;
import java.io.*;

    public class hello1 {
        public static void main(String[] args) {

            File file = new File("example.txt");
            try {
                if (file.createNewFile()) {
                    int a=2, b=90, c=0;
                    c = a+b;

                    FileWriter writer = new FileWriter(file);
                    writer.write("sum is "+c+"\n");
                    System.out.println("File created: " + file.getName());



                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

package fileHandling;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
public class result {
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int Physics = sc.nextInt();
    int Chemistry = sc.nextInt();
    int Math = sc.nextInt();
    int English = sc.nextInt();
    int Hindi = sc.nextInt();

    FileWriter Result = new FileWriter("result.txt");

    Result.write("Physics: "+Physics+"\n");
    Result.write("Chemistry: "+Chemistry+"\n");
    Result.write("Math: "+Math+"\n");
    Result.write("English: "+English+"\n");
    Result.write("Hindi: "+Hindi+"\n");

        Result.close();
    }
}

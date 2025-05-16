package fileHandling;
import java.io.*;
import java.util.*;

public class Addition {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        FileWriter file = new FileWriter("table.txt");

        file.write("a: " +a+ "\n");
        file.write("b: " +b+ "\n");
        file.write("sum is "+sum+"\n");
        file.write("sub is "+sub+"\n");
        file.write("mul is "+mul+"\n");
        file.write("div is "+div+"\n");

        file.close();

    }
}


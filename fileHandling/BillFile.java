package fileHandling;
import java.io.*;
import java.util.*;

public class BillFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("Bill.txt");
        int s1 = 0; int s2 = 0; int s = 0;
        while(true) {
            System.out.println("1.Dosa 150\n 2.Cholle Bhature 100\n 3.Bill");
            System.out.println("Enter your choice: ");
            int x = sc.nextInt();
            switch (x){
                case 1 :
                    System.out.println("How many quantity you want: ");
                    int a = sc.nextInt();
                    s1 = a * 150;
                    FileWriter Dosa = new FileWriter(file);
                    Dosa.write("Total: "+s1+"\n");
                    break;
                case 2 :
                    System.out.println("How many quantity you want: ");
                    int b = sc.nextInt();
                    s1 = b * 150;
                    FileWriter Chhole = new FileWriter(file);
                    Chhole.write("Total: "+s2+"\n");
                    break;
                case 3:
                    System.out.println("Bill");
                    s = s1 + s2;
                    FileWriter total = new FileWriter(file);
                    total.write("Total amount is: "+s);
                    return;
            }
        }
    }
}

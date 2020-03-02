import java.util.*;
import java.io.*;
import org.junit.*;
public class Main{
    public static void main(String[] argv) throws IOException{
        new Main().run();
    }

    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        int a=sc.nextInt();
        pw = new PrintWriter(new File("output.txt"));
        pw.close();
    }


}
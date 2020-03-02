import java.util.*;
import java.io.*;
public class task623 {
    public static void main(String[] argv) throws IOException{
        new task623().run();
    }

    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException {
        sc = new Scanner(new File("input.txt"));
        pw = new PrintWriter(new File("output.txt"));

        int a = sc.nextInt();
        if (a < 2)
            pw.print(1); else
        {
            int x1 = 1;
            int x2 = 1;
            int x = 0;
            int i = 2;
            while (i <= a)
            {
                x = (x1 + x2) % 10;
                x1 = x2;
                x2 = x;
                i++;
            }
            pw.print(x);
        }

        pw.close();
    }
}
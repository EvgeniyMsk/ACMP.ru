import java.util.*;
import java.io.*;
public class task803 {
    public static void main(String[] argv) throws IOException{
        new task803().run();
    }

    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        pw = new PrintWriter(new File("output.txt"));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < k) {
            list.add(digit(a, b));
            a = a * 10 - digit(a, b) * b;
            i++;
        }
        if (a > b )
            pw.print(list.get(k));
        else pw.print(list.get(k - 1));
        pw.close();
    }

    public int digit(int a, int b)
    {
        return (a * 10 / b);
    }

}
/*
ID: jeyoor1
LANG: JAVA
TASK: test
*/
import java.io.*;
import java.util.*;

class Support {
    int temp;
    String name;
}

class test {
  public static void main (String [] args) throws IOException {
    Scanner f = new Scanner(new FileReader("test.in"));
    ArrayDeque<Integer> test = new ArrayDeque<Integer>();
    Support mine = new Support(); 
    mine.temp = 33;
    mine.name = "BOBB";
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
    int i1 = f.nextInt();
    test.add(i1);
    int i2 = f.nextInt();
    test.add(i2);
    int result = i1 + i2;
    out.println(result);
    out.close();
    System.exit(0);
  }
}

import java.util.Stack;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Stack<Integer> seq = new Stack<Integer>();

    Scanner sc = new Scanner(System.in);
    int total = sc.nextInt();

    for (int i = 0; i < total; i++) {
      int temp = sc.nextInt();
      if (temp == 0) seq.pop();
      else seq.push(temp);
    }
    int sum = 0;
    while (seq.size()>0) {
      sum += seq.pop();
    }
    System.out.println(sum);
  }
}
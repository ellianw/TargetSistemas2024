import java.util.Scanner;

public class Fibonacci{
  public static void main(String[] args) {
    int n1=1, n2=1, n3=0,num;
    boolean fibNum = false;
    System.out.print("Insira um número ");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    System.out.println(n1+"\n"+n2);
    while (n3 <=num) {
      n3 = n1+n2;
      n1 = n2;
      n2 = n3;
      System.out.println(n3);
      if (n3==num||n1==num) {
        fibNum = true;
      }
    }
    if (fibNum) System.out.println("O número " + num + " está presente na sequência de Fibonacci!");
    else System.out.println("O número " + num + " NÃO está presente na sequência de Fibonacci!");
    sc.close();
  }
}
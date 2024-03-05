import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma String a ser invertida ");
        String base = sc.nextLine();
        String out = "";
        for (int i=base.length()-1;i>=0;i--){
            out = out.concat(Character.toString(base.charAt(i)));
        }
        System.out.print("String invertida: \n"+out);
        sc.close();
    }
}

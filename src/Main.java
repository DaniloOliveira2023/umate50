import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int resto = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        a = s.nextInt();
        System.out.print("Digite o segundo número:");
        b = s.nextInt();
        while (b !=0){
           resto = a % b;
           a=b;
           b = resto;
        }
        System.out.println("O Máximo Divisor Comum de a e b é " +a);
    }
}

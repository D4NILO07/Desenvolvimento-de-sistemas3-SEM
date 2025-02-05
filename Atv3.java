import java.util.Locale;
import java.util.Scanner;

public class Atv3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");

        int a=sc.nextInt();

        System.out.print("Digite o segundo número: ");

        int b=sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c=sc.nextInt();

        double soma=a+b+c;
        double Media= soma/3;


        System.out.println("Número 1: "+a);
        System.out.println("Número 2: "+b);
        System.out.println("Número 3: "+c);
        System.out.println("Soma: "+soma);
        Locale.setDefault(Locale.US);
        System.out.printf("Média Aritmética: "+Media); 
        
        sc.close();
    }
}

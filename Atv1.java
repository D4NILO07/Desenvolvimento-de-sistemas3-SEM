import java.util.Scanner;

public class Atv1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");

        double n1=sc.nextDouble();

        System.out.print("Digite o segundo número: ");

        double n2=sc.nextDouble();

        double soma=n1+n2;
        double subtracao=n1-n2;
        double multiplicacao=n1*n2;
        double divisao=n1/n2;
        System.out.println("A Soma dos números é: "+soma);
        System.out.println("A Subtração dos números é: "+subtracao);
        System.out.println("A Multiplicação dos números é: "+multiplicacao);
        System.out.println("A Divisão dos números é: "+divisao);
        sc.close();

}
    

}

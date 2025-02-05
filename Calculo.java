import java.util.Locale;

public class Calculo {

    public static void main(String[] args) {
        double a=6;
        double b=5;
        double soma=a+b;
        double subtracao=a-b;
        double multiplicacao=a*b;
        double divisao=a/b;



        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+subtracao);
        System.out.println("Multiplicação: "+multiplicacao);
        Locale.setDefault(Locale.US);
        System.out.printf("Divisão: "+divisao); 
        
    }
    
}

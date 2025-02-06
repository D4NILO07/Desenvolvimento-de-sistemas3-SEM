import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        
            System.out.print("Digite a Idade: ");
            idade = sc.nextInt();
        


        if (idade <= 12) {
            System.out.println("Você é uma Criança!");
        }

        if (idade >= 13 && idade <= 17) {
            System.out.println("Você é um Adolescente");
        }

        if (idade >= 18 && idade <= 59) {
            System.out.println("Você é um Adulto");
        }

        if (idade >= 60) {
            System.out.println("Você é um Idoso");
        }



        sc.close();
    }
} 
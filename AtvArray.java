import java.util.Scanner;

public class AtvArray {
      public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Digite a quantidade de nomes que deseja inserir: ");
        int tam = input.nextInt();
        String[] nome =new String[tam];
        

        for(int i=0;i<nome.length; i++){
            System.out.print("Digite o " +(i+1)+ "º nome do array:");
            nome[i]=input.next();


        }
        for(int i=0;i<nome.length; i++)
        System.out.println("O nome da " +(i+1)+ "º Posição é: "+nome[i]);
        input.close();

}
}

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
            System.out.print("Digite a senha: ");
            String senha = sc.next();
        


        if (senha .equals("alfa")) {
            System.out.println("Porta Aberta!!");
        }

        else { 
            System.out.println("Porta Fecahda!!");
        }

        sc.close();
    }
}

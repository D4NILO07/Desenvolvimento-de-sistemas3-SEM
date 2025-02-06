import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o prodessor mais fofo do senai: ");
            String professor = sc.next();
            if (professor .equals("Anderson")) {
                System.out.println("Parabéns!");
            }
            else {
                System.out.print("Digite o prodessor mais fofo do senai: ");
                professor = sc.next();
            }

        sc.close();
    }
}

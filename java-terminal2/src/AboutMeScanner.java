import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[] args) {
        // argumentos

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura ");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é: " + altura);
    }
}

// java AbourMe Andre Basseto 34 130
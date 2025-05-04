import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public void adivinhar () {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(101);
        int n;
        System.out.println("-------------------------------------");
        System.out.println("Adivinhe o número!!! (0 - 100)");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite sua tentativa:");
            n = scanner.nextInt();
            if (n > numeroAleatorio) {
                System.out.println("Menor");
            } else if (n < numeroAleatorio) {
                System.out.println("Maior");
            }
        } while (n != numeroAleatorio);

        System.out.println("Você acertou!!! O número aleatorio era: "+ numeroAleatorio);

        scanner.close();
    }
}

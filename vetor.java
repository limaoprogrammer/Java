import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {
        Scanner limao = new Scanner(System.in);

        double[] notas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas[i] = limao.nextDouble();
        }

        System.out.println("Notas armazenadas: ");
        for (int i = 0; i < notas.length; i++) { 
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

    }
}

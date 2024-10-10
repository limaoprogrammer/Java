import java.util.Scanner;

public class vetor2 {
    public static void main(String[] args) {
    Scanner limao = new Scanner(System.in);

        int [] numeros = new int[10];
        

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: " + (i + 1));
            numeros [i] = limao.nextInt();
        }
        for (int i  = 0; 1 < 10; i++) {
            System.out.println("Número " + (i + 1) +  " = " + numeros[i]);
        }
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de Alimentos: ");
        int alimentos = sc.nextInt();

        int[] avaliacao = new int[alimentos];
        int soma = 0;

        for (int i = 0; i < alimentos; i++) {
            System.out.println("Informe a nota do alimento (0 a 10): ");
            int nota = sc.nextInt();


            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Informe uma nota entre 0 e 10.");
                i--;
                continue;
            }

            avaliacao[i] = nota;
            soma += nota;
        }

        double media = (double) soma / alimentos;


        if (media >= 6 && media < 10) {
            System.out.println("Alimento BOM");
        } else if (media < 6 && media >= 0) {
            System.out.println("Alimento RUIM");
        } else {
            System.out.println("Número Inválido");
        }

        sc.close();
    }
}

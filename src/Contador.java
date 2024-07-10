import java.util.Scanner;

public class Contador {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o primeiro parâmetro");
        int parametro1 = scanner.nextInt();

        System.out.println("Digite o primeiro parâmetro");
        int parametro2 = scanner.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro \n" + e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("Erro, o segundo parâmetro deve ser maior que o primeiro");

        } else {
            int contagem = parametroDois - parametroUm;

            int interador = 0;
            while (interador < contagem) {
                ++interador;
                System.out.println("Imprimindo o número " + interador);
            }
        }
    }

}

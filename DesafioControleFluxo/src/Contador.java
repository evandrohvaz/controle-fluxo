import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        // Cria um objeto Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o primeiro parâmetro
        System.out.print("Primeiro parametro: ");
        int parametroUm = scanner.nextInt();
        
        // Solicita o segundo parâmetro
        System.out.print("Segundo parametro: ");
        int parametroDois = scanner.nextInt();

        try {
            // Chama o método contar com os parâmetros fornecidos
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Captura e lida com a exceção ParametrosInvalidosException
            System.out.println("O segundo par\u00E2metro deve ser maior que o primeiro");
        }
    }

    // Método que realiza a contagem e lança uma exceção em caso de parâmetros inválidos
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o segundo parâmetro é menor que o primeiro
        if (parametroDois < parametroUm) {
            // Lança a exceção ParametrosInvalidosException
            throw new ParametrosInvalidosException();
        }
        // Calcula a contagem e imprime os números
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o numero: " + i);
        }
    }
}

// Classe de exceção personalizada ParametrosInvalidosException
class ParametrosInvalidosException extends Exception {}


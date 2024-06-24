import java.util.Random;

public class GeradorSenhas {
    public static void main(String[] args) {
        // Gerar um número aleatório de dígitos entre 5 e 10
        Random random = new Random();
        int numDigitos = random.nextInt(6) + 5;

        // Gerar a senha numérica aleatória
        String senha = gerarSenha(numDigitos);

        // Exibir a senha gerada
        System.out.println("Senha gerada: " + senha);
    }

    // Método para gerar a senha numérica aleatória
    public static String gerarSenha(int numDigitos) {
        StringBuilder senha = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < numDigitos; i++) {
            // Gerar um dígito aleatório de 0 a 9 e adicionar à senha
            int digito = random.nextInt(10);
            senha.append(digito);
        }

        return senha.toString();
    }
}

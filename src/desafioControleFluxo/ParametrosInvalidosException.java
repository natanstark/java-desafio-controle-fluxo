package desafioControleFluxo;

public class ParametrosInvalidosException extends RuntimeException {
    public ParametrosInvalidosException() {
        super(); // Mensagem de erro padrão
    }

    public ParametrosInvalidosException(String mensagem) {
        super("Parâmetros inválidos."); // Permite definir uma mensagem de erro personalizada
    }
}

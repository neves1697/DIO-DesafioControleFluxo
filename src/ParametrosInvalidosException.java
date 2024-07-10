public class ParametrosInvalidosException extends Exception {
    public void validarExcecao() {
        throw new IllegalArgumentException("O primeiro parâmetro deve ser menor que o segundo parâmetro.");
    }
}

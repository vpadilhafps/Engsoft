package atividade.umponto;

public class Nome {
    private String valor;

    public Nome(String valor) {
        if (null == valor || valor.trim().length() == 0 || valor.trim().split(" ").length < 2) {
            throw new RuntimeException("O NOME DEVE CONTER DUAS PALAVRAS\n\n!");
        }
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    @Override
    public String toString() {
        return valor;
    }

}

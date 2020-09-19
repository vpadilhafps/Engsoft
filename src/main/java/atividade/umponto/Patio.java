package atividade.umponto;

public class Patio {
    private int quantidadeDeCarros;

    public Patio() {
    }

    public Patio(int quantidadeDeCarros) {
        setQuantidadeDeCarros(quantidadeDeCarros);
    }

    public int getQuantidadeDeCarros() {
        return quantidadeDeCarros;
    }

    public void setQuantidadeDeCarros(int quantidadeDeCarros) {
        if (quantidadeDeCarros < 0) {
            throw new RuntimeException("Numeros de carros devem ser positivos para alugar!");
        }
        this.quantidadeDeCarros = quantidadeDeCarros;
    }

}

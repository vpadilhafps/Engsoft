package atividade.umponto;

import java.util.ArrayList;
import java.util.List;

public class Empresa extends Patio {

    private String nome;
    private List<Endereco> enderecos = new ArrayList<>();

    // Construtor padrão (agora EXPLÍCITO)
    public Empresa() {
        // Implementamos um construtor padrão EXPLÍCITO para podermos programar dentro
        // dele... :D
        super();
    }

    // Construtor alternativo (vejam que exige um parâmetro, no caso, String nome.)
    public Empresa(final int quantidadeDeCarros, final String nome) {
        // this.quantidadeDeCarros = quantidadeDeCarross;
        // this.setQuantidadeDeCarros(quantidadeDeCarros);
        super(quantidadeDeCarros);
        this.nome = nome;
    }

    @Override
    public void setQuantidadeDeCarros(final int quantidadeDeCarros) {
        super.setQuantidadeDeCarros(quantidadeDeCarros + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Empresa com nome [" + nome + "]";
    }

    public void addEndereco(Endereco novo) {
        this.enderecos.add(novo);
    }
}

package atividade.umponto;

import javax.swing.JOptionPane;

public class AppLoja {

    public static void main(String[] args) {
        // Invocando um construtor alternativo da classe Empresa que exige o nome
        // como parâmetro.
        Empresa localizaLondrina = new Empresa(5, "Localiza Hertz Centro");
        // Invocando um construtor default(ou padrão) da classe Empresa que não exige
        // parâmetros.
        Empresa localizaMaringa = new Empresa();
        Object empresaComoObject = new Empresa(3, "Localiza Veiculos Maringá");


        Endereco avSantosDumont1772 = new Endereco("Av. Santos Dumont", "1772");
        Endereco avColombo1923 = new Endereco("Av. Colombo", "1923");
        Endereco avTuiuti1881 = new Endereco("Av. Tuiuti", "1881");
        

        localizaLondrina.addEndereco(avSantosDumont1772);
        localizaMaringa.addEndereco(avColombo1923);
        ((Empresa) empresaComoObject).addEndereco(avTuiuti1881);

        System.out.println("\n-----------------------------------------------------------------------------");
        System.out.println("QUER ALUGAR UM CARRO? ESSAS SÃO NOSSAS EMPRESAS DESPONIVEIS PARA VOCÊ ALUGAR!!");
        System.out.println("-----------------------------------------------------------------------------\n");
        System.out.println(localizaLondrina.getNome());
        System.out.println(avSantosDumont1772 + "\n");
        //System.out.println("");

        System.out.println(localizaMaringa.getNome());
        System.out.println(avColombo1923 + "\n");

        System.out.println(empresaComoObject.toString());
        System.out.println(avTuiuti1881 + "\n");

        Nome nomeDigitado = new Nome(JOptionPane.showInputDialog(null, "Digite o nome: "));
        System.out.println(nomeDigitado);

		Alugar alugado = new Alugar(JOptionPane.showInputDialog(null, "QUER ALUGAR UM CARRO CONOSCO?"));
        System.out.println(alugado);
    }
}


package atividade.umponto;

import java.util.Scanner;

public class Alugar {
    private boolean alugado = false;
    Scanner s = new Scanner(System.in);
    
    public Alugar(String alugado) {
        System.out.println("DESEJA CONFIRMAR SUA ESCOLHA DIGITE SIM, SE DIGITOU ERRADO DIGITE NÃO: ");
		String lt= s.nextLine();
		
		if(lt.equals("sim")) {
			System.out.println("OBRIGADO POR ALUGAR PELA LOCALIZA!!\n");
		}else{
			System.out.println("UMA PENA, ESPERO QUE VOLTE!!\n");
		}
	}
    public boolean carroalugado() {
        return alugado;
    }
}

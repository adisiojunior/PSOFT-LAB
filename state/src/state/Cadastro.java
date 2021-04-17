package state;

import java.util.Scanner;

public class Cadastro {
	
	public static void main(String[] args) {
		
	    Scanner dados = new Scanner(System.in);
	    Scanner dados1 = new Scanner(System.in);
	    Scanner dados2 = new Scanner(System.in);
	    Scanner dados3 = new Scanner(System.in);
	    Scanner dados4 = new Scanner(System.in);
	    Scanner dados5 = new Scanner(System.in);
	    Scanner dados6 = new Scanner(System.in);
	    Scanner dados7 = new Scanner(System.in);
	    
	    CadastroContoller CadastroController = new CadastroContoller();
	    Pessoa c1 = new Pessoa();

	    String nomeCompleto = "";
	    String Endereco = "";
	    int NumeroSus = 0;
		String telefone = "";
		String profissao = "";
		int comorbidades = 0;
		int idade = 0;
		

	    System.out.println(
	            "Opçoes\n 1-Cadastrar Pessoa\n "
	            + "2-Verificar\n"
	            + " 3-Status\n"
	            + " 4-Sair\n");
	    
	    int numopc = 0;

	    System.out.print(
	            "nº: ");

	    numopc = dados.nextInt();

	    while (numopc == 1) {

	        switch (numopc) {

	            case 1:
	                System.out.println("Nome Completo: ");
	                nomeCompleto = dados1.nextLine();
	                c1.setNomeCompleto(nomeCompleto);

	                System.out.println("Endereço: ");
	                Endereco = dados2.nextLine();
	                c1.setEndereco(Endereco);

	                System.out.println("Numero do SUS: ");
	                NumeroSus = dados3.nextInt();
	                c1.setNumeroSus(NumeroSus);

	                System.out.println("Telefone: ");
	                telefone = dados4.nextLine();
	                c1.setTelefone(telefone);
	                
	                System.out.println("Profissão: ");
	                profissao = dados5.nextLine();
	                c1.setProfissao(profissao);;
	                
	                System.out.println("Você tem Comorbidades: \n  1-Sim\n  0-Não\n ");
	                comorbidades  = dados6.nextInt();
	                c1.setComorbidades(comorbidades);

	                System.out.println("Ano de Nascimento: ");
	                idade = dados7.nextInt();
	                c1.setIdade(idade);
	                
	                System.out.println("\n Cadastrar mais Pessoas?\n  1-Sim\n  0-Não\n");
	                numopc = dados.nextInt();

	                CadastroController.adicionar(c1);
	                c1 = new Pessoa();
	                break;

	            case 2:
	                break;
	        }

	    }

	    CadastroController.listaUsuarios();
	}


}

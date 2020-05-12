package playStore;

public class Menu {
	public static void menuPrincipal() {	
		Main.limparTela();
		System.out.println("---------------------------------------------");
		System.out.println("-- Olá seja bem-vindo ao Moodle Play Store --");
		System.out.println("---------------------------------------------");
		System.out.println("-- Escolha uma das opções abaixo :         --");
		System.out.println("---------------------------------------------");
		System.out.println("-- (1) criar conta usuário                 --");
		System.out.println("-- (2) criar conta desenvolvedor           --");
		System.out.println("-- (3) criar modelo de celular             --");
		System.out.println("-- (4) listar modelos de celulares         --");
		System.out.println("-- (5) login com conta usuário             --");
		System.out.println("-- (6) login com conta desenvolvedor       --");
		System.out.println("-- (7) remover algum modelo de celular     --");
		System.out.println("-- (8) sair do Moodle Play Store           --");
		System.out.println("---------------------------------------------\n");
	}
	
	public static void menuUsuario() {
		Main.limparTela();
		System.out.println("---------------------------------------------");
		System.out.println("--               Bem-vindo                 --");
		System.out.println("---------------------------------------------");
		System.out.println("-- Escolha uma das opções abaixo :         --");
		System.out.println("---------------------------------------------");
		System.out.println("-- (1) ver a loja Moodle Play Store        --");
		System.out.println("-- (2) meus apps intstalados               --");
		System.out.println("-- (3) configurações da conta              --");
		System.out.println("-- (4) fazer logoff da conta               --");
		System.out.println("---------------------------------------------\n");
	}
	
	public static void menuConfigUsuario() {
		Main.limparTela();
		System.out.println("---------------------------------------------");
		System.out.println("--     Configurações da conta usuário :    --");
		System.out.println("---------------------------------------------");
		System.out.println("-- (1) mostrar dados da conta              --");
		System.out.println("-- (2) alterar algum dado da conta         --");
		System.out.println("-- (3) remover conta                       --");
		System.out.println("-- (4) sair de configurações da conta      --");
		System.out.println("---------------------------------------------\n");
	}
	
	public static void menuAltUsuario() {
		Main.limparTela();
		System.out.println("---------------------------------------------");
		System.out.println("--     Alterações da conta usuário :       --");
		System.out.println("---------------------------------------------");
		System.out.println("-- (1) alterar nome                        --");
		System.out.println("-- (2) alterar sobrenome                   --");
		System.out.println("-- (3) alterar data de nascimento          --");
		System.out.println("-- (4) alterar email                       --");
		System.out.println("-- (5) alterar senha                       --");
		System.out.println("-- (6) alterar telefone                    --");
		System.out.println("-- (7) sair de alterações da conta         --");
		System.out.println("---------------------------------------------\n");
	}
	
	public static void menuDesenvolvedor() {
		Main.limparTela();
		System.out.println("---------------------------------------------");
		System.out.println("--              Bem-vindo                  --");
		System.out.println("---------------------------------------------");
		System.out.println("-- Escolha uma das opções abaixo :         --");
		System.out.println("---------------------------------------------");
		System.out.println("-- (1) adicionar um aplicativo             --");
		System.out.println("-- (2) meus apps adicionados               --");
		System.out.println("-- (3) exlcuir algum app                   --");
		System.out.println("-- (4) configurações da conta              --");
		System.out.println("-- (5) fazer logoff da conta               --");
		System.out.println("---------------------------------------------\n");
	}
	
	public static void menuConfigDesenvolvedor() {
		Main.limparTela();
		System.out.println("----------------------------------------------");
		System.out.println("--   Configurações da conta desenvolvedor : --");
		System.out.println("----------------------------------------------");
		System.out.println("-- (1) mostrar dados da conta               --");
		System.out.println("-- (2) alterar algum dado da conta          --");
		System.out.println("-- (3) remover conta                        --");
		System.out.println("-- (4) sair de configurações da conta       --");
		System.out.println("----------------------------------------------\n");
	}
	
	public static void menuAltDesenvolvedor() {
		Main.limparTela();
		System.out.println("---------------------------------------------");
		System.out.println("--   Alterações da conta desenvolvedor :   --");
		System.out.println("---------------------------------------------");
		System.out.println("-- (1) alterar nome                        --");
		System.out.println("-- (2) alterar sobrenome                   --");
		System.out.println("-- (3) alterar data de nascimento          --");
		System.out.println("-- (4) alterar email                       --");
		System.out.println("-- (5) alterar senha                       --");
		System.out.println("-- (6) alterar telefone                    --");
		System.out.println("-- (7) sair de alterações da conta         --");
		System.out.println("---------------------------------------------\n");
	}
	
	public static void menuLoja() {
		Main.limparTela();
		System.out.println("--------------------------------------------------------------");
		System.out.println("--                   Moodle Play Store                      --");
		System.out.println("--------------------------------------------------------------");
		System.out.println("--   Abaixo está nossos principais destaques dessa semana   --");
		System.out.println("--   Você pode escolher qual jogo abaixar pelo código ao    --");
		System.out.println("--   lado esquerdo do nome :                                --");
		System.out.println("--------------------------------------------------------------");
		System.out.println("--   (1) Batman Arkham Knight                               --");
		System.out.println("--   (2) Xadrez Pro                                         --");
		System.out.println("--------------------------------------------------------------");
		System.out.println("--   Abaixo segue outras opções:                            --");
		System.out.println("--------------------------------------------------------------");
		System.out.println("--   (3) voltar ao menu do usuario                          --");
		System.out.println("--------------------------------------------------------------\n");
	}
	
	public static void appBatman() {
		Main.limparTela();
		
		System.out.println("-------------------------------------------------------");
		System.out.println("--                 Batman Arkham Night               --");
		System.out.println("--                                                   --"
                          +"--                          ▄                        --\n"+ 
                           "--                    ▄█▄ █▀█▀█ ▄█▄                  --\n"+ 
                           "--                   ▀▀████▄█▄████▀▀                 --\n"+ 
	                	   "--                        ▀█▀█▀                      --\n");
		System.out.println("--                                                   --\n");
		System.out.println("-------------------------------------------------------");
		System.out.println("-- Descrição: Jogo massa                             --");
		System.out.println("-- Tamanho: 50 MB                                    --");
		System.out.println("-- Sistema Operacional: no minimo Android versão 5.2 --");
		System.out.println("-- Preço : It's free!                                --");
		System.out.println("-------------------------------------------------------");
		System.out.println("-- (1) para instalar aplicativo                      --");
		System.out.println("-- (2) voltar para o menu da loja                    --");
		System.out.println("-------------------------------------------------------\n");
	}
	public static void appXadrez() {
		Main.limparTela();
		System.out.println("-------------------------------------------------------");
		System.out.println("--                    Xadrez Pro                     --");
		System.out.println("--                                                   --");
		System.out.println("--                   ♜♞♝♚♛♝♞♜                                                      --\n"+
				           "--            	             ♟♟♟♟♟♟♟♟                                                      --\n"+
				           "--                   ▓░▓░▓░▓░▓░▓░                    --\n"+ 
				           "--                   ░▓░▓░▓░▓░▓░▓                    --\n"+
				           "--                   ▓░▓░▓░▓░▓░▓░                    --\n"+
				           "--                   ░▓░▓░▓░▓░▓░▓                    --\n"+
				           "--                   ♙♙♙♙♙♙♙♙                                                     --\n"+
				   		   "--                   ♖♘♗♔♕♗♘♖                                                     --\n");
		System.out.println("--                                                   --");
		System.out.println("-------------------------------------------------------");
		System.out.println("-- Descrição: Jogo pra inteligente                   --");
		System.out.println("-- Tamanho: 44,5 MB                                  --");
		System.out.println("-- Sistema Operacional: no minimo Android versão 4.5 --");
		System.out.println("-- Preço : It's free!                                --");
		System.out.println("-------------------------------------------------------");
		System.out.println("-- (1) para instalar aplicativo                      --");
		System.out.println("-- (2) voltar para o menu da loja                    --");
		System.out.println("-------------------------------------------------------");
	}
}

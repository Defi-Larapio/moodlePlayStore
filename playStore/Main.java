package playStore;

import java.util.ArrayList;
import java.util.Scanner;

import playStore.entidades.Aplicativo;
import playStore.entidades.Celular;
import playStore.entidades.Desenvolvedor;
import playStore.entidades.Usuario;
public class Main {
	
	public static void main(String[] args) {
		
		int resposta,respostaUser,respostaLoja,respostaDevoloper,verificador,x = 0;
		@SuppressWarnings("unused")
		int respostaConfig,respostaDefault,respostaIcone,respostaAlt;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<Desenvolvedor>();
		ArrayList<Aplicativo> aplicativos = new ArrayList<Aplicativo>();
		ArrayList<Celular> modelos = new ArrayList<Celular>();
				
		do {
			Menu.menuPrincipal();
			resposta = sc.nextInt();
			sc.nextLine();
			int numeroModelo,auxiliarU = 0, auxiliarD = 0;
			String nome,sobrenome,dataNascimento,email,senha,telefone,numeroCartao,dataCartao,senhaCartao;
			String auxEmail,auxSenha,descricao,icone = null,so,camera,tela,processador,armazenamento;
			String memoriaRAM;
			boolean verEmail = false,verSenha = false;
			//configurando celulares pra pré definição pra deixar de modelos
			if(x == 0) {
						
			//celular1
			nome = "Asus Zenfone Max (M3)";
			so = "Android 9 ZenUI 5.0 Pie";
			camera = "4163 x 3122 pixel , 13 Mp + 8 Mp";
			tela = "720 x 1440 pixel , 5.5 polegadas , IPS LCD";
			processador = "Snapdragon 430 Qualcomm SDM430";
			armazenamento = "64 GB";
			memoriaRAM = "4 GB";
			modelos.add(new Celular(nome,so,camera,tela,processador,armazenamento,memoriaRAM));
			
			//celular2
			nome = "Xiaomi Mi Note 10 Lite";
			so = "Android 10 MIUI 11";
			camera = "9238 x 6928 pixel , 64 Mp + 8 Mp + 5 Mp + 2 Mp";
			tela = "1080 x 2340 pixel , 6.47 polegadas , AMOLED";
			processador = "Snapdragon 730G Qualcomm SDM730G";
			armazenamento = "128 GB";
			memoriaRAM = "6 GB";
			modelos.add(new Celular(nome,so,camera,tela,processador,armazenamento,memoriaRAM));
			
			//celular3
			nome = "Apple iPhone SE";
			so = "iOS 13";
			camera = "4608 x 2592 pixel , 12 Mp";
			tela = "750 x 1334 pixel , 4.7 polegadas , IPS LCD";
			processador = "Apple A13 Bionic";
			armazenamento = "256 GB";
			memoriaRAM = "3 GB";
			modelos.add(new Celular(nome,so,camera,tela,processador,armazenamento,memoriaRAM));
			
			//celular4
			nome = "Samsung Galaxy S10e";
			so = "Android 10 Samsung One UI 2.0";
			camera = "4000 x 3000 pixel , 12 Mp + 16 Mp";
			tela = "1080 x 2280 pixel , 5.8 polegadas , Dynamic AMOLED";
			processador = "SAMSUNG Exynos 9 Octa 9820";
			armazenamento = "128 GB";
			memoriaRAM = "6 GB";
			modelos.add(new Celular(nome,so,camera,tela,processador,armazenamento,memoriaRAM));
			
			//celular5
			nome = "Apple iPhone X";
			so = "iOS 13";
			camera = "4608 x 2592 pixel , 12 Mp + 12 Mp";
			tela = "1125 x 2436 pixel , 5.8 polegadas , OLED";
			processador = "Apple A11 Bionic";
			armazenamento = "256 GB";
			memoriaRAM = "3 GB";
			modelos.add(new Celular(nome,so,camera,tela,processador,armazenamento,memoriaRAM));
			x++;
			}
			switch(resposta){
			
			//cadastro de nova conta de usuário
			case 1 :
				System.out.println("Digite o seu nome : \n");
				nome = sc.nextLine();
				System.out.println("Digite o seu sobrenome : \n");
				sobrenome = sc.nextLine();
				System.out.println("Digite a sua data de nascimento : \n");
				dataNascimento = sc.nextLine();
				System.out.println("Digite algum e-mail para sua conta : \n");
				email = sc.nextLine();
				System.out.println("Digite alguma senha para sua conta");
				senha = sc.nextLine();
				System.out.println("Escolhe qual o seu modelo de celular abaixo :");
				//listando os modelos
				for( int i = 0; i < modelos.size(); i++) {
					System.out.println("\n");
					System.out.println("Modelo "+(i+1));
					System.out.println("Nome : "+ modelos.get(i).getNome());
					System.out.println("Sistema Operacional : "+ modelos.get(i).getSo());
					System.out.println("Dados da tela : "+ modelos.get(i).getTela());
					System.out.println("Processador : "+ modelos.get(i).getProcessador());
					System.out.println("Armazenamento : "+ modelos.get(i).getArmazenamento());
					System.out.println("Memória RAM : "+ modelos.get(i).getMemoriaRAM());
					System.out.println("\n");
				}
				System.out.println("Digite o número de algum modelo :");
				numeroModelo = sc.nextInt();
				System.out.println("Deseja adicionar o número do seu telefone? (1) Sim (0) Não");
				verificador = sc.nextInt();
				if(verificador == 1) {
					System.out.println("Digite o número do seu telefone : \n");
					telefone = sc.nextLine();
					usuarios.add(new Usuario(nome,sobrenome,dataNascimento,email,senha,telefone,numeroModelo));
				}
				else
					usuarios.add(new Usuario(nome,sobrenome,dataNascimento,email,senha,numeroModelo));
				Main.limparTela();
			    System.out.println("Usuário cadastrado com sucesso!\n\n");
			    System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
				respostaDefault = sc.nextInt();
				break;
			
			//cadastro de nova conta de desenvolvedor	
			case 2 : 
				System.out.println("Digite o seu nome : \n");
				nome = sc.nextLine();
				System.out.println("Digite o seu sobrenome : \n");
				sobrenome = sc.nextLine();
				System.out.println("Digite a data de nascimento : \n");
				dataNascimento = sc.nextLine();
				System.out.println("Digite o seu e-mail : \n");
				email = sc.nextLine();
				System.out.println("Digite alguma senha para a conta\n");
				senha = sc.nextLine();
				//listando os modelos
				for( int i = 0; i < modelos.size(); i++) {
					System.out.println("\n");
					System.out.println("Modelo "+(i+1));
					System.out.println("Nome : "+ modelos.get(i).getNome());
					System.out.println("Sistema Operacional : "+ modelos.get(i).getSo());
					System.out.println("Dados da tela : "+ modelos.get(i).getTela());
					System.out.println("Processador : "+ modelos.get(i).getProcessador());
					System.out.println("Armazenamento : "+ modelos.get(i).getArmazenamento());
					System.out.println("Memória RAM : "+ modelos.get(i).getMemoriaRAM());
					System.out.println("\n");
				}
				System.out.println("Digite o número de algum modelo :");
				numeroModelo = sc.nextInt();
				System.out.println("Deseja adicionar o número do seu telefone? (1) Sim (0) Não");
				verificador = sc.nextInt();
				if(verificador == 1) {
					System.out.println("Digite o seu telefone : \n");
					telefone = sc.nextLine();
				}
				else {
					telefone = null;
				}
				Main.limparTela();
				sc.nextLine();
				System.out.println("Para finalizar a conta de desenvolvedor é preciso pagar uma pequena \n"
						+ "taxa de R$100,00 :) ");
				System.out.println("\n\nDigite o numero do seu cartão : \n");
				numeroCartao = sc.nextLine();
				System.out.println("Digite a data de vencimento do cartão : \n");
				dataCartao = sc.nextLine();
				System.out.println("Digite a senha do cartão : ");
				senhaCartao = sc.nextLine();
				if(verificador == 1) {
					desenvolvedores.add(new Desenvolvedor(nome,sobrenome,dataNascimento,email,senha,telefone,numeroCartao,dataCartao,senhaCartao,numeroModelo));
				}
				else {
					desenvolvedores.add(new Desenvolvedor(nome,sobrenome,dataNascimento,email,senha,numeroCartao,dataCartao,senhaCartao,numeroModelo));
				}
				Main.limparTela();
			    System.out.println("Desenvolvedor cadastrado com sucesso!\n\n");
				System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
				respostaDefault = sc.nextInt();
				break;
			
			//criar modelo de celular
			case 3 :
				System.out.println("Digite o nome do celular : \n");
				nome = sc.nextLine();
				System.out.println("Digite o sistema operacional do celular : \n");
				so = sc.nextLine();
				System.out.println("Digite as especificações da câmera : \n");
				camera = sc.nextLine();
				System.out.println("Digite as especificações da tela : \n");
				tela = sc.nextLine();
				System.out.println("Digite o processor utilizado no celular : \n");
				processador = sc.nextLine();
				System.out.println("Digite qual é o tamanho de armazenamento do celular : \n");
				armazenamento = sc.nextLine();
				System.out.println("Digite quantos GB de memória RAM o celular possui : \n");
				memoriaRAM = sc.nextLine();
				modelos.add(new Celular(nome,so,camera,tela,processador,armazenamento,memoriaRAM));
				System.out.println("\n");
			    Main.limparTela();
			    System.out.println("Celular cadastrado com sucesso!\n\n");
			    System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
			    respostaDefault = sc.nextInt();
			    break;
			
			//listando os modelos de celulares
			case 4 :
				Main.limparTela();
				for( int i = 0; i < modelos.size(); i++) {
					System.out.println("\n");
					System.out.println("Modelo "+(i+1)+"\n");
					System.out.println("Nome do celular : "+ modelos.get(i).getNome());
					modelos.get(i).listarEspecificacoes();
					System.out.println("\n");
				}
				System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
				respostaDefault = sc.nextInt();
				break;
			
			//login com conta usuário	
			case 5 : 
				do {
				System.out.println("Digite o seu e-mail : \n");
				auxEmail = sc.next();
				for(int indice = 0; indice < usuarios.size(); indice++)	
					if(usuarios.get(indice).getEmail().contentEquals(auxEmail)) {
						verEmail = true;
						auxiliarU = indice;
					}
					else
						verEmail = false;
				if(verEmail == true)
					continue;
				if(verEmail == false)
					System.out.println("e-mail não cadastrado");
				}while(verEmail == false);
				do {
				System.out.println("Digite a sua senha : \n");
				auxSenha = sc.next();
				for(int indice = 0; indice < usuarios.size(); indice++)	
					if(usuarios.get(indice).getSenha().contentEquals(auxSenha))
						verSenha = true;
					else
						verSenha = false;
				if(verSenha == true)
					System.out.println("login feito com sucesso!");
				else
					System.out.println("erro ao digitar a senha");
				}while(verSenha == false);
				do {
				Menu.menuUsuario();
				respostaUser = sc.nextInt();
				switch(respostaUser) {
					//visualização da loja
					case 1 :
						do {
						Menu.menuLoja();
						respostaLoja = sc.nextInt();
						switch(respostaLoja) {
							case 1:
								Menu.appBatman();
								respostaLoja = sc.nextInt();
								break;
							case 2:
								Menu.appXadrez();
								respostaLoja = sc.nextInt();
								break;
							case 3 :
								break;
						}
						}while(respostaLoja != 3);
						break;
					//configurações da conta usuário
					case 3:
						Menu.menuConfigUsuario();
						respostaConfig = sc.nextInt();
						sc.nextLine();
						switch(respostaConfig) {
							//visualização dos dados da conta
							case 1:
								Main.limparTela();
								usuarios.get(auxiliarU).mostrarDadosUsuario();
								System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
							    respostaDefault = sc.nextInt();
								break;
							//alteração dos dados da conta
							case 2:
								Menu.menuAltUsuario();
								respostaAlt = sc.nextInt();
								sc.nextLine();
								switch(respostaAlt) {
									//alterar nome da conta usuário
									case 1:
										Main.limparTela();
										System.out.println("Digite um nome: \n");
										nome = sc.nextLine();
										usuarios.get(auxiliarU).setNome(nome);
										break;
									//alterar sobrenome da conta usuário	
									case 2:
										Main.limparTela();
										System.out.println("Digite um sobrenome : \n");
										sobrenome = sc.nextLine();
										usuarios.get(auxiliarU).setSobrenome(sobrenome);
										break;
									//alterar data de nascimento da conta usuário	
									case 3:
										Main.limparTela();
										System.out.println("Digite uma data de nascimento : \n");
										dataNascimento = sc.nextLine();
										usuarios.get(auxiliarU).setDataNascimento(dataNascimento);
										break;
									//alterar email da conta usuário	
									case 4:
										Main.limparTela();
										System.out.println("Digite algum e-mail para a alteração da conta : \n");
										email = sc.nextLine();
										usuarios.get(auxiliarU).setEmail(email);
										break;
									//alterar senha da conta usuário
									case 5:
										Main.limparTela();
										System.out.println("Digite alguma senha para a alteração da conta");
										senha = sc.nextLine();
										usuarios.get(auxiliarU).setSenha(senha);
										break;
									//alterar telefone da conta usuário	
									case 6:
										Main.limparTela();
										if(usuarios.get(auxiliarU).getTelefone()== null) {
											System.out.println("telefone não está cadastrado");
											System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
										    respostaDefault = sc.nextInt();
										    break;
										}
										else {
											System.out.println("Digite o número do telefone: \n");
											telefone = sc.nextLine();
											usuarios.get(auxiliarU).setTelefone(telefone);
											break;
										}
									//sair das alterações da conta	
									case 7:
										break;
								}
								break;
							//remoção da conta usuário
							case 3 :
								System.out.println("Digite a sua senha da conta pra confirmar a exclusão da conta : \n");
								senha = sc.nextLine();
								for (int indice = 0; indice < usuarios.size(); indice++) {
									if (usuarios.get(indice).getSenha().contentEquals(senha)) {
										usuarios.remove(indice);
									    System.out.println("Usuário removido com sucesso!\n\n");
									    System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
										respostaDefault = sc.nextInt();
										respostaUser = 4;
									}
									else {
										System.out.println("Erro ao digitar a senha!");
									    System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
										respostaDefault = sc.nextInt();
										break;
									}
								}
								break;
							//sair das configurações da conta
							case 4 :
								break;
						}
					//logoff da conta usuário	
					case 4:
						break;
				}
				}while(respostaUser != 4);
				break;
			
			//login com conta desenvolvedor	
			case 6 : 
				do{
				System.out.println("Digite o seu e-mail : \n");
				auxEmail = sc.next();	
				for(int indice = 0; indice < desenvolvedores.size(); indice++)	
					if(desenvolvedores.get(indice).getEmail().contentEquals(auxEmail))
						verEmail = true;
					else
						verEmail = false;
				if(verEmail == true)
					continue;
				if(verEmail == false)
					System.out.println("e-mail não cadastrado");
				}while(verEmail == false);
				do{
				System.out.println("Digite a sua senha : \n");
				auxSenha = sc.next();
				for(int indice = 0; indice < desenvolvedores.size(); indice++)	
					if(desenvolvedores.get(indice).getSenha().contentEquals(auxSenha)) {
						verSenha = true;
						auxiliarD = indice;
					}
					else
						verSenha = false;
				if(verSenha == true)
					System.out.println("login feito com sucesso!");
				else
					System.out.println("erro ao digitar a senha");
				}while(verSenha == false);
				do {
				Menu.menuDesenvolvedor();
				respostaDevoloper = sc.nextInt();
				switch(respostaDevoloper) {
					//cadastro de um novo aplicativo
					case 1 : 
						Main.limparTela();
						System.out.println("Escolha um dos icones abaixo para o seu aplicativo: \n");
						System.out.println("Digite 1 para essa opção\n"+Aplicativo.getIcone1());
						System.out.println("Digite 2 para essa opção\n"+Aplicativo.getIcone2());
						System.out.println("Digite 3 para essa opção\n"+Aplicativo.getIcone3());
						System.out.println("Digite 4 para essa opção\n"+Aplicativo.getIcone4());
						System.out.println("Digite 5 para essa opção\n"+Aplicativo.getIcone5());
						respostaIcone = sc.nextInt();
						sc.nextLine();
						switch(respostaIcone) {
							case 1:
								icone = Aplicativo.getIcone1();  
								break;
							case 2:
								icone = Aplicativo.getIcone2();
								break;
							case 3:
								icone = Aplicativo.getIcone3();
								break;
							case 4:
								icone = Aplicativo.getIcone4();
								break;
							case 5:
								icone = Aplicativo.getIcone5();
								break;
						}
						System.out.println("Digite o nome do seu aplicativo: \n");
						nome = sc.nextLine();
						System.out.println("Digite qual vai ser o tamanho do aplicativo: \n");
						armazenamento = sc.nextLine();
						System.out.println("Digite qual vai ser o sitema opercional mínimo do aplicativo: \n");
						so = sc.nextLine();
						System.out.println("Digite qual vai ser o processador mínimo do aplicativo: \n");
						processador = sc.nextLine();
						System.out.println("Digite qual vai ser o mínimo de memória RAM para o aplicativo: \n");
						memoriaRAM = sc.nextLine();
						System.out.println("Deseja adicionar uma descrição sobre o aplicativo :");
						System.out.println("(1)sim          (0)não");
						verificador = sc.nextInt();
						if(verificador == 1) {
							System.out.println("Escreva uma breve descrição sobre o aplicativo:\n");
							sc.nextLine();
							descricao = sc.nextLine();
							aplicativos.add(new Aplicativo(nome,so,processador,armazenamento,memoriaRAM,descricao,icone));
						}
						else {
							aplicativos.add(new Aplicativo(nome,so,processador,armazenamento,memoriaRAM,icone));
						}
						Main.limparTela();
						System.out.println("Aplicativo adicionado com sucesso!\n");
						System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
						respostaDefault = sc.nextInt();
						break;
					//mostrar os aplicativos cadastrados	
					case 2 :
						Main.limparTela();
						System.out.println("--          Meus Apps                 --\n\n");
						for(int indice = 0; indice < aplicativos.size(); indice++){
							System.out.println(""+aplicativos.get(indice).getIcone());
							System.out.println("\nNome : "+aplicativos.get(indice).getNome()); 
							System.out.println("\nTamanho : "+aplicativos.get(indice).getArmazenamento());
							System.out.println("\nDescrição : "+aplicativos.get(indice).getDescricao());
							System.out.println("\n");
							aplicativos.get(indice).listarEspecificacoes();
							System.out.println("\n\n\n");
						}
						System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
						respostaDefault = sc.nextInt();
						break;
					//excluir algum aplicativo	
					case 3 :
						sc.nextLine();
						System.out.println("Digite o nome do aplicativo pra ser excluido : ");
						nome = sc.nextLine();
						for (int indice = 0; indice < aplicativos.size(); indice++) {
							if (aplicativos.get(indice).getNome().contentEquals(nome)) {
								aplicativos.remove(indice);
							    System.out.println("Modelo de celular removido com sucesso!\n\n");
							    break;
							}
							else {
								System.out.println("Nome não encontrado!");
							}
						}
						System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
						respostaDefault = sc.nextInt();
						break;
					//configurações da conta desenvolvedor	
					case 4 :
						Menu.menuConfigDesenvolvedor();
						respostaConfig = sc.nextInt();
						sc.nextLine();
						switch(respostaConfig) {
							//visualização dos dados da conta desenvolvedor
							case 1 :
								Main.limparTela();
								desenvolvedores.get(auxiliarD).mostrarDadosDesenvolvedor();
								System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
								respostaDefault = sc.nextInt();
								break;
							//alterações da conta desenvolvedor
							case 2 :
								Main.limparTela();
								Menu.menuAltDesenvolvedor();
								respostaAlt = sc.nextInt();
								sc.nextLine();
								switch(respostaAlt) {
									//alterar nome da conta usuário
									case 1:
										Main.limparTela();
										System.out.println("Digite um nome: \n");
										nome = sc.nextLine();
										desenvolvedores.get(auxiliarD).setNome(nome);
										break;
									//alterar sobrenome da conta usuário	
									case 2:
										Main.limparTela();
										System.out.println("Digite um sobrenome : \n");
										sobrenome = sc.nextLine();
										desenvolvedores.get(auxiliarD).setSobrenome(sobrenome);
										break;
									//alterar data de nascimento da conta usuário	
									case 3:
										Main.limparTela();
										System.out.println("Digite uma data de nascimento : \n");
										dataNascimento = sc.nextLine();
										desenvolvedores.get(auxiliarD).setDataNascimento(dataNascimento);
										break;
									//alterar email da conta usuário	
									case 4:
										Main.limparTela();
										System.out.println("Digite algum e-mail para a alteração da conta : \n");
										email = sc.nextLine();
										desenvolvedores.get(auxiliarD).setEmail(email);
										break;
									//alterar senha da conta usuário
									case 5:
										Main.limparTela();
										System.out.println("Digite alguma senha para a alteração da conta");
										senha = sc.nextLine();
										desenvolvedores.get(auxiliarD).setSenha(senha);
										break;
									//alterar telefone da conta usuário	
									case 6:
										Main.limparTela();
										if(desenvolvedores.get(auxiliarD).getTelefone()== null) {
											System.out.println("telefone não está cadastrado");
											System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
										    respostaDefault = sc.nextInt();
										    break;
										}
										else {
											System.out.println("Digite o número do telefone: \n");
											telefone = sc.nextLine();
											desenvolvedores.get(auxiliarD).setTelefone(telefone);
											break;
										}
									//sair das alterações da conta	
									case 7:
										break;
								}
								break;
							//remoção da conta desenvolvedor
							case 3 :
								System.out.println("Digite a sua senha da conta pra confirmar a exclusão da conta : \n");
								senha = sc.nextLine();
								for (int indice = 0; indice < desenvolvedores.size(); indice++) {
									if (desenvolvedores.get(indice).getSenha().contentEquals(senha)) {
										desenvolvedores.remove(indice);
									    System.out.println("Usuário removido com sucesso!\n\n");
									    System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
										respostaDefault = sc.nextInt();
										respostaDevoloper = 5;
										break;
									}
									else {
										System.out.println("Erro ao digitar a senha!");
									    System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
										respostaDefault = sc.nextInt();
									}
								}
								break;
							//sair das configurações da conta desenvolvedor	
							case 4 :
								break;
						}
					//logoff da conta desenvolvedor	
					case 5 :
						break;
				}
				}while(respostaDevoloper != 5);
				break;
			//remoção de algum modelo de celular			
			case 7 :
				sc.nextLine();
				System.out.println("Digite o nome do modelo de celular que você deseja remover :");
				nome = sc.nextLine();
				for (int indice = 0; indice < modelos.size(); indice++) {
					if (modelos.get(indice).getNome().contentEquals(nome)) {
						modelos.remove(indice);
					    System.out.println("Modelo de celular removido com sucesso!\n\n");
					    System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
						respostaDefault = sc.nextInt();
					}
					else {
						System.out.println("Erro ao digitar ao nome!");
					    System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
						respostaDefault = sc.nextInt();
						break;
					}
				}
				break;
			
			//sair do Moodle Play Store
			case 8 :
				break;
		}
		}while(resposta != 8);

}
	public static void limparTela() {
		for (int i = 0; i < 100; ++i)  
		System.out.println();
	}
}

package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
	do {
		System.out.println("-----------------------------------------------");
		System.out.println("Olá Professor, digite de 1 a 26 para corrigir os exercícios finais com POO "
				+ "\nou 0 para sair.");
		System.out.print("\nSua opção: ");
		int op = leia.nextInt();
		
		if (op == 0) {
			break;
		}
		
		switch(op) {
		case 1: 
			System.out.println("------------------------------");
			Algoritmo01 alg1 = new Algoritmo01();
			System.out.println (alg1.imprimirMensagem());
			break;
			
		case 2: 
			System.out.println("------------------------------");
			System.out.print("Informe seu nome: ");
				String nome = leia.next();
			System.out.println("------------------------------");
			Algoritmo02 alg2 = new Algoritmo02();
			System.out.printf("Nome informado foi %s.\n" , alg2.escrevaSeuNome(nome));//exibindo a variavel nome informada 
			break;
			
		case 3: 
			System.out.println("------------------------------");
			Algoritmo03 alg3 = new Algoritmo03();
			System.out.println("O produto entre " 
												+ alg3.num1 
												+ " e " + alg3.num2 
												+ ": " + alg3.produto());
			break;
			
		case 4: 
			System.out.println("------------------------------");
			Algoritmo04 alg4 = new Algoritmo04();
			System.out.println("A média aritmética de "
													+ alg4.num1 
													+ ", " + alg4.num2 
													+ ", " + alg4.num3 
													+ ": " + alg4.mediaAritmetica());
			break;
			
		case 5: 
			System.out.println("------------------------------");
			System.out.print("Digite um número inteiro: ");
				int numero = leia.nextInt();
			Algoritmo05 alg5 = new Algoritmo05();
			System.out.printf("O número digitado foi %d." , alg5.numeroInformado(numero));
			break;
			
		case 6:
			System.out.println("------------------------------");
			System.out.println("Digite dois números: ");
				int numero1 = leia.nextInt();
				int numero2 = leia.nextInt();
			Algoritmo06 alg6 = new Algoritmo06();
			System.out.printf("Os números digitados foram %d e %d." , alg6.numerosInformados(numero1) 
																	, alg6.numerosInformados(numero2));
			break;
			
		case 7:
			System.out.println("------------------------------");
			System.out.println("Digite o número para qual quer saber o antecessor e o sucessor:");
			
			Algoritmo07 alg7 = new Algoritmo07();
			alg7.numeroX = leia.nextInt();
			System.out.println("------------------------------");
			System.out.println("O número antecessor de " + alg7.numeroX 
												 + " é " + alg7.antecessorNumero(alg7.numeroX));
			System.out.println("O número sucessor de "   + alg7.numeroX
												 + " é " + alg7.sucessorNumero(alg7.numeroX));
			break;
			
		case 8 :
			System.out.println("------------------------------");
			System.out.print("Infome seu nome: ");
				String nomeP = leia.next();
			System.out.print("Infome seu endereço: ");
				String endereco = leia.next();
			System.out.print("Infome seu telefone: ");
				int telefone = leia.nextInt();
			Algoritmo08 alg8 = new Algoritmo08();
				alg8.setNome(nomeP); //passado os valores para a variavel private
				alg8.setEndereco(endereco);
				alg8.setTelefone(telefone);
			System.out.println("------------------------------");
			System.out.println("Nome informado "+alg8.getNome()+".");//mostra os valores da variavel private no main
			System.out.println("Endereço informado "+alg8.getEndereco()+".");
			System.out.println("Telefone informado "+alg8.getTelefone()+".");
			break;
			
		case 9:
			System.out.println("------------------------------");
			System.out.println("Digite dois números inteiros:");
			Algoritmo09 alg9 = new Algoritmo09();
				alg9.nume1 = leia.nextInt();
				alg9.nume2 = leia.nextInt();
			System.out.println("------ SOMA ------");
			System.out.println(alg9.somar(alg9.nume1, alg9.nume2));
			break;
			
		case 10:
			System.out.println("------------------------------");
			System.out.println("Digite dois números inteiros:");
			Algoritmo10 alg10 = new Algoritmo10();
				alg10.nu1 = leia.nextInt();
				alg10.nu2 = leia.nextInt();
			System.out.println("------------------------------");
			System.out.println("Produto de " + alg10.nu1 +" x " + alg10.nu2 
											 + " = " + alg10.produtoDosNumeros(alg10.nu1, alg10.nu2));
			break;
			
		case 11:
			System.out.println("------------------------------");
			System.out.print("Informe um número para qual que saber a terça parte:");
			Algoritmo11 alg11 = new Algoritmo11();
				alg11.num = leia.nextInt();
			System.out.println("------------------------------");
			System.out.println("A terça parte do número "+alg11.num+" é "+alg11.terçaParteDoNumero(alg11.num)+".");
			break;
			
		case 12:
			System.out.println("------------------------------");
			System.out.println("Informe dois números reais para a média aritmética: ");
			Algoritmo12 alg12 = new Algoritmo12();
				alg12.num1 = leia.nextDouble();
				alg12.num2 = leia.nextDouble();
			System.out.println("------------------------------");
			System.out.println("Média é " + alg12.mediaAritmeticaM(alg12.num1, alg12.num2)+".");
			break;
			
		case 13:
			System.out.println("------------------------------");
			System.out.println("Digite quatros números:");
			Algoritmo13 alg13 = new Algoritmo13();
				alg13.numero1 = leia.nextDouble();	
				alg13.numero2 = leia.nextDouble();	
				alg13.numero3 = leia.nextDouble();	
				alg13.numero4 = leia.nextDouble();	
			System.out.println("------------------------------");
			System.out.println(alg13.infoMediaPond());
			System.out.println("A média onderada é "+alg13.mediaPonderada(alg13.numero1,alg13.numero2,alg13.numero3,alg13.numero4)+".");
			break;
			
		case 14:
			System.out.println("------------------------------");
			System.out.print("Informe o saldo para a aplicação R$");
				double saldo = leia.nextDouble();
			System.out.println("------------------------------");
			Algoritmo14 alg14 = new Algoritmo14();
				alg14.setSaldoAplicacao(saldo);
			System.out.println(alg14.mostraMSG() + alg14.reajusteSaldo());
			break;
			
		case 15:
			System.out.println("------------------------------");
			System.out.print("Digite seu salário minimo R$ ");
				double salarioMin = leia.nextDouble();
			System.out.print("Digite a quantidade de quilowatts gastas ");
			int quilowatts = leia.nextInt();
			System.out.println("------------------------------");
			Algoritmo15 alg15 = new Algoritmo15();
				alg15.setSalarioMin(salarioMin);
				alg15.setQuilowatts(quilowatts);
				System.out.println("Valor de cada quilowatts R$ " + alg15.custo()
				+ "\nValor a ser pago R$ " + alg15.valorAPagar()
				+ "\nValor a ser pago com desconto de 10% R$ " + alg15.valorDesconto());
			break;
			
		case 16:
			System.out.println("------------------------------");
			System.out.print("Digite seu nome: ");
				String nome0 = leia.next();
			System.out.println("------------------------------");
			Algoritmo16 alg16 = new Algoritmo16();
				alg16.setNome(nome0);
			System.out.println(alg16.confNome());
			break;
			
		case 17:
			System.out.println("------------------------------");
			Algoritmo17 alg17 = new Algoritmo17();
			System.out.print("Digite a altura do retângulo: ");
				alg17.alturaRe = leia.nextDouble();
			System.out.print("Digite a base do retângulo: ");
				alg17.baseRe = leia.nextDouble();
				System.out.println("------------------------------");
			System.out.println(alg17.calculoRetangulo());
			break;
		

		case 18:
			System.out.println("------------------------------");
			Algoritmo18 alg18 = new Algoritmo18();
			System.out.print("Digite o raio do círculo: ");
				alg18.raio = leia.nextDouble();
			System.out.println("------------------------------");
			System.out.printf(alg18.calculoRaio());
			break;
			
		case 19:
			System.out.println("------------------------------");
			Algoritmo19 alg19 = new Algoritmo19();
			System.out.print("Digite o lado do quadrado: ");
				alg19.ladoQuadrado = leia.nextDouble();
			System.out.println("------------------------------");
			System.out.printf(alg19.calculoQuadrado());
			break;
			
		case 20:
			System.out.println("------------------------------");
			Algoritmo20 alg20 = new Algoritmo20();
			System.out.println("Digite o comprimento do paralelepípedo:");
				alg20.comprimento = leia.nextDouble();
			System.out.println("Digite a largura do paralelepípedo:");
				alg20.largura = leia.nextDouble();
			System.out.println("Digite a altura do paralelepípedo:");
				alg20.altura = leia.nextDouble();
			System.out.println("------------------------------");
			System.out.println(alg20.calculoParalelepipedo());
			break;
			
		case 21:
			System.out.println("------------------------------");
			Algoritmo21 alg21 = new Algoritmo21();
			System.out.println("Digite a altura do triângulo :");
				alg21.alturaT = leia.nextDouble();
			System.out.println("Digite a largura do triângulo :");
				alg21.baseT = leia.nextDouble();
			System.out.println("------------------------------");
			System.out.println(alg21.areaTriangulo());
			break;
		
		case 22:
			System.out.println("------------------------------");
			Algoritmo22 alg22 = new Algoritmo22();
			System.out.println("Informe a medida da diagonal maior: ");
				alg22.diagonalMaior = leia.nextDouble();
			System.out.println("Informe a medida da diagonal menor:");
				alg22.diagonalMenor = leia.nextDouble();
			System.out.println("------------------------------");
			System.out.println(alg22.areaLosango());
			break;
			
		case 23:
			System.out.println("------------------------------");
			System.out.print("Infome seu nome: ");
				String nomePe = leia.next();
			System.out.print("Infome sua idade: ");
				int idade = leia.nextInt();
			Algoritmo23 alg23 = new Algoritmo23();
				alg23.setNome(nomePe);
				alg23.setIdade(idade);
			System.out.println("------------------------------");
			System.out.println("Nome informado "+alg23.getNome()+".");
			System.out.println("Idade informada "+alg23.getIdade()+".");
			break;
			
		case 24:
			System.out.println("------------------------------");
			System.out.println("Informe a temperatura em Celsius:");
				double celsius = leia.nextDouble();
			Algoritmo24 alg24 = new Algoritmo24();
			System.out.println("------------------------------");
			System.out.printf("A temperatura em fahrenheit e %.1f. \n", alg24.converterCel(celsius));
			break;
			
		case 25:
			System.out.println("------------------------------");
			System.out.print("Informe a altura da lata de óleo: ");
				double alturaDaLata = leia.nextDouble();
			System.out.print("Informe o raio da lata de óleo: ");
				double raioDaLata = leia.nextDouble();
			Algoritmo25 alg25 = new Algoritmo25();
			System.out.println("------------------------------");
			System.out.printf("O volume da lata de óleo e %.2f.\n", alg25.calculoVolume(alturaDaLata, raioDaLata));
			break;
		
		case 26:
			System.out.println("------------------------------");
			System.out.print("Informe da prestação R$ ");
				double prestacao = leia.nextDouble();
			System.out.print("Informe o valor da taxa: ");
				double taxa = leia.nextDouble();	
			System.out.print("Informe o tempo de atraso: ");
				int atraso = leia.nextInt();
			Algoritmo26 alg26 = new Algoritmo26();
			System.out.println("------------------------------");				
			System.out.printf("O valor da prestação atrasada é de R$ %.2f. \n", alg26.prestacaoAtrasada(prestacao, taxa, atraso));
				
			break;
			
		default:
			System.out.println("------------------------------");
			System.out.println("Opção inválida!");
			break;
		
		}
		
		 leia.nextLine();
		 	System.out.println("------------------------------");
		    System.out.println("Deseja escolher outra questão? Sim(s) ou Não(n)");
		
	} while (leia.nextLine().equalsIgnoreCase("s") );
	
		System.out.println("------------------------------");
		System.out.println("Até a próxima! Bye!"); 
	
	
		leia.close();
	}

}

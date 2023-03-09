package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Pessoa;
import Entidades.PessoaFisica;
import Entidades.PessoaJuridica;

public class programa {

	public static void main(String[] args) {
		List<Pessoa>lista = new ArrayList<>(); 
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Deseja ver o imposto de quantas pessoas: "); // ver quantidade de pessoas que vao ver seus impostos
		int n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {  // estrutura de repetição para ir adicionando as pessoas a lista
			System.out.println("Dados da #"+i+" pessoa.");
			System.out.print("Pessoa Fisica ou Pessoa Juridica: (f/j) ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			
			if (ch == 'f') {
				System.out.print("Gastos com saude: ");
				double saude = sc.nextDouble();
				lista.add(new PessoaFisica(nome,rendaAnual,saude));
				
			}
			else {
				System.out.print("Quantos funcionarios tem sua empresa: ");
			
			int numFuncionarios = sc.nextInt();
		
			lista.add(new PessoaJuridica(nome,rendaAnual,numFuncionarios));
			}
		}
		
		
		System.out.println();
		System.out.println("IMPOSTOS:");
		
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa.getNome()
					+ ": R$ "
					+ String.format("%.2f",pessoa.imposto()));
		}
		
		
		
		
		sc.close();
	}

}

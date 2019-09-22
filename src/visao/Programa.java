package visao;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import modelo.Funcionario;

public class Programa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner inputData = new Scanner(System.in);
		System.out.println("Vamos cadastrar um funcionario no sistema e imprimir quanto ele vai receber por mês e ano");
		String nome, rg, departamento, data;
		double salario, aumento;
		SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
		Date admissao;
		Funcionario fun;
		
		System.out.println("Digite os dados do funcionario");
		System.out.println("Nome: ");
		nome = scanner.nextLine();
		System.out.println("RG: ");
		rg = scanner.next();
		System.out.println("Departamento");
		departamento = scanner.next();
		System.out.println("Salario: ");
		salario = scanner.nextDouble();
		System.out.println("Digite a data no formato dd/mm/yyyy: ");
		
		try {
		data = inputData.nextLine();
		admissao = dataFormato.parse(data);
		fun = new Funcionario(nome, departamento, rg, admissao, salario);
		System.out.println("Dados do funcionario: ");
		fun.imprimirdados();
		System.out.println("Digite o valor de acrescimo: ");
		aumento = scanner.nextDouble();
		System.out.println("Salario com acrescimo: "+fun.recebeAumento(aumento));
		System.out.println("Valor de ganho anual: "+fun.calculaGanhoAnual());

		}
		catch(ParseException erro) {
			System.out.println(erro.getMessage());
		}finally {
			scanner.close();
			inputData.close();
		}
		
	}
}

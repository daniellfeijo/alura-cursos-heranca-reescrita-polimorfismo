class Funcionario{
	private String nome;
	protected double salario;

	public void setSalario(double salario){
		this.salario = salario;
	}
	public double getBonus(){
		return this.salario * 0.20;
	}
}

class Gerente extends Funcionario{
	//sobrescrevemos o metodo
	//da classe mae Funcionario
	public double getBonus(){
		return this.salario * 0.30;
	}
	//esse metodo não foi reescrito
	//ele pertence somente ao Gerente
	public void cobraEntrega(){
		System.out.println("Está pronto?");
	}
}

class Desenvolvedores extends Funcionario{
	//sobrescrevemos o metodo
	//da classe mae
	public double getBonus(){
		return this.salario * 0.25;
	}
}

class TotalizadorDeBonus {
	private double total = 0;
	//posso usar aqui o polimorfismo
	//onde referencio todos os tipos de 
	//funcionario pelo classe Funcionario
	public void adiciona(Funcionario funcionario){
		this.total += funcionario.getBonus();
	}

	public double getTotal(){
		return this.total;
	}
}

class TestaFuncionario{
	public static void main(String[] args){
		Funcionario joao = new Funcionario();
		joao.setSalario(1000);

		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000);

		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(joaquim);
		totalizador.adiciona(joao);

		System.out.println(joao.getBonus());
		System.out.println(joaquim.getBonus());
		System.out.println(totalizador.getTotal());
		joaquim.cobraEntrega();

	}
}
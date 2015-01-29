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
	public double getBonus(){
		return this.salario * 0.30;
	}
}

class TestaFuncionario{
	public static void main(String[] args){
		Funcionario joao = new Funcionario();
		joao.setSalario(1000);

		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000);

		System.out.println(joao.getBonus());

		System.out.println(joaquim.getBonus());

	}
}
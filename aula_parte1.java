class Funcionario{
	private String nome;
	private double salario;

	public void setSalario(double salario){
		this.salario = salario;
	}
	public double getBonus(){
		return this.salario * 0.20;
	}
}

class TestaFuncionario{
	public static void main(String[] args){
		Funcionario joao = new Funcionario();
		joao.setSalario(1000);

		System.out.println(joao.getBonus());

	}
}
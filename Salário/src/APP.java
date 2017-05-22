
public class APP {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();

		f.setNome("Adoleta");
		f.setSalario(1000);
		f.AumentaSalario();
		System.out.println("Funcionário = " + f.getNome() + " Salário " + f.getSalario());

		Gerente g = new Gerente();

		g.setNome("Açucar");
		g.setSalario(2000);
		g.AumentaSalario();
		System.out.println("Gerente = " + g.getNome() + " Salário " + g.getSalario());

		Programador p = new Programador();

		p.setNome("Marcelo");
		p.setSalario(3000);
		p.AumentaSalario();
		System.out.println("Programador = " + p.getNome() + " Salário " + p.getSalario());

	}

}

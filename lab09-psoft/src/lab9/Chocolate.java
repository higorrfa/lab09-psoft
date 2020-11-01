package lab9;

public class Chocolate extends Fabrica {

	public Chocolate(Cobertura cobertura) {
		super(cobertura);
	}

	@Override
	protected void fazerMassa() {
		System.out.println("Faz a massa de chocolate");

	}
}

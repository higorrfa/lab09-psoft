package lab9;

public class Baunilha extends Fabrica {

	public Baunilha(Cobertura cobertura) {
		super(cobertura);
	}

	@Override
	protected void fazerMassa() {
		System.out.println("Faz a massa de baunilha");

	}

}

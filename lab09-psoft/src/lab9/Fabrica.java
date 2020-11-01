package lab9;

public abstract class Fabrica {

	Cobertura cobertura;

	public Fabrica(Cobertura cobertura) {
		this.cobertura = cobertura;
	}

	protected abstract void fazerMassa();

	protected void prepararBolo() {
		fazerMassa();
		levarAoForno();
		cobertura.fazerCobertura();
		decorarBolo();
	}

	protected void decorarBolo() {
		System.out.println("Decora bolo");
	}

	protected void levarAoForno() {
		System.out.println("Leva ao forno");
	}

}

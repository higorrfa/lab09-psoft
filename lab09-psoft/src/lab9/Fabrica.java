package lab9;

public abstract class Fabrica {

	protected abstract void fazerMassa();

	protected abstract void fazerCobertura();

	protected void prepararBolo() {
		fazerMassa();
		levarAoForno();
		fazerCobertura();
		decorarBolo();
	}

	protected void decorarBolo() {
		System.out.println("Decora bolo");
	}

	protected void levarAoForno() {
		System.out.println("Leva ao forno");
	}

}

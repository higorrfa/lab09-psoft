package lab9;

public class FabricaBoloChocolateComCaramelo extends Fabrica {

	protected void fazerCobertura() {
		System.out.println("Faz cobertura de caramelo");
	}

	protected void fazerMassa() {
		System.out.println("Faz a massa de chocolate");
	}

}
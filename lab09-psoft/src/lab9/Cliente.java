package lab9;

public class Cliente {
	public static void main(String[] args) {
		Fabrica boloDeChocolateComMorango = new Chocolate(new Morango());
		Fabrica boloDeChocolateComCaramelo = new Chocolate(new Caramelo());
		Fabrica boloDeBaunilhaComMorango = new Baunilha(new Morango());
		Fabrica boloDeBaunilhaComCaramelo = new Baunilha(new Caramelo());
		
		System.out.println("Bolo de chocolante com morango:");
		boloDeChocolateComMorango.prepararBolo();
		System.out.println("");
		
		System.out.println("Bolo de chocolante com caramelo:");
		boloDeChocolateComCaramelo.prepararBolo();
		System.out.println("");
			
		System.out.println("Bolo de baunilha com morango:");
		boloDeBaunilhaComMorango.prepararBolo();
		System.out.println("");
		
		System.out.println("Bolo de baunilha com caramelo:");
		boloDeBaunilhaComCaramelo.prepararBolo();

	}
}

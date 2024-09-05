package principal;


import entidade.Cachorro;
import entidade.Gato;

public class main {

	public static void main(String[] args) {
		 
	    Cachorro z = new Cachorro();
				
		
	    System.out.println("Cachorro é au, au");
		System.out.println(z.EmitirSom()+"\n");
		
		Gato y = new Gato();
		System.out.println("Gato é miau, miau");
		System.out.println(y.EmitirSom()+"\n");
		
		
		
		

	}

}
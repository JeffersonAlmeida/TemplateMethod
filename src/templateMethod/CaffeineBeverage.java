package templateMethod;

public abstract class CaffeineBeverage {
	 
	 // Observe que o metodo � final, ou seja, n�o pode ser sobrescrito pelas sub-classes
	 final void prepareRecipe(String nome){
		System.out.println("******************************");
		System.out.println("Preparando " + nome+"\n");
		boilWater();
		brew();
		pourInCup();
		if(clienteQuerCondimentos()){
			addCondiments();	
		}		
		System.out.println("******************************\n\n");
	}
	
	// gancho
	public boolean clienteQuerCondimentos() {
		return true;
	}

	final void pourInCup() {
		System.out.println("Colocando dentro da chicara");
	}
	final void boilWater() {
		System.out.println("Fervendo Agua");
	}
	abstract void brew();
	abstract void addCondiments();
	
}

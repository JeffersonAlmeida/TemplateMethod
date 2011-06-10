package templateMethod;

public abstract class CaffeineBeverage {
	 
	 // Observe que o metodo é final, ou seja, não pode ser sobrescrito pelas sub-classes
	 final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(clienteQuerCondimentos()){
			addCondiments();	
		}		
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

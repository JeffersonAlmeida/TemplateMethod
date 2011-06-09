package templateMethod;

public abstract class CaffeineBeverage {
	// Observe que o metodo � final, ou seja, n�o pode ser sobrescrito pelas sub-classes
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	public void pourInCup() {
		System.out.println("Colocando dentro da chicara");
	}
	public void boilWater() {
		System.out.println("Fervendo Agua");
	}
	abstract void brew();
	abstract void addCondiments();
	
}
package templateMethod;

public class HotFruit extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("Ferve-se frutas picadas ...");		
	}

	@Override
	void addCondiments() {
		System.out.println("Adicionando canela em pó ... ");		
	}

}

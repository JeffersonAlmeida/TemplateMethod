package templateMethod;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Colocando o CH�");		
	}

	@Override
	void addCondiments() {
		System.out.println("Adicionando Limao");		
	}

}

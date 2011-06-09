package templateMethod;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Colocando o CHÁ");		
	}

	@Override
	void addCondiments() {
		System.out.println("Adicionando Limao");		
	}

}

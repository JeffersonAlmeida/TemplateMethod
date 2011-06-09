package templateMethod;

public class Coffee extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("Colocando cafe atravez do Filtro");
	}

	@Override
	void addCondiments() {
		System.out.println("Adicionando Acucar e leite");
	}


}

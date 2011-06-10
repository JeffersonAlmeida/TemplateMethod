package templateMethod;

public class TeaWithHook extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("Colocando o CHÁ");		
	}

	@Override
	void addCondiments() {
		System.out.println("Adicionando Limao");		
	}	
	
	// gancho
	public boolean clienteQuerCondimentos() {
		return true;
	}

}

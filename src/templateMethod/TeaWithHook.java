package templateMethod;

public class TeaWithHook extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("Colocando o CH�");		
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

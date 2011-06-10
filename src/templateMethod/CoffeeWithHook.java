package templateMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("Colocando cafe atravez do Filtro");
	}

	@Override
	void addCondiments() {
		System.out.println("Adicionando Acucar e leite");
	}
	
	// gancho
	public boolean clienteQuerCondimentos() {
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")){
			return true;	
		}else {
			return false;
		}		
	}

	private String getUserInput() {
		String answer = null;
		System.out.println("Would you like milk and sugar with your coffe (y/n)? ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = bufferedReader.readLine();
		} catch (Exception e) {
			System.err.println("IO ERROR trying to read your answer");
		}		
		if(answer==null){
			return "no";
		}
		return answer;
	}
	
}

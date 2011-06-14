package templateMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HotFruitWithHook extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("Ferve-se frutas picadas ...");		
	}

	@Override
	void addCondiments() {
		System.out.println("Adicionando canela em pó ... ");		
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
		System.out.println("Você gostaria de canela em pó no seu HotFruit (y/n)? ");
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

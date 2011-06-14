package templateMethod;

public class TemplateMethodTest {

	public static void main(String[] args) {
		CaffeineBeverage tea = new Tea();
		tea.prepareRecipe("Tea");
		System.out.println("\n***********************\n");
		CaffeineBeverage coffee = new Coffee();
		coffee.prepareRecipe("Coffee");
	}

}

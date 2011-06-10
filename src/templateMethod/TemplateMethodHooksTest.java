package templateMethod;

public class TemplateMethodHooksTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TeaWithHook teaWithHook = new TeaWithHook();
		teaWithHook.prepareRecipe();
		System.out.println("\n***********************\n");
		CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
		coffeeWithHook.prepareRecipe();
	}

}

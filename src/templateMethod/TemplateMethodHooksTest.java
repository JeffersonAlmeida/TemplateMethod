package templateMethod;

public class TemplateMethodHooksTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TeaWithHook teaWithHook = new TeaWithHook();
		teaWithHook.prepareRecipe("Tea");
		
		CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
		coffeeWithHook.prepareRecipe("Coffee");
		
		
		HotFruitWithHook hotFruitWithHook = new HotFruitWithHook();
		hotFruitWithHook.prepareRecipe("HotFruit");
	
	}

}

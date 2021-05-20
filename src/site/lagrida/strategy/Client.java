package site.lagrida.strategy;

public class Client {
	public static void main(String[] args) {
		SortStrategy sortStrategy = new InsertionSort();
		Context context = new Context(sortStrategy);
		context.operation();
		
		sortStrategy = new SelectionSort();
		context.setSortStrategy(sortStrategy);
		context.operation();
		
		sortStrategy = new Quicksort();
		context.setSortStrategy(sortStrategy);
		context.operation();
	}
}

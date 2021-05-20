package site.lagrida.strategy;

public class Context {
	private SortStrategy sortStrategy;
	public Context(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}
	public void setSortStrategy(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}
	public void operation() {
		System.out.println("------ Starting Algorithm:");
		this.sortStrategy.algorithm();
		System.out.println("------ Ending Algorithm\n");
	}
}

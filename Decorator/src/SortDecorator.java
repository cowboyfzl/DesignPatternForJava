
public class SortDecorator extends Decorator {
	public SortDecorator(SchoolReport sr) {
		super(sr);
	}
	
	private void reportSort() {
		System.out.println("我排名第38名");
	}
	
	@Override
	public void report() {
		this.reportSort();
		super.report();
	}
}

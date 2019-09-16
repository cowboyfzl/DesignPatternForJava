
public abstract class Decorator extends SchoolReport {
	private SchoolReport sr;
	// 构造函数，传递成绩单
	public Decorator(SchoolReport sr) {
		this.sr = sr;
	}
	
	public void report() {
		this.sr.report();
	}
	
	public void sign(String name) {
		this.sr.sign(name);
	}
}

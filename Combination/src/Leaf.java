
public class Leaf implements ILeaf {

	private String name = "";
	private String position = "";
	private int salary = 0;
	
	Leaf(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	public String getInfo() {
		String info = "";
		info = "姓名：" + this.name;
		info = info + "\t 职位：" + this.position;
		info = info + "\t 薪水" + this.salary;
		return info;
	}

}

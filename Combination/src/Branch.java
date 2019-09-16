import java.util.ArrayList;

public class Branch implements IBranch {
	private String name = "";
	private String position = "";
	private int salary = 0;
	
	ArrayList<ICorp> subordinateList = new ArrayList<ICorp>();
	
	public Branch(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	@Override
	public String getInfo() {
		String info = "";
		info = "姓名：" + this.name;
		info = info + "\t职位：" + this.position;
		info = info + "\t薪水" + this.salary;
		return info;
	}

	@Override
	public ArrayList<ICorp> getsubordinate() {
		return this.subordinateList;
	}

	@Override
	public void addSubordinate(ICorp corp) {
		this.subordinateList.add(corp);
	}

}

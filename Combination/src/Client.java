
public class Client {

	public static void main(String[] args) {
		Branch ceo = compositeCorpTree();
	}

	public static Branch compositeCorpTree() {
		Branch rootBranch = new Branch("大王麻子", "总经理", 100000);
		Branch developDepBranch = new Branch("刘大瘸子", "研发部经历", 10000);
	}
}

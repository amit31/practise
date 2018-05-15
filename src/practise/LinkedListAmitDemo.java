package practise;
public class LinkedListAmitDemo {

	public static void main(String[] args) {
		LinkedListAmit<String> ls= new 	LinkedListAmit<String>();
		ls.add("Hussein");
		ls.add("Jena");
		ls.add("laya");
		ls.add("Waeel");
		ls.addatEnd("Amit");
		//System.out.println("before delete");
		ls.display();
		ls.findMiddle();
		//System.out.println("after delete");
	// ls.delete();
	//	ls.reverseusingStack();
		ls.reverseAgain();
		ls.display();

	}

}
package week3assignment;

public class Automation extends MultipleLanguage implements TestTool {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation obj =new Automation();
		obj.python();
		obj.selenium();
		obj.ruby();
		obj.java();
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java Programming");
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium Learning");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby Learning Course");
	}

}

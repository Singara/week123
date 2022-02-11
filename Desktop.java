package week3.day2;

public class Desktop extends Computer {

	@Override
	public void display() {
		super.display();
		System.out.println("desktop");
	}
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.display();
	
	
	}

}

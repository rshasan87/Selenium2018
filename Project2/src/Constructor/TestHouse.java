package Constructor;

public class TestHouse {

	public static void main(String[] args) {
		
		House myHouse = null;
		myHouse = new House("Black house");
		myHouse.livingRoom();
		
		House yourHouse = new House();
		yourHouse.displayHouseName();
		
		House herHouse = new House();
		herHouse.displayHouseName("Blue House");
		
		House theirHouse = new House("Downstreet", 30);
		int result = theirHouse.addition(10, 20);
		System.out.println(result);
	

	}

}

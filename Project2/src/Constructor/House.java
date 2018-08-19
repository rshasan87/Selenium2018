package Constructor;

public class House { //open class body
	//variables
	int num1 = 10;
	public String houseName = "";
	public int houseAddress = 90;
	
	//Constructor-1
	public House() {
		
	}
	//Constructor-2
	public House(String houseName) {
		this.houseName = houseName;
		System.out.println(houseName);
	}
	//Constructor-3
	public House(String houseName, int houseAddress) {
			this.houseName = houseName;
			this.houseAddress = houseAddress;
			System.out.println(houseName + " " + houseAddress);
	}
	//Implementing methods	
	public void livingRoom() {
		System.out.println("Watch TV");
	}
	
	public void displayHouseName() {
		System.out.println(houseName);
		
	}
	public void displayHouseName(String houseName) {
		System.out.println(houseName);
		
	}
	public int addition(int num1, int num2) {
		int total = num1 + num2;
		
		return total;
	}

}//close class body

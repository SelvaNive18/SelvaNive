package condition;

public class UseWashingMachine {
	public static void main(String[] args) {
		WashingMachine washingmachine=new WashingMachine();
		washingmachine.brand="Whirlpool";
		washingmachine.color="white";
		washingmachine.price=10000;
		if(washingmachine.brand.contains("a")||washingmachine.brand.contains("e")||washingmachine.brand.contains("i")||washingmachine.brand.contains("o")||washingmachine.brand.contains("u")) {
			System.out.println(washingmachine.brand.substring(1,washingmachine.brand.length()-1));
		}
		else {
			System.out.println(washingmachine.brand.charAt(0)+" "+washingmachine.brand.charAt(washingmachine.brand.length()-1));
			
			
			
		}
	}

}

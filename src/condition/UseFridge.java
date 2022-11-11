package condition;

public class UseFridge {
	public static void main(String[] args) {
		Fridge fridge=new Fridge();
		fridge.brand="Whirpool";
		fridge.price=7000;
		fridge.color="red";
		fridge.isWarrantyAvailable=true;
		
		if(fridge.isWarrantyAvailable==true) {
			System.out.println(fridge.price+(fridge.price*18/100));
		}
		else  {
			System.out.println(fridge.price-(fridge.price*10/100));
			
			
			
		}
		
	}
}

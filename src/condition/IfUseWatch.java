package condition;

public class IfUseWatch {
	public static void main(String[] args) {
		Watch watch1=new Watch();
		watch1.brand="titan";
		watch1.color="black";
		watch1.isWaterProof=true;
		watch1.price=3000;
	
		Watch watch2=new Watch();
		watch2.brand="FastTrack";
		watch2.color="Red";
		watch2.isWaterProof=true;
		watch2.price=2000;
		if(watch1.price>watch2.price) {
			System.out.println(watch1.brand.toUpperCase());
		}
		else {
			System.out.println(watch2.brand.toUpperCase());
			
			
			
		}
		
		
		
		
	}

}

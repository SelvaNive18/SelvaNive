package condition;

public class GreetingTime {
	public static void main(String[] args) {
		int time=6;
		if(time>=6&&time<=11) {
			System.out.println("Good Morning");
		}
		else if(time>=12&&time<=17) {
			System.out.println("Good Afternoon");
		}
		else if(time>=18&&time<=20) {
			System.out.println("Good Evening");
		}
		else if(time>=21&&time<=24) {
			System.out.println("Good Night");
		}
	}

}

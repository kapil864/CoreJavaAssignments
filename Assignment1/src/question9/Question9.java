package question9;

public class Question9 {

	static float chargeAmount(int Charges) {

		if (Charges > 2500) {
			return (Charges / 100) * 1;
		} 
		else if (Charges <= 500) {
			return (Charges/100)*0.25f;
		}
		else
		{
			float amt =0f;			
			if(Charges >= 500) {
				amt += (500*0.25)/100;
				Charges -= 500;
			}
			
			if(Charges > 0) {
				amt += (Charges*0.5)/100;
				Charges -= 1000;
			}
			if(Charges > 0) {
				amt += (Charges*0.75)/100;
			}
			return amt;
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Charge amount : 2000");
		System.out.printf("Payback amount %.2f\n", (chargeAmount(2000)));
		System.out.println("Charge amount : 2600");
		System.out.printf("Payback amount %.2f", (chargeAmount(2600)));
	}

}
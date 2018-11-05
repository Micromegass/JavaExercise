
public class ggt {
	
	
	
	public static void main(String args[]) {
		
		int s1 = Integer.parseInt(args[0]);
		int s2 = Integer.parseInt(args[1]);

		int x = 0; 
		int rest = 0; 
		int ggt = 0; 
		
		
		if (s1 > s2) {
			
			while (s1%s2 != 0) {
				x = s1/s2;
				rest = s1% s2;
				s1 = s2; 
				s2 = rest; 	
				ggt = s2;
				
			}	
			

			
		} else {
			
			
			while (s2%s1 != 0) {
				x = s2/s1;
				rest = s2% s1;
				s2 = s1; 
				s1 = rest; 	
				ggt = s1;

			
			
		}
		

		
		
		}
		
				
		
		switch (ggt) {
		case 1: 
		case 2: 
		case 3: 
		case 4: 
			System.out.print("Greates common denominator is bewtween 1 and 4. It is: " + ggt);
			break; 
		default:
			System.out.print("Greates common denominator is not bewtween 1 and 4. It is: " + ggt);

		}
		
		
		
	}
		
		
}
	







public class Sort {
	
	
	
	public static void main(String[] args) {
		
	
		
	int save = 0; 
	int [] field = new int[args.length]; 
		
		for(int i = 0; i < args.length; i++) {
			
			field[i] = Integer.parseInt(args[i]);
			
		}
		
		
		
		for (int i = 0; i < field.length; i++) {  
			for (int j = i; j < field.length; j++) {
				
				if (field[i] < field[j]) {
					
					
					save = field[i]; 
					field[i] = field[j];
					field[j] = save; 
					
					
				}
				
				
			}
			
			
		}
		
		
		for(int elem : field) {
			
			System.out.println(elem);
		}
		
		
		
		//this is a comment
		
		int max = 0; 
		
		
		for (int k = 0; k < field.length; k++) {
			
			
			if (field[k] > max) {
				
				
				max = field[k]; 
				
				
			}
			
			
			
		}
		
		System.out.println("the maximum is: " + max);
		
		
	}
	
	
}
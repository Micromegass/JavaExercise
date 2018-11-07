
public class Fraction {
	
	
	private int numerator;
	private int denominator; 
	
	Fraction(int numerator, int denominator) throws IllegalArgumentException {
			
			if (denominator == 0) 
				
				throw new IllegalArgumentException(); 
				
				this.numerator = numerator; 
				this.denominator= denominator; 
				

	}
	
	
	
	Fraction multiplyBy(Fraction name) {
		
		int z1 = this.numerator * name.numerator; 
		int n1 = this.denominator * name.denominator;
		
		Fraction result = new Fraction(z1, n1);
		
		return result; 
		
		
	}

	
	
    public String toString() {		
		
		return this.numerator + "/" + this.denominator;
		
	}

	
	

	

}

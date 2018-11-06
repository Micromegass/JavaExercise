
public class gauss {
	
	
	public static void main(String[] args) {
		gauss summierer = new gauss();
		
		
		
		int startWert = Integer.parseInt(args[0]);
		System.out.println("Ergebnis mit for-Schleife: "
		+ summierer.forSumme(startWert));
		System.out.println("Ergebnis kleiner Gauss: "
		+ summierer.kleinerGauss(startWert));
		System.out.println("Ergebnis rekursiv: "
		+ summierer.rekursiveSumme(startWert));
		
		}
	
	
	int forSumme(int startWert) {
		
		 int ergebnis = 0; 
	    
		 for (int i = 0; i < startWert; i++) {
	    	 
	    	ergebnis = (ergebnis + (i+1));
	    	 
	     }
	     
		return ergebnis;

		
	}
	
	
	int rekursiveSumme(int startWert) { 
		
		if (startWert <= 0)
            return 0;
		
		int ergebnis; 
		ergebnis = startWert + rekursiveSumme(startWert - 1);; 
		return ergebnis;
		
	}
	
	
	int kleinerGauss(int startWert) {
		startWert = (startWert * (startWert + 1)) / 2; 
		return startWert;
	}
	
	
	
	
	
	
	

}	
	



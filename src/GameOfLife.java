public class GameOfLife {
    boolean[][] feld = { 
    		
    		{ false, false, false, false, false },
            { false, false, true, false, false },
            { false, false, true, false, false },
            { false, false, true, false, false },
            { false, false, false, false, false } 
            
    };
   
    
    public static void main(String[] args) {
        GameOfLife myGame = new GameOfLife();
        for (int i = 0; i < 10; i++) {
            myGame.nextGeneration();
            myGame.print();
            System.out.println();
        } 
        
    }

    
    

    void print() {
        for (int i = 0; i < feld.length; i++) {
        	for (int j = 0; j < feld[i].length; j++) {
        		if (feld[i][j] == true)
        			System.out.print("o ");
        		else
        			System.out.print(". ");
        		}
        		System.out.println();
    
    
        }
        
    } 


    void nextGeneration() {

    	boolean[][] nextG = new boolean[feld.length][];
    	
    	for (int i = 0; i < feld.length; i++) {
    		
    		for (int j = 0; j < feld[i].length; j++) {
    			
    			
    			if (feld[i][j] == true) {
    				
    				int count = 0; 
    				
    				for(int k = j; k < j + 8; k++) {
        				
    					if (feld[i][j] == true) {
    						
    						count = count++; 
    						
    						
    					}
        				
        			}
    				
    				
    			    for(int k = j; k < j -4; k++) {
        				
    					if (feld[i][j] == true) {
    						
    						count = count++; 
    						
    						
    					}
        				
        			}
        			
    				
    				
    				
    				if (count == 2 || count == 3) {
    					
    					nextG[i][j] = true; 
    					
    				} else {
    					
    					nextG[i][j] = false; 

    				}
    				
    				
    				
    				
    				
    			}
    			
    			else {
    				
    					int count2 = 0; 
    					
    					for(int k = j; k < j + 4; k++) {
        				
    					if (feld[i][j] == true) {
    						
    						count2 = count2++; 
    						
    						
    						}
    				
    					}
    					
    					
    					
    					for(int k = j; k < j - 4 ; k++) {
            				
        					if (feld[i][j]) {
        						
        						count2 = count2++; 
        						
        						
        						}
        				
        					}
    					
    					
    			
    			
    			
    					if (count2 == 3 ) {
    						
    						
        					nextG[i][j] = true; 

    						
    					} else {
    						
    						
	        					nextG[i][j] = false; 

    					}
    	
    		    		
    		    		
    		    	
    		    	
    		    }

    			
    		}
    		
    		
    	}
    
    
    } 
    

}







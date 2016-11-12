package desing;

import java.util.ArrayList;

public class Amort {

	private int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
	public static void main(String[] args) {
	  
		ArrayList <Amort> amortizaciones = new ArrayList<>();
	
		int catidad = 10;
		
		Amort a0 = new Amort();
		Amort ai = new Amort();
		Amort an = new Amort();
		
		a0.setValue(10);
		
		for (int j = 0; j < catidad; j++) {
		    
			if(j==0)
			{
		        amortizaciones.add(a0);	
		    }    
	    	if(j > 0)
	    	{
	    		amortizaciones.add(a0);	
	    	 	
	    	}
		    	
	    	  				
		        	
		}
		
		
		for (Amort amort : amortizaciones) {
			System.out.println(amort.getValue());
		} 
		    
				
		    
			
		      
		}
		
		}


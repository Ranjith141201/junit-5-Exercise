package io.javabrains;

public class Quadrant {
	
		 static int quadrant(int x, int y)
		    {
		        if (x > 0 && y > 0)
		        	return 1;
		        else if (x < 0 && y > 0)
		        	return 2;

		        else if (x < 0 && y < 0)
		   		 return 3;
		 
		        else if (x > 0 && y < 0)
		   		 return 4;
				return 0;
			
		    }
	}


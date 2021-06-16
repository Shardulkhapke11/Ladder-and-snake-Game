public class Laddersnake{
public static void main(String[] args){	
int Player = 0;
  while(Player<=99){
	System.out.println("Player is at " + Player);
	int Die=(int) (Math.random() * 10) % 6+1;
		System.out.println("Die value is " + Die);
	int Condition=(int) (Math.random() * 10) % 3+1;
	//System.out.println("case number is " + Condition);
	 switch(Condition) {
	   case 1:
	   System.out.println( "No Play You in same Player" );
	   break;
	  
	   case 2:
	   Player = (Player + Die);
	   if(Player>100){
		   Player = (Player - Die);
		   continue;
	   }
	   System.out.println( "After ladder Player is at :" + Player );
	   break;
	   
	   case 3: 
	   Player = (Player - Die);
	  
	  if(Player<0){
		  Player = 0;
	  }
		 System.out.println( "After snake Player is at" + Player );
	   break;
	   }
	    }
	     }
		  }
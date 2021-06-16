public class Laddersnake{
public static void main(String[] args){
	int count1 = 0;
	int count = 0;
int Player = 0;
int Player1 = 0;
  while((Player<=99)&&(Player1<=99)) {
	System.out.println("Player is " + Player);
	int Die=(int) (Math.random() * 10) % 6+1;
	int Die1=(int) (Math.random() * 10) % 6+1;
		count =(count + 1);
		count1 =(count1 + 1);
		System.out.println("Die value is " + Die);
		System.out.println("Die value is " + Die1);
	int type=(int) (Math.random() * 10) % 3+1;
	int type1=(int) (Math.random() * 10) % 3+1;
	//System.out.println("case number is " + type);
	 switch(type) {
	   case 1:
	   System.out.println( "No Play You are in the same Player" );
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
		 System.out.println( "After snake Player is at :" + Player );
	   break;
	   }
	   //2nd player
	  switch(type1) {
	   case 1:
	   System.out.println( "No Play You are in the same Player" );
	   break;
	  
	   case 2:
	   Player1 = (Player1 + Die1);
	   if(Player1>100){
		   Player1 = (Player1 - Die1);
		   continue;
	   }
	   System.out.println( "After ladder Player is at :" + Player1 );
	   break;
	   
	   case 3: 
	   Player1 = (Player1 - Die1);
	  
	  if(Player1<0){
		  Player1 = 0;
	  }
		 System.out.println( "After snake Player is at :" + Player1 );
	   break;
	   }
	  
	    }
		
		if(Player == 100){
		System.out.println( "Player 1 is the Winner!");
		System.out.println( "Die play number " + count );
		}
			else{
				System.out.println( "Player 2 is the Winner!" );
				System.out.println( "Die play number " + count1 );
		}
		System.out.println( "Die Total play number is " + (count1+count));
		}
	     }
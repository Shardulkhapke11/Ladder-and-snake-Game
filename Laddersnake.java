public class Laddersnake {
public static void main(String[] args){
	int Position=0;
System.out.println("Welcome to Snake & Ladder Program Problem");
System.out.println("Your at Starting Position"+Position);
Dice();
}
public static void Dice(){
	int Dice = (int)Math.floor(Math.random()*10)%6+1;
	System.out.println("Dice Value is "+Dice);
}
}
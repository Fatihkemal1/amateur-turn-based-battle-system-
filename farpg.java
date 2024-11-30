package genel;

import java.util.Random;
import java.util.Scanner;;

public class farpg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();

		int hp = 20;//hp of player
		int hpm= 20;//max hp of player
		int shp = 15;//hp of slime
		int satk= 5;//atk point of slime
		int atk= 10;//atk point of player
		int heal=10;// heal value of the ability that can be used by player
		System.out.println("enemy slime attack!");
		System.out.println("slime hp: " + shp + "\nplayer hp: " + hp);
		System.out.println("1)atk   2)heal magic(10 hp)   3)shield");
 while (hp>0||shp>0) {
	 int sec=sc.nextInt();
	 switch(sec) {
	 case 1:System.out.println("you attacked slime");
	 
	 shp=shp-atk;
	 if(shp<=0) {
		 
		 System.out.println("slime has died\nyou won!");
		 return;
	 }
	 System.out.println("slime attacked you");
	 hp=hp-satk;
	 if(hp<=0) {
	 
		 System.out.println("you died!");
		 return; 
	 }
	 System.out.println("slime hp: " + shp + "\nplayer hp: " + hp);
	 System.out.println("1)atk   2)heal magic(10 hp)   3)shield");
	 break;
	 case 2:
		 if(hpm<=hp) {
System.out.println("your hp is already max!");}
   else	 {
		if(hp<=10) { 
			hp=hp+heal;
			
		}
		else if(hp>10) {
			hp=hpm;
			
		}
			 
		 } 
		 System.out.println("slime attacked you");
		 hp=hp-satk;
		 if(hp<=0) {
			 System.out.println("you died!");
			 
			 return; }
		 else {	 System.out.println("slime hp: " + shp + "\nplayer hp: " + hp);
		 System.out.println("1)atk   2)heal magic(10 hp)   3)shield");
			 
		 }
		 
	 break;
	 default : System.out.println("chose one from your available choices!!");
	 System.out.println("1)atk   2)heal magic(10 hp)   3)shield");
	 break;
	 
	 case 3:
		 System.out.println("you used shield!");
		 System.out.println("slime attacked you");
		 hp=hp-((satk*40)/100);
		 if(hp<=0) {
			 System.out.println("you died!");
		 return;}
		 else {	 System.out.println("slime hp: " + shp + "\nplayer hp: " + hp);
		 System.out.println("1)atk   2)heal magic(10 hp)   3)shield");}
			
	 
	 }
	 
	 
 }
				
         
							
						
						
						
						
						
				
	}
}

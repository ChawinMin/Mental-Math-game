package pkg;
import java.util.Scanner;
import java.util.Random;


public class math {
	int random;
	int random2;
	int ans; 
	int digits;
	int save;
	
	public math(){
		save = 1; 
	}
	
	
	public void diff(int digits){
		if(digits > 1){
			for(int c =0; c < digits; c++){
				save = save * 10; 
			}
		}
		else if(digits == 1){
			save = 10;
		}
		else{
			System.out.println("A guy opens his door and gets shot, and you think that of me? No! I am the one who knocks!");
		}

	}
	public void Addition(){
		random = (int)(Math.random()*save);
		random2 = (int)(Math.random()*save);
		save =1;
		System.out.println("What is "+random+"+"+random2);
		ans = random + random2;
	}
	
	public void Subtraction(){
		random = (int)(Math.random()*save);
		random2 = (int)(Math.random()*save);
		save =1;
		System.out.println("What is "+random+"-"+random2);
		ans = random - random2;
	}
	
	public void Multiplication(){
		random = (int)(Math.random()*save);
		random2 = (int)(Math.random()*save);
		save =1;
		System.out.println("What is "+random+"*"+random2);
		ans = random * random2;
	}
	
	public void Division(){
		random = (int)(Math.random()*save);
		random2 = (int)(Math.random()*save);
		save =1;
		if(random > random2){
			System.out.println("What is "+random+"/"+random2+" to the nearest whole number");
			ans = random/random2;
		}
		else{
			System.out.println("What is "+random2+"/"+random+" to the nearest whole number");
			ans = random2/random;
		}
		 
	}
	
	public boolean correct(int guess){
		if(guess != ans){
			return true;
		}
		else{
			return false; 
		}
	}
	
	public boolean con(String choose){
		if(choose.contains("y") || choose.contains("Y")){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void count(int count){
		if(count >= 0 && count < 5){
			System.out.println("Keep on answering: ");
		}
		else if(count >=5 && count < 10){
				System.out.println("You can do it! ");
		}
		else if(count >= 10 && count < 20){
				System.out.println("Come on take your time");
		}
		else if(count >= 20 && count <= 30){
			System.out.println("Dude, What are you even doing");
		}
		else{
		System.out.println("Dude you need some serious help");
		}
		
	}

}

import pkg.*;
import java.util.Scanner;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane; 
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;


class starter {
/*public static void playMusic(String location) {
        try {
            File musicPath = new File(location);
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();

                System.out.println("Press Enter to stop playing");
                System.in.read(); 

                clip.stop();
                clip.close();
            } else {
                System.out.println("Can't find file");
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }*/
	public static void main(String args[]) {
		//music 
	/*	String filepath = "Interstellar Official Soundtrack ｜ Cornfield Chase – Hans Zimmer ｜ WaterTower.wav";
        playMusic(filepath);
		*/
	
		
		//main stuff
		Scanner sc = new Scanner(System.in);
		int guess = 0;
		int count = 0;
		math a = new math();
		Timer timer = new Timer();
	
		while(true){
		System.out.println("---------------------------------------------");
			System.out.println("Do you want to do A(addition), S(substraction), M(multiplication), or D(division) ");
			String choice = sc.nextLine();
			System.out.println("How many digits do you want?");
			int digits = sc.nextInt();
			a.diff(digits);
			if(digits <= 0){
				break;
			}
			if(digits > 0){
			if(choice.equals("a") || choice.equals("a") || choice.contains("add") || choice.contains("Add")){
				count = 0;
				a.Addition();
				guess = sc.nextInt();
				while(a.correct(guess)){
					if(a.correct(guess)){
						a.count(count);
					}
					else{
						break;
					}
					guess = sc.nextInt();
					count ++;
				
				}
				System.out.println("Good job, you got the right answer!");
			}
			else if(choice.equals("S") || choice.equals("s") || choice.contains("sub") || choice.contains("Sub")){
				count = 0;
				a.Subtraction();
				guess = sc.nextInt();
				while(a.correct(guess)){
					if(a.correct(guess)){
						a.count(count);
					}
					else{
						break;
					}
					guess = sc.nextInt();
					count ++;
				
				}
				System.out.println("Good job, you got the right answer!");
			}
			else if(choice.equals("M") || choice.equals("m") || choice.contains("mul") || choice.contains("Mul")){
				count = 0;
				a.Multiplication();
				guess = sc.nextInt();
				while(a.correct(guess)){
					if(a.correct(guess)){
						a.count(count);
					}
					
					guess = sc.nextInt();
					count ++;
				
				}
				System.out.println("Good job, you got the right answer!");
			}
			else if(choice.equals("D") || choice.equals("d") || choice.contains("div") || choice.contains("Div")){
				count = 0;
				a.Division();
				guess = sc.nextInt();
				while(a.correct(guess)){
					if(a.correct(guess)){
						a.count(count);
					}
					else{
						break;
					}
					guess = sc.nextInt();
					count ++;
				
				}
				System.out.println("Good job, you got the right answer!");
				System.out.println("---------------------------------------------");
			}
			System.out.println("Do you still want to continue?(Y/N)");
			sc.nextLine();
			String choose = sc.nextLine();
			if(!(a.con(choose))){
				break;
			}
			
		}
		
	}
	}
}

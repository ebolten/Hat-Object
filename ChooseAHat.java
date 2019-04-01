import java.util.Scanner;

public class ChooseAHat {
	
	public static Scanner input = new Scanner(System.in);
	static String [] colors = newHat.colors;
	static String color;
	static double size;
	
	public static void main(String[] args) {
		
		char decision;
		
		System.out.println("Would you like to specify a color and size? (Y or N): ");
		decision = input.next().charAt(0);
		newHat userHat;
		
		if(decision == 'Y') {
			newHat.getSizeAndColor();
			color = newHat.getColor();
			size = newHat.size;
			userHat = new newHat(size,color);
		}
		else if (decision == 'N') {
			userHat = new newHat();
			color = newHat.getColor();
			size = newHat.size;
			System.out.println("Ok you will get the default hat.");
		}
		System.out.println("Your hat is size " + size + " and color " + color);	
	}
}

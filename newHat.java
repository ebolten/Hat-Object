import java.lang.String;
import java.util.Scanner;

public class newHat {
	
	private static Scanner input = new Scanner(System.in);
	private final int manyColors = 10; //variable to store size of colors array
	public static double size; //variable to store size
	private static String color; //variable to store color
	//colors to choose from
	public static String [] colors = {"blue","pink","red","yellow","white",
			"purple","black","green and purple striped","baby blue and pink","grey"};
	
	//function to prompt user to enter a color and size
	public static void getSizeAndColor() {
		int decisionColor; //to store users color choice
		
		System.out.println("Enter a size: "); //prompt user for size
		size = input.nextDouble();
		
		for (int i = 0; i < colors.length; i++) { //output color choices
			System.out.println((i+1) + ". " + colors[i]);
		}
		//prompt user for color
		System.out.println("Enter the color you want: ");
		decisionColor = input.nextInt();
		color = colors[decisionColor - 1];
	}
	//get() method for color
	public static String getColor() {
		return color;
	}
	//get() method for size
	public static double getSize() {
		return size;
	}
	//default constructor if size and color are not specified
	newHat() {
		size = 5;
		color = colors[6];
	}
	//constructor if size and color are specified
	newHat(double newSize,String newColor) {
		size = newSize;
		color = newColor;
	}	
}

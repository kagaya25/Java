import java.util.Scanner;

public class JavaKadai042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double weight;
        double height;
        double bmi;
        Scanner console; //  create a variable to represent the console
        console = new Scanner (System.in); //  create the object with new
        System.out.print("How much do you weigh (in kg)? "); // user prompt to provide weight
        weight = console.nextDouble(); // read from console
        System.out.print("How tall are you (in cm)? "); // user prompt to provide height
        height = console.nextDouble(); // read value from console
        bmi =  weight / (height/100*height/100); // calculates BMI
        System.out.println("Your BMI is " + bmi); // displays user's BMI
        

        
	}

}

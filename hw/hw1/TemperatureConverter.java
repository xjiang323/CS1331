//I worked on the homework assignment alone, using only course materials.
import java.util.Scanner;

public class TemperatureConverter{
    public static void main (String[] args){
        double Kelvin;
        double Fahrenheit;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a temperature in Kelvin: ");
        Kelvin = scan.nextDouble();

        Fahrenheit = Kelvin * 9.0 / 5.0 - 459.67;

        if((long)Kelvin * 1.0 == Kelvin) {
            System.out.printf("%d Kelvin is %.2f degrees Fahrenheit%n", (long)Kelvin, Fahrenheit);
        } else {
            System.out.printf("%s Kelvin is %.2f degrees Fahrenheit%n", Kelvin, Fahrenheit);
        }
    }
}

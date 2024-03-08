import java.util.Scanner;
 
// Base class for temperature
class Temperature {
    protected double value;
 
    public Temperature(double value) {
        this.value = value;
    }
 
    public void display() {
        System.out.println("Temperature: " + value + " degrees");
    }
}
 
// Derived class for Celsius temperature
class Celsius extends Temperature {
    public Celsius(double value) {
        super(value);
    }
 
    // Convert Celsius to Fahrenheit
    public double toFahrenheit() {
        return (value * 9 / 5) + 32;
    }
 
    // Convert Celsius to Kelvin
    public double toKelvin() {
        return value + 273.15;
    }
 
    // Convert Celsius to Rankine
    public double toRankine() {
        return (value + 273.15) * 9 / 5;
    }
 
    // Display temperature in Celsius
    @Override
    public void display() {
        System.out.println("Celsius Temperature: " + value + " degrees");
    }
}
 
// Derived class for Fahrenheit temperature
class Fahrenheit extends Temperature {
    public Fahrenheit(double value) {
        super(value);
    }
 
    // Convert Fahrenheit to Celsius
    public double toCelsius() {
        return (value - 32) * 5 / 9;
    }
 
    // Convert Fahrenheit to Kelvin
    public double toKelvin() {
        return (value - 32) + 273.15;
    }
 
    // Convert Fahrenheit to Rankine
    public double toRankine() {
        return value + 459.67;
    }
 
    // Display temperature in Fahrenheit
    @Override
    public void display() {
        System.out.println("Fahrenheit Temperature: " + value + " degrees");
    }
}
 
// Derived class for Rankine temperature
class Rankine extends Temperature {
    public Rankine(double value) {
        super(value);
    }
 
    // Convert Rankine to Celsius
    public double toCelsius() {
        return (value - 491.67) * 5 / 9;
    }
 
    // Convert Rankine to Fahrenheit
    public double toFahrenheit() {
        return value - 459.67;
    }
 
    // Convert Rankine to Kelvin
    public double toKelvin() {
        return value * 5 / 9;
    }
 
    // Display temperature in Rankine
    @Override
    public void display() {
        System.out.println("Rankine Temperature: " + value + "°");
    }
}
 
class Kelvin extends Temperature {
    public Kelvin(double value) {
        super(value);
    }
 
    // Convert Kelvin to Celsius
    public double toCelsius() {
        return value - 273.15;
    }
 
    // Convert Kelvin to Fahrenheit
    public double toFahrenheit() {
        return value - 459.67;
    }
 
    // Convert Kelvin to Rankine
    public double toRankine() {
        return value * 1.8;
    }
 
    // Display temperature in Kelvin
    @Override
    public void display() {
        System.out.println("Kelvin Temperature: " + value + "°");
    }
}
 
//  Main program
public class Main {
    public static void main(String[] args) {
        // Example of using the Temperature, Celsius, Fahrenheit, and Rankine classes
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a temperature in Celsius: ");

        // Create Celsius object
        Celsius celsiusTemperature = new Celsius(scan.nextDouble());
        celsiusTemperature.display();
 
        // Convert Celsius to Fahrenheit, Kelvin, and Rankine and display
        System.out.println("Celsius to Fahrenheit: " + celsiusTemperature.toFahrenheit() + "°F");
        System.out.println("Celsius to Kelvin: " + celsiusTemperature.toKelvin() + "°K");
        System.out.println("Celsius to Rankine: " + celsiusTemperature.toRankine() + "°R");
 
        System.out.println("Enter a temperature in Farenheit: ");

        // Create Fahrenheit object
        Fahrenheit fahrenheitTemperature = new Fahrenheit(scan.nextDouble());
        fahrenheitTemperature.display();
 
        // Convert Fahrenheit to Celsius and display
        System.out.println("Fahrenheit to Celsius: " + fahrenheitTemperature.toCelsius() + "°C");
        System.out.println("Fahrenheit to Kelvin: " + fahrenheitTemperature.toKelvin() + "°K");
        System.out.println("Fahrenheit to Rankine: " + fahrenheitTemperature.toRankine() + "°R");
 
        System.out.println("Enter a temperature in Rankine: ");

        // Create Rankine object
        Rankine rankineTemperature = new Rankine(scan.nextDouble());
        rankineTemperature.display();
 
        // Convert Rankine to Celsius, Fahrenheit, and Kelvin and display
        System.out.println("Rankine to Celsius: " + rankineTemperature.toCelsius() + "°C");
        System.out.println("Rankine to Fahrenheit: " + rankineTemperature.toFahrenheit() + "°F");
        System.out.println("Rankine to Kelvin: " + rankineTemperature.toKelvin() + "°K");
 
        System.out.println("Enter a temperature in Kelvin: ");

        // Create Kelvin object
        Kelvin kelvinTemperature = new Kelvin(scan.nextDouble());
        kelvinTemperature.display();
 
        // Convert Rankine to Celsius, Fahrenheit, and Kelvin and display
        System.out.println("Rankine to Celsius: " + kelvinTemperature.toCelsius() + "°C");
        System.out.println("Rankine to Fahrenheit: " + kelvinTemperature.toFahrenheit() + "°F");
        System.out.println("Rankine to Kelvin: " + kelvinTemperature.toRankine() + "°K");
    }
}
import java.util.Scanner;
public class THphuongThucChuyenDoiNhietDo {
    public static double CelsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0/5)*celsius+32;
        return fahrenheit;
    }
    public static double FahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0/9)*(fahrenheit-32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        double fahrenheit;
//        double celsius;
        int choice;
        do {
            System.out.println("Menu ConvertTemperature");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
             choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit");
                    double fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: "+FahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celcius: ");
                    double celcius = input.nextDouble();
                    System.out.println("Celcius to Fahrenheit"+CelsiusToFahrenheit(celcius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);
    }
}

import java.util.Scanner;

public class Converter {public static void main(String[] args) {
    Converter.conversionMiles();
    Converter.conversionKm();
}
    public static void conversionMiles(){
        System.out.println("Введіть число в милях, для конвертації в км:");
        Scanner scanner = new Scanner(System.in);
        double convertNumber = scanner.nextDouble();
        double convertedNumber = convertNumber*1.6;
        System.out.printf("%s миль, приблизно: %s км.\n", convertNumber, convertedNumber);
    }
    public static void conversionKm(){
        System.out.println("Введіть число в км, для конвертації в милі:");
        Scanner scanner = new Scanner(System.in);
        double convertNumber = scanner.nextDouble();
        double convertedNumber = convertNumber*0.62;
        System.out.printf("%s км в милях, приблизно: %s миль.\n", convertNumber, convertedNumber);
    }
}

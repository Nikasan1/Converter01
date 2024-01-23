import java.util.Scanner;

public class Converter {public static void main(String[] args) {
    Converter.conversion();
}
    public static void conversion(){
        System.out.println("Введіть число в милях, для конвертації в км:");
        Scanner scanner = new Scanner(System.in);
        double convertNumber = scanner.nextDouble();
        double convertedNumber = convertNumber*1.6;
        System.out.printf("%s миль, приблизно: %s км.\n", convertNumber, convertedNumber);
    }
}

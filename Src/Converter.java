import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Converter.conversion();
    }
    public static void conversion(){
        System.out.println("Введіть число в км, для конвертації в милі:");
        Scanner scanner = new Scanner(System.in);
        double convertNumber = scanner.nextDouble();
        double convertedNumber = convertNumber*0.62;
        System.out.printf("%s км в милях, приблизно: %s миль.\n", convertNumber, convertedNumber);
    }
}

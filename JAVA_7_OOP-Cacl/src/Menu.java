import java.util.Scanner;
public class Menu {
    private final Scanner scanner;
    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }
    public String selectFunction() {
        System.out.print("""
                \n               
                Выберите действие:
                1. сложение двух чисел
                2. вычитание двух чисел
                3. деление двух чисел
                4. умножение двух чисел
                0. Выход
                """);
        return scanner.nextLine();
    }
}
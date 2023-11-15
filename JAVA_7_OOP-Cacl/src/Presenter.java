import java.util.Scanner;
public class Presenter {
    SumController sumController;
    SubController subController;
    DivController divController;
    MultController multController;
    Menu menu;
    Scanner scanner;
    public Presenter(SumController sumController, SubController subController, DivController divController,
                     MultController multController, Scanner scanner, Menu menu) {
        this.sumController = sumController;
        this.subController = subController;
        this.divController = divController;
        this.multController = multController;
        this.scanner = scanner;
        this.menu = menu;
    }

    public void start() {

        while (true) {
            switch (menu.selectFunction()) {
                case "1" ->
                        sumController.doIt();
                case "2" ->
                        subController.doIt();
                case "3" ->
                        divController.doIt();
                case "4" ->
                        multController.doIt();
                case "0" ->
                        System.exit(0);
                default -> System.out.println("\nНеправильный ввод, повторите ввод");
            }
        }
    }
}
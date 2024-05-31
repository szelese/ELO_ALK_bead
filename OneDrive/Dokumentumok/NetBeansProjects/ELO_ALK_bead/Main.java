import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Ember ember = new Ember("János", LocalDate.of(1980, 1, 1), Nem.FERFI);
        EmberModel model = new EmberModel(ember);
        EmberConsoleView consoleView = new EmberConsoleView();
        EmberGUIView guiView = new EmberGUIView();

        EmberController controller = new EmberController(model, consoleView, guiView);
        controller.updateConsoleView();
    }
}

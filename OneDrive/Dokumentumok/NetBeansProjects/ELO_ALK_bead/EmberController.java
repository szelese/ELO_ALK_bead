import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class EmberController {
    private EmberModel model;
    private EmberConsoleView consoleView;
    private EmberGUIView guiView;

    public EmberController(EmberModel model, EmberConsoleView consoleView, EmberGUIView guiView) {
        this.model = model;
        this.consoleView = consoleView;
        this.guiView = guiView;

        this.guiView.addBemutatkozasListener(new BemutatkozasListener());
    }

    public void updateConsoleView() {
        consoleView.printEmberDetails(model.getEmber().getNev(), model.getEmber().getKor(), model.getEmber().getNem());
    }

    public void updateGUIView() {
        String nev = guiView.getNev();
        LocalDate szuletesiDatum = guiView.getSzuletesiDatum();
        Nem nem = guiView.getNem();
        model.setEmber(new Ember(nev, szuletesiDatum, nem));
        guiView.setBemutatkozasResult(model.getEmber().bemutatkozas());
    }

    class BemutatkozasListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            updateGUIView();
        }
    }
}

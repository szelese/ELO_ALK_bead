import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class EmberGUIView {
    private JFrame frame;
    private JTextField nevField;
    private JTextField szuletesiDatumField;
    private JComboBox<Nem> nemComboBox;
    private JButton bemutatkozasButton;
    private JLabel bemutatkozasLabel;

    public EmberGUIView() {
        frame = new JFrame("Ember GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        nevField = new JTextField(20);
        szuletesiDatumField = new JTextField(10);
        nemComboBox = new JComboBox<>(Nem.values());
        bemutatkozasButton = new JButton("Bemutatkozás");
        bemutatkozasLabel = new JLabel("Bemutatkozás eredménye itt lesz");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Név:"));
        panel.add(nevField);
        panel.add(new JLabel("Születési dátum (YYYY-MM-DD):"));
        panel.add(szuletesiDatumField);
        panel.add(new JLabel("Nem:"));
        panel.add(nemComboBox);
        panel.add(bemutatkozasButton);
        panel.add(bemutatkozasLabel);

        frame.add(panel);
        frame.setVisible(true);
    }

    public String getNev() {
        return nevField.getText();
    }

    public LocalDate getSzuletesiDatum() {
        return LocalDate.parse(szuletesiDatumField.getText());
    }

    public Nem getNem() {
        return (Nem) nemComboBox.getSelectedItem();
    }

    public void setBemutatkozasResult(String result) {
        bemutatkozasLabel.setText(result);
    }

    public void addBemutatkozasListener(ActionListener listener) {
        bemutatkozasButton.addActionListener(listener);
    }
}

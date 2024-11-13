import javax.swing.*;

public class APPdeNotaseMedia {
    private JPanel panelMain;
    private JTextField txtNotas;
    private JButton btAdd;
    private JTextArea txtListaNota;
    private JButton calcularAMédiaButton;

    public static void main(String[] args) {

    JFrame frame = new JFrame("Aplicativo de Notas");
    frame.setContentPane(new APPdeNotaseMedia().panelMain);
    frame.setSize(400,400);
    frame.setVisible(true);


    }
}

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String h= JOptionPane.showInputDialog("What is your height? [in inches]");
	int h2= Integer.parseInt(h);
	if (h2>=48) {
		JOptionPane.showMessageDialog(null, "You can ride the rollercoaster");
	}
	if (h2<48) {
		JOptionPane.showMessageDialog(null, "You can't ride the rollercoaster");
	}
}
}

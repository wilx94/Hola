import javax.swing.JOptionPane;
public class Gui {

	public static void main(String[] args) {
		
		String fn = JOptionPane.showInputDialog("Enter you fn:");
		String sn = JOptionPane.showInputDialog("enter sn:");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1+num2;
int hola;
//System.
//kajsdhfkjsadhfkhasdklfjhsadkjlfhsalkdjfhs
		
		JOptionPane.showMessageDialog(null, "This are te result"+sum, "Sum", JOptionPane.PLAIN_MESSAGE);

	}

}


	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.*;

	public class hw6 implements ActionListener {
		JTextField j1, j2, j3;
		JLabel l1, l2, l3;
		JLabel l4, l5, l6;
		JButton b1;

		hw6() {
			JFrame f = new JFrame("Tip Calculator");
			l1 = new JLabel("How much would you like to tip? ");
			l1.setBounds(95,115,200,50);
			l4 = new JLabel("Price of meal: ");
			l4.setBounds(40, 50, 200, 30);

			j1 = new JTextField("");
			j1.setBounds(150, 50, 200, 30);
			l5 = new JLabel("Enter Percentage: ");
			l5.setBounds(40, 200, 200, 30);
			j2 = new JTextField("");
			j2.setBounds(150, 200, 200, 30);
			l6 = new JLabel("The total is: ");
			l6.setBounds(80, 300, 200, 30);
			j3 = new JTextField("");
			j3.setEditable(false);
			j3.setBounds(150, 300, 200, 30);
			b1 = new JButton("Calculate");
			b1.addActionListener(this);
			b1.setBounds(190, 250, 100, 40);
			f.add(l1);
			f.add(l4);
			f.add(l5);
			f.add(l6);
			f.add(j1);
			f.add(j2);
			f.add(j3);
			f.add(b1);
			f.setSize(400, 400);
			f.setLayout(null);
			f.setVisible(true);
		}

		public static void main(String[] args) {
			new hw6();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s1 = j1.getText();
			String s2 = j2.getText();
			double amount = Double.parseDouble(s1);
			double tip = Double.parseDouble(s2);
			double total = amount + (amount * (tip * 0.01));
			if (e.getSource() == b1) {
				j3.setText(String.valueOf(total));
			}

		}
	}


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculadoraInvestimentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentos frame = new CalculadoraInvestimentos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraInvestimentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Depósito Mensal R$:");
		lblNewLabel.setBounds(66, 11, 98, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(28, 32, 177, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Num. de meses: ");
		lblNewLabel_1.setBounds(77, 65, 80, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(28, 82, 177, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Juros ao mês %:");
		lblNewLabel_2.setBounds(77, 113, 87, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(28, 131, 177, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("Total investido + juros R$:");
		lblNewLabel_3.setBounds(52, 162, 139, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("calcular");
		btnNewButton.setBounds(75, 177, 89, 23);
		contentPane.add(btnNewButton);
	}
}

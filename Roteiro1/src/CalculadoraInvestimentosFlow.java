import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Investimento;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Panel;
import java.awt.Font;

public class CalculadoraInvestimentosFlow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDM;
	private JTextField textJM;
	private JLabel lblNewLabel_4;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTextField textNM;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton_1;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private Panel panel_4;
	private Panel panel_5;
	private Panel panel_6;
	private Panel panel_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentosFlow frame = new CalculadoraInvestimentosFlow();
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
	public CalculadoraInvestimentosFlow() {
		setTitle("CalcInvest");
		setBackground(new Color(0, 0, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 208);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("AJUDA");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("sobre ");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre janelaS = new Sobre(); 
				janelaS.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 243, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("depósito Mensal R$:");
		panel.add(lblNewLabel_1);
		
		panel_4 = new Panel();
		contentPane.add(panel_4);
		
		textDM = new JTextField();
		textDM.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 13));
		panel_4.add(textDM);
		textDM.setColumns(10);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Num. de meses:");
		panel_1.add(lblNewLabel);
		
		panel_5 = new Panel();
		contentPane.add(panel_5);
		
		textNM = new JTextField();
		textNM.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 13));
		panel_5.add(textNM);
		textNM.setColumns(10);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("Juros ao mês %:");
		panel_2.add(lblNewLabel_2);
		
		panel_6 = new Panel();
		contentPane.add(panel_6);
		
		textJM = new JTextField();
		textJM.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 13));
		panel_6.add(textJM);
		textJM.setColumns(10);
		
		panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel_4 = new JLabel("Total Investido + juros R$:");
		panel_3.add(lblNewLabel_4);
		
		lblNewLabel_3 = new JLabel("");
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("");
		contentPane.add(lblNewLabel_5);
		
		panel_7 = new Panel();
		contentPane.add(panel_7);
		
		btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_7.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				double deposito = Double.valueOf(textDM.getText()); 
				int meses = Integer.valueOf(textNM.getText()); 
				double juros = Double.valueOf(textJM.getText()); 
				Investimento i = new Investimento (meses, juros, deposito); 
				Double total = i.calculaTotal(); 
				lblNewLabel_5.setText(String.format("%.2f", total)); 
					
			}
		});

	}

}

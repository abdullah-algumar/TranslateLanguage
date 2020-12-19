package sozluk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class sozluk1 {

	private JFrame frame;
	private JTextField txtTurkce;
	private JTextField txtIngilizce;
	private String arrTurkce;
	private String arrIngilizce;

	/**
	
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sozluk1 window = new sozluk1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sozluk1() {
		initialize();
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00FCrk\u00E7e :");
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNewLabel.setBounds(48, 45, 64, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0130ngilizce :");
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNewLabel_1.setBounds(48, 91, 89, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtTurkce = 		new JTextField();
		txtTurkce.setBounds(147, 46, 127, 22);
		frame.getContentPane().add(txtTurkce);
		txtTurkce.setColumns(10);
		
		
		txtIngilizce = new JTextField();
		txtIngilizce.setBounds(147, 91, 127, 22);
		frame.getContentPane().add(txtIngilizce);
		txtIngilizce.setColumns(10);
	
		
		
		String[] arrTurkce = {"araba","top","dünya","bilgisayer"};
		String[] arrIngilizce = {"car","ball","world","computer"};
		
		JButton btnNewButton = new JButton("\u00C7evir");
		btnNewButton.addMouseListener(new MouseAdapter() {
		   
			public void mouseClicked(MouseEvent arg0) {
				String kelime = txtTurkce.getText().toLowerCase();
				for (int i = 0 ; i < arrTurkce.length ; i++ ) {
					if(arrTurkce[i].equalsIgnoreCase(kelime)) {
						txtIngilizce.setText(arrIngilizce[i]);
					}
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		btnNewButton.setBounds(80, 139, 97, 31);
		frame.getContentPane().add(btnNewButton);
		
		
	}

}

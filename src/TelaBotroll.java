import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaBotroll extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnBotroll;
	private String[] vet = { "Vacilão!", "Não foi dessa vez!", "Trouxa!",
			"Não consegue!", "Seu bosta!" };
	private Random aleatorio = new Random();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBotroll frame = new TelaBotroll();
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
	public TelaBotroll() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// fu
		
		btnBotroll = new JButton("Botroll");
		btnBotroll.setFocusable(false);
		// btnBotroll.addKeyListener(new KeyAdapter() {
		// @Override
		// public void keyPressed(KeyEvent e) {
		// if (e.getKeyCode() == 32) {
		// btnBotroll.setFocusable(false);
		// }
		// }
		// });
		btnBotroll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBotroll.setText(mudarTexto());
				btnBotroll.setLocation(50 + aleatorio.nextInt(250),
						50 + aleatorio.nextInt(200));
				// System.out.println(mudarTexto());
			}
		});

		btnBotroll.setBounds(112, 48, 255, 23);
		contentPane.add(btnBotroll);

		// btnBotroll.setLocation((int) Math.random()*500, (int)
		// Math.random()*400);
	}

	public String mudarTexto() {
		int num = aleatorio.nextInt(5);
		return vet[num];
	}
}
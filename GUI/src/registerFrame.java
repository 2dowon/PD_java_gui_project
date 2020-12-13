import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;

public class registerFrame {

	private JFrame frame;
	private JTextField id;
	private JPasswordField password;
	private JTextField name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registerFrame window = new registerFrame();
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
	public registerFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		// 패널에 이미지 설정
		//ImagePanel bgPanel = new ImagePanel(new ImageIcon("C:\\0_dowon\\Playdata\\Project\\Java_GUI\\GUI\\image\\bg_registerFrame.jpg").getImage());
		ImagePanel bgPanel = new ImagePanel(new ImageIcon("./image/bg_registerFrame.jpg").getImage());
		// 이미지 크기를 가져와서 이미지 크기만큼 패널을 만들도록 설정
		frame.setSize(bgPanel.getWidth(), bgPanel.getHeight());
		frame.getContentPane().add(bgPanel);
		bgPanel.setLayout(null);
		
		id = new JTextField();
		id.setBounds(519, 387, 313, 45);
		bgPanel.add(id);
		id.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(519, 495, 313, 45);
		bgPanel.add(password);
		
		JButton btn_register = new JButton("New button");
		btn_register.setBackground(Color.LIGHT_GRAY);
		btn_register.setForeground(Color.WHITE);
		//btn_register.setIcon(new ImageIcon("C:\\0_dowon\\Playdata\\Project\\Java_GUI\\GUI\\image\\register1.jpg"));
		//btn_register.setRolloverIcon(new ImageIcon("C:\\0_dowon\\Playdata\\Project\\Java_GUI\\GUI\\image\\register2.jpg"));
		btn_register.setIcon(new ImageIcon("./image/register1.jpg"));
		btn_register.setRolloverIcon(new ImageIcon("./image/register2.jpg"));
		btn_register.setBounds(519, 586, 313, 57);
		bgPanel.add(btn_register);
		
		name = new JTextField();
		name.setBounds(519, 279, 313, 45);
		bgPanel.add(name);
		name.setColumns(10);
		
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
	}
	
	public void dispose() {
		frame.dispose();
	}
}

	class ImagePanel extends JPanel{
		private Image img;
		
		public ImagePanel(Image img){
			this.img = img;
			setSize(new Dimension(img.getWidth(null),img.getHeight(null))); // 사이즈 최대
			setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null))); // 이미지 크기로 사이즈 설정
			setLayout(null);
		}
		
		// 이미지 크기를 가져오도록
		public int getWidth() {
			return img.getWidth(null);
		}
		
		public int getHeight() {
			return img.getHeight(null);
		}
		
		// 이미지를 업로드하는 함수
		public void paintComponent(Graphics g){
			g.drawImage(img, 0, 0, null);
		}
		
	}
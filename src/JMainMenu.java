import java.awt.*;
import javax.swing.*;


public class JMainMenu extends JFrame {
	//row 1 and 2
	JPanel keyPanel = new JPanel();
	JLabel GK = new JLabel("Global Key");
	JLabel AK = new JLabel("Authentication Key");
	JLabel MK = new JLabel("Master Key");
	JTextField gkTxt = new JTextField();
	JTextField akTxt = new JTextField();
	JTextField mkTxt = new JTextField();
	//row 3 and 4
	JPanel titlePanel = new JPanel();
	JLabel jlSysTDC = new JLabel("System Title DC");	
	JLabel jlSysTMeter = new JLabel("System Title Meter");
	JLabel jlabFC = new JLabel("Frame Counter");
	JTextField jtSysTDC = new JTextField();	
	JTextField jtSysTMeter = new JTextField();	
	JTextField jtFC = new JTextField();
	//row 5 security control
	JPanel jpSecuCtrl = new JPanel();
	JLabel jlSecuCtrl = new JLabel("Security Control");
	JRadioButton jrSecuAuth = new JRadioButton("Auth", true);
	JRadioButton jrSecuEnypt = new JRadioButton("Encypt", true);
	JRadioButton jrSecuAuthEnypt = new JRadioButton("Auth&Encypt", true);
	ButtonGroup bgSecuCtrl = new ButtonGroup();
	//row 6, 7
	JPanel jpInOut = new JPanel();
	JLabel jlInput = new JLabel("Input Hex String");
	JTextField jtfInput = new JTextField();
	//row 8, 9
	JLabel jlOutput = new JLabel("Output Hex String");
	JTextField jtfOutput = new JTextField();
	//row 10
	JPanel jpCommit = new JPanel();
	JButton jbCommit = new JButton("Commit");
	
	public JMainMenu() throws HeadlessException {		
		setTitle("DLMS/COSEM Assist");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		GridLayout gridLayout = new GridLayout(5, 1, 10, 10);
		setLayout(gridLayout);
		
		GridLayout keyGridLayout = new GridLayout(2, 3);
		keyPanel.setLayout(keyGridLayout);
		keyPanel.add(GK);
		keyPanel.add(AK);
		keyPanel.add(MK);
		keyPanel.add(gkTxt);
		keyPanel.add(akTxt);
		keyPanel.add(mkTxt);
		add(keyPanel);
		
		GridLayout titleGridLayout = new GridLayout(2, 3);
		titlePanel.setLayout(titleGridLayout);
		titlePanel.add(jlSysTDC);
		titlePanel.add(jlSysTMeter);
		titlePanel.add(jlabFC);
		titlePanel.add(jtSysTDC);
		titlePanel.add(jtSysTMeter);
		titlePanel.add(jtFC);
		add(titlePanel);

		
		GridLayout secuCtrl = new GridLayout(1, 4);
		jpSecuCtrl.setLayout(secuCtrl);
		jpSecuCtrl.add(jlSecuCtrl);
		jpSecuCtrl.add(jrSecuAuth);
		jpSecuCtrl.add(jrSecuEnypt);
		jpSecuCtrl.add(jrSecuAuthEnypt);
		// related button radio
		bgSecuCtrl.add(jrSecuAuth);
		bgSecuCtrl.add(jrSecuEnypt);
		bgSecuCtrl.add(jrSecuAuthEnypt);
		add(jpSecuCtrl);
		
		GridLayout glInput = new GridLayout(4, 1);
		jpInOut.setLayout(glInput);
		jpInOut.add(jlInput);
		jpInOut.add(jtfInput);
		jpInOut.add(jlOutput);
		jpInOut.add(jtfOutput);
		add(jpInOut);
		
		GridLayout glCommit = new GridLayout(1, 1);
		jpCommit.setLayout(glCommit);
		jpCommit.add(jbCommit);
		add(jpCommit);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		JMainMenu mainMeun = new JMainMenu();	
	}
	
}

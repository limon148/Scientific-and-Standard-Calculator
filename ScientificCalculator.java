package Scientific_Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Font;

public class ScientificCalculator {

	private JFrame frmCalculator;
	private JTextField txtDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator window = new ScientificCalculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScientificCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Scientific Calculator");
		frmCalculator.setBounds(100, 100, 269, 386);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmCalculator.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmCalculator.setTitle("Standard Calculator");
				frmCalculator.setBounds(100, 100, 275, 386);
				txtDisplay.setBounds(10, 11, 243, 37);
				txtDisplay.setText(null);
				
			}
		});
		mnFile.add(mntmStandard);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmCalculator.setTitle("Scientific Calculator");
				frmCalculator.setBounds(100, 100, 525, 386);
				txtDisplay.setBounds(10, 11, 494, 37);
				txtDisplay.setText(null);
				
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		mnFile.add(mntmExit);
		frmCalculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 243, 37);
		frmCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton backspace = new JButton("\uF0E7");
		backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String backspace = null;
				if (txtDisplay.getText().length() > 0){
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
				
			}
		});
		backspace.setFont(new Font("Wingdings", Font.BOLD, 9));
		backspace.setBounds(10, 65, 45, 45);
		frmCalculator.getContentPane().add(backspace);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText(null);
				
			}
		});
		btnCe.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnCe.setBounds(60, 65, 45, 45);
		frmCalculator.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("n!");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText())), res = 1;
				if(ops < 70){
					for(int i = 1; i <= ops; i++){
					res = res * i;
					}
					txtDisplay.setText(String.valueOf(res));
				}
				else{
					txtDisplay.setText("Math Error");
				}
				
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnC.setBounds(108, 65, 45, 45);
		frmCalculator.getContentPane().add(btnC);
		
		JButton button_2 = new JButton("\u00B1");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBounds(156, 65, 45, 45);
		frmCalculator.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("\u221A");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sqrt(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_3.setBounds(208, 65, 45, 45);
		frmCalculator.getContentPane().add(button_3);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String iNum = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(iNum);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn7.setBounds(10, 115, 45, 45);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(iNum);
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn8.setBounds(60, 115, 45, 45);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(iNum);
				
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn9.setBounds(108, 115, 45, 45);
		frmCalculator.getContentPane().add(btn9);
		
		JButton button_7 = new JButton("/");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
				
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_7.setBounds(156, 115, 45, 45);
		frmCalculator.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("%");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
				
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_8.setBounds(208, 115, 45, 45);
		frmCalculator.getContentPane().add(button_8);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(iNum);
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn4.setBounds(10, 166, 45, 45);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(iNum);
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn5.setBounds(60, 166, 45, 45);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(iNum);
				
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn6.setBounds(108, 166, 45, 45);
		frmCalculator.getContentPane().add(btn6);
		
		JButton button_12 = new JButton("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
				
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_12.setBounds(156, 166, 45, 45);
		frmCalculator.getContentPane().add(button_12);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				firstnum = 1 / firstnum;
				txtDisplay.setText(String.valueOf(firstnum));
				
			}
		});
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnx.setBounds(208, 166, 45, 45);
		frmCalculator.getContentPane().add(btnx);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(iNum);
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn1.setBounds(10, 218, 45, 45);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(iNum);
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn2.setBounds(60, 218, 45, 45);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(iNum);
				
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn3.setBounds(108, 218, 45, 45);
		frmCalculator.getContentPane().add(btn3);
		
		JButton button_17 = new JButton("-");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
				
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_17.setBounds(156, 218, 45, 45);
		frmCalculator.getContentPane().add(button_17);
		
		JButton button_18 = new JButton(".");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ops = txtDisplay.getText() + button_18.getText();
				txtDisplay.setText(ops);
				
			}
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_18.setBounds(108, 269, 45, 45);
		frmCalculator.getContentPane().add(button_18);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(iNum);
				
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn0.setBounds(10, 269, 95, 45);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
				
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnplus.setBounds(156, 269, 45, 45);
		frmCalculator.getContentPane().add(btnplus);
		
		JButton button_21 = new JButton("=");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if(operations == "+"){
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
				else if(operations == "-"){
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "*"){
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "/"){
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "%"){
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "Exp"){
					result = firstnum *Math.pow(10, secondnum);
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "^"){
					result = Math.pow(firstnum, secondnum);
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		button_21.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_21.setBounds(208, 218, 45, 96);
		frmCalculator.getContentPane().add(button_21);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLog.setBounds(263, 65, 55, 45);
		frmCalculator.getContentPane().add(btnLog);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sin(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSin.setBounds(323, 65, 55, 45);
		frmCalculator.getContentPane().add(btnSin);
		
		JButton button_24 = new JButton("\u03C0");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops = 3.1415926535897932384633832795;
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		button_24.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_24.setBounds(263, 115, 55, 45);
		frmCalculator.getContentPane().add(button_24);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cos(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCos.setBounds(323, 116, 55, 45);
		frmCalculator.getContentPane().add(btnCos);
		
		JButton btnXy = new JButton("^");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "^";
				
			}
		});
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnXy.setBounds(263, 166, 55, 45);
		frmCalculator.getContentPane().add(btnXy);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tan(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnTan.setBounds(323, 167, 55, 45);
		frmCalculator.getContentPane().add(btnTan);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = (ops * ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnX.setBounds(263, 218, 55, 45);
		frmCalculator.getContentPane().add(btnX);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cbrt(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnCbr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCbr.setBounds(323, 219, 55, 45);
		frmCalculator.getContentPane().add(btnCbr);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.pow(ops, 3.0);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnX_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnX_1.setBounds(263, 269, 55, 45);
		frmCalculator.getContentPane().add(btnX_1);
		
		JButton btnBi = new JButton("Bin");
		btnBi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,2));
				
			}
		});
		btnBi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBi.setBounds(323, 271, 55, 45);
		frmCalculator.getContentPane().add(btnBi);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sinh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSinh.setBounds(388, 65, 55, 45);
		frmCalculator.getContentPane().add(btnSinh);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				if(firstnum < 0){
					firstnum = firstnum * (-1);
					txtDisplay.setText(String.valueOf(firstnum));
				}
				else{
					txtDisplay.setText(String.valueOf(firstnum));
				}
				
			}
		});
		btnMod.setBounds(453, 65, 55, 45);
		frmCalculator.getContentPane().add(btnMod);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cosh(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCosh.setBounds(388, 116, 55, 45);
		frmCalculator.getContentPane().add(btnCosh);
		
		JButton btnLnx = new JButton("lnx");
		btnLnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log10(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnLnx.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLnx.setBounds(453, 116, 55, 45);
		frmCalculator.getContentPane().add(btnLnx);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tanh(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnTanh.setBounds(388, 167, 55, 45);
		frmCalculator.getContentPane().add(btnTanh);
		
		JButton btnExp = new JButton("Exp");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtDisplay.getText().equals("Exp")){
					firstnum = 1;
					txtDisplay.setText("");
					operations = "Exp";
				}
				else{
					firstnum = Double.parseDouble(txtDisplay.getText());
					txtDisplay.setText("");
					operations = "Exp";
				}
				
			}
		});
		btnExp.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnExp.setBounds(453, 167, 55, 45);
		frmCalculator.getContentPane().add(btnExp);
		
		JButton btnRund = new JButton("Rund");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.round(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnRund.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnRund.setBounds(388, 219, 55, 45);
		frmCalculator.getContentPane().add(btnRund);
		
		JButton button_39 = new JButton("2*\u03C0");
		button_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops = (3.1415926535897932384633832795) * 2;
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		button_39.setBounds(453, 219, 55, 45);
		frmCalculator.getContentPane().add(button_39);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,16));
				
			}
		});
		btnHex.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnHex.setBounds(388, 271, 55, 45);
		frmCalculator.getContentPane().add(btnHex);
		
		JButton btnOcta = new JButton("Octa");
		btnOcta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,8));
				
			}
		});
		btnOcta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnOcta.setBounds(453, 271, 55, 45);
		frmCalculator.getContentPane().add(btnOcta);
	}
}

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	boolean isoperatorClicked =false; 

	JFrame jf;
	JLabel displaylabel;
	JButton SevenButton;
	JButton EightButton;
	JButton NineButton;
	JButton FourButton;
	JButton FiveButton;
	JButton SixButton;
	JButton OneButton;
	JButton TwoButton;
	JButton ThreeButton;
	JButton DotButton;
	JButton ZeroButton;
	JButton EqualButton;
	JButton DivButton;
	JButton MultButton;
	JButton MinusButton;
	JButton PlusButton;
	JButton clearButton;

	
	String  oldValue; 
	char operator;


	Calculator() {
		jf = new JFrame("CALCULATOR");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(650, 50);
		Container c = jf.getContentPane();
		c.setBackground(Color.black); 

		displaylabel = new JLabel();
		displaylabel.setBounds(30, 30, 540, 80);
		displaylabel.setBackground(new Color(30, 30, 30)); 
		displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(new Color(144, 238, 144));  
		displaylabel.setFont(new Font("Serif", Font.BOLD, 40));

		jf.add(displaylabel); 

		SevenButton = new JButton("7");
		SevenButton.setBounds(30, 130, 80, 80);
		SevenButton.setBackground(new Color(50, 75, 160));
		SevenButton.addActionListener(this);
		SevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(SevenButton);

		EightButton = new JButton("8");
		EightButton.setBounds(130, 130, 80, 80);
		EightButton.setBackground(new Color(50, 75, 160));
		EightButton.addActionListener(this);
		EightButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(EightButton);

		NineButton = new JButton("9");
		NineButton.setBounds(230, 130, 80, 80);
		NineButton.setBackground(new Color(50, 75, 160));
		NineButton.addActionListener(this);
		NineButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(NineButton);

		FourButton = new JButton("4");
		FourButton.setBounds(30, 230, 80, 80);
		FourButton.setBackground(new Color(50, 75, 160));
		FourButton.addActionListener(this);
		FourButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(FourButton);

		FiveButton = new JButton("5");
		FiveButton.setBounds(130, 230, 80, 80);
		FiveButton.setBackground(new Color(50, 75, 160));
		FiveButton.addActionListener(this);
		FiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(FiveButton);

		SixButton = new JButton("6");
		SixButton.setBounds(230, 230, 80, 80);
		SixButton.setBackground(new Color(50, 75, 160));
		SixButton.addActionListener(this);
		SixButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(SixButton);

		OneButton = new JButton("1");
		OneButton.setBounds(30, 330, 80, 80);
		OneButton.setBackground(new Color(50, 75, 160));
		OneButton.addActionListener(this);
		OneButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(OneButton);

		TwoButton = new JButton("2");
		TwoButton.setBounds(130, 330, 80, 80);
		TwoButton.setBackground(new Color(50, 75, 160));
		TwoButton.addActionListener(this);
		TwoButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(TwoButton);

		ThreeButton = new JButton("3");
		ThreeButton.setBounds(230, 330, 80, 80);
		ThreeButton.setBackground(new Color(50, 75, 160));
		ThreeButton.addActionListener(this);
		ThreeButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(ThreeButton);

		DotButton = new JButton(".");
		DotButton.setBounds(30, 430, 80, 80);
		DotButton.setBackground(new Color(50, 75, 160));
		DotButton.addActionListener(this);
		DotButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(DotButton);

		ZeroButton = new JButton("0");
		ZeroButton.setBounds(130, 430, 80, 80);
		ZeroButton.setBackground(new Color(50, 75, 160));
		ZeroButton.addActionListener(this);
		ZeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(ZeroButton);

		EqualButton = new JButton("=");
		EqualButton.setBounds(230, 430, 80, 80);
		EqualButton.setBackground(new Color(50, 75, 160));
		EqualButton.addActionListener(this);
		EqualButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(EqualButton);

		DivButton = new JButton("÷");
		DivButton.setBounds(330, 130, 80, 80);
		DivButton.setBackground(new Color(50, 75, 160));
		DivButton.addActionListener(this);
		DivButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(DivButton);

		MultButton = new JButton("x");
		MultButton.setBounds(330, 230, 80, 80);
		MultButton.setBackground(new Color(50, 75, 160));
		MultButton.addActionListener(this);
		MultButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(MultButton);

		MinusButton = new JButton("-");
		MinusButton.setBounds(330, 330, 80, 80);
		MinusButton.setBackground(new Color(50, 75, 160));
		MinusButton.addActionListener(this);
		MinusButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(MinusButton);

		PlusButton = new JButton("+");
		PlusButton.setBounds(330, 430, 80, 80);
		PlusButton.setBackground(new Color(50, 75, 160));
		PlusButton.addActionListener(this);
		PlusButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(PlusButton);
		
		
		clearButton = new JButton("CLR");
		clearButton.setBounds(430, 430, 120, 80);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 20));
		jf.add(clearButton);

		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	
	public static void main(String arg[]) {

		new Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == SevenButton) {
			if(isoperatorClicked) {
				displaylabel.setText("7");
				isoperatorClicked=false;
			} 
			else {
				displaylabel.setText(displaylabel.getText()+"7");
			}
		} else if (e.getSource() == EightButton) {
			if(isoperatorClicked) {
				displaylabel.setText("8");
				isoperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+"8");
			}
			
		} else if (e.getSource() == NineButton) {
			if(isoperatorClicked) {
				displaylabel.setText("9");
				isoperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+"9");
			}
		} else if (e.getSource() == FourButton) {
			if(isoperatorClicked) {
				displaylabel.setText("4");
				isoperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+"4");
			}
		} else if (e.getSource() == FiveButton) {
			if(isoperatorClicked) {
				displaylabel.setText("5");
				isoperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+"5");
			}
		} else if (e.getSource() == SixButton) {
			if(isoperatorClicked) {
				displaylabel.setText("6");
				isoperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+"6");
			}
		} else if (e.getSource() == OneButton) {
			if(isoperatorClicked) {
				displaylabel.setText("1");
				isoperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+"1");
			}
		} else if (e.getSource() == TwoButton) {
			if(isoperatorClicked) {
				displaylabel.setText("2");
				isoperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+"2");
			}
		} else if (e.getSource() == ThreeButton) {
			if(isoperatorClicked) {
				displaylabel.setText("3");
				isoperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+"3");
			}
		} else if (e.getSource() == DotButton) {
			displaylabel.setText(displaylabel.getText()+".");
		} else if (e.getSource() == ZeroButton) {
			if(isoperatorClicked) {
				displaylabel.setText("0");
				isoperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+"0");
			}
			
			
		} else if (e.getSource() == EqualButton) {
		
			String newValue=displaylabel.getText(); 
			float oldvalueF=Float.parseFloat(oldValue);
			float newvalueF=Float.parseFloat(newValue);
			float result=0;
			
			
		
			
			
			switch (operator) {
			case '+' : result= oldvalueF+ newvalueF;
			break;
			case '-' : result= oldvalueF- newvalueF;
			break;
			case 'x' : result= oldvalueF* newvalueF;
			break;
			case '/' : if (newvalueF == 0) {
                displaylabel.setText("Error");
                return;
            }
            result = oldvalueF / newvalueF; 
            break;
   
			}
			displaylabel.setText(String.valueOf(result));
			
			
			
			
		
		} else if (e.getSource() == DivButton) {
			isoperatorClicked=true;
			oldValue=displaylabel.getText();
			operator = '/';
			
			
		} else if (e.getSource() == MultButton) {
			isoperatorClicked=true;
			oldValue=displaylabel.getText();
			operator = 'x';
		} else if (e.getSource() == MinusButton) {
			isoperatorClicked=true;
			oldValue=displaylabel.getText();
			operator = '-';
			
		} else if (e.getSource() == PlusButton) {
			isoperatorClicked=true;
			oldValue=displaylabel.getText();
			operator = '+';
			 
		} else if (e.getSource() == clearButton) {
			displaylabel.setText("");
	}

	}
}

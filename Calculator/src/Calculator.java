import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class Calculator extends JFrame{

	Container cont = this.getContentPane();
	JPanel butnPanel = new JPanel();
	JPanel operationPanel = new JPanel();
	JPanel mainPanel = new JPanel();
	JTextField tx = new JTextField();                		    
	
	double op1, op2, opResult;
	String operation;
	
	GridBagConstraints gc = new GridBagConstraints();
	
	public Calculator(String title, int w, int h){
		// hello 
		super(title);
		setSize(w, h);
	
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void addPanels(){
		
		GridLayout mainGL = new GridLayout();
		mainGL.setHgap(5);
		mainGL.setVgap(10);
		
		mainPanel.setLayout(mainGL);
		
		butnsPanel();
		operationsPanel();
		
		mainPanel.add(butnPanel, BorderLayout.WEST);
		mainPanel.add(operationPanel, BorderLayout.CENTER);
		
		cont.add(tx,BorderLayout.NORTH);
		cont.add(mainPanel, BorderLayout.CENTER);
	}
	public void setContaingColor(Color c){
		
		cont.setBackground(c);
	}
	
	public void butnsPanel(){
		
		butnPanel.setSize(400,400);
		butnPanel.setLayout(new GridBagLayout());
	    
		int [][] numbers = new int [3][3];
		int title = 1;
		
		for (int i = 0; i < numbers.length; i++){
			for (int j = 0; j < numbers.length; j++){
			    JButton addButton = new JButton(String.valueOf(title));
			    gc.gridx = j;
			    gc.gridy = i;
			    addButton.setPreferredSize(new Dimension(100,100));
			    butnPanel.add(addButton,gc);
			    addButton.addActionListener(		
						new ActionListener() { // MyWin$1
							public void actionPerformed(ActionEvent e) {
								System.out.println(addButton.getText());
								if(tx.equals("")){
									tx.setText(addButton.getText());
								}else{
									tx.setText(tx.getText() + addButton.getText());
								}

							}
						}
				);
			    title++;
			    
			    if (i == 2 && j == 2){
					JButton addButton0 = new JButton(String.valueOf(0));
				    gc.gridx = 1;
				    gc.gridy = 4;
				    addButton0.setPreferredSize(new Dimension(100,100));
				    butnPanel.add(addButton0,gc);
				    addButton0.addActionListener(		
							new ActionListener() { // MyWin$1
								public void actionPerformed(ActionEvent e) {
									System.out.println(addButton0.getText());
									if(tx.equals("")){
										tx.setText(addButton0.getText());
									}else{
										tx.setText(tx.getText() + addButton0.getText());
									}

								}
							}
					);
			    }
			}
		}
	    
	}
	
	public void operationsPanel(){

		BoxLayout bx = new BoxLayout(operationPanel, BoxLayout.Y_AXIS);
		
		operationPanel.setLayout(bx);
		operationPanel.setPreferredSize(new Dimension(80,80));
		
		 JButton add = new JButton("+");
		 add.setPreferredSize(new Dimension(100,100));
		 operationPanel.add(add);
		    add.addActionListener(		
					new ActionListener() { // MyWin$1
						public void actionPerformed(ActionEvent e) {
							System.out.println(add.getText());
							if(tx.equals("")){
							}else{
								//tx.setText(tx.getText() + add.getText());
								op1 = Double.valueOf(tx.getText());
								operation = add.getText();
								tx.setText("");
							}

						}
					}
			);
		    
		 
		 JButton sub = new JButton("-");
		 sub.setPreferredSize(new Dimension(100,100));
		 operationPanel.add(sub);
		 sub.addActionListener(		
					new ActionListener() { // MyWin$1
						public void actionPerformed(ActionEvent e) {
							System.out.println(sub.getText());
							if(tx.equals("")){
								//tx.setText(sub.getText());
							}else{
								//tx.setText(tx.getText() + sub.getText());
								op1 = Double.valueOf(tx.getText());
								operation = sub.getText();
								tx.setText("");
							}

						}
					}
			);
		 
		JButton mult = new JButton("*");
		mult.setPreferredSize(new Dimension(100,100));
		operationPanel.add(mult);
		mult.addActionListener(		
				new ActionListener() { // MyWin$1
					public void actionPerformed(ActionEvent e) {
						System.out.println(mult.getText());
						if(tx.equals("")){
							//tx.setText(mult.getText());
						}else{
							//tx.setText(tx.getText() + mult.getText());
							op1 = Double.valueOf(tx.getText());
							operation = mult.getText();
							tx.setText("");
						}

					}
				}
		);
		
		JButton div = new JButton("/");
		div.setPreferredSize(new Dimension(100,100));
		operationPanel.add(div);
		div.addActionListener(		
				new ActionListener() { // MyWin$1
					public void actionPerformed(ActionEvent e) {
						System.out.println(div.getText());
						if(tx.equals("")){
							//tx.setText(div.getText());
						}else{
							//tx.setText(tx.getText() + div.getText());
							op1 = Double.valueOf(tx.getText());
							operation = div.getText();
							tx.setText("");
						}

					}
				}
		);

		JButton equals = new JButton("=");
		equals.setPreferredSize(new Dimension(100,100));
		operationPanel.add(equals);
		equals.addActionListener(		
				new ActionListener() { // MyWin$1
					public void actionPerformed(ActionEvent e) {
						System.out.println(equals.getText());
						if(tx.equals("")){
							//tx.setText(equals.getText());
						}else{
							//tx.setText(tx.getText() + equals.getText());
							op2 = Integer.valueOf(tx.getText());								
							//operation = add.getText();
							
							switch(operation){
							case "+": 
								opResult = op1 + op2;
								tx.setText(Double.toString(opResult));
								
								break;
								
							case "-":
								opResult = op1 - op2;
								tx.setText(Double.toString(opResult));
								break;
							
							case "*":
								opResult = op1 * op2;
								tx.setText(Double.toString(opResult));
								break;
							
							case "/":
								opResult = op1 / op2;
								tx.setText(Double.toString(opResult));
								break;
							}
						}

					}
				}
		);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator("calculator", 400, 400);
		cal.setContaingColor(Color.GRAY);
		cal.addPanels();
		
	}

}


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class Calculator extends JFrame{

	// tsting changes
	Container cont = this.getContentPane();
	JPanel butnPanel = new JPanel();
	JPanel operationPanel = new JPanel();
	JPanel mainPanel = new JPanel();
	JTextField tx = new JTextField();                		    

	double op1, op2, opResult;
	String operation;
	
	GridBagConstraints gc = new GridBagConstraints();
	
	public Calculator(String title, int w, int h){

		super(title);
		setSize(w, h);
		this.setResizable(false);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	public void addPanels(){
		
		butnsPanel();
		operationsPanel();
		
		cont.add(tx,BorderLayout.NORTH);
		cont.add(butnPanel, BorderLayout.WEST);
		cont.add(operationPanel, BorderLayout.CENTER);
		
		butnPanel.setVisible(true);
		operationPanel.setVisible(true);
		setVisible(true);

	}
	public void setContaingColor(Color c){
		
		cont.setBackground(c);
	}
	
	public void butnsPanel(){
		
		butnPanel.setSize(200,200);
		butnPanel.setLayout(new GridBagLayout());
	    
		int [][] numbers = new int [3][3];
		int title = 1;
		
		for (int i = 0; i < numbers.length; i++){
			for (int j = 0; j < numbers.length; j++){
			    JButton addButton = new JButton(String.valueOf(title));
			    gc.gridx = j;
			    gc.gridy = i;
			    addButton.setPreferredSize(new Dimension(60,60));
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
				    addButton0.setPreferredSize(new Dimension(60,60));
				    //addButton0.setBounds(10, 80, 45, 42);
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
	
	public void buttons(){
		
	}
	
	public void operationsPanel(){

		operationPanel.setSize(200,200);
		operationPanel.setLayout(new GridBagLayout());
	    		
		 JButton add = new JButton("+");		 
		 gc.gridx = 3;
		 gc.gridy = 0;
		 add.setPreferredSize(new Dimension(60,47));
		 operationPanel.add(add,gc);
		    
		    add.addActionListener(		
					new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println(add.getText());
							if(tx.equals("")|| tx.equals(null)){
							
							}else{
								op1 = Double.valueOf(tx.getText());
								operation = add.getText();
								tx.setText("");
							}

						}
					}
			);
		    
		 
		 JButton sub = new JButton("-");
		 gc.gridx = 3;
		 gc.gridy = 1;
		 sub.setPreferredSize(new Dimension(60,47));
		 operationPanel.add(sub,gc);

		 sub.addActionListener(		
					new ActionListener() { 
						public void actionPerformed(ActionEvent e) {
							System.out.println(sub.getText());
							if(tx.equals("") || tx.equals(null)){
							
							}else{
								op1 = Double.valueOf(tx.getText());
								operation = sub.getText();
								tx.setText("");
							}

						}
					}
			);
		 
		JButton mult = new JButton("*");
		
		 gc.gridx = 3;
		 gc.gridy = 2;
		 mult.setPreferredSize(new Dimension(60,47));
		 operationPanel.add(mult,gc);
		 
		mult.addActionListener(		
				new ActionListener() { 
					public void actionPerformed(ActionEvent e) {
						System.out.println(mult.getText());
						if(tx.equals("")|| tx.equals(null)){
						
						}else{
							op1 = Double.valueOf(tx.getText());
							operation = mult.getText();
							tx.setText("");
						}

					}
				}
		);
		
		JButton div = new JButton("/");
		 gc.gridx = 3;
		 gc.gridy = 3;
		 div.setPreferredSize(new Dimension(60,47));
		 operationPanel.add(div,gc);
		 
		div.addActionListener(		
				new ActionListener() { 
					public void actionPerformed(ActionEvent e) {
						System.out.println(div.getText());
						if(tx.equals("")){

						}else{
							op1 = Double.valueOf(tx.getText());
							operation = div.getText();
							tx.setText("");
						}

					}
				}
		);

		JButton equals = new JButton("=");
		
		 gc.gridx = 3;
		 gc.gridy = 4;
		 equals.setPreferredSize(new Dimension(60,47));
		 operationPanel.add(equals,gc);
		 
		equals.addActionListener(		
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println(equals.getText());
						if(tx.equals("")){

						}else{
							op2 = Integer.valueOf(tx.getText());								
							
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
		
		Calculator cal = new Calculator("calculator", 300, 400);
		cal.setContaingColor(Color.GRAY);
		cal.addPanels();
		
	}

}


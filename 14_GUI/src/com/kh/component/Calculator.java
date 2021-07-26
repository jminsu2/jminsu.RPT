package com.kh.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	
	public Calculator() {
		// 숫자를 입력받아 제곱한 결과를 돌려주는 계산기
		
		super("장민수의 계산기");
		
		JPanel pan = new JPanel();
		
		JLabel label = new JLabel("숫자 입력 :");
		JTextField text = new JTextField(15);
		
		JLabel label2 = new JLabel("숫자 입력 : ");
		JTextField text2 = new JTextField(15);
		

		
		
		
		JButton btn1 = new JButton("+");
		JButton btn2 = new JButton("-");
		JButton btn3 = new JButton("*");
		JButton btn4 = new JButton("/");
		
		JLabel label3 = new JLabel("결과 출력 : ");
		JTextField text3 = new JTextField(15);
	text3.setEditable(false);
	
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 계산하기 버튼을 클릭했을 때 발생할 코드 작성
				
				// 텍스트 필드의 숫자 값을 가져와서 
				// 숫자라면 int로 변환하기
				
				String temp1 = text.getText();
				String temp2 = text2.getText();
				try {
					int num1 = Integer.parseInt(temp1);			
					int num2 = Integer.parseInt(temp2);
					text3.setText( String.valueOf( num1 + num2 ) );
				} catch(NumberFormatException ex) {
					
					text3.setText("숫자가 아닙니다!");
					
				}
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 계산하기 버튼을 클릭했을 때 발생할 코드 작성
				
				// 텍스트 필드의 숫자 값을 가져와서 
				// 숫자라면 int로 변환하기
				
				String temp1 = text.getText();
				String temp2 = text2.getText();
				try {
					int num1 = Integer.parseInt(temp1);			
					int num2 = Integer.parseInt(temp2);
					text3.setText( String.valueOf( num1 - num2 ) );
				} catch(NumberFormatException ex) {
					
					text3.setText("숫자가 아닙니다!");
					
				}
				
			}
		});
		
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 계산하기 버튼을 클릭했을 때 발생할 코드 작성
				
				// 텍스트 필드의 숫자 값을 가져와서 
				// 숫자라면 int로 변환하기
				
				String temp1 = text.getText();
				String temp2 = text2.getText();
				try {
					int num1 = Integer.parseInt(temp1);			
					int num2 = Integer.parseInt(temp2);
					text3.setText( String.valueOf( num1 * num2 ) );
				} catch(NumberFormatException ex) {
					
					text3.setText("숫자가 아닙니다!");
					
				}
				
			}
		});
		
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 계산하기 버튼을 클릭했을 때 발생할 코드 작성
				
				// 텍스트 필드의 숫자 값을 가져와서 
				// 숫자라면 int로 변환하기
				
				String temp1 = text.getText();
				String temp2 = text2.getText();
				try {
					int num1 = Integer.parseInt(temp1);			
					int num2 = Integer.parseInt(temp2);
					text3.setText( String.valueOf( num1 / num2 ) );
				} catch(NumberFormatException ex) {
					
					text3.setText("숫자가 아닙니다!");
					
				}
				
			}
		});
		
		pan.add(label);
		pan.add(text);
		pan.add(label2);
		pan.add(text2);
		pan.add(label3);
		pan.add(text3);
		pan.add(btn1);
		pan.add(btn2);
		pan.add(btn3);
		pan.add(btn4);
	
		
		add(pan);
		
		setBounds(300, 450, 280, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
	
}


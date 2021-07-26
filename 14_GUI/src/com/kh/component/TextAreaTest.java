package com.kh.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaTest extends JFrame {

	
	public TextAreaTest() {
		super("장민수의 나홀로 채팅방");
		//컨테이너 안에 
		JPanel pan = new JPanel();
		
		pan.setLayout(new BorderLayout());
		
		JTextArea area = new JTextArea();
		area.setEditable(false);
		JTextField text = new JTextField();
		
		text.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
	//텍스트필드에 이벤트가 발생햇을때 에리어에 값을 전당하는 기능
				
				String str = text.getText();
				area.append(str + "\n");
				text.setText("");
						}});
		
		pan.add(area, "Center");
		pan.add(text, "South");
		add(pan);
		setBounds(300,300,500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
	new TextAreaTest();	
		
	}

}

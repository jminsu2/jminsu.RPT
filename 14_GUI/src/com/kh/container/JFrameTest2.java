package com.kh.container;

import java.awt.Rectangle;

import javax.swing.JFrame;

public class JFrameTest2 {
//컨테이너 생성방법 2
	 // 메소드를 통해 만들기
	
	public void showFrm() {
		JFrame frm = new JFrame("쁘띠쁘띠 프레임");
		Rectangle r = new Rectangle(300, 300, 400, 300);
		frm.setBounds(r);
		
		//종료 메소드
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//리사이주 방지
		frm.setResizable(false);
		
		frm.setVisible(true);
		
	}
	
}

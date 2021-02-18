import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener
{
	static boolean p1Turn = true;
	private JFrame frame = new JFrame();
	static JFrame endFrame = new JFrame();
	private JPanel panel = new JPanel();
	private JPanel gameOverScreen = new JPanel();
	private JButton resetButton = new JButton("Play Again");
	private JLabel gameOverMessage = new JLabel("     Game Over");
//	private JLabel one = new JLabel("1");
//	private JLabel two = new JLabel("2");
//	private JLabel three = new JLabel("3");
//	private JLabel four = new JLabel("4");
//	private JLabel five = new JLabel("5");
//	private JLabel six = new JLabel("6");
//	private JLabel seven = new JLabel("7");
//	private JLabel eight = new JLabel("8");
//	private JLabel nine = new JLabel("9");
	
	private JButton b00 = new JButton("00");
	private JButton b01 = new JButton("+");
	private JButton b02 = new JButton("+");
	private JButton b03 = new JButton("+");
	private JButton b04 = new JButton("+");
	private JButton b05 = new JButton("+");
	private JButton b06 = new JButton("+");
	private JButton b07 = new JButton("+");
	private JButton b08 = new JButton("+");
	
	private JButton b10 = new JButton("+");
	private JButton b11 = new JButton("+");
	private JButton b12 = new JButton("+");
	private JButton b13 = new JButton("+");
	private JButton b14 = new JButton("+");
	private JButton b15 = new JButton("+");
	private JButton b16 = new JButton("+");
	private JButton b17 = new JButton("+");
	private JButton b18 = new JButton("+");
	
	private JButton b20 = new JButton("+");
	private JButton b21 = new JButton("+");
	private JButton b22 = new JButton("+");
	private JButton b23 = new JButton("+");
	private JButton b24 = new JButton("+");
	private JButton b25 = new JButton("+");
	private JButton b26 = new JButton("+");
	private JButton b27 = new JButton("+");
	private JButton b28 = new JButton("+");
	
	private JButton b30 = new JButton("+");
	private JButton b31 = new JButton("+");
	private JButton b32 = new JButton("+");
	private JButton b33 = new JButton("+");
	private JButton b34 = new JButton("+");
	private JButton b35 = new JButton("+");
	private JButton b36 = new JButton("+");
	private JButton b37 = new JButton("+");
	private JButton b38 = new JButton("28");
	
	private JButton b40 = new JButton("+");
	private JButton b41 = new JButton("+");
	private JButton b42 = new JButton("+");
	private JButton b43 = new JButton("+");
	private JButton b44 = new JButton("+");
	private JButton b45 = new JButton("+");
	private JButton b46 = new JButton("+");
	private JButton b47 = new JButton("+");
	private JButton b48 = new JButton("+");
	
	private JButton b50 = new JButton("+");
	private JButton b51 = new JButton("+");
	private JButton b52 = new JButton("+");
	private JButton b53 = new JButton("+");
	private JButton b54 = new JButton("+");
	private JButton b55 = new JButton("+");
	private JButton b56 = new JButton("+");
	private JButton b57 = new JButton("+");
	private JButton b58 = new JButton("+");
	
	private JButton b60 = new JButton("+");
	private JButton b61 = new JButton("+");
	private JButton b62 = new JButton("+");
	private JButton b63 = new JButton("+");
	private JButton b64 = new JButton("+");
	private JButton b65 = new JButton("65");
	private JButton b66 = new JButton("+");
	private JButton b67 = new JButton("+");
	private JButton b68 = new JButton("+");
	
	private JButton b70 = new JButton("+");
	private JButton b71 = new JButton("+");
	private JButton b72 = new JButton("+");
	private JButton b73 = new JButton("+");
	private JButton b74 = new JButton("+");
	private JButton b75 = new JButton("+");
	private JButton b76 = new JButton("+");
	private JButton b77 = new JButton("+");
	private JButton b78 = new JButton("+");
	
	private JButton b80 = new JButton("+");
	private JButton b81 = new JButton("+");
	private JButton b82 = new JButton("+");
	private JButton b83 = new JButton("83");
	private JButton b84 = new JButton("+");
	private JButton b85 = new JButton("+");
	private JButton b86 = new JButton("+");
	private JButton b87 = new JButton("+");
	private JButton b88 = new JButton("+");
	
	public static void ifPressed(JButton b, int row, int col)
	{
		if(p1Turn && GridTracker.grid[row][col] == '+')
		{
			b.setBackground(Color.YELLOW);
			GridTracker.grid[row][col] = '1';
			p1Turn = false;
		}
		else if(GridTracker.grid[row][col] == '+')
		{
			b.setBackground(Color.RED);
			GridTracker.grid[row][col] = '2';
			p1Turn = true;
		}
		else
		{
			//display error message- probably through setText with instructions label
		}
			
	Logistics.checkWin(row, col);	
//	if(Logistics.gameOver)
//	{
//		panel.close();
//	}
	}
	public GUI()
	{
		resetButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
			panel.setVisible(false);
			frame.dispose();
			new GUI();}});
		
		b00.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b00, 0, 0);}});
		b01.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b01, 0, 1);}});
		b02.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b02, 0, 2);}});
		b03.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b03, 0, 3);}});
		b04.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b04, 0, 4);}});
		b05.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b05, 0, 5);}});
		b06.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b06, 0, 6);}});
		b07.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b07, 0, 7);}});
		b08.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b08, 0, 8);}});
		
		b10.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b10, 1, 0);}});
		b11.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b11, 1, 1);}});
		b12.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b12, 1, 2);}});
		b13.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b13, 1, 3);}});
		b14.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b14, 1, 4);}});
		b15.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b15, 1, 5);}});
		b16.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b16, 1, 6);}});
		b17.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b17, 1, 7);}});
		b18.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b18, 1, 8);}});
		
		b20.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b20, 2, 0);}});
		b21.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b21, 2, 1);}});
		b22.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b22, 2, 2);}});
		b23.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b23, 2, 3);}});
		b24.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b24, 2, 4);}});
		b25.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b25, 2, 5);}});
		b26.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b26, 2, 6);}});
		b27.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b27, 2, 7);}});
		b28.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b28, 2, 8);}});
		
		b30.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b30, 3, 0);}});
		b31.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b31, 3, 1);}});
		b32.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b32, 3, 2);}});
		b33.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b33, 3, 3);}});
		b34.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b34, 3, 4);}});
		b35.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b35, 3, 5);}});
		b36.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b36, 3, 6);}});
		b37.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b37, 3, 7);}});
		b38.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b38, 3, 8);}});
		
		b40.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b40, 4, 0);}});
		b41.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b41, 4, 1);}});
		b42.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b42, 4, 2);}});
		b43.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b43, 4, 3);}});
		b44.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b44, 4, 4);}});
		b45.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b45, 4, 5);}});
		b46.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b46, 4, 6);}});
		b47.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b47, 4, 7);}});
		b48.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b48, 4, 8);}});
		
		b50.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b50, 5, 0);}});
		b51.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b51, 5, 1);}});
		b52.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b52, 5, 2);}});
		b53.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b53, 5, 3);}});
		b54.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b54, 5, 4);}});
		b55.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b55, 5, 5);}});
		b56.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b56, 5, 6);}});
		b57.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b57, 5, 7);}});
		b58.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b58, 5, 8);}});
		
		b60.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b60, 6, 0);}});
		b61.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b61, 6, 1);}});
		b62.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b62, 6, 2);}});
		b63.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b63, 6, 3);}});
		b64.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b64, 6, 4);}});
		b65.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b65, 6, 5);}});
		b66.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b66, 6, 6);}});
		b67.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b67, 6, 7);}});
		b68.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b68, 6, 8);}});
		
		b70.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b70, 7, 0);}});
		b71.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b71, 7, 1);}});
		b72.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b72, 7, 2);}});
		b73.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b73, 7, 3);}});
		b74.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b74, 7, 4);}});
		b75.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b75, 7, 5);}});
		b76.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b76, 7, 6);}});
		b77.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b77, 7, 7);}});
		b78.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b78, 7, 8);}});
	
		b80.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b80, 8, 0);}});
		b81.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b81, 8, 1);}});
		b82.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b82, 8, 2);}});
		b83.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b83, 8, 3);}});
		b84.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b84, 8, 4);}});
		b85.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b85, 8, 5);}});
		b86.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b86, 8, 6);}});
		b87.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b87, 8, 7);}});
		b88.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b88, 8, 8);}});
		
		gameOverScreen.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
		panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
		gameOverScreen.setLayout(new GridLayout(2, 3));
		panel.setLayout(new GridLayout(9, 9, 2, 10));
		
		panel.add(b00);
		panel.add(b01);
		panel.add(b02);
		panel.add(b03);
		panel.add(b04);
		panel.add(b05);
		panel.add(b06);
		panel.add(b07);
		panel.add(b08);
		
		panel.add(b10);
		panel.add(b11);
		panel.add(b12);
		panel.add(b13);
		panel.add(b14);
		panel.add(b15);
		panel.add(b16);
		panel.add(b17);
		panel.add(b18);
		
		panel.add(b20);
		panel.add(b21);
		panel.add(b22);
		panel.add(b23);
		panel.add(b24);
		panel.add(b25);
		panel.add(b26);
		panel.add(b27);
		panel.add(b28);
		
		panel.add(b30);
		panel.add(b31);
		panel.add(b32);
		panel.add(b33);
		panel.add(b34);
		panel.add(b35);
		panel.add(b36);
		panel.add(b37);
		panel.add(b38);
		
		panel.add(b40);
		panel.add(b41);
		panel.add(b42);
		panel.add(b43);
		panel.add(b44);
		panel.add(b45);
		panel.add(b46);
		panel.add(b47);
		panel.add(b48);
		
		panel.add(b50);
		panel.add(b51);
		panel.add(b52);
		panel.add(b53);
		panel.add(b54);
		panel.add(b55);
		panel.add(b56);
		panel.add(b57);
		panel.add(b58);
		
		panel.add(b60);
		panel.add(b61);
		panel.add(b62);
		panel.add(b63);
		panel.add(b64);
		panel.add(b65);
		panel.add(b66);
		panel.add(b67);
		panel.add(b68);
		
		panel.add(b70);
		panel.add(b71);
		panel.add(b72);
		panel.add(b73);
		panel.add(b74);
		panel.add(b75);
		panel.add(b76);
		panel.add(b77);
		panel.add(b78);
		
		panel.add(b80);
		panel.add(b81);
		panel.add(b82);
		panel.add(b83);
		panel.add(b84);
		panel.add(b85);
		panel.add(b86);
		panel.add(b87);
		panel.add(b88);
		
		
		gameOverScreen.add(gameOverMessage);
		gameOverScreen.add(resetButton);
		
		
		frame.add(panel, BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("PENTE");
		frame.pack();
		frame.setVisible(true);
		
		endFrame.add(gameOverScreen, (BorderLayout.CENTER));
		endFrame.setTitle("GAME OVER");
		endFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		endFrame.pack();
		endFrame.setVisible(false);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		//empty override 
	}
}

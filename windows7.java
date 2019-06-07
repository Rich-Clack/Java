import java.awt.*;
import java.awt.event.*;
class actions1 implements ActionListener{
	public void actionPerformed(ActionEvent x){
		System.out.println("Hello");
	}
}
class actions2 implements ActionListener{
	public void actionPerformed(ActionEvent x){
		System.out.println("Why are you pressing my buttons???");
	}
}
class actions3 implements ActionListener{
	public void actionPerformed(ActionEvent x){
		System.out.println("I think you need to find other things to do");
	}
}
class actions4 implements ActionListener{
	public void actionPerformed(ActionEvent x){
		System.out.println("Get off my land !!");
	}
}
class actions5 implements ActionListener{
	public void actionPerformed(ActionEvent x){
		System.out.println("What do you want?");
	}
}
class windows7{
	public static void main(String xyz[]){
		Frame win=new Frame();
		Button B1=new Button("Click Me - Up high");
		Button B2=new Button("Click Me - To the side");	
		Button B3=new Button("Click Me - Down low");	
		Button B4=new Button("Click Me - To the side");	
		Button B5=new Button("Click me - right in the middle");		
		actions1 e=new actions1();
		B1.addActionListener(e);	
		actions2 f=new actions2();
		B2.addActionListener(f);
		actions3 g=new actions3();
		B3.addActionListener(g);
		actions4 h=new actions4();
		B4.addActionListener(h);
		actions5 j=new actions5();
		B5.addActionListener(j);
		win.add(B1,BorderLayout.NORTH);
		win.add(B2,BorderLayout.EAST);
		win.add(B3,BorderLayout.SOUTH);
		win.add(B4,BorderLayout.WEST);
		win.add(B5,BorderLayout.CENTER);
		win.setSize(800,800);
		win.setBackground(Color.black);
		win.setVisible(true);
		B1.setBackground(Color.yellow);
		B2.setBackground(Color.blue);
		B3.setBackground(Color.green);
		B4.setBackground(Color.red);
		B5.setBackground(Color.orange);
	}
}

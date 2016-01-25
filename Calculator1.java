package com;

import java.awt.*;
import java.awt.event.*;



public class Calculator1 {
	public static void main(String[] args ){
		Calculator c=new Calculator();
		c.launcchframe();
	}

}


class Calculator extends Frame{
	TextField tf;
	int num1=0; int num2=0;

	int symbol=0;    //判断该不该清空文本框
    String sign;
	public void launcchframe(){

		Frame f=new Frame("calculator");
		f.addWindowListener(new  MyWindowMonitor(this));
		Panel p1=new Panel();    Panel p2=new Panel(); Panel p3=new Panel(); Panel p4=new Panel(); Panel p5=new Panel();
		f.setLayout(new BorderLayout());
		f.add(p1,BorderLayout.CENTER); f.add(p2,BorderLayout.NORTH); f.add(p3,BorderLayout.EAST); f.add(p4,BorderLayout.WEST);
		tf=new TextField();
		p2.setLayout(new BorderLayout());
		
		p2.add(tf,BorderLayout.CENTER);
		
		Button button10= new Button("=");
		
        p3.setLayout(new BorderLayout());
		
		p3.add(button10,BorderLayout.CENTER);
		
		
		Button button1= new Button("1");Button button2= new Button("2");
		Button button3= new Button("3");Button button4= new Button("4");
		Button button5= new Button("5");Button button6= new Button("6");
		Button button7= new Button("7");Button button8= new Button("8");Button button9= new Button("9");
		
		Button buttonjia= new Button("+");Button buttonjian= new Button("-");
		Button buttoncheng= new Button("x");Button buttonchu= new Button("/");
		p4.setLayout(new GridLayout(4,1));
		p4.add(buttonjia); p4.add(buttonjian); p4.add(buttoncheng); p4.add(buttonchu);
		
		
		
	    Monitor1 a1=new Monitor1(this);  Monitor2 a2=new Monitor2(this); Monitor3 a3=new Monitor3(this); Monitor4 a4=new Monitor4(this);
	    Monitor5 a5=new Monitor5(this); Monitor6 a6=new Monitor6(this); Monitor7 a7=new Monitor7(this); Monitor8 a8=new Monitor8(this);
	    Monitor9 a9=new Monitor9(this);
	    button1.addActionListener(a1);    button2.addActionListener(a2);    button3.addActionListener(a3);
	    button4.addActionListener(a4);    button5.addActionListener(a5);    button6.addActionListener(a6);
	    button7.addActionListener(a7);    button8.addActionListener(a8);    button9.addActionListener(a9);
		p1.setLayout(new GridLayout(3,3));
		p1.add(button1);p1.add(button2);
		p1.add(button3);p1.add(button4);
		p1.add(button5);p1.add(button6);
		p1.add(button7);p1.add(button8);p1.add(button9);
		
		
		Monitorjia jia=new Monitorjia(this);    buttonjia.addActionListener(jia);
		Monitorjian jian=new Monitorjian(this);    buttonjian.addActionListener(jian);
		Monitorcheng cheng=new Monitorcheng(this);    buttoncheng.addActionListener(cheng);
		Monitorchu chu=new Monitorchu(this);    buttonchu.addActionListener(chu);
		
		
		Monitordeng deng=new Monitordeng(this);    button10.addActionListener(deng);
		
		f.setSize(200,200);
		f.setLocation(100,100);
		f.setVisible(true);
	}
}


class Monitor1 implements ActionListener{
	Calculator c;
	public Monitor1(Calculator c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		if(c.symbol==0){
		c.tf.setText(c.tf.getText()+"1");
		}
		else{
			c.tf.setText("");
			c.tf.setText(c.tf.getText()+"1");
			c.symbol=0;
		}
	}
}


class Monitor2 implements ActionListener{
	Calculator c;
	public Monitor2(Calculator c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		
		if(c.symbol==0){
			c.tf.setText(c.tf.getText()+"2");
			}
			else{
				c.tf.setText("");
				c.tf.setText(c.tf.getText()+"2");
				c.symbol=0;
			}
	}
}
class Monitor3 implements ActionListener{
	Calculator c;
	public Monitor3(Calculator c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		if(c.symbol==0){
			c.tf.setText(c.tf.getText()+"3");
			}
			else{
				c.tf.setText("");
				c.tf.setText(c.tf.getText()+"3");
				c.symbol=0;
			}
	}
}

class Monitor4 implements ActionListener{
	Calculator c;
	public Monitor4(Calculator c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		if(c.symbol==0){
			c.tf.setText(c.tf.getText()+"4");
			}
			else{
				c.tf.setText("");
				c.tf.setText(c.tf.getText()+"4");
				c.symbol=0;
			}
	}
}

class Monitor5 implements ActionListener{
	Calculator c;
	public Monitor5(Calculator c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		if(c.symbol==0){
			c.tf.setText(c.tf.getText()+"5");
			}
			else{
				c.tf.setText("");
				c.tf.setText(c.tf.getText()+"5");
				c.symbol=0;
			}
	}
}

class Monitor6 implements ActionListener{
	Calculator c;
	public Monitor6(Calculator c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		if(c.symbol==0){
			c.tf.setText(c.tf.getText()+"6");
			}
			else{
				c.tf.setText("");
				c.tf.setText(c.tf.getText()+"6");
				c.symbol=0;
			}
	}
}

class Monitor7 implements ActionListener{
	Calculator c;
	public Monitor7(Calculator c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		if(c.symbol==0){
			c.tf.setText(c.tf.getText()+"7");
			}
			else{
				c.tf.setText("");
				c.tf.setText(c.tf.getText()+"7");
				c.symbol=0;
			}
	}
}

class Monitor8 implements ActionListener{
	Calculator c;
	public Monitor8(Calculator c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		if(c.symbol==0){
			c.tf.setText(c.tf.getText()+"8");
			}
			else{
				c.tf.setText("");
				c.tf.setText(c.tf.getText()+"8");
				c.symbol=0;
			}
	}
}
	

class Monitor9 implements ActionListener{
	Calculator c;
	public Monitor9(Calculator c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		if(c.symbol==0){
			c.tf.setText(c.tf.getText()+"9");
			}
			else{
				c.tf.setText("");
				c.tf.setText(c.tf.getText()+"9");
				c.symbol=0;
			}
	}
}

class Monitorjia implements ActionListener{
	Calculator c;
	public Monitorjia(Calculator c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		c.num1=Integer.parseInt(c.tf.getText());
		c.sign="+";
		c.tf.setText(c.tf.getText()+"+");
		
	}
}

class Monitorjian implements ActionListener{
	Calculator c;
	public Monitorjian(Calculator c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		c.num1=Integer.parseInt(c.tf.getText());
		c.sign="-";
		c.tf.setText(c.tf.getText()+"-");
	}
}

class Monitorcheng implements ActionListener{
	Calculator c;
	public Monitorcheng(Calculator c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		c.num1=Integer.parseInt(c.tf.getText());
		c.sign="x";
		c.tf.setText(c.tf.getText()+"x");
	}
}

class Monitorchu implements ActionListener{
	Calculator c;
	public Monitorchu(Calculator c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		c.num1=Integer.parseInt(c.tf.getText());
		c.sign="/";
		c.tf.setText(c.tf.getText()+"/");
	}
}

class Monitordeng implements ActionListener{
	Calculator c;
	public Monitordeng(Calculator c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		c.symbol=1;
		if(c.sign=="+"||c.sign=="-"){
		String[] str=c.tf.getText().split("\\"+c.sign);
		c.num2=Integer.parseInt(str[1]);
		}else if(c.sign=="x"||c.sign=="/"){
			String[] str=c.tf.getText().split(c.sign);
			c.num2=Integer.parseInt(str[1]);
		}
		
		int sum=0;
		
		if(c.sign.equals("+")){
			
		 sum=c.num1+c.num2;
		}else if(c.sign.equals("-")){
		 sum=c.num1-c.num2;
		}else if(c.sign.equals("x")){
		 sum=c.num1*c.num2; 
		}else if(c.sign.equals("/")){
		 sum=c.num1/c.num2; 
		}
		
		c.tf.setText(c.tf.getText()+"="+sum);
	}
}

class MyWindowMonitor extends WindowAdapter{ 
	Calculator c;
	public  MyWindowMonitor(Calculator c){
		this.c=c;
	}
	public void windowClosing(WindowEvent e){
		c.setVisible(false);
		System.exit(0);
	}
}





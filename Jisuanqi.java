package CCF_CSP;

import javax.swing.*;

import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Expression;


public class Jisuanqi {

	public static void main(String[] args) {
		
		new Myframe();
	}

}
class Myframe extends JFrame implements ActionListener
{
	int i=0;
	String lookAndFeel = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
	double E=2.718281828459;
	double π=3.1415926;
	String[] s=new String[]{"","Backspace","CE","C","   MC  ","7","8","9","/","√","MR","4","5","6","*",
			"%","MS","1","2","3","-","1/x","M+","0","+/-",".","+","=",
			"sin","cos","tan","x^2","x^3","x^y","n!","3√x","y√x","log",
			"10^x","ln","e^x","π","±","16(H)","10(D)","8(O)","2(B)","sinh","cosh","tanh","Int","sum"};	//字符串数组//		

	JTextField txt1=new JTextField("",18);
	JTextField txt2=new JTextField("",18);
	JLabel lab1=new JLabel("运算框",JLabel.CENTER);
	JLabel lab2=new JLabel("结果框",JLabel.CENTER);
	JPanel p1=new JPanel(new GridLayout(2,0));							//创建面板p1,布局为1行0列网格布局//
	JPanel p2=new JPanel(new GridLayout(1,4));							//创建面板p2,布局为1行4列网格布局//
	JPanel p3=new JPanel(new GridLayout(8,6));							//创建面板p3,布局为4行6列网格布局//
	String path = "D://Background.jpg";  				//背景图片// 
    ImageIcon Imagebackground = new ImageIcon(path);  	//把背景图片显示在一个标签里面//  
    JLabel Imagelabel = new JLabel(Imagebackground); 	//把内容窗格转化为JPanel，否则不能用方法setOpaque()来使内容窗格透明//   
    JPanel imagePanel = (JPanel) this.getContentPane();  
	JButton[] but=new JButton[52];		//创建按钮数组//
	{
	for(i=0;i<52;i++)				//将字符串数组s的内容一一作为按钮数组的名字//
	{									//---------//
	but[i]=new JButton(s[i]);			//---------//	//数组下标从0开始//
	}									//---------//
	}									//---------//
	JMenuBar jmb=new JMenuBar();
	JMenu jm1=new JMenu("文件");
	JMenu jm2=new JMenu("查看");
	JMenu jm3=new JMenu("帮助");
	JMenuItem jmm1=new JMenuItem("退出");
	JMenuItem jmm2=new JMenuItem("关于计算器");
	JMenuItem jmm3=new JMenuItem("源代码");
	public Myframe()
	{
		try {
			UIManager.setLookAndFeel(lookAndFeel);
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}		
	this.setTitle("计算器");			//设置窗体标题为   计算器  //
	this.setSize(414,360);			//设置窗体的大小(单位为像素)//
	Imagelabel.setBounds(0, 0, this.getWidth(), this.getHeight());  //把标签的大小位置设置为图片刚好填充整个面板 //
	imagePanel.setOpaque(false);  									//把背景图片添加到分层窗格的最底层作为背景 //
    this.getLayeredPane().add(Imagelabel, new Integer(Integer.MIN_VALUE)); 
	Add();
	Set();
	for(i=0;i<52;i++)
	{
	but[i].addActionListener(this); 	//为所有按钮添加事件响应//
	}
	txt2.setEditable(false);
	jmm1.addActionListener(this);
	jmm2.addActionListener(this);
	jmm3.addActionListener(this);
	this.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));			//设置该窗体的布局//
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//设置该窗体三按钮的作用//
	this.setLocationRelativeTo(null);								//设置该窗体位于屏幕的位置为居中//
	this.setVisible(true);											//设置窗体可见性为真//
	}
	@Override
	public void actionPerformed(ActionEvent e) {					//事件响应//
		String save;
		if(e.getSource()==but[1])								//如果触发按钮but[1],计算器退格事件//
		{
			String s1=txt1.getText();
			String s2 ="";											//定义一个“”字符串//									//将s1的长度赋给sl//
			System.out.println(""+s1.length());						//检验字符串长度是否正确//
			for(i=0;i<s1.length()-1;i++)						//总长度-1==退格//		
			{
				s2=s2+s1.charAt(i);									//依次获取s1-1的每一位//													//依次加到s2上//
			}
			txt1.setText(s2);
		}
		else if(e.getSource()==but[2])							//如果触发按钮but[3],计算器全部清零事件//
		{
			String s1=txt1.getText();
			s1=null;					
			txt1.setText(s1);
		}
		else if(e.getSource()==but[3])									//如果触发按钮but[3],计算器输入清零事件//
		{
			String s1=txt1.getText();								//将txt1的内容赋给s3//
			String s2=txt2.getText();
			s2=null;
			s1=null;												//将null赋给s3,起到计算器清零的作用//
			txt1.setText(s1);										//将s3的内容显示在txt1上//
			txt2.setText(s2);
		}	
		else if(e.getSource()==but[4])								//存储器清空
		{
			save="";
		System.out.println("存储器内容:"+save);
		}
		else if(e.getSource()==but[5])
		{
		String s1=txt1.getText();	
		s1=s1+"7";								//添加7
		txt1.setText(s1);
		}
		else if(e.getSource()==but[6])
		{
		String s1=txt1.getText();	
		s1=s1+"8";								//添加8
		txt1.setText(s1);
		}
		else if(e.getSource()==but[7])
		{
		String s1=txt1.getText();	
		s1=s1+"9";								//添加9
		txt1.setText(s1);
		}
		else if(e.getSource()==but[8])
		{
		String s1=txt1.getText();	
		s1=s1+"/";								//添加/
		txt1.setText(s1);
		}
		else if(e.getSource()==but[9])
		{
		String s1=txt1.getText();	
		s1="√"+s1;								//添加√
		txt1.setText(s1);
		}
		else if(e.getSource()==but[10])
		{
			txt1.setText(txt2.getText());
		}
		else if(e.getSource()==but[11])
		{
		String s1=txt1.getText();	
		s1=s1+"4";								//添加4
		txt1.setText(s1);
		}
		else if(e.getSource()==but[12])
		{
		String s1=txt1.getText();	
		s1=s1+"5";								//添加5
		txt1.setText(s1);
		}
		else if(e.getSource()==but[13])
		{
		String s1=txt1.getText();	
		s1=s1+"6";								//添加6
		txt1.setText(s1);
		}
		else if(e.getSource()==but[14])
		{
		String s1=txt1.getText();	
		s1=s1+"*";								//添加*
		txt1.setText(s1);
		}
		else if(e.getSource()==but[15])
		{
		String s1=txt1.getText();
		s1=s1+"%";								//添加%
		txt1.setText(s1);
		}
		else if(e.getSource()==but[16])
		{
			save=txt2.getText();
			System.out.println("存储器内容:"+save);		//完成MS
		}
		else if(e.getSource()==but[10])			
		{
		}										//完成MR
		else if(e.getSource()==but[17])			
		{
		String s1=txt1.getText();	
		s1=s1+"1";								//添加1
		txt1.setText(s1);
		}
		else if(e.getSource()==but[18])
		{
		String s1=txt1.getText();	
		s1=s1+"2";								//添加2
		txt1.setText(s1);
		}
		else if(e.getSource()==but[19])
		{
		String s1=txt1.getText();	
		s1=s1+"3";								//添加3
		txt1.setText(s1);
		}
		else if(e.getSource()==but[20])
		{
		String s1=txt1.getText();	
		s1=s1+"-";								//添加-
		txt1.setText(s1);
		}
		else if(e.getSource()==but[21])
		{
		String s1=txt1.getText();
		double number1=Double.parseDouble(s1);
		number1=number1/(number1*number1);		//倒数运算的部分
		txt1.setText("1/"+s1);
		txt2.setText(""+number1);
		}
		else if(e.getSource()==but[22])			//完成M+
		{
			save="";
			save=save+txt2.getText()+"+";
			txt1.setText(save);
			System.out.println("存储器内容:"+save);
		}
		else if(e.getSource()==but[23])
		{
		String s1=txt1.getText();	
		s1=s1+"0";						//添加0
		txt1.setText(s1);
		}
		else if(e.getSource()==but[25])
		{
		String s1=txt1.getText();	
		if(s1=="")
		{
		s1="0."+s1;						//添加0.
		txt1.setText(s1);
		}
		else if(txt1.getText()!="")
		{
		s1=s1+".";						//添加.
		txt1.setText(s1);
		}
		}
		else if(e.getSource()==but[26])
		{
		String s1=txt1.getText();	
		s1=s1+"+";						//添加+
		txt1.setText(s1);
		}
		
		
		
		else if(e.getSource()==but[27])
		{
		String s1=txt1.getText();
		String s2="";
		String s3="";
		double result;
		int place;
		for(i=0;i<s1.length();i++)
		{
		place=i;
		if(i!=0 && s1.charAt(i)=='+')	//正数加正数、正数加负数的计算部分
		{
		for(i=0;i<place;i++)
		{
		s2=s2+s1.charAt(i);	
		}
		for(i=place+1;i<s1.length();i++)
		{
		s3=s3+s1.charAt(i);
		}
		double number1=Double.parseDouble(s2);
		double number2=Double.parseDouble(s3);
		result =number1+number2;
		txt2.setText(""+result);
		}
		else if(s1.charAt(0)!='-' && s1.charAt(i)=='-')		//做正数减正数、正数减负数的计算部分
		{
			place=i;
			for(i=0;i<place;i++)
			{
			s2=s2+s1.charAt(i);	
			}
			for(i=place+1;i<s1.length();i++)
			{
			s3=s3+s1.charAt(i);
			}
			double number1=Double.parseDouble(s2);
			double number2=Double.parseDouble(s3);
			result =number1-number2;
			txt2.setText(""+result);
			}
		else if(s1.charAt(0)=='-')
		{
			for(i=1;i<s1.length()-1;i++)
			{
				if(s1.charAt(i)=='+')		//做负数加负数、负数加正数的计算部分
				{
				place=i;
				for(i=0;i<place;i++)
				{
				s2=s2+s1.charAt(i);	
				}
				for(i=place+1;i<s1.length();i++)
				{
				s3=s3+s1.charAt(i);
				}
				double number1=Double.parseDouble(s2);
				double number2=Double.parseDouble(s3);
				result =number1+number2;
				txt2.setText(""+result);
				}
				else if(s1.charAt(i)=='-')		//做负数减负数，负数减正数的计算部分
				{
					place=i;
					for(i=0;i<place;i++)
					{
					s2=s2+s1.charAt(i);	
					}
					for(i=place+1;i<s1.length();i++)
					{
					s3=s3+s1.charAt(i);
					}
					double number1=Double.parseDouble(s2);
					double number2=Double.parseDouble(s3);
					result =number1-number2;
					txt2.setText(""+result);
				}
				else if(s1.charAt(i)=='*')		//做负数乘正数、负数乘负数的计算部分
				{
					place=i;
					for(i=0;i<place;i++)
					{
					s2=s2+s1.charAt(i);	
					}
					for(i=place+1;i<s1.length();i++)
					{
					s3=s3+s1.charAt(i);
					}
					double number1=Double.parseDouble(s2);
					double number2=Double.parseDouble(s3);
					result =number1*number2;
					txt2.setText(""+result);
				}
				else if(s1.charAt(i)=='/')			//做负数除正数、负数除负数的计算部分
				{
					place=i;
					for(i=0;i<place;i++)
					{
					s2=s2+s1.charAt(i);	
					}
					for(i=place+1;i<s1.length();i++)
					{
					s3=s3+s1.charAt(i);
					}
					double number1=Double.parseDouble(s2);
					double number2=Double.parseDouble(s3);
					result =number1/number2;
					txt2.setText(""+result);
				}
				else if(s1.charAt(i)=='^')			//做负数开正方、负数开负方的计算部分
				{
					place=i;
					for(i=0;i<place;i++)
					{
					s2=s2+s1.charAt(i);	
					}
					for(i=place+1;i<s1.length();i++)
					{
					s3=s3+s1.charAt(i);
					}
					double number1=Double.parseDouble(s2);
					double number2=Double.parseDouble(s3);
					result =Math.pow(number1, number2);
					if(number2>=0)
					txt2.setText(""+result);
					else if(number2<0)
					{
						txt2.setText("-"+result);
					}
				}
			}
			
			}
		else if(s1.charAt(i)=='*')		//做正数乘正数、正数乘负数的计算部分
		{
			place=i;
			for(i=0;i<place;i++)
			{
			s2=s2+s1.charAt(i);	
			}
			for(i=place+1;i<s1.length();i++)
			{
			s3=s3+s1.charAt(i);
			}
			double number1=Double.parseDouble(s2);
			double number2=Double.parseDouble(s3);
			result =number1*number2;
			txt2.setText(""+result);
			}
		
		else if(s1.charAt(i)=='/')		//做正数除正数、正数除负数的计算部分
		{
			place=i;
			for(i=0;i<place;i++)
			{
			s2=s2+s1.charAt(i);	
			}
			for(i=place+1;i<s1.length();i++)
			{
			s3=s3+s1.charAt(i);
			}
			double number1=Double.parseDouble(s2);
			double number2=Double.parseDouble(s3);
			result =number1/number2;
			txt2.setText(""+result);
			}
		
		else if(s1.charAt(i)=='√')			//做开方运算的部分
		{
			place=i;
			if(s1.charAt(0)!='√' && s1.charAt(i)!='-')
			{
				for(i=0;i<place;i++)
				{
					s2=s2+s1.charAt(i);
				}
				for(i=place+1;i<s1.length();i++)
				{
					s3=s3+s1.charAt(i);
				}
				double number1=Double.parseDouble(s2);
				double number2=Double.parseDouble(s3);
				result =Math.pow(number2,(1.0/number1));		//开方运算的库函数Math.pow(double x);
					txt2.setText(""+result);	
			}
			else if(s1.charAt(0)=='√')
			{
			for(i=place+1;i<s1.length();i++)
			{
			s3=s3+s1.charAt(i);
			}
			double number2=Double.parseDouble(s3);
			result =Math.sqrt(number2);		//开方运算的库函数Math.sqrt(double x);
			txt2.setText(""+result);	
			}
			else if(s1.charAt(i)=='-')
			{
				txt2.setText("无效输入");
			}
		}
		else if(s1.charAt(i)=='√' && i!=0)
		{
			place=i;
			for(i=0;i<place;i++)
			{
				s2=s2+s1.charAt(i);
			}
			for(i=place+1;i<s1.length();i++)
			{
				s3=s3+s1.charAt(i);
			}
			double number1=Double.parseDouble(s2);
			double number2=Double.parseDouble(s3);
			System.out.println(""+number1+number2);
			result =Math.pow(number2,(1.0/number1));		//开方运算的库函数Math.pow(double x);
				txt2.setText(""+result);	
		}
		else if(s1.charAt(i)=='n')			//找到sin位置
		{
			place=i;
			for(i=place+1;i<s1.length();i++)
			{	
			s2=s2+s1.charAt(i);      //将n后的数字相加赋给s1
			}
			txt1.setText(s1+"°");
			int a=Integer.parseInt(s2);   //将字符串强制转换成整形
			txt2.setText(""+Math.sin(Math.toRadians(a)));	//sin运算的库函数Math.sin(int x);
															//转换角度的库函数Math.toRadians(int x);
		}	
		  else if(s1.charAt(i)=='o')  //找到cos位置
		{
			place=i;
			for(i=place+2;i<s1.length();i++)
			{
				s2=s2+s1.charAt(i);
			}
			txt1.setText(s1+"°");
			int b=Integer.parseInt(s2);
			txt2.setText(""+Math.cos(Math.toRadians(b)));	//cos运算的库函数Math.cos(int x);
		}
		  else if(s1.charAt(i)=='a')  //找到tan位置
		  {
			  place=i;
			  for(i=place+2;i<s1.length();i++)
			  {
				  s2=s2+s1.charAt(i);
			  }
			  txt1.setText(s1+"°");
			  double  c=Double.parseDouble(s2);
			  txt2.setText(""+Math.tan(Math.toRadians(c)));	//tan运算的库函数Math.tan(int x);
		  }
		  else if(s1.charAt(0)=='^')				//判断是否第一个字符是^
			{
				txt2.setText("无效输入");
			}
		  else if(i!=0 && s1.charAt(i)=='^')		//判断是否有^
		  	{
			place=i;
			for(i=place-1;i<place;i++)
			{
				s2=s2+s1.charAt(i);
			}
			for(i=place+1;i<s1.length();i++)
			{
				s3=s3+s1.charAt(i);
			}
			double number1=Double.parseDouble(s2);
			double number2=Double.parseDouble(s3);
			txt2.setText(""+Math.pow(number1, number2));	//做x的y次方的库函数Math.pow(double a,double b);
		}
		  else if(s1.charAt(0)=='.')
		  {
			  txt2.setText("无效输入");
		  }
		  else if(s1.charAt(0)=='%')
		  {
			  txt2.setText("无效输入");
		  }
		  else if(i!=0 && s1.charAt(i)=='%')			//判断是否有%
			{
				place=i;
				for(i=0;i<place;i++)
				{
					s2=s2+s1.charAt(i);
				}
				for(i=place+1;i<s1.length();i++)
				{
					s3=s3+s1.charAt(i);
				}
				double number1=Double.parseDouble(s2);
				double number2=Double.parseDouble(s3);
				txt2.setText(""+(number1%number2));			//求余运算
			}
		
	}
	
}
		else if(e.getSource()==but[28])
		{
			String s1=txt1.getText();	
			s1="sin"+s1;				//添加sin
			txt1.setText(s1);
		}
		else if(e.getSource()==but[29])
		{
			String s1=txt1.getText();	
			s1="cos"+s1;				//添加cos
			txt1.setText(s1);
		}
		else if(e.getSource()==but[30])
		{
			String s1=txt1.getText();	
			s1="tan"+s1;				//添加tan
			txt1.setText(s1);
		}
		else if(e.getSource()==but[31])
		{
			String s1=txt1.getText();
			double number1=Double.parseDouble(s1);
			s1=s1+"^2";
			txt1.setText(s1);
			number1=number1*number1;
			txt2.setText(""+number1);					//做平方运算的部分
		}
		else if(e.getSource()==but[32])
		{
			String s1=txt1.getText();	
			double number2=Double.parseDouble(s1);
			s1=s1+"^3";
			txt2.setText(""+Math.pow(number2,3));		//做三次方运算的部分
		}
		else if(e.getSource()==but[33])
		{
			String s1=txt1.getText();		//添加^
			s1=s1+'^';
			txt1.setText(s1);

		}
		else if(e.getSource()==but[34])
		{
			String s1=txt1.getText();	
			String s2="";
			int number1=Integer.parseInt(s1);
			for(i=number1;i>0;i--)
			{
			s2=s2+"*"+i;	
			}
			for(i=number1-1;i>0;i--)				//做阶乘运算的部分
			{
			number1*=i;
			}
			txt1.setText(s2);
			txt2.setText(""+number1);
		}
		else if(e.getSource()==but[35])
		{
			String s1=txt1.getText();	
			double number1=Double.parseDouble(s1);
			txt2.setText(""+Math.pow(number1, 1.0/3));			//做立方根运算的部分
		}
		else if(e.getSource()==but[36])
		{
			String s1=txt1.getText();
			s1=s1+'√';
			txt1.setText(s1);
		}
		
		
		else if(e.getSource()==but[37])
		{
			String s1=txt1.getText();	
			double number1=Double.parseDouble(s1);
			s1="log"+s1;
			txt1.setText(s1);
			txt2.setText(""+Math.log(number1));					//做log运算的部分
		}
		else if(e.getSource()==but[38])
		{
			String s1=txt1.getText();	
			double number1=Double.parseDouble(s1);
			s1="10^"+s1;
			txt1.setText(s1);
			txt2.setText(""+Math.pow(10, number1));				//做10的X次方运算的部分
		}
		else if(e.getSource()==but[39])
		{
			String s1=txt1.getText();	
			double number1=Double.parseDouble(s1);
			s1="ln"+s1;
			txt1.setText(s1);
			txt2.setText(""+Math.abs(Math.log(1.0/number1)));	//做ln运算的部分
		}
		else if(e.getSource()==but[40])
		{
			String s1=txt1.getText();
			double number1=Double.parseDouble(s1);
			s1="e^"+s1;
			txt1.setText(s1);
			txt2.setText(""+Math.pow(E, number1));		//做e的x次方运算的部分
		}
		else if(e.getSource()==but[41])
		{
			String s1="";
			s1=s1+"π";
			txt1.setText(s1);
			txt2.setText(""+π);					//显示π的值
		}
		else if(e.getSource()==but[42])
		{
			
			String s1=txt1.getText();
			double number1=Double.parseDouble(s1);
			number1=number1*(-1);
			s1=s1+"*-1";
			txt1.setText(s1);
			txt2.setText(""+number1);						//做相反数运算的部分
		}
		else if(e.getSource()==but[43])
		{
			
			String s1=txt1.getText();
			int number1=Integer.parseInt(s1);
			txt2.setText(""+Integer.toHexString(number1));		//做转换为16进制数的库函数Integer.toHexString(int x);
		}
		else if(e.getSource()==but[44])
		{
			
			String s1=txt1.getText();
			int number1=Integer.parseInt(s1);
			txt2.setText(""+Integer.valueOf(number1));			//做转换为10进制数的库函数Integer.valueOf(int x);
		}
		else if(e.getSource()==but[45])
		{
			
			String s1=txt1.getText();
			int number1=Integer.parseInt(s1);
			txt2.setText(""+Integer.toOctalString(number1));	//做转换为8进制数的库函数Integer.toOctalString(int x);
		}
		else if(e.getSource()==but[46])
		{
			
			String s1=txt1.getText();
			int number1=Integer.parseInt(s1);
			txt2.setText(""+Integer.toBinaryString(number1));	//做转换为2进制数的库函数Integer.toBinaryString(int x);		
		}
		else if(e.getSource()==but[47])
		{
			String s1=txt1.getText();
			double number1=Integer.parseInt(s1);
			s1="(e*"+s1+"-e*(-1*"+s1+"))/2";
			txt1.setText(s1);
			txt2.setText(""+ (Math.pow(E, number1)-Math.pow(E, -1*number1))/2);		//做双曲正弦运算的部分
		}
		else if(e.getSource()==but[48])
		{
			String s1=txt1.getText();
			double number1=Integer.parseInt(s1);
			s1="(e*"+s1+"+e*(-1*"+s1+"))/2";
			txt1.setText(s1);
			txt2.setText(""+ (Math.pow(E, number1)+Math.pow(E, -1*number1))/2);		//做双曲余弦运算的部分
		}
		else if(e.getSource()==but[49])
		{
			String s1=txt1.getText();
			double number1=Integer.parseInt(s1);
			s1="((e*"+s1+ "-e*(-1*" +s1+ "))/2)" +"/"+"((e*"+s1+"+e*(-1*"+s1+"))/2)";
			txt1.setText(s1);
			txt2.setText(""+ ((Math.pow(E, number1)-Math.pow(E, -1*number1))/2)
					/((Math.pow(E, number1)+Math.pow(E, -1*number1))/2));		//做双曲正切运算的部分
		}
		else if(e.getSource()==but[50])			//做求整运算的部分
		{
			int place;
			String s1=txt1.getText();
			String s2="";
			for(i=0;i<s1.length()-1;i++)
			{
			if(s1.charAt(i)=='.')				//判断小数点的位置
			{
			place=i;
			for(i=0;i<place;i++)
			{
			s2=s2+s1.charAt(i);					//取小数点之前的内容
			}
			int number1=Integer.parseInt(s2);
			txt2.setText(""+number1);
			}
			}
		}
		else if(e.getSource()==but[51])			//做累加运算的部分
		{
		String s1=txt1.getText();
		String s2="";
		int number1=Integer.parseInt(s1);
		int begin=number1;						//做累加运算的起始值
		for(i=number1;i>0;i--)
		{
		s2=s2+"+"+i;
		}
		for(i=number1-1;i>0;i--)
		{
		number1+=i;								//累加运算
		}
		txt1.setText(s2);
		txt2.setText(""+number1);
		}
		else if(e.getSource()==jmm1)
		{
			System.exit(0); 
		}
		else if(e.getSource()==jmm2)
		{
			JFrame help=new JFrame("关于计算器");
			help.setSize(660,280);
			help.setLayout(new FlowLayout(FlowLayout.LEADING,0,0));
			String path = "D://Background.jpg";  				//背景图片// 
		    ImageIcon Imagebackground = new ImageIcon(path);  	//把背景图片显示在一个标签里面//  
		    JLabel Imagelabel = new JLabel(Imagebackground); 	//把内容窗格转化为JPanel，否则不能用方法setOpaque()来使内容窗格透明//   
		    JPanel imagePanel = (JPanel) help.getContentPane();  
		    Imagelabel.setBounds(0, 0, help.getWidth(), help.getHeight());  //把标签的大小位置设置为图片刚好填充整个面板 //
			imagePanel.setOpaque(false);  									//把背景图片添加到分层窗格的最底层作为背景 //
		    help.getLayeredPane().add(Imagelabel, new Integer(Integer.MIN_VALUE)); 
			JLabel h1=new JLabel("该计算机由王基书和程仿仿编写,是一个多功能的科学计算器,功能齐全,可以进行两个数之间的加减乘除和各类运算");
			JLabel h2=new JLabel("编写时间：2016年12月27日");
			JLabel h3=new JLabel("编写地点：昆明学院惟实楼3402-2");
			help.add(h1);
			help.add(h2);
			help.add(h3);
			help.setLocationRelativeTo(null);		
			help.setVisible(true);
		}
		else if(e.getSource()==jmm3)
		{
			if (!Desktop.isDesktopSupported())
		    {
		           System.err.println("Desktop not supported!");
		           System.exit(-1);
		    }
		    else
		    {
		      try{
		            Desktop desktop = Desktop.getDesktop();
		            File f=new File("Jisuanqi.txt");
		            desktop.open(f);
		         }
		      catch(Exception e1){System.out.println(e1.getMessage());}
		    }
		}
		}

private char charat(int j) {
		// TODO 自动生成的方法存根
		return 0;
	}
public void Set()
{
	for(i=1;i<4;i++)
	{
		but[i].setForeground(Color.red);			//修改字体颜色			
		but[i].setFont(new Font("黑体", ABORT, 15));	//修改字体大小和类型		
	}
	for(i=4;i<10;i+=5)
	{
		but[i].setForeground(Color.red);
	}
	for(i=10;i<16;i+=5)
	{
		but[i].setForeground(Color.red);
	}
	for(i=16;i<22;i+=5)
	{
		but[i].setForeground(Color.red);
	}
	for(i=22;i<28;i+=5)
	{
		but[i].setForeground(Color.red);
	}
	for(i=8;i<27;i+=6)				//使用for循环修改运算符的属性
	{
	but[i].setForeground(Color.red);				
	but[i].setFont(new Font("黑体", ABORT, 15));		
	}
	for(i=5;i<8;i++)
	{
		but[i].setForeground(Color.BLUE);
	}
	for(i=11;i<14;i++)
	{
		but[i].setForeground(Color.BLUE);
	}
	for(i=17;i<20;i++)
	{
		but[i].setForeground(Color.BLUE);
	}
	for(i=23;i<26;i++)
	{
		but[i].setForeground(Color.BLUE);
	}	
	for(i=28;i<52;i++)
	{
		but[i].setForeground(Color.BLACK);	
	}
}
public void Add()
{
	this.add(jmb);					//在 窗体中添加菜单行//
	jmb.add(jm1);					//在菜单行中添加菜单栏//
	jmb.add(jm2);					//-------------//
	jmb.add(jm3);					//-------------//
	jm1.add(jmm1);					//在菜单栏中添加菜单项//
	jm3.add(jmm2);
	jm2.add(jmm3);
	this.add(p1);
	p1.add(lab1);
	p1.add(txt1);
	p1.add(lab2);
	p1.add(txt2);
	//txt2.setEditable(false);		//将txt2设置为不可以编辑文本//
	this.add(p2);
	p2.add(but[0]);					//面板p2添加按钮//
	p2.add(but[1]);					//----------//
	p2.add(but[2]);					//----------//
	p2.add(but[3]);					//----------//
	this.add(p3);
	for(i=4;i<52;i++)			//使用for循环在面板p3中添加按钮数组but[i]//
	{								//----------------------------//
	p3.add(but[i]);					//----------------------------//
	}								//----------------------------//
	}
	}


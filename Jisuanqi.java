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
	double ��=3.1415926;
	String[] s=new String[]{"","Backspace","CE","C","   MC  ","7","8","9","/","��","MR","4","5","6","*",
			"%","MS","1","2","3","-","1/x","M+","0","+/-",".","+","=",
			"sin","cos","tan","x^2","x^3","x^y","n!","3��x","y��x","log",
			"10^x","ln","e^x","��","��","16(H)","10(D)","8(O)","2(B)","sinh","cosh","tanh","Int","sum"};	//�ַ�������//		

	JTextField txt1=new JTextField("",18);
	JTextField txt2=new JTextField("",18);
	JLabel lab1=new JLabel("�����",JLabel.CENTER);
	JLabel lab2=new JLabel("�����",JLabel.CENTER);
	JPanel p1=new JPanel(new GridLayout(2,0));							//�������p1,����Ϊ1��0�����񲼾�//
	JPanel p2=new JPanel(new GridLayout(1,4));							//�������p2,����Ϊ1��4�����񲼾�//
	JPanel p3=new JPanel(new GridLayout(8,6));							//�������p3,����Ϊ4��6�����񲼾�//
	String path = "D://Background.jpg";  				//����ͼƬ// 
    ImageIcon Imagebackground = new ImageIcon(path);  	//�ѱ���ͼƬ��ʾ��һ����ǩ����//  
    JLabel Imagelabel = new JLabel(Imagebackground); 	//�����ݴ���ת��ΪJPanel���������÷���setOpaque()��ʹ���ݴ���͸��//   
    JPanel imagePanel = (JPanel) this.getContentPane();  
	JButton[] but=new JButton[52];		//������ť����//
	{
	for(i=0;i<52;i++)				//���ַ�������s������һһ��Ϊ��ť���������//
	{									//---------//
	but[i]=new JButton(s[i]);			//---------//	//�����±��0��ʼ//
	}									//---------//
	}									//---------//
	JMenuBar jmb=new JMenuBar();
	JMenu jm1=new JMenu("�ļ�");
	JMenu jm2=new JMenu("�鿴");
	JMenu jm3=new JMenu("����");
	JMenuItem jmm1=new JMenuItem("�˳�");
	JMenuItem jmm2=new JMenuItem("���ڼ�����");
	JMenuItem jmm3=new JMenuItem("Դ����");
	public Myframe()
	{
		try {
			UIManager.setLookAndFeel(lookAndFeel);
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}		
	this.setTitle("������");			//���ô������Ϊ   ������  //
	this.setSize(414,360);			//���ô���Ĵ�С(��λΪ����)//
	Imagelabel.setBounds(0, 0, this.getWidth(), this.getHeight());  //�ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ����������� //
	imagePanel.setOpaque(false);  									//�ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ���� //
    this.getLayeredPane().add(Imagelabel, new Integer(Integer.MIN_VALUE)); 
	Add();
	Set();
	for(i=0;i<52;i++)
	{
	but[i].addActionListener(this); 	//Ϊ���а�ť����¼���Ӧ//
	}
	txt2.setEditable(false);
	jmm1.addActionListener(this);
	jmm2.addActionListener(this);
	jmm3.addActionListener(this);
	this.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));			//���øô���Ĳ���//
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//���øô�������ť������//
	this.setLocationRelativeTo(null);								//���øô���λ����Ļ��λ��Ϊ����//
	this.setVisible(true);											//���ô���ɼ���Ϊ��//
	}
	@Override
	public void actionPerformed(ActionEvent e) {					//�¼���Ӧ//
		String save;
		if(e.getSource()==but[1])								//���������ťbut[1],�������˸��¼�//
		{
			String s1=txt1.getText();
			String s2 ="";											//����һ�������ַ���//									//��s1�ĳ��ȸ���sl//
			System.out.println(""+s1.length());						//�����ַ��������Ƿ���ȷ//
			for(i=0;i<s1.length()-1;i++)						//�ܳ���-1==�˸�//		
			{
				s2=s2+s1.charAt(i);									//���λ�ȡs1-1��ÿһλ//													//���μӵ�s2��//
			}
			txt1.setText(s2);
		}
		else if(e.getSource()==but[2])							//���������ťbut[3],������ȫ�������¼�//
		{
			String s1=txt1.getText();
			s1=null;					
			txt1.setText(s1);
		}
		else if(e.getSource()==but[3])									//���������ťbut[3],���������������¼�//
		{
			String s1=txt1.getText();								//��txt1�����ݸ���s3//
			String s2=txt2.getText();
			s2=null;
			s1=null;												//��null����s3,�𵽼��������������//
			txt1.setText(s1);										//��s3��������ʾ��txt1��//
			txt2.setText(s2);
		}	
		else if(e.getSource()==but[4])								//�洢�����
		{
			save="";
		System.out.println("�洢������:"+save);
		}
		else if(e.getSource()==but[5])
		{
		String s1=txt1.getText();	
		s1=s1+"7";								//���7
		txt1.setText(s1);
		}
		else if(e.getSource()==but[6])
		{
		String s1=txt1.getText();	
		s1=s1+"8";								//���8
		txt1.setText(s1);
		}
		else if(e.getSource()==but[7])
		{
		String s1=txt1.getText();	
		s1=s1+"9";								//���9
		txt1.setText(s1);
		}
		else if(e.getSource()==but[8])
		{
		String s1=txt1.getText();	
		s1=s1+"/";								//���/
		txt1.setText(s1);
		}
		else if(e.getSource()==but[9])
		{
		String s1=txt1.getText();	
		s1="��"+s1;								//��ӡ�
		txt1.setText(s1);
		}
		else if(e.getSource()==but[10])
		{
			txt1.setText(txt2.getText());
		}
		else if(e.getSource()==but[11])
		{
		String s1=txt1.getText();	
		s1=s1+"4";								//���4
		txt1.setText(s1);
		}
		else if(e.getSource()==but[12])
		{
		String s1=txt1.getText();	
		s1=s1+"5";								//���5
		txt1.setText(s1);
		}
		else if(e.getSource()==but[13])
		{
		String s1=txt1.getText();	
		s1=s1+"6";								//���6
		txt1.setText(s1);
		}
		else if(e.getSource()==but[14])
		{
		String s1=txt1.getText();	
		s1=s1+"*";								//���*
		txt1.setText(s1);
		}
		else if(e.getSource()==but[15])
		{
		String s1=txt1.getText();
		s1=s1+"%";								//���%
		txt1.setText(s1);
		}
		else if(e.getSource()==but[16])
		{
			save=txt2.getText();
			System.out.println("�洢������:"+save);		//���MS
		}
		else if(e.getSource()==but[10])			
		{
		}										//���MR
		else if(e.getSource()==but[17])			
		{
		String s1=txt1.getText();	
		s1=s1+"1";								//���1
		txt1.setText(s1);
		}
		else if(e.getSource()==but[18])
		{
		String s1=txt1.getText();	
		s1=s1+"2";								//���2
		txt1.setText(s1);
		}
		else if(e.getSource()==but[19])
		{
		String s1=txt1.getText();	
		s1=s1+"3";								//���3
		txt1.setText(s1);
		}
		else if(e.getSource()==but[20])
		{
		String s1=txt1.getText();	
		s1=s1+"-";								//���-
		txt1.setText(s1);
		}
		else if(e.getSource()==but[21])
		{
		String s1=txt1.getText();
		double number1=Double.parseDouble(s1);
		number1=number1/(number1*number1);		//��������Ĳ���
		txt1.setText("1/"+s1);
		txt2.setText(""+number1);
		}
		else if(e.getSource()==but[22])			//���M+
		{
			save="";
			save=save+txt2.getText()+"+";
			txt1.setText(save);
			System.out.println("�洢������:"+save);
		}
		else if(e.getSource()==but[23])
		{
		String s1=txt1.getText();	
		s1=s1+"0";						//���0
		txt1.setText(s1);
		}
		else if(e.getSource()==but[25])
		{
		String s1=txt1.getText();	
		if(s1=="")
		{
		s1="0."+s1;						//���0.
		txt1.setText(s1);
		}
		else if(txt1.getText()!="")
		{
		s1=s1+".";						//���.
		txt1.setText(s1);
		}
		}
		else if(e.getSource()==but[26])
		{
		String s1=txt1.getText();	
		s1=s1+"+";						//���+
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
		if(i!=0 && s1.charAt(i)=='+')	//�����������������Ӹ����ļ��㲿��
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
		else if(s1.charAt(0)!='-' && s1.charAt(i)=='-')		//�������������������������ļ��㲿��
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
				if(s1.charAt(i)=='+')		//�������Ӹ����������������ļ��㲿��
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
				else if(s1.charAt(i)=='-')		//�������������������������ļ��㲿��
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
				else if(s1.charAt(i)=='*')		//�������������������˸����ļ��㲿��
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
				else if(s1.charAt(i)=='/')			//�������������������������ļ��㲿��
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
				else if(s1.charAt(i)=='^')			//�������������������������ļ��㲿��
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
		else if(s1.charAt(i)=='*')		//�������������������˸����ļ��㲿��
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
		
		else if(s1.charAt(i)=='/')		//�������������������������ļ��㲿��
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
		
		else if(s1.charAt(i)=='��')			//����������Ĳ���
		{
			place=i;
			if(s1.charAt(0)!='��' && s1.charAt(i)!='-')
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
				result =Math.pow(number2,(1.0/number1));		//��������Ŀ⺯��Math.pow(double x);
					txt2.setText(""+result);	
			}
			else if(s1.charAt(0)=='��')
			{
			for(i=place+1;i<s1.length();i++)
			{
			s3=s3+s1.charAt(i);
			}
			double number2=Double.parseDouble(s3);
			result =Math.sqrt(number2);		//��������Ŀ⺯��Math.sqrt(double x);
			txt2.setText(""+result);	
			}
			else if(s1.charAt(i)=='-')
			{
				txt2.setText("��Ч����");
			}
		}
		else if(s1.charAt(i)=='��' && i!=0)
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
			result =Math.pow(number2,(1.0/number1));		//��������Ŀ⺯��Math.pow(double x);
				txt2.setText(""+result);	
		}
		else if(s1.charAt(i)=='n')			//�ҵ�sinλ��
		{
			place=i;
			for(i=place+1;i<s1.length();i++)
			{	
			s2=s2+s1.charAt(i);      //��n���������Ӹ���s1
			}
			txt1.setText(s1+"��");
			int a=Integer.parseInt(s2);   //���ַ���ǿ��ת��������
			txt2.setText(""+Math.sin(Math.toRadians(a)));	//sin����Ŀ⺯��Math.sin(int x);
															//ת���ǶȵĿ⺯��Math.toRadians(int x);
		}	
		  else if(s1.charAt(i)=='o')  //�ҵ�cosλ��
		{
			place=i;
			for(i=place+2;i<s1.length();i++)
			{
				s2=s2+s1.charAt(i);
			}
			txt1.setText(s1+"��");
			int b=Integer.parseInt(s2);
			txt2.setText(""+Math.cos(Math.toRadians(b)));	//cos����Ŀ⺯��Math.cos(int x);
		}
		  else if(s1.charAt(i)=='a')  //�ҵ�tanλ��
		  {
			  place=i;
			  for(i=place+2;i<s1.length();i++)
			  {
				  s2=s2+s1.charAt(i);
			  }
			  txt1.setText(s1+"��");
			  double  c=Double.parseDouble(s2);
			  txt2.setText(""+Math.tan(Math.toRadians(c)));	//tan����Ŀ⺯��Math.tan(int x);
		  }
		  else if(s1.charAt(0)=='^')				//�ж��Ƿ��һ���ַ���^
			{
				txt2.setText("��Ч����");
			}
		  else if(i!=0 && s1.charAt(i)=='^')		//�ж��Ƿ���^
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
			txt2.setText(""+Math.pow(number1, number2));	//��x��y�η��Ŀ⺯��Math.pow(double a,double b);
		}
		  else if(s1.charAt(0)=='.')
		  {
			  txt2.setText("��Ч����");
		  }
		  else if(s1.charAt(0)=='%')
		  {
			  txt2.setText("��Ч����");
		  }
		  else if(i!=0 && s1.charAt(i)=='%')			//�ж��Ƿ���%
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
				txt2.setText(""+(number1%number2));			//��������
			}
		
	}
	
}
		else if(e.getSource()==but[28])
		{
			String s1=txt1.getText();	
			s1="sin"+s1;				//���sin
			txt1.setText(s1);
		}
		else if(e.getSource()==but[29])
		{
			String s1=txt1.getText();	
			s1="cos"+s1;				//���cos
			txt1.setText(s1);
		}
		else if(e.getSource()==but[30])
		{
			String s1=txt1.getText();	
			s1="tan"+s1;				//���tan
			txt1.setText(s1);
		}
		else if(e.getSource()==but[31])
		{
			String s1=txt1.getText();
			double number1=Double.parseDouble(s1);
			s1=s1+"^2";
			txt1.setText(s1);
			number1=number1*number1;
			txt2.setText(""+number1);					//��ƽ������Ĳ���
		}
		else if(e.getSource()==but[32])
		{
			String s1=txt1.getText();	
			double number2=Double.parseDouble(s1);
			s1=s1+"^3";
			txt2.setText(""+Math.pow(number2,3));		//�����η�����Ĳ���
		}
		else if(e.getSource()==but[33])
		{
			String s1=txt1.getText();		//���^
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
			for(i=number1-1;i>0;i--)				//���׳�����Ĳ���
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
			txt2.setText(""+Math.pow(number1, 1.0/3));			//������������Ĳ���
		}
		else if(e.getSource()==but[36])
		{
			String s1=txt1.getText();
			s1=s1+'��';
			txt1.setText(s1);
		}
		
		
		else if(e.getSource()==but[37])
		{
			String s1=txt1.getText();	
			double number1=Double.parseDouble(s1);
			s1="log"+s1;
			txt1.setText(s1);
			txt2.setText(""+Math.log(number1));					//��log����Ĳ���
		}
		else if(e.getSource()==but[38])
		{
			String s1=txt1.getText();	
			double number1=Double.parseDouble(s1);
			s1="10^"+s1;
			txt1.setText(s1);
			txt2.setText(""+Math.pow(10, number1));				//��10��X�η�����Ĳ���
		}
		else if(e.getSource()==but[39])
		{
			String s1=txt1.getText();	
			double number1=Double.parseDouble(s1);
			s1="ln"+s1;
			txt1.setText(s1);
			txt2.setText(""+Math.abs(Math.log(1.0/number1)));	//��ln����Ĳ���
		}
		else if(e.getSource()==but[40])
		{
			String s1=txt1.getText();
			double number1=Double.parseDouble(s1);
			s1="e^"+s1;
			txt1.setText(s1);
			txt2.setText(""+Math.pow(E, number1));		//��e��x�η�����Ĳ���
		}
		else if(e.getSource()==but[41])
		{
			String s1="";
			s1=s1+"��";
			txt1.setText(s1);
			txt2.setText(""+��);					//��ʾ�е�ֵ
		}
		else if(e.getSource()==but[42])
		{
			
			String s1=txt1.getText();
			double number1=Double.parseDouble(s1);
			number1=number1*(-1);
			s1=s1+"*-1";
			txt1.setText(s1);
			txt2.setText(""+number1);						//���෴������Ĳ���
		}
		else if(e.getSource()==but[43])
		{
			
			String s1=txt1.getText();
			int number1=Integer.parseInt(s1);
			txt2.setText(""+Integer.toHexString(number1));		//��ת��Ϊ16�������Ŀ⺯��Integer.toHexString(int x);
		}
		else if(e.getSource()==but[44])
		{
			
			String s1=txt1.getText();
			int number1=Integer.parseInt(s1);
			txt2.setText(""+Integer.valueOf(number1));			//��ת��Ϊ10�������Ŀ⺯��Integer.valueOf(int x);
		}
		else if(e.getSource()==but[45])
		{
			
			String s1=txt1.getText();
			int number1=Integer.parseInt(s1);
			txt2.setText(""+Integer.toOctalString(number1));	//��ת��Ϊ8�������Ŀ⺯��Integer.toOctalString(int x);
		}
		else if(e.getSource()==but[46])
		{
			
			String s1=txt1.getText();
			int number1=Integer.parseInt(s1);
			txt2.setText(""+Integer.toBinaryString(number1));	//��ת��Ϊ2�������Ŀ⺯��Integer.toBinaryString(int x);		
		}
		else if(e.getSource()==but[47])
		{
			String s1=txt1.getText();
			double number1=Integer.parseInt(s1);
			s1="(e*"+s1+"-e*(-1*"+s1+"))/2";
			txt1.setText(s1);
			txt2.setText(""+ (Math.pow(E, number1)-Math.pow(E, -1*number1))/2);		//��˫����������Ĳ���
		}
		else if(e.getSource()==but[48])
		{
			String s1=txt1.getText();
			double number1=Integer.parseInt(s1);
			s1="(e*"+s1+"+e*(-1*"+s1+"))/2";
			txt1.setText(s1);
			txt2.setText(""+ (Math.pow(E, number1)+Math.pow(E, -1*number1))/2);		//��˫����������Ĳ���
		}
		else if(e.getSource()==but[49])
		{
			String s1=txt1.getText();
			double number1=Integer.parseInt(s1);
			s1="((e*"+s1+ "-e*(-1*" +s1+ "))/2)" +"/"+"((e*"+s1+"+e*(-1*"+s1+"))/2)";
			txt1.setText(s1);
			txt2.setText(""+ ((Math.pow(E, number1)-Math.pow(E, -1*number1))/2)
					/((Math.pow(E, number1)+Math.pow(E, -1*number1))/2));		//��˫����������Ĳ���
		}
		else if(e.getSource()==but[50])			//����������Ĳ���
		{
			int place;
			String s1=txt1.getText();
			String s2="";
			for(i=0;i<s1.length()-1;i++)
			{
			if(s1.charAt(i)=='.')				//�ж�С�����λ��
			{
			place=i;
			for(i=0;i<place;i++)
			{
			s2=s2+s1.charAt(i);					//ȡС����֮ǰ������
			}
			int number1=Integer.parseInt(s2);
			txt2.setText(""+number1);
			}
			}
		}
		else if(e.getSource()==but[51])			//���ۼ�����Ĳ���
		{
		String s1=txt1.getText();
		String s2="";
		int number1=Integer.parseInt(s1);
		int begin=number1;						//���ۼ��������ʼֵ
		for(i=number1;i>0;i--)
		{
		s2=s2+"+"+i;
		}
		for(i=number1-1;i>0;i--)
		{
		number1+=i;								//�ۼ�����
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
			JFrame help=new JFrame("���ڼ�����");
			help.setSize(660,280);
			help.setLayout(new FlowLayout(FlowLayout.LEADING,0,0));
			String path = "D://Background.jpg";  				//����ͼƬ// 
		    ImageIcon Imagebackground = new ImageIcon(path);  	//�ѱ���ͼƬ��ʾ��һ����ǩ����//  
		    JLabel Imagelabel = new JLabel(Imagebackground); 	//�����ݴ���ת��ΪJPanel���������÷���setOpaque()��ʹ���ݴ���͸��//   
		    JPanel imagePanel = (JPanel) help.getContentPane();  
		    Imagelabel.setBounds(0, 0, help.getWidth(), help.getHeight());  //�ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ����������� //
			imagePanel.setOpaque(false);  									//�ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ���� //
		    help.getLayeredPane().add(Imagelabel, new Integer(Integer.MIN_VALUE)); 
			JLabel h1=new JLabel("�ü������������ͳ̷·±�д,��һ���๦�ܵĿ�ѧ������,������ȫ,���Խ���������֮��ļӼ��˳��͸�������");
			JLabel h2=new JLabel("��дʱ�䣺2016��12��27��");
			JLabel h3=new JLabel("��д�ص㣺����ѧԺΩʵ¥3402-2");
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
		// TODO �Զ����ɵķ������
		return 0;
	}
public void Set()
{
	for(i=1;i<4;i++)
	{
		but[i].setForeground(Color.red);			//�޸�������ɫ			
		but[i].setFont(new Font("����", ABORT, 15));	//�޸������С������		
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
	for(i=8;i<27;i+=6)				//ʹ��forѭ���޸������������
	{
	but[i].setForeground(Color.red);				
	but[i].setFont(new Font("����", ABORT, 15));		
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
	this.add(jmb);					//�� ��������Ӳ˵���//
	jmb.add(jm1);					//�ڲ˵�������Ӳ˵���//
	jmb.add(jm2);					//-------------//
	jmb.add(jm3);					//-------------//
	jm1.add(jmm1);					//�ڲ˵�������Ӳ˵���//
	jm3.add(jmm2);
	jm2.add(jmm3);
	this.add(p1);
	p1.add(lab1);
	p1.add(txt1);
	p1.add(lab2);
	p1.add(txt2);
	//txt2.setEditable(false);		//��txt2����Ϊ�����Ա༭�ı�//
	this.add(p2);
	p2.add(but[0]);					//���p2��Ӱ�ť//
	p2.add(but[1]);					//----------//
	p2.add(but[2]);					//----------//
	p2.add(but[3]);					//----------//
	this.add(p3);
	for(i=4;i<52;i++)			//ʹ��forѭ�������p3����Ӱ�ť����but[i]//
	{								//----------------------------//
	p3.add(but[i]);					//----------------------------//
	}								//----------------------------//
	}
	}


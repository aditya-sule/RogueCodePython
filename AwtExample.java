import java.awt.*;

public class AwtExample
{
	public static void main(String args [])
	{
		Frame f=new Frame("AWT Example");
		Label l1,l2;
		l1=new Label("Roll no");
		l1.setBounds(50,100,50,20);
		l2=new Label("Name");
		l2.setBounds(50,200,50,20);
		
		f.add(l1);
		f.add(l2);
		
		TextField t1,t2;
		t1=new TextField("Enter roll no");
		t1.setBounds(100,100,100,20);
		t2=new TextField("Enter Name");
		t2.setBounds(100,200,100,20);
			
		f.add(t1);
		f.add(t2);
		
		Button b = new Button("Button");
		b.setBounds(75,300, 80,30);
		f.add(b);
		
		f.setSize(400,400);
		
		f.setLayout(null);
		f.setVisible(true);
	}
}	
		
		
		
		
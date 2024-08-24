import java.awt.*;
import java.awt.event.*;

import javax.swing.Action;
class T5 extends Frame implements ActionListener
{
    Button b1,b2,b3,b4;
    Label l1,l2,l3,l4;
    TextField t1,t2,t3;
    Panel p1,p2,p3;
    T5()
{
    setVisible(true);
    setLocation(300, 200);
    setTitle("My Frame");
     setLayout(new BorderLayout());
    setBackground(Color.yellow);
    l1=new Label("Enter FIrst NUmber");
    l2=new Label("Enter Second NUmber");
    l3=new Label("Result");
    t1=new TextField(20);
    t2=new TextField(20);
    t3=new TextField(20);
    
    
    b1=new Button("Add");
    b2=new Button("Sub");
    b3=new Button("Mul");
    b4=new Button("Div");
    p1=new Panel();
    p2=new Panel();
    p3=new Panel();
    p2.setLayout(new GridLayout(3,2));
    p1.setBackground(Color.pink);
    p2.setBackground(Color.cyan);
    p3.setBackground(Color.orange);
  l4=new Label("My Calculatore");
  p1.add(l4);
    p2.add(l1);p2.add(t1);
    p2.add(l2);p2.add(t2);
    p2.add(l3);p2.add(t3);
  
    p3.add(b1);
    p3.add(b2);
    p3.add(b3);
    p3.add(b4);
    add(p1,"North");
    add(p2);
    add(p3,"South");

pack();
setResizable(false);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
    int a=Integer.parseInt(t1.getText());
    int b=Integer.parseInt(t2.getText());
    int c=0;
    if(ae.getSource()==b1)
    c=a+b;
    if(ae.getSource()==b2)
    c=a-b;
    if(ae.getSource()==b3)
    c=a*b;
if(ae.getSource()==b4)
    c=a/b;
t3.setText(String.valueOf(c));
}

}



class TF5
{
    public static void main(String args[])
    {
        T5 ob=new T5();
    }
}
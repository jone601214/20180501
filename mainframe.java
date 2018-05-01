import  javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainframe extends JFrame{
    private JButton jbtnAdd=new JButton("Add");//按鈕
    private JButton jbtnLow=new JButton("Lower");
    private JLabel jlb=new JLabel(">__<");//標籤文字
    private int x=50;
    public mainframe(){
        init();
    }
    private void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//程式結束
        this.setLayout(null);//介面劃分
        this.setLocation(100,50);//視窗位置
        this.setSize(800,600);//視窗大小
        jbtnAdd.setLocation(50,60);//按紐位置
        jbtnLow.setLocation(50,120);
        jbtnAdd.setSize(120,30);//按鈕大小
        jbtnLow.setSize(120,30);
        jlb.setBounds(50,200,100,30);//文字座標大小

        this.add(jbtnAdd);//視窗上建立按鈕
        this.add(jbtnLow);
        this.add(jlb);
        jbtnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               x-=10;
               jlb.setLocation(x,200);
            }
        });
        jbtnLow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x+=10;
                jlb.setLocation(x,200);
            }
        });
    }
}

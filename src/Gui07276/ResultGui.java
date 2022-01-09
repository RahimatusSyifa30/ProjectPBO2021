package Gui07276;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import Controller07276.AllObjectController;


public class ResultGui {
    JFrame result;
JButton back;

public ResultGui(){
result=new JFrame ("GUI") ;
result.setSize(1000,700);
result.getContentPane().setBackground(Color.CYAN);

JLabel judul=new JLabel("Hasil Klaster");
judul.setBounds(300,30,400,50);
judul.setFont(new Font ("Times New Roman ",Font.BOLD,40));
result.add(judul);

JTextArea area=new JTextArea();
JScrollPane scroll=new JScrollPane(area);
scroll.setBounds(30,150,900,400);
result.add(scroll) ;

area.setText(AllObjectController.recordcontroller.ViewDataRecord()+AllObjectController.clustercontroller.ViewDataCluster());
back=new JButton("Back");
back.setBounds(30,600,80,30);
back.setBackground(Color.red);
result.add(back) ;
result.setLocationRelativeTo(null);
result.setLayout(null);
result.setVisible(true);
result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

back.addActionListener(new ActionListener ( ){
@Override
public void actionPerformed (ActionEvent ae) {
RecordGui recordgui=new RecordGui ( ) ;
result. dispose ( ) ;

}});
}}

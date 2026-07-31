package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{

    JTextField textFieldName;
    JPasswordField passwordField;
    JButton login,back;

    Login(){

        // username
        JLabel labelname = new JLabel("Username");
        labelname.setBounds(40,20,100,20);
        add(labelname);

        textFieldName = new JTextField();
        textFieldName.setBounds(150,20,150,20);
        add(textFieldName);

        //
        JLabel labelpass = new JLabel("Password");
        labelpass.setBounds(40,70,100,20);
        add(labelpass);

        passwordField = new JPasswordField();
        passwordField.setBounds(150,70,150,20);
        add(passwordField);

        // button - login
        login = new JButton("Login");
        login.setBounds(40,140,120,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        add(login);

        // button - back
        back = new JButton("Back");
        back.setBounds(180,140,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        add(back);


        ImageIcon i1 = new ImageIcon("");



        setSize(600,300);
        setLocation(330,250);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}

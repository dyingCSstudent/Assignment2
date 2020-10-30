/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roleplayinggame;
import database.Database;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import roleplayinggame.Items.Armour;
import roleplayinggame.Items.Weapon;
import roleplayinggame.Mobs.Bandit;
import roleplayinggame.Player.Player;
/**
 *
 * @author Skyrim
 * 
 */




public class GUI extends JFrame{

    
    public static void main(String[] args){

        new GUI();
    }
    
    //Database database = new Database();
    Player player = new Player("User", 100, 10, 10, 200, false);
    Weapon w1 = new Weapon("Sword", 4, false, 25);
    Armour a1 = new Armour("Breastplate", 10, false, 50);

    
     JFrame window;
     Container content;
     JPanel titlePanel;
     JLabel titleLabel;
     Font titleFont =  new Font("Viner Hand ITC", Font.PLAIN, 42);
     Font buttonFont =  new Font("Viner Hand ITC", Font.PLAIN, 20);
     JPanel startButtonPanel;
     JButton startButtonButton;
     
     JPanel mainTextPanel;
     JTextArea mainTextArea;
     
     JPanel playerOptions;
     JButton option1;
     JButton option2;
     JButton option3;
     
     JPanel usernameinput;
     JTextField userinput;
     
     TitleScreenHandler tsHandler = new TitleScreenHandler();
     AttributeHandler aHandler = new AttributeHandler();
     InventoryHandler iHandler = new InventoryHandler();
     CombatHandler cHandler = new CombatHandler();
     
     
     public GUI(){
         

     
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.gray);
        window.setLayout(null);
        window.setVisible(true);
        content = window.getContentPane();
        
        titlePanel = new JPanel();
        titlePanel.setBounds(100,100,600,150);
        titlePanel.setBackground(Color.gray);
        titleLabel = new JLabel("Adventure Game");
        titleLabel.setForeground(Color.black);
        titleLabel.setFont(titleFont);
        titlePanel.add(titleLabel);
        content.add(titlePanel);
        
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.gray);
        startButtonButton = new JButton("Start");
        startButtonButton.setBackground(Color.gray);
        startButtonButton.setForeground(Color.black);
        startButtonButton.setFont(buttonFont);
        
        startButtonButton.addActionListener(tsHandler);
        startButtonPanel.add(startButtonButton);
        content.add(startButtonPanel);
        
     }
        
     public void gameScreen(){
         
         //database.autoConnectDatabase();
         player.accessInventory().add(w1);
         player.accessInventory().add(a1);
         
         titlePanel.setVisible(false);
         startButtonPanel.setVisible(false);
         mainTextPanel = new JPanel();
         mainTextPanel.setBounds(100, 100, 600, 250);
         mainTextPanel.setBackground(Color.white);
         mainTextArea = new JTextArea("Text");
         mainTextArea.setEditable(false);
         mainTextArea.setBounds(100, 100, 600, 250);
         mainTextArea.setBackground(Color.white);
         mainTextArea.setForeground(Color.black);
         mainTextArea.setFont(buttonFont);
         mainTextArea.setLineWrap(true);
         mainTextPanel.add(mainTextArea);
         content.add(mainTextPanel);
         
         //
         playerOptions = new JPanel();
         playerOptions.setBounds(250, 350, 300, 350);
         playerOptions.setBackground(Color.gray);
         playerOptions.setLayout(new GridLayout(6,1));
         
         option1 = new JButton("Attributes");
         option1.setBackground(Color.gray);
         option1.setForeground(Color.black);
         option1.setFont(buttonFont);
         playerOptions.add(option1);
         option1.addActionListener(aHandler);
         
         option2 = new JButton("Inventory");
         option2.setBackground(Color.gray);
         option2.setForeground(Color.black);
         option2.setFont(buttonFont);
         playerOptions.add(option2);
         option2.addActionListener(iHandler);
         
         option3 = new JButton("Combat");
         option3.setBackground(Color.gray);
         option3.setForeground(Color.black);
         option3.setFont(buttonFont);
         playerOptions.add(option3);
         option3.addActionListener(cHandler);
         
         content.add(playerOptions);
         
         //
         
         usernameinput = new JPanel();
         usernameinput.setBounds(100, 50, 100, 30);
         usernameinput.setBackground(Color.white);
         userinput = new JTextField(5);
         usernameinput.add(userinput);
         content.add(usernameinput);
         
     }
     
     public class TitleScreenHandler implements ActionListener{
           
        public void actionPerformed(ActionEvent event){
            
            gameScreen();
        }
     }
     
     public class AttributeHandler implements ActionListener{
           
        public void actionPerformed(ActionEvent event){
            
            mainTextArea.setText("Current Attributes: \n" + player+ "\n");
        }
     }
     
     public class InventoryHandler implements ActionListener{
           
        public void actionPerformed(ActionEvent event){
            
            mainTextArea.setText("Your current inventory: \n" + player.accessInventory().toString());
        }
     }
     
     public class CombatHandler implements ActionListener{
           
        public void actionPerformed(ActionEvent event){
            
            Bandit b1 = new Bandit("Bandit", 20, 80, 10, 5, false);    
            mainTextArea.setText("You encounter a Bandit and prepare to fight it.\n You have lost health");
            while(b1.getHealth() > 0){
                b1.setHealth(player.attack() + w1.getDamage());
                player.setHealth(b1.attack());
                if(player.getHealth() < 0){
                    mainTextArea.setText("YOU HAVE DIED");
                    System.exit(0);
                }
           
        }
     }
     
}
     
}


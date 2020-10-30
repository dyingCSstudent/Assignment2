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
import javax.swing.border.LineBorder;
import roleplayinggame.Items.Armour;
import roleplayinggame.Items.Weapon;
import roleplayinggame.Mobs.Bandit;
import roleplayinggame.Player.Player;

/**
 * This is Class called GUI, and it is where it contains a 2nd main method which starts the GUI form of the Game
 * @author Swapnil Kumar 17982217
 * 
 */

public class GUI extends JFrame{

    /**
     * This is the 2nd main method of the Project where the objects are initialized
     * @param args
     */
    public static void main(String[] args){

        new GUI();
    }
    
    //Database database = new Database(); unable to begin database as an error with a driver occured
    
    /**
     * This is where the necessary objects and variables are initialized
     */
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
     JButton option4;
     
     JPanel usernameinput;
     JTextField userinput;
     JButton setName;
     JPanel textfieldbutton;
     
     TitleScreenHandler tsHandler = new TitleScreenHandler();
     AttributeHandler aHandler = new AttributeHandler();
     InventoryHandler iHandler = new InventoryHandler();
     CombatHandler cHandler = new CombatHandler();
     ExitHandler eHandler = new ExitHandler();
     UserInputHandler uHandler = new UserInputHandler();
     
    /**
     *
     */
    public GUI(){
         

     
        window = new JFrame();
        window.setSize(800,700);
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
        startButtonButton.setBorder(new LineBorder(Color.BLACK));
        
        startButtonButton.addActionListener(tsHandler);
        startButtonPanel.add(startButtonButton);
        content.add(startButtonPanel);
        
     }
        
    /**
     *
     */
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
         playerOptions.setLayout(new GridLayout(3,12));
         
         option1 = new JButton("Attributes");
         option1.setBackground(Color.gray);
         option1.setForeground(Color.black);
         option1.setFont(buttonFont);
         playerOptions.add(option1);
         option1.addActionListener(aHandler);
         option1.setBorder(new LineBorder(Color.BLACK));
         
         option2 = new JButton("Inventory");
         option2.setBackground(Color.gray);
         option2.setForeground(Color.black);
         option2.setFont(buttonFont);
         playerOptions.add(option2);
         option2.addActionListener(iHandler);
         option2.setBorder(new LineBorder(Color.BLACK));
         
         option3 = new JButton("Combat");
         option3.setBackground(Color.gray);
         option3.setForeground(Color.black);
         option3.setFont(buttonFont);
         playerOptions.add(option3);
         option3.addActionListener(cHandler);
         option3.setBorder(new LineBorder(Color.BLACK));
         
         option4 = new JButton("Exit");
         option4.setBackground(Color.gray);
         option4.setForeground(Color.black);
         option4.setFont(buttonFont);
         option4.setBorder(new LineBorder(Color.BLACK));
         playerOptions.add(option4);
         option4.addActionListener(eHandler);
         
         content.add(playerOptions);
         
         //
         
         usernameinput = new JPanel();
         usernameinput.setBounds(125, 60, 150, 75);
         usernameinput.setBackground(Color.gray);
         userinput = new JTextField(5);
         userinput.setBorder(new LineBorder(Color.BLACK));
         usernameinput.add(userinput);
         content.add(usernameinput);
         
         
         textfieldbutton = new JPanel();
         textfieldbutton.setBounds(200, 50, 250, 75);
         textfieldbutton.setBackground(Color.gray);
         content.add(textfieldbutton);
         
         setName = new JButton("Set Name");
         setName.setBackground(Color.gray);
         setName.setForeground(Color.black);
         setName.setFont(buttonFont);
         setName.setBorder(new LineBorder(Color.BLACK));
         textfieldbutton.add(setName);
         setName.addActionListener(uHandler);
         
     }
     
    /**
     *
     */
    public class TitleScreenHandler implements ActionListener{
           
        public void actionPerformed(ActionEvent event){
            
            gameScreen();
            
        }
     }
     
    /**
     *
     */
    public class AttributeHandler implements ActionListener{
           
        public void actionPerformed(ActionEvent event){
            
            mainTextArea.setText("Current Attributes: \n" + player+ "\n");
        }
     }
     
    /**
     *
     */
    public class InventoryHandler implements ActionListener{
           
        public void actionPerformed(ActionEvent event){
            
            mainTextArea.setText("Your current inventory: \n" + player.accessInventory().toString());
        }
     }
     
    /**
     *
     */
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

    /**
     *
     */
    public class ExitHandler implements ActionListener{
           
        public void actionPerformed(ActionEvent event){
            
            System.exit(0);
        }
     }
        
    /**
     *
     */
    public class UserInputHandler implements ActionListener{
           
        public void actionPerformed(ActionEvent event){
            
            player.setName(userinput.getText());;
            usernameinput.setVisible(false);
            textfieldbutton.setVisible(false);
            
        }
     }
     
}


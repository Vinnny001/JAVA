import javax.swing.JOptionPane;

public class gui{
    public static void main(String [] args){
        String name=JOptionPane.showInputDialog("Enter name:");
        //JOptionPane.showMessageDialog(null, "Hello "+name+);
        int age =Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null,"Hello "+name+"\nYou are "+age+" years old!");
    }
}
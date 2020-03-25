import javax.swing.*;

public class Media{

   public static void main( String ... args){
   
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
      int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
      int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
      int n5 = Integer.parseInt(JOptionPane.showInputDialog("Digite o último valor"));
      int media = (n1+n2+n3+n4+n5)/5;
      
      JOptionPane.showMessageDialog(null, "A média entre os números digitados é de: "+media);
   }
}
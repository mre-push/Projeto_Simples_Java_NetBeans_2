/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author mateu
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        do {
           n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um numero:<br><em>(0 interrompe)</em></html> "));
           s += n;
        } while(n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <br>------------------------" + "<br>Somatório vale " + s + "</html>");
        
    }
    
}

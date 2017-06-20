/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargatelas;

import javax.swing.JOptionPane;

/**
 *
 * @author alipio
 */
public class CargaTelas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Ola Alipio","Login",JOptionPane.WARNING_MESSAGE);
         int num,soma = 0;
        do{
           num = Integer.parseInt(JOptionPane.showInputDialog(null,
                   "<html>Informe um Numero: <br><em>( O valor 0 Finaliza ) </em></br></html>"));
          // JOptionPane.showMessageDialog(null, "Voce digitou : " + num);
           soma += num;
        }while(num != 0);
        JOptionPane.showMessageDialog(null, "<html> Resultado Final <hr> "
                + " <br><em> A soma foi : </em></br>" + soma + "</html>");
        //System.out.println(num);
    }
    
}

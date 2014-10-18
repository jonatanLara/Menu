
package menu;

import javax.swing.JOptionPane;

/**
 *
 * @author jonatanLara
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
       Paginas objPangina = new Paginas();
       int contador =0;
       String opcion;
        do{
	   opcion = JOptionPane.showInputDialog (null,"Opciones"+'\n'+
		   '\n'+"1.-Introducir Paginas "+'\n'+	"2- Finalizar Programa","Menu Principal",JOptionPane.QUESTION_MESSAGE);
		   contador = Integer.parseInt(opcion);
		   switch(contador) {
			case 1:
 	                     objPangina.impresion();
                            break;

		        case 2:
		             System.exit (0);
                            break;
			
			default:
                             JOptionPane.showMessageDialog (null, "Pagina no Valida",	"ADVERTENCIA",JOptionPane.ERROR_MESSAGE);
                             break;
			
		  }
	}while (contador !=3);
	
        JOptionPane.showMessageDialog(null,"Fin del Proceso",
	"HASTA LUEGO- Lara Ortiz Jonatan, Villalobos estrella Laris  ",JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
	
  }
}
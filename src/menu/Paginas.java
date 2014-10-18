/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import javax.swing.JOptionPane;

/**
 *
 * @author jonatanLara
 */
public class Paginas {

    public Paginas() {
    }
    /**valida un String de tipo entero
     * y retorna si es verdadero*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">  
    private static boolean validar(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }// </editor-fold> 
    /**resive los datos que son introducido por el usuario
     y Validar si la cadena y lo convierte a Int, 
     * si no es un entero lanza un mensaje de Numero No Valido*/
     // <editor-fold defaultstate="collapsed" desc="Generated Code">  
    public static  int llenado(int x) {
        int num = 0;
        String cad;
        cad = JOptionPane.showInputDialog(null, "Introdusca 12 paginas del 1-5", "Paginacion", JOptionPane.INFORMATION_MESSAGE);
        if (Paginas.validar(cad)) {
            num = Integer.parseInt(cad);
        } else {
            JOptionPane.showMessageDialog(null, cad + "   Numero No Valido  \n Intentelo de Nuevo ", "ERROR", JOptionPane.ERROR_MESSAGE);
            num = llenado(x);
        }
        return num;
    }// </editor-fold> 
    /**recorre una matriz como parametro de tipo entero */
    public static int reco(int Matriz[], int a1, int b1, int c1, int d1) {
        int b2 = 0, c2 = 0, d2 = 0, pos = 0;// todas mis posiciones son igual a 0 por default
        
        for (int i = a1; i <= Matriz.length - 1; i++) {
            //System.out.println("numero    : " +v[h]);
            if (Matriz[i] == b1) {
                b2++;
            }
            if (Matriz[i] == c1) {
                c2++;
            }
            if (Matriz[i] == d1) {
                d2++;
            }
        }
        /**Si mis Valores de mi matriz son iguales a 0 */
        if (b2 == 0 && c2 == 0 && d2 == 0 || b2 != 0 && c2 != 0 && d2 != 0) {
            pos = 3;//quiere decir que tengo 3 casillas sean vacias o llenas (!= 0)
        }
        if (b2 == 0 && c2 == 0) {
            pos = 3;
        }
        if (b2 == 0 && d2 == 0) {
            pos = 3;
        }
        if (c2 == 0 && d2 == 0) {
            pos = 3;
        }
        if (b2 != 0) {
            if (b2 == c2 && c2 == d2) {
                pos = 3;
            }
        }
        //pongo y ordeno las pociciones de mi matriz 
        if (b2 == 0) {
            pos = 0;
        }
        if (c2 == 0) {
            pos = 1;
        }
        if (d2 == 0) {
            pos = 2;
        }
//	System.out.println("numero    : " + pos);
        return pos;//retorno su posicion actual
    }

    public static String cadena() {

        int aux = 0, tope = 0, fin = 0, n = 0, a = 0, f = 0, au, band = 0;

        String salida1 = " ";
        int alm[] = new int[12];//creo un arreglo de 12 espacios 
        String FIFO[] = new String[3], FALLA[] = new String[12];//creo 2 arreglos uno de 3 y otro de 12 espacios 
        FIFO[0] = " ";
        FIFO[1] = "FIFO";
        FIFO[2] = " ";
        int ve1[] = new int[3];//creo 12 arreglos de 3 espacios cada uno y de tipo entero
        int ve2[] = new int[3];
        int ve3[] = new int[3];
        int ve4[] = new int[3];
        int ve5[] = new int[3];
        int ve6[] = new int[3];
        int ve7[] = new int[3];
        int ve8[] = new int[3];
        int ve9[] = new int[3];
        int ve10[] = new int[3];
        int ve11[] = new int[3];
        int ve12[] = new int[3];
     
        System.out.println("ALMACENADO");//imprimo en la pantalla que esta almacenando
        for (int x = 0; x <= 11; x++) {
            aux = llenado(n);//n es para guardar el entero que esta resiviendo el metodo llenando
            if (aux > 0 && aux <= 5) {//verifico si mi datos esta entre 1 y 5 
                System.out.print(aux + "  ");
                alm[x] = aux;//almaceno los datos en mi arreglo de 12 alm[x] donde x es la posicion y lo guardo
            } else {//encaso de que el dato no este entre 1 y 5 entoces desincremento a x(x--;) y mando un mensaje
                JOptionPane.showMessageDialog(null, " DE 1 A 5", "ERROR ", JOptionPane.ERROR_MESSAGE);
                x--;
            }
        }
//____________________________________________________________________________________________________________________________________________				
        ve1[a] = alm[a];
        f++;
        a++;
        fin++;
        FALLA[0] = "f";
        for (int y2 = 0; y2 <= 2; y2++) {
            ve2[y2] = ve1[y2];
        }
        for (int y = 0; y <= fin; y++) {
            if (ve2[y] == alm[a]) {
                band = 1;
                y++;
            }
        }
        if (band == 1) {
            a++;
            FALLA[1] = " ";
        } else {
            ve2[fin] = alm[a];
            a++;
            f++;
            fin++;
            FALLA[1] = "f";
        }
//_____________________________________________________________________________________________________
        band = 0;
        for (int x = 0; x <= 2; x++) {
            ve3[x] = ve2[x];
        }
        for (int x = 0; x <= fin; x++) {
            if (ve3[x] == alm[a]) {
                x++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[2] = " ";
        } else {
            ve3[fin] = alm[a];
            a++;
            f++;
            fin++;
            FALLA[2] = "f";
        }
        band = 0;
//__________________________________________________________________________________________________________   
        for (int h = 0; h <= 2; h++) {
            ve4[h] = ve3[h];
        }
        if (fin > 2) {
            fin--;
        }
        for (int d2 = 0; d2 <= fin; d2++) {
            if (ve4[d2] == alm[a]) {
                d2++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[3] = " ";
        } else {
            if (ve4[fin] == 0) {
                ve4[fin] = alm[a];
                f++;
                a++;
                fin++;
                FALLA[3] = "f";
            } else {
                ve4[tope] = ve4[tope + 1];
                ve4[tope + 1] = ve4[fin];
                ve4[fin] = alm[a];
                f++;
                FALLA[3] = "f";
                a++;
            }
        }
        band = 0;
//__________________________________________________________________________________________________________
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve5[j] = ve4[j];
        }
        for (int d3 = 0; d3 <= 2; d3++) {
            if (alm[a] == ve5[d3]) {
                d3++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[4] = " ";
        } else {
            if (ve5[fin] == 0) {
                ve5[fin] = alm[a];
                f++;
                fin++;
                FALLA[4] = "f ";
                a++;
            } else {
                ve5[tope] = ve5[tope + 1];
                ve5[tope + 1] = ve5[fin];
                ve5[fin] = alm[a];
                f++;
                a++;
                FALLA[4] = "f ";
            }
        }
        band = 0;
//________________________________________________________________________________________________________
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve6[j] = ve5[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve6[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[5] = " ";
        } else {
            if (ve6[fin] == 0) {
                ve6[fin] = alm[a];
                f++;
                a++;
                fin++;
                FALLA[5] = "f";
            } else {
                ve6[tope] = ve6[tope + 1];
                ve6[tope + 1] = ve6[fin];
                ve6[fin] = alm[a];
                f++;
                a++;
                FALLA[5] = "f";
            }
        }
        band = 0;
//____________________________________________________________________________________________________________
        if (fin > 2) {
            fin--;
        }

        for (int j = 0; j <= 2; j++) {
            ve7[j] = ve6[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve7[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[6] = " ";
        } else {
            if (ve7[fin] == 0) {
                ve7[fin] = alm[a];
                f++;
                a++;
                fin++;
                FALLA[6] = "f";
            } else {
                ve7[tope] = ve7[tope + 1];
                ve7[tope + 1] = ve7[fin];
                ve7[fin] = alm[a];
                f++;
                a++;
                FALLA[6] = "f";
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve8[j] = ve7[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve8[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[7] = " ";
        } else {
            if (ve8[fin] == 0) {
                ve8[fin] = alm[a];
                f++;
                a++;
                fin++;
                FALLA[7] = "f";
            } else {
                ve8[tope] = ve8[tope + 1];
                ve8[tope + 1] = ve8[fin];
                ve8[fin] = alm[a];
                f++;
                a++;
                FALLA[7] = "f";
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve9[j] = ve8[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve9[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[8] = " ";
        } else {
            if (ve9[fin] == 0) {
                ve9[fin] = alm[a];
                f++;
                a++;
                fin++;
                FALLA[8] = "f";
            } else {
                ve9[tope] = ve9[tope + 1];
                ve9[tope + 1] = ve9[fin];
                ve9[fin] = alm[a];
                f++;
                a++;
                FALLA[8] = "f";
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve10[j] = ve9[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve10[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[9] = " ";
        } else {
            if (ve10[fin] == 0) {
                ve10[fin] = alm[a];
                f++;
                a++;
                fin++;
                FALLA[9] = "f";
            } else {
                ve10[tope] = ve10[tope + 1];
                ve10[tope + 1] = ve10[fin];
                ve10[fin] = alm[a];
                f++;
                a++;
                FALLA[9] = "f";
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve11[j] = ve10[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve11[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[10] = " ";
        } else {
            if (ve11[fin] == 0) {
                ve11[fin] = alm[a];
                f++;
                a++;
                fin++;
                FALLA[10] = "f";
            } else {
                ve11[tope] = ve11[tope + 1];
                ve11[tope + 1] = ve11[fin];
                ve11[fin] = alm[a];
                f++;
                a++;
                FALLA[10] = "f";
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve12[j] = ve11[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve12[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[11] = " ";
        } else {
            if (ve12[fin] == 0) {
                ve12[fin] = alm[a];
                f++;
                a++;
                fin++;
                FALLA[11] = "f";
            } else {
                ve12[tope] = ve12[tope + 1];
                ve12[tope + 1] = ve12[fin];
                ve12[fin] = alm[a];
                f++;
                a++;
                FALLA[11] = "f";
            }
        }
        band = 0;
//___________________________________________________________________________________________________________
        String almacen = "PAG. " + "\t", falla = "FALL. " + "\t";
        for (int g = 0; g <= 2; g++) {
            salida1 += FIFO[g] + "\t" + ve1[g] + "   " + ve2[g] + "   " + ve3[g] + "   " + ve4[g] + "   " + ve5[g] + "   " + ve6[g] + "   " + ve7[g] + "   " + ve8[g] + "   " + ve9[g] + "   " + ve10[g] + "   " + ve11[g] + "   " + ve12[g] + "\n";
        }
        for (int g = 0; g <= 11; g++) {
            almacen += alm[g] + "   ";
            falla += FALLA[g] + "   ";
        }
        String salidon = "  ", sal = "  ", sali1 = " ";
        sal = "\n" + "\n" + almacen + "\n" + "______________________________________________________________________________" + "\n" + salida1 + "\n" + falla + "\t" + "FALLAS" + "    " + f + "\n" + "______________________________________________________________________________";

        
 /*-----------------------------------LRU-----------------------------------------*/
        for (int xx = 0; xx <= 2; xx++) {
            ve1[xx] = 0;
            ve2[xx] = 0;
            ve3[xx] = 0;
            ve4[xx] = 0;
            ve5[xx] = 0;
            ve6[xx] = 0;
            ve7[xx] = 0;
            ve8[xx] = 0;
            ve9[xx] = 0;
            ve10[xx] = 0;
            ve11[xx] = 0;
            ve12[xx] = 0;
        }
        String LRU[] = new String[3];
        LRU[0] = " ";
        LRU[1] = "LRU";
        LRU[2] = " ";
        String salida2 = " ";
        falla = "FALL. " + "\t";
        aux = 0;
        tope = 0;
        fin = 0;
        n = 0;
        a = 0;
        f = 0;
        band = 0;
        int b = 0, c = 0;
//____________________________________________________________________________________________________________________________________________				
        ve1[a] = alm[a];
        b = alm[a];
        f++;
        a++;
        fin++;
        FALLA[0] = "f";
        for (int y2 = 0; y2 <= 2; y2++) {
            ve2[y2] = ve1[y2];
        }
        for (int y = 0; y <= fin; y++) {
            if (ve2[y] == alm[a]) {
                band = 1;
                y++;
            }
        }
        if (band == 1) {
            if (b != alm[a]) {
                c = alm[a];
            }
            a++;
            FALLA[1] = " ";
        } else {
            ve2[fin] = alm[a];
            if (b != alm[a]) {
                c = alm[a];
            }
            a++;
            f++;
            fin++;
            FALLA[1] = "f";
        }
//_____________________________________________________________________________________________________
        band = 0;
        for (int x = 0; x <= 2; x++) {
            ve3[x] = ve2[x];
        }
        for (int x = 0; x <= fin; x++) {
            if (ve3[x] == alm[a]) {
                x++;
                band = 1;
            }
        }
        if (band == 1) {
            if (c != alm[a]) {
                b = alm[a];
            }
            a++;
            FALLA[2] = " ";
        } else {
            ve3[fin] = alm[a];
            if (c == 0) {
                c = alm[a];
            } else {
                if (alm[a] != c) {
                    b = alm[a];
                }
            }
            a++;
            f++;
            fin++;
            FALLA[2] = "f";
        }
        band = 0;
//__________________________________________________________________________________________________________   
        for (int h = 0; h <= 2; h++) {
            ve4[h] = ve3[h];
        }
        if (fin > 2) {
            fin--;
        }
        for (int d2 = 0; d2 <= fin; d2++) {
            if (ve4[d2] == alm[a]) {
                d2++;
                band = 1;
            }
        }
        if (band == 1) {
            if (b != alm[a]) {
                c = alm[a];
            }
            a++;
            FALLA[3] = " ";
        } else {
            if (ve4[fin] == 0) {
                ve4[fin] = alm[a];
                if (b != alm[a]) {
                    c = alm[a];
                }
                if (alm[a - 1] != c) {
                    b = alm[a - 1];
                }
                f++;
                a++;
                fin++;
                FALLA[3] = "f";
            } else {
                for (int m = 0; m <= 2; m++) {
                    if (ve4[m] != b && ve4[m] != c) {
                        ve4[m] = alm[a];
                    }
                }
                b = alm[a - 1];
                c = alm[a];
                f++;
                FALLA[3] = "f";
                a++;
            }
        }
        band = 0;
//__________________________________________________________________________________________________________
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve5[j] = ve4[j];
        }
        for (int d3 = 0; d3 <= 2; d3++) {
            if (alm[a] == ve5[d3]) {
                d3++;
                band = 1;
            }
        }
        if (band == 1) {
            if (c != alm[a]) {
                b = alm[a];
                if (alm[a - 1] != b) {
                    c = alm[a - 1];
                }
            }
            a++;
            FALLA[4] = " ";
        } else {
            if (ve5[fin] == 0) {
                ve5[fin] = alm[a];
                f++;
                fin++;
                FALLA[4] = "f ";
                if (c == 0) {
                    c = alm[a];
                } else {
                    if (alm[a] != c) {
                        b = alm[a];
                    }
                }
                a++;
            } else {
                for (int m = 0; m <= 2; m++) {
                    if (ve5[m] != b && ve5[m] != c) {
                        ve5[m] = alm[a];
                    }
                }
                c = alm[a - 1];
                b = alm[a];
                f++;
                a++;
                FALLA[4] = "f ";
            }
        }
        band = 0;
//________________________________________________________________________________________________________
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve6[j] = ve5[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve6[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            if (alm[a] != b) {
                c = alm[a];
                if (alm[a - 1] != c) {
                    b = alm[a - 1];
                }
            }
            a++;
            FALLA[5] = " ";
        } else {
            if (ve6[fin] == 0) {
                ve6[fin] = alm[a];
                f++;
                if (c == 0) {
                    c = alm[a];
                } else {
                    if (alm[a] != b) {
                        c = alm[a];
                        if (alm[a - 1] != c) {
                            b = alm[a - 1];
                        }
                    }
                }
                a++;
                fin++;
                FALLA[5] = "f";
            } else {
                for (int m = 0; m <= 2; m++) {
                    if (ve6[m] != b && ve6[m] != c) {
                        ve6[m] = alm[a];
                    }
                }
                b = alm[a - 1];
                c = alm[a];
                f++;
                a++;
                FALLA[5] = "f";
            }
        }
        band = 0;
//____________________________________________________________________________________________________________n
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve7[j] = ve6[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve7[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            if (alm[a] != c) {
                b = alm[a];
                if (alm[a - 1] != b) {
                    c = alm[a - 1];
                }
            }
            a++;
            FALLA[6] = " ";
        } else {
            if (ve7[fin] == 0) {
                ve7[fin] = alm[a];
                f++;
                if (c == 0) {
                    c = alm[a];
                } else {
                    if (alm[a] != c) {
                        b = alm[a];
                        if (alm[a - 1] != b) {
                            c = alm[a - 1];
                        }
                    }
                }
                a++;
                fin++;
                FALLA[6] = "f";
            } else {
                for (int m = 0; m <= 2; m++) {
                    if (ve7[m] != b && ve7[m] != c) {
                        ve7[m] = alm[a];
                    }
                }
                c = alm[a - 1];
                b = alm[a];
                f++;
                a++;
                FALLA[6] = "f";
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve8[j] = ve7[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve8[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            if (alm[a] != b) {
                c = alm[a];
                if (alm[a - 1] != c) {
                    b = alm[a - 1];
                }
            }
            a++;
            FALLA[7] = " ";
        } else {
            if (ve8[fin] == 0) {
                ve8[fin] = alm[a];
                f++;
                if (c == 0) {
                    c = alm[a];
                } else {
                    if (alm[a] != b) {
                        c = alm[a];
                        if (alm[a - 1] != c) {
                            b = alm[a - 1];
                        }
                    }
                }
                a++;
                fin++;
                FALLA[7] = "f";
            } else {
                for (int m = 0; m <= 2; m++) {
                    if (ve8[m] != b && ve8[m] != c) {
                        ve8[m] = alm[a];
                    }
                }
                b = alm[a - 1];
                c = alm[a];
                f++;
                a++;
                FALLA[7] = "f";
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-!!!!!!!!!!!!!!!!!!!!!!
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve9[j] = ve8[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve9[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            if (alm[a] != c) {
                b = alm[a];
                if (alm[a - 1] != b) {
                    c = alm[a - 1];
                }
            }
            a++;
            FALLA[8] = " ";
        } else {
            if (ve9[fin] == 0) {
                ve9[fin] = alm[a];
                f++;
                if (c == 0) {
                    c = alm[a];
                } else {
                    if (alm[a] != c) {
                        b = alm[a];
                    }
                }
                a++;
                fin++;
                FALLA[8] = "f";
            } else {
                for (int m = 0; m <= 2; m++) {
                    if (ve9[m] != b && ve9[m] != c) {
                        ve9[m] = alm[a];
                    }
                }
                b = alm[a - 1];
                c = alm[a];
                f++;
                a++;
                FALLA[8] = "f";
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve10[j] = ve9[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve10[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            if (alm[a] != b) {
                c = alm[a];
                if (alm[a - 1] != c) {
                    b = alm[a - 1];
                }
            }
            a++;
            FALLA[9] = " ";
        } else {
            if (ve10[fin] == 0) {
                ve10[fin] = alm[a];
                f++;
                if (c == 0) {
                    c = alm[a];
                } else {
                    if (alm[a] != b) {
                        c = alm[a];
                        if (alm[a - 1] != c) {
                            b = alm[a - 1];
                        }
                    }
                }
                a++;
                fin++;
                FALLA[9] = "f";
            } else {
                for (int m = 0; m <= 2; m++) {
                    if (ve10[m] != b && ve10[m] != c) {
                        ve10[m] = alm[a];
                    }
                }
                c = alm[a - 1];
                b = alm[a];
                f++;
                a++;
                FALLA[9] = "f";
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve11[j] = ve10[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve11[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            if (alm[a] != c) {
                b = alm[a];
                if (alm[a - 1] != b) {
                    c = alm[a - 1];
                }
            }
            a++;
            FALLA[10] = " ";
        } else {
            if (ve11[fin] == 0) {
                ve11[fin] = alm[a];
                f++;
                if (c == 0) {
                    c = alm[a];
                } else {
                    if (alm[a] != c) {
                        b = alm[a];
                        if (alm[a - 1] != b) {
                            c = alm[a - 1];
                        }
                    }
                }
                a++;
                fin++;
                FALLA[10] = "f";
            } else {
                for (int m = 0; m <= 2; m++) {
                    if (ve11[m] != b && ve11[m] != c) {
                        ve11[m] = alm[a];
                    }
                }
                b = alm[a - 1];
                c = alm[a];
                f++;
                a++;
                FALLA[10] = "f";
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve12[j] = ve11[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve12[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            if (alm[a] != b) {
                c = alm[a];
            }
            a++;
            FALLA[11] = " ";
        } else {
            if (ve12[fin] == 0) {
                ve12[fin] = alm[a];
                f++;
                if (c == 0) {
                    c = alm[a];
                } else {
                    if (alm[a] != b) {
                        c = alm[a];
                        if (alm[a - 1] != c) {
                            b = alm[a - 1];
                        }
                    }
                }
                a++;
                fin++;
                FALLA[11] = "f";
            } else {
                for (int m = 0; m <= 2; m++) {
                    if (ve12[m] != b && ve12[m] != c) {
                        ve12[m] = alm[a];
                    }
                }
                c = alm[a - 1];
                b = alm[a];
                f++;
                a++;
                FALLA[11] = "f";
            }
        }
        band = 0;

//__________________________________________________________________________________________________________
        for (int g = 0; g <= 2; g++) {
            salida2 += LRU[g] + "\t" + ve1[g] + "   " + ve2[g] + "   " + ve3[g] + "   " + ve4[g] + "   " + ve5[g] + "   " + ve6[g] + "   " + ve7[g] + "   " + ve8[g] + "   " + ve9[g] + "   " + ve10[g] + "   " + ve11[g] + "   " + ve12[g] + "\n";
        }
        for (int g = 0; g <= 11; g++) {
            falla += FALLA[g] + "   ";
        }
        sali1 = "_________________________________________" + "\n" + salida2 + "\n" + falla + "\t" + "FALLAS" + "    " + f + "\n" + "______________________________________________________________________________";






////////////////////////////////////////////////OPTIMO/////////////////////////////////////////////////////////////
        for (int x = 0; x <= 2; x++) {
            ve1[x] = 0;//recorre todos los vectores y los iguala a 0
            ve2[x] = 0;
            ve3[x] = 0;
            ve4[x] = 0;
            ve5[x] = 0;
            ve6[x] = 0;
            ve7[x] = 0;
            ve8[x] = 0;
            ve9[x] = 0;
            ve10[x] = 0;
            ve11[x] = 0;
            ve12[x] = 0;
        }
        String OP[] = new String[3];
        OP[0] = " ";
        OP[1] = "OPTIMO";
        OP[2] = " ";
        String salida3 = " ";
        falla = "FALL. " + "\t";
        aux = 0;
        tope = 0;
        fin = 0;
        n = 0;
        a = 0;
        f = 0;
        band = 0;
        int d = 0, recib = 0;
        b = 0;
        c = 0;
//____________________________________________________________________________________________________________________________________________				
        ve1[a] = alm[a];
        f++;
        a++;
        fin++;
        FALLA[0] = "f";
        for (int y2 = 0; y2 <= 2; y2++) {
            ve2[y2] = ve1[y2];
        }
        for (int y = 0; y <= fin; y++) {
            if (ve2[y] == alm[a]) {
                band = 1;
                y++;
            }
        }
        if (band == 1) {
            a++;
            FALLA[1] = " ";
        } else {
            ve2[fin] = alm[a];
            a++;
            f++;
            fin++;
            FALLA[1] = "f";
        }
//_____________________________________________________________________________________________________
        band = 0;
        for (int x = 0; x <= 2; x++) {
            ve3[x] = ve2[x];
        }
        for (int x = 0; x <= fin; x++) {
            if (ve3[x] == alm[a]) {
                x++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[2] = " ";
        } else {
            ve3[fin] = alm[a];
            a++;
            f++;
            fin++;
            FALLA[2] = "f";
        }
        band = 0;
//__________________________________________________________________________________________________________   
        tope = 0;
        for (int h = 0; h <= 2; h++) {
            ve4[h] = ve3[h];
        }
        if (fin > 2) {
            fin--;
        }
        for (int d2 = 0; d2 <= fin; d2++) {
            if (ve4[d2] == alm[a]) {
                d2++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[3] = " ";
        } else {
            if (ve4[fin] == 0) {
                ve4[fin] = alm[a];
                f++;
                a++;
                fin++;
                FALLA[3] = "f";
            } else {
                b = ve4[0];
                c = ve4[1];
                d = ve4[2];
                recib = reco(alm, a, b, c, d);
                if (recib == 3) {
                    ve4[0] = ve4[1];
                    ve4[1] = ve4[2];
                    ve4[2] = alm[a];
                    f++;
                    FALLA[3] = "f";
                    a++;
                } else {
                    ve4[recib] = alm[a];
                    a++;
                    FALLA[3] = "f";
                    f++;
                }
            }
        }
        band = 0;
//__________________________________________________________________________________________________________
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve5[j] = ve4[j];
        }
        for (int d3 = 0; d3 <= 2; d3++) {
            if (alm[a] == ve5[d3]) {
                d3++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[4] = " ";
        } else {
            if (ve5[fin] == 0) {
                ve5[fin] = alm[a];
                f++;
                fin++;
                FALLA[4] = "f ";
                a++;
            } else {
                b = ve5[0];
                c = ve5[1];
                d = ve5[2];
                recib = reco(alm, a, b, c, d);
                if (recib == 3) {
                    ve5[tope] = ve5[tope + 1];
                    ve5[tope + 1] = ve5[fin];
                    ve5[fin] = alm[a];
                    f++;
                    a++;
                    FALLA[4] = "f ";
                } else {
                    ve5[recib] = alm[a];
                    a++;
                    f++;
                    FALLA[4] = "f";
                }
            }
        }
        band = 0;
//________________________________________________________________________________________________________
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve6[j] = ve5[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve6[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[5] = " ";
        } else {
            if (ve6[fin] == 0) {
                ve6[fin] = alm[a];
                f++;
                a++;
                fin++;
                FALLA[5] = "f";
            } else {
                b = ve6[0];
                c = ve6[1];
                d = ve6[2];
                recib = reco(alm, a, b, c, d);
                if (recib == 3) {
                    ve6[tope] = ve6[tope + 1];
                    ve6[tope + 1] = ve6[fin];
                    ve6[fin] = alm[a];
                    f++;
                    a++;
                    FALLA[5] = "f";;
                } else {
                    ve6[recib] = alm[a];
                    a++;
                    FALLA[5] = "f";
                    f++;
                }
            }
        }
        band = 0;
//____________________________________________________________________________________________________________
        if (fin > 2) {
            fin--;
        }

        for (int j = 0; j <= 2; j++) {
            ve7[j] = ve6[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve7[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[6] = " ";
        } else {
            if (ve7[fin] == 0) {
                ve7[fin] = alm[a];
                f++;
                a++;
                fin++;
                FALLA[6] = "f";
            } else {
                b = ve7[0];
                c = ve7[1];
                d = ve7[2];
                recib = reco(alm, a, b, c, d);
                if (recib == 3) {
                    ve7[tope] = ve7[tope + 1];
                    ve7[tope + 1] = ve7[fin];
                    ve7[fin] = alm[a];
                    f++;
                    a++;
                    FALLA[6] = "f";
                } else {
                    ve7[recib] = alm[a];
                    a++;
                    FALLA[6] = "f";
                    f++;
                }
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve8[j] = ve7[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve8[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[7] = " ";
        } else {
            if (ve8[fin] == 0) {
                ve8[fin] = alm[a];
                f++;
                a++;
                fin++;
                FALLA[7] = "f";
            } else {
                b = ve8[0];
                c = ve8[1];
                d = ve8[2];
                recib = reco(alm, a, b, c, d);
                if (recib == 3) {
                    ve8[tope] = ve8[tope + 1];
                    ve8[tope + 1] = ve8[fin];
                    ve8[fin] = alm[a];
                    f++;
                    a++;
                    FALLA[7] = "f";
                } else {
                    ve8[recib] = alm[a];
                    a++;
                    FALLA[7] = "f";
                    f++;
                }
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve9[j] = ve8[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve9[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[8] = " ";
        } else {
            if (ve9[fin] == 0) {
                ve9[fin] = alm[a];
                f++;
                a++;
                fin++;
                FALLA[8] = "f";
            } else {
                b = ve9[0];
                c = ve9[1];
                d = ve9[2];
                recib = reco(alm, a, b, c, d);
                if (recib == 3) {
                    ve9[tope] = ve9[tope + 1];
                    ve9[tope + 1] = ve9[fin];
                    ve9[fin] = alm[a];
                    f++;
                    a++;
                    FALLA[8] = "f";
                } else {
                    ve9[recib] = alm[a];
                    a++;
                    FALLA[8] = "f";
                    f++;
                }
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve10[j] = ve9[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve10[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[9] = " ";
        } else {
            if (ve10[fin] == 0) {
                ve10[fin] = alm[a];
                f++;
                a++;
                fin++;
                FALLA[9] = "f";
            } else {
                b = ve10[0];
                c = ve10[1];
                d = ve10[2];
                recib = reco(alm, a, b, c, d);
                if (recib == 3) {
                    ve10[tope] = ve10[tope + 1];
                    ve10[tope + 1] = ve10[fin];
                    ve10[fin] = alm[a];
                    f++;
                    a++;
                    FALLA[9] = "f";
                } else {
                    ve10[recib] = alm[a];
                    a++;
                    FALLA[9] = "f";
                    f++;
                }
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve11[j] = ve10[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve11[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[10] = " ";
        } else {
            if (ve11[fin] == 0) {
                ve11[fin] = alm[a];
                f++;
                a++;
                fin++;
                FALLA[10] = "f";
            } else {
                b = ve11[0];
                c = ve11[1];
                d = ve11[2];
                recib = reco(alm, a, b, c, d);
                if (recib == 3) {
                    ve11[tope] = ve11[tope + 1];
                    ve11[tope + 1] = ve11[fin];
                    ve11[fin] = alm[a];
                    f++;
                    a++;
                    FALLA[10] = "f";
                } else {
                    ve11[recib] = alm[a];
                    a++;
                    FALLA[10] = "f";
                    f++;
                }
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve12[j] = ve11[j];
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve12[d4]) {
                d4++;
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[11] = " ";
        } else {
            if (ve12[fin] == 0) {
                ve12[fin] = alm[a];
                f++;
                a++;
                fin++;
                FALLA[11] = "f";
            } else {
                b = ve12[0];
                c = ve12[1];
                d = ve12[2];
                recib = reco(alm, a, b, c, d);
                if (recib == 3) {
                    ve12[tope] = ve12[tope + 1];
                    ve12[tope + 1] = ve12[fin];
                    ve12[fin] = alm[a];
                    f++;
                    a++;
                    FALLA[11] = "f";
                } else {
                    ve12[recib] = alm[a];
                    a++;
                    FALLA[11] = "f";
                    f++;
                }
            }
        }
        for (int g = 0; g <= 2; g++) {
            salida3 += OP[g] + "\t" + ve1[g] + "   " + ve2[g] + "   " + ve3[g] + "   " + ve4[g] + "   " + ve5[g] + "   " + ve6[g] + "   " + ve7[g] + "   " + ve8[g] + "   " + ve9[g] + "   " + ve10[g] + "   " + ve11[g] + "   " + ve12[g] + "\n";
        }
        for (int g = 0; g <= 11; g++) {
            falla += FALLA[g] + "   ";
        }
        String sal3 = "_________________________________________" + "\n" + salida3 + "\n" + falla + "\t" + "FALLAS" + "    " + f + "\n" + "______________________________________________________________________________";

//////////////////////////////////////////RELOJ///////////////////////////////////////////////////////////////////
        for (int x = 0; x <= 2; x++) {
            ve1[x] = 0;
            ve2[x] = 0;
            ve3[x] = 0;
            ve4[x] = 0;
            ve5[x] = 0;
            ve6[x] = 0;
            ve7[x] = 0;
            ve8[x] = 0;
            ve9[x] = 0;
            ve10[x] = 0;
            ve11[x] = 0;
            ve12[x] = 0;
        }
        aux = 0;
        tope = 0;
        fin = 0;
        n = 0;
        a = 0;
        f = 0;
        au = 0;
        band = 0;
        String salida6 = " ";
        String RELOJ[] = new String[3];
        RELOJ[0] = " ";
        RELOJ[1] = "RELOJ";
        RELOJ[2] = " ";
        falla = "FALL. " + "\t";
        int v1[] = new int[3];
        int v2[] = new int[3];
        int v3[] = new int[3];
        int v4[] = new int[3];
        int v5[] = new int[3];
        int v6[] = new int[3];
        int v7[] = new int[3];
        int v8[] = new int[3];
        int v9[] = new int[3];
        int v10[] = new int[3];
        int v11[] = new int[3];
        int v12[] = new int[3];

        String s1[] = new String[3];
        String s2[] = new String[3];
        String s3[] = new String[3];
        String s4[] = new String[3];
        String s5[] = new String[3];
        String s6[] = new String[3];
        String s7[] = new String[3];
        String s8[] = new String[3];
        String s9[] = new String[3];
        String s10[] = new String[3];
        String s11[] = new String[3];
        String s12[] = new String[3];

        int ap = 1;
//____________________________________________________________________________________________________________________________________________				
        ve1[a] = alm[a];
        for (int g = 0; g <= 2; g++) {
            v1[g] = 0;
            s1[g] = " ";
        }
        s1[ap] = ">";
        f++;
        a++;
        fin++;
        FALLA[0] = "f";
//______________________________________________ 	
        for (int y2 = 0; y2 <= 2; y2++) {
            ve2[y2] = ve1[y2];
            v2[y2] = 0;
            s2[y2] = " ";
        }
        for (int y = 0; y <= fin; y++) {
            if (ve2[y] == alm[a]) {
                v2[y] = 1;
                s2[ap] = ">";
                band = 1;
                y++;
            }
        }
        if (band == 1) {
            a++;
            FALLA[1] = " ";
        } else {
            ve2[fin] = alm[a];
            a++;
            f++;
            fin++;
            FALLA[1] = "f";
            ap++;
            s2[ap] = ">";
        }
//_____________________________________________________________________________________________________
        band = 0;
        for (int x = 0; x <= 2; x++) {
            ve3[x] = ve2[x];
            v3[x] = v2[x];
            s3[x] = " ";
        }
        for (int x = 0; x <= fin; x++) {
            if (ve3[x] == alm[a]) {
                v3[x] = 1;
                x++;
                band = 1;
                s3[ap] = ">";
            }
        }
        if (band == 1) {
            a++;
            FALLA[2] = " ";
        } else {
            ve3[fin] = alm[a];
            fin++;
            FALLA[2] = "f";
            a++;
            f++;
            if (ap == 2) {
                ap = 0;
                s3[ap] = ">";
            } else {
                ap++;
                s3[ap] = ">";
            }
        }
        band = 0;
//__________________________________________________________________________________________________________   
        for (int h = 0; h <= 2; h++) {
            ve4[h] = ve3[h];
            v4[h] = v3[h];
            s4[h] = " ";
        }
        if (fin > 2) {
            fin--;
        }
        for (int d2 = 0; d2 <= 2; d2++) {
            if (ve4[d2] == alm[a]) {
                v4[d2] = 1;
                d2++;
                s4[ap] = ">";
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[3] = " ";
        } else {
            if (ve4[fin] == 0) {
                ve4[fin] = alm[a];
                if (ap == 2) {
                    ap = 0;
                    s4[ap] = ">";
                    f++;
                    a++;
                    fin++;
                    FALLA[3] = "f";
                } else {
                    f++;
                    a++;
                    ap++;
                    s4[ap] = ">";
                    fin++;
                    FALLA[3] = "f";
                }
            } else {
                if (v4[ap] == 0) {
                    ve4[ap] = alm[a];
                    f++;
                    FALLA[3] = "f ";
                    if (ap == 2) {
                        ap = 0;
                        s4[ap] = ">";
                    } else {
                        ap++;
                        s4[ap] = ">";
                    }
                } else {
                    if (ap == 2) {
                        ap = 0;
                    }
                    for (int k = 0; k <= 2; k++) {
                        if (v4[k] == 0) {
                            ve4[ap] = alm[a];
                            ap++;
                            f++;
                            a++;
                            FALLA[3] = "f ";
                            fin++;
                            s4[ap] = ">";
                            if (ap == 2) {
                                ap = 0;
                                s4[ap] = ">";
                            } else {
                                ap++;
                                s4[ap] = ">";
                            }
                        } else {
                            v4[k] = 0;
                            ap++;
                            if (k == 2) {
                                ap = 0;
                                ve4[ap] = alm[a];
                                ap++;
                                FALLA[3] = "f ";//s9[ap]=">";
                            }
                        }
                    }
                }
                a++;
            }
        }
        band = 0;
//__________________________________________________________________________________________________________
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve5[j] = ve4[j];
            v5[j] = v4[j];
            s5[j] = " ";
        }
        for (int d3 = 0; d3 <= 2; d3++) {
            if (alm[a] == ve5[d3]) {
                v5[d3] = 1;
                d3++;
                s5[ap] = ">";
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[4] = " ";
        } else {
            if (ve5[fin] == 0) {
                ve5[fin] = alm[a];
                if (ap == 2) {
                    ap = 0;
                    s5[ap] = ">";
                    f++;
                    a++;
                    fin++;
                    FALLA[4] = "f";
                } else {
                    f++;
                    a++;
                    ap++;
                    s5[ap] = ">";
                    fin++;
                    FALLA[4] = "f";
                }
            } else {
                if (v5[ap] == 0) {
                    ve5[ap] = alm[a];
                    f++;
                    FALLA[4] = "f ";
                    if (ap == 2) {
                        ap = 0;
                        s5[ap] = ">";
                    } else {
                        ap++;
                        s5[ap] = ">";
                    }
                } else {
                    if (ap == 2) {
                        ap = 0;
                    }
                    for (int k = ap; k <= 2; k++) {
                        if (v5[k] == 0) {
                            ve5[k] = alm[a];
                            f++;
                            FALLA[4] = "f ";
                            ap++;
                            s5[ap] = ">";
                            k = 3;
                        } else {
                            v5[k] = 0;
                            ap++;
                            if (k == 2) {
                                ap = 0;
                                ve5[ap] = alm[a];
                                ap++;
                                FALLA[4] = "f ";//s9[ap]=">";
                            }
                        }
                    }
                }
                a++;
            }
        }
        band = 0;
//________________________________________________________________________________________________________
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve6[j] = ve5[j];
            v6[j] = v5[j];
            s6[j] = " ";
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve6[d4]) {
                v6[d4] = 1;
                d4++;
                s6[ap] = ">";
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[5] = " ";
        } else {
            if (ve6[fin] == 0) {
                ve6[fin] = alm[a];
                if (ap == 2) {
                    ap = 0;
                    s6[ap] = ">";
                    f++;
                    a++;
                    fin++;
                    FALLA[5] = "f";
                } else {
                    f++;
                    a++;
                    ap++;
                    s6[ap] = ">";
                    fin++;
                    FALLA[5] = "f";
                }
            } else {
                if (v6[ap] == 0) {
                    ve6[ap] = alm[a];
                    f++;
                    FALLA[5] = "f ";//s6[ap]=">";
                    if (ap == 2) {
                        ap = 0;
                        s6[ap] = ">";
                    } else {
                        ap++;
                        s6[ap] = ">";
                    }
                } else {
                    if (ap == 2) {
                        ap = 0;
                    }
                    for (int k1 = ap; k1 <= 2; k1++) {
                        if (v6[k1] == 0) {
                            ve6[k1] = alm[a];
                            k1 = 2;
                            f++;
                            FALLA[5] = "f ";
                            s6[ap] = ">";
                            if (ap == 2) {
                                ap = 0;
                                s6[ap] = ">";
                            }
                        } else {
                            v6[k1] = 0;
                            ap++;
                            if (k1 == 2) {
                                ap = 0;
                                ve6[ap] = alm[a];
                                ap++;
                                FALLA[5] = "f ";//s9[ap]=">";
                            }
                        }
                    }
                }
                a++;
            }
        }
        band = 0;
//____________________________________________________________________________________________________________
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve7[j] = ve6[j];
            v7[j] = v6[j];
            s7[j] = " ";
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve7[d4]) {
                v7[d4] = 1;
                d4++;
                s7[ap] = ">";
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[6] = " ";
        } else {
            if (ve7[fin] == 0) {
                ve7[fin] = alm[a];
                if (ap == 2) {
                    ap = 0;
                    s7[ap] = ">";
                    f++;
                    a++;
                    fin++;
                    FALLA[6] = "f";
                } else {
                    f++;
                    a++;
                    ap++;
                    s7[ap] = ">";
                    fin++;
                    FALLA[6] = "f";
                }
            } else {//System.out.println("7 "+a );
                if (v7[ap] == 0) {
                    ve7[ap] = alm[a];
                    f++;
                    FALLA[6] = "f ";
                    if (ap == 2) {
                        ap = 0;
                        s7[ap] = ">";
                    } else {
                        ap++;
                        s7[ap] = ">";
                    }
                } else {
                    if (ap == 2) {
                        ap = 0;
                    }
                    for (int k = ap; k <= 2; k++) {
                        if (v7[k] == 0) {
                            ve7[k] = alm[a];
                            k = 2;
                            f++;
                            FALLA[6] = "f ";
                            s7[ap] = ">";
                            if (ap == 2) {
                                ap = 0;
                                s7[ap] = ">";
                            }
                        } else {
                            v7[k] = 0;
                            ap++;
                            if (k == 2) {
                                ap = 0;
                                ve7[ap] = alm[a];
                                ap++;
                                FALLA[6] = "f ";//s9[ap]=">";
                            }
                        }
                    }
                }
                a++;
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve8[j] = ve7[j];
            v8[j] = v7[j];
            s8[j] = " ";
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve8[d4]) {
                v8[d4] = 1;
                d4++;
                s8[ap] = ">";
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[7] = " ";
        } else {
            if (ve8[fin] == 0) {
                ve8[fin] = alm[a];
                if (ap == 2) {
                    ap = 0;
                    s8[ap] = ">";
                    f++;
                    a++;
                    fin++;
                    FALLA[7] = "f";
                } else {
                    f++;
                    a++;
                    ap++;
                    s8[ap] = ">";
                    fin++;
                    FALLA[7] = "f";
                }
            } else {
                if (v8[ap] == 0) {
                    ve8[ap] = alm[a];
                    f++;
                    FALLA[7] = "f ";
                    if (ap == 2) {
                        ap = 0;
                        s8[ap] = ">";
                    } else {
                        ap++;
                        s8[ap] = ">";
                    }
                } else {
                    if (ap == 2) {
                        ap = 0;
                    }
                    for (int k = ap; k <= 2; k++) {
                        if (v8[k] == 0) {
                            ve8[k] = alm[a];
                            k = 2;
                            f++;
                            FALLA[7] = "f ";
                            s8[ap] = ">";
                            if (ap == 2) {
                                ap = 0;
                                s8[ap] = ">";
                            }
                        } else {
                            v8[k] = 0;
                            ap++;
                            if (k == 2) {
                                ap = 0;
                                ve8[ap] = alm[a];
                                ap++;
                                FALLA[7] = "f ";//s9[ap]=">";
                            }
                        }
                    }
                }
                a++;
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve9[j] = ve8[j];
            v9[j] = v8[j];
            s9[j] = " ";
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve9[d4]) {
                v9[d4] = 1;
                d4++;
                s9[ap] = ">";
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[8] = " ";
        } else {
            if (ve9[fin] == 0) {
                ve9[fin] = alm[a];
                if (ap == 2) {
                    ap = 0;
                    s9[ap] = ">";
                    f++;
                    a++;
                    fin++;
                    FALLA[8] = "f";
                } else {
                    f++;
                    a++;
                    ap++;
                    s9[ap] = ">";
                    fin++;
                    FALLA[8] = "f";
                }
            } else {
                if (v9[ap] == 0) {
                    ve9[ap] = alm[a];
                    f++;
                    FALLA[8] = "f ";
                    if (ap == 2) {
                        ap = 0;
                        s9[ap] = ">";
                    } else {
                        ap++;
                        s9[ap] = ">";
                    }
                } else {
                    if (ap == 2) {
                        ap = 0;
                    }
                    for (int k = ap; k <= 2; k++) {
                        //System.out.println("x"+v9[k] );
                        if (v9[k] == 0) {
                            ve9[k] = alm[a];
                            k = 2;
                            f++;
                            FALLA[8] = "f ";
                            if (ap == 2) {
                                ap = 0;
                                s9[ap] = ">";
                            }
                        } else {
                            v9[k] = 0;
                            ap++;
                            if (k == 2) {
                                ap = 0;
                                ve9[ap] = alm[a];
                                ap++;
                                FALLA[8] = "f ";
                            }
                        }
                    }
                }
                a++;
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve10[j] = ve9[j];
            v10[j] = v9[j];
            s10[j] = " ";
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve10[d4]) {
                v10[d4] = 1;
                d4++;
                s10[ap] = ">";
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[9] = " ";
        } else {
            if (ve10[fin] == 0) {
                ve10[fin] = alm[a];
                if (ap == 2) {
                    ap = 0;
                    s10[ap] = ">";
                    f++;
                    a++;
                    fin++;
                    FALLA[9] = "f";
                } else {
                    f++;
                    a++;
                    ap++;
                    s10[ap] = ">";
                    fin++;
                    FALLA[9] = "f";
                }
            } else {
                if (v10[ap] == 0) {
                    ve10[ap] = alm[a];
                    f++;
                    FALLA[9] = "f ";
                    if (ap == 2) {
                        ap = 0;
                        s10[ap] = ">";
                    } else {
                        ap++;
                        s10[ap] = ">";
                    }
                } else {
                    if (ap == 2) {
                        ap = 0;
                    }
                    for (int k = ap; k <= 2; k++) {
                        if (v10[k] == 0) {
                            ve10[k] = alm[a];
                            k = 2;
                            f++;
                            FALLA[9] = "f ";
                            s10[ap] = ">";
                            if (ap == 2) {
                                ap = 0;
                                s10[ap] = ">";
                            }
                        } else {
                            v10[k] = 0;
                            ap++;
                            if (k == 2) {
                                ap = 0;
                                ve10[ap] = alm[a];
                                ap++;
                                FALLA[9] = "f ";
                            }
                        }
                    }
                }
                a++;
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }	//System.out.print("ff3+ "+ap);
        for (int j = 0; j <= 2; j++) {
            ve11[j] = ve10[j];
            v11[j] = v10[j];
            s11[j] = " ";
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve11[d4]) {
                v11[d4] = 1;
                d4++;
                s11[ap] = ">";
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[10] = " ";
        } else {
            if (ve11[fin] == 0) {
                ve11[fin] = alm[a];
                if (ap == 2) {
                    ap = 0;
                    s10[ap] = ">";
                    f++;
                    a++;
                    fin++;
                    FALLA[10] = "f";
                } else {
                    f++;
                    a++;
                    ap++;
                    s9[ap] = ">";
                    fin++;
                    FALLA[10] = "f";
                }
            } else {
                if (v11[ap] == 0) {
                    ve11[ap] = alm[a];
                    f++;
                    FALLA[10] = "f ";
                    if (ap == 2) {
                        ap = 0;
                        s11[ap] = ">";
                    } else {
                        ap++;
                        s11[ap] = ">";
                    }
                } else {
                    if (ap == 2) {
                        ap = 0;
                    }
                    for (int k = ap; k <= 2; k++) {
                        if (v11[k] == 0) {
                            ve11[k] = alm[a];
                            k = 2;
                            f++;
                            FALLA[10] = "f ";
                            s11[ap] = ">";
                            if (ap == 2) {
                                ap = 0;
                                s11[ap] = ">";
                            }
                        } else {
                            v11[k] = 0;
                            if (k == 2) {
                                ap = 0;
                                ve11[ap] = alm[a];
                                ap++;
                                FALLA[10] = "f ";
                            }
                        }
                    }
                }
                a++;
            }
        }
        band = 0;
//__________________________________________________________________________________________________________-
        if (fin > 2) {
            fin--;
        }
        for (int j = 0; j <= 2; j++) {
            ve12[j] = ve11[j];
            v12[j] = v11[j];
            s12[j] = " ";
        }
        for (int d4 = 0; d4 <= fin; d4++) {
            if (alm[a] == ve12[d4]) {
                v12[d4] = 1;
                d4++;
                s12[ap] = ">";
                band = 1;
            }
        }
        if (band == 1) {
            a++;
            FALLA[11] = " ";
        } else {
            if (ve12[fin] == 0) {
                ve12[fin] = alm[a];
                if (ap == 2) {
                    ap = 0;
                    s9[ap] = ">";
                    f++;
                    a++;
                    fin++;
                    FALLA[11] = "f";
                } else {
                    f++;
                    a++;
                    ap++;
                    s9[ap] = ">";
                    fin++;
                    FALLA[11] = "f";
                }
            } else {
                if (v12[ap] == 0) {//System.out.print("aa   "+ ap);
                    ve12[ap] = alm[a];
                    f++;
                    FALLA[11] = "f ";
                    if (ap == 2) {
                        ap = 0;
                        s12[ap] = ">";
                    } else {
                        ap++;
                        s12[ap] = ">";
                    }
                } else {
                    if (ap == 2) {
                        ap = 0;
                    }
                    for (int k = ap; k <= 2; k++) {
                        if (v12[k] == 0) {
                            ve12[k] = alm[a];
                            k = 2;
                            f++;
                            FALLA[11] = "f ";
                            s12[ap] = ">";
                            if (ap == 2) {
                                ap = 0;
                                s12[ap] = ">";
                            }
                        } else {
                            v12[k] = 0;
                            if (k == 2) {
                                ap = 0;
                                ve11[ap] = alm[a];
                                ap++;
                                FALLA[10] = "f ";//s9[ap]=">";
                            }
                        }
                    }
                }
            }
        }
        band = 0;
//__________________________________________-

        for (int g = 0; g <= 2; g++) {
            salida6 += RELOJ[g] + "\t" + s1[g] + ve1[g] + v1[g] + "   " + s2[g] + ve2[g] + v2[g] + "   " + s3[g] + ve3[g] + v3[g] + "   " + s4[g] + ve4[g] + v4[g] + "   " + s5[g] + ve5[g] + v5[g] + "   " + s6[g] + ve6[g] + v6[g] + "   " + s7[g] + ve7[g] + v7[g] + "   " + s8[g] + ve8[g] + v8[g] + "   " + s9[g] + ve9[g] + v9[g] + "   " + s10[g] + ve10[g] + v10[g] + "   " + s11[g] + ve11[g] + v11[g] + "   " + s12[g] + ve12[g] + v12[g] + "\n";
        }
        for (int g = 0; g <= 11; g++) {
            falla += FALLA[g] + "   ";

        }
        String sal4 = "\n" + "_________________________________________" + "\n" + salida6 + "\n" + falla + "\t" + "FALLAS" + "    " + f + "\n" + "______________________________________________________________________________";

        salidon = sal + "\n" + sali1 + "\n" + sal3 + "\n"+ sal4;
        return salidon;
    }

    /** Llama a imprimir los datos*/
    public void impresion() {
        String ImpresionDeSalida = cadena();
        System.out.println(ImpresionDeSalida);

    }
}

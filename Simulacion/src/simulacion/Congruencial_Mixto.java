/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores;

import javax.swing.JOptionPane;

/**
 *
 * @author jacc
 */
public class Congruencial_Mixto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        double valido =0;
        boolean comprobarEntero=true;
        int verdadero=0;
        while(comprobarEntero){
        try {
        verdadero= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese modulo"));
        comprobarEntero = false;
        } catch (NumberFormatException e) {                

        }
        }
        valido=verdadero;

            double modulo = Math.pow(2, valido);

            comprobarEntero=true;
            verdadero=0;
            while(comprobarEntero){
            try {
            verdadero= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese multiplicador"));
            comprobarEntero = false;
            } catch (NumberFormatException e) {                

            }
            }



                        int variable = verdadero;

                        int multiplicador = 1 + (4 * variable);

                        int const_aditiva = (int) obtenerPrimoFinal(modulo);
                        double semilla = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese semilla"));

                        boolean semillavalida= true;
                        while(semillavalida){
                        if(semilla>0){
                        semillavalida=false;
                        }else{
                        semilla = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese semilla"));
                        }
                        }




                        double Xn1=0;
                        System.out.println("°N" + "\t" + "Xn" + "\t" + "Xn+1" + "\t" + "N_Uniformes");
                        double verificarPer=semilla/modulo;

                        for (int i = 1; i <= modulo; i++) {
                        int cont=1;
                        Xn1 = (multiplicador * semilla + const_aditiva) % modulo;
                        System.out.println(i + "\t" + semilla + "\t" + Xn1 + "\t" +Xn1+"/"+modulo);
                        semilla =  Xn1;
                        if(verificarPer==Xn1/modulo){
                        cont++;
                        }
                        } }

                                                
                                                
                                                static double obtenerPrimoFinal(double numero) {
                                                int contador = 2;
                                                boolean primo = true;

                                                while ((primo) && (contador != numero)) {
                                                if (numero % contador == 0) {
                                                primo = false;
                                                }
                                                contador++;
                                                }

                                                if (primo) {
                                                return numero;
                                                } else {
                                                return obtenerPrimoFinal(numero - 1);
                                                }

                                                    }





                                                static boolean VerificarPrimo(int numero) {
                                                int contador = 2;
                                                boolean primo = true;
                                                while ((primo) && (contador != numero)) {
                                                if (numero % contador == 0) {
                                                primo = false;
                                                }
                                                contador++;
                                                }
                                                return primo;
                                                }

                                                }

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_returne;

/**
 *
 * @author flac3
 */
public class EVA3_2_RETURNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor;
        valor = sumarDosEnteros(100,50);
        System.out.println("Resultado = "+ valor );
        System.out.println("Resultado = "+ sumarDosEnteros(100,50));
        sumarDosEnteros(100,50);
    }
    //SUMAR DOS ENTEROS
    public static int sumarDosEnteros(int num1,int num2){
        int resu;
        resu = num1 + num2;
        return resu;
                
     }
}

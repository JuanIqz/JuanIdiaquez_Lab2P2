/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juanidiaquez_lab2p2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JuanIdiaquez_Lab2P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pd = new Scanner(System.in);
        String contraseñaE = "02112005";
        //la contraseña es 02112005
        System.out.println("Bienvenido al sistema de control del restaurante");
        int banderaI = 0;
        while (banderaI != 2) {
            System.out.println("Sus opciones son las siguientes:");
            System.out.println();
            System.out.println("1.Iniciar sesion");
            System.out.println("2.Salir ");
            System.out.println();
            System.out.println("Ingrese el numero de enfrente de la opcion para selecionarla");
            int menu1 = pd.nextInt();
            switch (menu1) {
                case 1:
                    //la contraseña es de formato numerico
                    System.out.println("Bienvenido usuario, ingrese su contraseña numerica:");
                    String contraseñaT = pd.next();
                    if (contraseñaT.contentEquals(contraseñaE)) {
                        int banderaM2 = 0;
                        while (banderaM2 != 5) {
                            System.out.println("Bienvenido al sistema, que empleados o recursos desea gestionar");
                            System.out.println("Estas son sus opciones:");
                            System.out.println();
                            System.out.println("1.Chefs");
                            System.out.println("2.Meseros ");
                            System.out.println("3.Bartenders ");
                            System.out.println("4.Mesas");
                            System.out.println("5.Salir");
                            System.out.println();
                            System.out.println("Ingrese el numero de enfrente de la opcion para selecionarla");
                            int menu2=pd.nextInt();
                            
                            switch(menu2){
                                case 1:
                                    int bandiC = 0;
                                    while (bandiC != 5) {
                                        System.out.println("Bienvenido, esta en el apartado de Chefs");
                                        System.out.println("Estas son sus opciones:");
                                        System.out.println();
                                        System.out.println("1.Crear un chef");
                                        System.out.println("2.Listar chefs");
                                        System.out.println("3.Modificar un chef");
                                        System.out.println("4.Eliminar un chef");
                                        System.out.println("5.Salir");
                                        System.out.println();
                                        System.out.println("Ingrese el numero de enfrente de la opcion para selecionarla");
                                    }
                                    break;
                                case 2:
                                    int bandiM = 0;
                                    while (bandiM != 5) {
                                        System.out.println("Bienvenido, esta en el apartado de Meseros");
                                        System.out.println("Estas son sus opciones:");
                                        System.out.println();
                                        System.out.println("1.Crear un mesero");
                                        System.out.println("2.Listar meseros");
                                        System.out.println("3.Modificar un mesero");
                                        System.out.println("4.Eliminar un mesero");
                                        System.out.println("5.Salir");
                                        System.out.println();
                                        System.out.println("Ingrese el numero de enfrente de la opcion para selecionarla");
                                    }
                                    break;
                                case 3:
                                    int bandiB = 0;
                                    while (bandiB != 5) {
                                        System.out.println("Bienvenido, esta en el apartado de Bartenders");
                                        System.out.println("Estas son sus opciones:");
                                        System.out.println();
                                        System.out.println("1.Crear un bartender");
                                        System.out.println("2.Listar bartenders");
                                        System.out.println("3.Modificar un bartender");
                                        System.out.println("4.Eliminar un bartender");
                                        System.out.println("5.Salir");
                                        System.out.println();
                                        System.out.println("Ingrese el numero de enfrente de la opcion para selecionarla");
                                    }
                                    break;
                                case 4:
                                   int bandiMe = 0;
                                    while (bandiMe != 5) {
                                        System.out.println("Bienvenido, esta en el apartado de Mesas");
                                        System.out.println("Estas son sus opciones:");
                                        System.out.println();
                                        System.out.println("1.Crear una Mesa");
                                        System.out.println("2.Listar Mesas");
                                        System.out.println("3.Modificar una Mesas");
                                        System.out.println("4.Eliminar una Mesa");
                                        System.out.println("5.Salir");
                                        System.out.println();
                                        System.out.println("Ingrese el numero de enfrente de la opcion para selecionarla");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Ejecucion total terminada, saliendo....");
                                    banderaM2 = 5;
                                    banderaI = 2;
                                    break;
                                default:
                                    System.out.println("Opcion invalida, trate nuevamente");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Contraseña incorrecta, pruebe con otra");
                    }
                    break;
                case 2:
                    System.out.println("Saliendo....");
                    banderaI = 2;
                    break;
                default:
                    System.out.println("Opcion invalida, trate nuevamente");
                    break;
            }
        }

    }
    
}

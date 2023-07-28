/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juanidiaquez_lab2p2;

import java.util.ArrayList;
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
        ArrayList<Chefs> Chefs = new ArrayList();
        ArrayList<Meseros> Meseros = new ArrayList();
        ArrayList<Bartenders> Bartenders = new ArrayList();
        ArrayList<Mesas> Mesas = new ArrayList();
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
                            int menu2 = pd.nextInt();

                            switch (menu2) {
                                case 1:
                                    int bandiC = 0;
                                    while (bandiC != 5) {
                                        int contadorM = 0;
                                        int contadorV = 0;
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
                                        int menuC = pd.nextInt();
                                        if (menuC == 1) {
                                            if (contadorM != 7 || contadorV != 7) {
                                                System.out.println("Agregue el nombre del chef");
                                                String N = pd.next();
                                                System.out.println("Agregue la edad de su chef");
                                                int E = pd.nextInt();
                                                System.out.println("Defina en que turno trabajara");
                                                String T = pd.next();
                                                T.toLowerCase();
                                                if (T.contentEquals("matutino")) {
                                                    contadorM++;
                                                } else if (T.contentEquals("vespertino")) {
                                                    contadorV++;
                                                }
                                                System.out.println("Defina cuantas estrellas michelin tiene su chef");
                                                int ES = pd.nextInt();
                                                System.out.println("Defina el sueldo del chef");
                                                double S = pd.nextDouble();
                                                Chefs.add(new Chefs(N, E, T, ES, S));
                                            } else {
                                                System.out.println("No se pueden agregar mas chefs debido a que ya tiene 14 contratados");
                                            }
                                        } else if (menuC == 2) {
                                            System.out.println(Chefs);
                                        } else if (menuC == 3) {
                                            System.out.println("Ingrese la posicion del chef a modificar");
                                            int p = pd.nextInt();
                                            if (p != -1 && p < Chefs.size()) {
                                                System.out.println("Agregue el nombre del chef");
                                                String N = pd.next();
                                                System.out.println("Agregue la edad de su chef");
                                                int E = pd.nextInt();
                                                System.out.println("Defina en que turno trabajara");
                                                String T = pd.next();
                                                System.out.println("Defina cuantas estrellas michelin tiene su chef");
                                                int ES = pd.nextInt();
                                                System.out.println("Defina el sueldo del chef");
                                                double S = pd.nextDouble();
                                                Chefs.remove(p);
                                                Chefs.add(new Chefs(N, E, T, ES, S));
                                            } else {
                                                System.out.println("Posicion no valida");
                                            }
                                        } else if (menuC == 4) {
                                            System.out.println("ingrese la posicion que desea eliminar");
                                            int p = pd.nextInt();
                                            if (p != -1 && p < Chefs.size()) {
                                                Chefs.remove(p);
                                            } else {
                                                System.out.println("Posicion no valida");
                                            }
                                        } else if (menuC == 5) {
                                            System.out.println("Saliendo....");
                                            bandiC = 5;
                                        }
                                    }
                                    break;
                                case 2:
                                    int bandiM = 0;
                                    while (bandiM != 5) {
                                        int contadorM = 0;
                                        int contadorV = 0;
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
                                        int menuM = pd.nextInt();
                                        if (menuM == 1) {
                                            if (contadorM != 4 || contadorV != 4) {
                                                System.out.println("Agregue el nombre del mesero");
                                                String N = pd.next();
                                                System.out.println("Agregue la edad de su mesero");
                                                int E = pd.nextInt();
                                                System.out.println("Defina en que turno trabajara");
                                                String T = pd.next();
                                                T.toLowerCase();
                                                if (T.contentEquals("matutino")) {
                                                    contadorM++;
                                                } else if (T.contentEquals("vespertino")) {
                                                    contadorV++;
                                                }
                                                System.out.println("Defina la propina del mesero");
                                                double ES = pd.nextInt();
                                                System.out.println("Defina el sueldo del mesero");
                                                double S = pd.nextDouble();
                                                Meseros.add(new Meseros(N, E, T, ES, S));
                                            } else {
                                                System.out.println("No se pueden agregar mas Meseros debido a que ya tiene 8 contratados");
                                            }
                                        } else if (menuM == 2) {
                                            System.out.println(Meseros);
                                        } else if (menuM == 3) {
                                            System.out.println("Ingrese la posicion del Mesero a modificar");
                                            int p = pd.nextInt();
                                            if (p != -1 && p < Meseros.size()) {
                                                System.out.println("Agregue el nombre del Mesero");
                                                String N = pd.next();
                                                System.out.println("Agregue la edad de su Mesero");
                                                int E = pd.nextInt();
                                                System.out.println("Defina en que turno trabajara");
                                                String T = pd.next();
                                                System.out.println("Defina la propina");
                                                int ES = pd.nextInt();
                                                System.out.println("Defina el sueldo del Mesero");
                                                double S = pd.nextDouble();
                                                Meseros.remove(p);
                                                Meseros.add(new Meseros(N, E, T, ES, S));
                                            } else {
                                                System.out.println("Posicion no valida");
                                            }
                                        } else if (menuM == 4) {
                                            System.out.println("ingrese la posicion que desea eliminar");
                                            int p = pd.nextInt();
                                            if (p != -1 && p < Meseros.size()) {
                                                Meseros.remove(p);
                                            } else {
                                                System.out.println("Posicion no valida");
                                            }
                                        } else if (menuM == 5) {
                                            System.out.println("Saliendo....");
                                            bandiM = 5;
                                        }
                                    }
                                    break;
                                case 3:
                                    int bandiB = 0;
                                    int contadorM = 0;
                                    int contadorV = 0;
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
                                        int menuB = pd.nextInt();
                                        if (menuB == 1) {
                                            if (contadorM != 2 || contadorV != 2) {
                                                System.out.println("Agregue el nombre del bartender");
                                                String N = pd.next();
                                                System.out.println("Agregue la edad de su bartender");
                                                int E = pd.nextInt();
                                                System.out.println("Defina en que turno trabajara");
                                                String T = pd.next();
                                                T.toLowerCase();
                                                if (T.contentEquals("matutino")) {
                                                    contadorM++;
                                                } else if (T.contentEquals("vespertino")) {
                                                    contadorV++;
                                                }
                                                System.out.println("Defina el numero de licores que tiene el bartender");
                                                int L = pd.nextInt();
                                                System.out.println("Defina el sueldo del bartender");
                                                double S = pd.nextDouble();
                                                Bartenders.add(new Bartenders(N, E, T, L, S));
                                            } else {
                                                System.out.println("No se pueden agregar mas bartenders debido a que ya tiene 4 contratados");
                                            }
                                        } else if (menuB == 2) {
                                            System.out.println(Bartenders);
                                        } else if (menuB == 3) {
                                            System.out.println("Ingrese la posicion del Bartender a modificar");
                                            int p = pd.nextInt();
                                            if (p != -1 && p < Meseros.size()) {
                                                System.out.println("Agregue el nombre del Bartender");
                                                String N = pd.next();
                                                System.out.println("Agregue la edad de su Bartender");
                                                int E = pd.nextInt();
                                                System.out.println("Defina en que turno trabajara");
                                                String T = pd.next();
                                                System.out.println("Defina el numero de licores que tiene el bartender");
                                                int L = pd.nextInt();
                                                System.out.println("Defina el sueldo del bartender");
                                                double S = pd.nextDouble();
                                                Bartenders.remove(p);
                                                Bartenders.add(new Bartenders(N, E, T, L, S));
                                            } else {
                                                System.out.println("Posicion no valida");
                                            }
                                        } else if (menuB == 4) {
                                            System.out.println("ingrese la posicion que desea eliminar");
                                            int p = pd.nextInt();
                                            if (p != -1 && p < Bartenders.size()) {
                                                Bartenders.remove(p);
                                            } else {
                                                System.out.println("Posicion no valida");
                                            }
                                        } else if (menuB == 5) {
                                            System.out.println("Saliendo....");
                                            bandiB = 5;
                                        }
                                    }
                                    break;
                                case 4:
                                    int bandiMe = 0;
                                    int contadorNM = 0;
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
                                        int menuMM = pd.nextInt();
                                        if (menuMM == 1) {
                                            if (contadorNM != 10) {
                                                contadorNM++;
                                                System.out.println("Agregue el numero de platos de su mesa");
                                                int E = pd.nextInt();
                                                System.out.println("Agregue el numero de utensilios de su mesa");
                                                int L = pd.nextInt();
                                                System.out.println("Defina el precio de su mesa");
                                                double S = pd.nextDouble();
                                                Mesas.add(new Mesas(E, L, S));
                                            } else {
                                                System.out.println("No se pueden agregar mas mesas debido a que ya tiene 10");
                                            }
                                        } else if (menuMM == 2) {
                                            System.out.println(Mesas);
                                        } else if (menuMM == 3) {
                                            System.out.println("Ingrese la posicion de la mesa a modificar");
                                            int p = pd.nextInt();
                                            if (p != -1 && p < Mesas.size()) {
                                                System.out.println("Agregue el numero de platos de su mesa");
                                                int E = pd.nextInt();
                                                System.out.println("Agregue el numero de utensilios de su mesa");
                                                int L = pd.nextInt();
                                                System.out.println("Defina el precio de su mesa");
                                                double S = pd.nextDouble();
                                                Mesas.add(new Mesas(E, L, S));
                                            } else {
                                                System.out.println("Posicion no valida");
                                            }
                                        } else if (menuMM == 4) {
                                            System.out.println("ingrese la posicion que desea eliminar");
                                            int p = pd.nextInt();
                                            if (p != -1 && p < Mesas.size()) {
                                                Mesas.remove(p);
                                            } else {
                                                System.out.println("Posicion no valida");
                                            }
                                        } else if (menuMM == 5) {
                                            System.out.println("Saliendo....");
                                            bandiMe = 5;
                                        }
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

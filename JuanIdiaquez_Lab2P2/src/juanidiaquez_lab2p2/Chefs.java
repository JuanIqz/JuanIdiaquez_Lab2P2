/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juanidiaquez_lab2p2;

/**
 *
 * @author User
 */
public class Chefs {
    private String Nombre;
    private int Edad;
    private String Turno;
    private int NMichellin;
    private double Sueldo;
    
    public Chefs(){
    }

    public Chefs(String Nombre, int Edad, String Turno, int NMichellin, double Sueldo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Turno = Turno;
        this.NMichellin = NMichellin;
        this.Sueldo = Sueldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public int getNMichellin() {
        return NMichellin;
    }

    public void setNMichellin(int NMichellin) {
        this.NMichellin = NMichellin;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "Chefs{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Turno=" + Turno + ", NMichellin=" + NMichellin + ", Sueldo=" + Sueldo + "}\n";
    }
    
    
}

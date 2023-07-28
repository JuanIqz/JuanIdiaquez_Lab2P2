/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juanidiaquez_lab2p2;

/**
 *
 * @author User
 */
public class Meseros {
    private String Nombre;
    private int Edad;
    private String Turno;
    private double Propina;
    private double Sueldo;

    public Meseros() {
    }

    public Meseros(String Nombre, int Edad, String Turno, double Propina, double Sueldo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Turno = Turno;
        this.Propina = Propina;
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

    public double getPropina() {
        return Propina;
    }

    public void setPropina(double Propina) {
        this.Propina = Propina;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "Meseros{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Turno=" + Turno + ", Propina=" + Propina + ", Sueldo=" + Sueldo + "}\n";
    }
    
    
}

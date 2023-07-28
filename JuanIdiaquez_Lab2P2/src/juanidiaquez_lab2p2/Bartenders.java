/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juanidiaquez_lab2p2;

/**
 *
 * @author User
 */
public class Bartenders {
    private String Nombre;
    private int Edad;
    private String Turno;
    private int NLicores;
    private double Sueldo;

    public Bartenders() {
    }

    public Bartenders(String Nombre, int Edad, String Turno, int NLicores, double Sueldo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Turno = Turno;
        this.NLicores = NLicores;
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

    public int getNLicores() {
        return NLicores;
    }

    public void setNLicores(int NLicores) {
        this.NLicores = NLicores;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "Bartenders{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Turno=" + Turno + ", NLicores=" + NLicores + ", Sueldo=" + Sueldo + "}\n";
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juanidiaquez_lab2p2;

/**
 *
 * @author User
 */
public class Mesas {
    private int NUtensilios;
    private int NPlatos;
    private double Precio;

    public Mesas() {
    }

    public Mesas(int NUtensilios, int NPlatos, double Precio) {
        this.NUtensilios = NUtensilios;
        this.NPlatos = NPlatos;
        this.Precio = Precio;
    }

    public int getNUtensilios() {
        return NUtensilios;
    }

    public void setNUtensilios(int NUtensilios) {
        this.NUtensilios = NUtensilios;
    }

    public int getNPlatos() {
        return NPlatos;
    }

    public void setNPlatos(int NPlatos) {
        this.NPlatos = NPlatos;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Mesas{" + "NUtensilios=" + NUtensilios + ", NPlatos=" + NPlatos + ", Precio=" + Precio + "}\n";
    }
    
    
}

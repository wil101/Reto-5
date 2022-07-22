/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemon;

/**
 *
 * @author WilmarOS
 */
public class Wartortle extends Pokemon {

    private String nombre;
    private Byte nivel;
    private int salud;
   
    public Wartortle(String nombre, Byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
    
    public String getNombre() {
        return nombre;
    }

    public Byte getNivel() {
        return nivel;
    }

    public int getSalud() {
        return salud;
    }
    
    

    @Override
    public Pokemon evolucionar() {
        return null;
    }

    @Override
    public String gritar() {
         return "Wartortle!";
    }
}

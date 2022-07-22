package Pokemon;

public class Raichu extends Pokemon{
    
    private String nombre;
    private Byte nivel;
    private int salud;

    public Raichu(String nombre, Byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    } 

    public int getSalud() {
        return this.salud;
    }

    public Byte getNivel() {
        return this.nivel; 
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public Pokemon evolucionar() {
        return null;
    }

    @Override
    public String gritar(){
        return "Raichu!";
    }
}

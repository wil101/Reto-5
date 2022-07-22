package Pokemon;

public class Main {
    public static void main(String[] args){
    Charmander charmander = new Charmander("L", (byte)5, 1200);

    Pokemon charmeleon = charmander.evolucionar();

    Pokemon charizard = charmeleon.evolucionar();
    
    Squirtle Squirtle = new Squirtle("lila", (byte)18 ,2000);

    Pokemon Wartortle = Squirtle.evolucionar();

    Pokemon Blastoise = Wartortle.evolucionar();
        
    Pikachu Pikachu = new Pikachu("pi", (byte)15 , 1800);
    
    Pokemon Raichu = Pikachu.evolucionar();
       
    System.out.println(charmander.gritar());
    System.out.println(charmeleon.gritar());
    System.out.println(charizard.gritar());
    System.out.println(Squirtle.gritar());
    System.out.println(Wartortle.gritar());
    System.out.println(Blastoise.gritar());
    System.out.println(Pikachu.gritar());
    System.out.println(Raichu.gritar());
        
    }
}

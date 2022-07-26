package Pokemon;

public class Main {
    public static void main(String[] args){
    Charmander charmander = new Charmander("L", (byte)5, 1200);

    Pokemon charmeleon = charmander.evolucionar();

    Pokemon charizard = charmeleon.evolucionar();
    
    Squirtle squirtle = new Squirtle("lila", (byte)18 ,2000);

    Pokemon wartortle = squirtle.evolucionar();

    Pokemon blastoise = wartortle.evolucionar();
        
    Pikachu pikachu = new Pikachu("pi", (byte)15 , 1800);
    
    Pokemon raichu = pikachu.evolucionar();

    Pokebola pokebola = new Pokebola(charmander);

    Pokebola pokebola1 = new Pokebola(squirtle);

    Pokebola pokebola2 = new Pokebola(pikachu);

    
       
    System.out.println(charmander.gritar());
    System.out.println(charmeleon.gritar());
    System.out.println(charizard.gritar());
    System.out.println(squirtle.gritar());
    System.out.println(wartortle.gritar());
    System.out.println(blastoise.gritar());
    System.out.println(pikachu.gritar());
    System.out.println(raichu.gritar());
        
    }
}

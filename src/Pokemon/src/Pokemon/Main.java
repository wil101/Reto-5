
package Pokemon;

public class Main {
    public static void main(String[] args){
        Charmander charmander = new Charmander("Ozuna baby", (byte)5, 1200);
        
        System.out.println(charmander.gritar());
        Pokemon charmeleon = charmander.evolucionar();
        System.out.println(charmeleon.gritar());
        Pokemon charizard = charmeleon.evolucionar();
        System.out.println(charizard.gritar());
        
    }
}

public class Main {
    public static void main(String[] args) {

        Pokemon pikachu = new Pokemon("Pikachu", 0.3); 
        Pokemon charizard = new Pokemon("Charizard", 0.6); 
        Pokemon mewtwo = new Pokemon("Mewtwo", 0.1);

        Pokeball pokeball = new Pokeball();
        GreatBall greatBall = new GreatBall();
        UltraBall ultraBall = new UltraBall();

        pokeball.catchPokemon(pikachu);
        greatBall.catchPokemon(charizard);
        ultraBall.catchPokemon(mewtwo);
    }
}
public class Pokeball {
    protected boolean canCatchPokemon(Pokemon pokemon) {
        return pokemon.getEscapeProbability() < 0.8;
    }

    public void catchPokemon(Pokemon pokemon) {
        if (this.canCatchPokemon(pokemon)) {
            System.out.println(pokemon.getName() + " fue atrapado!");
        } else {
            System.out.println(pokemon.getName() + " escapó.");
        }
    }
}
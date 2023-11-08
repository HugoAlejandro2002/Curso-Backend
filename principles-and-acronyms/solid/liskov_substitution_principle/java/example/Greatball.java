class GreatBall extends Pokeball {
    @Override
    protected boolean canCatchPokemon(Pokemon pokemon) {
        return pokemon.getEscapeProbability() < 0.5;
    }
}
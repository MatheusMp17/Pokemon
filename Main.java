public class Main {
    public static void main(String[] args) {
        Pokemon pokemon1 = new PokemonAgua("Squirtle");
        Pokemon pokemon2 = new PokemonFogo("Charmander");

        pokemon1.lutar(pokemon2);
        
        // Exibir informações finais dos Pokémon
        System.out.println(pokemon1);
        System.out.println(pokemon2);
    }
}
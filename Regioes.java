public enum Regioes {
    KANTO("Kanto", "Uma região conhecida por seus Pokémon originais."),
    JOHTO("Johto", "Lar de muitos novos Pokémon e da Fronteira de Batalha."),
    HOENN("Hoenn", "Uma região com ambientes diversos, desde oceanos até montanhas."),
    SINNOH("Sinnoh", "Famosa por suas lendas e pela Liga Sinnoh."),
    UNOVA("Unova", "Uma região inspirada na cidade de Nova Iorque, com muitos Pokémon urbanos."),
    KALOS("Kalos", "Conhecida por seus Pokémon do tipo fada e belas paisagens."),
    ALOLA("Alola", "Uma região tropical com variantes regionais de Pokémon."),
    GALAR("Galar", "Inspirada no Reino Unido, apresentando batalhas Dynamax.");

    private final String nome;
    private final String descricao;

    Regioes(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}

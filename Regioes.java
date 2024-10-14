public enum Regioes {
    KANTO("Kanto"),
    JOHTO("Johto"),
    HOENN("Hoenn"),
    SINNOH("Sinnoh"),
    UNOVA("Unova"),
    KALOS("Kalos"),
    ALOLA("Alola"),
    GALAR("Galar");

    private final String nome;

    Regioes(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

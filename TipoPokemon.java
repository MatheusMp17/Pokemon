import java.util.EnumMap;

public enum TipoPokemon {
    FOGO("Fogo", "Eficaz contra Grama, Inseto, Gelo e Aço."),
    AGUA("Água", "Eficaz contra Fogo, Terra e Rocha."),
    GRAMA("Grama", "Eficaz contra Água, Terra e Rocha."),
    ELETRICO("Elétrico", "Eficaz contra Água e Voador."),
    PSIQUICO("Psíquico", "Eficaz contra Luta e Venenoso."),
    LUTA("Luta", "Eficaz contra Normal, Psíquico e Inseto."),
    INSETO("Inseto", "Eficaz contra Grama, Psíquico e Sombrio."),
    FANTASMA("Fantasma", "Eficaz contra Psíquico e Fantasma."),
    NORMAL("Normal", "Sem fraqueza ou resistência especial."),
    TERRESTRE("Terrestre", "Eficaz contra Elétrico e Rocha."),
    GELO("Gelo", "Eficaz contra Grama, Terra, Voador e Dragão."),
    PEDRA("Pedra", "Eficaz contra Fogo, Elétrico, Voador e Gelo."),
    DRAGAO("Dragão", "Eficaz contra Dragão."),
    ACO("Aço", "Eficaz contra Gelo, Pedra e Fada."),
    FADA("Fada", "Eficaz contra Luta, Sombrio e Dragão."),
    SOMBRIO("Sombrio", "Eficaz contra Psíquico e Fantasma."),
    VENENOSO("Venenoso", "Eficaz contra Grama e Fada.");

    private final String nome;
    private final String descricao;

    // EnumMaps para fraquezas e resistências
    private static final EnumMap<TipoPokemon, TipoPokemon[]> fraquezas = new EnumMap<>(TipoPokemon.class);
    private static final EnumMap<TipoPokemon, TipoPokemon[]> resistencias = new EnumMap<>(TipoPokemon.class);

    TipoPokemon(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    static {
        // Definindo fraquezas
        fraquezas.put(FOGO, new TipoPokemon[]{AGUA, GRAMA}); // Fogo é fraco contra Água, Grama
        fraquezas.put(AGUA, new TipoPokemon[]{GRAMA, ELETRICO});
        fraquezas.put(GRAMA, new TipoPokemon[]{FOGO, AGUA});
        fraquezas.put(ELETRICO, new TipoPokemon[]{TERRESTRE});
        fraquezas.put(PSIQUICO, new TipoPokemon[]{LUTA, INSETO});  
        fraquezas.put(LUTA, new TipoPokemon[]{PSIQUICO, FADA}); 
        fraquezas.put(NORMAL, new TipoPokemon[]{LUTA, FANTASMA}); 
        fraquezas.put(INSETO, new TipoPokemon[]{FOGO, VENTO}); 
        fraquezas.put(FANTASMA, new TipoPokemon[]{FANTASMA}); 

        // Definindo resistências
        resistencias.put(FOGO, new TipoPokemon[]{GRAMA, FOGO});
        resistencias.put(AGUA, new TipoPokemon[]{FOGO, AGUA});
        resistencias.put(GRAMA, new TipoPokemon[]{ÁGUA, TERRESTRE});
        resistencias.put(ELETRICO, new TipoPokemon[]{ELETRICO});
        resistencias.put(PSIQUICO, new TipoPokemon[]{PSIQUICO});
        resistencias.put(LUTA, new TipoPokemon[]{GRAMA});
        resistencias.put(NORMAL, new TipoPokemon[]{NORMAL});
        resistencias.put(VENENOSO, new TipoPokemon[]{GRAMA});
    }

    public TipoPokemon[] getFraquezas() {
        return fraquezas.get(this);
    }
    
    public TipoPokemon[] getResistencias() {
        return resistencias.get(this);
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public float calcularDano(TipoPokemon tipoAtacante) {
        boolean isFraco = false;
        boolean isResistente = false;

        for (TipoPokemon fraqueza : tipoAtacante.getFraquezas()) {
            if (fraqueza == this) {
                isFraco = true;
                break;
            }
        }

        for (TipoPokemon resistencia : tipoAtacante.getResistencias()) {
            if (resistencia == this) {
                isResistente = true;
                break;
            }
        }

        if (isFraco) return 2.0f; // Dano dobrado
        if (isResistente) return 0.5f; // Dano reduzido
        return 1.0f; // Dano normal
    }
}

import java.util.EnumMap;

public enum TipoPokemon {
    FOGO("Fogo", "Eficaz contra Grama, Inseto, Gelo e Aço."),
    AGUA("Água", "Eficaz contra Fogo, Terra e Pedra."),
    GRAMA("Grama", "Eficaz contra Água, Terra e Pedra."),
    ELETRICO("Elétrico", "Eficaz contra Água e Voador."),
    PSIQUICO("Psíquico", "Eficaz contra Luta e Venenoso."),
    LUTA("Luta", "Eficaz contra Normal, Psíquico e Inseto."),
    INSETO("Inseto", "Eficaz contra Grama, Psíquico e Sombrio."),
    FANTASMA("Fantasma", "Eficaz contra Psíquico e Fantasma."),
    NORMAL("Normal", "Sem fraqueza ou resistência especial."),
    TERRESTRE("Terrestre", "Eficaz contra Elétrico e Pedra."),
    GELO("Gelo", "Eficaz contra Grama, Terra, Voador e Dragão."),
    PEDRA("Pedra", "Eficaz contra Fogo, Elétrico, Voador e Gelo."),
    DRAGAO("Dragão", "Eficaz contra Dragão."),
    ACO("Aço", "Eficaz contra Gelo, Pedra e Fada."),
    FADA("Fada", "Eficaz contra Luta, Sombrio e Dragão."),
    SOMBRIO("Sombrio", "Eficaz contra Psíquico e Fantasma."),
    VENENOSO("Venenoso", "Eficaz contra Grama e Fada."),
    VOADOR("Voador", "Eficaz contra insetos, Psíquico e Grama");

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
        fraquezas.put(FOGO, new TipoPokemon[]{AGUA, PEDRA, TERRESTRE});
        fraquezas.put(AGUA, new TipoPokemon[]{GRAMA, ELETRICO});
        fraquezas.put(GRAMA, new TipoPokemon[]{FOGO, INSETO, GELO, VOADOR, VENENOSO});
        fraquezas.put(ELETRICO, new TipoPokemon[]{TERRESTRE});
        fraquezas.put(PSIQUICO, new TipoPokemon[]{LUTA, INSETO, FANTASMA, SOMBRIO});
        fraquezas.put(LUTA, new TipoPokemon[]{PSIQUICO, FADA, VOADOR});
        fraquezas.put(NORMAL, new TipoPokemon[]{LUTA});
        fraquezas.put(INSETO, new TipoPokemon[]{FOGO, PEDRA, VOADOR});
        fraquezas.put(FANTASMA, new TipoPokemon[]{FANTASMA, SOMBRIO});
        fraquezas.put(TERRESTRE, new TipoPokemon[]{AGUA, GELO, GRAMA});
        fraquezas.put(GELO, new TipoPokemon[]{FOGO, PEDRA, ACO, LUTA});
        fraquezas.put(PEDRA, new TipoPokemon[]{AGUA, GRAMA, GELO, ACO, LUTA});
        fraquezas.put(DRAGAO, new TipoPokemon[]{DRAGAO, FADA, GELO});
        fraquezas.put(ACO, new TipoPokemon[]{FOGO, LUTA, TERRESTRE});
        fraquezas.put(FADA, new TipoPokemon[]{VENENOSO, ACO});
        fraquezas.put(SOMBRIO, new TipoPokemon[]{LUTA, FADA, INSETO});
        fraquezas.put(VENENOSO, new TipoPokemon[]{TERRESTRE, PSIQUICO});
        fraquezas.put(VOADOR, new TipoPokemon[]{ELETRICO, PEDRA, GELO});
        
        // Definindo resistências
        
        resistencias.put(FOGO, new TipoPokemon[]{GRAMA, FOGO, INSETO, ACO, FADA});
        resistencias.put(AGUA, new TipoPokemon[]{FOGO, AGUA, GELO, ACO});
        resistencias.put(GRAMA, new TipoPokemon[]{AGUA, ELETRICO, GRAMA, TERRESTRE});
        resistencias.put(ELETRICO, new TipoPokemon[]{ELETRICO, VOADOR, ACO});
        resistencias.put(PSIQUICO, new TipoPokemon[]{LUTA, PSIQUICO});
        resistencias.put(LUTA, new TipoPokemon[]{INSETO, PEDRA, SOMBRIO});
        resistencias.put(NORMAL, new TipoPokemon[]{FANTASMA});
        resistencias.put(VENENOSO, new TipoPokemon[]{GRAMA, LUTA, VENENOSO, INSETO, FADA});
        resistencias.put(VOADOR, new TipoPokemon[]{LUTA, INSETO, GRAMA});
        resistencias.put(FANTASMA, new TipoPokemon[]{VENENOSO, INSETO});
        resistencias.put(TERRESTRE, new TipoPokemon[]{VENENOSO, PEDRA, ELETRICO});
        resistencias.put(GELO, new TipoPokemon[]{GELO});
        resistencias.put(PEDRA, new TipoPokemon[]{FOGO, VOADOR, NORMAL, VENENOSO});
        resistencias.put(DRAGAO, new TipoPokemon[]{FOGO, AGUA, ELETRICO, GRAMA});
        resistencias.put(ACO, new TipoPokemon[]{NORMAL, GRAMA, GELO, VOADOR, PSIQUICO, PEDRA, DRAGAO, ACO, FADA});
        resistencias.put(FADA, new TipoPokemon[]{LUTA, SOMBRIO, INSETO});
        resistencias.put(SOMBRIO, new TipoPokemon[]{FANTASMA, PSIQUICO});
        resistencias.put(INSETO, new TipoPokemon[]{LUTA, GRAMA, TERRESTRE});

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

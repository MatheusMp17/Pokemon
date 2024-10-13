import java.util.EnumMap;

public enum TipoPokemon {
    FOGO("Fogo"),
    AGUA("Água"),
    GRAMA("Grama"),
    ELETRICO("Elétrico"),
    PSIQUICO("Psíquico"), 
    LUTA("Luta"),
    INSETO("Inseto"),
    FANTASMA("Fantasma"), 
    NORMAL("Normal"),
    TERRESTRE("Terrestre");

    private final String nome;
    private static final EnumMap<TipoPokemon, TipoPokemon[]> fraquezas = new EnumMap<>(TipoPokemon.class);
    private static final EnumMap<TipoPokemon, TipoPokemon[]> resistencias = new EnumMap<>(TipoPokemon.class);

    TipoPokemon(String nome) {
        this.nome = nome;
    }

    static {
        fraquezas.put(FOGO, new TipoPokemon[]{AGUA, GRAMA});
        fraquezas.put(AGUA, new TipoPokemon[]{GRAMA, ELETRICO});
        fraquezas.put(GRAMA, new TipoPokemon[]{FOGO, AGUA});
        fraquezas.put(ELETRICO, new TipoPokemon[]{AGUA, TERRESTRE});
        fraquezas.put(PSIQUICO, new TipoPokemon[]{LUTA, INSETO});  
        fraquezas.put(LUTA, new TipoPokemon[]{PSIQUICO, NORMAL}); 
        fraquezas.put(NORMAL, new TipoPokemon[]{LUTA, FANTASMA}); 

        resistencias.put(FOGO, new TipoPokemon[]{GRAMA, FOGO});
        resistencias.put(AGUA, new TipoPokemon[]{FOGO, AGUA});
        resistencias.put(GRAMA, new TipoPokemon[]{AGUA, TERRESTRE});
        resistencias.put(ELETRICO, new TipoPokemon[]{ELETRICO});
        resistencias.put(PSIQUICO, new TipoPokemon[]{PSIQUICO});
        resistencias.put(LUTA, new TipoPokemon[]{GRAMA});
        resistencias.put(NORMAL, new TipoPokemon[]{NORMAL});
    }

    public TipoPokemon[] getFraquezas() {
        return fraquezas.get(this);
    }
    
    // Novo método para obter as resistências
    public TipoPokemon[] getResistencias() {
        return resistencias.get(this);
    }

    public String getNome() {
        return nome;
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

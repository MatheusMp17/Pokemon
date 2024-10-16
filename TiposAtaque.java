public enum TiposAtaque {
    // Ataques para cada tipo de Pokémon
    FLAMEJANTE(TipoPokemon.FOGO, "Flamejante", 10, 60, 95),
    BOLA_DE_FOGO(TipoPokemon.FOGO, "Bola de Fogo", 10, 80, 85),
    EXPLOSAO(TipoPokemon.FOGO, "Explosão", 5, 150, 50),
    CHAMAS_VIVAS(TipoPokemon.FOGO, "Chamas Vivas", 8, 75, 95),

    JATO_DE_AGUA(TipoPokemon.AGUA, "Jato de Água", 15, 40, 100),
    PULSO_DE_AGUA(TipoPokemon.AGUA, "Pulso de Água", 20, 45, 95),
    RAIO_DE_AGUA(TipoPokemon.AGUA, "Raio de Água", 10, 90, 85),
    DRENAGEM(TipoPokemon.AGUA, "Drenagem", 20, 50, 100),

    CHICOTE_DE_VINHAS(TipoPokemon.GRAMA, "Chicote de Vinha", 20, 35, 100),
    LUZ_SOLAR(TipoPokemon.GRAMA, "Luz Solar", 10, 100, 90),
    SEMENTE_VENENOSA(TipoPokemon.GRAMA, "Semente Venenosa", 15, 50, 90),
    DANCA_DAS_FLORES(TipoPokemon.GRAMA, "Dança das Flores", 12, 60, 85),

    RAIO(TipoPokemon.ELETRICO, "Raio", 5, 90, 85),
    CHUVA_DE_TROVÕES(TipoPokemon.ELETRICO, "Chuva de Trovões", 8, 75, 90),
    TUMULTO_ELETRICO(TipoPokemon.ELETRICO, "Tumulto Elétrico", 15, 55, 95),
    IMPULSO_ELETRICO(TipoPokemon.ELETRICO, "Impulso Elétrico", 12, 70, 85),

    PENSAMENTO_CONFUSO(TipoPokemon.PSIQUICO, "Pensamento Confuso", 10, 50, 90),
    GOLPE_PSÍQUICO(TipoPokemon.PSIQUICO, "Golpe Psíquico", 15, 60, 95),
    LUZ_MENTAL(TipoPokemon.PSIQUICO, "Luz Mental", 12, 70, 85),
    SONHO_MORTAL(TipoPokemon.PSIQUICO, "Sonho Mortal", 5, 120, 75),

    SOCO_FERROSO(TipoPokemon.LUTA, "Soco Ferroso", 25, 70, 90),
    GOLPE_DE_CABECA(TipoPokemon.LUTA, "Golpe de Cabeça", 15, 50, 100),
    SOCOS_FORTES(TipoPokemon.LUTA, "Socos Fortes", 20, 80, 85),
    IMPACTO_VITAL(TipoPokemon.LUTA, "Impacto Vital", 10, 90, 80),

    ATACAR_INSETO(TipoPokemon.INSETO, "Atacar Inseto", 20, 55, 90),
    GOLPE_VENENOSO(TipoPokemon.INSETO, "Golpe Venenoso", 15, 40, 95),
    FURIA_INSETO(TipoPokemon.INSETO, "Fúria Inseto", 12, 70, 85),
    PICADA_VENENOSA(TipoPokemon.INSETO, "Picada Venenosa", 10, 30, 100),

    GOLPE_FANTASMA(TipoPokemon.FANTASMA,"Golpe Fantasma",15 ,60 ,90),
    SUSSURRO_FANTASMA(TipoPokemon.FANTASMA,"Sussurro Fantasma",10 ,40 ,100),
    MALDICO_FANTASMA(TipoPokemon.FANTASMA,"Maldição Fantasma",5 ,80 ,75),
    FANTASMA_SOMBRIO(TipoPokemon.FANTASMA,"Fantasma Sombrio",20 ,70 ,85),

    GOLPE_NORMAL(TipoPokemon.NORMAL,"Golpe Normal",20 ,50 ,100),
    IMPACTO_NORMAL(TipoPokemon.NORMAL,"Impacto Normal",15 ,60 ,95),
    FURIA_NORMAL(TipoPokemon.NORMAL,"Fúria Normal",10 ,75 ,90),
    GRITO_NORMAL(TipoPokemon.NORMAL,"Grito Normal",8 ,40 ,100),

    ATACAR_TERRACOTTA(TipoPokemon.TERRESTRE,"Atacar Terracota",15 ,40 ,100),
    ABISPA_TERRACOTTA(TipoPokemon.TERRESTRE,"Abispa Terracota",20 ,60 ,95),
    IMPACTO_TERRACOTTA(TipoPokemon.TERRESTRE,"Impacto Terracota",25 ,80 ,85),
    ABISPA_TERRACOTTA_2(TipoPokemon.TERRESTRE,"Abispa Terracota II",10 ,70 ,90),

    SOPRO_GELADO(TipoPokemon.GELO,"Sopro Gelado",10 ,60 ,95),
    NEVE_FINA(TipoPokemon.GELO,"Neve Fina",15 ,50 ,100),
    RAIO_DE_GEL(TipoPokemon.GELO,"Raio de Gelo",8 ,70 ,85),
    DANCA_DE_GEL(TipoPokemon.GELO,"Dança de Gelo",12 ,80 ,90),

    PEDRA_FURACAO(TipoPokemon.PEDRA,"Pedra Furacão",5 ,70 ,80),
    IMPACTO_PEDRA(TipoPokemon.PEDRA,"Impacto Pedra",15 ,90 ,75),
    QUEDA_DE_PEDRA(TipoPokemon.PEDRA,"Queda de Pedra",10 ,80 ,85),
    CORTES_PEDRINHAS(TipoPokemon.PEDRA,"Cortes Pedrinhas",12 ,60 ,90),

    RAIO_DRAGAO(TipoPokemon.DRAGAO,"Raio Dragão",5 ,100 ,70),
    SOFOCAMENTO_DRAGAO(TipoPokemon.DRAGAO,"Sofocamento Dragão",12 ,80 ,85),
    IMPACTO_DRAGAO(TipoPokemon.DRAGAO,"Impacto Dragão",15 ,110 ,75),
    GOLPE_DRAGAO(TipoPokemon.DRAGAO,"Golpe Dragão",20 ,90 ,80),

    ATACAR_ACO(TipoPokemon.ACO,"Atacar Aço",15 ,60 ,90),
    IMPACTO_ACO(TipoPokemon.ACO,"Impacto Aço",10 ,80 ,85),
    GOLPE_ACO(TipoPokemon.ACO,"Golpe Aço",25 ,70 ,90),
    CORTES_DE_ACO(TipoPokemon.ACO,"Cortes de Aço",12 ,50 ,100),

    LUZ_DE_FADA(TipoPokemon.FADA,"Luz de Fada",10 ,70 ,85),
    ENCANTAMENTO_DE_FADA(TipoPokemon.FADA,"Encantamento de Fada",12 ,80 ,80),
    BRILHO_FADA(TipoPokemon.FADA,"Brilho de Fada",15 ,60 ,90),
    MISTURADOR_DE_FADA(TipoPokemon.FADA,"Misturador de Fada",8 ,50 ,95),

    GOLPE_SOMBRIO(TipoPokemon.SOMBRIO,"Golpe Sombrio",10 ,65 ,85),
    SUSSURRO_SOMBRIO(TipoPokemon.SOMBRIO,"Sussurro Sombrio",15 ,55 ,90),
    IMPACTO_SOMBRIO(TipoPokemon.SOMBRIO,"Impacto Sombrio",12 ,70 ,80),
    PENSAMENTO_SOMBRIO(TipoPokemon.SOMBRIO,"Pensamento Sombrio",20 ,40 ,100),

    
    TOQUE_VENENOSO(TipoPokemon.VENENOSO,"Toque Venenoso",10 ,30 ,100),
    DRENAGEM_VENENOSA(TipoPokemon.VENENOSO,"Drenagem Venenosa",20 ,50 ,95),
    MALDICAO_VENENOSA(TipoPokemon.VENENOSO,"Maldição Venenosa",5 ,-1 ,-1); // Exemplo de ataque que não causa dano

    
    private final TipoPokemon tipo; // Tipo do Pokémon que pode usar o ataque
    private final String nome;
    private final int pontosDePoder; // PP
    private final int danoBase;       // Dano base do ataque
    private final int percentualAcerto; // % de acerto do ataque

    TiposAtaque(TipoPokemon tipo,String nome,int pontosDePoder,int danoBase,int percentualAcerto) {
        this.tipo = tipo;
        this.nome = nome;
        this.pontosDePoder = pontosDePoder;
        this.danoBase = danoBase;
        this.percentualAcerto = percentualAcerto;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getPontosDePoder() {
        return pontosDePoder;
    }

    public int getDanoBase() {
        return danoBase;
    }

    public int getPercentualAcerto() {
        return percentualAcerto;
    }
    
   @Override
   public String toString() {
        return String.format("%s (%s) - PP: %d, Dano: %d, Acerto: %d%%",
                nome,tipo.getNome(), pontosDePoder,danoBase,%percentualAcerto);
   }
}

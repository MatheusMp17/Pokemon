public class Pokemon {
    private String nome;
    private TipoPokemon tipo;
    private Regioes regiao; // Região de origem do Pokémon
    private int vida;
    private int forcaAtaque; // Força de ataque
    private int defesa;      // Defesa
    private int velocidade;  // Velocidade
    private int nivel;       // Nível do Pokémon
    private final int numeroEvolucoes; // Número total de evoluções possíveis
    private int numeroLutas; // Número de lutas que o Pokémon participou
    private int evolucaoAtual;   // Evolução atual do Pokémon

    public Pokemon(String nome, TipoPokemon tipo, int forcaAtaque, int defesa, int velocidade, int nivel, int numeroEvolucoes) {
        this.nome = nome;
        this.tipo = tipo;
        this.vida = 100; // Vida inicial
        this.forcaAtaque = forcaAtaque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.nivel = nivel;
        this.numeroEvolucoes = numeroEvolucoes;
        this.evolucaoAtual = 0; // Começa sem evoluções
        this.numeroLutas = 0; // Começa sem lutas
    }

    public void lutar(Pokemon alvo) {
        System.out.println(this.nome + " inicia uma luta contra " + alvo.nome + "!");

        // Simulação de turnos de luta, considerando a velocidade
        while (this.vida > 0 && alvo.vida > 0) {
            if (this.velocidade >= alvo.velocidade) {
                this.atacar(alvo);
                if (alvo.vida > 0) {
                    alvo.atacar(this);
                }
            } else {
                alvo.atacar(this);
                if (this.vida > 0) {
                    this.atacar(alvo);
                }
            }
        }

        if (this.vida <= 0) {
            System.out.println(this.nome + " foi derrotado!");
        } else {
            System.out.println(alvo.nome + " foi derrotado!");
        }

        // Após a luta, registra a luta para ambos os Pokémon
        registrarLuta();
        alvo.registrarLuta();
    }

    public void atacar(Pokemon alvo) {
        float danoBase = calcularDano(alvo);
        
        System.out.println(nome + " ataca " + alvo.nome + " e causa " + danoBase + " de dano.");
        alvo.sofrerDano((int) danoBase);
    }

    private float calcularDano(Pokemon alvo) {
        float danoBase = forcaAtaque * tipo.calcularDano(alvo.tipo);
        danoBase -= alvo.defesa; 
        return Math.max(danoBase, 0); // Garantir que o dano não seja negativo
    }

    public void registrarLuta() {
        numeroLutas++; // Incrementa o contador de lutas
        System.out.println(nome + " participou de uma luta! Total de lutas: " + numeroLutas);
    }

    public void sofrerDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) this.vida = 0; // Garantir que a vida não fique negativa
        System.out.println(nome + " sofreu " + dano + " de dano. Vida restante: " + vida);
    }

    public void evoluir() {
        if (evolucaoAtual < numeroEvolucoes) {
            evolucaoAtual++;
            nivel++;  // Aumenta o nível ao evoluir
            forcaAtaque += 5; // Aumenta a força de ataque ao evoluir
            defesa += 2;      // Aumenta a defesa ao evoluir
            velocidade += 3;  // Aumenta a velocidade ao evoluir

            System.out.println(nome + " evoluiu para o estágio " + evolucaoAtual + "!");
        } else {
            System.out.println(nome + " já está na sua forma final e não pode evoluir mais.");
        }
    }

    public void setRegiao(Regioes regiao) {
        this.regiao = regiao;
    }

    public Regioes getRegiao() {
        return regiao;
    }

    public String getNomeRegiao() {
        return regiao.getNome();
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - Vida: %d, Força de Ataque: %d, Defesa: %d, Velocidade: %d, Nível: %d, Evolução Atual: %d/%d",
                nome, tipo.getNome(), vida, forcaAtaque, defesa, velocidade, nivel, evolucaoAtual, numeroEvolucoes);
    }
}

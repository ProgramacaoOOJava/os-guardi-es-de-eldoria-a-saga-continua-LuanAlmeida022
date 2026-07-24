package eldoria;

/**
 * Classe abstrata que representa a base de todos os personagens.
 */
public abstract class Personagem {
    // Atributos privados (encapsulamento)
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    // Construtor
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Getters e Setters (sem 'if' interno conforme requisito não funcional)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public double getPoderBase() {
        return poderBase;
    }

    public void setPoderBase(double poderBase) {
        this.poderBase = poderBase;
    }

    // Método abstrato para usar habilidade
    public abstract void usarHabilidade();

    // Método para exibir o status reutilizando o toString()
    public void exibirStatus() {
        System.out.println(this.toString());
    }

    // Método protegido para atribuir bênção aumentando o poder base
    protected double atribuirBencao(double valor) {
        this.poderBase += valor;
        return this.poderBase;
    }

    // Método toString() com formatação do status
    @Override
    public String toString() {
        return classe + "\n\n" +
               "Nome: " + nome + "\n" +
               "Classe: " + classe + "\n" +
               "Nível: " + nivel + "\n" +
               "Pontos de Vida: " + pontosDeVida + "\n" +
               "Poder Base: " + poderBase;
    }
}
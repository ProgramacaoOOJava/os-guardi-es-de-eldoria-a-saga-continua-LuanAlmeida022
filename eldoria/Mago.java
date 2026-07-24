package eldoria;

import java.util.ArrayList;
import java.util.List;

/**
 * Subclasse Mago com implementação do método usarHabilidade() e interface Auditavel.
 */
public class Mago extends Personagem implements Auditavel {

    // Encapsulamento: atributo definido como private
    private List<String> acoes = new ArrayList<>();

    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome() + " conjura uma bola de fogo!");
        registrarAcao("Conjurou bola de fogo");
    }

    // Implementação dos métodos da interface Auditavel
    @Override
    public void registrarAcao(String acao) {
        this.acoes.add(acao);
    }

    @Override
    public void auditarAcoes() {
        System.out.println("Ações auditadas:");
        for (String a : acoes) {
            System.out.println("- " + a);
        }
    }

    // Getter para lista de ações
    public List<String> getAcoes() {
        return acoes;
    }
}
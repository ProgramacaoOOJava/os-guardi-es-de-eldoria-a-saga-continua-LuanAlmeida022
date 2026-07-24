package eldoria;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 1. Criar uma lista (ArrayList<Personagem>)
        List<Personagem> herois = new ArrayList<>();

        // 2. Adicionar pelo menos dois Magos e dois Guerreiros à lista
        herois.add(new Mago("Eldoran", 7, 60, 18.0));
        herois.add(new Mago("Gandalf", 5, 90, 15.5));
        herois.add(new Guerreiro("Arthemis", 5, 80, 12.5));
        herois.add(new Guerreiro("Bjorn", 6, 175, 14.5));

        // Para cada personagem na lista
        for (Personagem p : herois) {

            // Chamar exibirStatus()
            p.exibirStatus();

            // Chamar usarHabilidade()
            p.usarHabilidade();

            // Se for um Mago: registrar ação e fazer casting explícito para Auditavel
            if (p instanceof Mago) {
                // Casting explícito para a interface Auditavel
                Auditavel auditavel = (Auditavel) p;
                
                // Exemplo de registrar uma ação adicional se necessário
                // auditavel.registrarAcao("Estudou tomo antigo");
                
                // Chamada de auditoria de ações
                auditavel.auditarAcoes();
            }

            // Casting explícito para Personagem e invocar atribuirBencao()
            Personagem personagemBase = (Personagem) p;
            personagemBase.atribuirBencao(2.0);

            // Exibe o novo poder base conforme o exemplo da saída esperada
            System.out.println("Novo poder base após bênção: " + personagemBase.getPoderBase());

            System.out.println("\n" + "-".repeat(30) + "\n");
        }
    }
}
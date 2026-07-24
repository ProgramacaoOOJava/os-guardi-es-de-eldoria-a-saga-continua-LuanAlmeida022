package eldoria;


//Interface Auditavel para rastreamento de ações dos personagens.
 
public interface Auditavel {

    void registrarAcao(String acao);

    void auditarAcoes();
}

public interface Atleta {
    public enum Modalidade {
        CORRIDA, NATACAO, FUTEBOL, VOLEI, BASQUETE, TENIS, NONE
    }

    Modalidade getModalidade();
}

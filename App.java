
public class App {

        public static int contaCorredores(Atleta[] atletas) {
                int cont = 0;
                for (int i = 0; i < atletas.length; i++) {
                        if (atletas[i].getModalidade() == Atleta.Modalidade.CORRIDA) {
                                cont++;
                        }
                }
                return cont;
        }

        public static void main(String[] args) {
                Aluno alunos[] = new Aluno[3];

                alunos[0] = new AlunoAtrib(10, "Huguinho");
                alunos[1] = new AlunoArranjo(20, "Zezinho");
                alunos[2] = new AlunoAtleta(30, "Luizinho", Atleta.Modalidade.BASQUETE);

                Funcionario funcionarios[] = new Funcionario[3];
                funcionarios[0] = new Funcionario(100, "Ze", 5000, Atleta.Modalidade.CORRIDA);
                funcionarios[1] = new Funcionario(200, "Ze Maria", 7000, Atleta.Modalidade.FUTEBOL);
                funcionarios[2] = new Funcionario(300, "Ze Maria", 7000, Atleta.Modalidade.NONE);

                Atleta atletas[] = new Atleta[5];
                atletas[0] = funcionarios[0];
                atletas[1] = (Atleta)alunos[2];
                atletas[2] = funcionarios[1];
                atletas[3] = funcionarios[2];
                atletas[4] = new AlunoAtleta(1012, "Fulano", Atleta.Modalidade.NATACAO);

                for (int i = 0; i < atletas.length; i++) {
                        System.out.println(atletas[i].getModalidade());
                }

        }

}

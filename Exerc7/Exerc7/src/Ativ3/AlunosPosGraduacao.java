
public class AlunosPosGraduacao extends Alunos {

    private String disciplinasPosGraduacao;

    public AlunosPosGraduacao(String nome, int idade, String numeroMatricula, String disciplinasPosGraduacao) {
        super(nome, idade, numeroMatricula);
        setDisciplinasPosGraduacao(disciplinasPosGraduacao);
    }

    public String getDisciplinasPosGraduacao() {
        return disciplinasPosGraduacao;
    }

    public void setDisciplinasPosGraduacao(String disciplinasPosGraduacao) {
        this.disciplinasPosGraduacao = disciplinasPosGraduacao;
    }
    
    
}

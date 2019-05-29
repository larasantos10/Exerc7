
public class AlunosGraduacao extends Alunos {

    private String disciplinasGraduacao;

    public AlunosGraduacao(String nome, int idade, String numeroMatricula, String disciplinasGraduacao) {
        super(nome, idade, numeroMatricula);
        setDisciplinasGraduacao(disciplinasGraduacao);
    }

    public String getDisciplinasGraduacao() {
        return disciplinasGraduacao;
    }

    public void setDisciplinasGraduacao(String disciplinasGraduacao) {
        this.disciplinasGraduacao = disciplinasGraduacao;
    }
    
    
}

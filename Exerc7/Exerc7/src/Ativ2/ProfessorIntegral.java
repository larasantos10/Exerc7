
public class ProfessorIntegral extends Professor{
    private double salario;
        
    public ProfessorIntegral(String nome, int idade, String numeroMatricula, double salario) {
        super(nome, idade, numeroMatricula);
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
    
}


public class Empregado extends Pessoa {
    private String codigoSetor;
    private double salarioBase;
    private double imposto;
    
    public String getCodigoSetor(){
        return codigoSetor;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public double getImposto(){
        return imposto;
    }
    
    public void setCodigoSetor(String c){
        this.codigoSetor = c;
    }
    
    public void setSalarioBase(double s){
        this.salarioBase = s;
    }
    
    public void setImposto(double i){
        this.imposto = i;
    }
    
    public double calcularSalario(double sal){
        sal = getSalarioBase() - (getSalarioBase() * getImposto());
        System.out.print("Salário = "+sal);
    }
    
    public Empregado(String c, double s, double i, String n, String e, String t){
        super (n,e,t);
        setCodigoSetor(c);
        setSalarioBase(s);
        setImposto(i);
    }
}

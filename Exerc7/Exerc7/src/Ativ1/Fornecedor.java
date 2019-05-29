
public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;
  
    public double getValorCredito(){
        return valorCredito;
    }
    
    public double getValorDivida(){
        return valorDivida;
    }
    
    public void setValorCredito(double vc){
        this.valorCredito = vc;
    }
    
    public void setValorDivida(double vd){
        this.valorDivida = vd;
    }
   
    public void obterSaldo(double s){
        s = getValorCredito() - getValorDivida();
        System.out.println("Saldo = "+s);
    }
    
    public Fornecedor(double vc, double vd, String n, String e, String t){
    super (n,e,t);
    setValorCredito(vc);
    setValorDivida(vd);
    }
}


public class Teste {
    public void main(String[] args){
        Pessoa p = new Pessoa ("Heitor", "Rua Zero", "(00) 3879-0000");        
        p.mostrar();
        p.obterSaldo();
        
        Fornecedor f = new Fornecedor (200, 500,"Nike", "Rua 0", "(00) 2013-8082");
        f.mostrar();        
        
        Empregado e = new Empregado ("001", 900, 0.055, "Muriel", "Av. Lugar Nenhum", "(00) 0000-0000");
        e.mostrar();
        e.calcularSalario();
               
        
    }
}

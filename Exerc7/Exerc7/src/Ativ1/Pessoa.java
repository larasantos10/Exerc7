
public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    
    public String getNome(){
    return nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public String getTelefone(){
        return telefone;
    }
   
    public void setNome(String n){
    this.nome = n;
    }
    
    public void setEndereco(String e){
        this.endereco = e;
    }
    
    public void setTelefone(String t){
        this.telefone = t;
    }
   
    public Pessoa (String n, String e, String t){
        setNome(n);
        setEndereco(e);
        setTelefone(t);
    }
  
    public void mostrar (){
    
        System.out.println("Nome: "+getNome());
        System.out.println("Endereço: "+getEndereco());
        System.out.println("Telefone: "+getTelefone());
    }    
}

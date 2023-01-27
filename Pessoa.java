package agenda;

public class Pessoa {
    private String nome;
    private int telefone;

    public Pessoa(String nome, int telefone){
        this.nome=nome;
        this.telefone=telefone;
    }
    public void mostrarDados(){
        System.out.format("a pessoa %s tem o telefone igual a %d\n", nome, telefone);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
}

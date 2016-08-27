package model.bean;

/**
 *
 * @author Tafar
 */
public class Pessoa {
    private int idPessoa;
    private Contato contato;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(int idPessoa, Contato contato, Endereco endereco) {
        this.idPessoa = idPessoa;
        this.contato = contato;
        this.endereco = endereco;
    }    

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setId(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }    
    
}

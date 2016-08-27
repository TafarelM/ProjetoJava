package model.bean;

/**
 *
 * @author Tafar
 */
public class Contato {
    private int idContato;
    private String telefone;
    private String celular;
    private String email;

    public Contato() {
    }

    public Contato(int idContato, String telefone, String celular, String email) {
        this.idContato = idContato;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }
        

    public int getIdContato() {
        return idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}

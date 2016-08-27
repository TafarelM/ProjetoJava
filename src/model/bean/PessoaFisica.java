package model.bean;

import java.util.Date;

/**
 *
 * @author Tafar
 */
public class PessoaFisica extends Pessoa{
    private int idPessoaFisica;
    private String nome;
    private String cpf;
    private String rg;
    private String sexo;
    private Date dataNascimento;

    public PessoaFisica() {
    }

    public PessoaFisica(int idPessoaFisica, String nome, String cpf, String rg, String sexo, Date dataNascimento) {
        this.idPessoaFisica = idPessoaFisica;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public PessoaFisica(int idPessoaFisica, String nome, String cpf, String rg, String sexo, Date dataNascimento, int idPessoa, Contato contato, Endereco endereco) {
        super(idPessoa, contato, endereco);
        this.idPessoaFisica = idPessoaFisica;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public int getIdPessoaFisica() {
        return idPessoaFisica;
    }

    public void setIdPessoaFisica(int idPessoaFisica) {
        this.idPessoaFisica = idPessoaFisica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }  
    
}

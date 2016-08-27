package model.bean;

import java.util.Date;

/**
 *
 * @author Tafar
 */
public class Funcionario extends PessoaFisica{
    private int idFuncionario;
    private String setor;
    private String cargo;
    private Date dataEntrada;

    public Funcionario() {
    }

    public Funcionario(int idFuncionario, String setor, String cargo, Date dataEntrada) {
        this.idFuncionario = idFuncionario;
        this.setor = setor;
        this.cargo = cargo;
        this.dataEntrada = dataEntrada;
    }

    public Funcionario(int idFuncionario, String setor, String cargo, Date dataEntrada, int idPessoaFisica, String nome, String cpf, String rg, String sexo, Date dataNascimento) {
        super(idPessoaFisica, nome, cpf, rg, sexo, dataNascimento);
        this.idFuncionario = idFuncionario;
        this.setor = setor;
        this.cargo = cargo;
        this.dataEntrada = dataEntrada;
    }

    public Funcionario(int idFuncionario, String setor, String cargo, Date dataEntrada, int idPessoaFisica, String nome, String cpf, String rg, String sexo, Date dataNascimento, int idPessoa, Contato contato, Endereco endereco) {
        super(idPessoaFisica, nome, cpf, rg, sexo, dataNascimento, idPessoa, contato, endereco);
        this.idFuncionario = idFuncionario;
        this.setor = setor;
        this.cargo = cargo;
        this.dataEntrada = dataEntrada;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }   

}

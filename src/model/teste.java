
package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import model.bean.Funcionario;
import model.dao.FuncionarioDAO;

/**
 *
 * @author Tafar
 */
public class teste {
    public static void main(String args[]){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        Funcionario f = new Funcionario();
        f.setNome("tafatest");
        f.setCpf("123654789");
        f.setRg("258741369");
        f.setSexo("M");
        f.setDataNascimento(null);
        f.setSetor("setorTeste");
        f.setCargo("boss");
        f.setDataEntrada(null);    
        
        FuncionarioDAO dao =  new FuncionarioDAO();
        dao.create(f);        
    }
}

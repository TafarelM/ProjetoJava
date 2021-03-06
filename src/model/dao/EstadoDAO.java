package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ConnectionFactory;
import model.bean.Estado;
import model.bean.Funcionario;

/**
 *
 * @author Tafar
 */
public class EstadoDAO {

    public void create(Estado estado) {
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement  stmt = null;
        
        try {        
            stmt = conn.prepareStatement("INSERT INTO estado (estado, sigla)VALUES(?,?);");
            stmt.setString(1, estado.getEstado());
            stmt.setString(2, estado.getSigla());
            //stmt.setDouble(3, funcionario.getPreco());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO.");
            
        }catch(SQLException exception){
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR! DETALHE:"+exception);
        }finally{
            ConnectionFactory.closeConnection(conn, stmt);
        }        
    }
    
    public List<Funcionario> read() {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Funcionario> produtoColecao = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM produto;");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Funcionario funcionario = new Funcionario();
                
                funcionario.setId(rs.getInt("id"));
                //funcionario.setDescricao(rs.getString("descricao"));
                //funcionario.setQtd(rs.getInt("qtd"));
                //funcionario.setPreco(rs.getDouble("preco"));
                
                produtoColecao.add(funcionario);
            }
            
        }catch(SQLException exception) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, exception);
        }finally{
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }        
        return produtoColecao;
    }
    
    public void update(Funcionario funcionario) {
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement  stmt = null;
        
        try {        
            stmt = conn.prepareStatement("UPDATE produto SET descricao = ?, qtd = ?, preco = ? WHERE id = ?;");
            //stmt.setString(1, funcionario.getDescricao());
            //stmt.setInt(2, funcionario.getQtd());
            //stmt.setDouble(3, funcionario.getPreco());
            //stmt.setInt(4, funcionario.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO.");
            
        }catch(SQLException exception){
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR! DETALHE:"+exception);
        }finally{
            ConnectionFactory.closeConnection(conn, stmt);
        }        
    }
    
    public void delete(Funcionario funcionario) {
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement  stmt = null;
        
        try {        
            stmt = conn.prepareStatement("DELETE FROM produto WHERE id = ?;");
            //stmt.setDouble(1, funcionario.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "EXCLUIDO COM SUCESSO.");
            
        }catch(SQLException exception){
            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR! DETALHES:"+exception);
        }finally{
            ConnectionFactory.closeConnection(conn, stmt);
        }        
    }   
    
    //procurar por nome/descricao do funcionario
    public List<Funcionario> readForDescricao(String descricao) {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Funcionario> funcionarioColecao = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM produto WHERE descricao LIKE ?;");
            stmt.setString(1, '%'+descricao+'%');
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Funcionario funcionario = new Funcionario();
                
                //funcionario.setId(rs.getInt("id"));
                //funcionario.setDescricao(rs.getString("descricao"));
                //funcionario.setQtd(rs.getInt("qtd"));
                //funcionario.setPreco(rs.getDouble("preco"));
                
                funcionarioColecao.add(funcionario);
            }
            
        }catch(SQLException exception) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, exception);
        }finally{
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }        
        return funcionarioColecao;
    }
    
}

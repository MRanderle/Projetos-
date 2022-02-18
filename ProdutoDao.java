

        
package Produto.Dao;

import Produto.jdbc.ConnectionFactory;
import Produto.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;




public class ProdutoDao {
    
   private Connection con; 

public ProdutoDao(){
    this.con = new ConnectionFactory().getConnection();
}
   
  
    //Metodo Cadastar Produto
    public void  cadastrarProduto(Produto obj){
    
        try {
            //Comando sql
            String sql= "insert into Produtos (id,codigo,nome,quantidade,valor_compra,data,unidade_medida,valor_vendas,id_estoque,id_unidade)values(?,?,?,?,?,?,?,?,?,?) ";
            
            //Conexao banco de dados e organização de sql
            PreparedStatement stmt= con.prepareStatement(sql);
            stmt.setString(1,obj.getName());
            stmt.setString(2,obj.getcodigo());
            stmt.setString(3,obj.getName());
            stmt.setLong(4,obj.getQuantidade());
            stmt.setLong(5,obj.getValor_compra());
            stmt.setLong(6,obj.getData());
            stmt.setLong(7,obj.getUnidade_medida());
            stmt.setLong(8,obj.getValor_venda());
            stmt.setLong(9,obj.getId_estoque());
            stmt.setLong(10,obj.getId_unidade());
           
           // codigo de execução de comando sql
           
           stmt.execute();
           stmt.close();
           
           JOptionPane.showMessageDialog(null,"cadastrado comm sucesso");
            
                                 
        } catch (SQLException erro) {
            
           JOptionPane.showMessageDialog(null,"Erro:"+erro);      
        }
        
}
    

//Metodo Alterar Produto
public void alterarProduto(Produto obj){
    
     try {
            //Comando sql
            String sql= "update Produtos set id=?,codigo=?,nome=?,quantidade=?,valor_compra=?,data=?,unidade_medida=?,valor_vendas=?,id_estoque=?,id_unidade=? where id=?";
            //Conexao banco de dados e organização de sql
            PreparedStatement stmt= con.prepareStatement(sql);
            stmt.setString(1,obj.getName());
            stmt.setString(2,obj.getcodigo());
            stmt.setString(3,obj.getName());
            stmt.setLong(4,obj.getQuantidade());
            stmt.setLong(5,obj.getValor_compra());
            stmt.setLong(6,obj.getData());
            stmt.setLong(7,obj.getUnidade_medida());
            stmt.setLong(8,obj.getValor_venda());
            stmt.setLong(9,obj.getId_estoque());
            stmt.setLong(10,obj.getId_unidade());
            
            stmt.setLong(11,obj.getId());
           
           // codigo de execução de comando sql
           
           stmt.execute();
           stmt.close();
           
           JOptionPane.showMessageDialog(null,"Alterado comm sucesso");
            
                                 
        } catch (SQLException erro) {
            
           JOptionPane.showMessageDialog(null,"Erro:"+erro);      
        }
    
}

public void excluiProduto(Produto obj){
    
    try {
            //Comando sql
            String sql="delete from Produto where id =?";
            
            //Conexao banco de dados e organização de sql
            PreparedStatement stmt= con.prepareStatement(sql);
            
            stmt.setLong(1,obj.getId());
         
           
           // codigo de execução de comando sql
           
           stmt.execute();
           stmt.close();
           
           JOptionPane.showMessageDialog(null,"excluido com sucesso");
            
                                 
        } catch (SQLException erro) {
            
           JOptionPane.showMessageDialog(null,"Erro:"+erro);      
        }
    
}
    private Produto obj;
    
    



    public List<Produto> listarProdutos(){
        
        //lista 
        
        try {
            
            List<Produto> lista = new ArrayList<Produto>();
            
            //metodo sql organizar executar
            
            String sql = "select * from Produtos";
            PreparedStatement stmt= con.prepareStatement(sql);
            ResultSet rs= stmt.executeQuery();
                 
            while(rs.next()){
                Produto obj = new Produto();
                    
                obj.setId(rs.getLong("Id"));
                obj.setCodigo(rs.getLong("Codigo"));
                obj.setNome(rs.getString("Nome"));
                obj.setQuantidade(rs.getLong("Quantidade"));
                obj.setValor_compra(rs.getLong("Valor_compra"));
                obj.setData(rs.getLong("Data"));
                obj.setUnidade_medida(rs.getLong("Unidade_medida"));
                obj.setValor_venda(rs.getLong("Valor_venda"));
                obj.setId_estoque(rs.getLong("Id_estoque"));
                obj.setId_unidade(rs.getLong("Id_unidade"));
                
                lista.add(obj);
                
            }
            return lista;
                
        } catch (Exception erro) {
                JOptionPaneShowMessageDialog(null,"Erro"+erro);
                return null;
        }
       

  
    }

    private void JOptionPaneShowMessageDialog(Object object, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

        //metodo excluir
       






/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.usuarioSQL;



/**
 *
 * @author joao-/// dos caras
 */
//public class UsuarioDAO <E extends Entidade> extends SQLDAO{
//    private String chaveCriptogafia = "ld83mf0";
//
//    public UsuarioDAO() {
//        super(Usuario.class);
//        
//        setTabela("Usuarios");
//    }
//    
//    @Override
//    protected String getComandoConsultar() {
//        return "SELECT UsuarioId, Nome, Usuario, AES_DECRYPT(Senha, '" + chaveCriptogafia + "') AS Senha, SalaId, Dinheiro FROM " + getTabela() + " WHERE UsuarioId = ?;";
//    }
//    
//    @Override
//    public void inserir(Entidade entidade) throws SQLException {
//        try (Connection conexao = DriverManager.getConnection(getStringConexao(), getUsuario(), getSenha())) {
//            String query = "INSERT INTO " + getTabela() + " (Nome, Usuario, Senha) VALUES (?, ?, AES_ENCRYPT(?, '" + chaveCriptogafia + "'));";
//
//            try (PreparedStatement stmt = conexao.prepareStatement(query)) {
//                stmt.setString(1, ((Usuario)entidade).getNome());
//                //stmt.setString(2, ((Usuario)entidade).getUsuario());
//                stmt.setString(3, ((Usuario)entidade).getSenha());
//
//                stmt.executeUpdate();
//            }
//        }
//    }
//    
//    @Override
//    protected E preencherEntidade(ResultSet rs) throws SQLException {
//        Usuario entidade = new Usuario();
//
//        /*entidade.setUsuarioId(rs.getInt("UsuarioId"));
//        entidade.setNome(rs.getString("Nome"));
//        entidade.setUsuario(rs.getString("Usuario"));
//        entidade.setSenha(rs.getString("Senha"));
//        entidade.setTipoUsuario(rs.getString("TipoUsuario"));
//        entidade.setSalaId(rs.getInt("SalaId"));
//        entidade.setDinheiro(rs.getDouble("Dinheiro"));*/
//
//        return (E)entidade;
//    }
//    
//    public Usuario buscarPorCredenciais(String usuario, String senha) throws SQLException {
//        Usuario entidade = null;
//
//        try (Connection conexao = DriverManager.getConnection(getStringConexao(), getUsuario(), getSenha())) {
//            String query = "SELECT UsuarioId, Nome, Usuario, AES_DECRYPT(Senha, '" + chaveCriptogafia + "') AS Senha, TipoUsuario, SalaId, Dinheiro FROM " + getTabela() + " WHERE Usuario = ? AND AES_DECRYPT(Senha, '" + chaveCriptogafia + "') = ?";
//
//            try (PreparedStatement stmt = conexao.prepareStatement(query)) {
//                stmt.setString(1, usuario);
//                stmt.setString(2, senha);
//
//                try (ResultSet rs = stmt.executeQuery()) {
//                    if (rs.first()) {
//                        entidade = (Usuario)preencherEntidade(rs);
//                    }
//                }
//            }
//        }
//
//        return entidade;
//    }
//    
//    @Override
//    public Entidade consultar(String usuario) throws SQLException {
//        Usuario entidade = null;
//
//        try (Connection conexao = DriverManager.getConnection(getStringConexao(), getUsuario(), getSenha())) {
//            String query = "SELECT UsuarioId, Nome, Usuario, AES_DECRYPT(Senha, '" + chaveCriptogafia + "') AS Senha, TipoUsuario, SalaId, Dinheiro FROM " + getTabela() + " WHERE Usuario = ?;";
//
//            try (PreparedStatement stmt = conexao.prepareStatement(query)) {
//                stmt.setString(1, usuario);
//
//                try (ResultSet rs = stmt.executeQuery()) {
//                    if (rs.first()) {
//                        entidade = (Usuario)preencherEntidade(rs);
//                    }
//                }
//            }
//        }
//
//        return entidade;
//    }
//}
//
//public class SQLDAO <E extends Entidade> extends DAO{
//    public SQLDAO(Class entityclass){
//        super(entityclass);
//    }
//    
//    final String STRING_CONEXAO = "jdbc:mysql://localhost/ReciclaDB?useTimezone=true&serverTimezone=UTC";  
//    final String USUARIO = "root";  
//    final String SENHA = "";
//    private String tabela;
//    
//    protected String getStringConexao(){
//        return STRING_CONEXAO;
//    }
//    
//    protected String getUsuario(){
//        return USUARIO;
//    }
//    
//    protected String getSenha(){
//        return SENHA;
//    }
//    
//    protected void setTabela(String tabela){
//        this.tabela = tabela;
//    }
//    
//    protected String getTabela(){
//        return tabela;
//    }
//
//    @Override
//    public Entidade consultar(int id) throws SQLException {
//        E entidade = null;
//
//        try (Connection conexao = DriverManager.getConnection(STRING_CONEXAO, USUARIO, SENHA)) {
//            String query = getComandoConsultar();
//
//            try (PreparedStatement stmt = conexao.prepareStatement(query)) {
//                stmt.setInt(1, id);
//
//                try (ResultSet rs = stmt.executeQuery()) {
//                    if (rs.first()) {
//                        entidade = preencherEntidade(rs);
//                    }
//                }
//            }
//        }
//
//        return entidade;
//    }
//    
//    public Entidade consultar(String valorCampo) throws SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//    protected String getComandoConsultar() {
//        String campos = "";
//        String chave = "";
//
//        for (Field campo : entityClass.getDeclaredFields()) {            
//            /*if (campo.isAnnotationPresent(CampoNoBanco.class)) {
//                CampoNoBanco anotacao = campo.getAnnotation(CampoNoBanco.class);
//
//                if (anotacao.chave()) {
//                    chave = anotacao.nome();
//                }
//
//                campos += anotacao.nome() + ", ";
//            }*/
//        }
//
//        if (campos.length() > 0) {
//            campos = campos.substring(0, campos.length()-2);
//        }
//
//        return "SELECT " + campos + " FROM " + tabela + " WHERE " + chave + " = ?;";
//    }
//    
//    @Override
//    public void inserir(Entidade entidade)  throws SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//    protected String getComandoInserir() {
//        String campos = "";
//        String valores = "";
//
//        for (Field campo : entityClass.getDeclaredFields()) {            
//            /*if (campo.isAnnotationPresent(CampoNoBanco.class)) {
//                CampoNoBanco anotacao = campo.getAnnotation(CampoNoBanco.class);
//
//                if (!anotacao.chave()) {
//                    campos += anotacao.nome() + ", ";
//                    valores += "?, ";
//                }
//            }*/
//        }
//
//        if (campos.length() > 0) {
//            campos = campos.substring(0, campos.length()-2);
//            valores = valores.substring(0, valores.length()-2);
//        }
//
//        return "INSERT INTO " + tabela + " (" + campos + ") VALUES (" + valores + ");";
//    }
//
//    @Override
//    public void atualizar(Entidade entidade) throws SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//    protected String getComandoAtualizar() {
//        String campos = "";
//        String chave = "";
//
//        for (Field campo : entityClass.getDeclaredFields()) {            
//            /*if (campo.isAnnotationPresent(CampoNoBanco.class)) {
//                CampoNoBanco anotacao = campo.getAnnotation(CampoNoBanco.class);
//
//                if (anotacao.chave()) {
//                    chave = anotacao.nome();
//                } else {
//                    campos += anotacao.nome() + " = ?, ";
//                }
//            }*/
//        }
//
//        if (campos.length() > 0) {
//            campos = campos.substring(0, campos.length()-2);
//        }
//
//        return "UPDATE " + tabela + " SET " + campos + " WHERE " + chave + " = ?";
//    }
//
//    @Override
//    public void deletar(int id) throws SQLException {
//        try (Connection conexao = DriverManager.getConnection(STRING_CONEXAO, USUARIO, SENHA )) {
//            String query = getComandoDeletar();
//
//            try (PreparedStatement stmt = conexao.prepareStatement(query)) {
//                stmt.setInt(1, id);
//
//                stmt.executeUpdate();
//            }
//        }
//    }
//    
//    protected String getComandoDeletar() {
//        String chave = "";
//
//        for (Field campo : entityClass.getDeclaredFields()) {
//            /*if (campo.isAnnotationPresent(CampoNoBanco.class)) {
//                CampoNoBanco anotacao = campo.getAnnotation(CampoNoBanco.class);
//
//                if (anotacao.chave()) {
//                    chave = anotacao.nome();
//                    break;
//                }
//            }*/
//        }
//
//        return "DELETE FROM " + tabela + " WHERE " + chave + " = ?";
//    }
//    
//    protected E preencherEntidade(ResultSet rs) throws SQLException {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
//}

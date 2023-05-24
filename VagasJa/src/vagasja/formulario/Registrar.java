package vagasja.formulario;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import BD.Conexao;

/* @author Stefani*/


public class Registrar extends javax.swing.JFrame {
    //Creates new form Formulario
    
    public Registrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        descricao2 = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        txtsobrenome = new javax.swing.JTextField();
        descricao3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sobrenome = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        confirmar = new javax.swing.JLabel();
        confirmasenha = new javax.swing.JPasswordField();
        txtsenha = new javax.swing.JPasswordField();
        txtidcondominio = new javax.swing.JTextField();
        idcondominio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        Login.setBackground(new java.awt.Color(51, 51, 51));

        descricao2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        descricao2.setForeground(new java.awt.Color(255, 255, 255));
        descricao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descricao2.setText("Crie sua Conta");
        descricao2.setToolTipText("");

        nome.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome.setText("Nome:");
        nome.setToolTipText("");

        txtnome.setBackground(new java.awt.Color(153, 153, 153));
        txtnome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtnome.setForeground(new java.awt.Color(255, 255, 255));
        txtnome.setSelectionColor(new java.awt.Color(0, 51, 204));
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        txtusuario.setBackground(new java.awt.Color(153, 153, 153));
        txtusuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.setSelectionColor(new java.awt.Color(0, 51, 204));
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });

        txtsobrenome.setBackground(new java.awt.Color(153, 153, 153));
        txtsobrenome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtsobrenome.setForeground(new java.awt.Color(255, 255, 255));
        txtsobrenome.setSelectionColor(new java.awt.Color(0, 51, 204));
        txtsobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsobrenomeActionPerformed(evt);
            }
        });

        descricao3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        descricao3.setForeground(new java.awt.Color(255, 255, 255));
        descricao3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descricao3.setText("Você pode usar letras, números e ponto final");
        descricao3.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome de usuário:");

        sobrenome.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        sobrenome.setForeground(new java.awt.Color(255, 255, 255));
        sobrenome.setText("Sobrenome:");

        senha.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setText("Senha:");

        registrar.setBackground(new java.awt.Color(255, 204, 0));
        registrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    registrarActionPerformed(evt);
                } catch (Exception ex) {
                    Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        confirmar.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        confirmar.setForeground(new java.awt.Color(255, 255, 255));
        confirmar.setText("Confirmar senha:");

        confirmasenha.setBackground(new java.awt.Color(153, 153, 153));
        confirmasenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmasenhaActionPerformed(evt);
            }
        });

        txtsenha.setBackground(new java.awt.Color(153, 153, 153));

        txtidcondominio.setBackground(new java.awt.Color(153, 153, 153));
        txtidcondominio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtidcondominio.setForeground(new java.awt.Color(255, 255, 255));
        txtidcondominio.setSelectionColor(new java.awt.Color(0, 51, 204));
        txtidcondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcondominioActionPerformed(evt);
            }
        });

        idcondominio.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        idcondominio.setForeground(new java.awt.Color(255, 255, 255));
        idcondominio.setText("ID condominio:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vagasja/formulario/imagens/logo-removebg-preview (1).png"))); // NOI18N

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(descricao2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(confirmasenha, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnome, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                    .addComponent(txtsobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                    .addComponent(txtusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                    .addComponent(descricao3)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(sobrenome)
                                    .addComponent(txtidcondominio, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                    .addComponent(idcondominio)))
                            .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                                    .addGap(140, 140, 140)
                                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(109, 109, 109))
                                .addGroup(LoginLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(senha)
                                        .addComponent(confirmar))))))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descricao2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome)
                .addGap(5, 5, 5)
                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sobrenome)
                .addGap(3, 3, 3)
                .addComponent(txtsobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(descricao3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(idcondominio)
                .addGap(1, 1, 1)
                .addComponent(txtidcondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senha)
                .addGap(1, 1, 1)
                .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmasenha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtsobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsobrenomeActionPerformed
    }//GEN-LAST:event_txtsobrenomeActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_registrarActionPerformed
        // Código registrar usuário:
        registrarUsuario();

      }//GEN-LAST:event_registrarActionPerformed

    private void confirmasenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmasenhaActionPerformed
    }//GEN-LAST:event_confirmasenhaActionPerformed

    private void txtidcondominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcondominioActionPerformed
    }//GEN-LAST:event_txtidcondominioActionPerformed
Conexao con=new Conexao();


public void registrarUsuario() throws ClassNotFoundException, Exception {
    try {
        Connection c = con.conectar();

        // Valida se os campos foram preenchidos
        if (txtidcondominio.getText().isEmpty() || txtusuario.getText().isEmpty() || txtsenha.getText().isEmpty() || confirmasenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencher todos os campos!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            return;
        } 

        // Compara as senhas
        if (!txtsenha.getText().equals(confirmasenha.getText())) {
            JOptionPane.showMessageDialog(null, "As senhas não coincidem! Tente novamente.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        // Consulta se o usuário já está cadastrado
        PreparedStatement consultaStmt = c.prepareStatement("SELECT COUNT(*) FROM tb_usuarios WHERE Usuario = ?;");
        consultaStmt.setString(1, txtusuario.getText());
        ResultSet resultado = consultaStmt.executeQuery();
        resultado.next();
        int qtdUsuarios = resultado.getInt(1);

        if (qtdUsuarios > 0) {
            // Usuário já está cadastrado
            JOptionPane.showMessageDialog(null, "Usuário já cadastrado." + "\n" + "Por favor escolha outro nome de usuário", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            return;
        } 
        
        // Criptografa a senha
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] senhaBytes = txtsenha.getText().getBytes(StandardCharsets.UTF_8);
        byte[] senhaDigest = md.digest(senhaBytes);

        // Converte o array de bytes em uma representação hexadecimal
        StringBuilder sb = new StringBuilder();
        try (Formatter formatter = new Formatter(sb)) {
            for (byte b : senhaDigest) {
                formatter.format("%02x", b);
            }
        }
        String senhaCriptografada = sb.toString();

        // Insere o novo usuário na tabela
        PreparedStatement insercaoStmt = c.prepareStatement("INSERT INTO tb_usuarios (nome, sobrenome, usuario, id_Condominio, senha) VALUES (?, ?, ?, ?, ?)");
        insercaoStmt.setString(1, txtnome.getText());
        insercaoStmt.setString(2, txtsobrenome.getText());
        insercaoStmt.setString(3, txtusuario.getText());
        insercaoStmt.setString(4, txtidcondominio.getText());
        insercaoStmt.setString(5, senhaCriptografada);
        insercaoStmt.execute();
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);

        consultaStmt.close();
        con.desconectar();
        
        // Fechar a janela após o registro ser concluído
        this.dispose();
    } catch (SQLException e) {
        System.err.println("Erro ao registrar usuário");
        System.err.println(e.getMessage());
    } catch (NoSuchAlgorithmException e) {
        System.err.println("Erro ao criptografar senha");
        System.err.println(e.getMessage());
    } finally {
        con.desconectar();
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JLabel confirmar;
    private javax.swing.JPasswordField confirmasenha;
    private javax.swing.JLabel descricao2;
    private javax.swing.JLabel descricao3;
    private javax.swing.JLabel idcondominio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nome;
    private javax.swing.JButton registrar;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel sobrenome;
    private javax.swing.JTextField txtidcondominio;
    private javax.swing.JTextField txtnome;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtsobrenome;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}

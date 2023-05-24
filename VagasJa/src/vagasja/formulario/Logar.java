
package vagasja.formulario;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Formatter;

import javax.swing.JOptionPane;

import BD.Conexao;

public class Logar extends javax.swing.JFrame {

    public Logar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        descricao = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        descricao1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        consulta = new javax.swing.JLabel();
        acessar = new javax.swing.JButton();
        senha = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtsenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        Login.setBackground(new java.awt.Color(51, 51, 51));

        descricao.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        descricao.setForeground(new java.awt.Color(255, 255, 255));
        descricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descricao.setText("VEÍCULO!");
        descricao.setToolTipText("");

        registrar.setBackground(new java.awt.Color(51, 51, 51));
        registrar.setFont(new java.awt.Font("Arial", 2, 13)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("Não tem login? Registre aqui.");
        registrar.setAutoscrolls(true);
        registrar.setNextFocusableComponent(registrar);
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        descricao1.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        descricao1.setForeground(new java.awt.Color(255, 255, 255));
        descricao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descricao1.setText("MELHORES VAGAS PARA SEU");
        descricao1.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        consulta.setBackground(new java.awt.Color(255, 204, 0));
        consulta.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        consulta.setText("CONSULTE JÁ:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(consulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        acessar.setBackground(new java.awt.Color(255, 204, 0));
        acessar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        acessar.setText("ACESSAR");
        acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessarActionPerformed(evt);
            }
        });

        senha.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setText("Senha:");

        usuario.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuário:");

        txtusuario.setBackground(new java.awt.Color(153, 153, 153));
        txtusuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.setSelectionColor(new java.awt.Color(0, 51, 204));
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });

        txtsenha.setBackground(new java.awt.Color(153, 153, 153));
        txtsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(descricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricao1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(senha)
                                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usuario))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(acessar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(descricao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(usuario)
                .addGap(2, 2, 2)
                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(senha)
                .addGap(18, 18, 18)
                .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(acessar)
                .addGap(18, 18, 18)
                .addComponent(registrar)
                .addContainerGap(89, Short.MAX_VALUE))
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

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        Registrar registrar = new Registrar();
       registrar.setVisible(true);
    }//GEN-LAST:event_registrarActionPerformed

    private void acessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessarActionPerformed
        // Chamando estrutura de logi:
        consultarUsuario();
    }//GEN-LAST:event_acessarActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsenhaActionPerformed
 Conexao con=new Conexao();
 
 public void consultarUsuario() {
    try {
        Connection c = con.conectar();
        if (txtusuario.getText().isEmpty() || txtsenha.getText().isEmpty()) {
            // valida nome e senha se foram preenchidos
            txtusuario.grabFocus();
            JOptionPane.showMessageDialog(null, "Preencher usuário e senha.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String senhaDigitada = txtsenha.getText();
        PreparedStatement consultaStmt = c.prepareStatement("SELECT * FROM tb_usuarios WHERE Usuario = ?");
        consultaStmt.setString(1, txtusuario.getText());
        ResultSet rs = consultaStmt.executeQuery();
        if (rs.next()) {
            // Verifica se a senha digitada corresponde à senha armazenada criptografada
            String senhaCriptografada = rs.getString("Senha");
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] senhaBytes = senhaDigitada.getBytes(StandardCharsets.UTF_8);
            byte[] senhaDigest = md.digest(senhaBytes);
            
            // Converte o array de bytes em uma representação hexadecimal
            StringBuilder sb = new StringBuilder();
            try (Formatter formatter = new Formatter(sb)) {
                for (byte b : senhaDigest) {
                    formatter.format("%02x", b);
                }
            }
            String senhaCriptografadaDigitada = sb.toString();
            // senha não se descriptografa, e sim compara
            if (senhaCriptografada.equals(senhaCriptografadaDigitada)) {
                JOptionPane.showMessageDialog(null, "Usuário logado.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta." + "\n" +"Tente novamente.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado." + "\n" + "Por favor registre-se", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
        consultaStmt.close();
        con.desconectar();
    } catch (Exception e) {
        System.err.println("Erro ao consultar usuário");
        System.err.println(e.getMessage());
    } finally {
        con.desconectar();
    }
}

/*  PROXIMO PASSO
                limpaTela();
                txtIdcondominio.setText(rs.getString("ID_Condominio"));
                txtusuario.setText(rs.getString("Usuario"));
                txtsenha.setText(rs.getString("Senha"));
                cn.close();*/

public String criptografarSenha(String senha) {
    try {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(senha.getBytes(StandardCharsets.UTF_8));
        String senhaCriptografada = Base64.getEncoder().encodeToString(hash);
        return senhaCriptografada;
    } catch (NoSuchAlgorithmException e) {
        System.err.println("Erro ao criptografar senha");
        System.err.println(e.getMessage());
        return senha;
    }
}
 
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
    }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Logar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logar().setVisible(true);
            }
        });
     
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JButton acessar;
    private javax.swing.JLabel consulta;
    private javax.swing.JLabel descricao;
    private javax.swing.JLabel descricao1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registrar;
    private javax.swing.JLabel senha;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtusuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables


}

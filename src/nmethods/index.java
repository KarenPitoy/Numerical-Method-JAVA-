package nmethods;
import javax.swing.JOptionPane;
public class index extends javax.swing.JFrame {
    public index() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose Method");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 190, 270, 20);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NUMERICAL METHODS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 40, 440, 70);

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pitoy, Karen Jeszary I.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 100, 270, 20);

        combo.setBackground(new java.awt.Color(255, 255, 255));
        combo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        combo.setForeground(new java.awt.Color(0, 0, 0));
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Graphing ", "Incremental ", "Bisection", "Regula Falsi", "Fixed Point", "Newton Raphson", "Secant", " " }));
        combo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(combo);
        combo.setBounds(220, 230, 150, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Proceed");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(250, 280, 90, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (combo.getSelectedIndex() == 0){
           JOptionPane.showMessageDialog(null, "Please Select a method!!");
       }else if (combo.getSelectedIndex() == 1){
           this.dispose();
           Graphing graph = new Graphing();
           graph.setVisible(true);
           graph.setLocationRelativeTo(null);
       }else if (combo.getSelectedIndex() == 2){
           this.dispose();
           Incremental incremental  = new Incremental();
           incremental.setVisible(true);
           incremental.setLocationRelativeTo(null);
       }else if (combo.getSelectedIndex() == 3){
           this.dispose();
           Bisection bisection = new Bisection();
           bisection.setVisible(true);
           bisection.setLocationRelativeTo(null);
       }else if (combo.getSelectedIndex() == 4){
           this.dispose();
           RegulaFalsi rf = new RegulaFalsi();
           rf.setVisible(true);
           rf.setLocationRelativeTo(null);
        }else if (combo.getSelectedIndex() == 5){
           this.dispose();
           FixedPoint fp = new FixedPoint();
           fp.setVisible(true);
           fp.setLocationRelativeTo(null);
        }else if (combo.getSelectedIndex() == 6){
           this.dispose();
           NewtonRaphson nr = new NewtonRaphson();
           nr.setVisible(true);
           nr.setLocationRelativeTo(null);
        }else if (combo.getSelectedIndex() == 7){
           this.dispose();
           Secant s = new Secant();
           s.setVisible(true);
           s.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

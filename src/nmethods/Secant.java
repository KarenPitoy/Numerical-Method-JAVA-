package nmethods;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Secant extends javax.swing.JFrame {

    public Secant() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        root = new javax.swing.JTextField();
        lb = new javax.swing.JTextField();
        equation = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        ub = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        graph = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Equation:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 100, 130, 40);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Approximate Root:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 160, 170, 40);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("xL");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(410, 100, 30, 40);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("xU");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(540, 100, 40, 40);

        root.setEditable(false);
        root.setBackground(new java.awt.Color(255, 255, 255));
        root.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        root.setForeground(new java.awt.Color(0, 0, 0));
        root.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        root.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootActionPerformed(evt);
            }
        });
        jPanel1.add(root);
        root.setBounds(390, 160, 310, 40);

        lb.setBackground(new java.awt.Color(255, 255, 255));
        lb.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        lb.setForeground(new java.awt.Color(0, 0, 0));
        lb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbActionPerformed(evt);
            }
        });
        lb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbKeyTyped(evt);
            }
        });
        jPanel1.add(lb);
        lb.setBounds(450, 100, 80, 40);

        equation.setBackground(new java.awt.Color(255, 255, 255));
        equation.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        equation.setForeground(new java.awt.Color(0, 0, 0));
        equation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        equation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equationActionPerformed(evt);
            }
        });
        equation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                equationKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                equationKeyTyped(evt);
            }
        });
        jPanel1.add(equation);
        equation.setBounds(210, 100, 190, 40);

        table.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "Xi-1", "Xi", "Xi+1", "f(Xi-1)", "f(Xi)", "f(Xi+1)", "Error"
            }
        ));
        table.setEnabled(false);
        table.setFocusable(false);
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 430, 870, 300);

        ub.setBackground(new java.awt.Color(255, 255, 255));
        ub.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        ub.setForeground(new java.awt.Color(0, 0, 0));
        ub.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubActionPerformed(evt);
            }
        });
        ub.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ubKeyTyped(evt);
            }
        });
        jPanel1.add(ub);
        ub.setBounds(570, 100, 90, 40);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Calculate");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(680, 100, 150, 40);

        graph.setBackground(new java.awt.Color(255, 255, 255));
        graph.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        graph.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout graphLayout = new javax.swing.GroupLayout(graph);
        graph.setLayout(graphLayout);
        graphLayout.setHorizontalGroup(
            graphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        graphLayout.setVerticalGroup(
            graphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );

        jPanel1.add(graph);
        graph.setBounds(140, 210, 660, 210);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("<BACK");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(30, 20, 70, 30);

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SECANT METHOD");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(270, 20, 420, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 940, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rootActionPerformed

    private void lbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbActionPerformed

    private void lbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbKeyTyped
        /*  char a = evt.getKeyChar();
        if(!(Character.isDigit(a) || a=='-' || (a==KeyEvent.VK_BACK_SPACE)||a==KeyEvent.VK_DELETE)){
            evt.consume();
        }*/
    }//GEN-LAST:event_lbKeyTyped

    private void equationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equationActionPerformed

    private void equationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equationKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_equationKeyPressed

    private void equationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equationKeyTyped
/*       char a = evt.getKeyChar();
        if (!(Character.isDigit(a) || a == 'x' || a=='.' || a == '+' || a == '-' || a == '^' || a == 'e' || a == KeyEvent.VK_BACK_SPACE || a == KeyEvent.VK_DELETE)) {
            evt.consume();
        }*/
    }//GEN-LAST:event_equationKeyTyped

    private void ubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubActionPerformed

    private void ubKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ubKeyTyped
        /*  char a = evt.getKeyChar();
        if(!(Character.isDigit(a) || a=='-' || (a==KeyEvent.VK_BACK_SPACE)||a==KeyEvent.VK_DELETE)){
            evt.consume();
        }*/
    }//GEN-LAST:event_ubKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Secant();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        index x = new index();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Secant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Secant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Secant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Secant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Secant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField equation;
    private javax.swing.JPanel graph;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lb;
    private javax.swing.JTextField root;
    private javax.swing.JTable table;
    private javax.swing.JTextField ub;
    // End of variables declaration//GEN-END:variables
private static double evaluateFunction(String expression, double x) {
        // Create an expression with the given string and variable
        Expression e = new ExpressionBuilder(expression)
                .variable("x")
                .build()
                .setVariable("x", x);

        // Evaluate the expression
        return e.evaluate();
    }
private void Secant() {
    try {
        DecimalFormat decimalFormat = new DecimalFormat("#.#############");
        if (equation.getText().isEmpty() || lb.getText().isEmpty() || ub.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ENTER THE NECESSARY DATA NEEDED!");
        } else {
            ArrayList<Object[]> data = new ArrayList<>();
            double MarginE = 0.001;
            double x0 = Double.parseDouble(lb.getText());
            double x1 = Double.parseDouble(ub.getText());
            int iterations = 0;
            double roott = 0;
            double error = Double.MAX_VALUE; // Initialize error with a large value
            
            while (error > MarginE) {
                iterations++;
                double fx0 = evaluateFunction(equation.getText(), x0);
                double fx1 = evaluateFunction(equation.getText(), x1);
                double numerator = fx1 * (x0 - x1);
                double denominator = fx0 - fx1;
                double x2 = x1 - numerator / denominator;
                double fx2 = evaluateFunction(equation.getText(), x2);

                // Update error based on the difference between x2 and x1
                error = Math.abs(x2 - x1);

                // Check if the error is within the acceptable range
                if (error <= MarginE) {
                    roott = x2; // Update the root
                    break; // Terminate the loop if error is within the acceptable range
                }

                // Update values for next iteration
                x0 = x1;
                x1 = x2;

                // Decimal formatting and adding data to the table
                String decimalnumX0 = decimalFormat.format(x0);
                String decimalnumX1 = decimalFormat.format(x1);
                String decimalnumX2 = decimalFormat.format(x2);
                String decimalnumFx0 = decimalFormat.format(fx0);
                String decimalnumFx1 = decimalFormat.format(fx1);
                String decimalnumFx2 = decimalFormat.format(fx2);
                String decimalnumE = decimalFormat.format(error);

                Object[] rowData = {iterations, decimalnumX0, decimalnumX1, decimalnumX2, decimalnumFx0, decimalnumFx1, decimalnumFx2, decimalnumE};
                data.add(rowData);
            }

            // Update table model with data
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            for (Object[] row : data) {
                model.addRow(row);
            }

            // Highlight the last row
            int lastRowIndex = model.getRowCount() - 1;
            if (lastRowIndex >= 0) {
                table.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                table.setSelectionBackground(Color.CYAN);
            }

            // Update the root value
            String decimalRoot = decimalFormat.format(roott);
            root.setText(decimalRoot);

            // Update the graph
            graph(equation.getText(), roott);
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "CHECK YOUR DATA INPUT!");
    }
}
private void graph(String equationStr, double root) {
    XYSeries series = new XYSeries("Function");

    // Determine the range of x values based on the root and function behavior
    double minX = root - 10; // Adjust as needed
    double maxX = root + 10; // Adjust as needed

    // Set up the range of y-values
    double minY = Double.MAX_VALUE;
    double maxY = -Double.MAX_VALUE;
    double step = 0.1; // Define the step size

    for (double x = minX; x <= maxX; x += step) {
        double y = evaluateFunction(equationStr, x);
        series.add(x, y);

        // Update min and max y values
        minY = Math.min(minY, y);
        maxY = Math.max(maxY, y);
    }

    // Set up the range of y-values
    double yPadding = (maxY - minY) * 0.1;
    minY -= yPadding;
    maxY += yPadding;

    XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(series);

    JFreeChart chart = ChartFactory.createXYLineChart(
            "Graph",
            "X",
            "f(X)",
            dataset
    );
    chart.setBackgroundPaint(Color.WHITE);

    XYPlot plot = (XYPlot) chart.getPlot();
    plot.setBackgroundPaint(Color.WHITE);
    plot.setDomainGridlinesVisible(true);
    plot.setDomainGridlinePaint(Color.LIGHT_GRAY);
    plot.setRangeGridlinesVisible(true);
    plot.setRangeGridlinePaint(Color.LIGHT_GRAY);

    // Customize the appearance of the axes
    plot.setDomainZeroBaselineVisible(true);
    plot.setRangeZeroBaselineVisible(true);
    plot.setDomainZeroBaselinePaint(Color.BLACK);
    plot.setRangeZeroBaselinePaint(Color.BLACK);

    plot.getRenderer().setSeriesPaint(0, Color.BLUE);

    XYSeries rootSeries = new XYSeries("Root");
    rootSeries.add(root, evaluateFunction(equationStr, root));
    
    XYSeriesCollection rootDataset = new XYSeriesCollection();
    rootDataset.addSeries(rootSeries);
    plot.setDataset(1, rootDataset);
    plot.mapDatasetToDomainAxis(1, 0);
    plot.mapDatasetToRangeAxis(1, 0);
    XYItemRenderer renderer = new XYLineAndShapeRenderer(false, true);
    renderer.setSeriesPaint(0, Color.RED);
    plot.setRenderer(1, renderer);

    // Set the range of the axes
    plot.getDomainAxis().setRange(minX, maxX);
    plot.getRangeAxis().setRange(minY, maxY);

    // Create ChartPanel with panning enabled
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setMouseWheelEnabled(true);
    chartPanel.setDomainZoomable(true);
    chartPanel.setRangeZoomable(true);
    chartPanel.setPreferredSize(new Dimension(660, 210));

    graph.setLayout(new BorderLayout());
    graph.removeAll();
    graph.add(chartPanel, BorderLayout.CENTER);
    graph.revalidate();
    graph.repaint();
}

}

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

public class NewtonRaphson extends javax.swing.JFrame {

    public NewtonRaphson() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        root = new javax.swing.JTextField();
        lb = new javax.swing.JTextField();
        equation = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
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
        jLabel3.setBounds(170, 100, 130, 40);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Approximate Root:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 160, 170, 40);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("xL");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(480, 100, 30, 40);

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
        root.setBounds(380, 160, 310, 40);

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
        lb.setBounds(520, 100, 80, 40);

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
        equation.setBounds(280, 100, 190, 40);

        table.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "x0", "f(x0)", "x1", "f(x1)", "Error"
            }
        ));
        table.setEnabled(false);
        table.setFocusable(false);
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 440, 870, 290);

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
        jButton4.setBounds(620, 100, 150, 40);

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
        graph.setBounds(140, 220, 660, 210);

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
        jLabel5.setText("NEWTON RAPHSON METHOD");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(230, 20, 460, 40);

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

    }//GEN-LAST:event_equationKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        NewtonRaphson();
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
            java.util.logging.Logger.getLogger(NewtonRaphson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewtonRaphson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewtonRaphson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewtonRaphson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewtonRaphson().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lb;
    private javax.swing.JTextField root;
    private javax.swing.JTable table;
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
private void NewtonRaphson() {
    try {
        DecimalFormat decimalFormat = new DecimalFormat("#.#############");
        if (equation.getText().isEmpty() || lb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the data needed, Thank you!");
        } else {
            ArrayList<Object[]> data = new ArrayList<>();
            double MarginE = 0.001;
            double x0 = Double.parseDouble(lb.getText()); // Initial guess
            double fx0, fDashX0, x1, fx1;
            int iterations = 0;
            double error = Double.MAX_VALUE;

            while (error > MarginE) {
                iterations++;
                fx0 = evaluateFunction(equation.getText(), x0);
                fDashX0 = differentiateFunction(equation.getText(), x0);
                System.out.println(fDashX0);

                // Newton-Raphson formula for finding next approximation
                x1 = x0 - (fx0 / fDashX0);
                fx1 = evaluateFunction(equation.getText(), x1);
                
                String decimalnumX0 = decimalFormat.format(x0);
                String decimalnumX1 = decimalFormat.format(x1);
                String decimalnumFX0 = decimalFormat.format(fx0);
                String decimalnumFX1 = decimalFormat.format(fx1);
                String decimalnumError;

                if (iterations == 1) {
                    decimalnumError = " ";
                } else {
                    double prevX0 = Double.parseDouble(data.get(iterations - 2)[1].toString());
                    error = Math.abs(x1 - prevX0) / Math.abs(x1) * 100;
                    decimalnumError = decimalFormat.format(error);
                }

                Object[] rowData = {iterations, decimalnumX0, decimalnumFX0, decimalnumX1, decimalnumFX1, decimalnumError};
                data.add(rowData);

                x0 = x1;
            }

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            for (Object[] row : data) {
                model.addRow(row);
            }

            int lastRowIndex = model.getRowCount() - 1;
            if (lastRowIndex >= 0) {
                table.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                table.setSelectionBackground(Color.CYAN);
            }

            // Displaying the root, assuming it's the last computed x1
            String decimalRoot = decimalFormat.format(x0);
            root.setText(decimalRoot);
            graph(equation.getText(), x0);
        }
    } catch (NumberFormatException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers for lower and upper bounds.");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

private double differentiateFunction(String equationStr, double xValue) {
    double h = 0.000001; // a small value
    return (evaluateFunction(equationStr, xValue + h) - evaluateFunction(equationStr, xValue)) / h;
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

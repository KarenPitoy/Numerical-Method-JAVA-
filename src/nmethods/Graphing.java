package nmethods;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
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

public class Graphing extends javax.swing.JFrame {

    public Graphing() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        equation = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rootLabel = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        graph = new javax.swing.JPanel();
        xl = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

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
        equation.setBounds(240, 90, 250, 40);

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Approximate Root:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(260, 150, 170, 40);

        rootLabel.setEditable(false);
        rootLabel.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        rootLabel.setForeground(new java.awt.Color(0, 0, 0));
        rootLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rootLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootLabelActionPerformed(evt);
            }
        });
        jPanel1.add(rootLabel);
        rootLabel.setBounds(440, 150, 190, 40);

        table.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "x", "f(x)"
            }
        ));
        table.setEnabled(false);
        table.setFocusable(false);
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(60, 440, 820, 250);

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("CALCULATE");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(680, 90, 130, 40);

        graph.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        graph.setForeground(new java.awt.Color(0, 0, 0));
        graph.setLayout(null);
        jPanel1.add(graph);
        graph.setBounds(120, 200, 700, 230);

        xl.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        xl.setForeground(new java.awt.Color(0, 0, 0));
        xl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        xl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xlActionPerformed(evt);
            }
        });
        xl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xlKeyTyped(evt);
            }
        });
        jPanel1.add(xl);
        xl.setBounds(560, 90, 100, 40);

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("xL");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(520, 90, 30, 40);

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

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GRAPHING METHOD");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(300, 20, 340, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 940, 80);

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Equation:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 90, 130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void equationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equationActionPerformed

    private void equationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equationKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_equationKeyPressed

    private void equationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equationKeyTyped
    
    }//GEN-LAST:event_equationKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GraphicalMethod(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rootLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rootLabelActionPerformed

    private void xlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xlActionPerformed

    private void xlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xlKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_xlKeyTyped

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
            java.util.logging.Logger.getLogger(Graphing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graphing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graphing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graphing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graphing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField equation;
    private javax.swing.JPanel graph;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField rootLabel;
    private javax.swing.JTable table;
    private javax.swing.JTextField xl;
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
private void GraphicalMethod() {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            String eqStr = equation.getText().replaceAll("\\s", "");
            double valX = Double.parseDouble(xl.getText());
            DecimalFormat format = new DecimalFormat("#.####");

            ArrayList<Object[]> dataList = new ArrayList<>();

            double prevY = evaluateFunction(eqStr, valX);
            String decX = format.format(valX);
            String decY = format.format(prevY);
            dataList.add(new Object[]{decX, decY});

                double step = 0.2;
                double currX = valX + step;
                double currY = evaluateFunction(eqStr, currX);
                boolean signChange = false;

                double rootVal = Double.NaN;

                try {

                    while (!signChange) {
                        decX = format.format(currX);
                        decY = format.format(currY);
                        dataList.add(new Object[]{decX, decY});
                        model.setRowCount(0);

                        for (Object[] row : dataList) {
                            model.addRow(row);
                        }

                        if (prevY * currY < 0) {
                            double tolerance = 0.001;
                            double root = 0;
                            double lowerBound = currX - step;
                            double upperBound = currX;

                            do {
                                root = (lowerBound * evaluateFunction(eqStr, upperBound) - upperBound * evaluateFunction(eqStr, lowerBound))
                                / (evaluateFunction(eqStr, upperBound) - evaluateFunction(eqStr, lowerBound));

                                double fA = evaluateFunction(eqStr, lowerBound);
                                double fC = evaluateFunction(eqStr, root);

                                if (fC == 0.0) {
                                    break;
                                } else if (fA * fC < 0) {
                                    upperBound = root;
                                } else {
                                    lowerBound = root;
                                }
                            } while (Math.abs(upperBound - lowerBound) > tolerance);

                            rootVal = root;
                            rootLabel.setText(format.format(rootVal));

                            signChange = true; // Set signChange to true to exit the loop

                            graph(equation.getText(), root);
                        } else {
                            prevY = currY;
                            currX += step;
                            currY = evaluateFunction(eqStr, currX);
                        }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
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

package nmethods;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
public class Bisection extends javax.swing.JFrame {
    
    public Bisection() {
       initComponents();
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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
        jLabel3.setBounds(80, 110, 130, 40);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Approximate Root:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 170, 170, 40);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("xL");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(390, 110, 30, 40);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("xU");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(520, 110, 40, 40);

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
        root.setBounds(370, 170, 310, 40);

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
        lb.setBounds(430, 110, 80, 40);

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
        equation.setBounds(190, 110, 190, 40);

        table.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "xL", "xR", "xU", "f(xL)", "f(xU)", "Error", "f(xL)*f(xU)"
            }
        ));
        table.setEnabled(false);
        table.setFocusable(false);
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 470, 870, 280);

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
        ub.setBounds(570, 110, 90, 40);

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
        jButton4.setBounds(670, 110, 150, 40);

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
            .addGap(0, 228, Short.MAX_VALUE)
        );

        jPanel1.add(graph);
        graph.setBounds(140, 220, 660, 230);

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
        jLabel5.setText("BISECTION METHOD");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(300, 20, 360, 40);

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

    private void ubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubActionPerformed

    private void lbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbActionPerformed

    private void rootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rootActionPerformed

    private void lbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbKeyTyped
      /*  char a = evt.getKeyChar();
        if(!(Character.isDigit(a) || a=='-' || (a==KeyEvent.VK_BACK_SPACE)||a==KeyEvent.VK_DELETE)){
            evt.consume();
        }*/
    }//GEN-LAST:event_lbKeyTyped

    private void ubKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ubKeyTyped
      /*  char a = evt.getKeyChar();
        if(!(Character.isDigit(a) || a=='-' || (a==KeyEvent.VK_BACK_SPACE)||a==KeyEvent.VK_DELETE)){
            evt.consume();
        }*/
    }//GEN-LAST:event_ubKeyTyped

    private void equationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equationKeyTyped
       
         rootsList.clear();
         totalIterationCount = 1;
    }//GEN-LAST:event_equationKeyTyped

    private void equationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equationKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_equationKeyPressed

    private void equationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equationActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       totalIterationCount = 1;
       Bisection();
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
            java.util.logging.Logger.getLogger(Bisection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bisection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bisection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bisection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bisection().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lb;
    private javax.swing.JTextField root;
    private javax.swing.JTable table;
    private javax.swing.JTextField ub;
    // End of variables declaration//GEN-END:variables
private double xL = Double.NEGATIVE_INFINITY; 
private double xU = Double.POSITIVE_INFINITY;
private int totalIterationCount = 1; 
private List<Double> rootsList = new ArrayList<>();



   /* private static double evaluateFunction(String f, double x) {
        f = f.replaceAll("\\s", ""); // Remove all spaces
        f = f.replaceAll("e", Math.E + ""); // Replace 'e' with the value of Euler's number
        f = f.replaceAll("x", String.valueOf(x)); // Replace 'x' with the given value of x

        try {
            // Evaluate the modified expression
            return (double) evalWithExponential(f);
        } catch (Exception e) {
            e.printStackTrace();
            return Double.NaN; // Return NaN in case of an error
        }
    }

    private static Object evalWithExponential(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("exp")) x = Math.exp(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
*/
 private static double evaluateFunction(String expression, double x) {
        // Create an expression with the given string and variable
        Expression e = new ExpressionBuilder(expression)
                .variable("x")
                .build()
                .setVariable("x", x);

        // Evaluate the expression
        return e.evaluate();
    }

private void Bisection() {
    try {
        double lowerb = Double.parseDouble(lb.getText());
        double upperb = Double.parseDouble(ub.getText());

        int rangeEnd = (int) (upperb - lowerb) * 10 + 1; // Increase resolution for better accuracy
        double[] functionValues = new double[rangeEnd];
        double[] xValues = new double[rangeEnd];

        // Evaluate the function at each x-value and store the results in arrays
        double x = lowerb;
        double step = (upperb - lowerb) / (rangeEnd - 1); // Calculate step size
        for (int i = 0; i < rangeEnd; i++) {
            functionValues[i] = evaluateFunction(equation.getText(), x);
            xValues[i] = x;
            x += step;
        }

        ArrayList<double[]> bracketing = new ArrayList<>();
        for (int i = 0; i < functionValues.length - 1; i++) {
            double current = functionValues[i];
            double next = functionValues[i + 1];
            double currentX = xValues[i];
            double nextX = xValues[i + 1];
            if (Math.signum(current) != Math.signum(next)) {
                double[] bounds = new double[2];
                bounds[0] = currentX;
                bounds[1] = nextX;
                bracketing.add(bounds);
            }
        }

        // Clear existing table data
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        int previousRowIndex = -1;
        int lastRowIndex = -1;

        // Loop through each bracketing interval
        for (double[] bounds : bracketing) {
            double xL = bounds[0]; // Update xL and xU for each iteration
            double xU = bounds[1];

            // Perform bisection for the current interval
            ArrayList<Object[]> data = new ArrayList<>();
            DecimalFormat decimalFormat = new DecimalFormat("#.#######");
            double Margin = 0.001;
            double xR = (xL + xU) / 2.0;
            int iteration = totalIterationCount - 1;
            double prevXR = 0;

            while (xU - xL > Margin) {
                iteration++;
                double fxL = evaluateFunction(equation.getText(), xL);
                double fxR = evaluateFunction(equation.getText(), xR);
                double fxU = evaluateFunction(equation.getText(), xU);
                double positive = fxL * fxU;

                String decimalnumA = decimalFormat.format(xL);
                String decimalnumB = decimalFormat.format(xR);
                String decimalnumC = decimalFormat.format(xU);
                String decimalnumFA = decimalFormat.format(fxL);
                String decimalnumFC = decimalFormat.format(fxU);
                String decimalnumERROR;

                if (iteration == totalIterationCount) {
                    decimalnumERROR = " ";
                } else {
                    double currentError = Math.abs(xR - prevXR) / Math.abs(xR) * 100;
                    decimalnumERROR = decimalFormat.format(currentError);
                }
                String sign;
                if (positive < 0) {
                    sign = "<0";
                } else if (positive > 0) {
                    sign = ">0";
                } else {
                    sign = "0"; 
                }

                Object[] rowData = {iteration, decimalnumA, decimalnumB, decimalnumC,
                        decimalnumFA, decimalnumFC, decimalnumERROR, sign}; 
                data.add(rowData);

                if (fxL * fxR < 0) {
                    xU = xR;
                } else if (fxL * fxR > 0) {
                    xL = xR;
                }

                prevXR = xR;
                xR = (xL + xU) / 2.0;

                if (Math.abs(evaluateFunction(equation.getText(), xR)) < Margin) {
                    boolean isDuplicate = false;
                    for (Double root : rootsList) {
                        if (Math.abs(root - xR) < Margin) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        rootsList.add(xR); 
                    }
                }
            }

            for (Object[] row : data) {
                model.addRow(row);
            }
            if (previousRowIndex != -1) {
                table.addRowSelectionInterval(previousRowIndex, previousRowIndex);
                table.setSelectionBackground(Color.CYAN);
            }

            // Store the current row index before updating the interval
            previousRowIndex = model.getRowCount() - 1;
            lastRowIndex = previousRowIndex;
            totalIterationCount += data.size();
        }

        if (lastRowIndex != -1) {
            table.addRowSelectionInterval(lastRowIndex, lastRowIndex);
            table.setSelectionBackground(Color.CYAN);

            // Extract values from the third column (index 2) of all highlighted rows
            int[] selectedRows = table.getSelectedRows();
            StringBuilder selectedValues = new StringBuilder();
            List<Double> rootValues = new ArrayList<>();
            for (int row : selectedRows) {
                Object valueAtColumn3 = model.getValueAt(row, 2);
                if (valueAtColumn3 != null) {
                    selectedValues.append(valueAtColumn3.toString()).append(", ");
                    rootValues.add(Double.parseDouble(valueAtColumn3.toString()));
                }
            }

            // Remove trailing comma and space, and set the value to the label named "root"
            if (selectedValues.length() > 0) {
                selectedValues.setLength(selectedValues.length() - 2);
            }
            root.setText(selectedValues.toString());

            // Pass the extracted roots to the graph method
            graph(equation.getText(), rootValues);
        }

        StringBuilder rootsStringBuilder = new StringBuilder();
        for (Double roott : rootsList) {
            DecimalFormat decimalFormat = new DecimalFormat("#.####");
            String decimalRoot = decimalFormat.format(roott);
            rootsStringBuilder.append(decimalRoot).append(", ");
        }
        String rootsString = rootsStringBuilder.toString();
        if (!rootsString.isEmpty()) {
            rootsString = rootsString.substring(0, rootsString.length() - 2); 
        }

        //root.setText(rootsString);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}
private void graph(String equationStr, List<Double> roots) {
    XYSeries series = new XYSeries("Function");

    // Determine the range of x values based on roots and function behavior
    double minX = Double.MAX_VALUE;
    double maxX = -Double.MAX_VALUE;
    for (Double root : roots) {
        minX = Math.min(minX, root);
        maxX = Math.max(maxX, root);
    }

    // Extend the range slightly to ensure the graph extends beyond the roots
    double xPadding = (maxX - minX) * 0.1;
    minX -= xPadding;
    maxX += xPadding;

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
    for (Double root : roots) {
        rootSeries.add(root, (Number) evaluateFunction(equationStr, root));
    }
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


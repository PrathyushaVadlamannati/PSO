package Interface;

import Business.ParticleFlyingRobot;
import Business.ParticlePosition;
import Business.ParticleSwarmOptimizationImpl;
import Threads.ParticlesUpdateTimerTask;
import java.awt.Color;
import java.awt.FlowLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author prathyusha
 */
public class GraphicsFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public GraphicsFrame() {

        initComponents();
        this.setVisible(true);

    }

    public static GraphicsFrame mMainJFrame;
    public static HashMap<Integer, Integer> hashMapMain = new HashMap<Integer, Integer>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        startBtn = new javax.swing.JButton();
        NumAgentslbl = new javax.swing.JLabel();
        numAgentstxt = new javax.swing.JTextField();
        TargetXPoslbl = new javax.swing.JLabel();
        targetYPostxt = new javax.swing.JTextField();
        TargetYPoslbl = new javax.swing.JLabel();
        Xmaxtxt = new javax.swing.JTextField();
        Xminlbl = new javax.swing.JLabel();
        targetXPostxt = new javax.swing.JTextField();
        Xmaxlbl = new javax.swing.JLabel();
        Ymaxtxt = new javax.swing.JTextField();
        Yminlbl = new javax.swing.JLabel();
        Xmintxt = new javax.swing.JTextField();
        Ymaxlbl = new javax.swing.JLabel();
        Ymintxt = new javax.swing.JTextField();
        Inertialbl = new javax.swing.JLabel();
        graphBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        startBtn.setText("Start");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        NumAgentslbl.setText("Num of Agents:");

        numAgentstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAgentstxtActionPerformed(evt);
            }
        });

        TargetXPoslbl.setText("Target X Pos:");

        TargetYPoslbl.setText("Target Y Pos:");

        Xmaxtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XmaxtxtActionPerformed(evt);
            }
        });

        Xminlbl.setText("Xmin:");

        targetXPostxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetXPostxtActionPerformed(evt);
            }
        });

        Xmaxlbl.setText("Xmax:");

        Ymaxtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YmaxtxtActionPerformed(evt);
            }
        });

        Yminlbl.setText("Ymin:");

        Xmintxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XmintxtActionPerformed(evt);
            }
        });

        Ymaxlbl.setText("Ymax:");

        Ymintxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YmintxtActionPerformed(evt);
            }
        });

        graphBtn.setText("Graph");
        graphBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumAgentslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Inertialbl)
                            .addComponent(Ymaxlbl)
                            .addComponent(Yminlbl)
                            .addComponent(Xmaxlbl)
                            .addComponent(TargetXPoslbl)
                            .addComponent(numAgentstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(targetXPostxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TargetYPoslbl)
                            .addComponent(targetYPostxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Xminlbl))
                            .addComponent(Xmintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Xmaxtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ymintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ymaxtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(graphBtn)
                            .addComponent(startBtn))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(NumAgentslbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numAgentstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TargetXPoslbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(targetXPostxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TargetYPoslbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(targetYPostxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Xminlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Xmintxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Xmaxlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Xmaxtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Yminlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ymintxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ymaxlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ymaxtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inertialbl)
                .addGap(32, 32, 32)
                .addComponent(startBtn)
                .addGap(52, 52, 52)
                .addComponent(graphBtn)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 677));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1093, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YmintxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YmintxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YmintxtActionPerformed

    private void XmintxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XmintxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_XmintxtActionPerformed

    private void YmaxtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YmaxtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YmaxtxtActionPerformed

    private void targetXPostxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetXPostxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_targetXPostxtActionPerformed

    private void XmaxtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XmaxtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_XmaxtxtActionPerformed

    private void numAgentstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAgentstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numAgentstxtActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed

        double targetPostionxy[] = new double[2];

        double Xmin, Xmax, Ymin, Ymax;
        double inertia, constant1, constant2;

        if (numAgentstxt.getText().equals("") || targetXPostxt.getText().equals("") || targetYPostxt.getText().equals("") || Xmintxt.getText().equals("")
                || Xmaxtxt.getText().equals("") || Ymintxt.getText().equals("") || Ymaxtxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Input is Empty");
        } else {
            try {

                if (Integer.parseInt(numAgentstxt.getText()) < 5) {
                    JOptionPane.showMessageDialog(null, "Enter Minimum of 5 agents");
                } else if (Integer.parseInt(numAgentstxt.getText()) > 200) {
                    JOptionPane.showMessageDialog(null, "Enter Maximum of 200 agents");
                } else if (Double.parseDouble(targetXPostxt.getText()) < 11 || Double.parseDouble(targetYPostxt.getText()) < 11 || Double.parseDouble(targetXPostxt.getText()) > 120 || Double.parseDouble(targetYPostxt.getText()) > 120) {

                    JOptionPane.showMessageDialog(null, "Enter value greater than 10 and below screen coordinates");
                } else if (Double.parseDouble(Xmintxt.getText()) < 11 || Double.parseDouble(Xmaxtxt.getText()) < 11 || Double.parseDouble(Ymintxt.getText()) < 11 || Double.parseDouble(Ymaxtxt.getText()) < 11 || Double.parseDouble(Xmintxt.getText()) > 120 || Double.parseDouble(Xmaxtxt.getText()) > 120 || Double.parseDouble(Ymintxt.getText()) > 120 || Double.parseDouble(Ymaxtxt.getText()) > 120) {
                    JOptionPane.showMessageDialog(null, "Enter value greater than 10 and below screen coordinates");
                } else if ((Double.parseDouble(Xmintxt.getText()) >= Double.parseDouble(Xmaxtxt.getText())
                        || (Double.parseDouble(Ymintxt.getText()) >= Double.parseDouble(Ymaxtxt.getText())))) {

                    JOptionPane.showMessageDialog(null, "Min should be less than Max");

                } else {
                    targetPostionxy[0] = Double.parseDouble(targetXPostxt.getText());
                    targetPostionxy[1] = Double.parseDouble(targetYPostxt.getText());

                    Xmin = Double.parseDouble(Xmintxt.getText());
                    Xmax = Double.parseDouble(Xmaxtxt.getText());
                    Ymin = Double.parseDouble(Ymintxt.getText());
                    Ymax = Double.parseDouble(Ymaxtxt.getText());

                    int swarm_size = Integer.parseInt(numAgentstxt.getText());

                    Vector<ParticleFlyingRobot> particleSwarm = new Vector<ParticleFlyingRobot>();

                    ArrayList<TimerTask> timerList = new ArrayList<TimerTask>();

                    JPanel jPanel3 = mMainJFrame.jPanel2;

                    ParticleSwarmOptimizationImpl psoImpl = new ParticleSwarmOptimizationImpl(swarm_size, particleSwarm, jPanel3, hashMapMain);
                    psoImpl.createSwarmParticles(targetPostionxy, Xmin, Xmax, Ymin, Ymax);

                    Timer timer = new Timer(true);

                    for (int i = 0; i < swarm_size; i++) {

                        ParticlesUpdateTimerTask task = new ParticlesUpdateTimerTask(i, particleSwarm.get(i), psoImpl);

                        timerList.add(task);

                    }
                    int count = 0;

                    for (TimerTask currentTask : timerList) {

                        timer.scheduleAtFixedRate(currentTask, 0, 500);

                        count++;

                    }

         
                    try {

                        Thread.sleep(15000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    timer.cancel();

                }

            } catch (NumberFormatException excep) {
                JOptionPane.showMessageDialog(null, "Fields should contain numbers");
            } catch (IOException ex) {
                Logger.getLogger(GraphicsFrame.class.getName()).log(Level.SEVERE, null, ex);
            }


    }//GEN-LAST:event_startBtnActionPerformed
    }

    private void graphBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphBtnActionPerformed

        
        XYSeriesCollection dataset1 = new XYSeriesCollection();
        XYSeries series1 = new XYSeries("Global Best Trend");
        DefaultCategoryDataset defaultCategoryDatSet = new DefaultCategoryDataset();
        for (Map.Entry<Integer, Integer> map : hashMapMain.entrySet()) {
            series1.add(map.getKey(), map.getValue());
            defaultCategoryDatSet.addValue(map.getValue(), "Global Best Trend", map.getKey());
        }

        dataset1.addSeries(series1);

        JFrame frameNew = new JFrame("PSO Analysis");
        frameNew.setLayout(new FlowLayout());

        JFreeChart jFreeChart = ChartFactory.createBarChart3D("Global Best Chart", "No of Iterations", "gBest", defaultCategoryDatSet, PlotOrientation.VERTICAL, true, true, true);
        CategoryPlot P = jFreeChart.getCategoryPlot();
        P.setRangeGridlinePaint(Color.BLACK);

        frameNew.getContentPane().add(new ChartPanel(createChartTest(dataset1)));
        frameNew.getContentPane().add(new ChartPanel(jFreeChart));

        frameNew.pack();

        frameNew.setVisible(true);
    }//GEN-LAST:event_graphBtnActionPerformed

    public JFreeChart createChartTest(XYSeriesCollection li) {

        String chartTitle = " Global Best Chart";
        String xAxisLabel = "Number of Iterations";
        String yAxisLabel = "gBest";

        XYSeriesCollection dataset = li;

        JFreeChart chart = ChartFactory.createXYLineChart(chartTitle, xAxisLabel, yAxisLabel, dataset);
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.setRenderer(renderer);

        return chart;
    }

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
            java.util.logging.Logger.getLogger(GraphicsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                
                mMainJFrame = new GraphicsFrame();
                mMainJFrame.setVisible(true);

                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Inertialbl;
    private javax.swing.JLabel NumAgentslbl;
    private javax.swing.JLabel TargetXPoslbl;
    private javax.swing.JLabel TargetYPoslbl;
    private javax.swing.JLabel Xmaxlbl;
    private javax.swing.JTextField Xmaxtxt;
    private javax.swing.JLabel Xminlbl;
    private javax.swing.JTextField Xmintxt;
    private javax.swing.JLabel Ymaxlbl;
    private javax.swing.JTextField Ymaxtxt;
    private javax.swing.JLabel Yminlbl;
    private javax.swing.JTextField Ymintxt;
    private javax.swing.JButton graphBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField numAgentstxt;
    private javax.swing.JButton startBtn;
    private javax.swing.JTextField targetXPostxt;
    private javax.swing.JTextField targetYPostxt;
    // End of variables declaration//GEN-END:variables
}

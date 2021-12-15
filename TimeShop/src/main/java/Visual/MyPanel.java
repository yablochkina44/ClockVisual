
package Visual;
import clocks.*;
//import Visual.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.JOptionPane;

public class MyPanel extends javax.swing.JPanel {
Model m = new Model();
   
    public MyPanel() {
        initComponents();
        m.addObserver(allClock1);
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mark = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        MarkFi = new javax.swing.JTextField();
        PriceFi = new javax.swing.JTextField();
        MinFi = new javax.swing.JTextField();
        HourFi = new javax.swing.JTextField();
        SecFi = new javax.swing.JTextField();
        AddClockHM = new javax.swing.JButton();
        AddClockHMS = new javax.swing.JButton();
        allClock1 = new Visual.AllClock();

        Mark.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Mark.setText("Brand");

        Price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Price.setText("Price");

        Time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Time.setText("Time");

        MarkFi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        PriceFi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        MinFi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MinFi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinFiActionPerformed(evt);
            }
        });

        HourFi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        SecFi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        AddClockHM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddClockHM.setText("Add HM");
        AddClockHM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClockHMActionPerformed(evt);
            }
        });

        AddClockHMS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddClockHMS.setText("Add  HMS");
        AddClockHMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClockHMSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(allClock1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(HourFi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MinFi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SecFi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Mark, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MarkFi)
                                    .addComponent(PriceFi))))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddClockHMS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddClockHM, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarkFi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mark, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceFi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HourFi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinFi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SecFi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddClockHM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddClockHMS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(allClock1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MinFiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinFiActionPerformed
      
    }//GEN-LAST:event_MinFiActionPerformed

    private void AddClockHMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClockHMActionPerformed
    
    
        ClockHM t = new ClockHM();
        t.setBrand(MarkFi.getText());
        t.setPrice(Integer.valueOf(PriceFi.getText()));
     try {
        t.setHour(Integer.valueOf(HourFi.getText()));
        t.setMin(Integer.valueOf(MinFi.getText()));
        m.addClock(t);
    } catch (Exception ex) {
        Logger.getLogger(MyPanel.class.getName()).log(Level.SEVERE, null, ex);
        
    }
    }//GEN-LAST:event_AddClockHMActionPerformed

    private void AddClockHMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClockHMSActionPerformed
     
      
        ClockHMS t = new ClockHMS();
        t.setBrand(MarkFi.getText());
        t.setPrice(Integer.valueOf(PriceFi.getText()));
      try {
        t.setHour(Integer.valueOf(HourFi.getText()));
        t.setMin(Integer.valueOf(MinFi.getText()));
        t.setSec(Integer.valueOf(SecFi.getText()));
        m.addClock(t);
    } catch (Exception ex) {
        Logger.getLogger(MyPanel.class.getName()).log(Level.SEVERE, null, ex);
      
        
    }
    }//GEN-LAST:event_AddClockHMSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClockHM;
    private javax.swing.JButton AddClockHMS;
    private javax.swing.JTextField HourFi;
    private javax.swing.JLabel Mark;
    private javax.swing.JTextField MarkFi;
    private javax.swing.JTextField MinFi;
    private javax.swing.JLabel Price;
    private javax.swing.JTextField PriceFi;
    private javax.swing.JTextField SecFi;
    private javax.swing.JLabel Time;
    private Visual.AllClock allClock1;
    // End of variables declaration//GEN-END:variables
}

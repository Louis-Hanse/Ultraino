package acousticfield3d.gui;

import acousticfield3d.math.M;
import acousticfield3d.math.Vector3f;
import acousticfield3d.scene.Entity;
import acousticfield3d.scene.Scene;
import acousticfield3d.simulation.Transducer;
import acousticfield3d.utils.Parse;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

/**
 *
 * @author Asier
 */
public class TransducersOffsetForm extends javax.swing.JFrame {
    MainForm mf;
    
    public TransducersOffsetForm(MainForm mf) {
        this.mf = mf;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        distributionGroup = new javax.swing.ButtonGroup();
        ampCheck = new javax.swing.JCheckBox();
        phaseCheck = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        ampAvgText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ampStdText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phaseAvgText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phaseStdText = new javax.swing.JTextField();
        setButton = new javax.swing.JButton();
        xCheck = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        xAvgText = new javax.swing.JTextField();
        xStdText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        xSText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        yStdText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        yAvgText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ySText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        yCheck = new javax.swing.JCheckBox();
        zStdText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        zAvgText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        zSText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        zCheck = new javax.swing.JCheckBox();
        rxCheck = new javax.swing.JCheckBox();
        ryCheck = new javax.swing.JCheckBox();
        rzCheck = new javax.swing.JCheckBox();
        rzSText = new javax.swing.JTextField();
        rySText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        rxSText = new javax.swing.JTextField();
        rxAvgText = new javax.swing.JTextField();
        ryAvgText = new javax.swing.JTextField();
        rzAvgText = new javax.swing.JTextField();
        rzStdText = new javax.swing.JTextField();
        ryStdText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        rxStdText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        applyCenterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transducers Offset");

        ampCheck.setText("Amplitude(0-1)");

        phaseCheck.setText("Phase(Pi)");

        jLabel1.setText("Avg:");

        ampAvgText.setText("0.00");

        jLabel2.setText("Std:");

        ampStdText.setText("0.00");

        jLabel3.setText("Avg:");

        phaseAvgText.setText("0.00");

        jLabel4.setText("Std:");

        phaseStdText.setText("0.00");

        setButton.setText("Apply");
        setButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setButtonActionPerformed(evt);
            }
        });

        xCheck.setText("X");

        jLabel5.setText("Avg:");

        xAvgText.setText("0.00");

        xStdText.setText("0.00");

        jLabel6.setText("Std:");

        xSText.setText("1.00");

        jLabel7.setText("S:");

        yStdText.setText("0.00");

        jLabel8.setText("Std:");

        yAvgText.setText("0.00");

        jLabel9.setText("Avg:");

        ySText.setText("1.00");

        jLabel10.setText("S:");

        yCheck.setText("Y");

        zStdText.setText("0.00");

        jLabel11.setText("Std:");

        zAvgText.setText("0.00");

        jLabel12.setText("Avg:");

        zSText.setText("1.00");

        jLabel13.setText("S:");

        zCheck.setText("Z");

        rxCheck.setText("rX");

        ryCheck.setText("rY");
        ryCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ryCheckActionPerformed(evt);
            }
        });

        rzCheck.setText("rZ");

        rzSText.setText("1.00");

        rySText.setText("1.00");

        jLabel14.setText("S:");

        jLabel15.setText("S:");

        jLabel16.setText("S:");

        rxSText.setText("1.00");

        rxAvgText.setText("0.00");

        ryAvgText.setText("0.00");

        rzAvgText.setText("0.00");

        rzStdText.setText("0.00");

        ryStdText.setText("0.00");

        jLabel17.setText("Std:");

        jLabel18.setText("Std:");

        rxStdText.setText("0.00");

        jLabel19.setText("Std:");

        applyCenterButton.setText("ApplyCenter");
        applyCenterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyCenterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zSText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zStdText, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ampCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(phaseCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ampAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(phaseAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(xCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xSText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xStdText, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(phaseStdText)
                            .addComponent(ampStdText)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(yCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ySText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yStdText, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rxCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rxSText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(rxAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rxStdText, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ryCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rySText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(ryAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ryStdText, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(applyCenterButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rzCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rzSText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(rzAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rzStdText))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(setButton)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ampCheck)
                    .addComponent(jLabel1)
                    .addComponent(ampAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(ampStdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phaseCheck)
                    .addComponent(jLabel3)
                    .addComponent(phaseAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(phaseStdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xCheck)
                    .addComponent(jLabel5)
                    .addComponent(xAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(xStdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xSText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yCheck)
                    .addComponent(jLabel9)
                    .addComponent(yAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(yStdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ySText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zCheck)
                    .addComponent(jLabel12)
                    .addComponent(zAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(zStdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zSText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rxCheck)
                    .addComponent(rxAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(rxStdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rxSText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ryCheck)
                    .addComponent(ryAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(ryStdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rySText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rzCheck)
                    .addComponent(rzAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(rzStdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rzSText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setButton)
                    .addComponent(applyCenterButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void applyToVector(
            JCheckBox cx, JCheckBox cy, JCheckBox cz,
            JTextField sx, JTextField sy,JTextField sz,
            JTextField ax, JTextField ay,JTextField az,
            JTextField dx, JTextField dy,JTextField dz,
            boolean transNotRot){
        
        boolean x = cx.isSelected();
        boolean y = cy.isSelected();
        boolean z = cz.isSelected();
        
        float vsx = Float.parseFloat( sx.getText() );
        float vax = Float.parseFloat( ax.getText() );
        float vdx = Float.parseFloat( dx.getText() );
        float vsy = Float.parseFloat( sy.getText() );
        float vay = Float.parseFloat( ay.getText() );
        float vdy = Float.parseFloat( dy.getText() );
        float vsz = Float.parseFloat( sz.getText() );
        float vaz = Float.parseFloat( az.getText() );
        float vdz = Float.parseFloat( dz.getText() );
  
        for (Entity e : mf.selection) {
            if (e instanceof Transducer) {
                Transducer t = (Transducer) e;

                Vector3f angles = t.getTransform().getRotation().toAngles(null).multLocal(M.RAD_TO_DEG);
                Vector3f target = transNotRot ? t.getTransform().getTranslation() : angles;

                if (x) {
                    target.x *= vsx;
                    target.x += M.randomGaussian(vax, vdx);
                }
                if (y) {
                    target.y *= vsy;
                    target.y += M.randomGaussian(vay, vdy);
                }
                if (z) {
                    target.z *= vsz;
                    target.z += M.randomGaussian(vaz, vdz);
                }

                if (!transNotRot) {
                    t.getTransform().getRotation().fromAngles(angles.multLocal(M.DEG_TO_RAD));
                }
            }
        }
    }
    
    private void setButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setButtonActionPerformed
        boolean amp = ampCheck.isSelected();
        boolean phase = phaseCheck.isSelected();
        float ampAvg = Float.parseFloat( ampAvgText.getText() );
        float ampStd = Float.parseFloat( ampAvgText.getText() );
        float phaseAvg = Float.parseFloat( phaseAvgText.getText() );
        float phaseStd = Float.parseFloat( phaseStdText.getText() );
        
       applyToVector(
            xCheck,yCheck,zCheck,
            xSText,ySText,zSText,
            xAvgText,yAvgText,zAvgText,
            xStdText,yStdText,zStdText,
            true
       );
        
       applyToVector(
            rxCheck,ryCheck,rzCheck,
            rxSText,rySText,rzSText,
            rxAvgText,ryAvgText,rzAvgText,
            rxStdText,ryStdText,rzStdText,
            false
       );
        
        for( Entity e : mf.selection ){
            if (e instanceof Transducer) {
                Transducer t = (Transducer) e;
                if ( amp ) { t.setAmplitude( t.getAmplitude() + M.randomGaussian(ampAvg, ampStd) ); }
                if ( phase ) { t.setPhase(t.getPhase() + M.randomGaussian(phaseAvg, phaseStd) ); }
            }
        }
        mf.needUpdate();
    }//GEN-LAST:event_setButtonActionPerformed

    private void ryCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ryCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ryCheckActionPerformed

    private void applyCenterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyCenterButtonActionPerformed
        //get selection center
        final Vector3f selCenter = Scene.calcCenter( mf.selection );
        
        final float rx = Parse.toFloat( rxAvgText.getText() ) * M.DEG_TO_RAD;
        final float ry = Parse.toFloat( ryAvgText.getText() ) * M.DEG_TO_RAD;
        final float rz = Parse.toFloat( rzAvgText.getText() ) * M.DEG_TO_RAD;
        
        //apply rotation to selection
        for(Entity e : mf.selection){
            e.rotateAround(selCenter, rx, ry, rz);
        }
        
        mf.needUpdate();
    }//GEN-LAST:event_applyCenterButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ampAvgText;
    private javax.swing.JCheckBox ampCheck;
    private javax.swing.JTextField ampStdText;
    private javax.swing.JButton applyCenterButton;
    private javax.swing.ButtonGroup distributionGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField phaseAvgText;
    private javax.swing.JCheckBox phaseCheck;
    private javax.swing.JTextField phaseStdText;
    private javax.swing.JTextField rxAvgText;
    private javax.swing.JCheckBox rxCheck;
    private javax.swing.JTextField rxSText;
    private javax.swing.JTextField rxStdText;
    private javax.swing.JTextField ryAvgText;
    private javax.swing.JCheckBox ryCheck;
    private javax.swing.JTextField rySText;
    private javax.swing.JTextField ryStdText;
    private javax.swing.JTextField rzAvgText;
    private javax.swing.JCheckBox rzCheck;
    private javax.swing.JTextField rzSText;
    private javax.swing.JTextField rzStdText;
    private javax.swing.JButton setButton;
    private javax.swing.JTextField xAvgText;
    private javax.swing.JCheckBox xCheck;
    private javax.swing.JTextField xSText;
    private javax.swing.JTextField xStdText;
    private javax.swing.JTextField yAvgText;
    private javax.swing.JCheckBox yCheck;
    private javax.swing.JTextField ySText;
    private javax.swing.JTextField yStdText;
    private javax.swing.JTextField zAvgText;
    private javax.swing.JCheckBox zCheck;
    private javax.swing.JTextField zSText;
    private javax.swing.JTextField zStdText;
    // End of variables declaration//GEN-END:variables
}

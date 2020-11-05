package imageviewer;

/**
 *
 * @author Chgv99
 * @author PabloOQ
 */
public class ImageViewer extends javax.swing.JFrame {

    public ImageViewer() {
        initComponents();
        image.setCorner(ImagePanel.Corner.TOP_RIGHT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cornerRadioButtons = new javax.swing.ButtonGroup();
        image = new imageviewer.ImagePanel();
        authorAndRadioPanel = new javax.swing.JPanel();
        radioButtonPanel = new javax.swing.JPanel();
        bottomRightRadioButton = new javax.swing.JRadioButton();
        bottomLeftRadioButton = new javax.swing.JRadioButton();
        topRightRadioButton = new javax.swing.JRadioButton();
        topLeftRadioButton = new javax.swing.JRadioButton();
        authorPanel = new javax.swing.JPanel();
        cgvLabel = new javax.swing.JLabel();
        poqLabel = new javax.swing.JLabel();
        colorPanel = new javax.swing.JPanel();
        redCheckBox = new javax.swing.JCheckBox();
        greenCheckBox = new javax.swing.JCheckBox();
        blueCheckBox = new javax.swing.JCheckBox();
        fullColorCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Image Viewer");
        setResizable(false);

        javax.swing.GroupLayout imageLayout = new javax.swing.GroupLayout(image);
        image.setLayout(imageLayout);
        imageLayout.setHorizontalGroup(
            imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1025, Short.MAX_VALUE)
        );
        imageLayout.setVerticalGroup(
            imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        radioButtonPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Marca de agua"));

        cornerRadioButtons.add(bottomRightRadioButton);
        bottomRightRadioButton.setText("Inferior Derecha");
        bottomRightRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottomRightRadioButtonActionPerformed(evt);
            }
        });

        cornerRadioButtons.add(bottomLeftRadioButton);
        bottomLeftRadioButton.setText("Inferior Izquierda");
        bottomLeftRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottomLeftRadioButtonActionPerformed(evt);
            }
        });

        cornerRadioButtons.add(topRightRadioButton);
        topRightRadioButton.setSelected(true);
        topRightRadioButton.setText("Superior Derecha");
        topRightRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topRightRadioButtonActionPerformed(evt);
            }
        });

        cornerRadioButtons.add(topLeftRadioButton);
        topLeftRadioButton.setText("Superior Izquierda");
        topLeftRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topLeftRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout radioButtonPanelLayout = new javax.swing.GroupLayout(radioButtonPanel);
        radioButtonPanel.setLayout(radioButtonPanelLayout);
        radioButtonPanelLayout.setHorizontalGroup(
            radioButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radioButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(radioButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topLeftRadioButton)
                    .addComponent(topRightRadioButton)
                    .addComponent(bottomLeftRadioButton)
                    .addComponent(bottomRightRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        radioButtonPanelLayout.setVerticalGroup(
            radioButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, radioButtonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(topLeftRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(topRightRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bottomLeftRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bottomRightRadioButton)
                .addContainerGap())
        );

        cgvLabel.setText("Christian García Viguera");

        poqLabel.setText("Pablo Ortigosa Quevedo");

        javax.swing.GroupLayout authorPanelLayout = new javax.swing.GroupLayout(authorPanel);
        authorPanel.setLayout(authorPanelLayout);
        authorPanelLayout.setHorizontalGroup(
            authorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(authorPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(authorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poqLabel)
                    .addComponent(cgvLabel))
                .addGap(35, 35, 35))
        );
        authorPanelLayout.setVerticalGroup(
            authorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(authorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cgvLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(poqLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout authorAndRadioPanelLayout = new javax.swing.GroupLayout(authorAndRadioPanel);
        authorAndRadioPanel.setLayout(authorAndRadioPanelLayout);
        authorAndRadioPanelLayout.setHorizontalGroup(
            authorAndRadioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(authorAndRadioPanelLayout.createSequentialGroup()
                .addGroup(authorAndRadioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radioButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(authorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        authorAndRadioPanelLayout.setVerticalGroup(
            authorAndRadioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(authorAndRadioPanelLayout.createSequentialGroup()
                .addComponent(radioButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(authorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        colorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Canales"));

        redCheckBox.setSelected(true);
        redCheckBox.setText("Rojo");
        redCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redCheckBoxActionPerformed(evt);
            }
        });

        greenCheckBox.setSelected(true);
        greenCheckBox.setText("Verde");
        greenCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenCheckBoxActionPerformed(evt);
            }
        });

        blueCheckBox.setSelected(true);
        blueCheckBox.setText("Azul");
        blueCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueCheckBoxActionPerformed(evt);
            }
        });

        fullColorCheckBox.setSelected(true);
        fullColorCheckBox.setText("Todos");
        fullColorCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullColorCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redCheckBox)
                    .addComponent(greenCheckBox)
                    .addComponent(blueCheckBox)
                    .addComponent(fullColorCheckBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fullColorCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(redCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(greenCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(blueCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(authorAndRadioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(authorAndRadioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void redCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redCheckBoxActionPerformed
        if (!greenCheckBox.isSelected() && !blueCheckBox.isSelected()){
            redCheckBox.setSelected(true);
        } else {
            updateImageColor();
            uncheckFullColorBox();
        }
    }//GEN-LAST:event_redCheckBoxActionPerformed

    private void greenCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenCheckBoxActionPerformed
        if (!redCheckBox.isSelected() && !blueCheckBox.isSelected()){
            greenCheckBox.setSelected(true);
        } else {
            updateImageColor();
            uncheckFullColorBox();
        }
    }//GEN-LAST:event_greenCheckBoxActionPerformed

    private void blueCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueCheckBoxActionPerformed
        if (!greenCheckBox.isSelected() && !redCheckBox.isSelected()){
            blueCheckBox.setSelected(true);
        } else {
            updateImageColor();
            uncheckFullColorBox();
        }
    }//GEN-LAST:event_blueCheckBoxActionPerformed

    private void topLeftRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topLeftRadioButtonActionPerformed
        updateWatermarkCorner(ImagePanel.Corner.TOP_LEFT);
    }//GEN-LAST:event_topLeftRadioButtonActionPerformed

    private void topRightRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topRightRadioButtonActionPerformed
        updateWatermarkCorner(ImagePanel.Corner.TOP_RIGHT);
    }//GEN-LAST:event_topRightRadioButtonActionPerformed

    private void bottomLeftRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottomLeftRadioButtonActionPerformed
        updateWatermarkCorner(ImagePanel.Corner.BOTTOM_LEFT);
    }//GEN-LAST:event_bottomLeftRadioButtonActionPerformed

    private void bottomRightRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottomRightRadioButtonActionPerformed
        updateWatermarkCorner(ImagePanel.Corner.BOTTOM_RIGHT);
    }//GEN-LAST:event_bottomRightRadioButtonActionPerformed

    private void fullColorCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullColorCheckBoxActionPerformed
        if (fullColorCheckBox.isSelected()){
            redCheckBox.setSelected(true);
            greenCheckBox.setSelected(true);
            blueCheckBox.setSelected(true);
            updateImageColor();
        }
    }//GEN-LAST:event_fullColorCheckBoxActionPerformed
    
    private void updateImageColor(){
        image.setColorChannels(redCheckBox.isSelected(), greenCheckBox.isSelected(), blueCheckBox.isSelected());
        image.repaint();
    }
    
    private void uncheckFullColorBox(){
        if (!(redCheckBox.isSelected() && greenCheckBox.isSelected() && blueCheckBox.isSelected())){
            fullColorCheckBox.setSelected(false);
        }
    }
    
    private void updateWatermarkCorner(ImagePanel.Corner corner){
        image.setCorner(corner);
        image.repaint();
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageViewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel authorAndRadioPanel;
    private javax.swing.JPanel authorPanel;
    private javax.swing.JCheckBox blueCheckBox;
    private javax.swing.JRadioButton bottomLeftRadioButton;
    private javax.swing.JRadioButton bottomRightRadioButton;
    private javax.swing.JLabel cgvLabel;
    private javax.swing.JPanel colorPanel;
    private javax.swing.ButtonGroup cornerRadioButtons;
    private javax.swing.JCheckBox fullColorCheckBox;
    private javax.swing.JCheckBox greenCheckBox;
    private imageviewer.ImagePanel image;
    private javax.swing.JLabel poqLabel;
    private javax.swing.JPanel radioButtonPanel;
    private javax.swing.JCheckBox redCheckBox;
    private javax.swing.JRadioButton topLeftRadioButton;
    private javax.swing.JRadioButton topRightRadioButton;
    // End of variables declaration//GEN-END:variables
}


package calculator_app;

public class Calculator extends javax.swing.JFrame {
    
    double num, ans;
    int calculation;
        
    public Calculator() {
        initComponents();
        disableButton();
    }
    
    public void arithmetic_operation(){
        switch(calculation) {
            case 1: // Addition
                ans = num + Double.parseDouble(tfValue.getText());
                tfValue.setText(Double.toString(ans));
                break;
            
            case 2: // Subtraction
                ans = num - Double.parseDouble(tfValue.getText());
                tfValue.setText(Double.toString(ans));
                break;    
                
            case 3: // Multiplication
                ans = num * Double.parseDouble(tfValue.getText());
                tfValue.setText(Double.toString(ans));
                break;
            
            case 4: // Division
                ans = num / Double.parseDouble(tfValue.getText());
                tfValue.setText(Double.toString(ans));
                break; 
            
        }
    }
    
    public void disableButton(){
        
        buttonOn.setEnabled(true);  // ON button enable
        buttonOff.setEnabled(false); // OFF button disable

        tfValue.setEnabled(false);
        button0.setEnabled(false);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        
        buttonBackSpace.setEnabled(false);
        buttonAddiction.setEnabled(false);
        buttonSubtraction.setEnabled(false);
        buttonMultiplication.setEnabled(false);
        buttonDivision.setEnabled(false);
        buttonClean.setEnabled(false);
        buttonPoint.setEnabled(false);
        buttonEqual.setEnabled(false);
    
    }
    
    public void enableButton(){
        
        buttonOn.setEnabled(false);  // ON button disable
        buttonOff.setEnabled(true); // OFF button enable

        tfValue.setEnabled(true);  
        button0.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        
        buttonBackSpace.setEnabled(true);
        buttonAddiction.setEnabled(true);
        buttonSubtraction.setEnabled(true);
        buttonMultiplication.setEnabled(true);
        buttonDivision.setEnabled(true);
        buttonClean.setEnabled(true);
        buttonPoint.setEnabled(true);
        buttonEqual.setEnabled(true);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tfValue = new javax.swing.JTextField();
        buttonOn = new javax.swing.JRadioButton();
        buttonOff = new javax.swing.JRadioButton();
        buttonBackSpace = new javax.swing.JButton();
        buttonClean = new javax.swing.JButton();
        buttonAddiction = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        buttonSubtraction = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        buttonPoint = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        buttonEqual = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        buttonMultiplication = new javax.swing.JButton();
        buttonDivision = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        tfValue.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tfValue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        buttonGroup1.add(buttonOn);
        buttonOn.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonOn.setText("ON");
        buttonOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOnActionPerformed(evt);
            }
        });

        buttonGroup1.add(buttonOff);
        buttonOff.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonOff.setText("OFF");
        buttonOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOffActionPerformed(evt);
            }
        });

        buttonBackSpace.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonBackSpace.setText("←");
        buttonBackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackSpaceActionPerformed(evt);
            }
        });

        buttonClean.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonClean.setText("CE");
        buttonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCleanActionPerformed(evt);
            }
        });

        buttonAddiction.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonAddiction.setText("+");
        buttonAddiction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddictionActionPerformed(evt);
            }
        });

        button8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button8.setText("8");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button7.setText("7");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button9.setText("9");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button4.setText("4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        buttonSubtraction.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonSubtraction.setText("-");
        buttonSubtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubtractionActionPerformed(evt);
            }
        });

        button0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button0.setText("0");
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });

        button1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button1.setText("1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button2.setText("2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button5.setText("5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        buttonPoint.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonPoint.setText(".");
        buttonPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPointActionPerformed(evt);
            }
        });

        button6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button6.setText("6");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        buttonEqual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonEqual.setText("=");
        buttonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEqualActionPerformed(evt);
            }
        });

        button3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button3.setText("3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        buttonMultiplication.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonMultiplication.setText("X");
        buttonMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultiplicationActionPerformed(evt);
            }
        });

        buttonDivision.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonDivision.setText("÷");
        buttonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivisionActionPerformed(evt);
            }
        });

        label1.setForeground(new java.awt.Color(255, 51, 0));
        label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfValue)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonAddiction, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(buttonSubtraction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonOff)
                                    .addComponent(buttonOn))
                                .addGap(28, 28, 28)
                                .addComponent(buttonBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfValue, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonOn, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonOff, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddiction, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button8)
                    .addComponent(button9)
                    .addComponent(button7)
                    .addComponent(buttonSubtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button5)
                    .addComponent(button6)
                    .addComponent(buttonMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button2)
                            .addComponent(button3)
                            .addComponent(button1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button0)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonPoint)
                        .addComponent(buttonEqual)))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackSpaceActionPerformed
        
        int length = tfValue.getText().length();
        int number = tfValue.getText().length() -1;
        String store;
        
        if(length > 0){
            
            StringBuilder back = new StringBuilder(tfValue.getText());
            back.deleteCharAt(number);
            store = back.toString();
            tfValue.setText(store);
        }
       
    }//GEN-LAST:event_buttonBackSpaceActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        tfValue.setText(tfValue.getText() + "0");
    }//GEN-LAST:event_button0ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        tfValue.setText(tfValue.getText() + "1");
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        tfValue.setText(tfValue.getText() + "2");
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        tfValue.setText(tfValue.getText() + "3");
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        tfValue.setText(tfValue.getText() + "4");
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        tfValue.setText(tfValue.getText() + "5");
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        tfValue.setText(tfValue.getText() + "6");
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        tfValue.setText(tfValue.getText() + "7");
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        tfValue.setText(tfValue.getText() + "8");
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        tfValue.setText(tfValue.getText() + "9");
    }//GEN-LAST:event_button9ActionPerformed

    private void buttonPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPointActionPerformed
        tfValue.setText(tfValue.getText() + ".");
    }//GEN-LAST:event_buttonPointActionPerformed

    private void buttonAddictionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddictionActionPerformed
        num = Double.parseDouble(tfValue.getText());
        calculation = 1;
        tfValue.setText("");
        label1.setText(num + " +");
    }//GEN-LAST:event_buttonAddictionActionPerformed

    private void buttonSubtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubtractionActionPerformed
        num = Double.parseDouble(tfValue.getText());
        calculation = 2;
        tfValue.setText("");
        label1.setText(num + " -");
    }//GEN-LAST:event_buttonSubtractionActionPerformed

    private void buttonMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultiplicationActionPerformed
        num = Double.parseDouble(tfValue.getText());
        calculation = 3;
        tfValue.setText("");
        label1.setText(num + " x");
    }//GEN-LAST:event_buttonMultiplicationActionPerformed

    private void buttonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivisionActionPerformed
        num = Double.parseDouble(tfValue.getText());
        calculation = 4;
        tfValue.setText("");
        label1.setText(num + " ÷");
    }//GEN-LAST:event_buttonDivisionActionPerformed

    private void buttonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEqualActionPerformed
        arithmetic_operation();
        label1.setText("");
    }//GEN-LAST:event_buttonEqualActionPerformed

    private void buttonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCleanActionPerformed
        tfValue.setText("");
        label1.setText("");
    }//GEN-LAST:event_buttonCleanActionPerformed

    private void buttonOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOffActionPerformed
        disableButton();
    }//GEN-LAST:event_buttonOffActionPerformed

    private void buttonOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOnActionPerformed
        enableButton();
    }//GEN-LAST:event_buttonOnActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonAddiction;
    private javax.swing.JButton buttonBackSpace;
    private javax.swing.JButton buttonClean;
    private javax.swing.JButton buttonDivision;
    private javax.swing.JButton buttonEqual;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonMultiplication;
    private javax.swing.JRadioButton buttonOff;
    private javax.swing.JRadioButton buttonOn;
    private javax.swing.JButton buttonPoint;
    private javax.swing.JButton buttonSubtraction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label1;
    private javax.swing.JTextField tfValue;
    // End of variables declaration//GEN-END:variables
}

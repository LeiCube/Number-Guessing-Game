
import java.awt.*;
import static java.lang.Thread.sleep;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NumberGame_JFrame extends javax.swing.JFrame {
    int tryCount = 3;
    int tries = 1;
    int randomNum;
    int seconds = 60;
    boolean state = false;
    
    public NumberGame_JFrame() {
        initComponents();
        Answer.setEnabled(false);
        Submit.setEnabled(false);
        Reset.setEnabled(false);
        startTime.setEnabled(false);
        getContentPane().setBackground(Color.darkGray);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        Title = new javax.swing.JLabel();
        RangeText = new javax.swing.JLabel();
        Range1 = new javax.swing.JRadioButton();
        Range2 = new javax.swing.JRadioButton();
        GuessNo = new javax.swing.JLabel();
        Answer = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Result = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();
        tryLeft = new javax.swing.JLabel();
        startTime = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Number Guessing Game");
        setBackground(new java.awt.Color(102, 102, 255));
        setBounds(new java.awt.Rectangle(540, 250, 0, 0));
        setResizable(false);

        Title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Number Guessing Game");

        RangeText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RangeText.setForeground(new java.awt.Color(255, 255, 255));
        RangeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RangeText.setText("Select Range:");

        Range1.setBackground(new java.awt.Color(61, 64, 66));
        buttonGroup1.add(Range1);
        Range1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Range1.setForeground(new java.awt.Color(255, 255, 255));
        Range1.setText("1 to 100");
        Range1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Range1ActionPerformed(evt);
            }
        });

        Range2.setBackground(new java.awt.Color(61, 64, 66));
        buttonGroup1.add(Range2);
        Range2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Range2.setForeground(new java.awt.Color(255, 255, 255));
        Range2.setText("1 to 1000");
        Range2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Range2ActionPerformed(evt);
            }
        });

        GuessNo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        GuessNo.setForeground(new java.awt.Color(255, 255, 255));
        GuessNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GuessNo.setText("Guess No. 1");

        Answer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Submit.setBackground(new java.awt.Color(153, 255, 153));
        Submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Submit.setForeground(new java.awt.Color(0, 0, 0));
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(255, 102, 102));
        Reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Reset.setForeground(new java.awt.Color(0, 0, 0));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Result.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Result.setForeground(new java.awt.Color(255, 255, 255));
        Result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Result.setText("Please Enter a number to Guess");

        timerLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        timerLabel.setForeground(new java.awt.Color(255, 255, 255));
        timerLabel.setText("Time remaining: 60");

        tryLeft.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tryLeft.setForeground(new java.awt.Color(255, 255, 255));
        tryLeft.setText("Tries left: 3");

        startTime.setBackground(new java.awt.Color(102, 153, 255));
        startTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        startTime.setForeground(new java.awt.Color(0, 0, 0));
        startTime.setText("Start Time");
        startTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RangeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(startTime, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tryLeft))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timerLabel)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(Range1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Range2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GuessNo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RangeText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Range1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Range2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuessNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startTime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timerLabel)
                    .addComponent(tryLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startTimer(){
        state = true;
        Thread t = new Thread(){
            public void run(){
                for(;;){
                    if(state == true){
                        try {
                            sleep(1000);
                            seconds--;
                            timerLabel.setText("Time remaining: "+ seconds);
                            if(seconds == 0){
                                stopTime();
                                Result.setText("TIME'S UP! The number was "+ randomNum);
                                Submit.setEnabled(false);
                            }
                        } catch (Exception e) {
                        }
                    }else{
                        break;
                    }
                }
            }
        };
        t.start();
    }
    
    private void stopTime(){
        state = false;
    }
    
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        try {
        int answer = Integer.parseInt(Answer.getText());
            if (Range1.isSelected()) {
                Range2.setEnabled(false);
                if (answer > 100 || answer < 1) {
                    Result.setText("Please enter numbers 1  100 only");
                    Result.setForeground(Color.red);
                    Submit.setEnabled(true);                    
                } else if (answer >= 1 || answer <= 100) {
                    if (answer == randomNum) {
                        Result.setText("You WON! The number is " + randomNum);
                        Result.setForeground(Color.green);
                        Answer.setEnabled(false);
                        Submit.setEnabled(false);
                        state = false;
                    } else if (tries++ == 3) {
                        Result.setText("Nice Try! The Number is " + randomNum);
                        Result.setForeground(Color.white);
                        Answer.setEnabled(false);
                        Submit.setEnabled(false);
                        tryLeft.setText("Tries left: " + (--tryCount));
                        Range1.setEnabled(false);
                        Range2.setEnabled(false);
                        state = false;
                    } else {
                        if (answer < randomNum) {
                            Result.setText("Nice Try! Your guess was too low");
                            Result.setForeground(Color.white);
                            GuessNo.setText("Guess No. " + tries);
                            tryLeft.setText("Tries left: " + (--tryCount));
                        } else if (answer > randomNum) {
                            Result.setText("Nice Try! Your guess was too high");
                            Result.setForeground(Color.white);
                            GuessNo.setText("Guess No. " + tries);
                            tryLeft.setText("Tries left: " + (--tryCount));
                        }
                    }
                }
            } else {
                Range1.setEnabled(false);
                if (answer > 1000 || answer < 1) {
                    Result.setText("Please enter numbers 1  1000 only");
                    Result.setForeground(Color.red);
                    Submit.setEnabled(true);                    
                } else {
                    if (answer == randomNum) {
                        Result.setText("You WON! The number is " + randomNum);
                        Result.setForeground(Color.green);
                        Answer.setEnabled(false);
                        Submit.setEnabled(false);
                        state = false;
                    } else if (tries++ == 3) {
                        Result.setText("Nice Try! The Number is " + randomNum);
                        Result.setForeground(Color.white);
                        Answer.setEnabled(false);
                        Submit.setEnabled(false);
                        tryLeft.setText("Tries left: " + (--tryCount));
                        Range1.setEnabled(false);
                        Range2.setEnabled(false);
                        state = false;
                    } else {
                        if (answer < randomNum) {
                            Result.setText("Nice Try! Your guess was too low");
                            Result.setForeground(Color.white);
                            GuessNo.setText("Guess No. " + tries);
                            tryLeft.setText("Tries left: " + (--tryCount));
                        } else if (answer > randomNum) {
                            Result.setText("Nice Try! Your guess was too high");
                            Result.setForeground(Color.white);
                            GuessNo.setText("Guess No. " + tries);
                            tryLeft.setText("Tries left: " + (--tryCount));
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
            Result.setText("Enter a number only");
            Result.setForeground(Color.red);
        }
            
            
        Answer.setText(null);
    }//GEN-LAST:event_SubmitActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        state = false;
        seconds = 60;
        timerLabel.setText("Time remaining: " + seconds);
        startTime.setEnabled(false);
        Reset.setEnabled(false);
        
        tries = 1;
        tryCount = 3;
        Range1.setEnabled(true);
        Range2.setEnabled(true);
        Answer.setEnabled(false);
        
        Result.setText("Please enter a number to guess");
        tryLeft.setText("Tries left: "+ tryCount);
        GuessNo.setText("Guess No. "+ tries);
        Result.setForeground(Color.white);
        RangeText.setFont(new Font("Segoe UI", Font.BOLD, 24));
        RangeText.setForeground(Color.GREEN);
        
        Answer.setText(null);
    }//GEN-LAST:event_ResetActionPerformed

    private void Range1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Range1ActionPerformed
        startTime.setEnabled(true);
        
        randomNum = new Random().nextInt(100)+1;
        RangeText.setFont(new Font("Segoe UI", Font.BOLD, 18));
        RangeText.setForeground(Color.white);
    }//GEN-LAST:event_Range1ActionPerformed

    private void Range2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Range2ActionPerformed
        startTime.setEnabled(true);
        
        randomNum = new Random().nextInt(1000)+1;
        RangeText.setFont(new Font("Segoe UI", Font.BOLD, 18));
        RangeText.setForeground(Color.white);
    }//GEN-LAST:event_Range2ActionPerformed

    private void startTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTimeActionPerformed
        startTimer();
        Answer.setEnabled(true);
        Submit.setEnabled(true);
        Reset.setEnabled(true);
        startTime.setEnabled(false);
        
    }//GEN-LAST:event_startTimeActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NumberGame_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumberGame_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumberGame_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumberGame_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberGame_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Answer;
    private javax.swing.JLabel GuessNo;
    private javax.swing.JRadioButton Range1;
    private javax.swing.JRadioButton Range2;
    private javax.swing.JLabel RangeText;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel Result;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel Title;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JButton startTime;
    private javax.swing.JLabel timerLabel;
    private javax.swing.JLabel tryLeft;
    // End of variables declaration//GEN-END:variables
}

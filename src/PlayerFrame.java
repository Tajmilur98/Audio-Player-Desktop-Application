
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;
import java.util.LinkedHashSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PlayerFrame extends javax.swing.JFrame {

    /**
     * Creates new form PlayerFrame
     */
    public PlayerFrame(String un, String nf, String pf) {
        this.setTitle("JAVA AUDIO PLAYER");
        icon= new ImageIcon(getClass().getResource("media.png")) ;
        this.setIconImage(icon.getImage());
       
        initFiles(un,nf,pf);
        initLists();
        initComponents();
        renameButtons();
        jPanel2.setVisible(false);
        this.setResizable(false);
        
        try {
	    UIManager.setLookAndFeel(new com.jtattoo.plaf.graphite.GraphiteLookAndFeel());
	    }catch(Exception ex){
			ex.printStackTrace();
		}
    }

       /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SongName = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        now = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        slide = new javax.swing.JSlider();
        openButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        pauseButton = new javax.swing.JButton();
        vol = new javax.swing.JButton();
        Vslider = new javax.swing.JSlider();
        PlayListButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        SongName.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        SongName.setForeground(new java.awt.Color(255, 102, 51));
        SongName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SongName.setText("Welcome "+userName);

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/music530x154.gif"))); // NOI18N

        now.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        now.setForeground(new java.awt.Color(255, 102, 51));
        now.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        now.setText("00:00:00");

        total.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        total.setForeground(new java.awt.Color(255, 102, 51));
        total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total.setText("00:00:00");

        slide.setBackground(new java.awt.Color(0, 0, 0));
        slide.setValue(0);

        openButton.setBackground(new java.awt.Color(0, 102, 102));
        openButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open.png"))); // NOI18N
        openButton.setText("OPEN");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        playButton.setBackground(new java.awt.Color(0, 153, 153));
        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play.png"))); // NOI18N
        playButton.setText("PLAY");
        playButton.setEnabled(false);
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        pauseButton.setBackground(new java.awt.Color(0, 204, 204));
        pauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pause-icon.png"))); // NOI18N
        pauseButton.setText("PAUSE");
        pauseButton.setEnabled(false);
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonActionPerformed(evt);
            }
        });

        vol.setBackground(new java.awt.Color(0, 255, 255));
        vol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vol_on.png"))); // NOI18N
        vol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volActionPerformed(evt);
            }
        });

        Vslider.setBackground(new java.awt.Color(204, 255, 255));
        Vslider.setMaximum(86);
        Vslider.setValue(65);
        Vslider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                VsliderStateChanged(evt);
            }
        });

        PlayListButton.setBackground(new java.awt.Color(0, 0, 0));
        PlayListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32x24.png"))); // NOI18N
        PlayListButton.setToolTipText("View Play List");
        PlayListButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PlayListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayListButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        jButton1.setText("Open an Audio to add  in Play List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 153));
        jButton2.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 255, 153));
        jButton3.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        jButton3.setText("JButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 255, 102));
        jButton4.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 255, 153));
        jButton5.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PlayListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SongName, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(36, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(20, 20, 20))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(openButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pauseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Vslider, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(now, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SongName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PlayListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Image))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(now, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(openButton)
                        .addComponent(playButton)
                        .addComponent(pauseButton))
                    .addComponent(vol)
                    .addComponent(Vslider, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volActionPerformed
        // TODO add your handling code here:
        volControl();
    }//GEN-LAST:event_volActionPerformed

    private void pauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseButtonActionPerformed
        // TODO add your handling code here:
        if (isPaused == false) {
            pausePlaying();
        } else {
            resumePlaying();
        }

    }//GEN-LAST:event_pauseButtonActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        // TODO add your handling code here:
        openFile();
    }//GEN-LAST:event_openButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        // TODO add your handling code here:
        if (isPlaying == false) {
            playBack();
        } else {
            stopPlaying();
        }
    }//GEN-LAST:event_playButtonActionPerformed

    private void VsliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_VsliderStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_VsliderStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        audioFilePath = pathArr[1];
        name = jButton2.getText();
        playFromList();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PlayListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayListButtonActionPerformed
        // TODO add your handling code here:
        if(isListOpen==false){
            isListOpen = true;
            jPanel2.setVisible(true);
        }
        else{
            isListOpen = false;
            jPanel2.setVisible(false);
        }
    }//GEN-LAST:event_PlayListButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        audioFilePath = pathArr[0];
        name = jButton1.getText();
        playFromList();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        audioFilePath = pathArr[2];
        name = jButton3.getText();
        playFromList();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        audioFilePath = pathArr[3];
        name = jButton4.getText();
        playFromList();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        audioFilePath = pathArr[4];
        name = jButton5.getText();
        playFromList();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        audioFilePath = pathArr[5];
        name = jButton6.getText();
        playFromList();
    }//GEN-LAST:event_jButton6ActionPerformed
    private void openFile() {
        JFileChooser filechooser = null;

        if (lastOpenPath != null && !lastOpenPath.equals("")) {
            filechooser = new JFileChooser(lastOpenPath);
        } else {
            filechooser = new JFileChooser();
        }

        int userChoice = filechooser.showOpenDialog(this);
        if (userChoice == JFileChooser.APPROVE_OPTION) {
            audioFilePath = filechooser.getSelectedFile().getAbsolutePath();
            lastOpenPath = filechooser.getSelectedFile().getParent();

            name = filechooser.getSelectedFile().getName();

            addToList(audioFilePath,name);
            //JOptionPane.showMessageDialog(MediaMain.this,"SELECTED FILE:\n"+name);
            if (isPlaying || isPaused) {
                
                if(isPaused == true) resetControls();
				else {
				stopPlaying();
				}
               
                while (player.getAudioClip().isRunning()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
            playBack();

        }

    }
    
    //Play From List
    void playFromList(){
        if(audioFilePath!= null)
        {
            if (isPlaying || isPaused) {
                
               if(isPaused == true) resetControls();
	        else {
		     stopPlaying();
		}
                
                
                while (player.getAudioClip().isRunning()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
            playBack();
        }
    }    

    //PLAY BACK
    private void playBack() {
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/music530x154.gif")));
        
        
        timer = new PlayingTimer(now, slide);
        timer.start();// calling its run method
        
        isPlaying = true;
        playbackThread = new Thread(new Runnable() {

            @Override
            public void run() {//run method of play back thread
                try {
                    
                    playButton.setText("Stop");
                    icon = new ImageIcon(getClass().getResource("stop.png"));
                    playButton.setIcon(icon);
                    playButton.setEnabled(true);

                    pauseButton.setEnabled(true);

                    player.load(audioFilePath);
                    timer.setAudioClip(player.getAudioClip());
                    SongName.setText("PLAYING:   " + name);
                    slide.setMaximum((int) player.getClipSecondLength());

                    total.setText(player.getClipLengthString());

                    // << Slider  Volume control start
                    vol.setEnabled(true);
                    Vslider.setValue(70);
                    FloatControl volume = (FloatControl) player.getAudioClip().getControl(FloatControl.Type.MASTER_GAIN);
                    volume.setValue(-10);

                    Vslider.addChangeListener(new ChangeListener() {
                        public void stateChanged(ChangeEvent ee) {
                            //System.out.println(Vslider.getValue());
                            if (Vslider.getValue() == 0) {
                                icon = new ImageIcon(getClass().getResource("vol_off.png"));
                                vol.setIcon(icon);
                                isMute = true;
                            } else {
                                icon = new ImageIcon(getClass().getResource("vol_on.png"));
                                vol.setIcon(icon);
                                isMute = false;
                            }

                            float f = Vslider.getValue() - 80.0f;
                            volume.setValue(f);
                        }
                    });

                    // >> Slider volume control ends 
                    player.play();

                    resetControls();

                } catch (UnsupportedAudioFileException ex) {
                    JOptionPane.showMessageDialog(PlayerFrame.this,
                            "The audio format is unsupported!", "Error", JOptionPane.ERROR_MESSAGE);
                    resetControls();
                    ex.printStackTrace();
                } catch (LineUnavailableException ex) {
                    JOptionPane.showMessageDialog(PlayerFrame.this,
                            "Could not play the audio file because line is unavailable!", "Error", JOptionPane.ERROR_MESSAGE);
                    resetControls();
                    ex.printStackTrace();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(PlayerFrame.this,
                            "I/O error while playing the audio file!", "Error", JOptionPane.ERROR_MESSAGE);
                    resetControls();
                    ex.printStackTrace();
                }

            }
        });

        playbackThread.start();// calling its run method
    }

//Volume Control
    private void volControl() {
        if (isMute == false) {
            isMute = true;
            Vslider.setValue(0);
            icon = new ImageIcon(getClass().getResource("vol_off.png"));
            vol.setIcon(icon);
            Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/music4530x154.gif")));
        } else {
            isMute = false;
            Vslider.setValue(70);
            icon = new ImageIcon(getClass().getResource("vol_on.png"));
            vol.setIcon(icon);
            Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/music11530x154.gif")));
        }
    }

    //STOP METHOD
    private void stopPlaying() {
        isPaused = false;
        
        pauseButton.setText("PAUSE");

        timer.reset();
        timer.interrupt();

        player.stop();
        playbackThread.interrupt();
    }

    //PAUSE METHOD
    private void pausePlaying() {
        pauseButton.setText("RESUME");
        icon = new ImageIcon(getClass().getResource("resume.png"));
        pauseButton.setIcon(icon);
        isPaused = true;
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/music2530x154.gif")));
        player.pause();

        timer.pauseTimer();
        playbackThread.interrupt();
        
    }

    //RESUME METHOD
    private void resumePlaying() {
        
        pauseButton.setText("PAUSE");
        icon = new ImageIcon(getClass().getResource("Pause-icon.png"));
        pauseButton.setIcon(icon);
        isPaused = false;
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/music11530x154.gif")));
        player.resume();
        timer.resumeTimer();
        playbackThread.interrupt();
    }

    //RESET
    private void resetControls() {
        timer.reset();
        timer.interrupt();

        playButton.setText("PLAY");
        icon = new ImageIcon(getClass().getResource("play.png"));
        playButton.setIcon(icon);
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/music3530x154.gif")));

        pauseButton.setText("PAUSE");
        icon = new ImageIcon(getClass().getResource("Pause-icon.png"));
        pauseButton.setIcon(icon);
        isPaused = false;
        
        pauseButton.setEnabled(false);
        isPlaying = false;
    }
    
    //Initializing files
    public void initFiles(String u_name, String nF, String pF){
        userName = u_name;
        nameLoc = nF;
        pathLoc = pF;
    }
     //Initializing List
    private void initLists(){
        try  
        {  
        File pathFile = new File(pathLoc);
        File nameFile = new File(nameLoc);   //creates a new file instance  
        
        //read paths
           try (FileReader pathfr = new FileReader(pathFile) //reads the file
           ) {
               BufferedReader br=new BufferedReader(pathfr);  //creates a buffering character input stream  
               
               String line;
               while ((line=br.readLine())!=null) {
                   
                   pathList.add(line);
               }
               //closes the stream and release the resources
           } //creates a buffering character input stream
           
         //read names
           try (FileReader namefr = new FileReader(nameFile) //reads the file
           ) {
               BufferedReader br=new BufferedReader(namefr);  //creates a buffering character input stream  
               
               String line;
               while ((line=br.readLine())!=null) {
                   
                   nameList.add(line);
               }
               //closes the stream and release the resources
           } //creates a buffering character input stream  
    
    //set vectors
        LinkedHashSet<String> Set1 = new LinkedHashSet<String>( pathList );
        LinkedHashSet<String> Set2 = new LinkedHashSet<String>( nameList );
        //clear the vector
        pathList.clear();
        nameList.clear();
        //add all unique elements back to the vector
        pathList.addAll(Set1);
        nameList.addAll(Set2);
        
}  
catch(IOException e)  
{  
    
}        
}
   
    //Rename Buttons of Playlist
    private void renameButtons(){
        String[] nameArr = new String[20];
        int j=0;
        for(String st: nameList){
               nameArr[j++]= st; 
            }
        
        //set path array
        int k=0;
        for(String st: pathList){
               pathArr[k++]= st; 
            }
       
        jButton1.setText(nameArr[0]);
        if(nameArr[0]==null)jButton1.setText("Open audio file to add in playlist.");
        jButton2.setText(nameArr[1]);
        jButton3.setText(nameArr[2]);
        jButton4.setText(nameArr[3]);
        jButton5.setText(nameArr[4]);
        jButton6.setText(nameArr[5]);
    }
    
    //Add recent items in Lists
    private void addToList(String path, String name){
        if(pathList.size()==6 && pathList.contains(path)== false){
            pathList.remove(0);
        }
        if(nameList.size()==6 && nameList.contains(name)== false){
            nameList.remove(0);
        }
        pathList.add(path);
        nameList.add(name);
        
        LinkedHashSet<String> Set1 = new LinkedHashSet<String>( pathList );
        LinkedHashSet<String> Set2 = new LinkedHashSet<String>( nameList );
        //clear the vector
        pathList.clear();
        nameList.clear();
        //add all unique elements back to the vector
        pathList.addAll(Set1);
        nameList.addAll(Set2);
        updateFiles();
        renameButtons();
    }
    
    //Update Files
    private void updateFiles(){
        File pathFile = new File(pathLoc);
        File nameFile = new File(nameLoc);
        
        try {
            Formatter fw1 = new Formatter(pathFile);
            Formatter fw2 = new Formatter(nameFile);
            
            for(String x: pathList){
        
                fw1.format("%s\n",x);
            }
            
            for(String y: nameList){
                
                fw2.format("%s\n",y);
            }
            
            fw1.close();
            fw2.close();
            
        } catch (IOException ex) {
            Logger.getLogger(PlayerFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PlayerFrame().setVisible(true);
//            }
//        });
//    }

    private static final long serialVersionUID = 1L;
    private AudioPlayer player = new AudioPlayer();
    private Thread playbackThread;
    private PlayingTimer timer;

    private String audioFilePath;
    private String lastOpenPath;
    private String name;
    private ImageIcon icon;
    
    //list variables
    String[] pathArr = new String[20];
    Vector<String>pathList = new Vector<String>();
    Vector<String>nameList = new Vector<String>();
    
    //filevariables
    String userName;
    String nameLoc;
    String pathLoc;
    

    private boolean isPlaying = false;
    private boolean isPaused = false;
    private boolean isMute = false;
    private boolean isListOpen=false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JButton PlayListButton;
    private javax.swing.JLabel SongName;
    private javax.swing.JSlider Vslider;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel now;
    private javax.swing.JButton openButton;
    private javax.swing.JButton pauseButton;
    private javax.swing.JButton playButton;
    private javax.swing.JSlider slide;
    private javax.swing.JLabel total;
    private javax.swing.JButton vol;
    // End of variables declaration//GEN-END:variables
}

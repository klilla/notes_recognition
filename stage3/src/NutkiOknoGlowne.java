
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.neuroph.contrib.imgrec.ImageRecognitionPlugin;
import org.neuroph.core.NeuralNetwork;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NutkiOknoGlowne.java
 *
 * Created on 2011-05-17, 23:01:57
 */

/**
 *
 * @author Kasia
 */
public class NutkiOknoGlowne extends javax.swing.JFrame {

    /** Creates new form NutkiOknoGlowne */
    String imgPath = null;
    String recognizedValue;
    double recognizedValueRate;

    String recognizedHeight;
    double recognizedHeightRate;

    boolean isDrawing;

    Font f1, f4;

    public NutkiOknoGlowne() {
        this.recognizedValue = null;
        this.recognizedValueRate = 0;
        this.isDrawing = false;

        
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NutkiOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(NutkiOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(NutkiOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(NutkiOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        initComponents();
        this.f4 = jLabel4.getFont();
        this.f1 = jLabel1.getFont();
        jLabel1.setFont(f1.deriveFont(f1.getStyle() | Font.BOLD));
        this.f1 = jLabel1.getFont();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        paintImage1 = new PaintImage();
        infoDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        imgLabelR = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        valueRateLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        heightRateLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imgLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        imagePanel1 = new ImagePanel();
        jPanel3 = new javax.swing.JPanel();
        startDrawingButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        recognizeValueButton = new javax.swing.JButton();
        recognizeHeight = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout infoDialogLayout = new javax.swing.GroupLayout(infoDialog.getContentPane());
        infoDialog.getContentPane().setLayout(infoDialogLayout);
        infoDialogLayout.setHorizontalGroup(
            infoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        infoDialogLayout.setVerticalGroup(
            infoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("outcome"));

        jLabel2.setText("Recognized note:");

        imgLabelR.setBackground(new java.awt.Color(204, 0, 0));
        imgLabelR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imgLabelR.setPreferredSize(new java.awt.Dimension(40, 50));

        valueLabel.setText("Value:");

        valueRateLabel.setText("Rate: 0");

        heightLabel.setText("Height:");

        heightRateLabel.setText("Rate: 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(imgLabelR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(valueRateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(heightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(heightRateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(valueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgLabelR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valueLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valueRateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(heightLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(heightRateLabel)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("to recognize"));

        jLabel1.setText("Note to recognize:");

        imgLabel.setBackground(new java.awt.Color(255, 255, 255));
        imgLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imgLabel.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel4.setText("Draw a note:");

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        imagePanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imagePanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                imagePanel1MouseReleased(evt);
            }
        });
        imagePanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                imagePanel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imagePanel1MouseMoved(evt);
            }
        });
        imagePanel1.setImg(paintImage1.getImg()); paintImage1.addObserver(imagePanel1);

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(imagePanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("drawing"));

        startDrawingButton.setText("Start drawing");
        startDrawingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDrawingButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.setEnabled(false);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startDrawingButton, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
            .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(startDrawingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("recognition"));

        recognizeValueButton.setText("Recognize value");
        recognizeValueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recognizeValueButtonActionPerformed(evt);
            }
        });

        recognizeHeight.setText("Recognize height");
        recognizeHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recognizeHeightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recognizeValueButton, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
            .addComponent(recognizeHeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(recognizeValueButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recognizeHeight)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("info"));

        infoArea.setColumns(20);
        infoArea.setEditable(false);
        infoArea.setLineWrap(true);
        infoArea.setRows(5);
        infoArea.setMaximumSize(new java.awt.Dimension(260, 90));
        jScrollPane2.setViewportView(infoArea);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Open File");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenuItem2.getAccessibleContext().setAccessibleName("openFile");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Quit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Info");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                .addGap(4, 4, 4)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser chooser = new JFileChooser(".");
        
        ExampleFileFilter filter = new ExampleFileFilter();
        filter.addExtension("jpg");
        filter.addExtension("gif");
        filter.addExtension("png");
        filter.setDescription("JPG & GIF Images");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(jMenu1);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            /*System.out.println("You chose to open this file: " +
            chooser.getSelectedFile().getAbsolutePath());*/
            imgPath = chooser.getSelectedFile().getAbsolutePath();
        }

        try
        {
          // Read from a file
          File FileToRead = new File(imgPath);
          //Recognize file as image
          Image Picture = ImageIO.read(FileToRead);
          //Show the image inside the label
          imgLabel.setIcon(new ImageIcon(Picture));
        }
        catch (Exception e)
        {
          //Display a message if something goes wrong
          JOptionPane.showMessageDialog( null, e.toString() );
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void recognizeValueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recognizeValueButtonActionPerformed
        //NeuralNetwork mynet = NeuralNetwork.load("netonline.nnet"); // load trained neural network saved with easyNeurons
        
        if(isDrawing){
            NeuralNetwork mynet = NeuralNetwork.load("sieci/wartosc/net/netonline.nnet");
            ImageRecognitionPlugin imageRecognition = (ImageRecognitionPlugin)mynet.getPlugin(ImageRecognitionPlugin.IMG_REC_PLUGIN_NAME); // get the image recognition plugin from neural network

            //zapisz obrazek z okienka
            File tmp = new File("tmp.png");
            if(!tmp.exists()) try {
                tmp.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(NutkiOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                ImageIO.write(paintImage1.getImg(), "png", tmp);
            } catch (IOException ex) {
		JOptionPane.showMessageDialog(this, ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
		Logger.getLogger(NutkiOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                HashMap <String, Double> output = imageRecognition.recognizeImage(tmp);
                //System.out.println(output.toString());
                infoArea.append(output.toString()+"\n");

                List newOutput = GetOutput.SortOutput(output);

                this.recognizedValue = newOutput.get(0).toString();
                this.recognizedValueRate = Double.parseDouble(newOutput.get(1).toString());

                this.valueLabel.setText("Value: " + this.recognizedValue);
                this.valueRateLabel.setText("Rate: " + this.recognizedValueRate);

            } catch(IOException ioe) {
                ioe.printStackTrace();
            }

            try
            {
              String fileName = "graphics/" + this.recognizedValue + ".png";
              File FileToRead = new File(fileName);
              Image Picture = ImageIO.read(FileToRead);
              imgLabelR.setIcon(new ImageIcon(Picture));
            }
            catch (Exception e)
            {
              JOptionPane.showMessageDialog( null, "No file loaded" );
            }

        }
        else if(imgPath != null){
            NeuralNetwork mynet = NeuralNetwork.load("sieci/wartosc/net/wart3.nnet");
            ImageRecognitionPlugin imageRecognition = (ImageRecognitionPlugin)mynet.getPlugin(ImageRecognitionPlugin.IMG_REC_PLUGIN_NAME);
            try {
                HashMap <String, Double> output = imageRecognition.recognizeImage(new File(imgPath));
                //System.out.println(output.toString());
                infoArea.append(output.toString()+"\n");

                List newOutput = GetOutput.SortOutput(output);

                this.recognizedValue = newOutput.get(0).toString();
                this.recognizedValueRate = Double.parseDouble(newOutput.get(1).toString());

                this.valueLabel.setText("Value: " + this.recognizedValue);
                this.valueRateLabel.setText("Rate: " + this.recognizedValueRate);

            } catch(IOException ioe) {
                ioe.printStackTrace();
            }

            try
            {
              String fileName = "graphics/" + this.recognizedValue + ".png";
              File FileToRead = new File(fileName);
              Image Picture = ImageIO.read(FileToRead);
              imgLabelR.setIcon(new ImageIcon(Picture));
            }
            catch (Exception e)
            {
              JOptionPane.showMessageDialog( null, "No file loaded" );
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Wystąpił błąd...\nSpróbuj inaczej...", "Błąd!", 2);

        }
    }//GEN-LAST:event_recognizeValueButtonActionPerformed

    private void recognizeHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recognizeHeightActionPerformed
        //NeuralNetwork mynet = NeuralNetwork.load("height.nnet"); // load trained neural network saved with easyNeurons
        if(this.isDrawing){
            NeuralNetwork mynet = NeuralNetwork.load("sieci/wysokosc/net/wys2.nnet");
            // get the image recognition plugin from neural network
            ImageRecognitionPlugin imageRecognition = (ImageRecognitionPlugin)mynet.getPlugin(ImageRecognitionPlugin.IMG_REC_PLUGIN_NAME); // get the image recognition plugin from neural network
            //zapisz obrazek z okienka
            File tmp = new File("tmp.png");
            if(!tmp.exists()) try {
                tmp.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(NutkiOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                ImageIO.write(paintImage1.getImg(), "png", tmp);
            } catch (IOException ex) {
		JOptionPane.showMessageDialog(this, ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
		Logger.getLogger(NutkiOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                HashMap <String, Double> output = imageRecognition.recognizeImage(tmp);
                //System.out.println(output.toString());
                infoArea.append(output.toString()+"\n");

                List newOutput = GetOutput.SortOutput(output);

                this.recognizedHeight = newOutput.get(0).toString();
                this.recognizedHeightRate = Double.parseDouble(newOutput.get(1).toString());

                this.heightLabel.setText("Value: " + this.recognizedHeight);
                this.heightRateLabel.setText("Rate: " + this.recognizedHeightRate);

            } catch(IOException ioe) {
                ioe.printStackTrace();
            }

            try
            {
              String fileName = "graphics/" + this.recognizedHeight + ".png";
              File FileToRead = new File(fileName);
              Image Picture = ImageIO.read(FileToRead);
              imgLabelR.setIcon(new ImageIcon(Picture));
            }
            catch (Exception e)
            {
              JOptionPane.showMessageDialog( null, "No file loaded" );
            }
        }
        else if(imgPath!=null){
            //NeuralNetwork mynet = NeuralNetwork.load("height.nnet"); // load trained neural network saved with easyNeurons
            NeuralNetwork mynet = NeuralNetwork.load("sieci/wysokosc/net/wys2.nnet");
            // get the image recognition plugin from neural network
            ImageRecognitionPlugin imageRecognition = (ImageRecognitionPlugin)mynet.getPlugin(ImageRecognitionPlugin.IMG_REC_PLUGIN_NAME); // get the image recognition plugin from neural network
            try {
                HashMap <String, Double> output = imageRecognition.recognizeImage(new File(imgPath));
                //System.out.println(output.toString());
                infoArea.append(output.toString()+"\n");

                List newOutput = GetOutput.SortOutput(output);

                this.recognizedHeight = newOutput.get(0).toString();
                this.recognizedHeightRate = Double.parseDouble(newOutput.get(1).toString());

                this.heightLabel.setText("Value: " + this.recognizedHeight);
                this.heightRateLabel.setText("Rate: " + this.recognizedHeightRate);

            } catch(IOException ioe) {
                ioe.printStackTrace();
            }

            try
            {
              String fileName = "graphics/" + this.recognizedHeight + ".png";
              File FileToRead = new File(fileName);
              Image Picture = ImageIO.read(FileToRead);
              imgLabelR.setIcon(new ImageIcon(Picture));
            }
            catch (Exception e)
            {
              JOptionPane.showMessageDialog( null, "No file loaded" );
            }
       }
        else{
            JOptionPane.showMessageDialog(this, "Wystąpił błąd...\nSpróbuj inaczej...", "Błąd!", 2);

        }

    }//GEN-LAST:event_recognizeHeightActionPerformed

    private void startDrawingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDrawingButtonActionPerformed
        if(this.isDrawing == false){
            jLabel4.setFont(f4.deriveFont(f4.getStyle() | Font.BOLD));
            jLabel1.setFont(f1.deriveFont(f1.getStyle() ^ Font.BOLD));
            f4 = jLabel4.getFont();
            f1 = jLabel1.getFont();

            this.isDrawing = true;
            clearButton.setEnabled(true);
            startDrawingButton.setText("Stop drawing");
            try {
                File tmp = new File("graphics/emptyL.png");
                paintImage1.setImg(ImageIO.read(tmp));
                imagePanel1.setImg(ImageIO.read(tmp));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(NutkiOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            jLabel4.setFont(f4.deriveFont(f4.getStyle() ^ Font.BOLD));
            jLabel1.setFont(f1.deriveFont(f1.getStyle() | Font.BOLD));
            f4 = jLabel4.getFont();
            f1 = jLabel1.getFont();

            isDrawing = false;
            clearButton.setEnabled(false);
            startDrawingButton.setText("Start drawing");
        }

    }//GEN-LAST:event_startDrawingButtonActionPerformed

    private int button = MouseEvent.NOBUTTON;
    private void imagePanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel1MouseDragged
        if(isDrawing) paintImage1.drawTo(evt.getPoint());
    }//GEN-LAST:event_imagePanel1MouseDragged

    private void imagePanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_imagePanel1MouseMoved

    private void imagePanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel1MousePressed
        if(isDrawing){
            button = evt.getButton();
            paintImage1.setDrawing(true);
            paintImage1.drawTo(evt.getPoint());
        }
    }//GEN-LAST:event_imagePanel1MousePressed

    private void imagePanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel1MouseReleased
        if(isDrawing){
            button = MouseEvent.NOBUTTON;
            paintImage1.setDrawing(false);
        }
    }//GEN-LAST:event_imagePanel1MouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Author: Katarzyna Lilla", "Info", 1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
            try {
                File tmp = new File("graphics/emptyL.png");
                paintImage1.setImg(ImageIO.read(tmp));
                imagePanel1.setImg(ImageIO.read(tmp));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(NutkiOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_clearButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NutkiOknoGlowne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JLabel heightRateLabel;
    private ImagePanel imagePanel1;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel imgLabelR;
    private javax.swing.JTextArea infoArea;
    private javax.swing.JDialog infoDialog;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private PaintImage paintImage1;
    private javax.swing.JButton recognizeHeight;
    private javax.swing.JButton recognizeValueButton;
    private javax.swing.JButton startDrawingButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueRateLabel;
    // End of variables declaration//GEN-END:variables

}

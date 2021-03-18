/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

import javax.swing.*;

/**
 *
 * @author Abdelrahman , Gamal , pola
 */
public class GUI {

    public JLabel folderText;
    public JLabel folderText2;
    public JLabel folderText3;

    public JLabel noteName;
  
    public JLabel labelFile11, labelFile12, labelFile13;
    public JLabel labelFile21, labelFile22, labelFile23;
    public JLabel labelFile31, labelFile32, labelFile33;
    
    
    public JLabel fileDescriptorCounter1, fileDescriptorCounter2, fileDescriptorCounter3;
    
    public JLabel enterNameOfFolder ,enterNameOfFile ;

    public int folder1 = 0;
    public int folder2 = 0;
    public int folder3 = 0;

    public int counterEnterFoldedr = 0;
    public int selectFolderCounter1 = 0;
    public int selectFolderCounter2 = 0;
    public int selectFolderCounter3 = 0;

    public int selectFileCounter11 = 0;
    public int selectFileCounter12 = 0;
    public int selectFileCounter13 = 0;

    public int selectFileCounter21 = 0;
    public int selectFileCounter22 = 0;
    public int selectFileCounter23 = 0;

    public int selectFileCounter31 = 0;
    public int selectFileCounter32 = 0;
    public int selectFileCounter33 = 0;

    public int filesCounter1 = 0;
    public int filesCounter2 = 0;
    public int filesCounter3 = 0;
    
    public int searchCounter = 9;

    public GUI() {
        
        Color offblue =new Color(209, 209, 224);
        
        
        
          

        JFrame frame = new JFrame("FolderEX"); //Create The Main Frame.
        frame.setVisible(true);
        frame.setSize(1280, 600);
        frame.setLayout(null);
        frame.getContentPane().setBackground(offblue);
        
        
        JSeparator s = new JSeparator(); 
        s.setBounds(10, 215, 500, 5); 
        frame.add(s);

        TextField folderTextFiled = new TextField("NewFolder", 15); // Create TextField For Folder.
        folderTextFiled.setBounds(110, 10, 300, 20);
        frame.add(folderTextFiled);

        TextField fileTextFiled = new TextField("NewFile", 15); // Create TextField For File.
        fileTextFiled.setBounds(600, 10, 300, 20);
        frame.add(fileTextFiled);

        TextField searchTextFiled = new TextField("Search...", 15); // Create TextFiled for Search
        searchTextFiled.setBounds(630, 400, 300, 40);
        frame.add(searchTextFiled);

        JButton folderButton = new JButton("Create Folder"); //Button for Create Folder .
        folderButton.setBounds(70, 400, 150, 60);
        frame.add(folderButton);

        JButton searchButton = new JButton("Search"); //Button for Create Folder .
        searchButton.setBounds(430, 400, 150, 60);
        frame.add(searchButton);

        JButton fileButton = new JButton("Create file"); //Button for Create File .
        fileButton.setBounds(250, 400, 150, 60);
        frame.add(fileButton);
        ////////////////////////////////////////////

        Folder folderName1 = new Folder();

        Folder folderName2 = new Folder();

        Folder folderName3 = new Folder();

        //////////////////////////////////
        // Files in the First Folder.
        File nameOfFile11 = new File();

        File nameOfFile12 = new File();

        File nameOfFile13 = new File();

        // Files in the Second Folder.
        File nameOfFile21 = new File();

        File nameOfFile22 = new File();

        File nameOfFile23 = new File();

        // Files in the third Folder.
        File nameOfFile31 = new File();

        File nameOfFile32 = new File();

        File nameOfFile33 = new File();

        nameOfFile11.setFileName("***");
        nameOfFile12.setFileName("***");
        nameOfFile13.setFileName("***");

        nameOfFile21.setFileName("***");
        nameOfFile22.setFileName("***");
        nameOfFile23.setFileName("***");

        nameOfFile31.setFileName("***");
        nameOfFile32.setFileName("***");
        nameOfFile33.setFileName("***");

        nameOfFile11.getFileName();

        /////////////////////////////////////////////
        
        enterNameOfFolder = new JLabel("Enter Folder Name");
        enterNameOfFolder.setBounds(1, 8, 300, 20);
        enterNameOfFolder.setVisible(true);
        frame.add(enterNameOfFolder);
        
        enterNameOfFile = new JLabel("Enter File Name");
        enterNameOfFile.setBounds(493, 8, 300, 20);
        enterNameOfFile.setVisible(true);
        frame.add(enterNameOfFile);
        
        
        folderText = new JLabel("new");
        folderText.setBounds(50, 100, 150, 30);
        folderText.setVisible(false);
        frame.add(folderText);

        folderText2 = new JLabel("new");
        folderText2.setBounds(150, 100, 150, 30);
        folderText2.setVisible(false);
        frame.add(folderText2);

        folderText3 = new JLabel("new");
        folderText3.setBounds(250, 100, 150, 30);
        folderText3.setVisible(false);
        frame.add(folderText3);

        // files in first folder****
        labelFile11 = new JLabel(nameOfFile11.getFileName());
        labelFile11.setBounds(50, 250, 150, 30);
        labelFile11.setVisible(false);
        frame.add(labelFile11);

        labelFile12 = new JLabel(nameOfFile12.getFileName());
        labelFile12.setBounds(150, 250, 150, 30);
        labelFile12.setVisible(false);
        frame.add(labelFile12);

        labelFile13 = new JLabel(nameOfFile13.getFileName());
        labelFile13.setBounds(250, 250, 150, 30);
        labelFile13.setVisible(false);
        frame.add(labelFile13);
        
        //files in second folder****
        labelFile21 = new JLabel(nameOfFile21.getFileName());
        labelFile21.setBounds(50, 250, 150, 30);
        labelFile21.setVisible(false);
        frame.add(labelFile21);

        labelFile22 = new JLabel(nameOfFile22.getFileName());
        labelFile22.setBounds(150, 250, 150, 30);
        labelFile22.setVisible(false);
        frame.add(labelFile22);

        labelFile23 = new JLabel(nameOfFile23.getFileName());
        labelFile23.setBounds(250, 250, 150, 30);
        labelFile23.setVisible(false);
        frame.add(labelFile23);
        //files in third folder****
        labelFile31 = new JLabel(nameOfFile31.getFileName());
        labelFile31.setBounds(50, 250, 150, 30);
        labelFile31.setVisible(false);
        frame.add(labelFile31);

        labelFile32 = new JLabel(nameOfFile32.getFileName());
        labelFile32.setBounds(150, 250, 150, 30);
        labelFile32.setVisible(false);
        frame.add(labelFile32);

        labelFile33 = new JLabel(nameOfFile33.getFileName());
        labelFile33.setBounds(250, 250, 150, 30);
        labelFile33.setVisible(false);
        frame.add(labelFile33);

        JTextArea textArea11 = new JTextArea("note11", 19, 44);
        textArea11.setBounds(970, 140, 250, 400);
        textArea11.setVisible(false);
        frame.add(textArea11);

        JTextArea textArea12 = new JTextArea("note12",19, 44);
        textArea12.setBounds(970, 140, 250, 400);
        textArea12.setVisible(false);
        frame.add(textArea12);
        
        
        JTextArea textArea13 = new JTextArea("note13",19, 44);
        textArea13.setBounds(970, 140, 250, 400);
        textArea13.setVisible(false);
        frame.add(textArea13);
        
        JTextArea textArea21 = new JTextArea("note21",19, 44);
        textArea21.setBounds(970, 140, 250, 400);
        textArea21.setVisible(false);
        frame.add(textArea21);

        JTextArea textArea22 = new JTextArea("note22",19, 44);
        textArea22.setBounds(970, 140, 250, 400);
        textArea22.setVisible(false);
        frame.add(textArea22);
        
        JTextArea textArea23 = new JTextArea("note22",19, 44);
        textArea23.setBounds(970, 140, 250, 400);
        textArea23.setVisible(false);
        frame.add(textArea23);
        
        JTextArea textArea31 = new JTextArea("note31",19, 44);
        textArea31.setBounds(970, 140, 250, 400);
        textArea31.setVisible(false);
        frame.add(textArea31);

        JTextArea textArea32 = new JTextArea("note32",19, 44);
        textArea32.setBounds(970, 140, 250, 400);
        textArea32.setVisible(false);
        frame.add(textArea32);
        
        JTextArea textArea33 = new JTextArea("note33",19, 44);
        textArea33.setBounds(970, 140, 250, 400);
        textArea33.setVisible(false);
        frame.add(textArea33);

        fileDescriptorCounter1 = new JLabel("");
        fileDescriptorCounter1.setBounds(250, 500, 500, 60);
        fileDescriptorCounter1.setVisible(true);
        frame.add(fileDescriptorCounter1);

        fileDescriptorCounter2 = new JLabel("");
        fileDescriptorCounter2.setBounds(250, 500, 500, 60);
        fileDescriptorCounter2.setVisible(true);
        frame.add(fileDescriptorCounter2);

        fileDescriptorCounter3 = new JLabel("");
        fileDescriptorCounter3.setBounds(250, 500, 500, 60);
        fileDescriptorCounter3.setVisible(true);
        frame.add(fileDescriptorCounter3);
        
        noteName = new JLabel("");
        noteName.setBounds(970, 60, 100, 100);
        noteName.setVisible(false);
        frame.add(noteName);
        
        

        folderButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (!"".equals(folderTextFiled.getText()) && Validation.isValidUsername(folderTextFiled.getText()) ) {// validate that the Name of the Folder not NULL
                    if(!folderTextFiled.getText().equals(folderName1.getFolderName()) && !folderTextFiled.getText().equals(folderName2.getFolderName()) && !folderTextFiled.getText().equals(folderName3.getFolderName()) )  {
                    counterEnterFoldedr = counterEnterFoldedr + 1;

                    if (counterEnterFoldedr == 1) {
                        
                        folderText.setVisible(true);
                        folderName1.setFolderName(folderTextFiled.getText());
                        folderText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                        folderText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                        folderText.setSize(80, 80);
                        folderText.setText(folderName1.getFolderName());
                        folder1 = 1;

                    }
                    if (counterEnterFoldedr == 2) {
                        folderText2.setVisible(true);
                        folderName2.setFolderName(folderTextFiled.getText());
                        folderText2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                        folderText2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                        folderText2.setSize(80, 80);
                        folderText2.setText(folderName2.getFolderName());
                        folder2 = 2;

                    }
                    if (counterEnterFoldedr == 3) {
                        folderText3.setVisible(true);
                        folderName3.setFolderName(folderTextFiled.getText());
                        folderText3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                        folderText3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                        folderText3.setSize(80, 80);
                        folderText3.setText(folderName3.getFolderName());
                        folder3 = 3;

                    }
                }
                    else{
                    JOptionPane.showMessageDialog(frame, "The Name is already taken !" , "Folder", JOptionPane.INFORMATION_MESSAGE);
                }
            }
                else{
                    JOptionPane.showMessageDialog(frame, "The Name contain invalid characters !" , "Folder", JOptionPane.INFORMATION_MESSAGE);
                }
                
             

                folderText.setIcon(new ImageIcon("C:\\Users\\dell\\Desktop\\fol.png"));
                folderText2.setIcon(new ImageIcon("C:\\Users\\dell\\Desktop\\fol.png"));
                folderText3.setIcon(new ImageIcon("C:\\Users\\dell\\Desktop\\fol.png"));
                labelFile11.setIcon(new ImageIcon("C:\\Users\\dell\\Desktop\\text.png"));
                labelFile12.setIcon(new ImageIcon("C:\\Users\\dell\\Desktop\\text.png"));
                labelFile13.setIcon(new ImageIcon("C:\\Users\\dell\\Desktop\\text.png"));

                labelFile21.setIcon(new ImageIcon("C:\\Users\\dell\\Desktop\\text.png"));
                labelFile22.setIcon(new ImageIcon("C:\\Users\\dell\\Desktop\\text.png"));
                labelFile23.setIcon(new ImageIcon("C:\\Users\\dell\\Desktop\\text.png"));

                labelFile31.setIcon(new ImageIcon("C:\\Users\\dell\\Desktop\\text.png"));
                labelFile32.setIcon(new ImageIcon("C:\\Users\\dell\\Desktop\\text.png"));
                labelFile33.setIcon(new ImageIcon("C:\\Users\\dell\\Desktop\\text.png"));

            }

            private String string(int c) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        folderText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectFolderCounter1 = 1;
                selectFolderCounter2 = 0;
                selectFolderCounter3 = 0;

                folderText.setText("<html><span bgcolor=\"#969696\">" + folderName1.getFolderName() + "</span></html>");
                fileDescriptorCounter3.setVisible(false);
                fileDescriptorCounter2.setVisible(false);
                fileDescriptorCounter1.setVisible(true);
                
                
                

                labelFile22.setText(nameOfFile22.getFileName());
                labelFile21.setText(nameOfFile21.getFileName());
                labelFile23.setText(nameOfFile23.getFileName());

                labelFile32.setText(nameOfFile32.getFileName());
                labelFile31.setText(nameOfFile31.getFileName());
                labelFile33.setText(nameOfFile33.getFileName());

                labelFile12.setText(nameOfFile12.getFileName());
                labelFile11.setText(nameOfFile11.getFileName());
                labelFile13.setText(nameOfFile13.getFileName());

                folderText3.setText(folderName3.getFolderName());
                folderText2.setText(folderName2.getFolderName());
                if (selectFolderCounter1 == 1) {
                    labelFile21.setVisible(false);
                    labelFile22.setVisible(false);
                    labelFile23.setVisible(false);
                    labelFile31.setVisible(false);
                    labelFile32.setVisible(false);
                    labelFile33.setVisible(false);
                    if (nameOfFile11.getFileName() != "***") {
                        labelFile11.setVisible(true);
                    }
                    if (nameOfFile12.getFileName() != "***") {
                        labelFile12.setVisible(true);
                    }
                    if (nameOfFile13.getFileName() != "***") {
                        labelFile13.setVisible(true);
                    }
                    
                    textArea22.setVisible(false);
                textArea23.setVisible(false);
                textArea21.setVisible(false);

                textArea32.setVisible(false);
                textArea33.setVisible(false);
                textArea31.setVisible(false);
                    
                textArea12.setVisible(false);
                textArea13.setVisible(false);
                textArea11.setVisible(false);
                    noteName.setVisible(false);
                }

            }

        });
        folderText2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectFolderCounter2 = 1;
                selectFolderCounter1 = 0;
                selectFolderCounter3 = 0;
                folderText2.setText("<html><span bgcolor=\"#969696\">" + folderName2.getFolderName() + "</span></html>");
                fileDescriptorCounter3.setVisible(false);
                fileDescriptorCounter1.setVisible(false);
                fileDescriptorCounter2.setVisible(true);

                labelFile12.setText(nameOfFile12.getFileName());
                labelFile11.setText(nameOfFile11.getFileName());
                labelFile13.setText(nameOfFile13.getFileName());

                labelFile32.setText(nameOfFile32.getFileName());
                labelFile31.setText(nameOfFile31.getFileName());
                labelFile33.setText(nameOfFile33.getFileName());

                labelFile22.setText(nameOfFile22.getFileName());
                labelFile21.setText(nameOfFile21.getFileName());
                labelFile23.setText(nameOfFile23.getFileName());

                folderText3.setText(folderName3.getFolderName());
                folderText.setText(folderName1.getFolderName());
                
                
                if (selectFolderCounter2 == 1) {
                    labelFile11.setVisible(false);
                    labelFile12.setVisible(false);
                    labelFile13.setVisible(false);
                    labelFile31.setVisible(false);
                    labelFile32.setVisible(false);
                    labelFile33.setVisible(false);
                    if (nameOfFile21.getFileName() != "***") {
                        labelFile21.setVisible(true);
                    }
                    if (nameOfFile22.getFileName() != "***") {
                        labelFile22.setVisible(true);
                    }
                    if (nameOfFile23.getFileName() != "***") {
                        labelFile23.setVisible(true);
                    }
                    
                    // This Area Remove the HTML Tags
                    textArea22.setVisible(false);
                    textArea23.setVisible(false);
                    textArea21.setVisible(false);

                    textArea32.setVisible(false);
                    textArea33.setVisible(false);
                    textArea31.setVisible(false);

                    textArea12.setVisible(false);
                    textArea13.setVisible(false);
                    textArea11.setVisible(false);
                    noteName.setVisible(false);
                }
            }

        });
        folderText3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectFolderCounter3 = 1;
                selectFolderCounter2 = 0;
                selectFolderCounter1 = 0;

                folderText3.setText("<html><span bgcolor=\"#969696\">" + folderName3.getFolderName() + "</span></html>");

                fileDescriptorCounter1.setVisible(false);
                fileDescriptorCounter2.setVisible(false);
                fileDescriptorCounter3.setVisible(true);
                
                textArea12.setVisible(false);
                textArea13.setVisible(false);
                    
                textArea11.setVisible(false);
                textArea33.setVisible(false);
                textArea32.setVisible(false);
                textArea31.setVisible(false);

                textArea22.setVisible(false);
                textArea23.setVisible(false);
                noteName.setVisible(false);

                textArea21.setVisible(false);

                labelFile22.setText(nameOfFile22.getFileName());
                labelFile21.setText(nameOfFile21.getFileName());
                labelFile23.setText(nameOfFile23.getFileName());

                labelFile12.setText(nameOfFile12.getFileName());
                labelFile11.setText(nameOfFile11.getFileName());
                labelFile13.setText(nameOfFile13.getFileName());

                labelFile32.setText(nameOfFile32.getFileName());
                labelFile31.setText(nameOfFile31.getFileName());
                labelFile33.setText(nameOfFile33.getFileName());

                folderText2.setText(folderName2.getFolderName());
                folderText.setText(folderName1.getFolderName());

                if (selectFolderCounter3 == 1) {
                    labelFile21.setVisible(false);
                    labelFile22.setVisible(false);
                    labelFile23.setVisible(false);
                    labelFile11.setVisible(false);
                    labelFile12.setVisible(false);
                    labelFile13.setVisible(false);
                    if (nameOfFile31.getFileName() != "***") {
                        labelFile31.setVisible(true);
                    }
                    if (nameOfFile32.getFileName() != "***") {
                        labelFile32.setVisible(true);
                    }
                    if (nameOfFile33.getFileName() != "***") {
                        labelFile33.setVisible(true);
                    }
                    

                }
            }

        });

        fileButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (Validation.isValidUsername(fileTextFiled.getText())) {

                    if (selectFolderCounter1 == 1) {
                        filesCounter1 = filesCounter1 + 1;
                    }

                    if (filesCounter1 == 1) {
                        if (selectFolderCounter1 == 1 && folder1 == 1) {
                            labelFile11.setVisible(true);
                            nameOfFile11.setFileName(fileTextFiled.getText());
                            labelFile11.setText(nameOfFile11.getFileName());
                            labelFile11.setSize(80, 98);
                            labelFile11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                            labelFile11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                            fileDescriptorCounter1.setText("Number of files in " + folderName1.getFolderName() + " = " + Integer.toString(filesCounter1));

                        }

                    }

                    if (filesCounter1 == 2) {
                        if (!fileTextFiled.getText().equals(nameOfFile11.getFileName())) {
                            if (selectFolderCounter1 == 1 && folder1 == 1) {
                                labelFile12.setVisible(true);
                                nameOfFile12.setFileName(fileTextFiled.getText());
                                labelFile12.setText(nameOfFile12.getFileName());
                                labelFile12.setSize(80, 98);
                                labelFile12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                                labelFile12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                                fileDescriptorCounter1.setText("Number of files in " + folderName1.getFolderName() + " = " + Integer.toString(filesCounter1));

                            }
                        } else {
                            JOptionPane.showMessageDialog(frame, "The Name is already taken !", "File", JOptionPane.INFORMATION_MESSAGE);
                            
                            filesCounter1 = filesCounter1 - 1;
                        }

                    }
                    if (filesCounter1 == 3) {
                        if (!fileTextFiled.getText().equals(nameOfFile11.getFileName()) && !fileTextFiled.getText().equals(nameOfFile12.getFileName())) {
                            if (selectFolderCounter1 == 1 && folder1 == 1) {
                                labelFile13.setVisible(true);
                                nameOfFile13.setFileName(fileTextFiled.getText());
                                labelFile13.setText(nameOfFile13.getFileName());
                                labelFile13.setSize(80, 98);
                                labelFile13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                                labelFile13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                                fileDescriptorCounter1.setText("Number of files in " + folderName1.getFolderName() + " = " + Integer.toString(filesCounter1));

                            }
                        } else {
                            JOptionPane.showMessageDialog(frame, "The Name is already taken !", "File", JOptionPane.INFORMATION_MESSAGE);
                            filesCounter1 = filesCounter1 - 1;
                        }

                    }

                    if (selectFolderCounter2 == 1) {
                        filesCounter2 = filesCounter2 + 1;
                    }

                    if (filesCounter2 == 1) {

                        if (selectFolderCounter2 == 1 && folder2 == 2) {
                            labelFile21.setVisible(true);
                            nameOfFile21.setFileName(fileTextFiled.getText());
                            labelFile21.setText(nameOfFile21.getFileName());
                            labelFile21.setSize(80, 98);
                            labelFile21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                            labelFile21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                            fileDescriptorCounter2.setText("Number of files in " + folderName2.getFolderName() + " = " + Integer.toString(filesCounter2));

                        }
                    }
                    if (filesCounter2 == 2) {
                        if (!fileTextFiled.getText().equals(nameOfFile21.getFileName())) {
                            if (selectFolderCounter2 == 1 && folder2 == 2) {
                                labelFile22.setVisible(true);
                                nameOfFile22.setFileName(fileTextFiled.getText());
                                labelFile22.setText(nameOfFile22.getFileName());
                                labelFile22.setSize(80, 98);
                                labelFile22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                                labelFile22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                                fileDescriptorCounter2.setText("Number of files in " + folderName2.getFolderName() + " = " + Integer.toString(filesCounter2));

                            }
                        } else {
                            JOptionPane.showMessageDialog(frame, "The Name is already taken !", "File", JOptionPane.INFORMATION_MESSAGE);
                            filesCounter2 = filesCounter2 - 1;
                        }
                    }
                    if (filesCounter2 == 3) {
                        if (!fileTextFiled.getText().equals(nameOfFile21.getFileName()) && !fileTextFiled.getText().equals(nameOfFile22.getFileName())) {
                            if (selectFolderCounter2 == 1 && folder2 == 2) {
                                labelFile23.setVisible(true);
                                nameOfFile23.setFileName(fileTextFiled.getText());
                                labelFile23.setText(nameOfFile23.getFileName());
                                labelFile23.setSize(80, 98);
                                labelFile23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                                labelFile23.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                                fileDescriptorCounter2.setText("Number of files in " + folderName2.getFolderName() + " = " + Integer.toString(filesCounter2));
                            }
                        } else {
                            JOptionPane.showMessageDialog(frame, "The Name is already taken !", "File", JOptionPane.INFORMATION_MESSAGE);
                            filesCounter2 = filesCounter2 - 1;
                        }

                    }
                    if (selectFolderCounter3 == 1) {
                        filesCounter3 = filesCounter3 + 1;
                    }
                    if (filesCounter3 == 1) {
                        if (selectFolderCounter3 == 1 && folder3 == 3) {
                            labelFile31.setVisible(true);
                            nameOfFile31.setFileName(fileTextFiled.getText());
                            labelFile31.setText(nameOfFile31.getFileName());
                            labelFile31.setSize(80, 98);
                            labelFile31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                            labelFile31.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                            fileDescriptorCounter3.setText("Number of files in " + folderName3.getFolderName() + " = " + Integer.toString(filesCounter3));

                        }
                    }
                    if (filesCounter3 == 2) {
                        if (!fileTextFiled.getText().equals(nameOfFile31.getFileName())) {
                            if (selectFolderCounter3 == 1 && folder3 == 3) {
                                labelFile32.setVisible(true);
                                nameOfFile32.setFileName(fileTextFiled.getText());
                                labelFile32.setText(nameOfFile32.getFileName());
                                labelFile32.setSize(80, 98);
                                labelFile32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                                labelFile32.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                                fileDescriptorCounter3.setText("Number of files in " + folderName3.getFolderName() + " = " + Integer.toString(filesCounter3));
                            }
                        } else {
                            JOptionPane.showMessageDialog(frame, "The Name is already taken !", "File", JOptionPane.INFORMATION_MESSAGE);
                            filesCounter3 = filesCounter3 - 1;
                        }
                    }
                    if (filesCounter3 == 3) {
                        if (!fileTextFiled.getText().equals(nameOfFile31.getFileName()) && !fileTextFiled.getText().equals(nameOfFile32.getFileName())) {
                            if (selectFolderCounter3 == 1 && folder3 == 3) {
                                labelFile33.setVisible(true);
                                nameOfFile33.setFileName(fileTextFiled.getText());
                                labelFile33.setText(nameOfFile33.getFileName());
                                labelFile33.setSize(80, 98);
                                labelFile33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                                labelFile33.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                                fileDescriptorCounter3.setText("Number of files in " + folderName3.getFolderName() + " = " + Integer.toString(filesCounter3));
                            }
                        } else {
                            JOptionPane.showMessageDialog(frame, "The Name is already taken !", "File", JOptionPane.INFORMATION_MESSAGE);
                            filesCounter3 = filesCounter3 - 1;
                        }

                    }
                   

                }
                 else{
                    JOptionPane.showMessageDialog(frame, "The Name contain invalid characters !", "File", JOptionPane.INFORMATION_MESSAGE);
                }
            }


          
        }
        );

        labelFile11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectFileCounter11 = 1;
                selectFileCounter12 = 0;
                selectFileCounter13 = 0;

                labelFile11.setText("<html><span bgcolor=\"#969696\">" + nameOfFile11.getFileName() + "</span></html>");
                textArea11.setVisible(true);
                
                labelFile12.setText(nameOfFile12.getFileName());
                labelFile13.setText(nameOfFile13.getFileName());

                textArea12.setVisible(false);
                textArea13.setVisible(false);
                noteName.setText(nameOfFile11.getFileName());
                noteName.setVisible(true);
                textArea11.setVisible(true);

            }
        }
        );

        labelFile12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectFileCounter12 = 1;
                selectFileCounter11 = 0;
                selectFileCounter13 = 0;

                labelFile12.setText("<html><span bgcolor=\"#969696\">" + nameOfFile12.getFileName() + "</span></html>");
                textArea12.setVisible(true);
                labelFile11.setText(nameOfFile11.getFileName());
                labelFile13.setText(nameOfFile13.getFileName());
                textArea11.setVisible(false);
                textArea13.setVisible(false);
                noteName.setText(nameOfFile12.getFileName());
                noteName.setVisible(true);
                textArea12.setVisible(true);
            }
        }
        );

        labelFile13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectFileCounter13 = 1;
                selectFileCounter12 = 0;
                selectFileCounter11 = 0;

                labelFile13.setText("<html><span bgcolor=\"#969696\">" + nameOfFile13.getFileName() + "</span></html>");
                textArea13.setVisible(true);
                labelFile12.setText(nameOfFile12.getFileName());
                labelFile11.setText(nameOfFile11.getFileName());
                textArea12.setVisible(false);
                textArea11.setVisible(false);
                noteName.setText(nameOfFile13.getFileName());
                noteName.setVisible(true);
                textArea13.setVisible(true);

            }
        }
        );
        labelFile21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectFileCounter21 = 1;
                selectFileCounter22 = 0;
                selectFileCounter23 = 0;

                labelFile21.setText("<html><span bgcolor=\"#969696\">" + nameOfFile21.getFileName() + "</span></html>");
                textArea21.setVisible(true);
                labelFile22.setText(nameOfFile22.getFileName());
                labelFile23.setText(nameOfFile23.getFileName());

                textArea22.setVisible(false);
                textArea23.setVisible(false);
                noteName.setText(nameOfFile21.getFileName());
                noteName.setVisible(true);
                textArea21.setVisible(true);

            }
        }
        );

        labelFile22.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectFileCounter22 = 1;
                selectFileCounter21 = 0;
                selectFileCounter23 = 0;

                labelFile22.setText("<html><span bgcolor=\"#969696\">" + nameOfFile22.getFileName() + "</span></html>");
                textArea22.setVisible(true);
                labelFile21.setText(nameOfFile21.getFileName());
                labelFile23.setText(nameOfFile23.getFileName());
                textArea21.setVisible(false);
                textArea23.setVisible(false);
                noteName.setText(nameOfFile22.getFileName());
                noteName.setVisible(true);
                textArea22.setVisible(true);

            }
        }
        );

        labelFile23.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectFileCounter23 = 1;
                selectFileCounter22 = 0;
                selectFileCounter21 = 0;

                labelFile23.setText("<html><span bgcolor=\"#969696\">" + nameOfFile23.getFileName() + "</span></html>");
                textArea23.setVisible(true);
                labelFile22.setText(nameOfFile22.getFileName());
                labelFile21.setText(nameOfFile21.getFileName());
                textArea22.setVisible(false);
                textArea21.setVisible(false);
                noteName.setText(nameOfFile23.getFileName());
                noteName.setVisible(true);
                textArea23.setVisible(true);

            }
        }
        );

        labelFile31.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectFileCounter31 = 1;
                selectFileCounter32 = 0;
                selectFileCounter33 = 0;

                labelFile31.setText("<html><span bgcolor=\"#969696\">" + nameOfFile31.getFileName() + "</span></html>");
                textArea31.setVisible(true);
                labelFile32.setText(nameOfFile32.getFileName());
                labelFile33.setText(nameOfFile33.getFileName());

                textArea32.setVisible(false);
                textArea33.setVisible(false);
                noteName.setText(nameOfFile31.getFileName());
                noteName.setVisible(true);
                textArea31.setVisible(true);

            }
        }
        );

        labelFile32.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectFileCounter32 = 1;
                selectFileCounter31 = 0;
                selectFileCounter33 = 0;

                labelFile32.setText("<html><span bgcolor=\"#969696\">" + nameOfFile32.getFileName() + "</span></html>");
                textArea32.setVisible(true);
                labelFile31.setText(nameOfFile31.getFileName());
                labelFile33.setText(nameOfFile33.getFileName());
                textArea31.setVisible(false);
                textArea33.setVisible(false);
                noteName.setText(nameOfFile32.getFileName());
                noteName.setVisible(true);
                textArea32.setVisible(true);
            }
        }
        );

        labelFile33.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectFileCounter33 = 1;
                selectFileCounter32 = 0;
                selectFileCounter31 = 0;

                labelFile33.setText("<html><span bgcolor=\"#969696\">" + nameOfFile33.getFileName() + "</span></html>");
                textArea33.setVisible(true);
                labelFile32.setText(nameOfFile32.getFileName());
                labelFile31.setText(nameOfFile31.getFileName());
                textArea32.setVisible(false);
                textArea31.setVisible(false);
                noteName.setText(nameOfFile33.getFileName());
                noteName.setVisible(true);
                textArea33.setVisible(true);

            }
        }
        );

        searchButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (searchTextFiled.getText().equals(nameOfFile11.getFileName())) {
                    labelFile21.setVisible(false);
                    labelFile22.setVisible(false);
                    labelFile23.setVisible(false);
                    labelFile11.setVisible(true);
                    labelFile12.setVisible(false);
                    labelFile13.setVisible(false);
                    labelFile31.setVisible(false);
                    labelFile32.setVisible(false);
                    labelFile33.setVisible(false);
                    

                }else searchCounter -=1;
                
                if (searchTextFiled.getText().equals(nameOfFile12.getFileName())) {
                    labelFile21.setVisible(false);
                    labelFile22.setVisible(false);
                    labelFile23.setVisible(false);
                    labelFile11.setVisible(false);
                    labelFile12.setVisible(true);
                    labelFile13.setVisible(false);
                    labelFile31.setVisible(false);
                    labelFile32.setVisible(false);
                    labelFile33.setVisible(false);
                    
                }else searchCounter -=1;
                
                if (searchTextFiled.getText().equals(nameOfFile13.getFileName())) {
                    labelFile21.setVisible(false);
                    labelFile22.setVisible(false);
                    labelFile23.setVisible(false);
                    labelFile11.setVisible(false);
                    labelFile12.setVisible(false);
                    labelFile13.setVisible(true);
                    labelFile31.setVisible(false);
                    labelFile32.setVisible(false);
                    labelFile33.setVisible(false);
                    
                }else searchCounter -=1;
                
                if (searchTextFiled.getText().equals(nameOfFile21.getFileName())) {
                    labelFile21.setVisible(true);
                    labelFile22.setVisible(false);
                    labelFile23.setVisible(false);
                    labelFile11.setVisible(false);
                    labelFile12.setVisible(false);
                    labelFile13.setVisible(false);
                    labelFile31.setVisible(false);
                    labelFile32.setVisible(false);
                    labelFile33.setVisible(false);
                    
                }else searchCounter -=1;
                
                if (searchTextFiled.getText().equals(nameOfFile22.getFileName())) {
                    labelFile21.setVisible(false);
                    labelFile22.setVisible(true);
                    labelFile23.setVisible(false);
                    labelFile11.setVisible(false);
                    labelFile12.setVisible(false);
                    labelFile13.setVisible(false);
                    labelFile31.setVisible(false);
                    labelFile32.setVisible(false);
                    labelFile33.setVisible(false);
                   
                }else searchCounter -=1;
                
                if (searchTextFiled.getText().equals(nameOfFile23.getFileName())) {
                    labelFile21.setVisible(false);
                    labelFile22.setVisible(false);
                    labelFile23.setVisible(true);
                    labelFile11.setVisible(false);
                    labelFile12.setVisible(false);
                    labelFile13.setVisible(false);
                    labelFile31.setVisible(false);
                    labelFile32.setVisible(false);
                    labelFile33.setVisible(false);
                    
                }else searchCounter -=1;
                
                if (searchTextFiled.getText().equals(nameOfFile31.getFileName())) {
                    labelFile21.setVisible(false);
                    labelFile22.setVisible(false);
                    labelFile23.setVisible(false);
                    labelFile11.setVisible(false);
                    labelFile12.setVisible(false);
                    labelFile13.setVisible(false);
                    labelFile31.setVisible(true);
                    labelFile32.setVisible(false);
                    labelFile33.setVisible(false);
                }else searchCounter -=1;
                
                if (searchTextFiled.getText().equals(nameOfFile32.getFileName())) {
                    labelFile21.setVisible(false);
                    labelFile22.setVisible(false);
                    labelFile23.setVisible(false);
                    labelFile11.setVisible(false);
                    labelFile12.setVisible(false);
                    labelFile13.setVisible(false);
                    labelFile31.setVisible(false);
                    labelFile32.setVisible(true);
                    labelFile33.setVisible(false);
                    
                }else searchCounter -=1;
                
                if (searchTextFiled.getText().equals(nameOfFile33.getFileName())) {
                    labelFile21.setVisible(false);
                    labelFile22.setVisible(false);
                    labelFile23.setVisible(false);
                    labelFile11.setVisible(false);
                    labelFile12.setVisible(false);
                    labelFile13.setVisible(false);
                    labelFile31.setVisible(false);
                    labelFile32.setVisible(false);
                    labelFile33.setVisible(true);
                    
                }
                else{
                    searchCounter -=1;
                }
                if(searchCounter>9 || searchCounter !=0){
                    searchCounter=9;
                }
                
                if(searchCounter == 0){
                    JOptionPane.showMessageDialog(frame, "The File not Found !" , "search", JOptionPane.INFORMATION_MESSAGE);
                    
                }

            }
        }
        );
    }

    /**
     *
     * @param
     */
    public static void main(String[] args) {
        new GUI();
    }
}

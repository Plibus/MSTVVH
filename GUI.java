import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GUI extends javax.swing.JFrame {
	
	public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
	
    public GUI() {
        initComponents();
    }
                   
    private void initComponents() {
    	setTitle("Bulk Helper");  
    	availsOut.deleteOnExit();
    	
    	availsFileChooser = new javax.swing.JFileChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        bulkPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        displayDataTable = new javax.swing.JTable();
        providerComboBox = new javax.swing.JComboBox<>();
        bulktypeComboBox = new javax.swing.JComboBox<>();
        importAvailsButton = new javax.swing.JButton();
        exportBulkButton = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();
        createBulkButton = new javax.swing.JButton();
        validateBulkButton = new javax.swing.JButton();
        newContentOwnerComboBox = new javax.swing.JComboBox<>();
        newStudioTextField = new javax.swing.JTextField();
        newNetworkTextField = new javax.swing.JTextField();
        applyStudioAndNetworkButton = new javax.swing.JButton();
        newContentOwnerLabel = new javax.swing.JLabel();
        newStudioLabel = new javax.swing.JLabel();
        newNetworkLabel = new javax.swing.JLabel();
        editTemplateButton = new javax.swing.JButton();
        specialRulesButton = new javax.swing.JButton();
        seasonPassPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);
        jTextArea2.setEditable(false);
        jScrollPane2.setViewportView(jTextArea2);
        
        PrintStream printStream = new PrintStream(new CustomOutputStream(jTextArea2));
        
        // keeps reference of standard output stream
        setStandardOut(System.out);
        // re-assigns standard output stream and error output stream
        System.setOut(printStream);
        System.setErr(printStream);
        

        model = new javax.swing.table.DefaultTableModel(dealCreationHeaders, 0);
            displayDataTable.setModel(model);
            displayDataTable.setColumnSelectionAllowed(true);
            displayDataTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            jScrollPane4.setViewportView(displayDataTable);

            providerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(ContentOwnersArray));
            providerComboBox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    providerComboBoxActionPerformed(evt);
                }
            });

            bulktypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deal Creation", "Deal Extension", "Deal Take Down", "Liscensor Change", "Product Creation" }));
            bulktypeComboBox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bulktypeComboBoxActionPerformed(evt);
                }
            });

            importAvailsButton.setText("Import Avails");
            importAvailsButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    importAvailsButtonActionPerformed(evt);
                }
            });

            exportBulkButton.setText("Export Bulk");
            exportBulkButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    exportBulkButtonActionPerformed(evt);
                }
            });

            createBulkButton.setText("Create Bulk");
            createBulkButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    createBulkButtonActionPerformed(evt);
                }
            });

            validateBulkButton.setText("Validate Bulk");
            validateBulkButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    validateBulkButtonActionPerformed(evt);
                }
            });

            newContentOwnerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(ContentOwnersArray));
            newContentOwnerComboBox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    newContentOwnerComboBoxActionPerformed(evt);
                }
            });

            newStudioTextField.setText("New Studio");

            newNetworkTextField.setText("New Network");

            applyStudioAndNetworkButton.setText("Apply Studio/Network");
            applyStudioAndNetworkButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    applyStudioAndNetworkButtonActionPerformed(evt);
                }
            });

            newContentOwnerLabel.setText("New Content Owner");

            newStudioLabel.setText("New Studio:");

            newNetworkLabel.setText("New Network:");

            editTemplateButton.setText("Edit Template");
            editTemplateButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    editTemplateButtonActionPerformed(evt);
                }
            });

            specialRulesButton.setText("Special Rules");
            specialRulesButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    specialRulesButtonActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout bulkPanelLayout = new javax.swing.GroupLayout(bulkPanel);
            bulkPanel.setLayout(bulkPanelLayout);
            bulkPanelLayout.setHorizontalGroup(
                bulkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2)
                .addGroup(bulkPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(bulkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bulkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newContentOwnerLabel)
                            .addGroup(bulkPanelLayout.createSequentialGroup()
                                .addComponent(newNetworkLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newNetworkTextField))
                            .addComponent(exportBulkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(providerComboBox, 0, 0, Short.MAX_VALUE)
                            .addComponent(progressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newContentOwnerComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                            .addComponent(applyStudioAndNetworkButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(bulkPanelLayout.createSequentialGroup()
                                .addComponent(newStudioLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newStudioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bulktypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(validateBulkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(importAvailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(specialRulesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bulkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editTemplateButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createBulkButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))
            );
            bulkPanelLayout.setVerticalGroup(
                bulkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bulkPanelLayout.createSequentialGroup()
                    .addGroup(bulkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bulkPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(providerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bulktypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(importAvailsButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(createBulkButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(validateBulkButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(editTemplateButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(specialRulesButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newContentOwnerLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(newContentOwnerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(bulkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(newStudioLabel)
                                .addComponent(newStudioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(bulkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(newNetworkLabel)
                                .addComponent(newNetworkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(applyStudioAndNetworkButton)
                            .addGap(73, 73, 73)
                            .addComponent(exportBulkButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            jTabbedPane1.addTab("Bulk", bulkPanel);

            jTextArea1.setColumns(20);
            jTextArea1.setRows(5);
            jScrollPane1.setViewportView(jTextArea1);

            javax.swing.GroupLayout seasonPassPanelLayout = new javax.swing.GroupLayout(seasonPassPanel);
            seasonPassPanel.setLayout(seasonPassPanelLayout);
            seasonPassPanelLayout.setHorizontalGroup(
                seasonPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
            );
            seasonPassPanelLayout.setVerticalGroup(
                seasonPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seasonPassPanelLayout.createSequentialGroup()
                    .addGap(0, 489, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            jTabbedPane1.addTab("Season Pass Calculator", seasonPassPanel);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1)
            );

            pack();
        }                 
    
    //Button Actions
    
    //Import Avails
    private void importAvailsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    	int returnVal = availsFileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
        	availsIn = availsFileChooser.getSelectedFile();
            try {
                System.out.println("File Accessed " + availsIn.getAbsolutePath());
                avails.excelToCSV(availsIn, availsOut);
            } catch (Exception e) {
                System.out.println("problem accessing file: " + availsIn.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }
    
    //Create Bulk
    private void createBulkButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	String name = modifyName(selectedProvider);
    	if (avails.getAvailsFile() != null) {
        	if (avails.locateTemplate(name)) {
        		data = avails.readAvails();
        		products = new ArrayList<Entry>();
        	} else {	
        		EditTemplate createTemplate = new EditTemplate(availsOut, name, avails.getTemplateName(), false);
        		avails.setIndex(createTemplate.getIndexData());
        		if (avails.locateTemplate(name)) {
        			data = avails.readAvails();
        			products = new ArrayList<Entry>();
        		} else {
        			System.out.println("Error in template creation");
        		}
        	}
    	} else {
    		System.out.println("No file selected. Please select a file.");
    	}
    	if (data != null) {
        	populateJTable();
        }
    }
    
    //Validate Bulk
    private void validateBulkButtonActionPerformed(ActionEvent evt) {
		if (data != null) {
			validateAvails();
    		populateJTable();
        }
	}
    
    //Edit Template
    private void editTemplateButtonActionPerformed(ActionEvent evt) {
    	if (avails.getTemplateName() != null) {
	    	String name = modifyName(selectedProvider);
	    	EditTemplate editTemplate = new EditTemplate(availsOut, name, avails.getTemplateName(), true, avails.getIndex(), avails.getStart());
			avails.setIndex(editTemplate.getIndexData());
    	} else {
    		System.out.println("No file selected. Please select a file.");
    	}
	}
    
    //Special Rules
    private void specialRulesButtonActionPerformed(ActionEvent evt) {
    	@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox specialRulesComboBox = new JComboBox(specialRules);
    	JOptionPane.showMessageDialog(  null,
    									specialRulesComboBox, 
    									"Rules", 
    									JOptionPane.QUESTION_MESSAGE);
    	
    	JPanel rulesPanel = new JPanel(new GridBagLayout());
        rulesPanel.add(specialRulesComboBox);
        specialRuleSelected = specialRulesComboBox.getSelectedIndex();
        runSpecialRule();
	}
    
    //Apply Studio/Network
    private void applyStudioAndNetworkButtonActionPerformed(ActionEvent evt) {
    	selectedNewNetwork = newNetworkTextField.getText();
    	selectedNewStudio = newStudioTextField.getText();
    	if (data != null) {
    		for (int i = 0; i < data.size(); i++) {
    			data.get(i).setNewNetwork(selectedNewNetwork);
    			data.get(i).setNewStudio(selectedNewStudio);
    		}
    		if (selectedBulkType.contentEquals("Product Creation")) {
	        	 if (products.isEmpty()) {
	        		 validateAvails();
	        	 }
       	 	}
        	populateJTable();
    	}
	}
    
    //Export Bulk
    private void exportBulkButtonActionPerformed(ActionEvent evt) {
    	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy-HHmm");  
        Date date = new Date();  
    	String baseFileName = selectedProvider + selectedBulkType;
    	baseFileName = baseFileName.replaceAll(" ", "");
    	baseFileName += formatter.format(date);
    	String filePath = System.getProperty("user.home") + "\\OneDrive - Microsoft\\Desktop";
		try {
            String filename = filePath + "\\" + baseFileName + ".xlsx";
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Template");  
            XSSFRow hRow = sheet.createRow(0);
            for (int i = 0; i < bulkTypeHeaders[bulktypeComboBox.getSelectedIndex()].length; i++) {
            	hRow.createCell(i).setCellValue(bulkTypeHeaders[bulktypeComboBox.getSelectedIndex()][i]);	
            }
            	
            for (int j = 0; j < displayDataTable.getRowCount(); j++) {
            	XSSFRow row = sheet.createRow(j + 1);
            	for (int i = 0; i < displayDataTable.getColumnCount(); i++) {
            		String info = displayDataTable.getModel().getValueAt(j, i).toString();
            		row.createCell(i).setCellValue(info);
            	}
            }
            FileOutputStream fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();

        } catch ( Exception ex ) {
            System.out.println("Error in exporting");
        }	
	}
    
    //Combobox Assignments
    
    //Provider
    private void providerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        selectedProvider = (String)providerComboBox.getSelectedItem();
    }
    
    //BulkType
    private void bulktypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                 
    	 selectedBulkType = (String)bulktypeComboBox.getSelectedItem();
         int i = bulktypeComboBox.getSelectedIndex();
         
         model.setRowCount(0);
         model.setColumnCount(0);
         
         for (int j = 0; j < bulkTypeHeaders[i].length; j++) {
         	model.addColumn(bulkTypeHeaders[i][j]);
         }
         if (data != null) {
        	 if (selectedBulkType.contentEquals("Product Creation")) {
	        	 if (products.isEmpty()) {
	        		 validateAvails();
	        	 }
        	 }
         	populateJTable();
         }
    }
    
    //New Content Owner
    private void newContentOwnerComboBoxActionPerformed(ActionEvent evt) {
    	selectedNewProvider = (String)newContentOwnerComboBox.getSelectedItem();	
    	if (data != null) {
    		for (int i = 0; i < data.size(); i++) {
    			data.get(i).setNewContentOwner(selectedNewProvider);
    		}	
    	}
	}
    
    public void populateJTable() {
    	if (data != null) {
	    	model.setRowCount(0);
	    	if (selectedBulkType == "Deal Creation") {
	       		for (int i = 0; i < data.size(); i++) {
	       			String seasonNumb = "";
	   				if (data.get(i).getSeasonnumber() != -1) {
	   					seasonNumb += data.get(i).getSeasonnumber();
	   				}
	   				String episodeNumb = "";
	   				if (data.get(i).getEpisodenumber() != -1) {
	   					episodeNumb += data.get(i).getEpisodenumber();;
	   				}
	       			model.addRow(new Object[]{ data.get(i).getPID(),
	       									   data.get(i).getTitle(),
	       									   data.get(i).getVersionTitle(),
	       									   data.get(i).getProductType(),
	       									   data.get(i).getSerieTitle(),
	       									   seasonNumb,
	       									   episodeNumb,
	       									   data.get(i).getContentOwner(),
	       									   data.get(i).getRight(),
	       									   data.get(i).getLicensor(),
	       									   data.get(i).getCountry(),
	       									   df.format(data.get(i).getStartDate().getTime()),
	       									   df.format(data.get(i).getEndDate().getTime()),
	       									   df.format(data.get(i).getStreetDate().getTime()),
	       									   data.get(i).getTier(),
	       									   data.get(i).getExternalId1(),
	       									   data.get(i).getExternalId2(),
	       									   data.get(i).getWholesaleprice(),
	       									   data.get(i).getRetailprice()
	       			});
	       		}
	   		} else if (selectedBulkType == "Deal Extension") {
	   			for (int i = 0; i < data.size(); i++) {
	   				String seasonNumb = "";
	   				if (data.get(i).getSeasonnumber() != -1) {
	   					seasonNumb += data.get(i).getSeasonnumber();
	   				}
	   				String episodeNumb = "";
	   				if (data.get(i).getEpisodenumber() != -1) {
	   					episodeNumb += data.get(i).getEpisodenumber();;
	   				}
	   				model.addRow(new Object[]{ data.get(i).getPID(),
	   										   data.get(i).getTitle(),
	   										   data.get(i).getVersionTitle(),
											   data.get(i).getProductType(),
											   data.get(i).getSerieTitle(),
											   seasonNumb,
											   episodeNumb,
											   data.get(i).getContentOwner(),
											   data.get(i).getLicensor(),
											   data.get(i).getCountry(),
											   data.get(i).getRight(),
											   df.format(data.get(i).getEndDate().getTime())
					});
	   			}
	   		}  else if (selectedBulkType == "Liscensor Change") {
	   			for (int i = 0; i < data.size(); i++) {
	   				String seasonNumb = "";
	   				if (data.get(i).getSeasonnumber() != -1) {
	   					seasonNumb += data.get(i).getSeasonnumber();
	   				}
	   				String episodeNumb = "";
	   				if (data.get(i).getEpisodenumber() != -1) {
	   					episodeNumb += data.get(i).getEpisodenumber();;
	   				}
	   				model.addRow(new Object[]{ data.get(i).getPID(),										   
											   data.get(i).getTitle(),
											   data.get(i).getVersionTitle(),
											   data.get(i).getProductType(),
											   data.get(i).getSerieTitle(),
											   seasonNumb,
											   episodeNumb,
											   data.get(i).getContentOwner(),
											   data.get(i).getNewContentOwner(),
											   data.get(i).getNewStudio(),
											   data.get(i).getNewNetwork()
					});
	   			}
	   		}  else if (selectedBulkType == "Product Creation") {
	   			for (int i = 0; i < products.size(); i++) {
	   				String position = "";
	   				if (products.get(i).getPosition() != -1) {
	   					position += products.get(i).getPosition();
	   				}
	   				model.addRow(new Object[]{ products.get(i).getTitle(),
						   					   products.get(i).getVersionTitle(),
						   					   products.get(i).getProductType(),
						   					   products.get(i).getPID(),
						   					   products.get(i).getContentOwner(),
						   					   position,
						   					   products.get(i).getStudio(),
											   df.format(products.get(i).getReleaseDate().getTime()),
											   products.get(i).getCountry(),
											   products.get(i).getPriority(),
											   products.get(i).getISAN(),
											   products.get(i).getEIDR()
	   				});
	   			}
	   		}  else if (selectedBulkType == "Deal Take Down") {
	   			for (int i = 0; i < data.size(); i++) {
	   				String seasonNumb = "";
	   				if (data.get(i).getSeasonnumber() != -1) {
	   					seasonNumb += data.get(i).getSeasonnumber();
	   				}
	   				String episodeNumb = "";
	   				if (data.get(i).getEpisodenumber() != -1) {
	   					episodeNumb += data.get(i).getEpisodenumber();;
	   				}
	   				model.addRow(new Object[]{ data.get(i).getPID(),
	   										   data.get(i).getTitle(),
	   										   data.get(i).getVersionTitle(),
											   data.get(i).getProductType(),
											   data.get(i).getSerieTitle(),
											   seasonNumb,
											   episodeNumb,
											   data.get(i).getContentOwner(),
											   data.get(i).getLicensor(),
											   data.get(i).getCountry(),
											   data.get(i).getRight(),
											   df.format(data.get(i).getEndDate().getTime())
	   				});
	   			}
	   		} else {
	   			System.out.println("unable to populate table");
	   		}
    	}  else {
   			System.out.println("unable to populate table");
   		}
    }
    
    private void validateAvails() {
    	if (selectedBulkType == "Product Creation") {
    		//System.out.println("Validating Product Creation");
    		for (int i = 0; i < data.size(); i++) {
				validateProductCreation(data.get(i));
			}
    	} else {
    		liscensors = new Liscensors(selectedProvider);
	    	for (int i = 0; i < data.size(); i++) {
	    		validate(data.get(i));
			}
    	}
    }
    
    private void validate(Entry e) {
    	validateLicenseType(e);  		
		validateFormatProfile(e);
		validateRights(e);
		validateTierAndLiscensor(e);
		e.setContentOwner(selectedProvider);
    }
     
    private void validateLicenseType(Entry e) {
		Entry estE = null;
		if (e.getLicenseType().contains("VOD") || e.getLicenseType().contains("PPV")) {
			if (e.getLicenseType().contains("DTO") || e.getLicenseType().contains("EST")) {
				estE = new Entry(e);
				estE.setLicenseType("DTO");
			}
			e.setLicenseType("Video Rent");
		} else if (e.getLicenseType().contains("EST") || e.getLicenseType().contains("DTO")) {
			e.setLicenseType("Video DTO");
		} else {
			//System.out.println(e.getLicenseType() + " is an invalid liscense type");
			e.setLicenseType("Invalid");
		}
		if (estE != null) {
			data.add(estE);
		}
    }
    
    private void validateFormatProfile(Entry e) {
    	Entry hdE = null;
    	if (e.getFormatProfile().contains("SD")) {
			if (e.getFormatProfile().contains("HD")) {
				if (!e.getFormatProfile().contains("UHD")) {
					hdE = new Entry(e);
					hdE.setFormatProfile("HD");				
				} else {
					hdE = new Entry(e);
					hdE.setFormatProfile("UHD");
				}
			}
			e.setFormatProfile("SD");
		} else if (e.getFormatProfile().contains("HD") && !e.getFormatProfile().contains("UHD")) {
			e.setFormatProfile("HD");
		} else if (e.getFormatProfile().contains("UHD")) {
			e.setFormatProfile("UHD");
		} else {
			//System.out.println(e.getFormatProfile() + " is an invalid liscense type");
			e.setFormatProfile("Invalid");
		}
    	if (hdE != null) {
			data.add(hdE);
		}
    }
    
    private void validateRights(Entry e) {
		e.setRight(e.getLicenseType() + " " + e.getFormatProfile());
	}
    
    private void validateTierAndLiscensor(Entry e) {
    	int countryIndex = -1;
    	for (int i = 0; i < countries.length; i++) {
    		if (e.getCountry().contentEquals(countries[i])) {
    			countryIndex = i;
    			if (e.getProductType().contentEquals("TV Episode")) {
        			countryIndex += 20;
    			}
    			break;
    		}
    	}
    	if (countryIndex != -1) {
    		Tier tier = null;
    		if (e.getPriceType().contentEquals("WSP")) {
   				tier = liscensors.getTierByPrice(countryIndex, e.getRight(), e.getWholesaleprice());
   				if (tier != null) {
   					e.setLicensor(tier.getliscensor());
   					e.setTier(tier.gettierName());
   					e.setWholesaleprice(tier.getWsp());
   					e.setRetailprice(tier.getRtp());
   				} else {
   					tier = liscensors.getTierByName(countryIndex, e.getRight(), e.getTier());
   	   				if (tier != null) {
   	   					e.setLicensor(tier.getliscensor());
   	   					e.setTier(tier.gettierName());
   	   					e.setWholesaleprice(tier.getWsp());
   	   					e.setRetailprice(tier.getRtp());
   	   				} else {
   	    				e.setErrorString(e.getErrorString() + "Cannot locate tier by name");
   	    			}
   				}
   			} else {
   				if (!e.getTier().contentEquals("")) {
   					tier = liscensors.getTierByName(countryIndex, e.getRight(), e.getTier());
   				}
   				if (tier != null) {
   					e.setLicensor(tier.getliscensor());
   					e.setTier(tier.gettierName());
   					e.setWholesaleprice(tier.getWsp());
   					e.setRetailprice(tier.getRtp());
   				} else {
   					if (e.getWholesaleprice() != -1) {
	   					tier = liscensors.getTierByPrice(countryIndex, e.getRight(), e.getWholesaleprice());
	   	   				if (tier != null) {
	   	   					e.setLicensor(tier.getliscensor());
	   	   					e.setTier(tier.gettierName());
	   	   					e.setWholesaleprice(tier.getWsp());
	   	   					e.setRetailprice(tier.getRtp());
	   	   				} else {
	   	   					e.setErrorString(e.getErrorString() + "Cannot locate tier for provided wholesale price");
	   	   				}
   	   				} else {
   	   					e.setErrorString(e.getErrorString() + "Cannot locate tier because wholesale price is not populated");
   	   				}
    			}
    		}
    	} else {
    		e.setErrorString(e.getErrorString() + "Cannot locate country");
    	}
    }
    
    private void validateProductCreation(Entry e) {
    	boolean prodExists = false;
    	int indexOfProd = 0;
    	for (int i = 0; i < products.size(); i++) {
    		if (e.getTitle().contentEquals(products.get(i).getTitle())) {
    			if (e.getPID().contentEquals(products.get(i).getPID())) {
    				prodExists = true;
    				indexOfProd = i;
    				break;
    			}
    		}
    	}
    	if (prodExists) {
    		if (!products.get(indexOfProd).getCountry().contains(e.getCountry())) {
    			products.get(indexOfProd).setCountry(products.get(indexOfProd).getCountry() + ", " + e.getCountry());
    		}
    		if (products.get(indexOfProd).getStartDate().compareTo(e.getStartDate()) >= 0) {
    			products.get(indexOfProd).setStreetDate(e.getStartDate());
    		}
    	} else {
    		products.add(new Entry(e));
    	}
    }
    
    private String modifyName(String provider) {
		String fileN;
		int length = provider.length();
		if (length <= 10) {
			return provider;	
		}
		fileN = provider.substring(0, 3);
		if (fileN.contentEquals("The")) {
			fileN = provider.substring(4, 9);
			return provider;
		}
		fileN = provider.substring(0, 9);
		return fileN;
	}
    
    private void runSpecialRule() {
    	if (specialRuleSelected == 0) {
    		
    	} else if (specialRuleSelected == 1) { // ATEN PID clipping
    		for (int i = 0; i < data.size(); i++) {
    			int underscorIndex = data.get(i).getPID().indexOf("_");
    			if (underscorIndex != -1) {
    				String tempPID = data.get(i).getPID().substring(0, underscorIndex);
    				data.get(i).setExternalId1(data.get(i).getPID());
    				data.get(i).setPID(tempPID);
    			}
			}
    	} else if (specialRuleSelected == 2) { // Prices in two columns
    		javax.swing.JLabel jLabel1 = new javax.swing.JLabel("Select HD Column");
    		javax.swing.JLabel jLabel2 = new javax.swing.JLabel("Select SD Column");
    		@SuppressWarnings({ "rawtypes", "unchecked" })
			JComboBox searchColumnComboBox1 = new JComboBox(templateSearchData);
    		@SuppressWarnings({ "rawtypes", "unchecked" })
			JComboBox searchColumnComboBox2 = new JComboBox(templateSearchData);
            JPanel dropPanel = new JPanel(new GridLayout(2,2));
        	dropPanel.add(jLabel1);
        	dropPanel.add(searchColumnComboBox1);
        	dropPanel.add(jLabel2);
        	dropPanel.add(searchColumnComboBox2);
        	
        	int result = JOptionPane.showConfirmDialog( null,
        											    dropPanel,
        											    "HD and SD Columns Selector", 
        											    JOptionPane.OK_CANCEL_OPTION,
        											    JOptionPane.PLAIN_MESSAGE);
        	
        	if (result == 0) {
        		data = avails.readAvails();
        		products = new ArrayList<Entry>();
        		Entry entry = null;
        		int hdIndex = searchColumnComboBox1.getSelectedIndex() - 1;
        		int sdIndex = searchColumnComboBox2.getSelectedIndex() - 1;
        		BufferedReader reader;
    	        String splitBy = ",";
    			String currentLine;
    			try {
    				reader = new BufferedReader(new FileReader(availsOut));
    				int rowNumb = 0;
    				while((currentLine = reader.readLine()) != null) {
    					if (rowNumb > avails.getStart()) {
    		        		String[] row = currentLine.split(splitBy);
    		        		if (sdIndex < row.length) {
    		        			data.get(rowNumb - avails.getStart() - 1).setWholesaleprice(row[sdIndex]);
    		        			data.get(rowNumb - avails.getStart() - 1).setFormatProfile("SD");	
    		        		}
    		        		if (hdIndex < row.length) {
    		        			entry = new Entry(data.get(rowNumb - avails.getStart() - 1));
    		        			entry.setFormatProfile("HD");	
    		        			entry.setWholesaleprice(row[hdIndex]);
    		        			data.add(entry);
    		        		}
    					}
    				    rowNumb++;
    				}
    				reader.close(); 
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
        	}
    	} else {
    		System.out.println("Error in Special Rules");
    	}
    	populateJTable();
    }
    
	public PrintStream getStandardOut() {
		return standardOut;
	}

	public void setStandardOut(PrintStream standardOut) {
		this.standardOut = standardOut;
	}  
                  
    private javax.swing.JButton applyStudioAndNetworkButton;
    private javax.swing.JFileChooser availsFileChooser;
    private javax.swing.JPanel bulkPanel;
    private javax.swing.JComboBox<String> bulktypeComboBox;
    private javax.swing.JButton createBulkButton;
    private javax.swing.JTable displayDataTable;
    private javax.swing.JButton editTemplateButton;
    private javax.swing.JButton exportBulkButton;
    private javax.swing.JButton importAvailsButton;
    private javax.swing.JButton specialRulesButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JComboBox<String> newContentOwnerComboBox;
    private javax.swing.JLabel newContentOwnerLabel;
    private javax.swing.JLabel newNetworkLabel;
    private javax.swing.JTextField newNetworkTextField;
    private javax.swing.JLabel newStudioLabel;
    private javax.swing.JTextField newStudioTextField;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JComboBox<String> providerComboBox;
    private javax.swing.JPanel seasonPassPanel;
    private javax.swing.JButton validateBulkButton;
    private DefaultTableModel model = new javax.swing.table.DefaultTableModel();
    
    private String selectedBulkType = "Deal Creation";
    private String selectedProvider = "2GDigital";
    
    private String selectedNewProvider = "2GDigital";
    private String selectedNewStudio = "New Studio";
    private String selectedNewNetwork  = "New Network";
    private String[] dealCreationHeaders = new String[] {
    		"PID", "Title", "Version Title", "Product Type", "Serie Name", "Season Number", "Episode Number", "Content Owner", "Right", "Licensor", "Country", "Start Date", "End Date", "Street Date", "Tier", "ExternalId 1", "ExternalId 2", "Wholesale price", "Retail price"
    };
    private String[] dealExtensionHeaders = new String[] {"PID", "Title", "Version Title", "Product Type", "Series Name", "Season Number", "Episode Number", "Content Owner", "Licensor", "Country", "Right", "New End Date"};
    private String[] dealTakeDownHeaders = new String[] {"PID", "Title", "Version Title", "Product Type", "Series Name", "Season Number", "Episode Number", "Content Owner", "Licensor", "Country", "Right", "New End Date"};
    private String[] licensorChangeHeaders = new String[] {"PID", "Title", "Version Title", "Product Type", "Serie Name", "Season number", "Episode number", "Content Owner", "New Content Owner", "New Studio ", "New Network"};
    private String[] productCreationHeaders = new String[] {"Title", "Version Title", "Product Type", "PID", "ContentOwner", "Position" , "Studio", "Release Date", "Countries", "Priority", "ISAN", "EIDR"};
    private String[][] bulkTypeHeaders = new String[][] {dealCreationHeaders,  dealExtensionHeaders, dealTakeDownHeaders, licensorChangeHeaders, productCreationHeaders};

    DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
    private PrintStream standardOut;
    
    private File availsIn;
    private File availsOut = new File(System.getProperty("user.home") + "\\tmpAvails.csv");
    public Avails avails = new Avails();
    public ArrayList<Entry> products = new ArrayList<Entry>();
    private ArrayList<Entry> data;
    
    private static final long serialVersionUID = 1L;
    private String[] ContentOwnersArray = new String[] { "20th Century Fox", "343 Industries", "A Contracorriente Films S.L.", "A24", "Aardman Studios", 
    													 
    													 "Ace Entertainment", "ADV Films", "AETN", "AFilm", "Alliance Films", "AMC", "Aurum", "Australian Broadcasting Corporation", 
    													 
    													 "BandaiChannel", "BBC", "BET", "Big Air Studios", "Big Balls", "Blue Sky Film Distribution a.s.", "Brainstorm Media Inc", "Bridge Rights B.V.", 
    													 
    													 "CALD", "Canada's Olympic Broadcast Media Consortium", "Canadian Broadcasting Corporation", "CAVD", "CBC", "CBS", 
    													 "CDC United", "Celestial", "Cinedigm", "Cinetel Kft", "Comcast", "Comic-Con", "Constantin", "Content Media Corporation", "Crunchyroll", 
    													 
    													 "Dare Productions Limited", "Discovery Channel", "Do&Co Digital bv", "Dogwoof", "DramaFever", "Dutch Film Works", 
    													 "Electric Distribution Inc.", "Elevation Pictures", "Elite Film AG", "Ellation", "Encripta", "Entertainment One U.S. LP", 
    													 "Entertainment Studios Motion Pictures", "Eros International", "ESPN", "EuropaCorp", 
    													 
    													 "Feelgood Entertainment S.A.", "Film Europe", "First International Production", "France Television", "Freestyle Digital Media", "FUNimation", 
    													 
    													 "Gaiam", "Gaumont", "Giant Interactive LLC", "GoDigital", "Gravitas Ventures", "Gunpowder & Sky Distribution", "Gussi Film", "Gussi Films", 
    													 
    													 "HBO", "HDFILMS INC", "HDNet", 
    													 "Icon Film Distribution Ltd.", "IFC in Theaters LLC", "Image Entertainment", "Inception Media Group", "Independent Distributor", "Infamous", 
    													 "Infinite Frontiers, LLC", "Italia Film International", "ITV", 
    													 
    													 "Juice",
    													 
    													 "Koch Media", "KSM GmbH",
    													 
    													 "Lantern Lane", "Ledafilms", "Lionsgate", "Lucky Red", "Lumiere Publishing",
    													 
    													 "Madman Entertainment", "Magnolia Pictures", "Major League Gaming", "Manga Entertainment", "Marvel Entertainment, Inc.", 
    													 "Media Blasters", "Metrodome", "MGM", "Microsoft", "Microsoft .360", "Millennium Entertainment", "Minerva Pictures", 
    													 "MLB.com", "Mongrel Media", "MPI", "MTVN", "My Digital Company", 
    													 
    													 "National Geographic", "National Lampoon", "NFL", "NHL Interactive CyberEnterprises, LLC", "Nordisk Film", 
    													 
    													 "Orchard Enterprises NY, Inc.", "ORF", "Oscilloscope Laboratories", 
    													 
    													 "Paramount", "Pathe Distribution", "PBS", "Phase 4 Films (USA), LLC", "Pinnacle Films", "Premiere Digital", 
    													 
    													 "RAI", "RC Release Company GmbH", "Relativity Media", "Revolver Entertainment", "Roadshow", "Rooster Teeth Productions, LLC.", "RTE", 
    													 
    													 "Scanbox", "Scott Entertainment", "Screen Media", "Scripps Networks, LLC", "Shout! Factory", "Showtime", "SIC", "Signature Entertainment", 
    													 "Slamdance, Inc.", "SnagFilms, Inc.", "Societe Nouvelle de Distribution", "Sony Pictures", "Special Broadcasting Service", "Stadium Media LLC",
    													 "Starz Media, LLC", "StudioCanal", "STX Entertainment", "Sundance Channel L.L.C.", "Svensk Home Entertainment/ SF", "Sweet Chili Entertainment", 
    													 "Syndicado",
    													 
    													 "Televisa", "TF1 Video", "The Asylum", "The Independent Film Channel, L.L.C.", "The Jim Henson Company", "The Movie Partnership Limited", 
    													 "The Paley Center for Media", "The Weinstein Company", "TNA", "Toei Animation Inc.", "Tokyo Broadcasting System Television, Inc.", "Troma", "Turner", 
    													 
    													 "UFC", "Under the Milky Way", "Universal", "UniversCine",
    													 
    													 "Vertical Entertainment LLC", "Vértice Cine, S.L.", "Vertigo", "VIZ media", "VVS Films",
    													 
    													 "Walt Disney Pictures", "Warner Bros.", "WE: Women's Entertainment", "Well Go USA, Inc.", "WildSide Video", "WME", "World Events Productions", 
    													 
    													 "Xbox Entertainment Studios", "Xbox Live Productions"};
    
    private String[] countries = new String[] {"US", "BR", "MX", "CA", "AU", "NZ", "AT", "BE", "DK", "FI", "FR", "DE", "IE", "IT", "NL", "NO", "ES", "SE", "CH", "GB"};
    
    String[] specialRules = new String[] {"", "AETN PID clipping", "SD and HD prices are in two different columns", "Season title is in different column than episode title: NOT CREATED"}; 
    		
    private String[] templateSearchData = new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
    													 "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
    													 "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", 
    													 "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", 
    													 "AQ", "AX", "AY", "AZ", "BA", "BB", "BC", "BD", "BE", "BF", "BG", 
    													 "BH", "BI", "BJ", "BK", "BL", "BM", "BN", "BO", "BP", "BQ", "BR", 
    													 "BS", "BT", "BU", "BV", "BW", "BX", "BY", "BZ" };
    
    Liscensors liscensors;
    
    Object lock = new Object();
    
    int specialRuleSelected = 0;	
	
}
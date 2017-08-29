/*******************************************************************************
* File:       CarsDisplay.java
* Programmer: Uriel Salazar
* Date:       May 24, 2017
* Course:     CSC-18B
* Purpose:    Create a GUI for the Cars Database
*******************************************************************************/

//package class
package carsdatabase;

//import packages
import java.util.List;
import javax.swing.JOptionPane;

//declare class
public class CarsDisplay extends javax.swing.JFrame
{

    //constructor
    public CarsDisplay()
    {
        super("Cars");
        
        //establish database connection and set up PreparedStatements
        carQueries = new CarQueries();
        
        /**
         * call method "initComponents"
         * initializes GUI components
         */
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

        previousButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        ofLabel = new javax.swing.JLabel();
        carIDTextField = new javax.swing.JTextField();
        carIDLabel = new javax.swing.JLabel();
        carMakeLabel = new javax.swing.JLabel();
        carMakeTextField = new javax.swing.JTextField();
        carModelLabel = new javax.swing.JLabel();
        carModelTextField = new javax.swing.JTextField();
        carYearLabel = new javax.swing.JLabel();
        carYearTextField = new javax.swing.JTextField();
        carMileageLabel = new javax.swing.JLabel();
        carMileageTextField = new javax.swing.JTextField();
        navigatePanel = new javax.swing.JPanel();
        carModelLabel2 = new javax.swing.JLabel();
        carModelTextField2 = new javax.swing.JTextField();
        findButton = new javax.swing.JButton();
        indexTextField = new javax.swing.JTextField();
        maxTextField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        insertButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cars Database");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        previousButton.setText("Previous");
        previousButton.setEnabled(false);
        previousButton.setName(""); // NOI18N
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.setEnabled(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        ofLabel.setText("of");

        carIDTextField.setEditable(false);

        carIDLabel.setText("Car ID:");

        carMakeLabel.setText("Car Make:");

        carModelLabel.setText("Car Model:");

        carYearLabel.setText("Car Year:");

        carMileageLabel.setText("Car Mileage:");

        navigatePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Find an entry by car model"));

        carModelLabel2.setText("Car Model:");

        findButton.setText("Find");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navigatePanelLayout = new javax.swing.GroupLayout(navigatePanel);
        navigatePanel.setLayout(navigatePanelLayout);
        navigatePanelLayout.setHorizontalGroup(
            navigatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigatePanelLayout.createSequentialGroup()
                .addComponent(carModelLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(carModelTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(findButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        navigatePanelLayout.setVerticalGroup(
            navigatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigatePanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(navigatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carModelLabel2)
                    .addComponent(carModelTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findButton)))
        );

        indexTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexTextFieldActionPerformed(evt);
            }
        });

        maxTextField.setEditable(false);

        browseButton.setText("Browse All Entries");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        insertButton.setText("Insert New Entry");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete Current Entry");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(carMakeLabel)
                                .addComponent(carModelLabel)
                                .addComponent(carYearLabel)
                                .addComponent(carMileageLabel)
                                .addComponent(carIDLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(previousButton)
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carMakeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(carIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(carModelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(carYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(carMileageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(indexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ofLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(browseButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(insertButton)
                                .addGap(6, 6, 6))
                            .addComponent(navigatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ofLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton)
                    .addComponent(previousButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carIDLabel)
                    .addComponent(carIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carMakeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carMakeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carModelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carModelLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carYearLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carMileageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carMileageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navigatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertButton)
                    .addComponent(browseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        // TODO add your handling code here:
        
        currentEntryIndex--;
        
        if(currentEntryIndex < 0)
        {
            currentEntryIndex = (numberOfEntries - 1);
        }
        
        indexTextField.setText("" + (currentEntryIndex + 1));
        indexTextFieldActionPerformed(evt);  
    }//GEN-LAST:event_previousButtonActionPerformed

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        // TODO add your handling code here:
        
        try
        {
            results = carQueries.getAllCars();
            numberOfEntries = results.size();
            
            if(numberOfEntries != 0)
            {
                currentEntryIndex = 0;
                currentEntry = results.get(currentEntryIndex);
                carIDTextField.setText("" + currentEntry.getCarID());
                carMakeTextField.setText(currentEntry.getCarMake());
                carModelTextField.setText(currentEntry.getCarModel());
                carYearTextField.setText(currentEntry.getCarYear());
                carMileageTextField.setText("" + currentEntry.getCarMileage());
                maxTextField.setText("" + numberOfEntries);
                indexTextField.setText("" + (currentEntryIndex + 1));
                nextButton.setEnabled(true);
                previousButton.setEnabled(true); 
            } 
        }
        catch(Exception e)
        {
            //print error message
            System.err.println(e.getMessage());
        }
        
        
    }//GEN-LAST:event_browseButtonActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        // TODO add your handling code here:
        
        int result = carQueries.addCar(
                carMakeTextField.getText(),
                carModelTextField.getText(),
                carYearTextField.getText(),
                Integer.parseInt(carMileageTextField.getText()));
        
        if(result == 1)
        {
            JOptionPane.showMessageDialog(
            this, "Car Added!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(
            this, "Car Not Added!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        browseButtonActionPerformed(evt);
    }//GEN-LAST:event_insertButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        
        int result = carQueries.removeCar(
                Integer.parseInt(carIDTextField.getText()));
        
        if(result == 1)
        {
            JOptionPane.showMessageDialog(
            this, "Car Deleted!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(
            this, "Car Not Deleted!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        browseButtonActionPerformed(evt);
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
        //close database connection
        carQueries.close();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void indexTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indexTextFieldActionPerformed
        // TODO add your handling code here:
        
        currentEntryIndex = (Integer.parseInt(indexTextField.getText()) - 1);
        
        if((numberOfEntries != 0) && (currentEntryIndex < numberOfEntries))
        {
            currentEntry = results.get(currentEntryIndex);
            carIDTextField.setText("" + currentEntry.getCarID());
            carMakeTextField.setText(currentEntry.getCarMake());
            carModelTextField.setText(currentEntry.getCarModel());
            carYearTextField.setText(currentEntry.getCarYear());
            carMileageTextField.setText("" + currentEntry.getCarMileage());
            maxTextField.setText("" + numberOfEntries);
            indexTextField.setText("" + (currentEntryIndex + 1));
        }
    }//GEN-LAST:event_indexTextFieldActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        
        currentEntryIndex++;
        
        if(currentEntryIndex >= numberOfEntries)
        {
            currentEntryIndex = 0;
        }
        
        indexTextField.setText("" + (currentEntryIndex + 1));
        indexTextFieldActionPerformed(evt);
    }//GEN-LAST:event_nextButtonActionPerformed

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        // TODO add your handling code here:
        
        results = carQueries.getCarsByModel(carModelTextField2.getText());
        numberOfEntries = results.size();
        
        if(numberOfEntries != 0)
        {
            currentEntryIndex = 0;
            currentEntry = results.get(currentEntryIndex);
            carIDTextField.setText("" + currentEntry.getCarID());
            carMakeTextField.setText(currentEntry.getCarMake());
            carModelTextField.setText(currentEntry.getCarModel());
            carYearTextField.setText(currentEntry.getCarYear());
            carMileageTextField.setText("" + currentEntry.getCarMileage());
            maxTextField.setText("" + numberOfEntries);
            indexTextField.setText("" + (currentEntryIndex + 1));
            nextButton.setEnabled(true);
            previousButton.setEnabled(true);  
        }
        else
        {
            browseButtonActionPerformed(evt);
        } 
    }//GEN-LAST:event_findButtonActionPerformed

    //database variable declarations
    private Car currentEntry;
    private CarQueries carQueries;
    private List< Car > results;
    private int numberOfEntries = 0;
    private int currentEntryIndex;
    //end of database variable declarations
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JLabel carIDLabel;
    private javax.swing.JTextField carIDTextField;
    private javax.swing.JLabel carMakeLabel;
    private javax.swing.JTextField carMakeTextField;
    private javax.swing.JLabel carMileageLabel;
    private javax.swing.JTextField carMileageTextField;
    private javax.swing.JLabel carModelLabel;
    private javax.swing.JLabel carModelLabel2;
    private javax.swing.JTextField carModelTextField;
    private javax.swing.JTextField carModelTextField2;
    private javax.swing.JLabel carYearLabel;
    private javax.swing.JTextField carYearTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton findButton;
    private javax.swing.JTextField indexTextField;
    private javax.swing.JButton insertButton;
    private javax.swing.JTextField maxTextField;
    private javax.swing.JPanel navigatePanel;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel ofLabel;
    private javax.swing.JButton previousButton;
    // End of variables declaration//GEN-END:variables
}


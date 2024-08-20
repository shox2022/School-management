import java.awt.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;  
import com.toedter.calendar.JDateChooser;


public class BOOKING extends javax.swing.JFrame {
Connection con= null;
ResultSet rs= null;
Random random = new Random();
private int user_id;

 private List<String> timeList = new ArrayList<>();
    /**
     * Creates new form Booking
     */
    public BOOKING(int id) {
        initComponents();
        con= DBConnection.connect();
        user_id=id;
    }
    private BOOKING() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ppp = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        aair = new javax.swing.JComboBox<>();
        dair = new javax.swing.JComboBox<>();
        rad1 = new javax.swing.JRadioButton();
        rad2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        time2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BOOK YOUR TICKET!");

        jLabel2.setText("Departure Airport:");

        jLabel3.setText("Arrival Airport:");

        jLabel4.setText("Departure Date:");

        jLabel5.setText("Return Date:");

        jButton1.setText("Book Now!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");

        jLabel6.setText("Calculated Price:");

        ppp.setText("Price goes here");

        jLabel8.setText("Baggage:");

        aair.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "John F. Kennedy International Airport (JFK)", "Heathrow Airport (LHR)", "Dubai International Airport (DXB)", "Los Angeles International Airport (LAX)", "Sydney Kingsford Smith Airport (SYD)" }));
        aair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aairActionPerformed(evt);
            }
        });

        dair.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "John F. Kennedy International Airport (JFK)", "Heathrow Airport (LHR)", "Dubai International Airport (DXB)", "Los Angeles International Airport (LAX)", "Sydney Kingsford Smith Airport (SYD)" }));

        rad1.setText("Yes");

        rad2.setText("No");

        jLabel9.setText("Departure Time:");

        jLabel10.setText("Arrival Time:");

        time1.setText("jLabel11");

        time2.setText("jLabel12");

        jButton3.setText("Calculate Price and Available Time");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(236, 236, 236))))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rad1)
                                .addGap(30, 30, 30)
                                .addComponent(rad2))
                            .addComponent(jButton1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel6))
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ppp)
                            .addComponent(time1)
                            .addComponent(time2))
                        .addGap(255, 255, 255))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dair, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(aair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(dair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(time1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(time2))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rad1)
                    .addComponent(rad2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ppp))
                .addGap(23, 23, 23)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String pr=ppp.getText();
    
    SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");   
    String departureAirport = (String) dair.getSelectedItem();
    String arrivalAirport = (String) aair.getSelectedItem();
    String dtime=time1.getText();
    String atime= time2.getText();
    String datepick=dateFormat.format(jDateChooser1.getDate());     
    
    try {
        java.util.Date datepickk=dateFormat.parse(datepick);
    } catch (ParseException ex) {
        Logger.getLogger(BOOKING.class.getName()).log(Level.SEVERE, null, ex);
    }
        String datepick2=dateFormat.format(jDateChooser2.getDate());
    try {
        java.util.Date datepick2_=dateFormat.parse(datepick2);
    } catch (ParseException ex) {
        Logger.getLogger(BOOKING.class.getName()).log(Level.SEVERE, null, ex);
    }

    // Query respective tables to get additional information
    int randomAircraftId = getRandomForeignKeyValue("AircraftId");
    int randomAirlineId = getRandomForeignKeyValue("AirlineId");
    int randomGateId = getRandomForeignKeyValue("GateID");

    // Retrieve current date and time
    LocalDateTime currentDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String departureDate = currentDateTime.format(formatter);

    
    String baggage = rad1.isSelected() ? "Yes" : "No";

    
    try {
        

        String flightQuery = "INSERT INTO Flights (DepartureAirport, ArrivalAirport, DepartureTime, ArrivalTime,AircraftId, AirlineId, GateID, DepartureDate, ReturnDate,Price) VALUES ( ?, ?, ?, ?, ?, ?, ?,?,?,?)";
                
        PreparedStatement flightStatement = con.prepareStatement(flightQuery, Statement.RETURN_GENERATED_KEYS);
        flightStatement.setString(1, departureAirport);
        
        flightStatement.setString(2, arrivalAirport);
        flightStatement.setString(3, dtime);
        flightStatement.setString(4, atime);
        flightStatement.setInt(5, randomAircraftId);
        flightStatement.setInt(6, randomAirlineId);
        flightStatement.setInt(7, randomGateId);
        flightStatement.setString(8, datepick);
        flightStatement.setString(9, datepick2);          
        flightStatement.setString(10,pr);
        
        
        
        
        
        
        
        
        
        int affectedRows = flightStatement.executeUpdate();
        JOptionPane.showMessageDialog(this, "Record inserted successfully!");
        
        if (affectedRows == 0) {
            throw new SQLException("Creating Flight record failed, no rows affected.");
        }

        // Retrieve the generated Flight_ID
        ResultSet generatedKeys = flightStatement.getGeneratedKeys();
        int flightId = -1;
        int gateNumber=-1;
        if (generatedKeys.next()) {
            flightId = generatedKeys.getInt(1);
            gateNumber = randomGateId;
        } else {
            throw new SQLException("Creating Flight record failed, no ID obtained.");
        }

        
        String seatNumber = generateRandomSeatNumber();
        
        String ticketQuery = "INSERT INTO Tickets (PassengerID, FlightID,  Price,SeatNumber, GateNumber,Baggage) VALUES (?, ?, ?, ?, ?,?)";
        PreparedStatement ticketStatement = con.prepareStatement(ticketQuery);
        ticketStatement.setInt(1, user_id);
        ticketStatement.setInt(2, flightId);
        ticketStatement.setString(3, pr);  
        ticketStatement.setString(4, seatNumber); 
        ticketStatement.setInt(5, gateNumber); 
        
        
        ticketStatement.setString(6, baggage);

        ticketStatement.executeUpdate();

        JOptionPane.showMessageDialog(this, "Record inserted successfully!");
        
        

    } catch (SQLException exception) {
        exception.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error inserting record!");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aairActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
         int randomPrice = random.nextInt(900) + 100;

    
    ppp.setText( String.valueOf(randomPrice));
        
        
        
        
        
        initializeTimeList();
    // Generate random indices to select two times from the list
    int randomIndex1 = generateRandomIndex(timeList.size());
    int randomIndex2 = generateRandomIndex(timeList.size());

    // Get the times at the random indices
    String randomTime1 = timeList.get(randomIndex1);
    String randomTime2 = timeList.get(randomIndex2);

    // Set the two fields with the random times (replace 'field1' and 'field2' with your actual fields)
    time1.setText(randomTime1);
    time2.setText(randomTime2);
}

private void initializeTimeList() {
    // Add your time values to the list
    timeList.add("08:00");
    timeList.add("10:30");
    timeList.add("13:45");
    // Add more times as needed
}

private int generateRandomIndex(int maxIndex) {
    Random random = new Random();
    // Generate a random index between 0 and maxIndex-1
    return random.nextInt(maxIndex);

    }//GEN-LAST:event_jButton3ActionPerformed

    
    private int getRandomForeignKeyValue(String foreignKeyColumn) {
    try {
       

        // Query the respective table to get a random foreign key value
        String query = "SELECT TOP 1 " + foreignKeyColumn + " FROM Aircraft, Airlines, Gates ORDER BY RAND()";

        PreparedStatement preparedStatement = con.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return resultSet.getInt(foreignKeyColumn);
        }

        // Close resources
        

    } catch (SQLException exception) {
        exception.printStackTrace();
    }

    return 0; // Default value if something goes wrong
}
    
    
     private static String generateRandomSeatNumber() {
        // Define possible letters for the seat value
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Define the possible digits for the seat value
        String digits = "0123456789";

        // Create a StringBuilder to build the seat value
        StringBuilder seatNumberBuilder = new StringBuilder();

        // Generate a random letter for the seat value
        Random random = new Random();
        char randomLetter = letters.charAt(random.nextInt(letters.length()));
        seatNumberBuilder.append(randomLetter);

        // Generate 1 to 3 random digits for the seat value
        int numDigits = random.nextInt(3) + 1; // Generates a random number between 1 and 3
        for (int i = 0; i < numDigits; i++) {
            char randomDigit = digits.charAt(random.nextInt(digits.length()));
            seatNumberBuilder.append(randomDigit);
        }

        // Combine the letter and digits to form the seat value
        String seatNumber = seatNumberBuilder.toString();

        return seatNumber;
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BOOKING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BOOKING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BOOKING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BOOKING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BOOKING().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> dair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel ppp;
    private javax.swing.JRadioButton rad1;
    private javax.swing.JRadioButton rad2;
    private javax.swing.JLabel time1;
    private javax.swing.JLabel time2;
    // End of variables declaration//GEN-END:variables
}
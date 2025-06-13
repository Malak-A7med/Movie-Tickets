package movieproject;

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sales extends javax.swing.JFrame {
    Connection con;
    DefaultTableModel salesdata ;

    public sales() {
        initComponents();
//        cartoon cartoonFrame = new cartoon();
//        cartoonFrame.setSalesTable(Sales);
        this.setLocationRelativeTo(null);
        tic_info.setBackground(new java.awt.Color(0, 0, 0, 0));
        bord.setBackground(new java.awt.Color(0, 0, 0, 0));
        salesdata = (DefaultTableModel) Sales.getModel();
        loadTableData();

    }
    

    



    
    
    private Connection connectToDatabase() {
        String url = "jdbc:mysql://localhost:3306/cinema?serverTimezone=UTC";
        String user = "root";
        String pass = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database connection failed: " + e.getMessage());
            return null;
        }
    }

    private void loadTableData() {
        try (Connection con = connectToDatabase()) {
            if (con != null) {
                String query = "SELECT * FROM movie";
                PreparedStatement ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                salesdata.setRowCount(0);
                while (rs.next()) {
                    Object[] row = {
                        rs.getString("Movie_Name"),
                        rs.getInt("Movie_ID"), 
                        rs.getString("Category"),
                        rs.getString("Movie_Date"),
                        rs.getString("Price")};
                        salesdata.addRow(row);
                }

                rs.close();
                ps.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to load data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bord = new javax.swing.JPanel();
        enterID_text = new javax.swing.JLabel();
        enterIDforSearch = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Sales = new javax.swing.JTable();
        tic_info = new javax.swing.JPanel();
        Name_label = new javax.swing.JLabel();
        Name_label1 = new javax.swing.JLabel();
        mov_id = new javax.swing.JTextField();
        Name_label2 = new javax.swing.JLabel();
        cat = new javax.swing.JTextField();
        Name_label3 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        Delete1 = new javax.swing.JButton();
        Name_label6 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        enterName = new javax.swing.JTextField();
        show = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bord.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 255)), "Tickets Sales", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N

        enterID_text.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        enterID_text.setForeground(new java.awt.Color(255, 255, 255));
        enterID_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterID_text.setText("Enter Movie Name");

        enterIDforSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterIDforSearchActionPerformed(evt);
            }
        });

        search_button.setBackground(new java.awt.Color(190, 183, 183));
        search_button.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        search_button.setText("Search");
        search_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        Sales.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        Sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Id", "Category", "Date", "Price"
            }
        ));
        Sales.setGridColor(new java.awt.Color(0, 0, 0));
        Sales.setRowHeight(25);
        Sales.setShowGrid(false);
        Sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Sales);

        tic_info.setBackground(new java.awt.Color(0, 153, 51));
        tic_info.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        tic_info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name_label.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        Name_label.setForeground(new java.awt.Color(255, 255, 255));
        Name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_label.setText(" Name");
        tic_info.add(Name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 33, 102, 31));

        Name_label1.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        Name_label1.setForeground(new java.awt.Color(255, 255, 255));
        Name_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_label1.setText("Id");
        tic_info.add(Name_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, 85, 31));

        mov_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tic_info.add(mov_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 205, 38));

        Name_label2.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        Name_label2.setForeground(new java.awt.Color(255, 255, 255));
        Name_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_label2.setText("Category");
        tic_info.add(Name_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, 85, 31));

        cat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tic_info.add(cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 205, 38));

        Name_label3.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        Name_label3.setForeground(new java.awt.Color(255, 255, 255));
        Name_label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_label3.setText("Date");
        tic_info.add(Name_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 222, 85, 31));

        date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tic_info.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 205, 38));

        Delete1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Delete1.setText("Delete");
        Delete1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete1ActionPerformed(evt);
            }
        });
        tic_info.add(Delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 356, 106, 41));

        Name_label6.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        Name_label6.setForeground(new java.awt.Color(255, 255, 255));
        Name_label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_label6.setText("Price");
        tic_info.add(Name_label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 285, 81, 31));

        price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tic_info.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 205, 38));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        tic_info.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 205, 38));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        tic_info.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 205, 38));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        tic_info.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 205, 38));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        tic_info.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 205, 38));

        enterName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(enterName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(enterName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tic_info.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 205, 38));

        show.setBackground(new java.awt.Color(190, 183, 183));
        show.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        show.setText("Show All Movies");
        show.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bordLayout = new javax.swing.GroupLayout(bord);
        bord.setLayout(bordLayout);
        bordLayout.setHorizontalGroup(
            bordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bordLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(tic_info, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bordLayout.createSequentialGroup()
                        .addComponent(enterID_text, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterIDforSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18))
        );
        bordLayout.setVerticalGroup(
            bordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterIDforSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterID_text, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tic_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel1.add(bord, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 1010, 590));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/films_needs/—Pngtree—white arrow pointer 3d symbol_13145602.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cartoonBG.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1090, 608));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterIDforSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterIDforSearchActionPerformed

    }//GEN-LAST:event_enterIDforSearchActionPerformed

    dashboard db = new dashboard();
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if (db == null) {
            db = new dashboard();
        }
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
         String searchmovie = enterIDforSearch.getText();
        // إذا كان هناك قيمة في الحقل، قم بالبحث بناءً على القسم
        searchSalesByMovieName(searchmovie);
    }//GEN-LAST:event_search_buttonActionPerformed

    
    
    
    private void Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete1ActionPerformed
        String idText = mov_id.getText();
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the Movie ID to delete.");
            return;
        }
        try {     
                int id = Integer.parseInt(idText);
                try (Connection con = connectToDatabase()) {
                    if (con != null) {
                        String query = "DELETE FROM movie WHERE Movie_ID = ?";
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.setInt(1, id);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Movie deleted successfully!");
                        loadTableData();
                        mov_id.setText("");
                        enterName.setText("");
                        cat.setText("");
                        date.setText("");
                        price.setText("");
                        
                    }
                }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric ID.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to delete Movie: " + e.getMessage());
        }

    }//GEN-LAST:event_Delete1ActionPerformed

    
    
    private void SalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalesMouseClicked
        DefaultTableModel dtm=(DefaultTableModel)Sales.getModel();
        String name=Sales.getValueAt(Sales.getSelectedRow(),0).toString();
        String id=Sales.getValueAt(Sales.getSelectedRow(),1).toString();
        String categ=Sales.getValueAt(Sales.getSelectedRow(),2).toString();
        String dat=Sales.getValueAt(Sales.getSelectedRow(),3).toString();
        String pr=Sales.getValueAt(Sales.getSelectedRow(),4).toString();
        
        enterName.setText(name);
        mov_id.setText(id);
        cat.setText(categ);
        date.setText(dat);
        price.setText(pr);
    }//GEN-LAST:event_SalesMouseClicked

    
    
    
    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        loadTableData();
    }//GEN-LAST:event_showActionPerformed
    
    
    
    private void searchSalesByMovieName(String searchmovie) {
        try (Connection con = connectToDatabase()) {
            if (con != null) {
                String searchQuery = "SELECT * FROM movie WHERE Movie_Name LIKE ?";
                PreparedStatement ps = con.prepareStatement(searchQuery);
                ps.setString(1, "%" + searchmovie + "%"); // استخدام LIKE للبحث الجزئي عن القسم

                ResultSet rs = ps.executeQuery();

                // مسح الجدول الحالي وإضافة البيانات الجديدة
                DefaultTableModel model = (DefaultTableModel) Sales.getModel();
                model.setRowCount(0); // مسح البيانات القديمة

                while (rs.next()) {
                    // إضافة الصفوف الجديدة بناءً على نتائج البحث
                    model.addRow(new Object[]{
                        rs.getString("Movie_Name"),
                        rs.getInt("Movie_ID"),
                        rs.getString("Category"),
                        rs.getString("Movie_Date"),
                        rs.getString("Price")});
                }
                rs.close();
                ps.close();

                if (model.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "No Movies found in the specified department.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to search Movie by Movie Name: " + e.getMessage());
        }
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete1;
    private javax.swing.JLabel Name_label;
    private javax.swing.JLabel Name_label1;
    private javax.swing.JLabel Name_label2;
    private javax.swing.JLabel Name_label3;
    private javax.swing.JLabel Name_label6;
    private javax.swing.JTable Sales;
    private javax.swing.JPanel bord;
    private javax.swing.JTextField cat;
    private javax.swing.JTextField date;
    private javax.swing.JLabel enterID_text;
    private javax.swing.JTextField enterIDforSearch;
    private javax.swing.JTextField enterName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mov_id;
    private javax.swing.JTextField price;
    private javax.swing.JButton search_button;
    private javax.swing.JButton show;
    private javax.swing.JPanel tic_info;
    // End of variables declaration//GEN-END:variables
}

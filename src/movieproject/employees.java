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

public class employees extends javax.swing.JFrame {
    Connection con;
    DefaultTableModel employeesdata;
    public employees() {
        //Add connection
        initComponents();
        updateMemberCount();
        this.setLocationRelativeTo(null);
        tic_info.setBackground(new java.awt.Color(0, 0, 0, 0));
        bord.setBackground(new java.awt.Color(0, 0, 0, 0));
        id_pan.setBackground(new java.awt.Color(0, 0, 0, 0));
        TableColumn id = Employees.getColumnModel().getColumn(1);
        id.setPreferredWidth(30);
        TableColumn age = Employees.getColumnModel().getColumn(2);
        age.setPreferredWidth(30);
        TableColumn sal = Employees.getColumnModel().getColumn(3);
        sal.setPreferredWidth(40);
        employeesdata = (DefaultTableModel) Employees.getModel();
        loadTableData();

    }

    private boolean isSingleMember() {
        try {
            con = connectToDatabase();
            // استعلام لحساب عدد السجلات في الجدول
            String query = "SELECT COUNT(*) FROM employee";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1); // الحصول على عدد السجلات
                return count == 1; // إذا كان العدد 1 فهذا يعني أن هنا كموظف واحد فقط
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception ex) {
            Logger.getLogger(employees.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false; // في حال حدوث خطأ أو لم يتم العثور على السجلات
    }
    
    
    

    //هنا بنعمل الربط
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
    
    
    

    //Employee NUMBER
    private void updateMemberCount() {
        try {
            con = connectToDatabase();
            String query = "SELECT COUNT(*) FROM employee";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int memberCount = rs.getInt(1);  // الحصول على عدد الأعضاء
                em_num.setText("" + memberCount);
            }

            rs.close();
            ps.close();
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Failed to update member count!");
        }
    }

    //بنحمل البيانات المبدئيه اللى فى ال DB
    private void loadTableData() {
        try (Connection con = connectToDatabase()) {
            if (con != null) {
                String query = "SELECT * FROM employee";
                PreparedStatement ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                employeesdata.setRowCount(0);
                while (rs.next()) {
                    Object[] row = {
                        rs.getString("Employee_Name"),
                        rs.getInt("ID"),
                        rs.getInt("Age"),
                        rs.getDouble("Salary"),
                        rs.getString("Phone"),
                        rs.getString("Department"),};
                    employeesdata.addRow(row);
                }

                rs.close();
                ps.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to load data: " + e.getMessage());
        }
    }

    
    public class Employees extends javax.swing.JFrame {

        public Employees() {
            // Add connection
            initComponents();
            this.setLocationRelativeTo(null);
            tic_info.setBackground(new java.awt.Color(0, 0, 0, 0));
            bord.setBackground(new java.awt.Color(0, 0, 0, 0));
        }
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bord = new javax.swing.JPanel();
        enterID_text = new javax.swing.JLabel();
        enterDepartmentforSearch = new javax.swing.JTextField();
        show = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Employees = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tic_info = new javax.swing.JPanel();
        Name_label = new javax.swing.JLabel();
        Name_label2 = new javax.swing.JLabel();
        Name_label3 = new javax.swing.JLabel();
        Name_label4 = new javax.swing.JLabel();
        Name_label5 = new javax.swing.JLabel();
        addbtn_empl = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        em_name = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        em_department = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        em_phone = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        em_salary = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        em_age = new javax.swing.JTextField();
        id_pan = new javax.swing.JPanel();
        deletebtn_empl = new javax.swing.JButton();
        ubdatebtn_empl = new javax.swing.JButton();
        Name_label1 = new javax.swing.JLabel();
        em_id = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        search_button1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        em_num = new javax.swing.JLabel();
        em_name1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bord.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 255)), "Cinema Employees", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N
        bord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterID_text.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        enterID_text.setForeground(new java.awt.Color(255, 255, 255));
        enterID_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterID_text.setText("Enter Department");
        bord.add(enterID_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 130, 36));

        enterDepartmentforSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterDepartmentforSearchMouseClicked(evt);
            }
        });
        enterDepartmentforSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterDepartmentforSearchActionPerformed(evt);
            }
        });
        bord.add(enterDepartmentforSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 318, 40));

        show.setBackground(new java.awt.Color(190, 183, 183));
        show.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        show.setText("Show All Employees");
        show.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        bord.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 150, 40));

        Employees.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        Employees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Employee Name", " Id", "Age", "Salary", "Phone", "Department"
            }
        ));
        Employees.setGridColor(new java.awt.Color(0, 0, 0));
        Employees.setRowHeight(25);
        Employees.setShowGrid(false);
        jScrollPane1.setViewportView(Employees);

        bord.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 87, 670, 440));

        jLabel2.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Number of Employees");
        bord.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 625, 177, 42));

        tic_info.setBackground(new java.awt.Color(0, 153, 51));
        tic_info.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        tic_info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name_label.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        Name_label.setForeground(new java.awt.Color(255, 255, 255));
        Name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_label.setText("Employee Name");
        tic_info.add(Name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 32, 131, 31));

        Name_label2.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        Name_label2.setForeground(new java.awt.Color(255, 255, 255));
        Name_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_label2.setText("Age");
        tic_info.add(Name_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, 113, 31));

        Name_label3.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        Name_label3.setForeground(new java.awt.Color(255, 255, 255));
        Name_label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_label3.setText("Salary");
        tic_info.add(Name_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 131, 113, 31));

        Name_label4.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        Name_label4.setForeground(new java.awt.Color(255, 255, 255));
        Name_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_label4.setText("Phone");
        tic_info.add(Name_label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 181, 113, 31));

        Name_label5.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        Name_label5.setForeground(new java.awt.Color(255, 255, 255));
        Name_label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_label5.setText("Department");
        tic_info.add(Name_label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 231, 119, 31));

        addbtn_empl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        addbtn_empl.setText("Add");
        addbtn_empl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addbtn_empl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtn_emplMouseClicked(evt);
            }
        });
        addbtn_empl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtn_emplActionPerformed(evt);
            }
        });
        tic_info.add(addbtn_empl, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 285, 116, 35));

        em_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                em_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(em_name, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(em_name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tic_info.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 205, 38));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(em_department, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(em_department, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tic_info.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 205, 38));

        em_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                em_phoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(em_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(em_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tic_info.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 205, 38));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(em_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(em_salary, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        tic_info.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 205, 38));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(em_age, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(em_age, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tic_info.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        bord.add(tic_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 360, 350));

        id_pan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        id_pan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deletebtn_empl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        deletebtn_empl.setText("Delete");
        deletebtn_empl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deletebtn_empl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtn_emplActionPerformed(evt);
            }
        });
        id_pan.add(deletebtn_empl, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 85, 106, 35));

        ubdatebtn_empl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        ubdatebtn_empl.setText("Update");
        ubdatebtn_empl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ubdatebtn_empl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ubdatebtn_emplMouseClicked(evt);
            }
        });
        ubdatebtn_empl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubdatebtn_emplActionPerformed(evt);
            }
        });
        id_pan.add(ubdatebtn_empl, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 85, 106, 35));

        Name_label1.setFont(new java.awt.Font("Arial Narrow", 1, 27)); // NOI18N
        Name_label1.setForeground(new java.awt.Color(255, 255, 255));
        Name_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_label1.setText("Id");
        id_pan.add(Name_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 30, 34, 43));
        id_pan.add(em_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 30, 221, 38));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        id_pan.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 220, 38));

        bord.add(id_pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 445, 355, 130));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Number Of Employees");
        bord.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 170, 30));

        search_button1.setBackground(new java.awt.Color(190, 183, 183));
        search_button1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        search_button1.setText("Search");
        search_button1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_button1ActionPerformed(evt);
            }
        });
        bord.add(search_button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(823, 30, 60, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        em_num.setBackground(new java.awt.Color(255, 255, 255));
        em_num.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        em_num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        em_num.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        em_num.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                em_numMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(em_num, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(em_num, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bord.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, 110, 40));

        em_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                em_name1ActionPerformed(evt);
            }
        });
        bord.add(em_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 205, 38));

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

        bord.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bord.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 318, 40));

        jPanel1.add(bord, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1050, 590));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/films_needs/—Pngtree—white arrow pointer 3d symbol_13145602.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, -1, 30));

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


    private void enterDepartmentforSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterDepartmentforSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterDepartmentforSearchActionPerformed
    dashboard db = new dashboard();
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if (db == null) {
            db = new dashboard();
        }
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void clearFields() {
        em_name.setText("");
        em_salary.setText("");
        em_department.setText("");
        em_age.setText("");
        em_phone.setText("");
        em_id.setText("");
    }

    //زر الاضافه
    private void addbtn_emplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtn_emplActionPerformed
        String name = em_name.getText();
        String salaryText = em_salary.getText();
        String department = em_department.getText();
        String ageText = em_age.getText();
        String phone = em_phone.getText();

        if (name.isEmpty() || salaryText.isEmpty() || department.isEmpty() || ageText.isEmpty() || phone.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.");
            return;
        }

        try {
            double salary = Double.parseDouble(salaryText);
            int age = Integer.parseInt(ageText);

            try (Connection con = connectToDatabase()) {
                if (con != null) {
                    String query = "INSERT INTO employee (Employee_Name, Salary, Department, Age, Phone) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, name);
                    ps.setDouble(2, salary);
                    ps.setString(3, department);
                    ps.setInt(4, age);
                    ps.setString(5, phone);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Employee added successfully!");
                    clearFields();
                    updateMemberCount();
                    loadTableData();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values for ID, Salary, and Age.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to add employee: " + e.getMessage());
        }
    }//GEN-LAST:event_addbtn_emplActionPerformed


    private void addbtn_emplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtn_emplMouseClicked

    }//GEN-LAST:event_addbtn_emplMouseClicked

    //زر التحديث
    private void ubdatebtn_emplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubdatebtn_emplMouseClicked
        String name = em_name.getText();
        String idText = em_id.getText();
        String salaryText = em_salary.getText();
        String department = em_department.getText();
        String ageText = em_age.getText();
        String phone = em_phone.getText();

        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the Employee ID to update.");
            return;
        }

        try {
            int id = Integer.parseInt(idText);

            StringBuilder queryBuilder = new StringBuilder("UPDATE employee SET ");
            boolean isFirst = true;

            // بناء الاستعلام بناءً على الحقول التي تم إدخالها
            if (!name.isEmpty()) {
                queryBuilder.append("Employee_Name = ?");
                isFirst = false;
            }
            if (!salaryText.isEmpty()) {
                if (!isFirst) {
                    queryBuilder.append(", ");
                }
                queryBuilder.append("Salary = ?");
                isFirst = false;
            }
            if (!department.isEmpty()) {
                if (!isFirst) {
                    queryBuilder.append(", ");
                }
                queryBuilder.append("Department = ?");
                isFirst = false;
            }
            if (!ageText.isEmpty()) {
                if (!isFirst) {
                    queryBuilder.append(", ");
                }
                queryBuilder.append("Age = ?");
                isFirst = false;
            }
            if (!phone.isEmpty()) {
                if (!isFirst) {
                    queryBuilder.append(", ");
                }
                queryBuilder.append("Phone = ?");
            }

            queryBuilder.append(" WHERE Id = ?");

            try (Connection con = connectToDatabase()) {
                if (con != null) {
                    PreparedStatement ps = con.prepareStatement(queryBuilder.toString());
                    int paramIndex = 1;

                    // تعيين القيم بناءً على الحقول المدخلة
                    if (!name.isEmpty()) {
                        ps.setString(paramIndex++, name);
                    }
                    if (!salaryText.isEmpty()) {
                        ps.setDouble(paramIndex++, Double.parseDouble(salaryText));
                    }
                    if (!department.isEmpty()) {
                        ps.setString(paramIndex++, department);
                    }
                    if (!ageText.isEmpty()) {
                        ps.setInt(paramIndex++, Integer.parseInt(ageText));
                    }
                    if (!phone.isEmpty()) {
                        ps.setString(paramIndex++, phone);
                    }
                    ps.setInt(paramIndex, id);

                    int rowsUpdated = ps.executeUpdate();

                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(null, "Employee updated successfully!");
                        loadTableData();
                      
                    } else {
                        JOptionPane.showMessageDialog(null, "No employee found with the given ID.");
                    }
                    clearFields();
                }
                
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for ID.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to update employee: " + e.getMessage());
        }

    }//GEN-LAST:event_ubdatebtn_emplMouseClicked

    
    
    //زر الحذف
    private void deletebtn_emplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtn_emplActionPerformed
        String idText = em_id.getText();
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the ID of the employee to delete.");
            return;
        }

        try {
            if (isSingleMember()) {
                int id = Integer.parseInt(idText);

                try (Connection con = connectToDatabase()) {
                    if (con != null) {
                        String query = "DELETE FROM employee WHERE Id = ?";
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.setInt(1, id);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Employee deleted successfully!");
                        loadTableData();
                        updateMemberCount();
                    }
                    String resetAutoIncrementQuery = "ALTER TABLE employee AUTO_INCREMENT = 1";
                    PreparedStatement resetPs = con.prepareStatement(resetAutoIncrementQuery);
                    resetPs.executeUpdate();
                }

            } else {
                int id = Integer.parseInt(idText);
                try (Connection con = connectToDatabase()) {
                    if (con != null) {
                        String query = "DELETE FROM employee WHERE Id = ?";
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.setInt(1, id);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Employee deleted successfully!");
                        loadTableData();
                        updateMemberCount();
                        clearFields();
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric ID.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to delete employee: " + e.getMessage());
        }

    }//GEN-LAST:event_deletebtn_emplActionPerformed

    
    
    // يرجع كل بيانات بعد البحث
    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        loadTableData();
    }//GEN-LAST:event_showActionPerformed

    
    private void search_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_button1ActionPerformed
        String searchDepartment = enterDepartmentforSearch.getText();
        // إذا كان هناك قيمة في الحقل، قم بالبحث بناءً على القسم
        searchEmployeeByDepartment(searchDepartment);
        enterDepartmentforSearch.setText("");
    }//GEN-LAST:event_search_button1ActionPerformed

    private void searchEmployeeByDepartment(String searchDepartment) {
        try (Connection con = connectToDatabase()) {
            if (con != null) {
                String searchQuery = "SELECT * FROM employee WHERE Department LIKE ?";
                PreparedStatement ps = con.prepareStatement(searchQuery);
                ps.setString(1, "%" + searchDepartment + "%"); // استخدام LIKE للبحث الجزئي عن القسم
                ResultSet rs = ps.executeQuery();
                
                DefaultTableModel model = (DefaultTableModel) Employees.getModel();
                model.setRowCount(0); 

                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getString("Employee_Name"),
                        rs.getInt("Id"),
                        rs.getInt("Age"),
                        rs.getDouble("Salary"),
                        rs.getString("Phone"), 
                        rs.getString("Department")
                    });
                }
                rs.close();
                ps.close();
                clearFields();
                if (model.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "No employees found in the specified department.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to search employee by department: " + e.getMessage());
        }
    }

    
    private void em_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_em_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_em_phoneActionPerformed

    private void em_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_em_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_em_name1ActionPerformed

    private void em_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_em_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_em_nameActionPerformed

    private void ubdatebtn_emplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubdatebtn_emplActionPerformed
        
    }//GEN-LAST:event_ubdatebtn_emplActionPerformed

    private void em_numMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_em_numMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_em_numMouseClicked

    private void enterDepartmentforSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterDepartmentforSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_enterDepartmentforSearchMouseClicked

    
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
            java.util.logging.Logger.getLogger(employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Employees;
    private javax.swing.JLabel Name_label;
    private javax.swing.JLabel Name_label1;
    private javax.swing.JLabel Name_label2;
    private javax.swing.JLabel Name_label3;
    private javax.swing.JLabel Name_label4;
    private javax.swing.JLabel Name_label5;
    private javax.swing.JButton addbtn_empl;
    private javax.swing.JPanel bord;
    private javax.swing.JButton deletebtn_empl;
    private javax.swing.JTextField em_age;
    private javax.swing.JTextField em_department;
    private javax.swing.JTextField em_id;
    private javax.swing.JTextField em_name;
    private javax.swing.JTextField em_name1;
    private javax.swing.JLabel em_num;
    private javax.swing.JTextField em_phone;
    private javax.swing.JTextField em_salary;
    private javax.swing.JTextField enterDepartmentforSearch;
    private javax.swing.JLabel enterID_text;
    private javax.swing.JPanel id_pan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search_button1;
    private javax.swing.JButton show;
    private javax.swing.JPanel tic_info;
    private javax.swing.JButton ubdatebtn_empl;
    // End of variables declaration//GEN-END:variables
}

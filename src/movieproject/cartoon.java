package movieproject;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

public class cartoon extends javax.swing.JFrame {

    public cartoon() {
        initComponents();
        this.setLocationRelativeTo(null);
        nav.setBackground(new java.awt.Color(0, 0, 0, 70));
        ButtonGroup group = new ButtonGroup();
        group.add(frozen_check);
        group.add(luca_check);
        group.add(croods_check);
        group.add(raya_check);
        group.add(tan_check);
        group.add(ins__check);
        group.add(ele__check);
        group.add(mig_check);
        group.add(secret_check);
        group.add(brave_check);
        group.add(moana_check);
        group.add(dory_check);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel21 = new javax.swing.JPanel();
        ButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nav = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        luca_check = new javax.swing.JCheckBox();
        dory_check = new javax.swing.JCheckBox();
        jComboBox2 = new javax.swing.JComboBox<>();
        croods_check = new javax.swing.JCheckBox();
        jComboBox3 = new javax.swing.JComboBox<>();
        raya_check = new javax.swing.JCheckBox();
        jComboBox4 = new javax.swing.JComboBox<>();
        tan_check = new javax.swing.JCheckBox();
        jComboBox5 = new javax.swing.JComboBox<>();
        ins__check = new javax.swing.JCheckBox();
        jComboBox6 = new javax.swing.JComboBox<>();
        ele__check = new javax.swing.JCheckBox();
        jComboBox7 = new javax.swing.JComboBox<>();
        mig_check = new javax.swing.JCheckBox();
        jComboBox8 = new javax.swing.JComboBox<>();
        secret_check = new javax.swing.JCheckBox();
        jComboBox9 = new javax.swing.JComboBox<>();
        brave_check = new javax.swing.JCheckBox();
        jComboBox10 = new javax.swing.JComboBox<>();
        moana_check = new javax.swing.JCheckBox();
        jComboBox11 = new javax.swing.JComboBox<>();
        frozen_check = new javax.swing.JCheckBox();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cartoon_cards = new javax.swing.JPanel();
        card_elemental = new javax.swing.JPanel();
        cards = new javax.swing.JPanel();
        ele = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cartoon Movies");
        setMaximumSize(new java.awt.Dimension(1280, 719));
        setMinimumSize(new java.awt.Dimension(1083, 608));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(0, 0, 0,150));
        nav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home ");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navLayout = new javax.swing.GroupLayout(nav);
        nav.setLayout(navLayout);
        navLayout.setHorizontalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(985, Short.MAX_VALUE))
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1083, 40));

        jLabel16.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Raya");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 50, 20));

        jLabel19.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Finding Dory");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 140, 40));

        jLabel21.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Tangled");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 100, -1));

        jLabel22.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Inside Out2");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, 120, -1));

        jLabel20.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Elemental");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 230, 100, 40));

        jLabel23.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Luca 3");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 100, 20));

        btn2.setBackground(new java.awt.Color(36, 80, 154));
        btn2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("Book Now");
        btn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.setBorderPainted(false);
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 120, 33));

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartoon_img/photo_2024-12-12_04-15-59.jpg"))); // NOI18N
        jPanel14.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 280));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, 120, 180));

        jPanel5.setPreferredSize(new java.awt.Dimension(200, 260));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartoon_img/166d568f349d63dcc4cb1e0a8f254a4a.jpg"))); // NOI18N
        jLabel6.setIconTextGap(10
        );
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 260));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 120, 180));

        jPanel4.setPreferredSize(new java.awt.Dimension(200, 260));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartoon_img/1b87ef903e46941ce8bfad800823c984.jpg"))); // NOI18N
        jLabel7.setIconTextGap(10
        );
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 260));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 120, 180));

        jPanel3.setPreferredSize(new java.awt.Dimension(200, 260));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartoon_img/2a3196b3647406f0ebd8806ddea32305.jpg"))); // NOI18N
        jLabel11.setIconTextGap(10
        );
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 270));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, 120, 180));

        jPanel2.setPreferredSize(new java.awt.Dimension(200, 260));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartoon_img/8e76985d66ac68c74adcbed23f9328f7.jpg"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 260));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 120, 180));

        jPanel8.setPreferredSize(new java.awt.Dimension(200, 260));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartoon_img/0d1dd7502bfdd40d6c4886361d3fd15c.jpg"))); // NOI18N
        jLabel5.setIconTextGap(10
        );
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 260));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 180));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8/2/2025", "9/2/2025", "4/3/2025", "6/4/2025", "10/4/2025", " ", " " }));
        jComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 100, 30));

        luca_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luca_checkActionPerformed(evt);
            }
        });
        jPanel1.add(luca_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 30, 30));

        dory_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dory_checkActionPerformed(evt);
            }
        });
        jPanel1.add(dory_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 30, 30));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9/2/2025", "6/2/2025", "6/4/2025", "10/4/2025" }));
        jComboBox2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 100, 30));

        croods_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                croods_checkActionPerformed(evt);
            }
        });
        jPanel1.add(croods_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 30, 30));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9/2/2025", "6/2/2025", "6/4/2025", "10/4/2025", "4/3/2025", " " }));
        jComboBox3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 100, 30));

        raya_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raya_checkActionPerformed(evt);
            }
        });
        jPanel1.add(raya_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 30, 30));

        jComboBox4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4/1/2025", "9/2/2025", "6/2/2025", "6/4/2025", "10/4/2025", "4/3/2025", " " }));
        jComboBox4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 100, 30));

        tan_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tan_checkActionPerformed(evt);
            }
        });
        jPanel1.add(tan_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 30, 30));

        jComboBox5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9/2/2025", "6/2/2025", "6/4/2025", "10/4/2025" }));
        jComboBox5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 100, 30));

        ins__check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ins__checkActionPerformed(evt);
            }
        });
        jPanel1.add(ins__check, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 40, 30));

        jComboBox6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "29/1/2025", "9/2/2025", "6/2/2025", "6/4/2025", "10/4/2025", " " }));
        jComboBox6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 110, 30));

        ele__check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ele__checkActionPerformed(evt);
            }
        });
        jPanel1.add(ele__check, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 260, 30, 30));

        jComboBox7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3/2/2025", "8/2/2025", "6/4/2025", "10/4/2025" }));
        jComboBox7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 260, 100, 30));

        mig_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mig_checkActionPerformed(evt);
            }
        });
        jPanel1.add(mig_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 30, 30));

        jComboBox8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5/4/2025", "6/5/2025", "2/3/2025", "10/4/2025" }));
        jComboBox8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 100, 30));

        secret_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secret_checkActionPerformed(evt);
            }
        });
        jPanel1.add(secret_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 30, 30));

        jComboBox9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10/1/2025", "9/2/2025", "6/2/2025", "6/4/2025", "29/5/2025", " ", " " }));
        jComboBox9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 110, 30));

        brave_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brave_checkActionPerformed(evt);
            }
        });
        jPanel1.add(brave_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 540, 30, 30));

        jComboBox10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9/2/2025", "10/2/2025", "29/2/2025" }));
        jComboBox10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 540, 100, 30));

        moana_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moana_checkActionPerformed(evt);
            }
        });
        jPanel1.add(moana_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 540, 30, 30));

        jComboBox11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4/3/2025", "9/2/2025", "10/2/2025", "29/2/2025", "6/2/2025", " " }));
        jComboBox11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 540, 100, 30));

        frozen_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frozen_checkActionPerformed(evt);
            }
        });
        jPanel1.add(frozen_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 30, 30));

        jComboBox12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1/1/2025", "9/2/2025", "6/2/2025", "4/3/2025", " " }));
        jComboBox12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 100, 30));

        jLabel34.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("26$");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 100, -1));

        jLabel36.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("40$");
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 50, 40));

        jLabel37.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("30$");
        jLabel37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 100, 20));

        jLabel38.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("48$");
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 100, 20));

        jLabel39.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("29$");
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 100, 20));

        jLabel40.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("26$");
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, 100, 20));

        jLabel41.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("26$");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 100, 30));

        jLabel42.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("30$");
        jLabel42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, 100, 30));

        jLabel43.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("26$");
        jLabel43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 100, 20));

        jLabel44.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("29$");
        jLabel44.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 100, 20));

        jLabel45.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("50$");
        jLabel45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 30, 30));

        jPanel10.setPreferredSize(new java.awt.Dimension(200, 260));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartoon_img/IMG-20241129-WA0104.jpg"))); // NOI18N
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 270));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 120, 180));

        jPanel6.setPreferredSize(new java.awt.Dimension(200, 260));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartoon_img/photo_2024-12-12_03-50-23.jpg"))); // NOI18N
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, -1));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 280));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 120, 180));

        jPanel9.setPreferredSize(new java.awt.Dimension(200, 260));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartoon_img/IMG-20241129-WA0065.jpg"))); // NOI18N
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 280));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 120, 180));

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartoon_img/ea5bf95aaba486d87e6f158cf7a74d2f.jpg"))); // NOI18N
        jLabel15.setIconTextGap(10
        );
        jPanel13.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 260));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 120, 180));

        jPanel12.setPreferredSize(new java.awt.Dimension(200, 260));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pos1.jpg"))); // NOI18N
        jLabel4.setIconTextGap(10
        );
        jPanel12.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 270));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 121, 180));

        jPanel11.setPreferredSize(new java.awt.Dimension(200, 260));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartoon_img/IMG-20241129-WA0122.jpg"))); // NOI18N
        jPanel11.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 280));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 120, 180));

        jLabel35.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("30$");
        jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 100, 20));

        jLabel18.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("The Croods");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 100, 20));

        jLabel25.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Migration");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 100, 40));

        jLabel33.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Frozen 2");
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 100, 20));

        jLabel26.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Secret Wings");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 120, 40));

        jLabel27.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Brave");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, 100, 20));

        jLabel28.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Moana");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, 100, 20));

        jLabel30.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("20$");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 100, 20));

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cartoonBG.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1083, 630));

        jLabel31.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Frozen 2");
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 100, 20));

        jLabel32.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Frozen 2");
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 100, 20));

        cartoon_cards.setBackground(new java.awt.Color(255, 0, 153));
        cartoon_cards.setLayout(new java.awt.CardLayout());

        card_elemental.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout card_elementalLayout = new javax.swing.GroupLayout(card_elemental);
        card_elemental.setLayout(card_elementalLayout);
        card_elementalLayout.setHorizontalGroup(
            card_elementalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        card_elementalLayout.setVerticalGroup(
            card_elementalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        cartoon_cards.add(card_elemental, "card2");

        jPanel1.add(cartoon_cards, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 630));

        cards.setBackground(new java.awt.Color(0, 153, 153));
        cards.setLayout(new java.awt.CardLayout());

        ele.setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout eleLayout = new javax.swing.GroupLayout(ele);
        ele.setLayout(eleLayout);
        eleLayout.setHorizontalGroup(
            eleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1083, Short.MAX_VALUE)
        );
        eleLayout.setVerticalGroup(
            eleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        cards.add(ele, "card2");

        jPanel16.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1083, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        cards.add(jPanel16, "card3");

        jPanel1.add(cards, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1083, 608));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

    }//GEN-LAST:event_btn2ActionPerformed

    private void navMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navMouseClicked

    }//GEN-LAST:event_navMouseClicked
    HomePage HP = null;
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (HP == null) {
            HP = new HomePage();
        }
        HP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked

    }//GEN-LAST:event_btn2MouseClicked

    private void luca_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luca_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_luca_checkActionPerformed

    private void dory_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dory_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dory_checkActionPerformed

    private void croods_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_croods_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_croods_checkActionPerformed

    private void raya_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raya_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raya_checkActionPerformed

    private void tan_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tan_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tan_checkActionPerformed

    private void ins__checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ins__checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ins__checkActionPerformed

    private void ele__checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ele__checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ele__checkActionPerformed

    private void mig_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mig_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mig_checkActionPerformed

    private void secret_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secret_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secret_checkActionPerformed

    private void brave_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brave_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brave_checkActionPerformed

    private void moana_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moana_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moana_checkActionPerformed

    private void frozen_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frozen_checkActionPerformed
//        Display("Frozen", "20$", "Cartoon", jComboBox12.getSelectedItem().toString());
    }//GEN-LAST:event_frozen_checkActionPerformed

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
            java.util.logging.Logger.getLogger(cartoon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cartoon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cartoon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cartoon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cartoon().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ButtonGroup;
    private javax.swing.JCheckBox brave_check;
    private javax.swing.JButton btn2;
    private javax.swing.JPanel card_elemental;
    private javax.swing.JPanel cards;
    private javax.swing.JPanel cartoon_cards;
    private javax.swing.JCheckBox croods_check;
    private javax.swing.JCheckBox dory_check;
    private javax.swing.JPanel ele;
    private javax.swing.JCheckBox ele__check;
    private javax.swing.JCheckBox frozen_check;
    private javax.swing.JCheckBox ins__check;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JCheckBox luca_check;
    private javax.swing.JCheckBox mig_check;
    private javax.swing.JCheckBox moana_check;
    private javax.swing.JPanel nav;
    private javax.swing.JCheckBox raya_check;
    private javax.swing.JCheckBox secret_check;
    private javax.swing.JCheckBox tan_check;
    // End of variables declaration//GEN-END:variables
}

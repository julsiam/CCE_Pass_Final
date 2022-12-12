/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sd_205_mongodb;

import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class BusinessPermit extends javax.swing.JFrame {

    /**
     * Creates new form BusinessPermit
     */
    public BusinessPermit() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        bServiceBTN = new javax.swing.JComboBox<>();
        homeBtn = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bDateApp = new javax.swing.JTextField();
        bTinNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        bAmmendmentForm = new javax.swing.JTextField();
        bTradeNum = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        bModePayement = new javax.swing.JTextField();
        bRegNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bTypeofBusiness = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        bFname = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        bMname = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        bLname = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        bGovEntityCombo = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        submitBtn = new javax.swing.JButton();
        minimizebtn = new javax.swing.JLabel();
        closebtn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        bBusinessAdd = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        bBusinessPostal = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        bBusinessHotNum = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator27 = new javax.swing.JSeparator();
        bOwnerPostal = new javax.swing.JTextField();
        bMnumber = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        bOwnerAdd = new javax.swing.JTextField();
        jSeparator31 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        bEmContact = new javax.swing.JTextField();
        jSeparator32 = new javax.swing.JSeparator();
        bTeleNum = new javax.swing.JTextField();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        bBusinessArea = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        bTotalEmployee = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 90));

        bServiceBTN.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        bServiceBTN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Services", "Birth Certificate", "Marriage Certificate", "CENOMAR", "Death Certificate", "Business Permit", "Scholarship", "Voters Certificate", "Appointment", "Suggestions" }));
        bServiceBTN.setBorder(null);
        jPanel1.add(bServiceBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 120, 30));

        homeBtn.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        homeBtn.setText("Home");
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
        });
        jPanel1.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 60, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 10, 40));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 1130, 10));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setText("Business Permit");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 230, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setText("Registrant Information");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setText("TIN Number");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 90, -1));

        bDateApp.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bDateApp.setBorder(null);
        jPanel2.add(bDateApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 150, 30));

        bTinNumber.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bTinNumber.setBorder(null);
        jPanel2.add(bTinNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, 150, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel11.setText("DTI/SEC/CDA/Reg.No.");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 150, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel12.setText("Mode of Payment");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 130, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 150, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 150, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 150, 10));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel14.setText("Ammendment To");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 30, 150, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel15.setText("Trade Name/ Franchise");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 190, 20));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 150, 10));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 150, 10));

        bAmmendmentForm.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bAmmendmentForm.setBorder(null);
        jPanel2.add(bAmmendmentForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 60, 150, 30));

        bTradeNum.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bTradeNum.setBorder(null);
        bTradeNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTradeNumActionPerformed(evt);
            }
        });
        jPanel2.add(bTradeNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 190, 30));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 190, 10));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel16.setText("Date of Birth");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 0, 20));

        bModePayement.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bModePayement.setBorder(null);
        jPanel2.add(bModePayement, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 150, 30));

        bRegNo.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bRegNo.setBorder(null);
        jPanel2.add(bRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setText("Date of Application");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 150, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel13.setText("Type of Business");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, -1));

        bTypeofBusiness.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bTypeofBusiness.setBorder(null);
        jPanel2.add(bTypeofBusiness, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 150, 30));

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 150, 10));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel17.setText("Ammendment From");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, 160, 20));

        jTextField7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jTextField7.setBorder(null);
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 60, 150, 30));

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 90, 150, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setText("Business Information");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel26.setText("First Name");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 130, -1));

        bFname.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bFname.setBorder(null);
        jPanel2.add(bFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 170, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel28.setText("Middle Name");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 130, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel29.setText("Last Name");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 130, -1));

        bMname.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bMname.setBorder(null);
        jPanel2.add(bMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 170, 30));

        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 170, 10));

        jSeparator23.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 170, 10));

        bLname.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bLname.setBorder(null);
        jPanel2.add(bLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 170, 30));

        jSeparator24.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 170, 10));

        bGovEntityCombo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bGovEntityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Choose-", "YES", "NO" }));
        bGovEntityCombo.setBorder(null);
        jPanel2.add(bGovEntityCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, 360, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel21.setText("Are you enjoying tax incentive from any Government Entity?");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 170, 410, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 1340, 260));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel8.setText("Sign-in");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 20, 60, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel6.setText("Sign-up");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 20, 80, 30));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 20, 20, 30));

        submitBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitBtn.setText("Submit Request");
        submitBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51), 3));
        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitBtnMouseClicked(evt);
            }
        });
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 750, 130, 30));

        minimizebtn.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        minimizebtn.setForeground(new java.awt.Color(102, 102, 102));
        minimizebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizebtn.setText("-");
        minimizebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizebtnMouseClicked(evt);
            }
        });
        jPanel1.add(minimizebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 0, 30, 30));

        closebtn.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        closebtn.setForeground(new java.awt.Color(102, 102, 102));
        closebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closebtn.setText("x");
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });
        jPanel1.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 0, 30, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel24.setText("Mobile Number");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 60, 130, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel27.setText("Business Address");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 130, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel31.setText("Owner's Address");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 130, -1));

        bBusinessAdd.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bBusinessAdd.setBorder(null);
        jPanel4.add(bBusinessAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 170, 30));

        jLabel32.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel32.setText("Business Postal Code");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 160, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel36.setText("Business Hotline No.");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 150, -1));

        bBusinessPostal.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bBusinessPostal.setBorder(null);
        jPanel4.add(bBusinessPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 170, 30));

        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 170, 10));

        jSeparator26.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 170, 10));

        bBusinessHotNum.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bBusinessHotNum.setBorder(null);
        jPanel4.add(bBusinessHotNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 170, 30));

        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 170, 10));

        jSeparator27.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 170, 10));

        bOwnerPostal.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bOwnerPostal.setBorder(null);
        jPanel4.add(bOwnerPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 90, 170, 30));

        bMnumber.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bMnumber.setBorder(null);
        jPanel4.add(bMnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 90, 170, 30));

        jSeparator30.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 120, 170, 10));

        jLabel37.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel37.setText("Other Information");
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        bOwnerAdd.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bOwnerAdd.setBorder(null);
        jPanel4.add(bOwnerAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 170, 30));

        jSeparator31.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 120, 170, 10));

        jLabel38.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel38.setText("Owners Postal Code");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, 130, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel20.setText("In case of emergency provide name of contact person.");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 370, -1));

        bEmContact.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bEmContact.setBorder(null);
        jPanel4.add(bEmContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 360, 30));

        jSeparator32.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 360, 10));

        bTeleNum.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bTeleNum.setBorder(null);
        jPanel4.add(bTeleNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 230, 30));

        jSeparator25.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 230, 10));

        jLabel30.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel30.setText("Tel/Phone Number");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 130, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel33.setText("Business Area");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 130, -1));

        bBusinessArea.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bBusinessArea.setBorder(null);
        jPanel4.add(bBusinessArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 170, 30));

        jSeparator21.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 170, 10));

        jLabel34.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel34.setText("Total No. of Employees in Establishment");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 280, -1));

        bTotalEmployee.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bTotalEmployee.setBorder(null);
        jPanel4.add(bTotalEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 170, 290, 30));

        jSeparator22.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, 290, 10));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 1340, 260));

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 740, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeBtnMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        CCE_Login a = new CCE_Login();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        CCE_Registration a = new CCE_Registration();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void submitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtnMouseClicked

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtnActionPerformed

    private void minimizebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizebtnMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizebtnMouseClicked

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_closebtnMouseClicked

    private void bTradeNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTradeNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bTradeNumActionPerformed

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnMouseClicked

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
            java.util.logging.Logger.getLogger(BusinessPermit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusinessPermit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusinessPermit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusinessPermit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusinessPermit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bAmmendmentForm;
    private javax.swing.JTextField bBusinessAdd;
    private javax.swing.JTextField bBusinessArea;
    private javax.swing.JTextField bBusinessHotNum;
    private javax.swing.JTextField bBusinessPostal;
    private javax.swing.JTextField bDateApp;
    private javax.swing.JTextField bEmContact;
    private javax.swing.JTextField bFname;
    private javax.swing.JComboBox<String> bGovEntityCombo;
    private javax.swing.JTextField bLname;
    private javax.swing.JTextField bMname;
    private javax.swing.JTextField bMnumber;
    private javax.swing.JTextField bModePayement;
    private javax.swing.JTextField bOwnerAdd;
    private javax.swing.JTextField bOwnerPostal;
    private javax.swing.JTextField bRegNo;
    private javax.swing.JComboBox<String> bServiceBTN;
    private javax.swing.JTextField bTeleNum;
    private javax.swing.JTextField bTinNumber;
    private javax.swing.JTextField bTotalEmployee;
    private javax.swing.JTextField bTradeNum;
    private javax.swing.JTextField bTypeofBusiness;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel closebtn;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel minimizebtn;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
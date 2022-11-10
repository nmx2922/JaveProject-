//NG MING XUAN 
//P2100043
//DIT/1B/01
package ca2;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

public class StudentUserGUI extends javax.swing.JFrame {

    StudentManagement detail = new StudentManagement();
    Timer timer;

    public StudentUserGUI() {
        initComponents();
        detail.setStuN(0);
        setText();
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Time in 24Hrs Format
                Date date = new Date();
                DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
                String time = timeFormat.format(date);
                lblTime.setText(time);

                //Todays Date
                Date date2 = new Date();
                DateFormat timeFormat2 = new SimpleDateFormat("dd/MM/yyyy");
                String time2 = timeFormat2.format(date2);
                lblDate.setText(time2);

            }
        };
        timer = new Timer(1000, actionListener);
        timer.setInitialDelay(0);
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField10 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtAdmin = new javax.swing.JTextField();
        txtCourse = new javax.swing.JTextField();
        txtGPA = new javax.swing.JTextField();
        txtOther = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        rbStudent = new javax.swing.JRadioButton();
        rbModule = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnModPrevious = new javax.swing.JButton();
        btnModNext = new javax.swing.JButton();
        btnModFirst = new javax.swing.JButton();
        btnModLast = new javax.swing.JButton();
        txtModCode = new javax.swing.JTextField();
        txtModName = new javax.swing.JTextField();
        txtCredit = new javax.swing.JTextField();
        txtMarks = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtmsg = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnStatistics1 = new javax.swing.JButton();

        jLabel12.setText("jLabel12");

        jButton13.setText("jButton13");

        jRadioButton3.setText("jRadioButton3");

        jTextField10.setText("jTextField10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Bahnschrift", 0, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel3.setText("Admin #:");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel4.setText("Course:");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel5.setText("GPA:");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel6.setText("Other Info:");

        btnPrevious.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnNext.setText("Next");
        btnNext.setActionCommand("");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N

        txtAdmin.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N

        txtCourse.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N

        txtGPA.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N

        txtOther.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(45, 45, 45)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOther, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtGPA, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                .addComponent(txtAdmin, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCourse))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFirst, btnLast, btnNext, btnPrevious});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(btnLast)
                    .addComponent(btnFirst))
                .addGap(29, 29, 29))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAdmin, txtCourse, txtGPA, txtName, txtOther});

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Bahnschrift", 0, 24))); // NOI18N

        btnSearch.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        rbStudent.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbStudent);
        rbStudent.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        rbStudent.setText("by Student");
        rbStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbStudentActionPerformed(evt);
            }
        });

        rbModule.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbModule);
        rbModule.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        rbModule.setText("by Module");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rbStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(rbModule)
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbStudent)
                    .addComponent(rbModule))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 2, 48)); // NOI18N
        jLabel1.setText("Mini Student System");

        jPanel5.setBackground(new java.awt.Color(255, 255, 254));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Module", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Bahnschrift", 0, 18))); // NOI18N
        jPanel5.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel13.setText("Module Code:");

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel14.setText("Module Name:");

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel15.setText("Credit Unit:");

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel16.setText("Marks:");

        btnModPrevious.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnModPrevious.setText("Previous");
        btnModPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModPreviousActionPerformed(evt);
            }
        });

        btnModNext.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnModNext.setText("Next");
        btnModNext.setActionCommand("");
        btnModNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModNextActionPerformed(evt);
            }
        });

        btnModFirst.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnModFirst.setText("First");
        btnModFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModFirstActionPerformed(evt);
            }
        });

        btnModLast.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnModLast.setText("Last");
        btnModLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModLastActionPerformed(evt);
            }
        });

        txtModCode.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N

        txtModName.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N

        txtCredit.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N

        txtMarks.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel16))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtModCode, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtModName, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(btnModPrevious)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModNext))
                            .addComponent(btnModFirst))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModLast)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnModFirst, btnModLast, btnModNext, btnModPrevious});

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCredit, txtMarks, txtModCode, txtModName});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtModCode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModPrevious)
                    .addComponent(btnModNext)
                    .addComponent(btnModLast)
                    .addComponent(btnModFirst))
                .addGap(6, 6, 6))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCredit, txtMarks, txtModCode, txtModName});

        btnPrint.setBackground(new java.awt.Color(153, 255, 204));
        btnPrint.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.setToolTipText("");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 102, 102));
        btnExit.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(102, 255, 102));
        btnReset.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        lblDate.setText("Date");

        lblTime.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        lblTime.setText("Time");

        txtmsg.setColumns(20);
        txtmsg.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        txtmsg.setRows(5);
        jScrollPane1.setViewportView(txtmsg);

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setText("Message:");

        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel9.setText("Time:");

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel10.setText("Date:");
        jLabel10.setToolTipText("");

        btnStatistics1.setBackground(new java.awt.Color(153, 255, 204));
        btnStatistics1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        btnStatistics1.setText("Statistics");
        btnStatistics1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatistics1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTime)
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDate)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(btnReset))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addComponent(btnPrint))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(657, 657, 657)
                        .addComponent(btnExit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(1040, Short.MAX_VALUE)
                    .addComponent(btnStatistics1)
                    .addGap(175, 175, 175)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnExit, btnPrint, btnReset});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTime)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDate)
                        .addComponent(jLabel10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrint)))
                .addGap(34, 34, 34)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addComponent(btnStatistics1)
                    .addContainerGap(658, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want exit?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {

            JOptionPane.showMessageDialog(null, "Program terminated.\nThank You!", "Message", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (confirm == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_btnExitActionPerformed


    private void Print(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print
        txtmsg.getText();
        IOFile data = new IOFile();
        data.print(txtmsg.getText());
        txtmsg.setText("Print successfully");
    }//GEN-LAST:event_Print


    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        detail.setMNum(0);
        detail.setStuN(0);
        txtName.setText(detail.getStudentN());
        txtCourse.setText(detail.getStudentMC());
        txtAdmin.setText(detail.getStudentAm());
        txtGPA.setText(detail.getGPA());
        txtOther.setText(detail.getType() + detail.getStudentPass());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, String.valueOf(detail.getStuN()) + "/" + String.valueOf(detail.getAllStu()) + " Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Bahnschrift", 0, 18))); // NOI18N

        txtModCode.setText(detail.getStudentMC());
        txtModName.setText(detail.getStudentMN());
        txtCredit.setText(detail.getStudentMCr());
        txtMarks.setText(detail.getStudentMM());
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, String.valueOf(detail.getMNum()) + "/" + String.valueOf(detail.getAllM()) + " Module", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Bahnschrift", 0, 18))); // NOI18N

        txtInput.setText("");
        txtmsg.setText("Reset successfully!");

        rbStudent.setSelected(true);

    }//GEN-LAST:event_btnResetActionPerformed


    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        detail.getStudent();
        if (rbStudent.isSelected()) {
            if ((txtInput.getText()).equals(" ")) {
                JOptionPane.showMessageDialog(null, "Please enter student name.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                detail.getSearchStudent(txtInput.getText());
                txtmsg.setText(detail.getSearchStudent(txtInput.getText()));
                setText();
            }
        } else if (rbModule.isSelected()) {
            if ((txtInput.getText()).equals(" ")) {
                JOptionPane.showMessageDialog(null, "Please enter module name.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                detail.getSearchModule(txtInput.getText());
                txtmsg.setText(detail.getSearchModule(txtInput.getText()));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select search by Student/Module.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed
//================ SET DISPLAY TEXTS =================//

    public void setText() {
        detail.getStudent();
        txtOther.setText(detail.getStudentPass() + detail.getType());
        txtName.setText(detail.getStudentN());
        txtCourse.setText(detail.getStudentC());
        txtAdmin.setText(detail.getStudentAm());
        txtGPA.setText(detail.getGPA());
        txtOther.setText(detail.getType() + detail.getStudentPass());
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, String.valueOf(detail.getStuN()) + "/" + String.valueOf(detail.getAllStu()) + " Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Bahnschrift", 0, 18))); // NOI18N
        txtModCode.setText(detail.getStudentMC());
        txtModName.setText(detail.getStudentMN());
        txtCredit.setText(detail.getStudentMCr());
        txtMarks.setText(detail.getStudentMM());
        txtmsg.setText(detail.getStatistic());
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, String.valueOf(detail.getMNum()) + "/" + String.valueOf(detail.getAllM()) + " Module", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Bahnschrift", 0, 18))); // NOI18N

    }

//================ BUTTONS TO NAVIGATE STUDENTS =================//
    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        try {
            detail.setStuN(detail.getStuN() - 2);
            setText();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "First student!", "Alert", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        detail.setStuN(0);
        setText();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            detail.setStuN(detail.getStuN());
            setText();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Last student!", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        detail.setStuN(detail.getAllStu() - 1);
        setText();
    }//GEN-LAST:event_btnLastActionPerformed

//================ BUTTONS TO NAVIGATE MODULES =================//
    private void btnModPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModPreviousActionPerformed
        try {
            int i = 0;
//             if(i>0){
//                 detail.setCurrent(i+1);
//             }else{
//            detail.setCurrent(i);
//             }
            detail.setMNum(detail.getpMNum());
            setText();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "This is the first Module!", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModPreviousActionPerformed

    private void btnModNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModNextActionPerformed
        try {
            int current = detail.getMNum();
//               if(current>1){
//                 detail.setCurrent(current+1);
//             }else{
//            detail.setCurrent(current);
//             }
            detail.setMNum(detail.getMNum());
            setText();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "This is the last Module!", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModNextActionPerformed

    private void btnModFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModFirstActionPerformed
        detail.setMNum(0);
        setText();
    }//GEN-LAST:event_btnModFirstActionPerformed

    private void btnModLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModLastActionPerformed
        detail.setMNum(detail.getAllM() - 1);
        setText();
    }//GEN-LAST:event_btnModLastActionPerformed

    private void rbStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbStudentActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_rbStudentActionPerformed

    private void btnStatistics1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatistics1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStatistics1ActionPerformed

//================ MAIN =================//
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
            java.util.logging.Logger.getLogger(StudentUserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentUserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentUserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentUserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentUserGUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnModFirst;
    private javax.swing.JButton btnModLast;
    private javax.swing.JButton btnModNext;
    private javax.swing.JButton btnModPrevious;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnStatistics1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JRadioButton rbModule;
    private javax.swing.JRadioButton rbStudent;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtCredit;
    private javax.swing.JTextField txtGPA;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtMarks;
    private javax.swing.JTextField txtModCode;
    private javax.swing.JTextField txtModName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOther;
    private javax.swing.JTextArea txtmsg;
    // End of variables declaration//GEN-END:variables
}

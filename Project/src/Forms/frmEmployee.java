/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entity.Department;
import Entity.Employee;
import Entity.Employee_phones;
import company_project.Tools;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HG
 */
public class frmEmployee extends javax.swing.JFrame {

    /**
     * Creates new form frmEmployee
     */
    public frmEmployee() {
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

        BtnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmpNo = new controls.JTextBox(15);
        txtEmpName = new controls.JTextBox(15);
        txtEmpAddress = new controls.JTextBox(15);
        txtEmpSalary = new controls.JTextBox(15);
        txtHiring = new com.toedter.calendar.JDateChooser();
        txtBirth = new com.toedter.calendar.JDateChooser();
        btnAdd = new controls.JMyButton();
        btnUpdate = new controls.JMyButton();
        btnDelete = new controls.JMyButton();
        btnFind = new controls.JMyButton();
        btnAll = new controls.JMyButton();
        btnclear = new controls.JMyButton();
        btnBack = new controls.JMyButton();
        jLabel9 = new javax.swing.JLabel();
        rdoNumber = new javax.swing.JRadioButton();
        rdoName = new javax.swing.JRadioButton();
        rdoAddress = new javax.swing.JRadioButton();
        rdoSalary = new javax.swing.JRadioButton();
        rdoHiring = new javax.swing.JRadioButton();
        rdoBirth = new javax.swing.JRadioButton();
        rdoDepartment = new javax.swing.JRadioButton();
        txtSearch = new controls.JTextBox(35);
        btnSearch = new controls.JMyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        cbxDept = new javax.swing.JComboBox<>();
        btnDeptAdd = new controls.JMyButton();
        jLabel10 = new javax.swing.JLabel();
        txtPhone = new controls.JTextBox(15);
        btnAddPhone = new controls.JMyButton();
        btnRemovePhone = new controls.JMyButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPhones = new javax.swing.JTable();
        rdoPhone = new javax.swing.JRadioButton();
        btnSearch1 = new controls.JMyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Employee");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Number:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Salary:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Hiring Date:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Birth Date:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Department:");

        txtEmpNo.setEditable(false);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnAll.setText("All");
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Search By:");

        rdoNumber.setBackground(new java.awt.Color(255, 255, 255));
        rdoNumber.setSelected(true);
        rdoNumber.setText("Number");

        rdoName.setBackground(new java.awt.Color(255, 255, 255));
        rdoName.setText("Name");

        rdoAddress.setBackground(new java.awt.Color(255, 255, 255));
        rdoAddress.setText("Address");

        rdoSalary.setBackground(new java.awt.Color(255, 255, 255));
        rdoSalary.setText("Salary");

        rdoHiring.setBackground(new java.awt.Color(255, 255, 255));
        rdoHiring.setText("Hiring");

        rdoBirth.setBackground(new java.awt.Color(255, 255, 255));
        rdoBirth.setText("Birth");

        rdoDepartment.setBackground(new java.awt.Color(255, 255, 255));
        rdoDepartment.setText("Department");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Name", "Address", "Salary", "Hire Date", "Birth Date", "Department Number", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        cbxDept.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));

        btnDeptAdd.setText("Add");
        btnDeptAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeptAddActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Phone");

        btnAddPhone.setText("+");
        btnAddPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPhoneActionPerformed(evt);
            }
        });

        btnRemovePhone.setText("-");
        btnRemovePhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePhoneActionPerformed(evt);
            }
        });

        tblPhones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Phones"
            }
        ));
        tblPhones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhonesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPhones);

        rdoPhone.setBackground(new java.awt.Color(255, 255, 255));
        rdoPhone.setText("Phone");

        btnSearch1.setText("Print");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemovePhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(cbxDept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHiring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeptAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rdoNumber)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rdoName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rdoAddress)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rdoSalary)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rdoHiring)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rdoBirth)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rdoDepartment)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rdoPhone))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(446, 446, 446)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtEmpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(txtEmpSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtHiring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbxDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDeptAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnRemovePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(rdoNumber)
                            .addComponent(rdoName)
                            .addComponent(rdoAddress)
                            .addComponent(rdoSalary)
                            .addComponent(rdoHiring)
                            .addComponent(rdoBirth)
                            .addComponent(rdoDepartment)
                            .addComponent(rdoPhone))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        Tools.openForm(new frmMain());
    }//GEN-LAST:event_btnBackActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        BtnGroup.add(rdoNumber);
        BtnGroup.add(rdoName);
        BtnGroup.add(rdoAddress);
        BtnGroup.add(rdoSalary);
        BtnGroup.add(rdoHiring);
        BtnGroup.add(rdoBirth);
        BtnGroup.add(rdoDepartment);
        BtnGroup.add(rdoPhone);
        ClearData();
        db.go.fillCombo("department", "DeptName", cbxDept);
        emp.getAllRows(tblEmployee);
        tblEmployee.getTableHeader().setReorderingAllowed(false);
        tblPhones.getTableHeader().setReorderingAllowed(false);
        
    }//GEN-LAST:event_formWindowOpened
Department dept=new Department();
    Employee emp=new Employee();
    private void btnDeptAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeptAddActionPerformed
        int deptNo=Integer.parseInt(dept.getAutoNumber());
        String deptName=(String)Tools.inputBox("Enter Department Name");
        String deptLocation=(String)Tools.inputBox("Enter Department Location");
        switch(deptName){
        case "":
                Tools.msgBox("Empty Name!");
                break;
        default :
                dept.setDeptNo(deptNo);
        dept.setDeptName(deptName);
        dept.setLocation(deptLocation);
        dept.add();
        db.go.fillCombo("department", "deptName", cbxDept);
        break;
        }
        
    }//GEN-LAST:event_btnDeptAddActionPerformed

    private void ClearData(){
    Tools.clearText(this);
    txtEmpNo.setText(emp.getAutoNumber());
    btnAdd.setEnabled(true);
    btnUpdate.setEnabled(false);
    btnDelete.setEnabled(false);
    DefaultTableModel model=(DefaultTableModel)tblPhones.getModel();
    model.setNumRows(0);
    
    txtEmpName.requestFocus();
    
    
    }
    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        ClearData();
        emp.getAllRows(tblEmployee);
    }//GEN-LAST:event_btnclearActionPerformed
private void setValuesFromTxt(){
        emp.setEmpNo(Integer.parseInt(txtEmpNo.getText()));
        emp.setEmpName(txtEmpName.getText());
        emp.setAddress(txtEmpAddress.getText());
        emp.setSalary(Double.parseDouble(txtEmpSalary.getText()));
        
        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
        String HDate=String.valueOf(f.format(txtHiring.getDate()));
        String BDate=String.valueOf(f.format(txtBirth.getDate()));
        emp.setHiringDate(HDate);
        emp.setBirthDate(BDate);
        
        String Dname=cbxDept.getSelectedItem().toString();
        emp.setDeptNo(Integer.parseInt(dept.getValueByName(Dname)));
        
        
}
Employee_phones phones=new Employee_phones();
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        setValuesFromTxt();
        emp.add();
        //Add Phones
        phones.setEmpNo(Integer.parseInt(txtEmpNo.getText().toString()));
         for(int i=0;i<tblPhones.getRowCount();i++){
         phones.setPhone(tblPhones.getValueAt(i, 0).toString());
         phones.add();
         }
        emp.getAllRows(tblEmployee);
        ClearData();
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
      setValuesFromTxt();
      emp.update();
      //Add Phones
        phones.setEmpNo(Integer.parseInt(txtEmpNo.getText().toString()));
        phones.deleteByEmp();
         for(int i=0;i<tblPhones.getRowCount();i++){
         phones.setPhone(tblPhones.getValueAt(i, 0).toString());
         phones.add();
         }
      emp.getAllRows(tblEmployee);
      ClearData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        int row=tblEmployee.getSelectedRow();
        int Empno=Integer.parseInt(tblEmployee.getValueAt(row, 0).toString());
        emp.setEmpNo(Empno);
        txtEmpNo.setText(String.valueOf(Empno));
        txtEmpName.setText(tblEmployee.getValueAt(row, 1).toString());
        txtEmpAddress.setText(tblEmployee.getValueAt(row, 2).toString());
        txtEmpSalary.setText(tblEmployee.getValueAt(row, 3).toString());
        
         SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd"); 
         String strTable=String.valueOf(tblEmployee.getValueAt(row, 4));
         String strTable2=String.valueOf(tblEmployee.getValueAt(row, 5));
        
        try {
             
            txtHiring.setDate(f.parse(strTable));
            txtBirth.setDate(f.parse(strTable2));
        } catch (ParseException ex) {
            Logger.getLogger(frmEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String Dname=String.valueOf(tblEmployee.getValueAt(row, 7));
        cbxDept.setSelectedItem(Dname);
        phones.setEmpNo(Integer.parseInt(txtEmpNo.getText()));
        phones.getAllRows(tblPhones);
        
        btnAdd.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
        
    }//GEN-LAST:event_tblEmployeeMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(Tools.confirmMsg("Do you want to delete '"+txtEmpName.getText()+"'")){
        setValuesFromTxt();
        phones.setEmpNo(Integer.parseInt(txtEmpNo.getText().toString()));
        phones.deleteByEmp(); 
        emp.delete();
        ClearData();
        emp.getAllRows(tblEmployee);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
        emp.getAllRows(tblEmployee);
    }//GEN-LAST:event_btnAllActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        int EmpNumber=Integer.parseInt(Tools.inputBox("Enter Employee Number").toString());
        emp.setEmpNo(EmpNumber);
        emp.getOneRow(tblEmployee);
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String Select="select * from employee_data where ";
       if(rdoNumber.isSelected()){
       Select+="number like '%"+txtSearch.getText()+"%'";
       }else if(rdoAddress.isSelected()){
       Select+="address like '%"+txtSearch.getText()+"%'";
       }else if(rdoBirth.isSelected()){
       Select+="date_of_birh like '%"+txtSearch.getText()+"%'";
       }else if(rdoDepartment.isSelected()){
       Select+="department_no like '%"+txtSearch.getText()+"%' or department like '%"+txtSearch.getText()+"%'";       
       }else if(rdoHiring.isSelected()){
       Select+="hiring_date like '%"+txtSearch.getText()+"%'";
       }else if(rdoName.isSelected()){
       Select+="name like '%"+txtSearch.getText()+"%'";
       }else if(rdoSalary.isSelected()){
       Select+="salary like '%"+txtSearch.getText()+"%'";
       }
       else{
           int employeeNo=Integer.parseInt(empPhone.getValueByName(txtSearch.getText()));
       Select+="number="+employeeNo;
       }
       emp.getCustomRows(Select, tblEmployee);
       
       
    }//GEN-LAST:event_btnSearchActionPerformed
    Employee_phones empPhone=new Employee_phones();
    private void btnAddPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPhoneActionPerformed
       DefaultTableModel model=(DefaultTableModel)tblPhones.getModel();
       model.addRow(new Object[]{txtPhone.getText()});
       txtPhone.setText("");
       txtPhone.requestFocus();
       int roow=tblPhones.getSelectedRow();
       if(tblPhones.isCellSelected(roow, 0)){
       model.removeRow(roow);
       }
       
    }//GEN-LAST:event_btnAddPhoneActionPerformed

    private void tblPhonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhonesMouseClicked
       int row=tblPhones.getSelectedRow();
        String selectedItem=tblPhones.getValueAt(row,0).toString();
        txtPhone.setText(selectedItem);
    }//GEN-LAST:event_tblPhonesMouseClicked

    private void btnRemovePhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePhoneActionPerformed
        DefaultTableModel model=(DefaultTableModel)tblPhones.getModel();
        int row=tblPhones.getSelectedRow();
        empPhone.setEmpNo(Integer.parseInt(txtEmpNo.getText()));
        empPhone.setPhone(tblPhones.getValueAt(row, 0).toString());

        model.removeRow(row);
    }//GEN-LAST:event_btnRemovePhoneActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
         Tools.printJTable(tblEmployee, "Employee");
    }//GEN-LAST:event_btnSearch1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BtnGroup;
    private controls.JMyButton btnAdd;
    private controls.JMyButton btnAddPhone;
    private controls.JMyButton btnAll;
    private controls.JMyButton btnBack;
    private controls.JMyButton btnDelete;
    private controls.JMyButton btnDeptAdd;
    private controls.JMyButton btnFind;
    private controls.JMyButton btnRemovePhone;
    private controls.JMyButton btnSearch;
    private controls.JMyButton btnSearch1;
    private controls.JMyButton btnUpdate;
    private controls.JMyButton btnclear;
    private javax.swing.JComboBox<String> cbxDept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdoAddress;
    private javax.swing.JRadioButton rdoBirth;
    private javax.swing.JRadioButton rdoDepartment;
    private javax.swing.JRadioButton rdoHiring;
    private javax.swing.JRadioButton rdoName;
    private javax.swing.JRadioButton rdoNumber;
    private javax.swing.JRadioButton rdoPhone;
    private javax.swing.JRadioButton rdoSalary;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTable tblPhones;
    private com.toedter.calendar.JDateChooser txtBirth;
    private javax.swing.JTextField txtEmpAddress;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmpNo;
    private javax.swing.JTextField txtEmpSalary;
    private com.toedter.calendar.JDateChooser txtHiring;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
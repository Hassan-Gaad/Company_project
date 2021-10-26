
package Entity;

import company_project.Tools;
import javax.swing.JTable;

public class Employee implements mainData {
    private int empNo;
    private String empName;
    private String address;
    private double salary;
    private String hiringDate;
    private String birthDate;
    private int deptNo;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(String hiringDate) {
        this.hiringDate = hiringDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public void add() {
      String strAdd ="insert into employee(empno,empname,address,salary,hiringdate,birthdate,deptno) values("
       +empNo+", '"+empName+"' ,'"+address+"' ,"
    +salary+", '"+hiringDate+"' , '"+birthDate+"' ,"+deptNo+")";
      boolean isAdd=db.go.runNonQuery(strAdd);
      if(isAdd){
      Tools.msgBox("Employee Is Added");
      }
    }

    @Override
    public void update() {
        String strUpdate="update employee set empname='"
                +empName+"', address='"+address+"',salary="
                +salary+", hiringdate='"+hiringDate+"', birthdate='"+birthDate+"', deptno="+deptNo+" where empno="+empNo;
        boolean isUpdate=db.go.runNonQuery(strUpdate);
        if(isUpdate){
        Tools.msgBox("Employee Updated Successfully");
        }
    }

    @Override
    public void delete() {
     String strdelete="delete from employee where empno="+empNo;
     boolean isDelete=db.go.runNonQuery(strdelete);
     if(isDelete){
     Tools.msgBox("Employee eleted Successfully");
     }
    }

    @Override
    public String getAutoNumber() {
        return db.go.getAutoNumber("employee", "empno");
    }

    @Override
    public void getAllRows(JTable table) {
    db.go.fillToJTable("employee_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect="select * from employee_data where number="+empNo;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String SelectStmt="select empno from employee where empname='"+name+"'";
        return db.go.getTableData(SelectStmt).item[0][0].toString();
    }

    @Override
    public String getNameByValue(String value) {
        String selectstmt="select empname from employee where empno="+value;
        return db.go.getTableData(selectstmt).item[0][0].toString();
    }
    
    
    
}

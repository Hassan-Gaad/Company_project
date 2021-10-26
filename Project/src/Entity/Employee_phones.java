
package Entity;

import company_project.Tools;
import javax.swing.JTable;

public class Employee_phones implements mainData{
  private int EmpNo;
private String Phone;

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Override
    public void add() {
      String sqlAdd="insert into employee_phones values("+EmpNo+",'"+Phone+"')";
      if(db.go.runNonQuery(sqlAdd)){
      //Tools.msgBox("Phone is added");
      }
    }

    @Override
    public void update() {
       Tools.msgBox("Update phone is not allowed here");
    }

    @Override
    public void delete() {
       String sqlDelete="delete from employee_phones where empno="+EmpNo+" and phones='"+Phone+"'";
      if(db.go.runNonQuery(sqlDelete)){
    //Tools.msgBox("Phone is deleted");
    }
    }
    
    public void deleteByEmp(){
    String strDelete="delete from employee_phones where empno="+EmpNo;
    if(db.go.runNonQuery(strDelete)){
    //Tools.msgBox("Phones is deleted");
    }
    }

    @Override
    public String getAutoNumber() {
     Tools.msgBox("getAutoNumber phones is not allowed here");
        return "";
     
    }

    @Override
    public void getAllRows(JTable table) {
        String sqlSelect="select phones from employee_phones where empno="+EmpNo;
        db.go.fillToJTable(sqlSelect, table);
        
    }

    @Override
    public void getOneRow(JTable table) {
        Tools.msgBox("getAllRows phones is not allowed here");
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
         Tools.msgBox("getCustomRows phones is not allowed here");
    }

    @Override
    public String getValueByName(String phone) {
       String getPhone="select empno from employee_phones where Phones ='"+phone+"'";
       return db.go.getTableData(getPhone).item[0][0].toString();
    }

    @Override
    public String getNameByValue(String value) {
        Tools.msgBox("getValueByName phones is not allowed here");
        return "";
    }
    
   

}

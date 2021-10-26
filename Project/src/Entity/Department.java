
package Entity;

import company_project.Tools;
import db.go;
import javax.swing.JTable;

public class Department implements mainData {
    private int DeptNo;
    private String DeptName;
    private String Location;

    public int getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(int DeptNo) {
        this.DeptNo = DeptNo;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    @Override
    public void add() {
        String Insert="insert into department values("
             +DeptNo+", '"
             +DeptName+"' ,"
             +"'"+Location+"')";
     boolean isAdd=db.go.runNonQuery(Insert);
     if(isAdd){
     Tools.msgBox("Department Is Added");
     }
    }

    @Override
    public void update() {
     String update="update department set "
             +"DeptName='"+DeptName+"',"
             +"Location='"+Location+"' "
             +"where DeptNo="+DeptNo;
     boolean isUpdate=db.go.runNonQuery(update);
     if(isUpdate){
     Tools.msgBox("Department Is Updated");
     }
    }

    @Override
    public void delete() {
      String delete="delete from department "
              +"where DeptNo="+DeptNo;
      boolean isDelete=db.go.runNonQuery(delete);
      if(isDelete){
      Tools.msgBox("Department Is Deleted");
      }
    }

    @Override
    public String getAutoNumber() {
     return db.go.getAutoNumber("Department", "DeptNo");
    
    }

    @Override
    public void getAllRows(JTable table) {
     db.go.fillToJTable("Department_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
     String strSelect="select * from department_data "
             +"where department_no="+DeptNo;
     db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
      String strSelect="select deptno from department "
              +"where deptname='"+name+"'";
      return (String)db.go.getTableData(strSelect).item[0][0];
      
    }

    @Override
    public String getNameByValue(String value) {
        String strSelect="select deptname from department where deptno="
                +value;
        return db.go.getTableData(strSelect).item[0][0].toString();
    }
}

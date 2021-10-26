
package Entity;

import company_project.Tools;
import javax.swing.JTable;

public class workOn implements mainData {
  private int empNo;
  private int projectNo;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(int projectNo) {
        this.projectNo = projectNo;
    }

    @Override
    public void add() {
        String stmt="insert into workon values("+empNo+","+projectNo+")";
        if(db.go.runNonQuery(stmt)){
        Tools.msgBox("Added Successfully");
        }
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        String stmt="delete from workon where empno="+empNo+" and projectno="+projectNo;
        if(db.go.runNonQuery(stmt)){
        Tools.msgBox("Deleted Successfully");
        }
    }

    @Override
    public String getAutoNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getAllRows(JTable table) {
       db.go.fillToJTable("workon_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String stmt="select * from workon_data where project_no="+projectNo;
        db.go.fillToJTable(stmt, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNameByValue(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

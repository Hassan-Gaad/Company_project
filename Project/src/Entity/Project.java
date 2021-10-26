
package Entity;

import company_project.Tools;
import javax.swing.JTable;

public class Project implements mainData {
   private int projectNo;
   private String projectName;
   private String location;
   private int deptNo;

    public int getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(int projectNo) {
        this.projectNo = projectNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public void add() {
        String statment="insert into project values("+projectNo+",'"+projectName+"','"+location+"',"+deptNo+")";
        if(db.go.runNonQuery(statment)){
        Tools.msgBox("Project Added Successfully");
        }
    }

    @Override
    public void update() {
     String statment="update project set projectname='"+projectName+"',location='"+location+"',deptno="+deptNo+" where projectno="+projectNo;
     if(db.go.runNonQuery(statment)){
     Tools.msgBox("Project updated Successfully");
     }
    }

    @Override
    public void delete() {
        String statment="delete from project where projectno="+projectNo;
        if(db.go.runNonQuery(statment)){
        Tools.msgBox("Project Deleted successfully");
        }
    }

    @Override
    public String getAutoNumber() {
            return db.go.getAutoNumber("project", "projectno");
    }

    @Override
    public void getAllRows(JTable table) {
       db.go.fillToJTable("project_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String statment="select * from project_data where project_no="+projectNo;
        db.go.fillToJTable(statment, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
       db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
       String statement="select projectno from project where projectname='"+name+"'";
      return db.go.getTableData(statement).item[0][0].toString();
    }

    @Override
    public String getNameByValue(String value) {
        String statement="select projectname from project where projectno="+value;
        return db.go.getTableData(statement).item[0][0].toString();
    }
}

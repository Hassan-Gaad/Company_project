/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import company_project.Tools;
import company_project.Tools.Table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


 
public class go {
    private static String url="";
    private static Connection  con;
    
    private static void setURL(){
    url="jdbc:mysql://localhost:3306/company"+"?useUnicode=true&characterEncoding=utf-8";
    
    }
    
    private static void setConnection(){
        try {
            setURL();
            con=DriverManager.getConnection(url,"root","");
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
        }
    
    }
    
    public static boolean checkUserAndPassword(String username,String password){
    
    try{
        setConnection();
        Statement stm=con.createStatement();
        String strCheck="select * from users where "+"username= '"
                +username+"' and " +"password='"
                +password+"'"; 
        stm.executeQuery(strCheck);
        
      
      
        while(stm.getResultSet().next()){
            
        String user=stm.getResultSet().getString("username");
        String pass=stm.getResultSet().getString("password");
        if(user.equals(username)&&pass.equals(password)){
        return true;
        }
        }
        con.close();
       
        
    }catch(SQLException ex){
    
    Tools.msgBox(ex.getMessage());
    
    }
    return false;
    }
    
    public static boolean runNonQuery(String sqlStatement){
    try{
    setConnection();
    Statement stmt=con.createStatement();
    stmt.execute(sqlStatement);
    con.close();
    return true;
    }catch(SQLException ex){
    Tools.msgBox(ex.getMessage());
    return false;
    } 
    }
    
    public static String getAutoNumber(String tableName,String columnName){
    try{
    setConnection();
    Statement stmt=con.createStatement();
    String Query="select max("+columnName+")+1 as autoNum from "+tableName;
    stmt.executeQuery(Query);
    String num="";
    while(stmt.getResultSet().next()){
    num=stmt.getResultSet().getString("autoNum");
    }
    if(num==null||num.equals("")){
    return "1";
    }else{
    return num;
    }
    }catch(SQLException ex){
    Tools.msgBox(ex.getMessage());
    return "0";
    }
    
    }
    
    
    public static Table getTableData(String statement){
    Tools f=new Tools();
    try{
    setConnection();
    Statement stmt=con.createStatement();
        ResultSet rs;
        rs=stmt.executeQuery(statement);
        ResultSetMetaData rsmd=rs.getMetaData();
        int colcount=rsmd.getColumnCount();
        Table table=f.new Table(colcount);
        while(rs.next()){
        Object row[]=new Object[colcount];
        for(int i=0;i<colcount;i++){
        row[i]=rs.getString(i+1);
        }
        table.addNewRow(row);
        
        }
        con.close();
        return table;
    }catch(SQLException ex){
    
    Tools.msgBox(ex.getMessage());
    return f.new Table(0);
    }

    }
    
    public static void fillCombo(String tableName,String columnName,JComboBox combo){
    try{
    setConnection();
    Statement stmt=con.createStatement();
    ResultSet rs;
    String strSelect="select "+columnName+" from "+tableName;
    rs=stmt.executeQuery(strSelect);
    rs.last();
    int rowCount=rs.getRow();
    rs.beforeFirst();
    String values[]=new String[rowCount];
    int i=0;
    while(rs.next()){
    values[i]=rs.getString(1);
    i++;
    }
    con.close();
    combo.setModel(new DefaultComboBoxModel(values));
    }catch(SQLException ex){
    Tools.msgBox(ex.getMessage());
    
    }
    
    
    
    
    }
    
    public static void fillToJTable(String tableNameOrSelectStatement,JTable table ){
    try{
    setConnection();
    Statement stmt=con.createStatement();
    ResultSet rs;
    String strSelect;
    if("select ".equals(tableNameOrSelectStatement.substring(0, 7).toLowerCase())){
       strSelect=tableNameOrSelectStatement;
    }else{
    strSelect="select * from "+tableNameOrSelectStatement;
    }
    rs=stmt.executeQuery(strSelect);
     ResultSetMetaData rsmd=rs.getMetaData();
     int col=rsmd.getColumnCount();
     DefaultTableModel model =(DefaultTableModel)table.getModel();
     Vector row=new Vector();
     model.setRowCount(0);
     
     while(rs.next()){
     row=new Vector(col);
     for(int i=0;i<col;i++){
     row.add(rs.getString(i+1));
     }
     model.addRow(row);
     }
     if(table.getColumnCount()!=col){
     Tools.msgBox("JTable Columns Count Not Equal To Query Columns Count \n JTable Query Count is "+table.getColumnCount()+"\n Query Columns Count is "+col);
     }
     con.close();
    }catch(SQLException ex){
    Tools.msgBox(ex.getMessage());
    }
    }   
}
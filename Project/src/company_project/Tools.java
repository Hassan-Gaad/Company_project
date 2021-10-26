package company_project;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.io.File;
import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JTextField;
import java.io.PrintWriter;
import java.text.MessageFormat;
import javax.swing.JTable;
public class Tools{

    //show message dialoge
    public static void msgBox(String message){
   JOptionPane.showMessageDialog(null, message);
    }

    public static boolean confirmMsg(String messge){
    int msgC=JOptionPane.showConfirmDialog(null, messge);
    if(msgC==JOptionPane.YES_OPTION){
    return true;
    
    }else{
    return false;
    
    }
    
    }
    
    
    //Creat folder
    public static void createFolder(String folderName,String path){
    File f=new File(path+"/"+folderName);
    f.mkdir();
    
    }
    
    //open new form 
    public static void openForm(JFrame form){
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(2);
        form.getContentPane().setBackground(new Color(255,255,255));
        try {
            Image img=ImageIO.read(Tools.class.getResource("emp.png"));
            form.setIconImage(img);
            form.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //clear text
    public static void clearText(Container form ){
        for(Component c : form.getComponents())
        if(c instanceof JTextField){
        JTextField txt=(JTextField)c;
        txt.setText("");
        }else if(c instanceof Container){
            clearText((Container)c);
        }
    
    }
    
    //creat empty file
    public static void creatNewFile(String fileName){
        try{
    File f=new File(fileName+".txt");
    f.createNewFile();
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
    
    }
    
    //creat filled file
    public static void creatFilledFile(String fileName,Object data[]){
        try {
            PrintWriter pw=new PrintWriter(fileName+".txt");
            for(Object obj : data){
            pw.print(obj+" ");
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    //create multi empty files
    public static void createEmptyFiles(String fileNames[]){
    for(String str : fileNames){
        creatNewFile(str);
    }
    
    }
    
    //creat filled files
    public static void createMultiFilledFiles(String filesNames[],Object allData[][]){
        for(int x=0;x<allData.length;x++){
            creatFilledFile(filesNames[x], allData[x]);
        }
    }
    
    //input box
    public static Object inputBox(String title){
    Object obj=JOptionPane.showInputDialog(title);
    return obj;
    
    }
    
    //get numbers from string
    public static String getNumFromString(String Text){
        String str="";
        String str2="";
        for (char c : Text.toCharArray()){
        if(c=='0' ||c=='1' ||c=='2' ||c=='3' ||c=='4' ||c=='5' ||c=='6' ||c=='7' ||c=='8' ||c=='9'){
            str+=c;
        
        }
        }
        
    return  str;
    
    }
    
    //get only string from string
    public static String getOnlyStrFromString(String Text){
        String str="";

        for (char c : Text.toCharArray()){
        if(!(c=='0' ||c=='1' ||c=='2' ||c=='3' ||c=='4' ||c=='5' ||c=='6' ||c=='7' ||c=='8' ||c=='9')){
            str+=c;
        
        }
        }
        
    return  str;
    }
    
    //print screen 
    public static void printScreen(String imgName){
        try {
            Robot r=new Robot();
            Rectangle rec=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img =r.createScreenCapture(rec);
            ImageIO.write(img, "jpg", new File(imgName+".jpg"));
        } catch (AWTException | HeadlessException | IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//print screen without the frame
    public static void printScreen(String imgName,JFrame form){
        try {
            form.setState(1);
            Robot r=new Robot();
            Rectangle rec=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img =r.createScreenCapture(rec);
            ImageIO.write(img, "jpg", new File(imgName+".jpg"));
            form.setState(0);
        } catch (AWTException | HeadlessException | IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
    public static class StringTools{

    String text;
    private String inverseText;
    
    public StringTools(String text){
        this.text = text;
    }
    
    public void printCharByChar(){
        for(char c : text.toCharArray()){
            System.out.println(c);
        }
    }
    
    public void printCharByCharInverse(){
        StringBuilder sb = new StringBuilder(text);
        inverseText = sb.reverse().toString();
        for(char c : inverseText.toCharArray()){
            System.out.println(c);
        }
    }
    
}
    
public class Table{
    
    public int columns;
       public  Object [][] item;
    
public Table(int columns){
this.columns=columns; 
item=new Object[0][columns];
}
    
public void addNewRow(Object row[]){
    Object [][] tempItem=item;    
item=new Object[item.length+1][columns];
for(int count=0;count<tempItem.length;count++){
item[count]=tempItem[count];
}
item[item.length-1]=row;
} 

public void printItems(){
for(Object [] item1 : item){

for(Object num : item1){
System.out.print(num+"  ");
}
System.out.println();
}

}

public void Edit(int row, int col,Object newValue){
item[row][col]=newValue;
}

public void deleteRow(int rowNum){
  int y=0;
  rowNum-=1;
Object [][] TempItem=item;
item=new Object [item.length-1][columns];
for(int x=0;x<TempItem.length;x++){
if(x!=rowNum){
item[y]=TempItem[x];
y++;
}

}

}

public Object getValue(int row ,int col){
return item[row][col];

}

public void getRow(int row){
for(int x=0;x<item[row].length;x++){
System.out.print(item[row][x]+" ");
}
System.out.println();
}

}

public class mergeArray {
 Object[] array1;
 Object[] array2;
public mergeArray(Object[]array1,Object[]array2){
    this.array1=array1;
    this.array2=array2;
}
public Object[]merge2Arr(){
int siz1=array1.length;
int siz2=array2.length;
Object rArray[]=new Object[siz1+siz2];
System.arraycopy(array1, 0, rArray, 0, siz1);
System.arraycopy(array2, 0, rArray, siz1,siz2);
return rArray;
}

}
//print Jtable
public static void printJTable(JTable table,String title){
      
      try {
            MessageFormat header=new MessageFormat(title+" Report");
            MessageFormat footer=new MessageFormat("page - {0}");
            table.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } catch (PrinterException ex) {
            Tools.msgBox(ex.getMessage());
        }

}

}
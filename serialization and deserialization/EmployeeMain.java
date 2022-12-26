import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
class EmployeeMain{
    public static void main(String []args) throws IOException{
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Simran");

        FileOutputStream fileOutputStream= new FileOutputStream("C:/Users/HP/OneDrive/Desktop/java/exam.ser");
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(emp);
        objectOutputStream.close();
        fileOutputStream.close();


    }
}
import java.io.FileInputStream;
import java.io.ObjectInputStream; 
public class deserization {
    public static void main(String[] args) {
        try {
        ObjectInputStream fin = new ObjectInputStream(new
       FileInputStream("/home/yus-vengeance/Desktop/6 sem /f1.txt"));
        Student s = (Student)fin.readObject();
        System.out.println(s.id+" "+s.name+" "+s.age);
        fin.close();
        }catch(Exception e) {
        System.out.println(e);
        }
        } 
}

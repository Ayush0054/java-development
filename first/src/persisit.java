import java.io.Serializable;
import java.io.*;
class Student implements Serializable{
 int id;
 String name;
 transient int age;
 Student (int id, String name, int age){
 this.id = id;
 this.name = name;
 this.age = age;
 }
} 
public class persisit {
    public static void main(String [] args) {
        try {
        Student s1 = new Student(123, "Ravi", 22); 
        FileOutputStream fout = new FileOutputStream("/home/yus-vengeance/Desktop/6 sem /f1.txt");
        
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(s1);
        out.flush();
        out.close();
        System.out.println("Success...");
        }catch(Exception e) {
        System.out.println(e);
        }
        } 
}

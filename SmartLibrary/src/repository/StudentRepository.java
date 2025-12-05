package repository;

import model.Student;
import database.Database;
import java.sql.*;
import java.util.*;

public class StudentRepository {

    public void add(Student s){
        try (Connection con = Database.connect()){
            PreparedStatement ps = con.prepareStatement("INSERT INTO students(name, department) VALUES(?,?)");
            ps.setString(1, s.name);
            ps.setString(2, s.department);
            ps.execute();
        } catch (Exception e){ e.printStackTrace(); }
    }

    public List<Student> getAll(){
        List<Student> list = new ArrayList<>();
        try (Connection con = Database.connect()){
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM students");
            while (rs.next()){
                list.add(new Student(rs.getInt("id"), rs.getString("name"),
                                     rs.getString("department")));
            }
        } catch (Exception e){ e.printStackTrace(); }
        return list;
    }
}

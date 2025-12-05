package repository;

import model.Loan;
import database.Database;
import java.sql.*;
import java.util.*;

public class LoanRepository {

    public void add(Loan l){
        try (Connection con = Database.connect()){
            PreparedStatement ps = con.prepareStatement("INSERT INTO loans(bookId, studentId, dateBorrowed) VALUES(?,?,?)");
            ps.setInt(1, l.bookId);
            ps.setInt(2, l.studentId);
            ps.setString(3, l.dateBorrowed);
            ps.execute();
        } catch (Exception e){ e.printStackTrace(); }
    }

    public List<Loan> getAll(){
        List<Loan> list = new ArrayList<>();
        try (Connection con = Database.connect()){
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM loans");
            while (rs.next()){
                list.add(new Loan(rs.getInt("id"), rs.getInt("bookId"),
                                  rs.getInt("studentId"), rs.getString("dateBorrowed"),
                                  rs.getString("dateReturned")));
            }
        } catch (Exception e){ e.printStackTrace(); }
        return list;
    }

    public void updateReturnDate(int id, String date){
        try (Connection con = Database.connect()){
            PreparedStatement ps = con.prepareStatement("UPDATE loans SET dateReturned=? WHERE id=?");
            ps.setString(1, date);
            ps.setInt(2, id);
            ps.execute();
        } catch (Exception e){ e.printStackTrace(); }
    }
}

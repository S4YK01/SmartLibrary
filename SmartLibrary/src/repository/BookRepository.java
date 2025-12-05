package repository;

import model.Book;
import database.Database;
import java.sql.*;
import java.util.*;

public class BookRepository {

    public void add(Book b){
        try (Connection con = Database.connect()){
            PreparedStatement ps = con.prepareStatement("INSERT INTO books(title, author, year) VALUES(?,?,?)");
            ps.setString(1, b.title);
            ps.setString(2, b.author);
            ps.setInt(3, b.year);
            ps.execute();
        } catch (Exception e){ e.printStackTrace(); }
    }

    public List<Book> getAll(){
        List<Book> list = new ArrayList<>();
        try (Connection con = Database.connect()){
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM books");
            while (rs.next()){
                list.add(new Book(rs.getInt("id"), rs.getString("title"),
                                  rs.getString("author"), rs.getInt("year")));
            }
        } catch (Exception e){ e.printStackTrace(); }
        return list;
    }
}

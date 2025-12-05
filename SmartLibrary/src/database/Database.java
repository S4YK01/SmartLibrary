package database;

import java.sql.*;

public class Database {

    public static Connection connect(){
        try {
            return DriverManager.getConnection("jdbc:sqlite:smartlibrary.db");
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void createTables(){
        try (Connection con = connect()){
            Statement st = con.createStatement();

            st.execute("CREATE TABLE IF NOT EXISTS books(id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, author TEXT, year INTEGER)");
            st.execute("CREATE TABLE IF NOT EXISTS students(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, department TEXT)");
            st.execute("CREATE TABLE IF NOT EXISTS loans(id INTEGER PRIMARY KEY AUTOINCREMENT, bookId INTEGER, studentId INTEGER, dateBorrowed TEXT, dateReturned TEXT)");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

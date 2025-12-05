package model;

public class Loan {
    public int id;
    public int bookId;
    public int studentId;
    public String dateBorrowed;
    public String dateReturned;

    public Loan(int id, int bookId, int studentId, String dateBorrowed, String dateReturned){
        this.id=id;
        this.bookId=bookId;
        this.studentId=studentId;
        this.dateBorrowed=dateBorrowed;
        this.dateReturned=dateReturned;
    }

    @Override
    public String toString(){
        return id + " - Book:" + bookId + " Student:" + studentId +
               " Borrowed:" + dateBorrowed + " Returned:" + dateReturned;
    }
}

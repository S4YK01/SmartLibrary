import java.util.*;
import repository.*;
import model.*;
import database.Database;

public class SmartLibrary {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Database db = new Database();
            db.createTables();

            BookRepository bookRepo = new BookRepository();
            StudentRepository studentRepo = new StudentRepository();
            LoanRepository loanRepo = new LoanRepository();

            while (true) {
            System.out.println("===== SmartLibrary =====");
            System.out.println("1. Kitap Ekle");
            System.out.println("2. Kitapları Listele");
            System.out.println("3. Öğrenci Ekle");
            System.out.println("4. Öğrencileri Listele");
            System.out.println("5. Kitap Ödünç Ver");
            System.out.println("6. Ödünç Listesini Görüntüle");
            System.out.println("7. Kitap Geri Teslim Al");
            System.out.println("8. Çıkış");
            System.out.print("Seçiminiz: ");
            int sec = sc.nextInt();
            sc.nextLine();

            switch (sec) {
                case 1:
                    System.out.print("Kitap adı: ");
                    String t = sc.nextLine();
                    System.out.print("Yazar: ");
                    String a = sc.nextLine();
                    System.out.print("Yıl: ");
                    int y = sc.nextInt();
                    sc.nextLine();
                    bookRepo.add(new Book(0, t, a, y));
                    break;

                case 2:
                    for (Book b : bookRepo.getAll())
                        System.out.println(b);
                    break;

                case 3:
                    System.out.print("Öğrenci adı: ");
                    String n = sc.nextLine();
                    System.out.print("Bölüm: ");
                    String d = sc.nextLine();
                    studentRepo.add(new Student(0, n, d));
                    break;

                case 4:
                    for (Student s : studentRepo.getAll())
                        System.out.println(s);
                    break;

                case 5:
                    System.out.print("Öğrenci ID: ");
                    int sid = sc.nextInt();
                    System.out.print("Kitap ID: ");
                    int bid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tarih: ");
                    String date = sc.nextLine();
                    loanRepo.add(new Loan(0, bid, sid, date, null));
                    break;

                case 6:
                    for (Loan l : loanRepo.getAll())
                        System.out.println(l);
                    break;

                case 7:
                    System.out.print("Loan ID: ");
                    int lid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Teslim tarihi: ");
                    String ret = sc.nextLine();
                    loanRepo.updateReturnDate(lid, ret);
                    break;

                case 8:
                    System.exit(0);
            }
            }
        }
    }
}

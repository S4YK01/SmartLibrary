📚 SmartLibrary
Java OOP + SQLite ile Akıllı Kütüphane Yönetim Sistemi
<p align="center"> <img src="https://img.icons8.com/external-flaticons-flat-flat-icons/512/external-library-university-flaticons-flat-flat-icons-2.png" width="140"/> </p>
⭐ Proje Hakkında

SmartLibrary, Java OOP, JDBC ve SQLite kullanılarak hazırlanmış basit bir kütüphane yönetim sistemidir.
Bu sistemde kitaplar, öğrenciler ve ödünç alma işlemleri yönetilebilir.

Proje;
✔ Nesneye Dayalı Programlama (OOP)
✔ Sınıflar, kalıtım ve kompozisyon
✔ JDBC CRUD işlemleri
✔ PreparedStatement
✔ SQLite veritabanı yönetimi
✔ Konsol tabanlı menü

gibi kavramları uygulamalı olarak göstermektedir.

🧱 Proje İçeriği
📁 Sınıflar

Book → Kitap bilgilerini tutar

Student → Öğrenci bilgilerini tutar

Loan → Ödünç işlemlerini tutar

Database → SQLite bağlantı yönetimi

Repository Class’lar

BookRepository

StudentRepository

LoanRepository

Bu sınıflar üzerinde tam CRUD işlemleri uygulanır.

🗄️ Veritabanı Yapısı
📘 books tablosu
Alan	Tür
id	INTEGER PRIMARY KEY AUTOINCREMENT
title	TEXT
author	TEXT
year	INTEGER
🎓 students tablosu
Alan	Tür
id	INTEGER PRIMARY KEY AUTOINCREMENT
name	TEXT
department	TEXT
📦 loans tablosu
Alan	Tür
id	INTEGER PRIMARY KEY AUTOINCREMENT
bookId	INTEGER
studentId	INTEGER
dateBorrowed	TEXT
dateReturned	TEXT
🎮 Uygulama Menüsü
===== SmartLibrary =====
1. Kitap Ekle
2. Kitapları Listele
3. Öğrenci Ekle
4. Öğrencileri Listele
5. Kitap Ödünç Ver
6. Ödünç Listesini Görüntüle
7. Kitap Geri Teslim Al
8. Çıkış
Seçiminiz:

🔧 Kurulum ve Çalıştırma
1️⃣ Projeyi indirin
git clone https://github.com/KULLANICI_ADI/SmartLibrary

2️⃣ SQLite JDBC driver’ını ekleyin

sqlite-jdbc.jar → lib klasörüne ekleyin.

3️⃣ Projeyi çalıştırın
javac -cp ".;lib/sqlite-jdbc.jar" -d bin src/*.java
java -cp ".;bin;lib/sqlite-jdbc.jar" Main

🧩 Kullanılan Teknolojiler

☕ Java 17+

🗄️ SQLite

🔌 JDBC

🧱 OOP, Sınıflar, Inheritance, Composition

📦 ArrayList & Koleksiyonlar

👤 Geliştirici

Ceyhun Emre Şener
Öğrenci No: 20230108065

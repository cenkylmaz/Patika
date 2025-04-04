package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Değerlendirme formu 1: Proje başlatıldı ve temel yapı oluşturuldu
public class LibraryManagementSystem {
    // Değerlendirme formu 2: Veri yapıları tanımlandı
    private static Map<Integer, Book> books = new HashMap<>();
    private static Map<Integer, Member> members = new HashMap<>();
    private static List<BorrowRecord> borrowRecords = new ArrayList<>();
    private static int nextBookId = 1;
    private static int nextMemberId = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Değerlendirme formu 3: Ana menü oluşturuldu
        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. List All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Add Member");
            System.out.println("5. List All Members");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. List Borrowed Books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    listAllBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    addMember();
                    break;
                case 5:
                    listAllMembers();
                    break;
                case 6:
                    borrowBook();
                    break;
                case 7:
                    returnBook();
                    break;
                case 8:
                    listBorrowedBooks();
                    break;
                case 0:
                    System.out.println("Exiting system...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Değerlendirme formu 4: Kitap ekleme fonksiyonu
    private static void addBook() {
        System.out.println("\n--- Add New Book ---");
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter publication year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Book book = new Book(nextBookId++, title, author, year);
        books.put(book.getId(), book);
        System.out.println("Book added successfully! ID: " + book.getId());
    }

    // Değerlendirme formu 5: Tüm kitapları listeleme
    private static void listAllBooks() {
        System.out.println("\n--- All Books ---");
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    // Değerlendirme formu 6: Kitap arama fonksiyonu
    private static void searchBook() {
        System.out.println("\n--- Search Book ---");
        System.out.print("Enter search term (title or author): ");
        String searchTerm = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (Book book : books.values()) {
            if (book.getTitle().toLowerCase().contains(searchTerm) ||
                    book.getAuthor().toLowerCase().contains(searchTerm)) {
                System.out.println(book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found matching your search.");
        }
    }

    // Değerlendirme formu 7: Üye ekleme fonksiyonu
    private static void addMember() {
        System.out.println("\n--- Add New Member ---");
        System.out.print("Enter member name: ");
        String name = scanner.nextLine();
        System.out.print("Enter member email: ");
        String email = scanner.nextLine();

        Member member = new Member(nextMemberId++, name, email);
        members.put(member.getId(), member);
        System.out.println("Member added successfully! ID: " + member.getId());
    }

    private static void listAllMembers() {
        System.out.println("\n--- All Members ---");
        if (members.isEmpty()) {
            System.out.println("No members registered.");
            return;
        }

        for (Member member : members.values()) {
            System.out.println(member);
        }
    }

    // Değerlendirme formu 8: Kitap ödünç alma fonksiyonu
    private static void borrowBook() {
        System.out.println("\n--- Borrow Book ---");
        System.out.print("Enter member ID: ");
        int memberId = scanner.nextInt();
        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (!members.containsKey(memberId)) {
            System.out.println("Member not found.");
            return;
        }

        if (!books.containsKey(bookId)) {
            System.out.println("Book not found.");
            return;
        }

        Book book = books.get(bookId);
        if (book.isBorrowed()) {
            System.out.println("Book is already borrowed.");
            return;
        }

        book.setBorrowed(true);
        borrowRecords.add(new BorrowRecord(memberId, bookId));
        System.out.println("Book borrowed successfully!");
    }

    // Değerlendirme formu 9: Kitap iade fonksiyonu
    private static void returnBook() {
        System.out.println("\n--- Return Book ---");
        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (!books.containsKey(bookId)) {
            System.out.println("Book not found.");
            return;
        }

        Book book = books.get(bookId);
        if (!book.isBorrowed()) {
            System.out.println("This book is not currently borrowed.");
            return;
        }

        book.setBorrowed(false);
        borrowRecords.removeIf(record -> record.getBookId() == bookId);
        System.out.println("Book returned successfully!");
    }

    private static void listBorrowedBooks() {
        System.out.println("\n--- Borrowed Books ---");
        if (borrowRecords.isEmpty()) {
            System.out.println("No books currently borrowed.");
            return;
        }

        for (BorrowRecord record : borrowRecords) {
            Book book = books.get(record.getBookId());
            Member member = members.get(record.getMemberId());
            System.out.println("Book: " + book.getTitle() + " | Borrowed by: " + member.getName());
        }
    }
}

// Değerlendirme formu 10: Kitap sınıfı
class Book {
    private int id;
    private String title;
    private String author;
    private int publicationYear;
    private boolean isBorrowed;

    public Book(int id, String title, String author, int publicationYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
    }

    // Getters and setters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }
    public boolean isBorrowed() { return isBorrowed; }
    public void setBorrowed(boolean borrowed) { isBorrowed = borrowed; }

    @Override
    public String toString() {
        return "ID: " + id + " | Title: " + title + " | Author: " + author +
                " | Year: " + publicationYear + " | Status: " +
                (isBorrowed ? "Borrowed" : "Available");
    }
}

// Değerlendirme formu 11: Üye sınıfı
class Member {
    private int id;
    private String name;
    private String email;

    public Member(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Email: " + email;
    }
}

// Değerlendirme formu 12: Ödünç kayıt sınıfı
class BorrowRecord {
    private int memberId;
    private int bookId;

    public BorrowRecord(int memberId, int bookId) {
        this.memberId = memberId;
        this.bookId = bookId;
    }

    // Getters
    public int getMemberId() { return memberId; }
    public int getBookId() { return bookId; }
}

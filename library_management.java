import java.util.Scanner;

class Library {
    private String bookName;
    private String authorName;
    private double price;
    private int copies;

    public void readBook(Scanner sc) {

        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();

        System.out.print("Enter Author Name: ");
        authorName = sc.nextLine();

        System.out.print("Enter Book Price: ");
        price = sc.nextDouble();

        System.out.print("Enter Number of Copies: ");
        copies = sc.nextInt();
        sc.nextLine();
    }

    public void displayBook() {

        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + authorName);
        System.out.println("Price: " + price);
        System.out.println("Copies: " + copies);
    }

    public boolean searchByName(String name) {
        return bookName.equalsIgnoreCase(name);
    }

    public boolean searchByAuthor(String author) {
        return authorName.equalsIgnoreCase(author);
    }

    public int getCopies() {
        return copies;
    }
}

public class library_management {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library[] books = new Library[5];

        System.out.println("Enter Details of 5 Books");

        for (int i = 0; i < 5; i++) {

            System.out.println("Book " + (i + 1));

            books[i] = new Library();

            books[i].readBook(sc);
        }

        System.out.println("Books in Library:");

        for (int i = 0; i < 5; i++) {
            books[i].displayBook();
        }

        System.out.print("Enter Book Name to Search: ");
        String searchName = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < 5; i++) {

            if (books[i].searchByName(searchName)) {

                found = true;

                if (books[i].getCopies() > 0) {
                    System.out.println("Book is Available.");
                    System.out.println("Number of Copies: " + books[i].getCopies());                    
                } 
                else {
                    System.out.println("Book is Not Available.");
                }
            }
        }

        if (!found) {
            System.out.println("Book Not Found in Library.");
        }

        System.out.print("Enter Author Name to Search: ");
        String searchAuthor = sc.nextLine();

        found = false;

        System.out.println("Books by Author:");

        for (int i = 0; i < 5; i++) {

            if (books[i].searchByAuthor(searchAuthor)) {

                books[i].displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Books Found by this Author.");
        }

        sc.close();
    }
}

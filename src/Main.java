public class Main {
    public static void main(String[] args){
        Library library = new Library();

        // Feature 1: Add books
        library.addBook(new Book(1, "Clean Code", "Robert Martin"));
        library.addBook(new Book(2, "Effective Java", "Joshua Bloch")); 
        library.addBook(new Book(3, "Head First Java", "Kathy Sierra"));
        
        // Feature 2: Display all books
        System.out.println("---All books---");
        library.displayAll();

        // Feature 3: Search by title
        System.out.println("---Search 'java'---");
        library.searchByTitle("java");
        
        // Feature 4: Delete a book
        System.out.println("---Delete id 2---");
        library.deleteBook(2);
        library.displayAll();

        // Feature 5: Add members
        library.addMember(new Member(101, "Amit"));
        library.addMember(new Member(102, "Rahul"));
        
        // Feature 6: Display all members
        System.out.println("---All members---");
        library.displayMembers();
    }      
}

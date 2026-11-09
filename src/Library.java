import java.util.ArrayList;

// Library keeps all books in an Arraylist and provides the main operations.
public class Library {

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();

    // Feature 1: Add a book
    void addBook(Book book){
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    // Feature 2: Display all books
    void displayAll(){
        if(books.isEmpty()){
            System.out.println("No books in the library.");
            return;
        }
        for(Book b : books){
            b.display();
        }
    }

    // Feature 3: Search by title (ignores case, partial match is allowed)
    void searchByTitle(String title){
        boolean found = false;
        for(Book b : books){
            if(b.title.toLowerCase().contains(title.toLowerCase())){
                b.display();
                found = true;
            }
        }
        if(!found){
            System.out.println("No book found with title: " + title);
        }
    }

    // Feature 4: Delete a book by id
    void deleteBook(int id){
        for(int i=0; i<books.size(); i++){
            if(books.get(i).id == id){
                System.out.println("Deleted: " + books.get(i).title);
                books.remove(i);
                return;
            }
        }
        System.out.println("No book found with id: " + id);
    }

    // Feature 5: Add a member
    void addMember(Member member){
        members.add(member);
        System.out.println("Member added: " + member.name);
    }
    // Feature 6: Display all members
    void displayMembers(){
        if(members.isEmpty()){
            System.out.println("No members yet.");
            return;
        }
        for(Member m : members){
            m.display();
        }
    }
    
}

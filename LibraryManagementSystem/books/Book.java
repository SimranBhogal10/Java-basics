package LibraryManagementSystem.books;

public class Book {
    
    public int bookID;
    public String bookName;
    public int availableCount;

    public Book(int id, String name, int count){
        this.bookID= id;
        this.bookName= name;
        this.availableCount= count;
    }
    public int getBookId() {
        return this.bookID;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getBookCount() {
        return this.availableCount;
    }

    
}

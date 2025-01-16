package day2;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price; 

    public Book(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price; 
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author; 
        this.yearPublished = 2000;
        this.price = 9.99;
    }

    public Book(String title){
        this.title = title;
        this.author = "Unknown Author";
        this.yearPublished = 2000;
        this.price = 9.99; 
    }

    public void displayDetails(){
        String details = "Title = " + title + " Author = " + author + " Year published = " + yearPublished + " Price = " + price; 
        System.out.println(details);
    }

    public void displayDetails(boolean showTitleAndAuthorOnly){
        if (showTitleAndAuthorOnly){
            System.out.println("Title = " + title + " Author = " + author);
        }

        else {
           displayDetails();  
        }
    }

    public void displayDetails(String showTitleOnly){
        if (title.equals("title")){
            System.out.println("Title = " + title);
        }
    }

    public void setTitle(String newTitle){
        title = newTitle;
    }

    public void setAuthor(String newAuthor){
        author = newAuthor;
    }

    public void setYear(int newYear){
        yearPublished = newYear;
    }

    public void setPrice(double newPrice){
        price = newPrice; 
    }
    }


package pwr.entity;

import java.sql.*;
import java.util.ArrayList;

public class BookDao {

    private Connection connection;

    public BookDao() {
        connection = getConnection();
    }

    private static BookDao instance = null;

    public static BookDao getInstance(){
        if(instance==null){
            instance=new BookDao();
        }
        return instance;
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useSSL=false&serverTimezone=UTC", "root", "trocheumrzyj1!Q");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void create (Book book){
        final String sql = "INSERT INTO books(title, author, isbn, year) values(?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2, book.getAuthor());
            preparedStatement.setString(3, book.getIsbn());
            preparedStatement.setInt(4, book.getYear());
            preparedStatement.executeUpdate();
            System.out.printf("Book added");
        } catch (SQLException e) {
            System.out.printf("Adding failed");
            e.printStackTrace();
        }
    }

    public Book read(int id){
        Book book = null;
        final String sql = "SELECT * FROM books WHERE id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                book = new Book();
                book.setIdbooks(resultSet.getInt("id"));
                book.setTitle(resultSet.getString("title"));
                book.setAuthor(resultSet.getString("author"));
                book.setIsbn(resultSet.getString("isbn"));
                book.setYear(resultSet.getInt("year"));
                return book;
            } else {
                return null;
            }
        } catch (SQLException e){
            System.out.printf("ERROR");
            e.printStackTrace();
            return null;
        }
    }

    public void update(Book book){
        final String sql = "UPDATE books SET title = ?, author = ?, isbn = ?, year = ? WHERE id = " + book.getIdbooks();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2, book.getAuthor());
            preparedStatement.setString(3, book.getIsbn());
            preparedStatement.setInt(4, book.getYear());
            preparedStatement.setInt(5, book.getIdbooks());
            preparedStatement.executeUpdate();
            System.out.printf("Book data modified");
        } catch (SQLException e) {
            System.out.printf("Modification failed");
            e.printStackTrace();
        }
    }

    public void delete(int id){
        final String sql = "DELETE from books WHERE id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.printf("Book removed");
        } catch (SQLException e){
            e.printStackTrace();
            System.out.printf("ERROR");
        }
    }


    public ArrayList<Book> getAllBooks(){
        try
        {
            Statement stmt = connection.createStatement();
            ResultSet results = stmt.executeQuery("select * from books");
            ArrayList<Book> books = new ArrayList<Book>();

            while(results.next())
            {
                Book book = new Book();
                book.setIdbooks(results.getInt(1));
                book.setTitle(results.getString(2));
                book.setAuthor(results.getString(3));
                book.setYear(results.getInt(4));
                book.setIsbn(results.getString(5));
                books.add(book);
            }
            results.close();
            stmt.close();
            return books;
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
        return null;
    }
}

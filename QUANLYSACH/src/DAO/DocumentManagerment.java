/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Newpaper;
import Models.Book;
import Models.Magazine;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author TGDD
 */
public class DocumentManagerment extends JDBCConnection {
    // hiển thị toàn bộ sách
    public List<Book> getAllBooks(String bookCode) {
        List<Book> books = new ArrayList<Book>();
        
        Connection conn = JDBCConnection.getJDBCConnection();
        
        String sqlQuerry = "select * from Book";
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            ResultSet rs = stm.executeQuery();
            while(rs.next()) {
                Book book = new Book();
                book.setBookCode(rs.getString("bookCode"));
                book.setBookName(rs.getString("bookName"));
                book.setPublisher(rs.getString("publisher"));
                book.setAuthor(rs.getString("author"));
                book.setQuantity(rs.getInt("quantity"));
                book.setPageNum(rs.getInt("pageNum"));
                
                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }
    // hiển thị tất cả tap chí 
    public List<Magazine> getAllMagazines(String mgzCode) {
        List<Magazine> magazines = new ArrayList<Magazine>();
        
        Connection conn = JDBCConnection.getJDBCConnection();
        
        String sqlQuerry = "select * from Magazine";
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            ResultSet rs = stm.executeQuery();
            while(rs.next()) {
                Magazine magazine = new Magazine();
                magazine.setMgzCode(rs.getString("mgzCode"));
                magazine.setPublisher(rs.getString("publisher"));
                magazine.setNumber(rs.getInt("number"));
                magazine.setPublishMonth(rs.getInt("publishMonth"));
                magazine.setQuantity(rs.getInt("quantity"));
                magazines.add(magazine);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return magazines;
    }
    
    // Hiển thị tất cả báo
     public List<Newpaper> getAllNewpapers(String npCode) {
        List<Newpaper> newpapers = new ArrayList<Newpaper>();
        
        Connection conn = JDBCConnection.getJDBCConnection();
        
        String sqlQuerry = "select * from Newpaper";
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            ResultSet rs = stm.executeQuery();
            while(rs.next()) {
                Newpaper newpaper = new Newpaper();
                newpaper.setNpCode(rs.getString("npCode"));
                newpaper.setPublisher(rs.getString("publisher"));
                newpaper.setQuantity(rs.getInt("quantity"));
                newpaper.setPublishDate(rs.getInt("publishDate"));
                newpapers.add(newpaper);
            }
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return newpapers;
    }
    
    
    // Lay sach
    public List<Book> getBook(String bookCode) {
        List<Book> books = new ArrayList<Book>();
        
        Connection conn = JDBCConnection.getJDBCConnection();
        
        String sqlQuerry = "select * from Book Where bookCode = ?";
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setString(1, bookCode);
            ResultSet rs = stm.executeQuery();
            while(rs.next()) {
                Book book = new Book();
                book.setBookCode(rs.getString("bookCode"));
                book.setBookName(rs.getString("bookName"));
                book.setPublisher(rs.getString("publisher"));
                book.setAuthor(rs.getString("author"));
                book.setQuantity(rs.getInt("quantity"));
                book.setPageNum(rs.getInt("pageNum"));
                
                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }
    
    // tim Tap chi
    public List<Magazine> getMagazine(String mgzCode) {
        List<Magazine> magazines = new ArrayList<Magazine>();
        
        Connection conn = JDBCConnection.getJDBCConnection();
        
        String sqlQuerry = "select * from Magazine Where mgzCode= ?";
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setString(1, mgzCode);
            ResultSet rs = stm.executeQuery();
            while(rs.next()) {
                Magazine magazine = new Magazine();
                magazine.setMgzCode(rs.getString("mgzCode"));
                magazine.setPublisher(rs.getString("publisher"));
                magazine.setQuantity(rs.getInt("quantity"));
                magazine.setPublishMonth(rs.getInt("publishMonth"));
                magazine.setNumber(rs.getInt("number"));
                magazines.add(magazine);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return magazines;
    }
    
    // tim bao
    public List<Newpaper> getNewpaper(String npCode) {
        List<Newpaper> newpapers = new ArrayList<Newpaper>();
        
        Connection conn = JDBCConnection.getJDBCConnection();
        
        String sqlQuerry = "select * from Newpaper Where npCode= ?";
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setString(1, npCode);
            ResultSet rs = stm.executeQuery();
            while(rs.next()) {
                Newpaper newpaper = new Newpaper();
                newpaper.setNpCode(rs.getString("npCode"));
                newpaper.setPublisher(rs.getString("publisher"));
                newpaper.setQuantity(rs.getInt("quantity"));
                newpaper.setPublishDate(rs.getInt("publishDate"));
                newpapers.add(newpaper);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return newpapers;
    }
    
    // them sach 
    public void addBook(Book book) {
        Connection conn = JDBCConnection.getJDBCConnection();
        
        String sqlQuerry = "insert into Book values(?,?,?,?,?,?)";
        
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setString(1, book.getBookCode());
            stm.setString(2, book.getBookName());
            stm.setString(3, book.getAuthor());
            stm.setString(4, book.getPublisher());
            stm.setInt(5, book.getPageNum());
            stm.setInt(6, book.getQuantity());
            
            stm.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Thêm tạp chí
     public void addMagazine(Magazine magazine) {
        Connection conn = JDBCConnection.getJDBCConnection();
        
        String sqlQuerry = "insert into Magazine values(?,?,?,?,?)";
        
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setString(1, magazine.getMgzCode());
            stm.setString(2, magazine.getPublisher());
            stm.setInt(3, magazine.getNumber());
            stm.setInt(4, magazine.getPublishMonth());
            stm.setInt(5, magazine.getQuantity());
            
            stm.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
    // Thêm báo
     public void addNewpaper(Newpaper newpaper) {
        Connection conn = JDBCConnection.getJDBCConnection();
        
        String sqlQuerry = "insert into Newpaper values(?,?,?,?)";
        
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setString(1, newpaper.getNpCode());
            stm.setString(2, newpaper.getPublisher());
            stm.setInt(3, newpaper.getPublishDate());
            stm.setInt(4, newpaper.getQuantity());
            
            stm.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
    // Xóa sách
     public void deleteBook(String bookCode) {
        Connection conn = JDBCConnection.getJDBCConnection();
        
        String sqlQuerry = "delete from Book where bookCode = ?";
        
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setString(1, bookCode);
            stm.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Xóa Tạp chí
     public void deleteMagazine(String mgzCode) {
        Connection conn = JDBCConnection.getJDBCConnection();
        
        String sqlQuerry = "delete from Magazine where mgzCode = ?";
        
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setString(1, mgzCode);
            stm.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Xóa sách
     public void deleteNewpaper(String npCode) {
        Connection conn = JDBCConnection.getJDBCConnection();
        
        String sqlQuerry = "delete from Newpaper where npCode = ?";
        
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setString(1, npCode);
            stm.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

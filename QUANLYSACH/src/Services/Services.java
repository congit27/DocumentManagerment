/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import DAO.AccountManagement;
import DAO.DocumentManagerment;
import Models.Account;
import java.util.List;
import Models.Book;
import Models.Magazine;
import Models.Newpaper;
import java.sql.ResultSet;

/**
 *
 * @author TGDD
 */
public class Services {
    public DocumentManagerment quanLy;
    public AccountManagement account;

    public Services() {
        quanLy = new DocumentManagerment();
        account = new AccountManagement();
    }
    
    public List<Book> getAllBooks(String bookCode) {
        return quanLy.getAllBooks(bookCode);
    } 
    
    public List<Magazine> getALlMagazines(String mgzCode) {
        return quanLy.getAllMagazines(mgzCode);
    } 
    
    public List<Newpaper> getAllNewpapers(String npCode) {
        return quanLy.getAllNewpapers(npCode);
    } 
    
    public List<Book> getBook(String bookCode) {
        return quanLy.getBook(bookCode);
    } 
    
    public List<Magazine> getMagazine(String mgzCode) {
        return quanLy.getMagazine(mgzCode);
    } 
    
    public List<Newpaper> getNewpaper(String npCode) {
        return quanLy.getNewpaper(npCode);
    } 
    
    public void addBook(Book book) {
        quanLy.addBook(book);
    }
    
    public void addMagazine(Magazine magazine) {
        quanLy.addMagazine(magazine);
    }
   
    public void addNewpaper(Newpaper newpaper) {
        quanLy.addNewpaper(newpaper);
    }
    
    public void deleteBook(String bookCode) {
        quanLy.deleteBook(bookCode);
    }
    public void deleteMagazine(String mgzCode) {
        quanLy.deleteMagazine(mgzCode);
    }
    public void deleteNewpaper(String npCode) {
        quanLy.deleteNewpaper(npCode);
    }

    public void addUser(Account user) {
        account.addUser(user);
    }
    
    public int getResultOfAdding() {
        return account.getresultUserAdding();
    }
    
    public void loginAccount(Account acc) {
        account.loginAccountHandle(acc);
    }
    
    public ResultSet getResultUserLogin() {
        return account.getResultUserLogin();
    } 
 }

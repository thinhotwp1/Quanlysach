/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

import java.util.Scanner;

/**
 *
 * @author onthi
 */
public class Book{
    
    private String bookName;
    private int date;
    private String nickname;

    public Book() {
    }

    public Book(String bookName, int date, String nickname) {
        this.bookName = bookName;
        this.date = date;
        this.nickname = nickname;
    }
    
    Scanner sc = new Scanner(System.in);
    
    public void inputBook(){
        System.out.println("Nhap ten sach: ");
        bookName = sc.nextLine();
        System.out.println("Nhap ngay xuat ban: ");
        date = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap but danh: ");
        nickname = sc.nextLine();
    }

    public void outputBook(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "bookName= " + bookName + ", date= " + date + ", nickname= " + nickname;
    }
    
    
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    
}

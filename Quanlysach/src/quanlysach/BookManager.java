/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author onthi
 */
public class BookManager {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Tao ArrayList tac gia
        ArrayList<Author> authorList = new ArrayList<>(); 
        //Tao tac gia moi va them vao list tac gia
        Author author1 = new Author("Thinh",21,"Na",1,"Ha Dong"); 
        authorList.add(author1);
        Author author2 = new Author("Chau",20,"Chou",16,"Bac Tu Liem");
        authorList.add(author2);
        
        ArrayList<Book> bookList = new ArrayList<>();
        Book book1 = new Book("Duong mot chieu",21,"Na");
        bookList.add(book1);
        Book book2 = new Book("Duong hai chieu",12,"Chou");
        bookList.add(book2);
        
        Scanner sc = new Scanner(System.in);
        int chon;
        boolean c = true;
        while(c==true){
            System.out.println("");
            System.out.println("============= MENU =============");
            System.out.println("1.Nhap thong tin sach");
            System.out.println("2.Hien thi tat ca sach ra man hinh");
            System.out.println("3.Nhap thong tin tac gia");
            System.out.println("4.Hien thi tat ca tac gia");
            System.out.println("5.Tim kiem tat ca sach viet boi tac gia");
            System.out.println("6.Thoat");
            System.out.println("============= END! =============");
            
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1:
                    int n;
                    System.out.println("Nhap so luong sach can them: ");
                    n=Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++){
                        Book book = new Book();
                        int check=0;
                        book.inputBook();
                        bookList.add(book);
                        
                        for(Author author:authorList){
                            if(book.getNickname().equalsIgnoreCase(author.getSignature())){
                                check=1;
                            }
                        }
                        
                        if(check==0){
                            System.out.println("Nhap thong tin tac gia moi! ");
                            Author author = new Author();
                            author.inputAuthor();
                            authorList.add(author);
                        }
                        
                    }
                    break;
                case 2:
                    System.out.println("List cac quyen sach la:");
                    for(Book book:bookList){
                        book.outputBook();
                        }
                    break;
                case 3:
                    int m;
                    System.out.println("Nhap so luong tac gia can them: ");
                    m=Integer.parseInt(sc.nextLine());
                    for(int i=0;i<m;i++){
                        Author author = new Author();
                        author.inputAuthor();
                        authorList.add(author);
                    }
                    break;    
                case 4:
                    System.out.println("Danh sach tac gia la:");
                    for(Author author:authorList){
                        author.outputAuthor();
                    }
                    break;
                case 5:
                    System.out.println("Tim kiem theo but danh: ");
                    String pen;
                    int check1=0;
                    pen=sc.nextLine();
                    for(Author author : authorList){
                        if(author.getSignature().equalsIgnoreCase(pen)){
                            System.out.println("Thong tin cua tac gia:");
                            author.outputAuthor();
                            System.out.println("Danh sach sach cua tac gia:");
                            for(Book book:bookList){
                                if(book.getNickname().equalsIgnoreCase(author.getSignature())){
                                    book.outputBook();
                                }
                            }
                        }
                    }
                    break;    
                case 6:
                    System.out.println("Bye Bye!!");
                    c=false;
                    break;
                default:
                    System.out.println("Nhap lai di bro!");
                    break;
            }
        }
        
        
        
    }
   
}

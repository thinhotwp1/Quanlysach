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
public class Author {
    private String name;
    private int age;
    private String signature;
    private int birthday;
    private String address;

    public Author() {
    }

    public Author(String name, int age, String signature, int birthday, String address) {
        this.name = name;
        this.age = age;
        this.signature = signature;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void inputAuthor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten tac gia:");
        name = sc.nextLine();
        System.out.println("Nhap tuoi tac gia:");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap but danh tac gia:");
        signature = sc.nextLine();
        System.out.println("Nhap ngay sinh tac gia:");
        birthday = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap dia chi tac gia:");
        address = sc.nextLine();
        
    }
    public void outputAuthor(){
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Author" + "name= " + name + ", age= " + age + ", signature= " + signature + ", birthday= " + birthday + ", address= " + address;
    }
    
}

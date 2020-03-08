package com.company;

public class Hello {
    String name = "Thanakorn Piromchai";
    String id = "623410034-7";
    Integer year = 2001;
    Integer answer = 2020 - year;
    String student = "Computer and Information Science";
    public void GetHello(){
        System.out.println("ชื่อ : " + name );
        System.out.println("รหัสนักศึกษา : " + id);
        System.out.println("อายุ : " + answer);
        System.out.println("สาขา : " + student);
    }
}

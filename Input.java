package School;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
  
          System.out.println("Please Input Number 1/2 here...");
          System.out.println("1. Siswa\n2. Guru");
          int choice = i.nextInt();

          if (choice == 1) {
            System.out.println("--------Informasi Siswa---------");
            System.out.print("Masukkan nama: ");
             String name = i.next();
             System.out.print("Masukkan umur: ");
             int age = i.nextInt();
             System.out.print("Masukkan jurusan: ");
             String major = i.next();
             System.out.print("Masukkan nomor siswa: ");
             int studentNumber = i.nextInt();
             System.out.print("Masukkan nilai: ");
             int score = i.nextInt();
    
             System.out.println("================");
             System.out.println("Informasi siswa:");
             System.out.println("Nama: " + name);
             System.out.println("Umur: " + age);
             System.out.println("Jurusan: " + major);
             System.out.println("Nomor siswa: " + studentNumber);
             System.out.println("Nilai: " + score);
             System.out.println("================");
          } else if (choice == 2) {
             System.out.println("Pilih salah satu:");
             System.out.println("1. Full Time\n2. Part Time");
             int teacherType = i.nextInt();
    
             if (teacherType == 1) {
                System.out.println("--------Informasi Guru Full-Time---------");
                System.out.print("Masukkan nama guru: ");
                String name = i.next();  
                System.out.print("Masukkan umur guru: ");  
                int age = i.nextInt();  
                System.out.print("Masukkan mapel guru: ");  
                String subject = i.next();  
                System.out.print("unit: ");  
                String unit = i.next();  
                System.out.print("Masukkan gaji guru: ");  
                int salary = i.nextInt();  
    
                System.out.println("====================");  
                System.out.println("Info Guru Full-time:");  
                System.out.println("Nama: " + name);  
                System.out.println("Umur: " + age);  
                System.out.println("Mata pelajaran: " + subject);  
                System.out.println("Unit: " + unit);  
                System.out.println("Gaji: Rp" + salary);  
                System.out.println("====================");  
             } else if (teacherType == 2) {  
                System.out.println("--------Informasi Guru Part-Time---------");
                System.out.print("Masukkan nama guru: ");  
                String name = i.next();  
                System.out.print("Masukkan umur guru: ");  
                int age = i.nextInt();  
                System.out.print("Masukkan mapel guru: ");  
                String subject = i.next();  
                System.out.print("Masukkan jam guru: ");  
                int hoursWorked = i.nextInt();  
                
                int salary = hoursWorked * 50000;
    
                System.out.println("=========================");  
                System.out.println("Informasi Guru Part-time:");  
                System.out.println("Nama: " + name);  
                System.out.println("umur: " + age);  
                System.out.println("Mata Pelajaran: " + subject);  
                System.out.println("Jam: " + hoursWorked + " jam");  
                System.out.println("Gaji: Rp" + salary);  
                System.out.println("=========================");  
             }
            }
    }
}
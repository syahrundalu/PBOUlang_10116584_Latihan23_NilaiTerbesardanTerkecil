/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author syhar
 */
public class NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        int[] nilai = new int[100];
        int max = 0, min = 100;
        int i, banyak;
        Scanner scan = new Scanner (System.in);
        for(i=0; i<10; i++)
        {
            System.out.print("Masukan Nama Petugas = ");
            nama = scan.nextLine();
            System.out.print("Masukan Banyaknya Mahasiswa : ");
            banyak = scan.nextInt();
            i=1;
        while (i<=banyak){
                System.out.print("Nilai Mahasiswa ke-"+i+" = " );
                nilai[i] = scan.nextInt();
                i++;
        }
        
        max=nilai[0];
        min=nilai[0];
        for (i=0; i<10; i++){
            if  (nilai[i] > max){
                max = nilai[i];
            }   
            if (nilai[i]< min){
                min = nilai[i];
            }
        }
        
        System.out.println("");
        System.out.println("Nilai Terbesarnya   = "+max);
        System.out.println("Nilai Terkecil      = "+min);
    }      
}
}
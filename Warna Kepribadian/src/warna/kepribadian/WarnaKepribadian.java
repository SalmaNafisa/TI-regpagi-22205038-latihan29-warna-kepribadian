/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package warna.kepribadian;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class WarnaKepribadian {
    
        // Text color
	 public static final String ANSI_RESET = "\u001B[0m";
	 public static final String ANSI_RED = "\u001B[31m";
	 public static final String ANSI_GREEN = "\u001B[32m";
	 public static final String ANSI_YELLOW = "\u001B[33m";
	 public static final String ANSI_BLUE = "\u001B[34m";
	 public static final String ANSI_PURPLE = "\u001B[35m";
	 public static final String ANSI_CYAN = "\u001B[36m";
	 public static final String ANSI_WHITE = "\u001B[37m";
	 
	// Background color
	 public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	 public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	 public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	 public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	 public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	 public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	 public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	    public static void main(String[] args) {
	    	Scanner input = new Scanner(System.in);
	    	String inputanWarna, inputanNama, hasilKepribadian, hasil_inputan_warna;
	    	
	    	System.out.println();
	        println(ANSI_RED + "YUK " + ANSI_GREEN + "CEK " + ANSI_YELLOW + "KEPRIBADIANMU " + ANSI_CYAN + "DARI " + ANSI_PURPLE + 
	        		"WARNA " + ANSI_BLUE + "FAVORITMU" + ANSI_WHITE);
	        
	        System.out.println();
	        println(ANSI_RED_BACKGROUND + "MERAH");
	        println(ANSI_GREEN_BACKGROUND + "HIJAU");
	        println(ANSI_YELLOW_BACKGROUND + "KUNING");
	        println(ANSI_BLUE_BACKGROUND + "BIRU");
	        println(ANSI_PURPLE_BACKGROUND + "UNGU" + ANSI_RESET);
	        
	        System.out.println();
	        System.out.print("Pilih warna favoritmu : ");
	        inputanWarna = input.nextLine();
	        
	        System.out.print("Nama kamu : ");
	        inputanNama = input.nextLine();
	        hasilKepribadian = "=== Hasil Test Kepribadian " + inputanNama + " ===";
	        hasil_inputan_warna = inputanWarna;
	        
	        System.out.println();
	        System.out.println(hasilKepribadian.toUpperCase());
	        System.out.println();
	        
	        if(inputanWarna.equalsIgnoreCase("biru")) {
	        	
	        	println("Warna favoritmu adalah " + ANSI_BLUE + hasil_inputan_warna.toUpperCase() + ANSI_RESET);
	        	System.out.println("1. Menyenangkan, \n" +
	        					   "2. Bijaksana, \n" +
	        					   "3. Pembawaan diri tenang saat menghadapi masalah, \n" +
	        					   "4. Dinamis, \n" +
	        					   "5. Senang berbagi, \n" +
	        					   "6. Bersahabat, \n" +
	        					   "7. Tidak terlalu suka menjadi sorotan banyak orang, \n" +
	        					   "8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
	        	
	        }else if(inputanWarna.equalsIgnoreCase("kuning")) {
	        	
	        	println("Warna favoritmu adalah " + ANSI_YELLOW + hasil_inputan_warna.toUpperCase() + ANSI_RESET);
	        	System.out.println("1. Optimis, \n" +
	        					   "2. Suka bergaul, \n" +
	        					   "3. Periang, \n" +
	        					   "4. Senang menolong, \n" +
	        					   "5. Lincah dan aktif, \n" +
	        					   "6. Tidak suka meremehkan kekurangan orang lain, \n" +
	        					   "7. Loyal, \n" +
	        					   "8. Hangat, \n" +
	        					   "9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil, \n" +
	        					   "10.Cenderung penakut.");  
	        	
	        }else if(inputanWarna.equalsIgnoreCase("merah")) {
	        	
	        	println("Warna favoritmu adalah " + ANSI_RED + hasil_inputan_warna.toUpperCase() + ANSI_RESET);
	        	System.out.println("1. Periang, \n" +
	        					   "2. Pemberani, \n" +
	        					   "3. Berani mengambil risiko dalam setiap langkah, \n" +
	        					   "4. Menyukai tantangan, \n" +
	        					   "5. Kurang sabar, \n" +
	        					   "6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit di kontrol, \n" +
	        					   "7. Memiliki energi kehangatan dan cinta.");  
	        	
	        }else if(inputanWarna.equalsIgnoreCase("ungu")) {
	        	
	        	println("Warna favoritmu adalah " + ANSI_PURPLE + hasil_inputan_warna.toUpperCase() + ANSI_RESET);
	        	System.out.println("1. Optimis, \n" +
	        					   "2. Tidak pernah ragu, \n" +
	        					   "3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat, \n" +
	        					   "4. Memiliki ambisi yang besar, \n" +
	        					   "5. Memiliki empati yang besar, \n" +
	        					   "6. Memiliki sisi misterius sebab seringkali menutupi perasaanya, \n" +
	        					   "7. Terkadang bersikap keras kepala dan angkuh.");
	        	
	        }else if(inputanWarna.equalsIgnoreCase("hijau")) {
	        	
		        println("Warna favoritmu adalah " + ANSI_GREEN + hasil_inputan_warna.toUpperCase() + ANSI_RESET);
		        System.out.println("1. Romantis, \n" +
		        					   "2. Menyukai hal yang berbau alami dan keindahan, \n" +
		        					   "3. Teguh pada prinsip, \n" +
		        					   "4. Menginginkan kesempurnaan, \n" +
		        					   "5. Mudah cemburu, \n" +
		        					   "6. Mudah merasa iri, \n" +
		        					   "7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
		        	
	        	}else {
	        		
	        	System.out.println("Oops, belum teridentifikasi.");
	        }
	        
	    }

	    // Stackoverflow : https://stackoverflow.com/a/74321619/19531536
	    static void println(String s) {
	        try {
	            new ProcessBuilder("cmd", "/c", "echo " + s).inheritIO().start().waitFor();
	        } catch (InterruptedException|IOException e) {
	            throw new RuntimeException(e);
	        }
    }   
}

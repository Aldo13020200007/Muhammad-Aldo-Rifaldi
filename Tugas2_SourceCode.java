//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
public class Asgdll{
    public static void main (String[] args){
        /* kamus */
        float f=20.0f;
        double fll;

        /* Algoritma */
        fll=10.0f;
        System.out.println ("f : "+f + "\nfll:"+fll);
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
public class Asign {
    public static void main (String[] args){
        //Kamus
        int i;
        //Program
        System.out.print("hello\n"); i=5;
        System.out.println(" ini nilai i : "+ i);

    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
//Deskripsi:
//Program ini berisi contoh sederhana untuk mendefinisikan
//variabel-variabel bilangan bulat (short int, int, long int),
//karakter, bilangan riil.

public class ASIGNi{
    public static void main (String[] args){
        //kamus
        short ks=1;
        int ki=1;
        long kl=10000;
        char c=65; //inisialisasi karakter dengan integer
        char c1='Z';
        double x=50.2f;
        float y =50.2f;

        //program

        //penulisan karakter sebagai karakter
        System.out.println("Karakter : "+c);
        System.out.println("Karakter : "+c1);

        //penulisan karakter sebagai integer
        System.out.println("Karakter : "+c);
        System.out.println("Karakter : "+c1);

        System.out.println("Bilangan integer (short) = "+ks);
        System.out.println("\t(int) = "+ki);
        System.out.println("\t(long) = "+kl);
        System.out.println("Bilangan Real x = "+x);
        System.out.println("Bilangan Real y = "+y);


    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
import java.util.Scanner;
// contoh membaca integer menggunakan Class Scanner

public class BacaData{
    public static void main (String[] args){
        int a;
        Scanner masukan;
        //program
        System.out.print("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan=new Scanner(System.in);
        a=masukan.nextInt();
        System.out.print("Nilai yang dibaca : "+a);
        
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import javax.swing.*;

public class Bacakar{
    public static void main (String[] args) throws IOException{
        // kamus
        char cc;
        int bil;
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader dataln= new BufferedReader(isr);
        //atau
        BufferedReader datAln =new BufferedReader(new InputStreamReader(System.in));

        //program
        System.out.print("hello\n");

        System.out.print("baca 1 karakter : ");
        //perintah baca karakter cc
        cc=dataln.readLine().charAt(0);
        System.out.print("baca 1 bilangan : ");
        //perintah baca bil
        bil=Integer.parseInt(datAln.readLine());
        //String kar = JOptionPane.showInputDialog("Karakter 1 : ");
        //System.out.println(kar);
        //JOptionPane.showMessageDialog(null, "hello");
        System.out.print (cc +"\n" +bil+"\n");
        System.out.print ("bye \n");

    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

//Casting menggunakan tipe data primitif
public class Casting1{
    public static void main(String[] args){
        int a=5, b=6;
        float d=2.f, e=3.2f;
        char g='5';
        double k=3.14;

        System.out.println((float)a); // int <-- float
        System.out.println((double)b); // int <-- double
        System.out.println((int)d); // float <-- int
        System.out.println((double)e); // float <-- double
        System.out.println((int)g); // char <-- int (ASCII)
        System.out.println((float)g); // char <-- float (ASCII)
        System.out.println((double)g); // char <-- double (ASCII)
        System.out.println((int)k); // double <-- int
        System.out.println((float)k); // double <-- float

    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

//Casting menggunakan tipe data Class
public class Casting2 {
    public static void main(String[] args){
        int a=8,b=9;
        float d=2.f,e=3.2f;
        char g='5';
        double k=3.14;
        String n="67",m="45", l="100";

        a = Integer.parseInt(n); /*Konversi String ke Integer*/
        k = Double.parseDouble(m); /*Konversi String ke Double*/
        d = Float.parseFloat(l); /*Konversi String ke Float*/
        System.out.println("a : "+a+"\nk : "+k+"\nd : "+d);

        n = String.valueOf(b); /*Konversi Integer ke String*/
        m =String.valueOf(g); /*Konversi Karakter ke String*/
        l = String.valueOf(e); /*Konversi Float ke String*/
        System.out.println("n : "+n+"\nm : "+m+"\nl : "+l);
        
        k = Double.valueOf(a).intValue(); //konversi integer ke double
        double c = Integer.valueOf(b).doubleValue();
        System.out.println("k : "+k+"\nc : "+c+"\nl : "+l);

    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

//pemakaian operator kondisional
public class Ekspresi {
    public static void main(String[] args){
        //kamus 
        int x=1;
        int y=2;

        //program
        System.out.print("x = "+ x + "\n");
        System.out.print("y = "+ y + "\n");
        System.out.print("hasil ekspresi = (x<y)?x:y = "+ ((x < y) ? x : y)); 
        //gunakan dalam kurung "(statement dan condition)" untuk menyatakan satu kesatuan pernyataan
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
//pembagian integer, casting
public class Ekspresi1 {
    public static void main (String[] args){
        //kamus
        int x=1; int y=2; float fx; float fy;

        //program
        System.out.print ("x/y (format integer) = "+ x/y);
        System.out.print ("\nx/y (format float) = "+ x/y);
        //agar hasilnya tidak nol
        fx=x;
        fy=y;

        System.out.print ("\nx/y (format integer) = "+ fx/fy);
        System.out.print ("\nx/y (format float) = "+ fx/fy);
        //casting
        System.out.print ("\nfloat(x)/float(y) (format integer) = "+(float)x/(float)y);
        System.out.print ("\nfloat(x)/float(y) (format float) = "+(float)x/(float)y);

        x=10; y=3;

        System.out.print ("\nx/y (format integer) = "+ x/y);
        System.out.print ("\nx/y (format float) = "+ x/y);



    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
public class Hello{
    public static void main(String[] args){
        //menuliskan hello ke layar
        System.out.print("Hello");
        //Menuliskan hello dan ganti baris baru
        System.out.print("\nHello");
        //menuliskan hello dan ganti baris
        System.out.println("World");
        System.out.println("Welcome");
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
//efek dari operator ++
public class Incr{
    public static void main(String[] args){
        //kamus
        int i,j;

        //program
        i=3;
        j=i++;

        System.out.println ("Nilai i : " + (++i) +"\nNilai j : " + j);
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
//pemakaian beberapa operator terhadap bit
public class Oper1{
    public static void main(String[] args){
        //kamus
        int n = 10; /* 1010 */
        int x = 1; /* 1 */
        int y = 2; /* 10 */

        //program
        System.out.println ("n = "+ n);
        System.out.println ("x = "+ x);
        System.out.println ("y = "+ y);
        System.out.println ("n & 8 = "+ (n & 8)); //1010 AND 1000 //0111
        System.out.println ("y << 2 = "+ (y << 2)); /* 10 ==>1000 = 8 */
        System.out.println ("y >> 3 = "+ (y >>3)); /* 10 ==>0000 = 0 */
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

// pemakaian beberapa operator terhadap RELATIONAL DAN bit
public class Oper2{
    public static void main(String[] args){
        //kamus
        char i,j;

        //program
        i=3; //00000011 dalam biner
        j=4; //00000100 dalam biner

        System.out.println("i = "+ (int) i);
        System.out.println("j = "+ (int) j);
        System.out.println("i & j = "+ (i & j)); //0: 00000000 dalam biner
        System.out.println("i | j = "+ (i | j)); //7: 00000111 biner
        System.out.println("i ^ j = "+ (i ^ j)); // operator '^' tidak berfungsi sebagai pangkat di java
        System.out.println(Math.pow(i, j)); //class Math memiliki method pow(a,b) untuk pemangkatan
        System.out.println(" ~i = "+ ~i); // -4: 11111100 biner
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
public class Oper3{
    public static void main (String[] args){
        //program
        if (true && true){ System.out.println(true && true);} //true=true and true
        if (true & true) { System.out.println(true & false); } //true & true
        if (true) { System.out.println(true); } // true
        if (true || true){ System.out.println(true); } //true = true or true
        if (true|false) { System.out.println(true|false); } // true|false


    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

public class Oper4{
    public static void main(String[] args){
        //kamus
        int i=0; //perhatikan int 1, j=0 bukan seperti ini
        int j=0;

        char c = 8; char d = 10;
        int e = (((int)c > (int)d) ? c: d);
        int k = ((i>j) ? i: j);

        //program
        System.out.print ("Nilai e = "+ e);
        System.out.print ("\nNilai k = "+ k);
        i = 2;
        j = 3;

        k = ((i++>j++) ? i: j) ;
        System.out.print ("\nNilai k = "+ k);
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

public class Oprator{
    public static void main (String[] args){
        //kamus
        boolean Bool1, Bool2, TF; int i,j, hsl;
        float x,y,res;

        //program
        System.out.println ("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");
        Bool1 = true; Bool2 = false;
        TF = Bool1 && Bool2 ; /* Boolean AND */
        TF = Bool1 || Bool2 ; /* Boolean OR */
        TF = ! Bool1 ; /* NOT */
        TF = Bool1 ^Bool2; /* XOR */
        System.out.println("Operator Logika & Bitwise :");
        System.out.println("&& = "+ (Bool1 && Bool2));
        System.out.println("|| = "+ (Bool1 || Bool2));
        System.out.println("! = "+ (! Bool1));
        System.out.println("^ = "+ (Bool1 ^ Bool2));

        //operasi numerik
        i = 5; j = 2 ;
        hsl = i+j; 
        hsl = i - j; 
        hsl = i / j; 
        hsl = i * j;
        hsl = i /j ; /* pembagian bulat */
        hsl = i%j ; /* sisa. modulo */
        System.out.println("Operasi Numerik Integer :" );
        System.out.println("+ = "+ (i+j));
        System.out.println("- = "+ (i-j));
        System.out.println("/ = "+ (i / j));
        System.out.println("* = "+ (i*j));
        System.out.println("/ bulat = "+ (i /j));
        System.out.println("% = "+ (i%j));

        //operasi numerik
        x = 5 ; y = 5 ;
        res = x + y; 
        res = x - y; 
        res = x / y; 
        res = x * y;
        System.out.println("Operasi Numerik Float :");
        System.out.println("+ = "+ (x+y));
        System.out.println("- = "+ (x-y));
        System.out.println("/ = "+ (x/y));
        System.out.println("* = "+ (x*y));

        //operasi relasional numerik
        TF = (i==j); 
        TF = (i!=j);
        TF = (i < j); 
        TF = (i > j); 
        TF = (i <= j); 
        TF = (i >= j);
        System.out.println("Operasi Relasional Numerik :");
        System.out.println("== = "+ (i==j));
        System.out.println("!= = "+ (i!=j));
        System.out.println("< = "+ (i<j));
        System.out.println("> = "+ (i>j));
        System.out.println("<= = "+ (i<=j));
        System.out.println(">= = "+ (i>=j));

        //operasi relasional numerik
        TF = (x != y);
        TF = (x < y); 
        TF = (x > y); 
        TF = (x <= y); 
        TF =(x >= y);
        System.out.println("Operasi Relasional Numerik 2 :");
        System.out.println("!= = "+ (x!=y));
        System.out.println("< = "+ (x<y));
        System.out.println("> = "+ (x>y));
        System.out.println("<= = "+ (x<=y));
        System.out.println(">= = "+ (x>=y));


    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

public class Oprator2{
    public static void main (String[] args){
        //kamus
        boolean Bool1, Bool2, TF; int i,j, hsl;
        float x,y,res;

        //program
        System.out.println ("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");
        Bool1 = true; Bool2 = false;
        TF = Bool1 && Bool2 ; /* Boolean AND */
        TF = Bool1 || Bool2 ; /* Boolean OR */
        TF = ! Bool1 ; /* NOT */
        TF = Bool1 ^Bool2; /* XOR */
        System.out.println("Operator Logika & Bitwise :");
        System.out.println("&& = "+ (Bool1 && Bool2));
        System.out.println("|| = "+ (Bool1 || Bool2));
        System.out.println("! = "+ (! Bool1));
        System.out.println("^ = "+ (Bool1 ^ Bool2));

        //operasi numerik
        i = 5; j = 2 ;
        hsl = i+j; 
        hsl = i - j; 
        hsl = i / j; 
        hsl = i * j;
        hsl = i /j ; /* pembagian bulat */
        hsl = i%j ; /* sisa. modulo */
        System.out.println("Operasi Numerik Integer :" );
        System.out.println("+ = "+ (i+j));
        System.out.println("- = "+ (i-j));
        System.out.println("/ = "+ (i / j));
        System.out.println("* = "+ (i*j));
        System.out.println("/ bulat = "+ (i /j));
        System.out.println("% = "+ (i%j));

        //operasi numerik
        x = 5 ; y = 5 ;
        res = x + y; 
        res = x - y; 
        res = x / y; 
        res = x * y;
        System.out.println("Operasi Numerik Float :");
        System.out.println("+ = "+ (x+y));
        System.out.println("- = "+ (x-y));
        System.out.println("/ = "+ (x/y));
        System.out.println("* = "+ (x*y));

        //operasi relasional numerik
        TF = (i==j); 
        TF = (i!=j);
        TF = (i < j); 
        TF = (i > j); 
        TF = (i <= j); 
        TF = (i >= j);
        System.out.println("Operasi Relasional Numerik :");
        System.out.println("== = "+ (i==j));
        System.out.println("!= = "+ (i!=j));
        System.out.println("< = "+ (i<j));
        System.out.println("> = "+ (i>j));
        System.out.println("<= = "+ (i<=j));
        System.out.println(">= = "+ (i>=j));

        //operasi relasional numerik
        TF = (x != y);
        TF = (x < y); 
        TF = (x > y); 
        TF = (x <= y); 
        TF =(x >= y);
        System.out.println("Operasi Relasional Numerik 2 :");
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BacaString {
    public static void main(String[] args) throws IOException{
        //kamus
        String str; 
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        //program
        System.out.print ("\nBaca string dan Integer: \n"); 
        System.out.print("masukkan sebuah string: "); 
        str= datAIn.readLine();
        System.out.print ("String yang dibaca : "+ str);

    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

public class ForEver{
    public static void main (String[] args){
        System.out.println("Program akan looping, akhiri dengan ^c");
        while (true){
            System.out.print ("Print satu baris ....\n");
        }
        
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
//contoh pemakaian IF satu kasus
//membaca nilai integer, menuliskan nilainya jika bernilai positif

import java.util.Scanner;

public class If1{
    public static void main(String[] args){
        //kamus
        Scanner masukan=new Scanner(System.in);
        int a;
        //program

        System.out.print ("Contoh IF satu kasus \n"); 
        System.out.print ("Ketikkan suatu nilai integer : "); 
        a = masukan.nextInt();
        if (a >= 0)
        System.out.print ("\nNilai a positif "+ a);
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

import java.util.Scanner;

//contoh pemakaian IF dua kasus komplementer
//membaca dua nilai
//menuliskan 'Nilai a positif, nilai a', jika a>0
//'nilai a negatif, nilai a', jika a<0

public class If2{
    public static void main (String[] args){
        //kamus
        int a;
        Scanner masukan=new Scanner(System.in);
        //program
        System.out.print ("Contoh IF dua kasus \n");
        System.out.print ("Ketikkan suatu nilai integer :"); 
        a=masukan.nextInt();
        if (a >= 0){
            System.out.println ("Nilai a positif "+ a);
        } else{
            System.out.println ("Nilai a negatif "+ a);
        } 

        
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

import java.util.Scanner;

//contoh pemakaian IF tiga kasus //membaca sebuah nilai,
//menuliskan 'Nilai a positif, nilai a', jika a>0
//'Nilai Nol, nilai a', jika a=0
//'Nilai a negatif, nilai a', jika a<0

public class If3{
    public static void main(String[] args){
        //kamus
        int a;
        Scanner masukan=new Scanner(System.in);
        //program
        System.out.print ("Contoh IF tiga kasus \n"); 
        System.out.print ("Ketikkan suatu nilai integer :"); 
        a=masukan.nextInt();
        if (a > 0){
            System.out.println ("Nilai a positif "+ a);
        } else if (a==0){
            System.out.println ("Nilai Nol "+ a);
        } else {
            System.out.println ("Nilai a negatif "+ a);
        }
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

public class KasusBoolean{
    public static void main(String[] args){
        //kamus
        boolean bool;
        //program
        bool=true;
        if(bool){
            System.out.print("true\n");
        } else{
            System.out.print("false\n");
        }

        if(!bool){
            System.out.print("salah\n");
        } else {
            System.out.print("benar\n");
        }
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
import java.util.Scanner;

public class KasusSwitch{
    public static void main(String[] args){
        char cc;
        Scanner masukan=new Scanner(System.in);
        //program
        System.out.print ("Ketikkan sebuah huruf, akhiri dengan RETURN \n"); 
        cc=masukan.next().charAt(0);
        switch (cc) {
            case 'a':{ System.out.print (" Yang anda ketik adalah a \n"); break;}
            case 'u': { System.out.print (" Yang anda ketik adalah u \n"); break;}
            case 'e': { System.out.print (" Yang anda ketik adalah e \n"); break;}
            case 'i': { System.out.print (" Yang anda ketik adalah i \n"); break;}
            case 'o': { System.out.print (" Yang anda ketik adalah o\n"); break;}
            default: {
                System.out.print (" Yang anda ketik adalah huruf mati \n");
            }

            
        }
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

import java.util.Scanner;
//membaca jari-jari, menghitung luas lingkaran
//latihan pemakaian konstanta

public class Konstant{
    public static void main(String[] args){
        //kamus
        final float PHI=3.1415f;
        float r; //jari-jari lingkaran
        Scanner masukan=new Scanner(System.in);
        //program, baca data
        System.out.print ("Jari-jari lingkaran ="); 
        r = masukan.nextFloat();
        //hitung dan tulis hasil
        System.out.print ("Luas lingkaran = "+ (PHI * r * r )+"\n");
        System.out.print ("Akhir program \n");

    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

import java.util.Scanner;
//maksimum dua bilangan yang dibaca
public class Max2{
    public static void main(String[] args){
        //kamus
        int a,b;
        Scanner masukan=new Scanner(System.in);
        //program
        System.out.print ("Maksimum dua bilangan : \n");
        System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN :\n");
        a=masukan.nextInt();
        b=masukan.nextInt();
        System.out.println ("Ke dua bilangan : a = "+ a+" b = "+b); 
        if (a >= b){
            System.out.println ("Nilai a yang maksimum "+ a);
        } else{
            System.out.println ("Nilai b yang maksimum: "+ b);
            }
        }
    }

    //Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

import java.util.Scanner;
//Baca N, Print 1 s/d N dengan FOR
public class PriFor{
    public static void main (String[] args){
        //kamus
        int i,N;
        Scanner masukan=new Scanner(System.in);
        //program

        System.out.println("Baca N, print 1 s/d N "); 
        System.out.println ("N = ");
        N=masukan.nextInt();

        for (i = 1; i <= N; i++){
            System.out.println (i); };
            System.out.println ("Akhir program \n");
        }
    }
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

import java.util.Scanner;
//Baca N,
//Print i=1 s/d N dengan ITERATE
public class PrintIterasi{
    public static void main(String[] args){
        //kamus
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        //program
        System.out.print ("Nilai N >0 = "); /* Inisialisasi*/
        N = masukan.nextInt();
        i = 1; /* First Element */
        System.out.print ("Print i dengan ITERATE : \n"); 
        for (;;){
            System.out.println(i); /* Proses */
            if (i == N){
                break;
            } //kondisi berhenti
            else {
                i++; //elemen selanjutnya
            }


        } //i==n
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

import java.util.Scanner;
public class PrintRepeat{
    public static void main(String[] args){
        // kamus
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        //program
        System.out.print ("Nilai N >0 = "); 
        /* Inisialisasi */
        N = masukan.nextInt();
        i = 1; 
        /* First Element */
        System.out.print ("Print i dengan REPEAT: \n"); 
        do{
            System.out.print (i+"\n"); /* Proses */
            i++; /* Next Element */
        }
        while (i<=N); // kondisi pengulangan

    }

}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

import java.util.Scanner;
/* Baca N, Print i = 1 s/d N dengan WHILE */
public class PrintWhile {
    public static void main(String[] args){
        //kamus
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);

        //program
        System.out.print ("Nilai N >0 = "); /* Inisialisasi */
        N = masukan.nextInt();
        i = 1; /* First Element */
        System.out.print ("Print i dengan WHILE: \n");

        while (i<=N){ // kondisi pengulangan
            System.out.println (i); /* Proses */
            i++; /* Next Element */

        };
    }
}

//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1

import java.util.Scanner;
//baca N
//Print i = 1 s/d N dengan while (ringkas)
public class PrintWhile1{
    public static void main(String[] args){
        //kamus
        int N;
        int i=1;
        Scanner masukan=new Scanner(System.in);
        
        //program
        System.out.print("Nilai N>0 = ");
        N = masukan.nextInt();
        System.out.print ("Print i dengan WHILE (ringkas): \n");
        while (i<=N){
            System.out.println (i++); 
        } //(i>N)
        

    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
import java.util.Scanner;
//contoh baca nilai x
//jumlahkan nilai yang dibaca dengan ITERATE
public class PrintXInterasi{
    public static void main (String[] args){
        //kamus
        int Sum=0;
        int x;
        Scanner masukan=new Scanner(System.in);
        //program
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Element */
        if (x == 999){
            System.out.print ("Kasus kosong \n");

        }else { //minimal ada 1 data yang dijumlahkan
            Sum=x; //inisialiasi; invariant !!
            for(;;){
                System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); /* Next Elmt */
                if(x==999){
                    break;
                } else{
                    Sum=Sum+x;
                }
            }

        } System.out.println("Hasil penjumlahan = "+ Sum);

    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
import java.util.Scanner;
//contoh baca nilai x
//jumlahkan nilai yang dibaca dengan ITERATE
public class PrintXRepeat{
    public static void main(String[] args){
        //kamus
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);
        //program

        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Elmt */
        if (x == 999){
            System.out.print("Kasus kosong \n");
        } else{ //minimal ada satu data yang dijumlahkan
            Sum=0; //inisialisasi, invariant!!
            do{
                Sum = Sum + x; /* Proses */
                System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); /* Next Element */
            } while (x !=999); /*kondisi Pengulangan*/{
                System.out.println ("Hasil penjumlahan = "+Sum);
            } //terminate

        }

    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
import java.util.Scanner;
//contoh baca nilai x
//jumlahkan nilai yang dibaca dengan WHILE
public class PrintXWhile{
    public static void main(String[] args){
        //kamus
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);

        //program
        Sum=0; //inisialisasi
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : "); 
        x = masukan.nextInt();/* First Elmt*/

        while (x != 999) /* Kondisi berhenti */ {
            Sum=Sum+x; //proses
            System.out.print("Masukkan nilai x (int), akhiri dg 999 : "); 
            x = masukan.nextInt();/* First Elmt*/
        }
        System.out.println("Hasil penjumlahan = "+ Sum); //terminate
    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
import java.util.Scanner;

// Contoh program yang mengandung prosedur dan fungsi
// prosedur/fungsi

public class SubProgram{
    public static int maxab (int a, int b){
        //mencari maksimum dua bilangan bulat
        return((a>=b) ? a:b);
    }
    public static void tukar (int a, int b){
        //menukar dua bilangan bulat
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println ("Ke dua bilangan setelah tukar: a = "+ a +" b = "+ b);
    }
        //main program
    public static void main(String[] args){
            //membaca dua bilangan integer
            //menuliskan maksimum dua bilangan yang dibaca dengan memanggil fungsi
            //menukar kedua bilangan dengan 'prosedur'
            int a,b;

            Scanner masukan=new Scanner(System.in);
            System.out.print("Maksimum dua bilangan \n");
            System.out.print("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
            a = masukan.nextInt();
            b = masukan.nextInt();
            System.out.println("Ke dua bilangan : a = "+ a +" b = "+ b);
            System.out.println("Maksimum = " + (maxab(a, b)));
            System.out.print("Tukar kedua bilangan...\n");
            tukar (a, b);
        

    }
}
//Nama   : Muhammad Aldo Rifaldi
//Nim    : 13020200007
//Tanggal: 24 maret 2022
//Kelas  : A1
import java.util.Scanner;
//contoh pemakaian IF tiga kasus: wujud air

public class Tempair{
    public static void main(String[] args){
        // kamus
        int T;
        Scanner masukan=new Scanner(System.in);
        //program
        System.out.print ("Contoh IF tiga kasus \n"); 
        System.out.print ("Temperatur (der. C) = "); 
        T=masukan.nextInt();
        if (T < 0){
            System.out.print ("Wujud air beku \n"+ T);
        } else if ((0 <= T) && (T <= 100)){
            System.out.print ("Wujud air cair \n"+ T);
        } else if (T>100){
            System.out.print ("Wujud air uap/gas \n"+ T); 
        };

    }
}
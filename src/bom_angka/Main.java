package bom_angka;
import java.util.Scanner;
public class Main {
    static int a,b=100;
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int angkaBoom = (int)(Math.random()*100);
      while (true) {
          if (a == 0 && b == 100) {
              System.out.println("Maen tebak angka boom yuk" +
                      "...pilih angka " + a + " sampai " + b + "!");
          } else {
              System.out.println("pilih angka " + a + " sampai " + b + "!");
          }
          int tebak = input.nextInt();
          if (tebak > a && tebak < b) {
              if (tebak < angkaBoom) {
                  a = tebak;
              } else if (tebak > angkaBoom) {
                  b = tebak;
              } else if (tebak == angkaBoom) {
                  System.out.println("yah kamu kena boom");
                  break;
              }
          } else {
              System.out.println("pilihan kamu tidak memenuhi syarat tod");
          }
      }
    }
}
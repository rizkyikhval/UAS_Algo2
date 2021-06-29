
package Stack;

public class TumpukanAPP {
     public static void main (String [] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(98);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(30);
        tumpukan.baca();
        System.out.println(" ");
        long nilai = tumpukan.peek();
        System.out.println("nilai teratas = " + nilai);
        System.out.println("nama saya adalah (Muhammad Rizky Ikhval Alamsyah)");
        tumpukan.pop();
        System.out.println("nilai yang dihapus = " + nilai);
        tumpukan.baca();
        tumpukan.push(40);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
    }
}

package inheritance;


class kalkulator{
        int x; 
        int y; 
        
    public kalkulator(){
        this.x = 5; 
        this.y = 6; 
        System.out.println("ini adalah kalkulator");
    }
    public kalkulator(int x, int y){
        this.x=x; 
        this.y=y; 
    }
    public int tambah (int x, int y){
        return x+y; 
    }
    public void print(){
        System.out.println("Jumlah dari " + x + " dan " + y + " adalah " + tambah(x,y));
    }
}

class kalkulatorLebihKeren extends kalkulator {
    public kalkulatorLebihKeren(){
        System.out.println("ini adalah kalkulatorLebihKeren");
    }
    public int kurang(int x, int y){
        return x-y;
    }
}

 class kalkulatorString extends kalkulatorLebihKeren{
     
    public void print(String s){
        System.out.println(super.tambah(5,6));
        
        System.out.println(super.kurang(5,6));
        System.out.println("Print" + s);
        System.out.println("ini adalah kalkulatorString");
    }
    public void print(String s, int x){
        System.out.println("S" + s);
        System.out.println("X" + x);
    }
    public void print(double x, double y){
        System.out.println("ini print 1");
    }
    public void print (int x, int y){
        System.out.println("ini print 2");
    }
    
    public void print(){
        System.out.println("ini adalah print tanpa parameter dari kalkulatorString");
    }
}

/* 
class A{
print()
}

class B extends A{
print()
}    

main class{
B b = new b()
b.print()
}
*/


class A{
    String jan = "cuk"; 
    String a = "su"; 
    
    public void printA(){
        System.out.println(jan);
    }
}

class B extends A{
    String jan = "uari"; 
    
    public void print(){
        System.out.println(jan);
    }
}

class C extends A{
    String ga = "tel"; 
    public void printC(){
        System.out.println(ga);
    }
}
class D extends C{
    String lakukan="sesuatu"; 
}


public class INHERITANCE {
     public static void main(String[] args) {
//        kalkulator kal = new kalkulator(); 
//         System.out.println(kal.tambah(5,6));
//         
//         kalkulatorLebihKeren kal1 = new kalkulatorLebihKeren();
//         System.out.println(kal1.tambah(5,6));
//        kalkulatorString kal2 = new kalkulatorString (); 
////         System.out.println(kal2.tambah(5, 6));
////         System.out.println(kal2.kurang(6, 5));
////         System.out.println(kal2.x);
//            kal2.print("Di print di main class");
//            kal2.print(); 
//         kalkulator kal3 = new kalkulator(9,11); 
//         kal3.print();


            A berak = new C(); 
            berak.printC(); 
             


    }
}

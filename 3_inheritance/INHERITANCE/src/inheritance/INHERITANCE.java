package inheritance;


class kalkulator{
    public int tambah (int x, int y){
        return x+y; 
    }
}

class minus{
    public int tambah (int x, int y){
        return x+y; 
    }
    public int kurang(int x, int  y ){
        return x-y;
    }
}

class tambah3{
    public int tambah (int x, int y, int z){
        return x + y + z; 
    }
}

class tambah{
    
}

public class INHERITANCE {
     public static void main(String[] args) {
        kalkulator kal = new kalkulator(); 
         System.out.println(kal.tambah(5,6));
    }
}

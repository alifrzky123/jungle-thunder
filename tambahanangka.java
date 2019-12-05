public class tambahanangka{
    public static void main(String[] args){
        System.out.println("SELAMAT DATANG DI PROGRAM TAMBAH 2 ANGKA");
        int num = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int hasil = num + num2;
        if(args.length == 0){
            System.out.println("HARUS DIISI");
        }else{
            System.out.println(num + num2);
        }
    }
}
public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
        mobil bmw = new mobil(); //object mobil bmw
        bmw.merk = "BMW i3000";
        bmw.maju();

        mobil fordShelby = new mobil();
        fordShelby.merk = "Ford Mustang";
        fordShelby.maju();
    }
}

class mobil{
    String merk;

    public void maju(){
        System.out.println("Mobil "+this.merk+" Maju! ");
    }
}
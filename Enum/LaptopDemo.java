package Enum;
enum Laptop{
    Mac(200),XPS(100),Surface(250),Thinkpad(120);
    private int price;
    private Laptop(int price){
        this.price=price;
        System.out.println("Laptop : "+this.name());
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
}
public class LaptopDemo {
    public static void main(String[] args) {
        Laptop lap[]=Laptop.values();
        for(Laptop l:lap){
        System.out.println(l.ordinal()+1+" - "+ l+" : "+" $ "+l.getPrice());
    }
    }
    
}
// if we use config server, then all client needs to have config sevr details in bootstap yml/properties
// uf we use euerka, then all clients need eurentka store in peopr
// if config is presnet , good-> start before other
// if eurka presnet-> good start before other 
// <------------------------------------Q - 1 ------------------------------------------>
class cylinder {
    private int radius;
    private int height;

    public void setradius(int r) {
        radius = r;
    }

    public void getradius() {
        System.out.println("Radius : " + radius);
    }

    public void sethieght(int h) {
        height = h;
    }

    public void getheight() {
        System.out.println("Height : " + height);
    }

    // <--------------------------------------- Q - 2
    // ----------------------------------->
    public void surfacearea() {
        System.out.println("Surface area : " + (2 * 3.14 * radius * (radius + height)));
    }

    public void volume() {
        System.out.println("Volume : " + 3.14f * radius * radius * height);
    }

    // <--------------------------------------- Q - 3
    // ----------------------------------->
    public cylinder(int Radius, int Height) {
        radius = Radius;
        height = Height;
        System.out.println("Radius : " + Radius);
        System.out.println("Height : " + Height);
    }
}

// <--------------------------------------------Q - 4
//  ------------------------------------->
class Rectangle{
    private int length;
    private int breadth;
    public void Rectangle(int length){
        this.breadth = 5;
        System.out.println("Length : "+length);
        System.out.println("Breadth : "+breadth);
    }
    public void Rectangle(int length,int breadth){
        this.length =4;
        this.breadth=5;
        System.out.println("Length : "+length);
        System.out.println("Breadth : "+breadth);
    }
    public void Rectangle(){
        
    }
}
public class practice2 {
    public static void main(String[] args) {
        cylinder cyl = new cylinder(7, 10);
        // cyl.setradius(7);
        // cyl.getradius();
        // cyl.sethieght(10);
        // cyl.getheight();
        // cyl.surfacearea();
        // cyl.volume();
    }
}

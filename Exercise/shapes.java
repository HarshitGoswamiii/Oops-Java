class Rectangle {
    int len, bre,hei;
    
    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getBre() {
        return bre;
    }
    
    public void setBre(int bre) {
        this.bre = bre;
    }
    public int getHei() {
        return hei;
    }

    public void setHei(int hei) {
        this.hei = hei;
    }
    public void SurfaceArea() {
        System.out.println(len*bre);
    }

    public void Volume() {

    }

}

class Circle extends Rectangle {

}

class Square extends Circle {

}

class Sphere extends Square {

}

class Cylinder extends Sphere {

}

public class shapes {
    public static void main(String[] args) {

    }
}

abstract class Shape {
    int width;
    abstract void area();
}
//your code goes here
class Square extends Shape {

    public Square(int width) {
        this.width = width;
    }

    @Override
    void area() {
        System.out.println(width * width);
    }
}

class Circle extends Shape {

    public Circle(int width) {
        this.width = width;
    }

    @Override
    void area() {
        System.out.println(Math.PI * width * width);
    }
}



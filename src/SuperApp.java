 class Shape {
    int getCornor(){
        return 0;
    }
}

class Rectangle extends Shape{
    int getCornor(){
        return 4;
    }
    int getParentConrner(){
        return super.getCornor();
    }
}

public class SuperApp{
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getCornor());

        var reactable = new Rectangle();
        System.out.println(reactable.getCornor());
        System.out.println(reactable.getParentConrner());
    }
}

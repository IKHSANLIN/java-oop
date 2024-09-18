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

public class SuperApp()

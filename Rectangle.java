public class Rectangle extends Circle {
    private int bottom;
    public Rectangle ( int left, int top, int right, int bottom){
        super(left, top, right);
        this.bottom = bottom;
    }

    @Override
    public void displayInfo(){
        System.out.print("paint rectangle " + "Rect{ left = " + x + "top = " + y + "right = " +
                radius + "bottom = " + bottom + "}");
    }
    public double perimeter(){
        return 2*(y - radius + bottom - x);
    }
}

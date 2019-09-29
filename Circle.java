public class Circle {
    protected int radius, x, y;
    public Circle(int radius, int x, int y){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public void displayInfo(){
        System.out.print("paint circle " + "radius = " + radius +  "and centre = " + "("
                + x + "," + y + ")");

    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }

}

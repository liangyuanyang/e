public class circle {
    public double radious;
    public circle(double radious){
        this.radious = radious;
    }
    public double getRadious(){
        return this.radious;
    }
    public void setRadious(double radious){
        this.radious = radious;
    }
    public double getArea(){
        return radious*radious*Math.PI;
    }
    public double getPerimeter(){
        return 2*radious*Math.PI;
    }

}

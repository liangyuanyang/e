
    public abstract class Shape {
        public abstract double getArea();

        public abstract double getPerimeter();

        class Circle extends Shape {
            private double radious;

            public double getRadious() {
                return radious;
            }

            public void setRadious(double radious) {
                this.radious = radious;
            }

            public Circle(Double radious) {
                this.radious = radious;
            }

            public double getArea() {
                return Math.PI * radious * radious;
            }

            public double getPerimeter() {
                return 2 * Math.PI * radious;
            }

            class Rectangle extends Shape {
                private double x, y;

                public double getX() {
                    return x;
                }

                public double getY() {
                    return y;
                }

                public void setX(double x) {
                    this.x = x;
                }

                public void setY(double y) {
                    this.y = y;
                }

                public Rectangle(double x, double y) {
                    this.x = x;
                    this.y = y;
                }

                public double getArea() {
                    return x * y;
                }

                public double getPerimeter() {
                    return 2 * (x + y);
                }
            }
        }
    }

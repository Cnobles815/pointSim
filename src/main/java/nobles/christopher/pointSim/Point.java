package nobles.christopher.pointSim;

/**
 * Created by christophernobles on 9/13/16.
 */
public class Point {
    double xCo;
    double yCo;
    double zCo;

    public Point(double x, double y, double z) {

        this.xCo = x;
        this.yCo = y;
        this.zCo = z;

        }

    public Point() {

        this.xCo = 0;
        this.yCo = 0;
        this.zCo = 0;
    }

    public void setXCo() {

        this.xCo = xCo;

    }

    public void setYCo() {

        this.yCo = yCo;

    }

    public void setZCo() {

        this.zCo = zCo;

    }

    public double getXCo() {

        return xCo;
    }

    public double getYCo() {

        return yCo;
    }

    public double getZCo() {

        return yCo;
    }
}

class ImmutablePoint {


}
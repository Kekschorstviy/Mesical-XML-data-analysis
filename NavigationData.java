public class NavigationData {

    /**
     * time and tool values
     */
    private int time;
    private int systemTime;
    private int tool;
    /**
     * Coordinates
     */
    private double x;
    private double y;
    private double z;
    private double Qx;
    private double Qy;
    private double Qz;
    /**
     * Radius
     */
    private double Qr;
    /**
     * C.. Values
     */
    private int c00;
    private int c01;
    private int c02;
    private int c03;
    private int c04;
    private int c05;
    private int c10;
    private int c11;
    private int c12;
    private int c13;
    private int c14;
    private int c15;
    /**
     * "Status"
     */
    private int valid;
    private int hO;
    private int hP;

    public NavigationData(int time, int systemTime, int tool, double x, double y,
                          double z, double qx, double qy, double qz, double qr,
                          int c00, int c01, int c02, int c03, int c04, int c05,
                          int c10, int c11, int c12, int c13, int c14, int c15,
                          int valid, int hO, int hP) {
        this.time = time;
        this.systemTime = systemTime;
        this.tool = tool;
        this.x = x;
        this.y = y;
        this.z = z;
        this.Qx = qx;
        this.Qy = qy;
        this.Qz = qz;
        this.Qr = qr;
        this.c00 = c00;
        this.c01 = c01;
        this.c02 = c02;
        this.c03 = c03;
        this.c04 = c04;
        this.c05 = c05;
        this.c10 = c10;
        this.c11 = c11;
        this.c12 = c12;
        this.c13 = c13;
        this.c14 = c14;
        this.c15 = c15;
        this.valid = valid;
        this.hO = hO;
        this.hP = hP;
    }

    /**
     * Getters
     *
     * @return
     */
    public int getTime() {
        return time;
    }

    public int getSystemTime() {
        return systemTime;
    }

    public int getTool() {
        return tool;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getQx() {
        return Qx;
    }

    public double getQy() {
        return Qy;
    }

    public double getQz() {
        return Qz;
    }

    public double getQr() {
        return Qr;
    }

    public int getC00() {
        return c00;
    }

    public int getC01() {
        return c01;
    }

    public int getC02() {
        return c02;
    }

    public int getC03() {
        return c03;
    }

    public int getC04() {
        return c04;
    }

    public int getC05() {
        return c05;
    }

    public int getC10() {
        return c10;
    }

    public int getC11() {
        return c11;
    }

    public int getC12() {
        return c12;
    }

    public int getC13() {
        return c13;
    }

    public int getC14() {
        return c14;
    }

    public int getC15() {
        return c15;
    }

    public int getValid() {
        return valid;
    }

    public int gethO() {
        return hO;
    }

    public int gethP() {
        return hP;
    }

    /**
     * Setters
     */

    public void setTime(int time) {
        this.time = time;
    }

    public void setSystemTime(int systemTime) {
        this.systemTime = systemTime;
    }

    public void setTool(int tool) {
        this.tool = tool;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setQx(double qx) {
        Qx = qx;
    }

    public void setQy(double qy) {
        Qy = qy;
    }

    public void setQz(double qz) {
        Qz = qz;
    }

    public void setQr(double qr) {
        Qr = qr;
    }

    public void setC00(int c00) {
        this.c00 = c00;
    }

    public void setC01(int c01) {
        this.c01 = c01;
    }

    public void setC02(int c02) {
        this.c02 = c02;
    }

    public void setC03(int c03) {
        this.c03 = c03;
    }

    public void setC04(int c04) {
        this.c04 = c04;
    }

    public void setC05(int c05) {
        this.c05 = c05;
    }

    public void setC10(int c10) {
        this.c10 = c10;
    }

    public void setC11(int c11) {
        this.c11 = c11;
    }

    public void setC12(int c12) {
        this.c12 = c12;
    }

    public void setC13(int c13) {
        this.c13 = c13;
    }

    public void setC14(int c14) {
        this.c14 = c14;
    }

    public void setC15(int c15) {
        this.c15 = c15;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    public void sethO(int hO) {
        this.hO = hO;
    }

    public void sethP(int hP) {
        this.hP = hP;
    }
}

package lab4;

import java.util.ArrayList;

public class graphic {
    public graphic(int scaleX, int scaleY, int diapXmin, int diapXmax, int diapYmin, int diapYmax){
        grid = new Grid(scaleX, scaleY, diapXmin, diapXmax, diapYmin, diapYmax);
    }

    private Grid grid;
    private int taked;
    private ArrayList<Line> lines = new ArrayList<>();
    public void AddLine(Line line) {
        lines.add(line);
        taked++;
    }
    public void RemoveLastLine() {
        System.out.println("Line ");
        lines.remove(taked-1);
        taked--;
    }
    public void printInfo(){
        String num = "№";
        String name = "f(x)";
        String color = "Color";
        System.out.println("Scale on oX: " + grid.axisX.getScale() + " points per division");
        System.out.println("Diaposon on oX: " + grid.axisX.getMinDiap() + ", " + grid.axisX.getMaxDiap()+"\n");
        System.out.println("Scale on oY: " + grid.axisY.getScale() + " points per division");
        System.out.println("Diaposon on oY: " + grid.axisY.getMinDiap() + ", " + grid.axisY.getMaxDiap()+"\n");
        System.out.printf("%-3s | %-10s | %-10s ",num,name,color );
        System.out.println();
        for (int i =0; i<taked; i++){
            System.out.printf("%-3s | %-10s | %-10s \n",i,lines.get(i).func.name, lines.get(i).getColor());
        }
    }
    public void setScaleOX(int scale){
        grid.axisX.setScale(scale);
    }
    public void setScaleOY(int scale){
        grid.axisY.setScale(scale);
    }
    public void setMinDiapOx(int diap){grid.axisX.minDiap = diap;}
    public void setMaxDiapOx(int diap){grid.axisX.maxDiap = diap;}
    public void setMinDiapOy(int diap){grid.axisY.minDiap = diap;}
    public void setMaxDiapOy(int diap){grid.axisY.maxDiap = diap;}
    public void setFuncName(String name, int line_num){
        lines.get(line_num).func.setName(name);
    }
    public void setLineColor(Line.COLOR color, int line_num){
        lines.get(line_num).setColor(color);
    }
    public void setFunc(int line_num, String name, Func func_temp) {
        lines.get(line_num).func = func_temp;
        setFuncName(name, line_num);
    }
}
class Axis {

    //String VERTICAL, HORIZON;
    public enum DIRECTION {HORIZON, VERTICAL}

    public Axis(int scale, int minDiap, int maxDiap){
        this.scale = scale;
        this.minDiap = minDiap;
        this.maxDiap = maxDiap;
    }
    private int scale;
    protected int minDiap;
    protected int maxDiap;
    public int getMinDiap(){return minDiap;}
    public int getMaxDiap(){return maxDiap;}
    public int getScale(){return scale;}
    public void setMinDiap(int diap){this.minDiap = diap;}
    public void setMaxDiap(int diap){this.maxDiap = diap;}
    public void setScale(int scale){this.scale = scale;}
}


class Func {
    protected String name;
    public double F(double x_tmp){
        return x_tmp;
    }
    public String getName(){return name;}
    public void setName(String name_tmp){this.name=name_tmp;}

}
class Grid {
    public Grid(int scaleX, int scaleY, int diapXmin, int diapXmax, int diapYmin, int diapYmax){
//        axisX = new Axis(scaleX,diapXmin,diapXmax, Axis.DIRECTION.HORIZON);
//        axisY = new Axis(scaleY,diapYmin,diapYmax, Axis.DIRECTION.VERTICAL);

    }
    protected Axis axisX;
    protected Axis axisY;

}
class Line {
    public enum COLOR{RED,GREEN,BLUE,YELLOW,BLACK,BROWN}
    public Line(){
        color = COLOR.BLACK;
        func = new Func();
        func.name = "default";
    }
    public Line(COLOR color, String name,Func func) {
        this.color = color;
        this.func = func;
        this.func.name = name;
    }
    protected Func func;
    private COLOR color;
    public void setColor(COLOR color){
        this.color = color;
    }
    public COLOR getColor(){return color;}

}


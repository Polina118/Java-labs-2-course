package lab4;

public class Complex_user {
    private double real;
    private double image;

    public Complex_user(double real_temp, double image_temp) {
        real = real_temp;
        image = image_temp;
    }

    public Complex_user() {
    }

    ; //default konstr

    public double getReal() {
        return real;
    }

    public double getImage() {
        return image;
    }

    public void setReal(double real_temp) {
        real = real_temp;
    }

    public void setImage(double image_temp) {
        image = image_temp;
    }

    public boolean equ(Complex_user second) {
        if ((this.real == second.real) & (this.image == second.image)) {
            return true;
        } else return false;
    }

    public void printAlgebraic() {
        if (image > 0) {
            System.out.println(real + " + i * " + image);
        } else if (image < 0) {
            System.out.println(real + " - i * " + image * (-1));
        } else {
            System.out.println(real);
        }
    }

    public void printComplexSopr() {
        System.out.println(real + " - i * (" + image + ")");
    }

    public void printTrigonom() {
        double fi = Math.atan(image / real);
        double r = Math.sqrt(real * real + image * image);
        double cosFi = Math.cos(fi);
        double sinFi = Math.sin(fi);
        System.out.println(r + " * (" + cosFi + " + i* " + sinFi + ")");
    }

    public void printTrigonom2() {
        double fi = Math.atan(image / real);
        double r = Math.sqrt(real * real + image * image);
        double cosFi = Math.cos(fi);
        double sinFi = Math.sin(fi);
        System.out.println(r + " * (cos(" + fi + ") + i* sin(" + fi + "))");
    }

    public Complex_user add(Complex_user z1, Complex_user z2) {
        this.real = z1.real + z2.real;
        this.image = z1.image + z2.image;
        return this;
    }

    public Complex_user sub(Complex_user z1, Complex_user z2) {
        this.real = z1.real - z2.real;
        this.image = z1.image - z2.image;
        return this;
    }

    public Complex_user mul(Complex_user z1, Complex_user z2) {
        this.real = z1.real * z2.real - z1.image * z2.image;
        this.image = z1.real * z2.image + z2.real * z1.image;

        return this;
    }

    public Complex_user div(Complex_user z1, Complex_user z2) {
        this.real = (z1.real * z2.real + z1.image * z2.image) / (z2.real * z2.real + z2.image * z2.image);
        this.image = (z2.real * z1.image - z1.real * z2.image) / (z2.real * z2.real + z2.image * z2.image);
        return this;
    }

    public double operationWithDouble(double a, String operator, int posled) {
        if (this.image == 0) {
            switch (operator) {
                case "+":
                    return a + this.real;

                case "-":
                    switch (posled) {
                        case 0:
                            return a - this.real;

                        case 1:
                            return this.real - a;
                    }
                case "*":
                    return a * this.real;
                case "/":
                    switch (posled) {
                        case 0:
                            return a / this.real;
                        case 1:
                            return this.real / a;
                    }
                case "^":
                    switch (posled) {
                        case 0:
                            return Math.pow(a, this.real);
                        case 1:
                            return Math.pow(this.real, a);
                    }
                default:
                    if (posled != 0 || posled != 1) {
                        System.out.println("posled must be ==0 or 1");
                    }
            }
        } else {
            System.out.println("Image!=0");
        }
        return -1;
    }
}

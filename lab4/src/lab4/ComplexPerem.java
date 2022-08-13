package lab4;

public class ComplexPerem {

    public static Complex_user expZ(Complex_user z) {
        double real_temp = Math.exp(z.getReal()) * Math.cos(z.getImage());
        double image_temp = Math.exp(z.getReal()) * Math.sin(z.getImage());
        z.setReal(real_temp);
        z.setImage(image_temp);
        return z;
    }

    public static Complex_user sinZ(Complex_user z) {
        Complex_user z01_temp = new Complex_user(0, 1);
        Complex_user z02_temp = new Complex_user(0, -1);
        Complex_user z03_temp = new Complex_user(0, 2);

        Complex_user z1_temp = new Complex_user().mul(z, z01_temp);
        Complex_user z2_temp = new Complex_user().mul(z, z02_temp);

        z1_temp = ComplexPerem.expZ(z1_temp);
        z2_temp = ComplexPerem.expZ(z2_temp);

        Complex_user z3_temp = new Complex_user().sub(z1_temp, z2_temp);
        Complex_user z4_temp = new Complex_user().div(z3_temp, z03_temp);
        z4_temp.printAlgebraic();
        return z4_temp;
    }

    public static Complex_user cosZ(Complex_user z) {
        Complex_user z01_temp = new Complex_user(0, 1);
        Complex_user z02_temp = new Complex_user(0, -1);
        Complex_user z03_temp = new Complex_user(2, 0);

        Complex_user z1_temp = new Complex_user().mul(z, z01_temp);
        Complex_user z2_temp = new Complex_user().mul(z, z02_temp);
        z1_temp = ComplexPerem.expZ(z1_temp);
        z2_temp = ComplexPerem.expZ(z2_temp);

        Complex_user z3_temp = new Complex_user().add(z1_temp, z2_temp);

        z = z3_temp.div(z3_temp, z03_temp);
        return z;
    }

    public static Complex_user tanZ(Complex_user z) {
        Complex_user z01_temp = new Complex_user().div(ComplexPerem.sinZ(z), ComplexPerem.cosZ(z));
        return z01_temp;
    }

    public static Complex_user arcTanZ(Complex_user z) {
        Complex_user z01_temp = new Complex_user().div(ComplexPerem.cosZ(z), ComplexPerem.sinZ(z));
        return z01_temp;
    }

    public static Complex_user shZ(Complex_user z) {
        Complex_user z01_temp = new Complex_user(-1, 0);
        Complex_user z02_temp = new Complex_user(2, 0);
        Complex_user z1_temp = new Complex_user().mul(z, z01_temp);
        Complex_user z2_temp = new Complex_user().div(z01_temp.sub(ComplexPerem.expZ(z), ComplexPerem.expZ(z1_temp)), z02_temp);
        return z2_temp;
    }

    public static Complex_user chZ(Complex_user z) {
        Complex_user z01_temp = new Complex_user(-1, 0);
        Complex_user z02_temp = new Complex_user(2, 0);
        Complex_user z1_temp = new Complex_user().mul(z, z01_temp);
        Complex_user z2_temp = new Complex_user().div(z01_temp.add(ComplexPerem.expZ(z), ComplexPerem.expZ(z1_temp)), z02_temp);
        return z2_temp;
    }

    public static Complex_user thZ(Complex_user z) {
        Complex_user z02_temp = new Complex_user(z.getReal(), z.getImage());
        Complex_user z03_temp = new Complex_user(z.getReal(), z.getImage());
        Complex_user z1_temp = ComplexPerem.shZ(z02_temp);
        Complex_user z2_temp = ComplexPerem.chZ(z03_temp);
        Complex_user z01_temp = new Complex_user().div(z1_temp, z2_temp);

        return z01_temp;
    }

    public static Complex_user cthZ(Complex_user z) {
        Complex_user z02_temp = new Complex_user(z.getReal(), z.getImage());
        Complex_user z03_temp = new Complex_user(z.getReal(), z.getImage());
        Complex_user z1_temp = ComplexPerem.shZ(z02_temp);
        Complex_user z2_temp = ComplexPerem.chZ(z03_temp);
        Complex_user z01_temp = new Complex_user().div(z2_temp, z1_temp);

        return z01_temp;
    }

    public static Complex_user eIX(double x) {
        Complex_user z = new Complex_user(Math.cos(x), Math.sin(x));
        return z;
    }
}

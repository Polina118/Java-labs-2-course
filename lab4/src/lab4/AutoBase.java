package lab4;

public class AutoBase {
    Car[] base;
    Car[] voyage;
    Car[] repair;
    int nBase, nVoyage, nRepair;

    AutoBase(int max){
        base = voyage = repair = new Car[max];
        nBase = nVoyage = nRepair = 0;
    }

    void isGood(Car c){
        delete(c, base, nBase);
        if (c.Good)
            AddVoyage(c);
        else
            AddRepair(c);
    }

    public void AddBase(Car c){
        if(nBase>=base.length)return;
        base[nBase] = c;
        nBase++;
    }
    void AddVoyage(Car c) {
        for (Car i : base) {
            if (c == i) {
                voyage[nVoyage] = c;
                delete(c,base, nBase);
                break;
            }
        }
        nVoyage++;
    }
    private void AddRepair(Car c) {
        for (Car i : base) {
            if (c == i) {
                repair[nRepair] = c;
                delete(c,base, nBase);
                break;
            }
            nRepair++;
        }
    }

    private void delete(Car c, Car[] a, int len)
    {
        int j;
        for(j=0; j<len; j++)
            if(c == a[j])
                break;
        if(j!=len)
        {
            int k=j;
            while (k<len) {
                a[k] = a[k+1];
                k++;
            }
            --len;
        }
    }
    public void ReturnFromVoyage(Car c){
        delete(c, voyage, nVoyage);
        AddBase(c);
    }
    public void ReturnFromRepair(Car c) {
        delete(c, repair, nRepair);
        c.Good = true;
        AddBase(c);
    }
    public void display()
    {
        System.out.println("base");
        for(int j =0; j < nBase; j++)
            base[j].display();
        System.out.println("voyage");
        for(int j =0; j < nVoyage; j++)
            voyage[j].display();
        System.out.println("repair");
        for(int j =0; j < nRepair; j++)
            repair[j].display();
        System.out.println();

    }
}


package Student;

public class mark {
 private int mathMark;
 private int bioMark;

 private  int phyMark;

    public void setMathMark(int mathMark) {
        this.mathMark = mathMark;
    }

    public void setBioMark(int bioMark) {
        this.bioMark = bioMark;
    }

    public void setPhyMark(int phyMark) {
        this.phyMark = phyMark;
    }

    public int getMathMark() {
        return mathMark;
    }

    public int getBioMark() {
        return bioMark;
    }

    public int getPhyMark() {
        return phyMark;
    }
    void display()
    {
        System.out.println(mathMark);
        System.out.println(bioMark);
        System.out.println(phyMark);
    }
}

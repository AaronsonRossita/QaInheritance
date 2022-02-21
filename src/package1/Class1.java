package package1;


import package2.Class3;

public class Class1 {

    int xDefault;
    public int xPublic;
    protected int xProtected;
    private int xPrivate;

    public void setxPrivate(int xPrivate) {
        if(xPrivate == 5){
            this.xPrivate = xPrivate;
        }else {
            System.out.println("No");
        }
    }

    public int getxPrivate() {
        return xPrivate;
    }

    public void print(){
        System.out.println(xPrivate);
    }


}

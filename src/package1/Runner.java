package package1;

import package2.Class3;

public class Runner {

    public static void main(String[] args) {


        Class1 c1 = new Class1();

        c1.xDefault = 0;
        c1.xProtected = 0;
        c1.xPublic = 0;
//        c1.xPrivate = 0;
        c1.setxPrivate(7);

        c1.xPublic = 3;
        c1.xPublic = 4;

        c1.setxPrivate(9);

        System.out.println(c1.xProtected);
        System.out.println(c1.getxPrivate());

        Class2 c2 = new Class2();

        Class3 c3 = new Class3();
        c3.xPublic = 0;
        c3.getxPrivate();

    }
}

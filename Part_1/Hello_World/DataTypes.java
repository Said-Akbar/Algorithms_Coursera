public class DataTypes {
    // easy print
    static void print(String item){
        System.out.println(item);
    }
    // custom method for using in the main class
    static void myMethod(){
        System.out.println(("Method executed!"));
    }
    // parameters
    static void printNames(String fname, int age){
        System.out.println("Hello, "+fname+"\n"+"Age: "+age);
    }
    // return values
    static int getAge(int birthDate){
        return 2021-birthDate;
    }
    // method overloading
    static int addValues(int x, int y) {
        return x+y;
    }
    static double addValues(double x, double y) {
        return x+y;
    }
    int myClassVar = 2020;

    public static void main(String[] args) {

        byte byteType = (byte) (Math.pow(2, 7) - 1); // -128 ... 127
        short shortType = (short) (Math.pow(2, 15) - 1); // -32,768 ... 32,767
        int intType = (int) Math.pow(2, 31);
        long longType = (long) Math.pow(2, 63);
        // float, bool, char
        float floatType =(float) Math.pow(2,127); // 7 digits with 2^127 range
        boolean boolType = true;
        char charType = 'A';

        System.out.println("Byte type: " + byteType);
        System.out.println("short Type: " + shortType);
        System.out.println("int Type: " + intType);
        System.out.println("long Type: " + longType);

        System.out.println("float Type: " + floatType);
        System.out.println("bool Type: " + boolType);
        System.out.println("char Type: " + charType);
        // arrays
        String[] cars = {"volvo", "benz", "volkswagen", "BMW"};
        // for loop
        for (int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
        // for each
        for (String i: cars){
            System.out.println(i);
        }
        //ternary operator
        System.out.println((18>20)?"18 is greater than 20":"18 is not greater than 20");
        // switch
        int day = 4;
        String today;
        switch (day) {
            case 1:
                today="Monday";
                break;
            case 2:
                today="Tuesday";
                break;
            case 3:
                today="Wednesday";
                break;
            case 4:
                today="Thursday";
                break;
            default:
                today="Close to weekend";
        }
        System.out.println(today);
        // break and continue
        for (int i=0; i<10; i++) {
            if (i==4) continue;
            System.out.println(i);
        }
        myMethod(); // calls the method;
        printNames("Said", 27);
        printNames("Ali", 28);

        int ageX = getAge(1993);
        System.out.println("calculated age: "+ageX);

        // method overloading
        double floatNum = addValues(3.4, 5.6);
        int intNum = addValues(3,8);
        System.out.println(floatNum +" "+ intNum);

        // class var
        DataTypes myObj = new DataTypes();
        System.out.println(myObj.myClassVar);
    }
}

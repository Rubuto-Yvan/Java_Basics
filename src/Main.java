//        CLASS
//
//        class Greetings{
//            String name = "Rubuto Yvan";
//            public void greet(){
//                System.out.print("Hello " + name + " !!");
//            }
//        }
//        ______________________________________________________________________
//        ARRAY OF OBJECTS
//        class Student
//        {
//            int id;
//            String name;
//            int marks;
//        }
//        _______________________________________________________________________
//        STATIC VARIABLE AND METHOD

class Product
{
    int id;
    String name;
    static int price;

    public static void menu(Product object)
    {
        System.out.println("| " + object.id + " | " + object.name + " | " + price + " |");
    }
}


class Hello
{
    public static void main (String args []) {

//        RULES
//
//        [1] Every line in Java must end with a semicolon
//        [2]
//        [3]
//        ______________________________________________________________________
//        DATA TYPES
//
//        byte number = 127;
//        int num = 257;
//        float numbr = 234.78f;
// //     For Float Data Type you have to put f at the back of the value
//
//        double n = 34.789;
//        char a = "a";
//        boolean bool = true;
//        _______________________________________________________________________
// //     CONDITIONAL STATEMENTS
//
// //     IF - ELSE
//
//        if (false)
//            System.out.println("Hi There Aliens!!");
//        else
//            System.out.println("Hi There Humans!!");
//
// //     SWITCH CASE
//
//        int checker = 1;
//        String result = switch (checker)
//        {
//            case 3 -> "Hello World!!";
//            case 2 -> "A Wise Man!!";
//            default -> "Very Nice!!";
//        }
//        _____________________________________________________
// //     LOOPS
//
//        WHILE LOOP
//
//        byte i = 0;
//        while (true)
//        {
//            System.out.println("Hello Java!!" + i);
//            i++;
//        }
//
//        FOR LOOP
//        byte i = 0;
//        for (i = 0; i <= 10; i++)
//        {
//            System.out.println("Rubuto Yvan is Learning Java!!");
//        }
//
//        DO - WHILE LOOP
//
//        int i = 0;
//        do
//        {
//            System.out.println("Rubuto Yvan is Learnig Java!!");
//            i++;
//        }
//        while (i <= 10);
//        ____________________________________________________________________
//        SIMPLE EXERCISE
//
//        PRINTING A RECTANGLE
//
//        int i = 0;
//        int j = 0;
//        for (i = 0; i <= 10; i++) {
//            for (j = 0; j <= 10; j++) {
//                System.out.print(" x ");
//            }
//            System.out.println();
//        }
//        ___________________________________________________________________
//        CLASS AND OBJECTS
//
//        OBJECTS
//
//        Greetings myname = new Greetings();
//        myname.greet();
//        ___________________________________________________________________
//        ARRAYS
//
//        int arr [] = {2, 3, 4, 5};
//        int arr1 [] = new int[4];
//        int md_arr [][] = new int[5][5];
//
//        for (int i = 0; i < 5; i++)
//        {
//            for (int j = 0; j < 5; j++)
//            {
//                md_arr [i][j] = (int) (Math.random() * 10);
//            }
//        }
//
//        for (int i = 0; i < 5; i++)
//        {
//            for (int j = 0; j < 5; j++)
//            {
//                System.out.print(md_arr [i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
// //     USING ENHANCED FOR LOOP
//
//        This Loop returns only the first element in an array so It will
//        return the first array in a multi-dimensional array hence being
//        able to return other elements in that sub-array
//
//        for (int n [] : md_arr)
//        {
//            for (int m : n)
//            {
//                System.out.print(m + " ");
//            }
//            System.out.println();
//        }
//        _________________________________________________________________
//        ARRAY OF OBJECTS
//
//        Student Ivan = new Student();
//        Ivan.id = (int) (Math.random() * 10);
//        Ivan.name = "Rubuto Yvan";
//        Ivan.marks = (int) (Math.random() * 100);
//
//        Student Paccy = new Student();
//        Paccy.id = (int) (Math.random() * 10);
//        Paccy.name = "Paccy Pank";
//        Paccy.marks = (int) (Math.random() * 100);
//
//        Student Eric = new Student();
//        Eric.id = (int) (Math.random() * 10);
//        Eric.name = "Eric Christian";
//        Eric.marks = (int) (Math.random() * 100);
//
//        Student students [] = new Student [3];
//
//        students [0] = Ivan;
//        students [1] = Paccy;
//        students [2] = Eric;
//
//        for (Student student : students)
//        {
//            System.out.println("| " + student.id + " | " + student.name + " | " + student.marks + " |");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < students.length; i++)
//        {
//            System.out.println("| " + students [i].id + " | " + students [i].name + " | " + students [i].marks + " |");
//        }
//        ___________________________________________________________________________________________________
//       STRINGS
//
//        String my_name = "NKILIYE RUBUTO Yvan";
//
//        This String is a class however you do
//        not follow the normal way
//        of creating the objects to make the variables and by
//        default strings are Immutable i.e can not be changed
//
//        You can access multiple methods from String class as
//        the variable you create behaves as an objects of that
//        class

//        System.out.println(my_name.concat(" Y2A "));

//        To create a Mutable string you can use StringBuffer or StringBuilder

//        StringBuffer myName = new StringBuffer();

//        myName.append("Rubuto Yvan");

//        To add content in the newly made object you have to use the
//        methods like append as you have seen
//
//        You can access multiple methods from String class as
//        the variable you create behaves as an objects of that
//        class
//
//        System.out.println(myName);
//        System.out.println(myName.capacity());
//        System.out.println(myName.length());
//        myName.setLength(15);
//        System.out.println(myName);
//        _____________________________________________________________________
//        STATIC VARIABLE

//        Product cake = new Product();
//        cake.id = 1;
//        cake.name = "Creamed Cake";
//
//        Product biscuit = new Product();
//        biscuit.id = 2;
//        biscuit.name = "Glucose";
//
//        Product.price = 6000;
//      It becomes the same for all objects as it is static

//        System.out.println(cake.price);
//        System.out.println(biscuit.price);
//
//        biscuit.price = 700;
//
//        System.out.println(cake.price);
//        System.out.println(biscuit.price);

//        It seems like if you change on one object the result changes
//        even on the other

//        System.out.println("It is known that Glucose Biscuit costs " + biscuit.price + " on the market");
//        System.out.println("It is also known that Creamed Cake costs " + cake.price + " on the market");
//
//        System.out.println();
//        System.out.println();
//
//
//        System.out.println("Please check on the Table given if you doubt!!");
//        Product.menu(biscuit);
//        Product.menu(cake);
    }
}
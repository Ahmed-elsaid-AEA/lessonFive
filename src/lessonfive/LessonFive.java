/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonfive;

import java.util.Scanner;

/**
 *
 * @author A.E.A
 */
public class LessonFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//     "قم بعمل برنامج يسمع للمتسخدم بادخال االسم والرقم والهوايات والكلية ودرجتة ، واذا كانت الدرجة اكبر \n" +
//"من 50 واصغر من 60 قم بطباعة مقبول وهكذا \n" +
//"وقم في النهاية بطباعة كل البيانات"
        /* String name, hoppy, faculty, number;
        double grade;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your name : ");
        name = input.nextLine();
        System.out.println("Enter Your hoppy : ");
        hoppy = input.nextLine();
        System.out.println("Enter Your faculty : ");
        faculty = input.nextLine();
        System.out.println("Enter Your number : ");
        number = input.nextLine();
        System.out.println("Enter Your grade : ");
        grade = input.nextDouble();
        String x;
        if (grade >= 50 && grade < 60) {
            x = "مقبول";
        } else if (grade >= 60 && grade < 70) {
            x = "جيد";
        } else if (grade >= 70 && grade < 80) {
            x = "جيد جدا";
        } else if (grade >= 80 && grade <= 100) {
            x = "ممتاز";
        } else if (grade < 50) {
            x = "راسب";
        } else if (grade > 100) {
            x = "not grade";
        } else {
            x = "error";
        }
        System.out.println("name :"+name + " , " 
                + hoppy + " , " +
                faculty + " , " + number +" , "+x);*/
//        double x = 10;
//        if (x > 5) { 
//
//        } else if (x == 5) {
//
//        } else {
//
//        }
//        int x = 4;//4 6 8
//        switch (x) {
//            case 4:
//                System.out.println("4");
//                System.out.println("65");
//                break;
//            case 6:
//                System.out.println("6");
//                break;
//            case 8:
//                System.out.println("8");
//                break;
//            default:
//                System.out.println("not found");
//                break;
//        }
        /* String faculty = "علوم";
        switch (faculty) {
            case "هندسة":
                System.out.println(faculty);
                break;
            case "طب":
                System.out.println(faculty);
                 break;
            case "علوم":
                System.out.println(faculty);
                 break;
            default:
                System.out.println("not found");
                 break;
        }
        if(faculty.equals("هندسة")){
            System.out.println(faculty);
        }else if(faculty.equals("طب")){
              System.out.println(faculty);
        }
        else if(faculty.equals("علوم")){
              System.out.println(faculty);
        }else {
              System.out.println("not found");
        }*/
//        loops
// starting stop increment/decrement
//        System.out.println("ahmed");
//        System.out.println("ahmed");
//        System.out.println("ahmed");
//        System.out.println("ahmed");
//        System.out.println("ahmed");
//        System.out.println("ahmed");
//        System.out.println("ahmed");
//        System.out.println("ahmed");
//        System.out.println("ahmed");
//        System.out.println("ahmed");
        /* int i = 1;
        for (;;) {
            System.out.println(i);
            i++;
            if (i >= 11) {
                break;
            }
        }
         System.out.println("-------------");
       
        for (int j = 1; j < 11; j++) {
            System.out.println(j);
        }
         System.out.println("-------------");
       

        int x = 1;
        while (x <= 10) {
           
            System.out.println(x);
             x++;
        }
        System.out.println("--------");
        int y = 1;
        do {
            System.out.println(y);
            y++;
        } while (y <= 10);
         */
 /*  int number[] = {1, 2, 3, 5, 6};
        for (int zz : number) {
            System.out.println(zz);
        }
        String[] name = {"ahmed", "moahmed", "ali", "said", "wael", "mona"};
//        System.out.println(name[0]);
//        System.out.println(name[1]);
//        System.out.println(name[2]);
        name[0] = "salah";
        System.out.println("------------");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        System.out.println("-------------");
        for (String b : name) {
            System.out.println(b + "   🙂🙂");
        }
        System.out.println("-------------");
        int x = 0;
        while (x < name.length) {
            System.out.println(name[x]);
            x++;
        }
        System.out.println("-------------");
        int y = 0;
        do {
            System.out.println(name[y]);
            y++;
        } while (y < name.length);
        System.out.println("--------------");
        int z = 0;
        for (;;) {
            System.out.println(name[z]);
            z++;
            if (z >= name.length) {
                break;
            }
        }
        System.out.println("-----------");
        int[] number2 = {1, 2, 3};*/

        String[][] number3 = {{"ahmed", "moahmed", "ali", "adsujn"}, {"wael", "ebrahim", "said"}};
        number3[0][0] = "heba";
        for (String[] number31 : number3) {
            for (String item : number31) {
                System.out.println(item);
            }
        }
        for (int i = 0; i < number3.length; i++) {
            for (int j = 0; j < number3[i].length; j++) {
                System.out.println(number3[i][j]);
            }
        }
//         1*1
//                 1*2
        for (int i = 1; i < 13; i++) {
            System.out.println(1 + " * " + i + " = " + (1 * i));
        }
        System.out.println("---------");
        for (int i = 1; i < 13; i++) {

            for (int j = 1; j < 13; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

    }

}

package com.company;

/* package whatever; // don't place package name! */


import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static void main (String args[])
    {
        int sum=0,razn=0,ymn=0,del=0;
        System.out.println("Hello! Do you want to calculate some digits?");
        System.out.println("If you want to calculate the amount, please, press 1");
        System.out.println("If you want to calculate the difference, please, press 2");
        System.out.println("If you want to calculate the multiplication, please, press 3");
        System.out.println("If you want to calculate the division, please, press 4");

        Scanner var = new Scanner(System.in);
        int i = 0;
        i = var.nextInt();

        switch(i){
            case 1:
                int num = 0, num_1 = 0;
                System.out.print("Vvedite a:");
                num = var.nextInt();
                System.out.print("Vvedite b:");
                num_1 = var.nextInt();
                sum = num+num_1;
                System.out.println("Summa ravna: "+sum);
                break;
            case 2:
                int num_2 =0, num_3 = 0;
                System.out.print("Vvedite a:");
                num_2 = var.nextInt();
                System.out.print("Vvedite b:");
                num_3 = var.nextInt();
                razn = num_2-num_3;
                System.out.println("Raznost ravna"+razn);
                break;
            case 3:
                int num_4 =0, num_5 = 0;
                System.out.print("Vvedite a:");
                num_4 = var.nextInt();
                System.out.print("Vvedite b:");
                num_5 = var.nextInt();
                ymn = num_4*num_5;
                System.out.println("Ymnozhenie ravno"+ymn);
                break;
            case 4:
                int num_6 =0, num_7 = 0;
                System.out.print("Vvedite a:");
                num_6 = var.nextInt();
                System.out.print("Vvedite b:");
                num_7 = var.nextInt();
                del = num_6/num_7;
                System.out.println("Delenie ravno"+del);
                break;
            default:
                System.out.println("Error");
        }

    }
}
package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int num = 0;

        System.out.println("Count up by 10.");

        while (num <= 10)
        {
            System.out.println(num * 10);
            num ++;
        }

        num = 10;

        System.out.println("\n Count down by 10.");

        while (num >= 0)
        {
            System.out.println(num * 10);
            num --;
        }

        //Above ^^ is the way i discovered how to complete the assigned task.
        //Below is the way it was taught in class.

        /*
        int counter = 0;

        while (counter <= 100)
        {
            System.out.println(counter);
            counter = counter + 10;
        }
        counter = 100;
        while (counter >= 0)
        {
            System.out.println(counter);
            counter = counter - 10;
        }
        */

    }
}

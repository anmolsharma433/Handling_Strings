package com.lambton;

public class StringHandling {
    public static void main(String[] args)
    {
        String s1 = "Hello" ;
        String s2 = "Hello";
        String s3 = s1 ;
        String s4 =new String("Hello ");
        /*
        if(s1 == s2)
        {
            System.out.println("S1 == s2");
        }
        else
        {
            System.out.println(" S1 != s2");
        }
        if(s2 == s3)
        {
            System.out.println(" s2 == s3");
        }
        else
        {
            System.out.println("s2 != s3");
        }



        */
        System.out.println(" Orignal s1 is " +s1);
        System.out.println(s1.toLowerCase());
        System.out.println("Orignal s1 is" +s1);
        System.out.println(s1.toUpperCase());

        //the functions
        String collegename = "Lambton College in Toronto";
        System.out.println("1. length " +collegename.length());
        System.out.println("2. search " +collegename.contains("College")); //incorrect
        System.out.println("3. index " +collegename.indexOf("Toronto"));
        System.out.println("4. upper case " +collegename.toUpperCase());
        System.out.println("5. lower case " +collegename.toLowerCase());
        System.out.println("6. character at " +collegename.charAt(10));
        System.out.println("7. replace " +collegename.replace("Toronto","New York"));
        System.out.println("8. Sub string "+collegename.substring(11,20));
        System.out.println("9. character array "+ collegename.toCharArray() );
        System.out.println("10. concat " +collegename.concat(" 265 Yorkland Blvd.,North York"));
        /*
        int a[]={1,2,3,4,5};
        int b[] = new int[]{1,2,3,4,5};
        int c[]= new int[10];

        */
        char count=0;
        char c[] = collegename.toCharArray();
        char rev[]=new char[c.length];
        for(int i=c.length-1;i >=0; i--)
        {
            rev[count++]=c[i];

        }
        String reverseString =new String(rev);
        System.out.println(" Reverse String " + reverseString);

        // even string
        

    }

}

package Package1;

public class String_ReverseStringBuilder {
    /*
Write a method to reverse the String using a String builder
 */



        public static void main(String[] args) {
            String name="syed ArslanUllah";

            String reverse=new StringBuilder(name).reverse().toString();

            System.out.println(reverse);

            System.out.println("------------------------------");

            String name1="madiha Ghouseullah";
            String reverse2=new StringBuilder(name1).reverse().toString();
            System.out.println(reverse2);

            System.out.println("------------------------------------------");

            String name2="syedArhum_ghouseullah";
            String reverse3=new StringBuilder(name2).reverse().toString();
            System.out.println(reverse3);

            System.out.println("----------------------------------------------------");


            String name4="Muniya_is_very mote";
            String reverse4=new StringBuilder(name4).reverse().toString();
            System.out.println(reverse4);


            System.out.println("-------------------------------------------");
            String name5= " i_am _Reversing_A_string";
            String reverse5=new StringBuilder(name5).reverse().toString();
            System.out.println(reverse5);

            System.out.println(" ------------------------------------------------");

            String name6=" Hellopeople_how _are you_all";
            String reverse6=new StringBuilder(name6).reverse().toString();
            System.out.println(reverse6);

        }
    }

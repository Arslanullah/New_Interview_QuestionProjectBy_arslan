package Package1;

public class ReverseString {
    public static void main(String[] args) {
        /*
        Write a programe that Reverse the Given String
        for instance
        I will try to Debug it now
 */


                String str = "Arslan";   // this is String of Text
                String reverse = "";    // Intiate the reverse varaible ..

                for (int i = str.length()-1; i>0;  i--) {
                    // str(the length of the string..() goto to the last last letter 'N'..(Arslan)
                    //   value of i = is equal to  length of str(abcdefgh); / and str is greater than 0 /;
                    //   than minus the value of str(i--)


                    reverse += str.charAt(i);
                /* str  chart at I(which is now N)(of Arslan?) and goto N and print from nalsr
                and print in reverse form
               reverse plus Add this value to == string str(arslan).charatcer at (present at i)             reversed letter  */
                }
                System.out.println(reverse);

            }
        }



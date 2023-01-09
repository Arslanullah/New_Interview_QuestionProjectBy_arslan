package Package1;

public class StringReverse3 {
    public static void main(String[] args) {

        /*
Write a programe to reverse the given String using Loop
 */
                String str = "helloWorldJavais_completed_now";
                String reverse = "";

                for (int i = str.length() - 1; i > 0; i--) {
                    reverse += str.charAt(i);

                }
                System.out.println(reverse);

                System.out.println("---------------------2nd reverse-------");

                String str1 = "bacth28_cydeoCourse";
                String reverse1 = "";

                for (int i = str1.length() - 1; i > 0; i--) {
                    reverse1 += str1.charAt(i);

                }
                System.out.println(reverse1);
                System.out.println("---------------------------------------------");

                String str3 = "hiim_Reversing_the _string";
                String reverse3 = "";

                for (int i = str3.length() - 1; i > 0; i--) {
                    reverse3 += str3.charAt(i);

                }
                System.out.println(reverse3);
            }

        }


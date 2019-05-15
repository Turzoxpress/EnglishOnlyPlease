package com.turzo.onlyenglish;

import android.content.Context;
import android.widget.Toast;

public class OnlyEnglishChecker {

    public static int plus(int a, int b){

        return a+b;
    }

    //---------------- 01
    //-- Checking the provided string has any foreign character, if has then function will return only left english part of the string
    /* Example :

      Input : "AppleআপেলApple_Juice"
      Output : "Apple"
     */

    public static String returnOnlyLeftEnglishPart(String st, Context ct, boolean toastOn,String txt){

        String tempS = "";
        /*
        boolean tempFlag = true;

        for(int i=0; i<st.length(); i++){

            if(st.charAt(i) != 'a' ||
                    st.charAt(i) != 'b' ||
                    st.charAt(i) != 'c' ||
                    st.charAt(i) != 'd' ||
                    st.charAt(i) != 'e' ||
                    st.charAt(i) != 'f' ||
                    st.charAt(i) != 'g' ||
                    st.charAt(i) != 'h' ||
                    st.charAt(i) != 'i' ||
                    st.charAt(i) != 'j' ||
                    st.charAt(i) != 'k' ||
                    st.charAt(i) != 'l' ||
                    st.charAt(i) != 'm' ||
                    st.charAt(i) != 'n' ||
                    st.charAt(i) != 'o' ||
                    st.charAt(i) != 'p' ||
                    st.charAt(i) != 'q' ||
                    st.charAt(i) != 'r' ||
                    st.charAt(i) != 's' ||
                    st.charAt(i) != 't' ||
                    st.charAt(i) != 'u' ||
                    st.charAt(i) != 'v' ||
                    st.charAt(i) != 'w' ||
                    st.charAt(i) != 'x' ||
                    st.charAt(i) != 'y' ||
                    st.charAt(i) != 'z' ||

                    st.charAt(i) != 'A' ||
                    st.charAt(i) != 'B' ||
                    st.charAt(i) != 'C' ||
                    st.charAt(i) != 'D' ||
                    st.charAt(i) != 'E' ||
                    st.charAt(i) != 'F' ||
                    st.charAt(i) != 'G' ||
                    st.charAt(i) != 'H' ||
                    st.charAt(i) != 'I' ||
                    st.charAt(i) != 'J' ||
                    st.charAt(i) != 'K' ||
                    st.charAt(i) != 'L' ||
                    st.charAt(i) != 'M' ||
                    st.charAt(i) != 'N' ||
                    st.charAt(i) != 'O' ||
                    st.charAt(i) != 'P' ||
                    st.charAt(i) != 'Q' ||
                    st.charAt(i) != 'R' ||
                    st.charAt(i) != 'S' ||
                    st.charAt(i) != 'T' ||
                    st.charAt(i) != 'U' ||
                    st.charAt(i) != 'V' ||
                    st.charAt(i) != 'W' ||
                    st.charAt(i) != 'X' ||
                    st.charAt(i) != 'Y' ||
                    st.charAt(i) != 'Z' ){

                tempFlag = false;
                break;

            }else {

                tempFlag = true;
                tempS = tempS + st.charAt(i);

            }
        }

        //-- if the string contains foreign character then it will show the warning
        if(!tempFlag){

            //-- we will show the toast if the developer wants to show the warning
            if(toastOn){
                Toast.makeText(ct,txt,Toast.LENGTH_LONG).show();
            }

        }
        */


        return tempS;


    }

    //--------------------------------------------

    //---------------- 02
    //-- Checking the provided string has any foreign character, if has then function will return whole english part of the string
     /* Example :

      Input : "AppleআপেলApple_Juice"
      Output : "AppleApple_Juice"
     */
    public static String retunWholeEnglishPart(String st, Context ct, boolean toastOn,String txt){

        String tempS = "";
        boolean tempFlag = true;

        for(int i=0; i<st.length(); i++){

            if(st.charAt(i) != 'a' ||
                    st.charAt(i) != 'b' ||
                    st.charAt(i) != 'c' ||
                    st.charAt(i) != 'd' ||
                    st.charAt(i) != 'e' ||
                    st.charAt(i) != 'f' ||
                    st.charAt(i) != 'g' ||
                    st.charAt(i) != 'h' ||
                    st.charAt(i) != 'i' ||
                    st.charAt(i) != 'j' ||
                    st.charAt(i) != 'k' ||
                    st.charAt(i) != 'l' ||
                    st.charAt(i) != 'm' ||
                    st.charAt(i) != 'n' ||
                    st.charAt(i) != 'o' ||
                    st.charAt(i) != 'p' ||
                    st.charAt(i) != 'q' ||
                    st.charAt(i) != 'r' ||
                    st.charAt(i) != 's' ||
                    st.charAt(i) != 't' ||
                    st.charAt(i) != 'u' ||
                    st.charAt(i) != 'v' ||
                    st.charAt(i) != 'w' ||
                    st.charAt(i) != 'x' ||
                    st.charAt(i) != 'y' ||
                    st.charAt(i) != 'z' ||

                    st.charAt(i) != 'A' ||
                    st.charAt(i) != 'B' ||
                    st.charAt(i) != 'C' ||
                    st.charAt(i) != 'D' ||
                    st.charAt(i) != 'E' ||
                    st.charAt(i) != 'F' ||
                    st.charAt(i) != 'G' ||
                    st.charAt(i) != 'H' ||
                    st.charAt(i) != 'I' ||
                    st.charAt(i) != 'J' ||
                    st.charAt(i) != 'K' ||
                    st.charAt(i) != 'L' ||
                    st.charAt(i) != 'M' ||
                    st.charAt(i) != 'N' ||
                    st.charAt(i) != 'O' ||
                    st.charAt(i) != 'P' ||
                    st.charAt(i) != 'Q' ||
                    st.charAt(i) != 'R' ||
                    st.charAt(i) != 'S' ||
                    st.charAt(i) != 'T' ||
                    st.charAt(i) != 'U' ||
                    st.charAt(i) != 'V' ||
                    st.charAt(i) != 'W' ||
                    st.charAt(i) != 'X' ||
                    st.charAt(i) != 'Y' ||
                    st.charAt(i) != 'Z' ){

                tempFlag = false;
                //break;

            }else {

                tempFlag = true;


            }

            tempS = tempS + st.charAt(i);
        }

        //-- if the string contains foreign character then it will show the warning
        if(!tempFlag){

            //-- we will show the toast if the developer wants to show the warning
            if(toastOn){
                Toast.makeText(ct,txt,Toast.LENGTH_LONG).show();
            }

        }


        return tempS;


    }

    //--------------------------------------------
}

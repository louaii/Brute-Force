package com.mycompany.password_crack;

//Lib import
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Password_Crack {
    
    //Main
    public static void main(String[] args) {
        int len;
        String chars;
        chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890`~!@#$%^&*()-_=+[{]};:'\",<.>?/";
        len = chars.length();
        String file_path = "L5.txt";
        try(FileOutputStream fileOut = new FileOutputStream(file_path);
                PrintStream filePrintStream = new PrintStream(fileOut)){
            PrintStream originalOut = System.out;
            System.setOut(filePrintStream);
            L5(chars, len);
            System.setOut(originalOut);
            System.out.print("done");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    //end main
    
    //Function level 1 looking for index 0
    public static void L1(String chars, int len){
        char c;
        String word;
        for(int i = 0; i <= len - 1; i++){
            c = chars.charAt(i);
            word = Character.toString(c);
            System.out.println(word);
        }
    }
    //End Function level 1
    
    //Function level 2 looking for index 1
    public static void L2(String chars, int len){
        char c1, c2;
        String word;
        for(int i = 0; i <= len - 1; i++){
            c1 = chars.charAt(i);
            for (int j = 0; j <= len - 1; j++){
                c2 = chars.charAt(j);
                word = Character.toString(c1) + Character.toString(c2);
                System.out.println(word);
            }
        }
    }
    //End Level 2
    
    //Function level 3 looking for index 2
    public static void L3(String chars, int len){
        char c1, c2, c3;
        String word;
        for(int i = 0; i <= len -1; i++){
            c1 = chars.charAt(i);
            for(int j = 0; j <= len - 1; j++){
                c2 = chars.charAt(j);
                for(int k = 0; k <= len - 1; k++){
                    c3 = chars.charAt(k);
                    word = "" + c1 + c2 + c3;
                    System.out.println(word);
                }
            }
        }
    }
    //end Level 3
    
    //Function Level 4 looking for index 3
    public static void L4(String chars, int len){
        char c1, c2, c3, c4;
        String word;
        for(int i = 0; i <= len -1; i++){
            c1 = chars.charAt(i);
            for(int j = 0; j <= len - 1; j++){
                c2 = chars.charAt(j);
                for(int k = 0; k <= len - 1; k++){
                    c3 = chars.charAt(k);
                    for(int l = 0; l <= len - 1; l++){
                        c4 = chars.charAt(l);
                        word = "" + c1 + c2 + c3 + c4;
                        System.out.println(word);
                    }
                }
            }
        }
    }
    //end Function Level 4
    
    //Function Level 5 looking for index 4
    public static void L5(String chars, int len){
        char c1, c2, c3, c4, c5;
        String word;
        for(int i = 0; i <= len -1; i++){
            c1 = chars.charAt(i);
            for(int j = 0; j <= len - 1; j++){
                c2 = chars.charAt(j);
                for(int k = 0; k <= len - 1; k++){
                    c3 = chars.charAt(k);
                    for(int l = 0; l <= len - 1; l++){
                        c4 = chars.charAt(l);
                        for(int m = 0; m <= len - 1; m++){
                            c5 = chars.charAt(m);
                            word = "" + c1 + c2 + c3 + c4 + c5;
                            System.out.println(word);
                        }
                    }
                }
            }
        }
    }
    //end Function Level 5
    
    //Function level 6 index 5
    public static void L6(String chars, int len){
        char c1, c2, c3, c4, c5, c6;
        String word;
        for(int i = 0; i <= len -1; i++){
            c1 = chars.charAt(i);
            for(int j = 0; j <= len - 1; j++){
                c2 = chars.charAt(j);
                for(int k = 0; k <= len - 1; k++){
                    c3 = chars.charAt(k);
                    for(int l = 0; l <= len - 1; l++){
                        c4 = chars.charAt(l);
                        for(int m = 0; m <= len - 1; m++){
                            c5 = chars.charAt(m);
                            for(int n = 0; n <= len - 1; n++){
                                c6 = chars.charAt(m);
                                word = "" + c1 + c2 + c3 + c4 + c5 + c6;
                                System.out.println(word);
                            }
                        }
                    }
                }
            }
        }
    }
    //end Function Level 6
    
    //Function level 7 index 6
    public static void L7(String chars, int len){
        char c1, c2, c3, c4, c5, c6, c7;
        String word;
        for(int i = 0; i <= len -1; i++){
            c1 = chars.charAt(i);
            for(int j = 0; j <= len - 1; j++){
                c2 = chars.charAt(j);
                for(int k = 0; k <= len - 1; k++){
                    c3 = chars.charAt(k);
                    for(int l = 0; l <= len - 1; l++){
                        c4 = chars.charAt(l);
                        for(int m = 0; m <= len - 1; m++){
                            c5 = chars.charAt(m);
                            for(int n = 0; n <= len - 1; n++){
                                c6 = chars.charAt(n);
                                for(int o = 0; o <= len - 1; o++){
                                    c7 = chars.charAt(o);
                                    word = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7;
                                    System.out.println(word);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    //end Function Level 7
    
    //Function level 8 index 7
    public static void L8(String chars, int len){
        char c1, c2, c3, c4, c5, c6, c7, c8;
        String word;
        for(int i = 0; i <= len -1; i++){
            c1 = chars.charAt(i);
            for(int j = 0; j <= len - 1; j++){
                c2 = chars.charAt(j);
                for(int k = 0; k <= len - 1; k++){
                    c3 = chars.charAt(k);
                    for(int l = 0; l <= len - 1; l++){
                        c4 = chars.charAt(l);
                        for(int m = 0; m <= len - 1; m++){
                            c5 = chars.charAt(m);
                            for(int n = 0; n <= len - 1; n++){
                                c6 = chars.charAt(n);
                                for(int o = 0; o <= len - 1; o++){
                                    c7 = chars.charAt(o);
                                    for(int p = 0; p <= len - 1; p++){
                                        c8 = chars.charAt(p);
                                        word = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8;
                                        System.out.println(word);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    //end Function Level 8
    
    
    //Function level 9 index 8
    public static void L9(String chars, int len){
        char c1, c2, c3, c4, c5, c6, c7, c8, c9;
        String word;
        for(int i = 0; i <= len -1; i++){
            c1 = chars.charAt(i);
            for(int j = 0; j <= len - 1; j++){
                c2 = chars.charAt(j);
                for(int k = 0; k <= len - 1; k++){
                    c3 = chars.charAt(k);
                    for(int l = 0; l <= len - 1; l++){
                        c4 = chars.charAt(l);
                        for(int m = 0; m <= len - 1; m++){
                            c5 = chars.charAt(m);
                            for(int n = 0; n <= len - 1; n++){
                                c6 = chars.charAt(n);
                                for(int o = 0; o <= len - 1; o++){
                                    c7 = chars.charAt(o);
                                    for(int p = 0; p <= len - 1; p++){
                                        c8 = chars.charAt(p);
                                        for(int q = 0; q <= len - 1; q++){
                                            c9 = chars.charAt(q);
                                            word = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9;
                                            System.out.println(word);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    //end Function Level 9
    
    //Function level 9 index 8
    public static void L10(String chars, int len){
        char c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
        String word;
        for(int i = 0; i <= len -1; i++){
            c1 = chars.charAt(i);
            for(int j = 0; j <= len - 1; j++){
                c2 = chars.charAt(j);
                for(int k = 0; k <= len - 1; k++){
                    c3 = chars.charAt(k);
                    for(int l = 0; l <= len - 1; l++){
                        c4 = chars.charAt(l);
                        for(int m = 0; m <= len - 1; m++){
                            c5 = chars.charAt(m);
                            for(int n = 0; n <= len - 1; n++){
                                c6 = chars.charAt(n);
                                for(int o = 0; o <= len - 1; o++){
                                    c7 = chars.charAt(o);
                                    for(int p = 0; p <= len - 1; p++){
                                        c8 = chars.charAt(p);
                                        for(int q = 0; q <= len - 1; q++){
                                            c9 = chars.charAt(q);
                                            for(int r = 0; r <= len - 1; r++){
                                                c10 = chars.charAt(r);
                                                word = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10;
                                                System.out.println(word);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    //end Function Level 10
    
    
}

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
    
        //Function level 11 index 10
    public static void L11(String chars, int len){
        char c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11;
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
                                                for(int s = 0; s <= len - 1; s++){
                                                    c11 = chars.charAt(s);
                                                    word = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10 + c11;
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
    }
    //end Function Level 11
    
    //Function level 12 index 11
    public static void L12(String chars, int len){
        char c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12;
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
                                                for(int s = 0; s <= len - 1; s++){
                                                    c11 = chars.charAt(s);
                                                    for(int t = 0; t <= len - 1; t++){
                                                        c12 = chars.charAt(t);
                                                        word = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10 + c11 + c12;
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
        }
    }
    //end Function Level 12
    
    //Function level 13 index 12
    public static void L13(String chars, int len){
        char c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13;
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
                                                for(int s = 0; s <= len - 1; s++){
                                                    c11 = chars.charAt(s);
                                                    for(int t = 0; t <= len - 1; t++){
                                                        c12 = chars.charAt(t);
                                                        for(int u = 0; u <= len - 1; u++){
                                                            c13 = chars.charAt(u);
                                                            word = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10 + c11 + c12 + c13;
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
            }
        }
    }
    //end Function Level 13
    
    //Function level 14 index 13
    public static void L14(String chars, int len){
        char c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14;
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
                                                for(int s = 0; s <= len - 1; s++){
                                                    c11 = chars.charAt(s);
                                                    for(int t = 0; t <= len - 1; t++){
                                                        c12 = chars.charAt(t);
                                                        for(int u = 0; u <= len - 1; u++){
                                                            c13 = chars.charAt(u);
                                                            for(int v = 0; v <= len - 1; v++){
                                                                c14 = chars.charAt(v);
                                                                word = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10 + c11 + c12 + c13 + c14;
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
                }
            }
        }
    }
    //end Function Level 14
    
    //Function level 15 index 14
    public static void L15(String chars, int len){
        char c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15;
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
                                                for(int s = 0; s <= len - 1; s++){
                                                    c11 = chars.charAt(s);
                                                    for(int t = 0; t <= len - 1; t++){
                                                        c12 = chars.charAt(t);
                                                        for(int u = 0; u <= len - 1; u++){
                                                            c13 = chars.charAt(u);
                                                            for(int v = 0; v <= len - 1; v++){
                                                                c14 = chars.charAt(v);
                                                                for(int w = 0; w <= len - 1; w++){
                                                                    c15 = chars.charAt(w);
                                                                    word = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10 + c11 + c12 + c13 + c14 + c15;
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
                    }
                }
            }
        }
    }
    //end Function Level 15
    
    //Function level 16 index 15
    public static void L16(String chars, int len){
        char c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16;
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
                                                for(int s = 0; s <= len - 1; s++){
                                                    c11 = chars.charAt(s);
                                                    for(int t = 0; t <= len - 1; t++){
                                                        c12 = chars.charAt(t);
                                                        for(int u = 0; u <= len - 1; u++){
                                                            c13 = chars.charAt(u);
                                                            for(int v = 0; v <= len - 1; v++){
                                                                c14 = chars.charAt(v);
                                                                for(int w = 0; w <= len - 1; w++){
                                                                    c15 = chars.charAt(w);
                                                                    for(int x = 0; x <= len - 1; x++){
                                                                        c16 = chars.charAt(x);
                                                                        word = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10 + c11 + c12 + c13 + c14 + c15 + c16;
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
                        }
                    }
                }
            }
        }
    }
    //end Function Level 16
    
    //Function level 17 index 16
    public static void L17(String chars, int len){
        char c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17;
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
                                                for(int s = 0; s <= len - 1; s++){
                                                    c11 = chars.charAt(s);
                                                    for(int t = 0; t <= len - 1; t++){
                                                        c12 = chars.charAt(t);
                                                        for(int u = 0; u <= len - 1; u++){
                                                            c13 = chars.charAt(u);
                                                            for(int v = 0; v <= len - 1; v++){
                                                                c14 = chars.charAt(v);
                                                                for(int w = 0; w <= len - 1; w++){
                                                                    c15 = chars.charAt(w);
                                                                    for(int x = 0; x <= len - 1; x++){
                                                                        c16 = chars.charAt(x);
                                                                        for(int y = 0; y <= len - 1; y++){
                                                                            c17 = chars.charAt(y);
                                                                            word = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10 + c11 + c12 + c13 + c14 + c15 + c16 + c17;
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
                            }
                        }
                    }
                }
            }
        }
    }
    //end Function Level 17
    
    //Function level 18 index 17
    public static void L18(String chars, int len){
        char c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18;
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
                                                for(int s = 0; s <= len - 1; s++){
                                                    c11 = chars.charAt(s);
                                                    for(int t = 0; t <= len - 1; t++){
                                                        c12 = chars.charAt(t);
                                                        for(int u = 0; u <= len - 1; u++){
                                                            c13 = chars.charAt(u);
                                                            for(int v = 0; v <= len - 1; v++){
                                                                c14 = chars.charAt(v);
                                                                for(int w = 0; w <= len - 1; w++){
                                                                    c15 = chars.charAt(w);
                                                                    for(int x = 0; x <= len - 1; x++){
                                                                        c16 = chars.charAt(x);
                                                                        for(int y = 0; y <= len - 1; y++){
                                                                            c17 = chars.charAt(y);
                                                                            for(int z = 0; z <= len - 1; z++){
                                                                                c18 = chars.charAt(z);
                                                                                word = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10 + c11 + c12 + c13 + c14 + c15 + c16 + c17 + c18;
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
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    //end Function Level 18
    
    
    //Function level 19 index 18
    public static void L19(String chars, int len){
        char c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19;
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
                                                for(int s = 0; s <= len - 1; s++){
                                                    c11 = chars.charAt(s);
                                                    for(int t = 0; t <= len - 1; t++){
                                                        c12 = chars.charAt(t);
                                                        for(int u = 0; u <= len - 1; u++){
                                                            c13 = chars.charAt(u);
                                                            for(int v = 0; v <= len - 1; v++){
                                                                c14 = chars.charAt(v);
                                                                for(int w = 0; w <= len - 1; w++){
                                                                    c15 = chars.charAt(w);
                                                                    for(int x = 0; x <= len - 1; x++){
                                                                        c16 = chars.charAt(x);
                                                                        for(int y = 0; y <= len - 1; y++){
                                                                            c17 = chars.charAt(y);
                                                                            for(int z = 0; z <= len - 1; z++){
                                                                                c18 = chars.charAt(z);
                                                                                for(int a = 0; a <= len - 1; a++){
                                                                                    c19 = chars.charAt(a);
                                                                                    word = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10 + c11 + c12 + c13 + c14 + c15 + c16 + c17 + c18 + c19;
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
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    //end Function Level 19
    
    //Function level 20 index 19
    public static void L20(String chars, int len){
        char c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20;
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
                                                for(int s = 0; s <= len - 1; s++){
                                                    c11 = chars.charAt(s);
                                                    for(int t = 0; t <= len - 1; t++){
                                                        c12 = chars.charAt(t);
                                                        for(int u = 0; u <= len - 1; u++){
                                                            c13 = chars.charAt(u);
                                                            for(int v = 0; v <= len - 1; v++){
                                                                c14 = chars.charAt(v);
                                                                for(int w = 0; w <= len - 1; w++){
                                                                    c15 = chars.charAt(w);
                                                                    for(int x = 0; x <= len - 1; x++){
                                                                        c16 = chars.charAt(x);
                                                                        for(int y = 0; y <= len - 1; y++){
                                                                            c17 = chars.charAt(y);
                                                                            for(int z = 0; z <= len - 1; z++){
                                                                                c18 = chars.charAt(z);
                                                                                for(int a = 0; a <= len - 1; a++){
                                                                                    c19 = chars.charAt(a);
                                                                                    for(int b = 0; b <= len - 1; b++){
                                                                                        c20 = chars.charAt(b);
                                                                                        word = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10 + c11 + c12 + c13 + c14 + c15 + c16 + c17 + c18 + c19 + c20;
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
    //end Function Level 20
    
}

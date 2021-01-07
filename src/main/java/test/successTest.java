package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class successTest {
    static class demo{
//        public demo(){}

    }
    public static void main(String[] args){
        /*StringBuffer stringBuffer = new StringBuffer("abcdefg");
        stringBuffer.append("higk");
        System.out.println(stringBuffer);
        System.out.println("------------------------");
        System.out.println(stringBuffer.reverse());
        String str = "abcdef";
        System.out.println(str.indexOf('c'));
        StringBuilder stringBuilder = new StringBuilder();
        demo demos = new demo();*/
       /* Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(n);
        int num = 0;
        int newNum = 0;
        while(n != 0){
            num = 0;
            while(n>=3){
                newNum = n/3;
                num +=newNum;
                n = n%3 + newNum;
                if (n == 2)
                    n++;
            }
            System.out.println(num);
            n = input.nextInt();
        }*/
        /*Scanner input = new Scanner(System.in);
        int n = 0;
        int num = 0;
        while(input.hasNext()){
            TreeSet<Integer> tree = new TreeSet<Integer>();
            n = input.nextInt();
            while(n>0){
                num = input.nextInt();
                tree.add(num);
                n--;
            }
            for(Integer i:tree){
                System.out.println(i);
            }
        }
        Math.pow(1,2);*/
        /*Scanner input = new Scanner(System.in);
        String str = "";
        while (input.hasNext()){
            str = input.next();
            System.out.println(Integer.decode(str));
        }*/
        /*char c;
        int shi = 0;
        int wei = 0;
        while(input.hasNext()){
            str = input.nextLine();
            for(int i=0;i<str.length();i++){
                c = str.charAt(i);
                wei = c - '0';
                if(wei>0){
                    wei = num(c);
                }
                shi = shi*10 + wei * Math.pow(16,(str.length()-1-i));
            }
        }*/
       /* int n = 0;
        int yu = 0;
        StringBuffer stringBuffer = new StringBuffer();
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            n = input.nextInt();
            stringBuffer = new StringBuffer();
            while(n>=0){
                yu = n % 2;
                n /= 2;
                if (n!=0 && yu==0){
                    stringBuffer.append(1);
                }else if(yu==1 && n==0){
                    stringBuffer.append(1);
                    break;
                }else if (yu == 0 && n==0){
                    stringBuffer.append(0);
                    break;
                }

            }
            System.out.println(stringBuffer);
        }*/
       /* int[] num = new int[999];
        Scanner input = new Scanner(System.in);
        int n = 0;
        n = input.nextInt();
        for (int i=0;i<n;i++){
            for (int j=i;i<n;j+=3){
                if (num[j]==1){
                    System.out.println(j+1);
                }
            }
        }*/
        /*char[] ch = new char[100];
        int length = 0;
        int k = 0;
        String str = "";
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            ch = new char[100];
            length = 0;
            str = input.next();

            for(int i=0;i<str.length();i++){
                if(length == 0){
                    ch[length] = str.charAt(i);
                    length++;
                    continue;
                }
                for(int j=0;j<length;j++){
                    if(str.charAt(i)==ch[j]){
                        break;
                    }
                    k=j+1;
                }
                if(k==length){
                    ch[k] = str.charAt(i);
                    length ++;
                }
            }
            System.out.println(ch);
        }*/
        HashSet<Integer> s = new HashSet<Integer>();
        System.out.println(s.add(1));
        System.out.println(s.add(1));
    }
}

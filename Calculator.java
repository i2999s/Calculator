package com.company;

import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            if(s.contains("+")) {
                String[] numbers = s.split("\\+");
                int a, b;
                if (s.contains("I") || s.contains("V") || s.contains("X")) {
                    a = RomanNum.fromRoman(numbers[0]);
                    b = RomanNum.fromRoman(numbers[1]);
                    if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                        System.out.println(RomanNum.toRoman(a + b));
                    }
                    else {
                        System.out.println("Не-а, только от I до X:)");
                    }
                }
                else {
                    a = Integer.parseInt(numbers[0]);
                    b = Integer.parseInt(numbers[1]);
                    if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                        System.out.println(a + b);
                    }
                    else {
                        System.out.println("Не-а, только от 1 до 10:)");
                    }
                }

            }
            else if (s.contains("-")) {
                String[] numbers = s.split("-");
                int a, b;
                if (s.contains("I") || s.contains("V") || s.contains("X")) {
                    a = RomanNum.fromRoman(numbers[0]);
                    b = RomanNum.fromRoman(numbers[1]);
                    if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                        System.out.println(RomanNum.toRoman(a - b));
                    } else {
                        System.out.println("Не-а, только от I до X:)");
                    }
                } else {
                    a = Integer.parseInt(numbers[0]);
                    b = Integer.parseInt(numbers[1]);
                    if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                        System.out.println(a - b);
                    } else {
                        System.out.println("Не-а, только от 1 до 10:)");            }
                }
            }else if (s.contains("*")) {
                String[] numbers = s.split("\\*");
                int a, b;
                if (s.contains("I") || s.contains("V") || s.contains("X")) {
                    a = RomanNum.fromRoman(numbers[0]);
                    b = RomanNum.fromRoman(numbers[1]);
                    if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                        System.out.println(RomanNum.toRoman(a * b));
                    } else {
                        System.out.println("Не-а, только от I до X:)");
                    }
                } else {
                    a = Integer.parseInt(numbers[0]);
                    b = Integer.parseInt(numbers[1]);
                    if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                        System.out.println(a * b);
                    } else {
                        System.out.println("Не-а, только от 1 до 10:)");  }
                }
            }else if (s.contains("/")) {
                String[] numbers = s.split("/");
                int a, b;
                if (s.contains("I") || s.contains("V") || s.contains("X")) {
                    a = RomanNum.fromRoman(numbers[0]);
                    b = RomanNum.fromRoman(numbers[1]);
                    if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                        System.out.println(RomanNum.toRoman(a / b));
                    } else {
                        System.out.println("Не-а, только от I до X:)");
                    }
                } else {
                    a = Integer.parseInt(numbers[0]);
                    b = Integer.parseInt(numbers[1]);
                    if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                        System.out.println(a / b);
                    }
                    else {
                        System.out.println("Не-а, только от 1 до 10:)");  }
                }
            }
        }
    }

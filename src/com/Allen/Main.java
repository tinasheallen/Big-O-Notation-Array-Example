package com.Allen;

public class Main {

    public static void main(String[] args) {

        // find the index of 7

        
                int[] intArray = new int[7];

                intArray[0] = 22;
                intArray[1] = 36;
                intArray[2] = -12;
                intArray[3] = 7;
                intArray[4] =56;
                intArray[5] = 1;
                intArray[6] = -22;

                int index = -1;
                for (int i = 0; i < intArray.length; i++) {
                    if (intArray[i] == 7) {
                        index = i;
                        break;
                    }
                }

                System.out.println("index = " + index);


            }
        }

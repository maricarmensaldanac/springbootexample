package com.example.demo.binarySearch;

import com.example.demo.HashCodeToStringEquals.Book;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearch {
    public static void main(String[] args) {
        binarySearch(35);
    }

    public static void binarySearch(Integer numToFind){

        try {
            int[] numbers = {2, 5, 12, 42, 53, 8, 4, 35};
            Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));
            System.out.println("");

            Arrays.sort(numbers);
            Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));
            System.out.println("");

            Integer foundedPosition = -1;
            int[] auxArray = numbers;
            int auxPos = auxArray.length / 2;
            do {
                Arrays.stream(auxArray).forEach(x -> System.out.print(x + " "));
                int auxNum = auxArray[auxPos];
                System.out.println("Position " + auxPos + " Num in pos: " + auxNum);
                if (auxNum == numToFind) {
                    foundedPosition = auxPos;
                    break;
                } else {
                    if(auxPos != 0) {
                        //Need to rework, not supposed to cut the String, just look into the highers
                        //auxArray = numToFind < auxNum ? Arrays.stream(auxArray).filter(x -> x < auxNum).toArray() : Arrays.stream(auxArray).filter(x -> x > auxNum).toArray();
                        auxPos = numToFind < auxNum ? auxPos/2 : auxArray.length - ((auxArray.length - auxPos) / 2);
                    }else
                    {
                        if(numToFind == auxNum)
                            foundedPosition = 0;
                        else
                            break;
                    }
                }
                System.out.println("===New search block");
            } while (foundedPosition < 0);

            System.out.println(-1 == foundedPosition ? "Element is not present in the list." : "Element " + numToFind + " founded at position " + foundedPosition);
        }catch(Exception e)
        {
            System.out.println("Error");
        }
    }
}
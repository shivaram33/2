package com.epam;

import java.util.Scanner;

class Gift {
// initially gift box contains the no. of chocolate, candy and sweet as 0
int chocolates = 0, candies = 0, sweets = 0; // numbers
int choc_w = 0, cand_w = 0, sweet_w = 0; // weights
}
class Chocolate extends Gift {
// Initialize three dynamic list for storing the three weight objects separately.  
public int[] choc;
public int[] cand;
public int[] sweet;

// Sort function to sort in ascending order
public void chocolate_sort(int chocolates) {
int temp = 0;
for(int i = 0; i < chocolates-1; i++) {
for(int j = i+1; j < chocolates; j++) {
if (choc[i] < choc[j]) {
temp = choc[j];
choc[j] = choc[i];
choc[i] = temp;
}
}
}
}
public void candy_sort(int candies) {
int temp = 0;
for(int i = 0; i < candies-1; i++) {
for(int j = i+1; j < candies; j++) {
if (cand[i] < cand[j]) {
temp = cand[j];
cand[j] = cand[i];
cand[i] = temp;
}
}
}
}
public void sweet_sort(int sweets) {
int temp = 0;
for(int i = 0; i < sweets-1; i++) {
for(int j = i+1; j < sweets; j++) {
if (sweet[i] < sweet[j]) {
temp = sweet[j];
sweet[j] = sweet[i];
sweet[i] = temp;
}
}
}
}
}
public class firstclass{

// Program executes from this method
public static void main(String[] args) {
// Object of class Chocolate and Scanner
Chocolate ch = new Chocolate();
Scanner scan = new Scanner(System.in);
int opt = 0;

// Menu driven way
do {
System.out.print("\n\t Enter 1. Chocolate, 2. Candies, 3. Sweets :- ");
int number = scan.nextInt();

switch(number) {
case 1 : System.out.print("\n\t\t How many chocolates you want to add : ");
ch.chocolates = scan.nextInt();
ch.choc = new int[ch.chocolates];
System.out.print("Enter the weights of each chocolates : ");
for(int i = 0; i < ch.chocolates; i++) {
ch.choc_w = scan.nextInt();
ch.choc[i] = ch.choc_w;
}
break;
case 2 : System.out.print("\n\t\t How many candies you want to add : ");
ch.candies = scan.nextInt();
ch.cand = new int[ch.candies];
System.out.print("Enter the weights of each candies : ");
for(int i = 0; i < ch.candies; i++) {
ch.cand_w = scan.nextInt();
ch.cand[i] = ch.cand_w;
}
break;
case 3 : System.out.print("\n\t\t How many sweets you want to add : ");
ch.sweets = scan.nextInt();
ch.sweet = new int[ch.sweets];
System.out.print("Enter the weights of each sweets : ");
for(int i = 0; i < ch.sweets; i++) {
ch.sweet_w = scan.nextInt();
ch.sweet[i] = ch.sweet_w;
}
break;
}
System.out.print("\n\t\t Do you want to continue(1) or not(0) : ");
opt = scan.nextInt();
} while (opt == 1);

// calling the sort() to sort all the dynamic lists  
//ch.sort();

ch.chocolate_sort(ch.chocolates);
ch.candy_sort(ch.candies);
ch.sweet_sort(ch.sweets);

// printing those lists from end to beginning
System.out.println("The sorted chocolates are : ");
for (int i = 0; i < ch.chocolates; i++) {
System.out.println(ch.choc[i]);
}
System.out.println("The sorted cadies are : ");
for (int i = 0; i < ch.candies; i++) {
System.out.println(ch.cand[i]);
}
System.out.println("The sorted sweets are : ");
for (int i = 0; i < ch.sweets; i++) {
System.out.println(ch.sweet[i]);
}
}
}

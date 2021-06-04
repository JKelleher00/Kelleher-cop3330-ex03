package achoo;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem3 {
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String ack = a.nextLine();
        System.out.print("Who said it? ");
        String ackk = a.nextLine();
        System.out.println(ackk + " says \"" + ack + "\"");
    }
}

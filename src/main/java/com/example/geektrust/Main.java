package com.example.geektrust;

import com.example.geektrust.design1.enums.SubscriptionPlan;
import com.example.geektrust.design1.model.MusicStreamSubscription;
import com.example.geektrust.design1.model.Subscription;
import com.example.geektrust.design1.model.VideoStreamSubscription;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Subscription music=new VideoStreamSubscription(SubscriptionPlan.PERSONAL,LocalDate.now());

        System.out.println(music);
        /*
        Sample code to read from file passed as command line argument
        try {
            // the file to be opened for reading
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis); // file to be scanned
            // returns true if there is another line to read
            while (sc.hasNextLine()) {
               //Add your code here to process input commands
            }
            sc.close(); // closes the scanner
        } catch (IOException e) {
        }
        */
    }
}

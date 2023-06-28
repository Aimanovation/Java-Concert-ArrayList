/*
 * This program is used to insert 20 different concert events into a list called ArrayList which the data can
 * be added, remove, rearrange and deleted.
 *
 * @Author   Muhammad Aiman Iskandar
 * @Version  JDK 18
 * @Since    01-06-2022
 * */
import javax.swing.*;
import java.util.ArrayList;

public class Concert {
    static ArrayList<ArrayList<String>> sonnyList = new ArrayList<>(); // List to hold concert data

    public static void main(String[] args) {
        getCrtID();
        getCrtVenue();
        getCrtDate();
        getSCrtMnSinger();
        getApproximateDCost();
        getBBckpSinger();
        getMainSponsorName();
        setDataConcert();
    }

    public static void initializeLists() {
        sonnyList.add(new ArrayList<>()); // Concert IDs
        sonnyList.add(new ArrayList<>()); // Concert venues
        sonnyList.add(new ArrayList<>()); // Concert dates
        sonnyList.add(new ArrayList<>()); // Main singers
        sonnyList.add(new ArrayList<>()); // Approximate costs
        sonnyList.add(new ArrayList<>()); // Backup singer information
        sonnyList.add(new ArrayList<>()); // Main sponsor names
    }

    public static void setDataConcert() {
        sonnyList.get(3).set(1, "Ning Aishah"); // Set a specific main singer
        String[] labels = {"Concert ID", "Concert Venue", "Concert Date", "The main singer",
                "Cost of each concert (RM)", "Have backup singer", "Main sponsor"};

        for (int i = 0; i < sonnyList.size(); i++) {
            System.out.print(labels[i] + "\t\t");
            System.out.println(sonnyList.get(i));
        }
    }

    public static void getCrtID() {
        sonnyList.add(new ArrayList<>());
        sonnyList.get(0).add("con9078");
        sonnyList.get(0).add("con7659");

        for (int i = 0; i < 18; i++) {
            String sCrtID = JOptionPane.showInputDialog("Please insert Concert ID", "con");
            sonnyList.get(0).add(sCrtID);
        }
    }

    public static void getCrtVenue() {
        for (int i = 0; i < 20; i++) {
            String sCrtVenue = JOptionPane.showInputDialog("Please insert Concert Venue for each concert ID");
            sonnyList.get(1).add(sCrtVenue);
        }
    }

    public static void getCrtDate() {
        for (int i = 0; i < 20; i++) {
            String sCrtDate = JOptionPane.showInputDialog("Please insert Concert Date for each concert event");
            sonnyList.get(2).add(sCrtDate);
        }
    }

    public static void getSCrtMnSinger() {
        for (int i = 0; i < 20; i++) {
            String sCrtMnSinger = JOptionPane.showInputDialog("Who will be the main singer for each concert?");
            sonnyList.get(3).add(sCrtMnSinger);
        }
    }

    public static void getApproximateDCost() {
        for (int i = 0; i < 20; i++) {
            double dAprxiDCost = Double.parseDouble(JOptionPane.showInputDialog("How much will each concert cost?", 0.0));
            sonnyList.get(4).add(String.valueOf(dAprxiDCost));
        }
    }

    public static void getBBckpSinger() {
        for (int i = 0; i < 20; i++) {
            boolean bBckpSinger = Boolean.parseBoolean(JOptionPane.showInputDialog("Will there be a backup singer for each show?\nAnswer TRUE or FALSE"));
            sonnyList.get(5).add(String.valueOf(bBckpSinger));
        }
    }

    public static void getMainSponsorName() {
        for (int i = 0; i < 20; i++) {
            String sMnSponsorName = JOptionPane.showInputDialog("Who will be the sponsor?");
            sonnyList.get(6).add(sMnSponsorName);
        }
    }
} // End of class

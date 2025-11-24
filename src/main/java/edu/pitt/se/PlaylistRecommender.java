package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
       
        if(bpms==null||bpms.size()==0){
            throw new IllegalArgumentException("null or empty list");
        }
        int avg=0;
        for(int bpm:bpms){
            avg+=bpm;
        }
        avg=avg/bpms.size();
        
        if(avg>=140){
            return "high";
        } else if (avg >= 100) {
            return "medium";
        } else {
            return "low";
        }
    }

    public static boolean isValidTrackTitle(String title) {

        
        if(title==null||title.length()==0||title.length()>30){
            return false;
        }
        return title.matches("[A-Za-z ]*");

    }

    public static int normalizeVolume(int volumeDb) {
       
        if(volumeDb< 0){
            return 0;
        } else if (volumeDb > 100) {
            return 100;
        } else {
            return volumeDb ;
        }
    }
}

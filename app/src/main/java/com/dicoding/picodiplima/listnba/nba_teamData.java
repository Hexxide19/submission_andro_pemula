package com.dicoding.picodiplima.listnba;

import java.util.ArrayList;

public class nba_teamData {

    public static String[][]data = new String[][]{
            {"Atlanta Hawks", "Eastern", "1946", "State Farm Arena - Atlanta,GA", "Lloyd Pierce", "https://www.nba.com/.element/img/1.0/teamsites/logos/teamlogos_500x500/atl.png"},
            {"Boston Celtics", "Eastern", "1946", "TD Garden - Boston,MA", "Brad Stevens", "https://www.nba.com/.element/img/1.0/teamsites/logos/teamlogos_500x500/bos.png"},
            {"Brooklyn Nets", "Eastern", "1967", "Barclays Center,NY", "Kenny Atkinson", "https://www.nba.com/.element/img/1.0/teamsites/logos/teamlogos_500x500/bkn.png"},
            {"Charlotte Hornets", "Eastern", "1988", "Spectrum Center - Charlotte,NC", "James Borrego", "https://www.nba.com/.element/img/1.0/teamsites/logos/teamlogos_500x500/cha.png"},
            {"Chicago Bulls", "Eastern", "1966", "United Center - Chicago,IL", "Jim Boylen", "https://www.nba.com/.element/img/1.0/teamsites/logos/teamlogos_500x500/chi.png"},
            {"Cleveland Cavaliers", "Eastern", "1980", "Quicken Loans Arena - Cleveland,OH", "Rick Carlisle", "https://www.nba.com/.element/img/1.0/teamsites/logos/teamlogos_500x500/cle.png"},
            {"Dallas Mavericks", "Western", "1946", "American Airlines Center - Dallas,TX", "Rick Carlisle", "https://www.nba.com/.element/img/1.0/teamsites/logos/teamlogos_500x500/dal.png"},
            {"Denver Nuggets", "Western", "1967", "Pepsi Center - Denver,CO", "Michael Malone", "https://www.nba.com/.element/img/1.0/teamsites/logos/teamlogos_500x500/den.png"},
            {"Detroit Pistons", "Eastern", "1941", "Little Caesars Arena - Detroit,MI", "Dwane Casey", "https://www.nba.com/.element/img/1.0/teamsites/logos/teamlogos_500x500/det.png"},
            {"Golden State Warriors", "Western", "1946", "Oracle Arena - Oakland,CA", "Steve Kerr", "https://www.nba.com/.element/img/1.0/teamsites/logos/teamlogos_500x500/gsw.png"},
            {"Houston Rockets", "Western", "1967", "Toyota Center - Houston,TX", "Mike D'Antoni", "https://www.nba.com/.element/img/1.0/teamsites/logos/teamlogos_500x500/hou.png"}
    };

    public static ArrayList<nba_team> getListData(){
        nba_team team = null;
        ArrayList<nba_team> list = new ArrayList<>();
        for (String[] aData : data){
            team = new nba_team();
            team.setName(aData[0]);
            team.setConference(aData[1]);
            team.setFoundingDate(aData[2]);
            team.setArena(aData[3]);
            team.setCoach(aData[4]);
            team.setImg(aData[5]);

            list.add(team);
        }

        return list;
    }
}

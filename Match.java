import java.io.Serializable;

public class Match implements Serializable {

    private int year;
    private String datetime;
    private String stage;
    private String stadium;
    private String city;
    private String homeTeamName;
    private int homeTeamGoals;
    private int awayTeamGoals;
    private String awayTeamName;
    private String winConditions;
    private long attendance;
    private int halfTimeHomeGoals;
    private int HalfTimeAwayGoals;
    private String referee;
    private String assistant1;
    private String assistant2;
    private long roundID;
    private long matchID;
    private String homeTeamInitials;
    private String awayTeamInitials;

    public Match(int year, String datetime, String stage, String stadium, String city, String homeTeamName,
                 int homeTeamGoals, int awayTeamGoals, String awayTeamName, String winConditions, long attendance,
                 int halfTimeHomeGoals, int halfTimeAwayGoals, String referee, String assistant1, String assistant2,
                 long roundID, long matchID, String homeTeamInitials, String awayTeamInitials) {
        this.year = year;
        this.datetime = datetime;
        this.stage = stage;
        this.stadium = stadium;
        this.city = city;
        this.homeTeamName = homeTeamName;
        this.homeTeamGoals = homeTeamGoals;
        this.awayTeamGoals = awayTeamGoals;
        this.awayTeamName = awayTeamName;
        this.winConditions = winConditions;
        this.attendance = attendance;
        this.halfTimeHomeGoals = halfTimeHomeGoals;
        HalfTimeAwayGoals = halfTimeAwayGoals;
        this.referee = referee;
        this.assistant1 = assistant1;
        this.assistant2 = assistant2;
        this.roundID = roundID;
        this.matchID = matchID;
        this.homeTeamInitials = homeTeamInitials;
        this.awayTeamInitials = awayTeamInitials;
    }

    public int getYear() {
        return year;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getStage() {
        return stage;
    }

    public String getStadium() {
        return stadium;
    }

    public String getCity() {
        return city;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public int getHomeTeamGoals() {
        return homeTeamGoals;
    }

    public int getAwayTeamGoals() {
        return awayTeamGoals;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public String getWinConditions() {
        return winConditions;
    }

    public long getAttendance() {
        return attendance;
    }

    public int getHalfTimeHomeGoals() {
        return halfTimeHomeGoals;
    }

    public int getHalfTimeAwayGoals() {
        return HalfTimeAwayGoals;
    }

    public String getReferee() {
        return referee;
    }

    public String getAssistant1() {
        return assistant1;
    }

    public String getAssistant2() {
        return assistant2;
    }

    public long getRoundID() {
        return roundID;
    }

    public long getMatchID() {
        return matchID;
    }

    public String getHomeTeamInitials() {
        return homeTeamInitials;
    }

    public String getAwayTeamInitials() {
        return awayTeamInitials;
    }

    @Override
    public String toString() {
        return "Match{" +
                "year=" + year +
                ", datetime='" + datetime + '\'' +
                ", stage='" + stage + '\'' +
                ", stadium='" + stadium + '\'' +
                ", city='" + city + '\'' +
                ", homeTeamName='" + homeTeamName + '\'' +
                ", homeTeamGoals=" + homeTeamGoals +
                ", awayTeamGoals=" + awayTeamGoals +
                ", awayTeamName='" + awayTeamName + '\'' +
                ", winConditions='" + winConditions + '\'' +
                ", attendance=" + attendance +
                ", halfTimeHomeGoals=" + halfTimeHomeGoals +
                ", HalfTimeAwayGoals=" + HalfTimeAwayGoals +
                ", referee='" + referee + '\'' +
                ", assistant1='" + assistant1 + '\'' +
                ", assistant2='" + assistant2 + '\'' +
                ", roundID=" + roundID +
                ", matchID=" + matchID +
                ", homeTeamInitials='" + homeTeamInitials + '\'' +
                ", awayTeamInitials='" + awayTeamInitials + '\'' +
                '}';
    }
}

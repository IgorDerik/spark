import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MatchBuilder {

    public static Math createMatch(String line) {

        //

        return null;
    }

    private static int parseInt(String s) {

        int result = 0;

        if (!s.equals("")) result = Integer.parseInt(s);

        return result;
    }

    private static long parseLong(String s) {

        long result = 0L;

        if (!s.equals("")) result = Long.parseLong(s);

        return result;
    }

    private static final String SAMPLE_CSV_FILE_PATH = "src/main/resources/WorldCupMatches.csv";

    public static List<Match> getMatches() throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());

        List<Match> matches = new ArrayList<>();

        for (CSVRecord csvRecord : csvParser) {
            int year = parseInt( csvRecord.get("Year") );
            String datetime = csvRecord.get("Datetime");
            String stage = csvRecord.get("Stage");
            String stadium = csvRecord.get("Stadium");
            String city = csvRecord.get("City");
            String homeTeamName = csvRecord.get("Home Team Name");
            int homeTeamGoals = parseInt( csvRecord.get("Home Team Goals") );
            int awayTeamGoals = parseInt( csvRecord.get("Away Team Goals") );
            String awayTeamName = csvRecord.get("Away Team Name");
            String winConditions = csvRecord.get("Win conditions");
            long attendance = parseLong( csvRecord.get("Attendance") );
            int halfTimeHomeGoals = parseInt( csvRecord.get("Half-time Home Goals") );
            int HalfTimeAwayGoals = parseInt( csvRecord.get("Half-time Away Goals") );
            String referee = csvRecord.get("Referee");
            String assistant1 = csvRecord.get("Assistant 1");
            String assistant2 = csvRecord.get("Assistant 2");
            long roundID = parseLong( csvRecord.get("RoundID") );
            long matchID = parseLong( csvRecord.get("MatchID") );
            String homeTeamInitials = csvRecord.get("Home Team Initials");
            String awayTeamInitials = csvRecord.get("Away Team Initials");

            matches.add( new Match(year,datetime,stage,stadium,city,homeTeamName,homeTeamGoals,awayTeamGoals,awayTeamName,winConditions,
                    attendance,halfTimeHomeGoals,HalfTimeAwayGoals,referee,assistant1,assistant2,
                    roundID,matchID,homeTeamInitials,awayTeamInitials) );
        }

//        matches.forEach(System.out::println);
        return matches;
    }

}
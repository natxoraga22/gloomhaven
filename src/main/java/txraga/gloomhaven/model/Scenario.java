package txraga.gloomhaven.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Scenario {

    private String id;
    private String location;
    private String requirements;
    private String goal;
    private String links;

    private String introduction;
    private String conclusion;

    private List<String> newLocations;
    private List<String> globalAchievements;
    private List<String> partyAchievements;
    private List<String> rewards;

}

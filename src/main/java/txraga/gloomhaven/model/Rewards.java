package txraga.gloomhaven.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Rewards {
    
	private List<String> newLocations;
	private List<String> globalAchievements;
	private List<String> partyAchievements;
	private List<String> rewards;

}

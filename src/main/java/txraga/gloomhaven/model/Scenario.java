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

	private List<Section> sections;

	private Rewards rewards;

}

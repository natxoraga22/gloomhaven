package txraga.gloomhaven.model;

import lombok.ToString;
import lombok.Getter;
import lombok.Setter;


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

}

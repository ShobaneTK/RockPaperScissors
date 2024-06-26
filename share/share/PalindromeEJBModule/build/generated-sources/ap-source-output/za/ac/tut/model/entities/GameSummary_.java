package za.ac.tut.model.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-04-15T16:01:26")
@StaticMetamodel(GameSummary.class)
public class GameSummary_ { 

    public static volatile SingularAttribute<GameSummary, Integer> totNumOfNonPalindromes;
    public static volatile SingularAttribute<GameSummary, Integer> totNumOfPalindromes;
    public static volatile SingularAttribute<GameSummary, Integer> id;
    public static volatile SingularAttribute<GameSummary, Integer> totNumbersChecked;
    public static volatile SingularAttribute<GameSummary, Date> creationDate;

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.model.entities.GameSummary;

/**
 *
 * @author Student
 */
@Local
public interface GameSummaryFacadeLocal {

    void create(GameSummary gameSummary);

    void edit(GameSummary gameSummary);

    void remove(GameSummary gameSummary);

    GameSummary find(Object id);

    List<GameSummary> findAll();

    List<GameSummary> findRange(int[] range);

    int count();
    
}

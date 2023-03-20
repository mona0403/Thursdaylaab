package edu.tutorial.service;

import java.util.List;

import edu.tutorial.entity.Tutorial;

public interface Tutorialservice {
	Tutorial createTutorial(Tutorial tt );
	List<Tutorial>getAllTutorial();
	Tutorial updateTutorial(Tutorial tutorial,int id);
	Tutorial getAllTutorialById(Tutorial tutorial,int id);
	String deleteTutorial(int id);
	

}

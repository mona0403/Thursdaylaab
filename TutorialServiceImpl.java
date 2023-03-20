package edu.tutorial.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.tutorial.entity.Tutorial;
import edu.tutorial.repository.TutorialRepository;
import edu.tutorial.service.Tutorialservice;

@Service
public  class TutorialServiceImpl implements Tutorialservice{

	@Autowired
	private TutorialRepository  tutorialRepository;
	
	@Override
	public  Tutorial createTutorial(Tutorial tt) {
	return tutorialRepository.save(tt);
	
}

	@Override
	public List<Tutorial> getAllTutorial() {
		
		return tutorialRepository.findAll();
	}

	@Override
	public Tutorial updateTutorial(Tutorial tutorial, int id) {
	Tutorial _tutorial=tutorialRepository.findById(id).get();
	_tutorial.setTitle(tutorial.getTitle());
	_tutorial.setDescription(tutorial.getDescription());
	_tutorial.setPublished(tutorial.getPublished());
		return tutorialRepository.save(_tutorial);
	}

	@Override
	public Tutorial getAllTutorialById(Tutorial tutorial, int id) {

		return tutorialRepository.findAllById(id).get();
	}

	@Override
	public String deleteTutorial(int id) {
		tutorialRepository.deleteById(id);
		return "This tutorial with this id"+id+"has been deleted";
	}
	
}
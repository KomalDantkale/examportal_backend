package org.exam.service;

import java.util.List;
import java.util.Set;

import org.exam.model.exam.Category;

import org.exam.model.exam.Quiz;

public interface QuizService {
	
	  public Quiz addQuiz(Quiz quiz);

	    public Quiz updateQuiz(Quiz quiz);

	    public Set<Quiz> getQuizzes();

	    public Quiz getQuiz(Long quizId);

	    public void deleteQuiz(Long quizId);


	}
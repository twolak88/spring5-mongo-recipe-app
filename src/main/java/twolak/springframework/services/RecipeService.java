package twolak.springframework.services;

import java.util.Set;

import twolak.springframework.commands.RecipeCommand;
import twolak.springframework.domain.Recipe;

/**
 * @author twolak
 *
 */
public interface RecipeService {
	Set<Recipe> findAll();
	RecipeCommand findById(String recipeId);
	RecipeCommand save(RecipeCommand recipeCommand);
	void deleteById(String id);
}

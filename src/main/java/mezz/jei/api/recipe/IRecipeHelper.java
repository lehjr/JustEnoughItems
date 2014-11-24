package mezz.jei.api.recipe;

import mezz.jei.api.recipe.type.IRecipeTypeKey;
import mezz.jei.api.recipe.wrapper.IRecipeWrapper;

import javax.annotation.Nonnull;

/**
 * An IRecipeHelper provides information about one Recipe Class.
 */
public interface IRecipeHelper {

	/* Returns the class of the Recipe handled by this IRecipeHelper. */
	Class getRecipeClass();

	/* Returns the type of this recipe. */
	IRecipeTypeKey getRecipeTypeKey();

	/* Returns a recipe wrapper for the given recipe. */
	IRecipeWrapper getRecipeWrapper(@Nonnull Object recipe);

}

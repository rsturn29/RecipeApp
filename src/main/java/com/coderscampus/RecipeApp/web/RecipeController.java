package com.coderscampus.RecipeApp.web;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.RecipeApp.dto.DayResponse;
import com.coderscampus.RecipeApp.dto.WeekResponse;

@RestController
public class RecipeController {

	@SuppressWarnings("unchecked")
	@GetMapping("mealplanner/week")

	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
		return (ResponseEntity<WeekResponse>) getRecipeResponse(numCalories, diet, exclusions, "week",
				WeekResponse.class);
	}

	@SuppressWarnings("unchecked")
	@GetMapping("mealplanner/day")

	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
		return (ResponseEntity<DayResponse>) getRecipeResponse(numCalories, diet, exclusions, "day", DayResponse.class);

	}

	private ResponseEntity<?> getRecipeResponse( String numCalories, String diet, String exclusions, String timeFrame,
			Class<?> responseClass) {
		RestTemplate rt = new RestTemplate();
		UriComponentsBuilder uriBuilder = UriComponentsBuilder
				.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
				.queryParam("timeFrame", timeFrame)
				.queryParam("apiKey", "0320281306de45ab929630304e0a3e46");
			

		URI uri = uriBuilder.build().toUri();

		ResponseEntity<?> responseEntity = rt.getForEntity(uri, responseClass);
		return responseEntity;
	}

}

package com.coderscampus.RecipeApp.dto;

public class Meal {
private Integer id;
private String title;
private Integer readyInMinutes;
private String servings;
private String sourceUrl;



public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public String getServings() {
	return servings;
}

public void setServings(String servings) {
	this.servings = servings;
}

public void setTitle(String title) {
	this.title = title;
}

public Integer getReadyInMinutes() {
	return readyInMinutes;
}

public void setReadyInMinutes(Integer readyInMinutes) {
	this.readyInMinutes = readyInMinutes;
}

@Override
public String toString() {
	return "Meal [id=" + id + ", title=" + title + ", readyInMinutes=" + readyInMinutes + ", servings=" + servings
			+ ", imgType=" + "]";
}





public String getSourceUrl() {
	return sourceUrl;
}

public void setSourceUrl(String sourceUrl) {
	this.sourceUrl = sourceUrl;
}



}

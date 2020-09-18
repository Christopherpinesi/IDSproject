package com.ids.Justmeet.model;

import javax.persistence.*;

@Entity
@Table( name = "events")

public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "category")
	private String category;

	@Column(name = "published")
	private boolean published;

	public Event() {

	}

	public Event(String title, String description, String category, boolean published) {
		this.title = title;
		this.description = description;
		this.category = category;
		this.published = published;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", desc=" + description + ", category=" + category + ", published=" + published + "]";
	}
}
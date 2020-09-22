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

	@Column(name = "location")
	private String location;

	@Column(name = "date")
	private String date;

	@Column(name = "published")
	private boolean published;

	@Column(name = "user")
	private String user;

	public Event() {

	}

	public Event(String title, String description, String category, String location , String date, String user, boolean published ) {
		this.title = title;
		this.description = description;
		this.category = category;
		this.location = location;
		this.date = date;
		this.published = published;
		this.user = user;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", desc=" + description + ", category=" + category + ", location=" + location + ", dateEvent=" + date + ", published=" + published + ", user=" + user + " ]";
	}
}
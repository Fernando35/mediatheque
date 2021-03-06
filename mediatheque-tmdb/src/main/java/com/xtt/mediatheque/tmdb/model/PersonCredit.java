/*
 *      Copyright (c) 2004-2013 Stuart Boston
 *
 *      This file is part of TheMovieDB API.
 *
 *      TheMovieDB API is free software: you can redistribute it and/or modify
 *      it under the terms of the GNU General Public License as published by
 *      the Free Software Foundation, either version 3 of the License, or
 *      any later version.
 *
 *      TheMovieDB API is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.
 *
 *      You should have received a copy of the GNU General Public License
 *      along with TheMovieDB API.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.xtt.mediatheque.tmdb.model;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author stuart.boston
 */
public class PersonCredit implements Serializable {

	private static final long serialVersionUID = 1L;

	/*
	 * Logger
	 */
	private static final Logger LOG = LoggerFactory
			.getLogger(PersonCredit.class);
	private static final String DEFAULT_STRING = "";
	/*
	 * Properties
	 */
	@JsonProperty("id")
	private int movieId = 0;
	@JsonProperty("character")
	private String character = DEFAULT_STRING;
	@JsonProperty("original_title")
	private String movieOriginalTitle = DEFAULT_STRING;
	@JsonProperty("poster_path")
	private String posterPath = DEFAULT_STRING;
	@JsonProperty("release_date")
	private String releaseDate = DEFAULT_STRING;
	@JsonProperty("title")
	private String movieTitle = DEFAULT_STRING;
	@JsonProperty("department")
	private String department = DEFAULT_STRING;
	@JsonProperty("job")
	private String job = DEFAULT_STRING;
	@JsonProperty("adult")
	private String adult = DEFAULT_STRING;
	private PersonType personType = PersonType.PERSON;

	// <editor-fold defaultstate="collapsed" desc="Getter Methods">
	public String getCharacter() {
		return character;
	}

	public String getDepartment() {
		return department;
	}

	public String getJob() {
		return job;
	}

	public int getMovieId() {
		return movieId;
	}

	public String getMovieOriginalTitle() {
		return movieOriginalTitle;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public PersonType getPersonType() {
		return personType;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public String getAdult() {
		return adult;
	}

	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="Setter Methods">
	public void setCharacter(final String character) {
		this.character = character;
	}

	public void setDepartment(final String department) {
		this.department = department;
	}

	public void setJob(final String job) {
		this.job = job;
	}

	public void setMovieId(final int movieId) {
		this.movieId = movieId;
	}

	public void setMovieOriginalTitle(final String movieOriginalTitle) {
		this.movieOriginalTitle = movieOriginalTitle;
	}

	public void setMovieTitle(final String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public void setPersonType(final PersonType personType) {
		this.personType = personType;
	}

	public void setPosterPath(final String posterPath) {
		this.posterPath = posterPath;
	}

	public void setReleaseDate(final String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public void setAdult(final String adult) {
		this.adult = adult;
	}

	// </editor-fold>

	/**
	 * Handle unknown properties and print a message
	 * 
	 * @param key
	 * @param value
	 */
	@JsonAnySetter
	public void handleUnknown(final String key, final Object value) {
		StringBuilder sb = new StringBuilder();
		sb.append("Unknown property: '").append(key);
		sb.append("' value: '").append(value).append("'");
		LOG.trace(sb.toString());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[PersonCredit=");
		sb.append("[movieId=").append(movieId);
		sb.append("],[personType=").append(personType);
		sb.append("],[originalTitle=").append(movieOriginalTitle);
		sb.append("],[movieTitle=").append(movieTitle);
		sb.append("],[posterPath=").append(posterPath);
		sb.append("],[releaseDate=").append(releaseDate);
		sb.append("],[character=").append(character);
		sb.append("],[department=").append(department);
		sb.append("],[job=").append(job);
		sb.append("],[adult=").append(adult);
		sb.append("]]");
		return sb.toString();
	}
}

package com.xtt.mediatheque.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = MovieDirectorsEntity.TABLE_NAME)
@Data
public class MovieDirectorsEntity {

	public static final String TABLE_NAME = "MovieDirector";

	@Embeddable
	public static class DirectorsEmbeddableEntity {

		@Column(name = "director")
		private String director;

		@ManyToOne
		@JoinColumn(name = "ID")
		private MovieEntity idBackend;

		public String getDirector() {
			return director;
		}

		public void setDirector(final String director) {
			this.director = director;
		}

		public MovieEntity getIdBackend() {
			return idBackend;
		}

		public void setIdBackend(final MovieEntity idBackend) {
			this.idBackend = idBackend;
		}

	}

	@EmbeddedId
	private DirectorsEmbeddableEntity directorsPk;

}
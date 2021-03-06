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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenAuthorisation {
	/*
	 * Logger
	 */
	private static final Logger LOG = LoggerFactory
			.getLogger(TokenAuthorisation.class);
	/*
	 * Properties
	 */
	@JsonProperty("expires_at")
	private String expires;
	@JsonProperty("request_token")
	private String requestToken;
	@JsonProperty("success")
	private Boolean success;

	// <editor-fold defaultstate="collapsed" desc="Getter methods">
	public String getExpires() {
		return expires;
	}

	public String getRequestToken() {
		return requestToken;
	}

	public Boolean getSuccess() {
		return success;
	}

	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="Setter methods">
	public void setExpires(final String expires) {
		this.expires = expires;
	}

	public void setRequestToken(final String requestToken) {
		this.requestToken = requestToken;
	}

	public void setSuccess(final Boolean success) {
		this.success = success;
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
		return "TokenAuthorisation{" + "expires=" + expires + ", requestToken="
				+ requestToken + ", success=" + success + '}';
	}

}

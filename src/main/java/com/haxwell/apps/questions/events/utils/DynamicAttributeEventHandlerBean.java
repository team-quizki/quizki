package com.haxwell.apps.questions.events.utils;

/**
 * Copyright 2013,2014 Johnathan E. James - haxwell.org - jj-ccs.com - quizki.com
 *
 * This file is part of Quizki.
 *
 * Quizki is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * Quizki is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Quizki. If not, see http://www.gnu.org/licenses.
 */

import com.haxwell.apps.questions.events.handlers.IDynamicAttributeEventHandler;

public class DynamicAttributeEventHandlerBean {

	String event;
	String attribute_endsWith;
	IDynamicAttributeEventHandler eventHandler;
	IDynamicAttributeEventHandler attribute_endsWith_handler;
	
	public String getEvent() {
		return event;
	}
	
	public void setEvent(String event) {
		this.event = event;
	}
	
	public String getAttribute_endsWith() {
		return attribute_endsWith;
	}
	
	public void setAttribute_endsWith(String attribute_endsWith) {
		this.attribute_endsWith = attribute_endsWith;
	}
	
	public IDynamicAttributeEventHandler getEventHandler() {
		return eventHandler;
	}
	
	public void setEventHandler(IDynamicAttributeEventHandler handler) {
		this.eventHandler = handler;
	}

	public IDynamicAttributeEventHandler getAttribute_endsWith_handler() {
		return attribute_endsWith_handler;
	}

	public void setAttribute_endsWith_handler(IDynamicAttributeEventHandler attribute_endsWith_handler) {
		this.attribute_endsWith_handler = attribute_endsWith_handler;
	}
}

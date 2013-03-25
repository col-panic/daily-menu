/*******************************************************************************
 * Copyright (c) 2013 Marco Descher <marco@descher.at>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Marco Descher <marco@descher.at> - initial API and implementation
 ******************************************************************************/
package at.medevit.menus.parts.filter;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import at.medevit.menus.Gender;
import at.medevit.menus.Person;

public class PersonViewerFilter extends ViewerFilter {

	private static TableViewer viewer;
	
	public enum RADIO_STATE {
		MALE, FEMALE, BOTH
	};

	// The filter default value, could be read from any persisted
	// source or any other way ...
	private static RADIO_STATE filterState = RADIO_STATE.BOTH;

	public PersonViewerFilter(TableViewer viewer) {
		PersonViewerFilter.viewer = viewer;
	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		Person p = (Person) element;

		switch (filterState) {
		case MALE:
			return p.getSex().equals(Gender.MALE);
		case FEMALE:
			return p.getSex().equals(Gender.FEMALE);
		default:
			return true;
		}
	}

	public static void setFilterState(RADIO_STATE filterState) {
		PersonViewerFilter.filterState = filterState;
		viewer.refresh();
	}
	
	public static RADIO_STATE getFilterState() {
		return filterState;
	}

}

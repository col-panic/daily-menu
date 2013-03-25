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
package at.medevit.menus.handlers;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.commands.State;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.commands.MParameter;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledItem;

import at.medevit.menus.parts.filter.PersonViewerFilter;

public class StatefulPersonViewerFilterHandler {

	/**
	 * Constant from org.eclipse.ui.handlers.RadioState.PARAMETER_ID
	 */
	private static final String ORG_ECLIPSE_UI_COMMANDS_RADIO_STATE_PARAMETER = "org.eclipse.ui.commands.radioStateParameter"; //$NON-NLS-1$

	@Inject
	ECommandService commandService;

	private State radioState;

	@SuppressWarnings("restriction")
	@Execute
	public void execute(MHandledItem item) {
		PersonViewerFilter.RADIO_STATE radioState = PersonViewerFilter.RADIO_STATE
				.valueOf(getRadioStateParameter(item).getValue());
		PersonViewerFilter.setFilterState(radioState);
	}

	@SuppressWarnings("restriction")
	@CanExecute
	public boolean canExecute(MHandledItem item) {
		// set the correct radio state
		item.setSelected(getRadioStateParameter(item).getValue()
				.equalsIgnoreCase(PersonViewerFilter.getFilterState().name()));

		return true;
	}

	/**
	 * @param item the parameterized {@link MHandledItem}
	 * @return the {@link MParameter} carrying the radio state
	 */
	@SuppressWarnings("restriction")
	private MParameter getRadioStateParameter(MHandledItem item) {
		List<MParameter> parameters = item.getParameters();
		for (MParameter mParameter : parameters) {
			if (mParameter.getName().equalsIgnoreCase(
					ORG_ECLIPSE_UI_COMMANDS_RADIO_STATE_PARAMETER))
				return mParameter;
		}
		return null;
	}

}

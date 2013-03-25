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

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuItem;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;

import at.medevit.menus.Person;

public class DirectPregnantStateHandler {
	
	@Inject
	private ESelectionService selectionService;
	
	@CanExecute
	public boolean setIsPregnantState(MMenuItem item) {
		Person p = (Person) selectionService.getSelection();
		if (p != null) {
			item.setSelected(p.isPregnant());
		}
		// execution is always possible, we will not show the
		// option if person is male
		return true;
	}

	@Execute
	public void setIsPregnant(MMenuItem item) {
		Person p = (Person) selectionService.getSelection();
		p.setPregnant(!item.isSelected());
	}
}

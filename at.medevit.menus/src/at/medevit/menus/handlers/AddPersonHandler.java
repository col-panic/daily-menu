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

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Shell;

import at.medevit.menus.MenusFactory;
import at.medevit.menus.Person;
import at.medevit.menus.SampleModel;
import at.medevit.menus.dialog.AddPersonDialog;

public class AddPersonHandler {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {

		Person newPerson = MenusFactory.eINSTANCE.createPerson();

		AddPersonDialog adp = new AddPersonDialog(shell);
		adp.setPerson(newPerson);
		int retVal = adp.open();

		if (retVal == IDialogConstants.OK_ID)
			SampleModel.getSampleModel().getContents().add(newPerson);
	}

}

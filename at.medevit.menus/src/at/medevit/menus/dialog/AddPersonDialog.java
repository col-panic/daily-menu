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
package at.medevit.menus.dialog;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import at.medevit.menus.Gender;
import at.medevit.menus.Person;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import at.medevit.menus.MenusPackage.Literals;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.databinding.swt.WidgetProperties;

public class AddPersonDialog extends TitleAreaDialog {
	private DataBindingContext m_bindingContext;

	private Person person;
	private Text txtFirstname;
	private Text txtLastname;
	private Combo comboGender;
	
	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public AddPersonDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setMessage("Add a new person to the system.");
		setTitle("Add person");
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(2, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		txtFirstname = new Text(container, SWT.BORDER);
		txtFirstname.setMessage("firstname");
		txtFirstname.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		txtLastname = new Text(container, SWT.BORDER);
		txtLastname.setMessage("lastname");
		txtLastname.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		ComboViewer comboViewer = new ComboViewer(container, SWT.NONE);
		comboGender = comboViewer.getCombo();
		comboGender.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		comboViewer.setContentProvider(ArrayContentProvider.getInstance());
		comboViewer.setInput(Gender.VALUES);
		comboViewer.setSelection(new StructuredSelection(Gender.MALE));
		new Label(container, SWT.NONE);

		return area;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
		m_bindingContext = initDataBindings();
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}

	public void setPerson(Person newPerson) {
		this.person = newPerson;
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue personFirstnameObserveValue = EMFObservables.observeValue(person, Literals.PERSON__FIRSTNAME);
		IObservableValue textTxtFirstnameObserveValue = PojoProperties.value("text").observe(txtFirstname);
		bindingContext.bindValue(personFirstnameObserveValue, textTxtFirstnameObserveValue, null, null);
		//
		IObservableValue personLastnameObserveValue = EMFObservables.observeValue(person, Literals.PERSON__LASTNAME);
		IObservableValue textTxtLastnameObserveValue = PojoProperties.value("text").observe(txtLastname);
		bindingContext.bindValue(personLastnameObserveValue, textTxtLastnameObserveValue, null, null);
		//
		IObservableValue observeSelectionComboGenderObserveWidget = WidgetProperties.selection().observe(comboGender);
		IObservableValue personSexObserveValue = EMFObservables.observeValue(person, Literals.PERSON__SEX);
		bindingContext.bindValue(observeSelectionComboGenderObserveWidget, personSexObserveValue, null, null);
		//
		return bindingContext;
	}
}

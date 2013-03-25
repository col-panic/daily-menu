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
package at.medevit.menus.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import at.medevit.menus.Person;
import at.medevit.menus.SampleModel;
import at.medevit.menus.parts.filter.PersonViewerFilter;
import at.medevit.menus.provider.MenusItemProviderAdapterFactory;

public class SelectorPart {

	public static final String SELECTOR_POPUPMENU_ID = "at.medevit.menus.part.selectPersonViewer.popupmenu";

	@Inject
	private ESelectionService selectionService;

	@Inject
	private EMenuService menuService;

	final MenusItemProviderAdapterFactory mipaf = new MenusItemProviderAdapterFactory();

	private TableViewer selectPersonTV;
	private TableViewer partnerPersonTV;

	public SelectorPart() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		// -- person selector
		Label lblPerson = new Label(parent, SWT.NONE);
		lblPerson.setText("Person");

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,
				1));
		composite.setLayout(new TableColumnLayout());

		selectPersonTV = new TableViewer(composite, SWT.BORDER
				| SWT.FULL_SELECTION);
		selectPersonTV.setLabelProvider(new AdapterFactoryLabelProvider(mipaf));
		selectPersonTV.setContentProvider(new AdapterFactoryContentProvider(
				mipaf));
		selectPersonTV.setInput(SampleModel.getDirectory());
		selectPersonTV
				.addSelectionChangedListener(new ISelectionChangedListener() {
					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						IStructuredSelection selection = (IStructuredSelection) event
								.getSelection();

						Person p = (Person) selection.getFirstElement();

						selectionService.setSelection(selection.size() == 1 ? p
								: selection.toArray());

						if (selection.size() == 1) {
							if (p.getPartner() != null) {
								partnerPersonTV
										.setSelection(new StructuredSelection(p
												.getPartner()));
							} else {
								partnerPersonTV.setSelection(null);
							}
						}
					}
				});
		ViewerFilter[] filters = new ViewerFilter[] { new PersonViewerFilter(selectPersonTV)};
		selectPersonTV.setFilters(filters);

		menuService.registerContextMenu(selectPersonTV.getTable(),
				SELECTOR_POPUPMENU_ID);

		// -- partner selector
		Label lblPartner = new Label(parent, SWT.NONE);
		lblPartner.setText("Partner");

		Composite composite2 = new Composite(parent, SWT.NONE);
		composite2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		composite2.setLayout(new TableColumnLayout());

		partnerPersonTV = new TableViewer(composite2, SWT.BORDER
				| SWT.FULL_SELECTION);
		partnerPersonTV
				.setLabelProvider(new AdapterFactoryLabelProvider(mipaf));
		partnerPersonTV.setContentProvider(new AdapterFactoryContentProvider(
				mipaf));
		partnerPersonTV.setInput(SampleModel.getDirectory());

	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
		// TODO Set the focus to control
	}

}

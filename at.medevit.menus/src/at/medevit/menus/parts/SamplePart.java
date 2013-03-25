/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package at.medevit.menus.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class SamplePart {

	private Label label;
	private TableViewer tableViewer;
	private TableViewer tableViewer2;
	
	@Inject
	private EMenuService menuService;

	private static final String ID_PART_POPUP_MENU = "samplePart.popupmenu";
	private static final String ID_PART_POPUP_MENU_2 = "samplePart.popupmenu.0";

	@PostConstruct
	public void createComposite(Composite parent) {
		parent.setLayout(new GridLayout());

		label = new Label(parent, SWT.NONE);
		label.setText("Sample table");

		tableViewer = new TableViewer(parent);
		tableViewer.add("Sample item 1");
		tableViewer.add("Sample item 2");
		tableViewer.add("Sample item 3");
		tableViewer.add("Sample item 4");
		tableViewer.add("Sample item 5");
		tableViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
		
		menuService.registerContextMenu(tableViewer.getTable(),
				ID_PART_POPUP_MENU);
		
		tableViewer2 = new TableViewer(parent);
		tableViewer2.add("2 Sample item 1");
		tableViewer2.add("2 Sample item 2");
		tableViewer2.add("2 Sample item 3");
		tableViewer2.add("2 Sample item 4");
		tableViewer2.add("2 Sample item 5");
		tableViewer2.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
		
		menuService.registerContextMenu(tableViewer2.getTable(),
				ID_PART_POPUP_MENU_2);
	}

	@Focus
	public void setFocus() {
		tableViewer.getTable().setFocus();
	}
}
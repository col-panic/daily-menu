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
package at.medevit.menus.dynamic;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.di.AboutToHide;
import org.eclipse.e4.ui.di.AboutToShow;
import org.eclipse.e4.ui.model.application.ui.menu.ItemType;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuFactory;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import at.medevit.menus.Person;
import at.medevit.menus.SampleModel;
import at.medevit.menus.provider.MenusItemProviderAdapterFactory;

public class DynamicPartnerContribution {

	@Inject
	private ESelectionService selectionService;

	private AdapterFactoryLabelProvider lp = new AdapterFactoryLabelProvider(
			new MenusItemProviderAdapterFactory());

	@AboutToShow
	public void aboutToShow(List<MMenuElement> items) {
		List<Person> persons = SampleModel.getDirectory().getEntry();

		for (Person person : persons) {
			MDirectMenuItem dynamicItem = MMenuFactory.INSTANCE
					.createDirectMenuItem();
			dynamicItem.setType(ItemType.RADIO);
			dynamicItem.setLabel(lp.getText(person));
			dynamicItem.getTransientData().put("value", person);
			dynamicItem.setSelected(person.getPartner() != null
					&& person.getPartner().equals(
							selectionService.getSelection()));

			dynamicItem
					.setContributionURI("bundleclass://at.medevit.menus/at.medevit.menus.dynamic.DynamicPartnerContribution");

			items.add(dynamicItem);
		}
	}

	@AboutToHide
	public void aboutToHide(List<MMenuElement> items) {
		// empty, for demonstration purposes only :)
		// could also be ommited after 4.3 M7 (bug)
	}

	@SuppressWarnings("restriction")
	@Execute
	public void execute(MDirectMenuItem dmi) {
		Person person = (Person) selectionService.getSelection();
		if(person.getPartner()!=null) {
			// disconnect partners
			person.getPartner().unsetPartner();
			person.unsetPartner();
		} else {
			// connect with selected partner
			Person person2 = (Person) dmi.getTransientData().get("value");
			person2.setPartner(person);
			person.setPartner(person2);
		}
	}
}

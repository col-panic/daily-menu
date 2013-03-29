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
package at.medevit.menus;

import java.io.IOException;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import at.medevit.menus.impl.MenusPackageImpl;

public class SampleModel {

	static MenusFactory factory = MenusFactory.eINSTANCE;
	static Resource resource = null;
	
	public static Resource getSampleModel() {
		if (resource == null) {
			MenusPackageImpl.init();
			initSampleModel();
		}

		return resource;
	}

	public static PersonDirectory getDirectory() {
		Resource s = getSampleModel();
		return (PersonDirectory) s.getContents().get(0);
	}

	private static void initSampleModel() {
		ResourceSet resSet = new ResourceSetImpl();
		// Create a resource
		resource = resSet.createResource(URI.createURI("menus/my.model"));

		Calendar cal = GregorianCalendar.getInstance();
		
		PersonDirectory pd = factory.createPersonDirectory();

		Person personA = factory.createPerson();
		personA.setFirstname("Max");
		personA.setLastname("Mustermann");
		personA.setSex(Gender.MALE);
		cal.clear();
		cal.set(1979, 6, 26);
		personA.setDateOfBirth(new Date(cal.getTimeInMillis()));
	
		Person personB = factory.createPerson();
		personB.setFirstname("Maria");
		personB.setLastname("Musterfrau");
		personB.setSex(Gender.FEMALE);
		cal.clear();
		cal.set(1979, 9, 19);
		personB.setDateOfBirth(new Date(cal.getTimeInMillis()));

		personA.setPartner(personB);
		personB.setPartner(personA);
		
		Person personC = factory.createPerson();
		personC.setFirstname("Jakob");
		personC.setLastname("Jedermann");
		personC.setSex(Gender.MALE);
		
		pd.getEntry().add(personA);
		pd.getEntry().add(personB);
		pd.getEntry().add(personC);

		resource.getContents().add(pd);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

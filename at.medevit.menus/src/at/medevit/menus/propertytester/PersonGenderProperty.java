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
package at.medevit.menus.propertytester;

import org.eclipse.core.expressions.PropertyTester;

import at.medevit.menus.Gender;
import at.medevit.menus.Person;

public class PersonGenderProperty extends PropertyTester {

	public static final String PROPERTY_NAMESPACE = "at.medevit.menus.propertyTester.person";
	public static final String PROPERTY_IS_FEMALE = "isFemale";

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		Person p = (Person) receiver;
	
		if (PROPERTY_IS_FEMALE.equals(property)) {
			if(p.getSex().equals(Gender.FEMALE)) return true;
		} 
		return false;
	}

}

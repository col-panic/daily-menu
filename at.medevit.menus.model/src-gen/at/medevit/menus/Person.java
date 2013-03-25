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
/**
 */
package at.medevit.menus;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.medevit.menus.Person#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link at.medevit.menus.Person#getLastname <em>Lastname</em>}</li>
 *   <li>{@link at.medevit.menus.Person#getSex <em>Sex</em>}</li>
 *   <li>{@link at.medevit.menus.Person#getPartner <em>Partner</em>}</li>
 *   <li>{@link at.medevit.menus.Person#isPregnant <em>Pregnant</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.medevit.menus.MenusPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see at.medevit.menus.MenusPackage#getPerson_Firstname()
	 * @model
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link at.medevit.menus.Person#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastname</em>' attribute.
	 * @see #setLastname(String)
	 * @see at.medevit.menus.MenusPackage#getPerson_Lastname()
	 * @model required="true"
	 * @generated
	 */
	String getLastname();

	/**
	 * Sets the value of the '{@link at.medevit.menus.Person#getLastname <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastname</em>' attribute.
	 * @see #getLastname()
	 * @generated
	 */
	void setLastname(String value);

	/**
	 * Returns the value of the '<em><b>Sex</b></em>' attribute.
	 * The literals are from the enumeration {@link at.medevit.menus.Gender}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sex</em>' attribute.
	 * @see at.medevit.menus.Gender
	 * @see #setSex(Gender)
	 * @see at.medevit.menus.MenusPackage#getPerson_Sex()
	 * @model required="true"
	 * @generated
	 */
	Gender getSex();

	/**
	 * Sets the value of the '{@link at.medevit.menus.Person#getSex <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sex</em>' attribute.
	 * @see at.medevit.menus.Gender
	 * @see #getSex()
	 * @generated
	 */
	void setSex(Gender value);

	/**
	 * Returns the value of the '<em><b>Partner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner</em>' reference.
	 * @see #isSetPartner()
	 * @see #unsetPartner()
	 * @see #setPartner(Person)
	 * @see at.medevit.menus.MenusPackage#getPerson_Partner()
	 * @model unsettable="true"
	 * @generated
	 */
	Person getPartner();

	/**
	 * Sets the value of the '{@link at.medevit.menus.Person#getPartner <em>Partner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner</em>' reference.
	 * @see #isSetPartner()
	 * @see #unsetPartner()
	 * @see #getPartner()
	 * @generated
	 */
	void setPartner(Person value);

	/**
	 * Unsets the value of the '{@link at.medevit.menus.Person#getPartner <em>Partner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPartner()
	 * @see #getPartner()
	 * @see #setPartner(Person)
	 * @generated
	 */
	void unsetPartner();

	/**
	 * Returns whether the value of the '{@link at.medevit.menus.Person#getPartner <em>Partner</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Partner</em>' reference is set.
	 * @see #unsetPartner()
	 * @see #getPartner()
	 * @see #setPartner(Person)
	 * @generated
	 */
	boolean isSetPartner();

	/**
	 * Returns the value of the '<em><b>Pregnant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pregnant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pregnant</em>' attribute.
	 * @see #setPregnant(boolean)
	 * @see at.medevit.menus.MenusPackage#getPerson_Pregnant()
	 * @model required="true"
	 * @generated
	 */
	boolean isPregnant();

	/**
	 * Sets the value of the '{@link at.medevit.menus.Person#isPregnant <em>Pregnant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pregnant</em>' attribute.
	 * @see #isPregnant()
	 * @generated
	 */
	void setPregnant(boolean value);

} // Person

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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.medevit.menus.MenusFactory
 * @model kind="package"
 * @generated
 */
public interface MenusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "menus";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.medevit.at/menus/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "medevit.at";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MenusPackage eINSTANCE = at.medevit.menus.impl.MenusPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.medevit.menus.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.medevit.menus.impl.PersonImpl
	 * @see at.medevit.menus.impl.MenusPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LASTNAME = 1;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SEX = 2;

	/**
	 * The feature id for the '<em><b>Partner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTNER = 3;

	/**
	 * The feature id for the '<em><b>Pregnant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PREGNANT = 4;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DATE_OF_BIRTH = 5;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.medevit.menus.impl.PersonDirectoryImpl <em>Person Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.medevit.menus.impl.PersonDirectoryImpl
	 * @see at.medevit.menus.impl.MenusPackageImpl#getPersonDirectory()
	 * @generated
	 */
	int PERSON_DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_DIRECTORY__ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Person Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_DIRECTORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Person Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_DIRECTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.medevit.menus.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.medevit.menus.Gender
	 * @see at.medevit.menus.impl.MenusPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 2;


	/**
	 * Returns the meta object for class '{@link at.medevit.menus.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see at.medevit.menus.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link at.medevit.menus.Person#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see at.medevit.menus.Person#getFirstname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link at.medevit.menus.Person#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see at.medevit.menus.Person#getLastname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link at.medevit.menus.Person#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sex</em>'.
	 * @see at.medevit.menus.Person#getSex()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Sex();

	/**
	 * Returns the meta object for the reference '{@link at.medevit.menus.Person#getPartner <em>Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner</em>'.
	 * @see at.medevit.menus.Person#getPartner()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Partner();

	/**
	 * Returns the meta object for the attribute '{@link at.medevit.menus.Person#isPregnant <em>Pregnant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pregnant</em>'.
	 * @see at.medevit.menus.Person#isPregnant()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Pregnant();

	/**
	 * Returns the meta object for the attribute '{@link at.medevit.menus.Person#getDateOfBirth <em>Date Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Birth</em>'.
	 * @see at.medevit.menus.Person#getDateOfBirth()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DateOfBirth();

	/**
	 * Returns the meta object for class '{@link at.medevit.menus.PersonDirectory <em>Person Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Directory</em>'.
	 * @see at.medevit.menus.PersonDirectory
	 * @generated
	 */
	EClass getPersonDirectory();

	/**
	 * Returns the meta object for the containment reference list '{@link at.medevit.menus.PersonDirectory#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see at.medevit.menus.PersonDirectory#getEntry()
	 * @see #getPersonDirectory()
	 * @generated
	 */
	EReference getPersonDirectory_Entry();

	/**
	 * Returns the meta object for enum '{@link at.medevit.menus.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see at.medevit.menus.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MenusFactory getMenusFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.medevit.menus.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.medevit.menus.impl.PersonImpl
		 * @see at.medevit.menus.impl.MenusPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRSTNAME = eINSTANCE.getPerson_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LASTNAME = eINSTANCE.getPerson_Lastname();

		/**
		 * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SEX = eINSTANCE.getPerson_Sex();

		/**
		 * The meta object literal for the '<em><b>Partner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PARTNER = eINSTANCE.getPerson_Partner();

		/**
		 * The meta object literal for the '<em><b>Pregnant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PREGNANT = eINSTANCE.getPerson_Pregnant();

		/**
		 * The meta object literal for the '<em><b>Date Of Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DATE_OF_BIRTH = eINSTANCE.getPerson_DateOfBirth();

		/**
		 * The meta object literal for the '{@link at.medevit.menus.impl.PersonDirectoryImpl <em>Person Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.medevit.menus.impl.PersonDirectoryImpl
		 * @see at.medevit.menus.impl.MenusPackageImpl#getPersonDirectory()
		 * @generated
		 */
		EClass PERSON_DIRECTORY = eINSTANCE.getPersonDirectory();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_DIRECTORY__ENTRY = eINSTANCE.getPersonDirectory_Entry();

		/**
		 * The meta object literal for the '{@link at.medevit.menus.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.medevit.menus.Gender
		 * @see at.medevit.menus.impl.MenusPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

	}

} //MenusPackage

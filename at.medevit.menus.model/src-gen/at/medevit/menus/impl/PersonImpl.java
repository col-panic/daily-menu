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
package at.medevit.menus.impl;

import at.medevit.menus.Gender;
import at.medevit.menus.MenusPackage;
import at.medevit.menus.Person;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.medevit.menus.impl.PersonImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link at.medevit.menus.impl.PersonImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link at.medevit.menus.impl.PersonImpl#getSex <em>Sex</em>}</li>
 *   <li>{@link at.medevit.menus.impl.PersonImpl#getPartner <em>Partner</em>}</li>
 *   <li>{@link at.medevit.menus.impl.PersonImpl#isPregnant <em>Pregnant</em>}</li>
 *   <li>{@link at.medevit.menus.impl.PersonImpl#getDateOfBirth <em>Date Of Birth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected static final String LASTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected String lastname = LASTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSex() <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected static final Gender SEX_EDEFAULT = Gender.MALE;

	/**
	 * The cached value of the '{@link #getSex() <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected Gender sex = SEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartner() <em>Partner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartner()
	 * @generated
	 * @ordered
	 */
	protected Person partner;

	/**
	 * This is true if the Partner reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean partnerESet;

	/**
	 * The default value of the '{@link #isPregnant() <em>Pregnant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPregnant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREGNANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPregnant() <em>Pregnant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPregnant()
	 * @generated
	 * @ordered
	 */
	protected boolean pregnant = PREGNANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OF_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected Date dateOfBirth = DATE_OF_BIRTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MenusPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MenusPackage.PERSON__FIRSTNAME, oldFirstname, firstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastname(String newLastname) {
		String oldLastname = lastname;
		lastname = newLastname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MenusPackage.PERSON__LASTNAME, oldLastname, lastname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender getSex() {
		return sex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSex(Gender newSex) {
		Gender oldSex = sex;
		sex = newSex == null ? SEX_EDEFAULT : newSex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MenusPackage.PERSON__SEX, oldSex, sex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPartner() {
		if (partner != null && partner.eIsProxy()) {
			InternalEObject oldPartner = (InternalEObject)partner;
			partner = (Person)eResolveProxy(oldPartner);
			if (partner != oldPartner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MenusPackage.PERSON__PARTNER, oldPartner, partner));
			}
		}
		return partner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPartner() {
		return partner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartner(Person newPartner) {
		Person oldPartner = partner;
		partner = newPartner;
		boolean oldPartnerESet = partnerESet;
		partnerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MenusPackage.PERSON__PARTNER, oldPartner, partner, !oldPartnerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPartner() {
		Person oldPartner = partner;
		boolean oldPartnerESet = partnerESet;
		partner = null;
		partnerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MenusPackage.PERSON__PARTNER, oldPartner, null, oldPartnerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPartner() {
		return partnerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPregnant() {
		return pregnant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPregnant(boolean newPregnant) {
		boolean oldPregnant = pregnant;
		pregnant = newPregnant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MenusPackage.PERSON__PREGNANT, oldPregnant, pregnant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfBirth(Date newDateOfBirth) {
		Date oldDateOfBirth = dateOfBirth;
		dateOfBirth = newDateOfBirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MenusPackage.PERSON__DATE_OF_BIRTH, oldDateOfBirth, dateOfBirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MenusPackage.PERSON__FIRSTNAME:
				return getFirstname();
			case MenusPackage.PERSON__LASTNAME:
				return getLastname();
			case MenusPackage.PERSON__SEX:
				return getSex();
			case MenusPackage.PERSON__PARTNER:
				if (resolve) return getPartner();
				return basicGetPartner();
			case MenusPackage.PERSON__PREGNANT:
				return isPregnant();
			case MenusPackage.PERSON__DATE_OF_BIRTH:
				return getDateOfBirth();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MenusPackage.PERSON__FIRSTNAME:
				setFirstname((String)newValue);
				return;
			case MenusPackage.PERSON__LASTNAME:
				setLastname((String)newValue);
				return;
			case MenusPackage.PERSON__SEX:
				setSex((Gender)newValue);
				return;
			case MenusPackage.PERSON__PARTNER:
				setPartner((Person)newValue);
				return;
			case MenusPackage.PERSON__PREGNANT:
				setPregnant((Boolean)newValue);
				return;
			case MenusPackage.PERSON__DATE_OF_BIRTH:
				setDateOfBirth((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MenusPackage.PERSON__FIRSTNAME:
				setFirstname(FIRSTNAME_EDEFAULT);
				return;
			case MenusPackage.PERSON__LASTNAME:
				setLastname(LASTNAME_EDEFAULT);
				return;
			case MenusPackage.PERSON__SEX:
				setSex(SEX_EDEFAULT);
				return;
			case MenusPackage.PERSON__PARTNER:
				unsetPartner();
				return;
			case MenusPackage.PERSON__PREGNANT:
				setPregnant(PREGNANT_EDEFAULT);
				return;
			case MenusPackage.PERSON__DATE_OF_BIRTH:
				setDateOfBirth(DATE_OF_BIRTH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MenusPackage.PERSON__FIRSTNAME:
				return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
			case MenusPackage.PERSON__LASTNAME:
				return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
			case MenusPackage.PERSON__SEX:
				return sex != SEX_EDEFAULT;
			case MenusPackage.PERSON__PARTNER:
				return isSetPartner();
			case MenusPackage.PERSON__PREGNANT:
				return pregnant != PREGNANT_EDEFAULT;
			case MenusPackage.PERSON__DATE_OF_BIRTH:
				return DATE_OF_BIRTH_EDEFAULT == null ? dateOfBirth != null : !DATE_OF_BIRTH_EDEFAULT.equals(dateOfBirth);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstname: ");
		result.append(firstname);
		result.append(", lastname: ");
		result.append(lastname);
		result.append(", sex: ");
		result.append(sex);
		result.append(", pregnant: ");
		result.append(pregnant);
		result.append(", dateOfBirth: ");
		result.append(dateOfBirth);
		result.append(')');
		return result.toString();
	}

} //PersonImpl

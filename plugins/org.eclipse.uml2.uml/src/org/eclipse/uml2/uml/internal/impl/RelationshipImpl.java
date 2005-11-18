/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: RelationshipImpl.java,v 1.1 2005/11/14 22:26:06 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RelationshipImpl#getRelatedElements <em>Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RelationshipImpl
		extends ElementImpl
		implements Relationship {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRelatedElements() {
		List relatedElement = (List) eVirtualGet(UMLPackage.RELATIONSHIP__RELATED_ELEMENT);
		if (relatedElement == null) {
			eVirtualSet(UMLPackage.RELATIONSHIP__RELATED_ELEMENT,
				relatedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.RELATIONSHIP__RELATED_ELEMENT,
					new EStructuralFeature[]{}));
		}
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.RELATIONSHIP__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.RELATIONSHIP__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.RELATIONSHIP__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.RELATIONSHIP__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.RELATIONSHIP__RELATED_ELEMENT :
				return getRelatedElements();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.RELATIONSHIP__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.RELATIONSHIP__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.RELATIONSHIP__OWNER :
				return isSetOwner();
			case UMLPackage.RELATIONSHIP__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.RELATIONSHIP__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.RELATIONSHIP__RELATED_ELEMENT :
				return isSetRelatedElements();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElements() {
		return false;
	}

} //RelationshipImpl
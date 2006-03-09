/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 * 
 * $Id: UML22UMLResourceFactoryImpl.java,v 1.1 2006/03/08 19:13:13 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLRegistry;
import org.eclipse.emf.mapping.ecore2xml.impl.Ecore2XMLRegistryImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UML22UMLExtendedMetadata;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.eclipse.uml2.uml.resource.UML22UMLResourceHandler;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * The <b>Resource Factory </b> associated with the package.
 */
public class UML22UMLResourceFactoryImpl
		extends ResourceFactoryImpl
		implements UML22UMLResource.Factory {

	protected static final String UML2Package__eNS_URI = "http://www.eclipse.org/uml2/1.0.0/UML"; //$NON-NLS-1$

	/**
	 * Creates an instance of the resource factory.
	 */
	public UML22UMLResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 */
	public Resource createResource(URI uri) {
		UMLResource resource = (UMLResource) UMLResource.Factory.INSTANCE
			.createResource(uri);

		Map defaultLoadOptions = resource.getDefaultLoadOptions();

		defaultLoadOptions.put(XMIResource.OPTION_LAX_FEATURE_PROCESSING,
			Boolean.FALSE);

		defaultLoadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE,
			Boolean.TRUE);

		EPackage.Registry ePackageRegistry = new EPackageRegistryImpl(
			EPackage.Registry.INSTANCE);
		ePackageRegistry.put(UML2Package__eNS_URI, UMLPackage.eINSTANCE);
		ePackageRegistry.put(
			"platform:/plugin/org.eclipse.uml2.uml/model/UML.ecore", //$NON-NLS-1$
			UMLPackage.eINSTANCE);

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.setPackageRegistry(ePackageRegistry);

		Ecore2XMLRegistry ecore2xmlRegistry = new Ecore2XMLRegistryImpl(
			Ecore2XMLRegistry.INSTANCE);
		ecore2xmlRegistry
			.put(
				UML2Package__eNS_URI,
				EcoreUtil
					.getObjectByType(
						resourceSet
							.getResource(
								URI
									.createURI("platform:/plugin/org.eclipse.uml2.uml/model/UML2_2_UML.ecore2xml"), //$NON-NLS-1$
								true).getContents(), Ecore2XMLPackage.eINSTANCE
							.getXMLMap()));

		ExtendedMetaData extendedMetaData = new UML22UMLExtendedMetadata(
			ePackageRegistry, ecore2xmlRegistry);

		defaultLoadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA,
			extendedMetaData);

		defaultLoadOptions.put(XMLResource.OPTION_RESOURCE_HANDLER,
			new UML22UMLResourceHandler());

		return resource;
	}

} // UML22UMLResourceFactoryImpl
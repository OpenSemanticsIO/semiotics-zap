/**
 * Copyright 2016 OpenSemantics.IO
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.opensemantics.semiotics.model.assessment.impl;

import io.opensemantics.semiotics.model.assessment.AssessmentPackage;
import io.opensemantics.semiotics.model.assessment.Controller;
import io.opensemantics.semiotics.model.assessment.Controllers;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ControllerImpl#getControllers <em>Controllers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends NodeImpl implements Controller {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ControllerImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AssessmentPackage.Literals.CONTROLLER;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Controllers getControllers() {
    if (eContainerFeatureID() != AssessmentPackage.CONTROLLER__CONTROLLERS) return null;
    return (Controllers)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetControllers(Controllers newControllers, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newControllers, AssessmentPackage.CONTROLLER__CONTROLLERS, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControllers(Controllers newControllers) {
    if (newControllers != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.CONTROLLER__CONTROLLERS && newControllers != null)) {
      if (EcoreUtil.isAncestor(this, newControllers))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newControllers != null)
        msgs = ((InternalEObject)newControllers).eInverseAdd(this, AssessmentPackage.CONTROLLERS__CONTROLLERS, Controllers.class, msgs);
      msgs = basicSetControllers(newControllers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.CONTROLLER__CONTROLLERS, newControllers, newControllers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case AssessmentPackage.CONTROLLER__CONTROLLERS:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetControllers((Controllers)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case AssessmentPackage.CONTROLLER__CONTROLLERS:
        return basicSetControllers(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
      case AssessmentPackage.CONTROLLER__CONTROLLERS:
        return eInternalContainer().eInverseRemove(this, AssessmentPackage.CONTROLLERS__CONTROLLERS, Controllers.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case AssessmentPackage.CONTROLLER__CONTROLLERS:
        return getControllers();
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
      case AssessmentPackage.CONTROLLER__CONTROLLERS:
        setControllers((Controllers)newValue);
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
      case AssessmentPackage.CONTROLLER__CONTROLLERS:
        setControllers((Controllers)null);
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
      case AssessmentPackage.CONTROLLER__CONTROLLERS:
        return getControllers() != null;
    }
    return super.eIsSet(featureID);
  }

} //ControllerImpl

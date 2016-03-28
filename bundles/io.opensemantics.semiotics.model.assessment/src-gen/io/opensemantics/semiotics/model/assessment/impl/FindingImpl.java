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

import io.opensemantics.semiotics.model.assessment.Assessment;
import io.opensemantics.semiotics.model.assessment.AssessmentPackage;
import io.opensemantics.semiotics.model.assessment.Finding;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.FindingImpl#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.FindingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.FindingImpl#getReproducer <em>Reproducer</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.FindingImpl#getRemediation <em>Remediation</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.FindingImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindingImpl extends MinimalEObjectImpl.Container implements Finding {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReproducer() <em>Reproducer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReproducer()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRODUCER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReproducer() <em>Reproducer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReproducer()
	 * @generated
	 * @ordered
	 */
	protected String reproducer = REPRODUCER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemediation() <em>Remediation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemediation()
	 * @generated
	 * @ordered
	 */
	protected static final String REMEDIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemediation() <em>Remediation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemediation()
	 * @generated
	 * @ordered
	 */
	protected String remediation = REMEDIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferences() <em>References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected String references = REFERENCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.FINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assessment getAssessment() {
		if (eContainerFeatureID() != AssessmentPackage.FINDING__ASSESSMENT) return null;
		return (Assessment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssessment(Assessment newAssessment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAssessment, AssessmentPackage.FINDING__ASSESSMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssessment(Assessment newAssessment) {
		if (newAssessment != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.FINDING__ASSESSMENT && newAssessment != null)) {
			if (EcoreUtil.isAncestor(this, newAssessment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAssessment != null)
				msgs = ((InternalEObject)newAssessment).eInverseAdd(this, AssessmentPackage.ASSESSMENT__FINDINGS, Assessment.class, msgs);
			msgs = basicSetAssessment(newAssessment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FINDING__ASSESSMENT, newAssessment, newAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FINDING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReproducer() {
		return reproducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReproducer(String newReproducer) {
		String oldReproducer = reproducer;
		reproducer = newReproducer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FINDING__REPRODUCER, oldReproducer, reproducer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemediation() {
		return remediation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemediation(String newRemediation) {
		String oldRemediation = remediation;
		remediation = newRemediation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FINDING__REMEDIATION, oldRemediation, remediation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferences() {
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(String newReferences) {
		String oldReferences = references;
		references = newReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FINDING__REFERENCES, oldReferences, references));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssessmentPackage.FINDING__ASSESSMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAssessment((Assessment)otherEnd, msgs);
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
			case AssessmentPackage.FINDING__ASSESSMENT:
				return basicSetAssessment(null, msgs);
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
			case AssessmentPackage.FINDING__ASSESSMENT:
				return eInternalContainer().eInverseRemove(this, AssessmentPackage.ASSESSMENT__FINDINGS, Assessment.class, msgs);
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
			case AssessmentPackage.FINDING__ASSESSMENT:
				return getAssessment();
			case AssessmentPackage.FINDING__DESCRIPTION:
				return getDescription();
			case AssessmentPackage.FINDING__REPRODUCER:
				return getReproducer();
			case AssessmentPackage.FINDING__REMEDIATION:
				return getRemediation();
			case AssessmentPackage.FINDING__REFERENCES:
				return getReferences();
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
			case AssessmentPackage.FINDING__ASSESSMENT:
				setAssessment((Assessment)newValue);
				return;
			case AssessmentPackage.FINDING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AssessmentPackage.FINDING__REPRODUCER:
				setReproducer((String)newValue);
				return;
			case AssessmentPackage.FINDING__REMEDIATION:
				setRemediation((String)newValue);
				return;
			case AssessmentPackage.FINDING__REFERENCES:
				setReferences((String)newValue);
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
			case AssessmentPackage.FINDING__ASSESSMENT:
				setAssessment((Assessment)null);
				return;
			case AssessmentPackage.FINDING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AssessmentPackage.FINDING__REPRODUCER:
				setReproducer(REPRODUCER_EDEFAULT);
				return;
			case AssessmentPackage.FINDING__REMEDIATION:
				setRemediation(REMEDIATION_EDEFAULT);
				return;
			case AssessmentPackage.FINDING__REFERENCES:
				setReferences(REFERENCES_EDEFAULT);
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
			case AssessmentPackage.FINDING__ASSESSMENT:
				return getAssessment() != null;
			case AssessmentPackage.FINDING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AssessmentPackage.FINDING__REPRODUCER:
				return REPRODUCER_EDEFAULT == null ? reproducer != null : !REPRODUCER_EDEFAULT.equals(reproducer);
			case AssessmentPackage.FINDING__REMEDIATION:
				return REMEDIATION_EDEFAULT == null ? remediation != null : !REMEDIATION_EDEFAULT.equals(remediation);
			case AssessmentPackage.FINDING__REFERENCES:
				return REFERENCES_EDEFAULT == null ? references != null : !REFERENCES_EDEFAULT.equals(references);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", reproducer: ");
		result.append(reproducer);
		result.append(", remediation: ");
		result.append(remediation);
		result.append(", references: ");
		result.append(references);
		result.append(')');
		return result.toString();
	}

} //FindingImpl
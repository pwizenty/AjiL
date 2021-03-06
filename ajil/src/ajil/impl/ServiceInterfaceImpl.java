/**
 */
package ajil.impl;

import ajil.APIService;
import ajil.Ability;
import ajil.AjilPackage;
import ajil.ECommunicationMechanism;
import ajil.FunctionalService;
import ajil.ServiceInterface;

import java.lang.Integer;
import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ajil.impl.ServiceInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ajil.impl.ServiceInterfaceImpl#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link ajil.impl.ServiceInterfaceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ajil.impl.ServiceInterfaceImpl#getAbilities <em>Abilities</em>}</li>
 *   <li>{@link ajil.impl.ServiceInterfaceImpl#getExposedToGateways <em>Exposed To Gateways</em>}</li>
 *   <li>{@link ajil.impl.ServiceInterfaceImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceInterfaceImpl extends MinimalEObjectImpl.Container implements ServiceInterface {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "myInterface";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final ECommunicationMechanism MECHANISM_EDEFAULT = ECommunicationMechanism.RES_TFUL_HTTP;

	/**
	 * The cached value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected ECommunicationMechanism mechanism = MECHANISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbilities() <em>Abilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Ability> abilities;

	/**
	 * The cached value of the '{@link #getExposedToGateways() <em>Exposed To Gateways</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposedToGateways()
	 * @generated
	 * @ordered
	 */
	protected EList<APIService> exposedToGateways;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AjilPackage.Literals.SERVICE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjilPackage.SERVICE_INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECommunicationMechanism getMechanism() {
		return mechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMechanism(ECommunicationMechanism newMechanism) {
		ECommunicationMechanism oldMechanism = mechanism;
		mechanism = newMechanism == null ? MECHANISM_EDEFAULT : newMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjilPackage.SERVICE_INTERFACE__MECHANISM, oldMechanism, mechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjilPackage.SERVICE_INTERFACE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ability> getAbilities() {
		if (abilities == null) {
			abilities = new EObjectContainmentWithInverseEList<Ability>(Ability.class, this, AjilPackage.SERVICE_INTERFACE__ABILITIES, AjilPackage.ABILITY__OWNER);
		}
		return abilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APIService> getExposedToGateways() {
		if (exposedToGateways == null) {
			exposedToGateways = new EObjectWithInverseResolvingEList.ManyInverse<APIService>(APIService.class, this, AjilPackage.SERVICE_INTERFACE__EXPOSED_TO_GATEWAYS, AjilPackage.API_SERVICE__EXPOSED_SERVICES);
		}
		return exposedToGateways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalService getOwner() {
		if (eContainerFeatureID() != AjilPackage.SERVICE_INTERFACE__OWNER) return null;
		return (FunctionalService)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AjilPackage.SERVICE_INTERFACE__ABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbilities()).basicAdd(otherEnd, msgs);
			case AjilPackage.SERVICE_INTERFACE__EXPOSED_TO_GATEWAYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExposedToGateways()).basicAdd(otherEnd, msgs);
			case AjilPackage.SERVICE_INTERFACE__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, AjilPackage.SERVICE_INTERFACE__OWNER, msgs);
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
			case AjilPackage.SERVICE_INTERFACE__ABILITIES:
				return ((InternalEList<?>)getAbilities()).basicRemove(otherEnd, msgs);
			case AjilPackage.SERVICE_INTERFACE__EXPOSED_TO_GATEWAYS:
				return ((InternalEList<?>)getExposedToGateways()).basicRemove(otherEnd, msgs);
			case AjilPackage.SERVICE_INTERFACE__OWNER:
				return eBasicSetContainer(null, AjilPackage.SERVICE_INTERFACE__OWNER, msgs);
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
			case AjilPackage.SERVICE_INTERFACE__OWNER:
				return eInternalContainer().eInverseRemove(this, AjilPackage.FUNCTIONAL_SERVICE__PROVIDED_INTERFACES, FunctionalService.class, msgs);
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
			case AjilPackage.SERVICE_INTERFACE__NAME:
				return getName();
			case AjilPackage.SERVICE_INTERFACE__MECHANISM:
				return getMechanism();
			case AjilPackage.SERVICE_INTERFACE__VERSION:
				return getVersion();
			case AjilPackage.SERVICE_INTERFACE__ABILITIES:
				return getAbilities();
			case AjilPackage.SERVICE_INTERFACE__EXPOSED_TO_GATEWAYS:
				return getExposedToGateways();
			case AjilPackage.SERVICE_INTERFACE__OWNER:
				return getOwner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AjilPackage.SERVICE_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case AjilPackage.SERVICE_INTERFACE__MECHANISM:
				setMechanism((ECommunicationMechanism)newValue);
				return;
			case AjilPackage.SERVICE_INTERFACE__VERSION:
				setVersion((Integer)newValue);
				return;
			case AjilPackage.SERVICE_INTERFACE__ABILITIES:
				getAbilities().clear();
				getAbilities().addAll((Collection<? extends Ability>)newValue);
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
			case AjilPackage.SERVICE_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AjilPackage.SERVICE_INTERFACE__MECHANISM:
				setMechanism(MECHANISM_EDEFAULT);
				return;
			case AjilPackage.SERVICE_INTERFACE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case AjilPackage.SERVICE_INTERFACE__ABILITIES:
				getAbilities().clear();
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
			case AjilPackage.SERVICE_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AjilPackage.SERVICE_INTERFACE__MECHANISM:
				return mechanism != MECHANISM_EDEFAULT;
			case AjilPackage.SERVICE_INTERFACE__VERSION:
				return version != VERSION_EDEFAULT;
			case AjilPackage.SERVICE_INTERFACE__ABILITIES:
				return abilities != null && !abilities.isEmpty();
			case AjilPackage.SERVICE_INTERFACE__EXPOSED_TO_GATEWAYS:
				return exposedToGateways != null && !exposedToGateways.isEmpty();
			case AjilPackage.SERVICE_INTERFACE__OWNER:
				return getOwner() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", mechanism: ");
		result.append(mechanism);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ServiceInterfaceImpl

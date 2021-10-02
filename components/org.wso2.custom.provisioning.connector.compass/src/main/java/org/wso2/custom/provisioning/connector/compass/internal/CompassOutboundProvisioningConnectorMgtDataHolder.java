package org.wso2.custom.provisioning.connector.compass.internal;

import org.osgi.framework.BundleContext;
import org.wso2.carbon.identity.governance.IdentityGovernanceService;

/**
 * Data holder for the compass custom outbound provisioning connector.
 */
public class CompassOutboundProvisioningConnectorMgtDataHolder {

    private static final CompassOutboundProvisioningConnectorMgtDataHolder instance = new
            CompassOutboundProvisioningConnectorMgtDataHolder();
    private IdentityGovernanceService identityGovernanceService;
    private BundleContext bundleContext;

    private CompassOutboundProvisioningConnectorMgtDataHolder() {

    }

    public static CompassOutboundProvisioningConnectorMgtDataHolder getInstance() {

        return instance;
    }

    public IdentityGovernanceService getIdentityGovernanceService() {

        return identityGovernanceService;
    }

    public void setIdentityGovernanceService(IdentityGovernanceService identityGovernanceService) {

        this.identityGovernanceService = identityGovernanceService;
    }

    public BundleContext getBundleContext() {

        return bundleContext;
    }

    public void setBundleContext(BundleContext bundleContext) {

        this.bundleContext = bundleContext;
    }
}

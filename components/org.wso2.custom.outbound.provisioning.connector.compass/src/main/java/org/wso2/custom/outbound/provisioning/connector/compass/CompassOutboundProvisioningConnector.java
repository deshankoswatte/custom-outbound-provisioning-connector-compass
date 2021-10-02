package org.wso2.custom.outbound.provisioning.connector.compass;

import org.wso2.carbon.identity.application.common.model.Property;
import org.wso2.carbon.identity.provisioning.AbstractOutboundProvisioningConnector;
import org.wso2.carbon.identity.provisioning.IdentityProvisioningException;
import org.wso2.carbon.identity.provisioning.ProvisionedIdentifier;
import org.wso2.carbon.identity.provisioning.ProvisioningEntity;

/**
 * This class contains the core implementation of the custom compass outbound provisioning connector.
 */
public class CompassOutboundProvisioningConnector extends AbstractOutboundProvisioningConnector {

    private static final long serialVersionUID = -6152718786151333233L;

    @Override
    public void init(Property[] properties) throws IdentityProvisioningException {

    }

    @Override
    public ProvisionedIdentifier provision(ProvisioningEntity provisioningEntity) throws IdentityProvisioningException {
        return null;
    }
}

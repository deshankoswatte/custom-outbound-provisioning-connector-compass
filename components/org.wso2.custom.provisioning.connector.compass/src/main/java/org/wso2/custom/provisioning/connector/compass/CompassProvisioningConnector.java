package org.wso2.custom.provisioning.connector.compass;

import org.wso2.carbon.identity.application.common.model.Property;
import org.wso2.carbon.identity.provisioning.AbstractOutboundProvisioningConnector;
import org.wso2.carbon.identity.provisioning.IdentityProvisioningException;
import org.wso2.carbon.identity.provisioning.ProvisionedIdentifier;
import org.wso2.carbon.identity.provisioning.ProvisioningEntity;

public class CompassProvisioningConnector extends AbstractOutboundProvisioningConnector {

    @Override
    public void init(Property[] properties) throws IdentityProvisioningException {

    }

    @Override
    public ProvisionedIdentifier provision(ProvisioningEntity provisioningEntity) throws IdentityProvisioningException {
        return null;
    }
}

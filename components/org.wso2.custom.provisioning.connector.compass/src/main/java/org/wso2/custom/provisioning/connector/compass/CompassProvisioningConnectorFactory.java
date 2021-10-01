package org.wso2.custom.provisioning.connector.compass;

import org.wso2.carbon.identity.application.common.model.Property;
import org.wso2.carbon.identity.provisioning.AbstractOutboundProvisioningConnector;
import org.wso2.carbon.identity.provisioning.AbstractProvisioningConnectorFactory;
import org.wso2.carbon.identity.provisioning.IdentityProvisioningException;

public class CompassProvisioningConnectorFactory extends AbstractProvisioningConnectorFactory {

    @Override
    protected AbstractOutboundProvisioningConnector buildConnector(Property[] properties) throws IdentityProvisioningException {

        return null;
    }

    @Override
    public String getConnectorType() {

        return null;
    }
}

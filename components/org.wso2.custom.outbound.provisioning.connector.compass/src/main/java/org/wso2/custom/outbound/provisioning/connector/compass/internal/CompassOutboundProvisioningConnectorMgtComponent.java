package org.wso2.custom.outbound.provisioning.connector.compass.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.wso2.carbon.identity.governance.IdentityGovernanceService;

/**
 * OSGi service component which registers the custom compass outbound provisioning connector and sets the bundle
 * context.
 */
@Component(name =
        "org.wso2.custom.provisioning.connector.compass.internal.CompassOutboundProvisioningConnectorMgtComponent",
        immediate = true)
public class CompassOutboundProvisioningConnectorMgtComponent {

    private static final Log log = LogFactory.getLog(CompassOutboundProvisioningConnectorMgtComponent.class);

    @Activate
    protected void activate(ComponentContext context) {

        try {
            BundleContext bundleContext = context.getBundleContext();
            CompassOutboundProvisioningConnectorMgtDataHolder.getInstance().setBundleContext(bundleContext);
            if (log.isDebugEnabled()) {
                log.debug("The Compass outbound provisioning connector mgt component is enabled.");
            }
        } catch (Throwable throwable) {
            log.error("Error while activating the Compass outbound provisioning connector mgt component.", throwable);
        }
    }

    @Deactivate
    protected void deactivate(ComponentContext context) {

        if (log.isDebugEnabled()) {
            log.debug("The Compass outbound provisioning connector mgt component is de-activated.");
        }
    }

    @Reference(
            name = "IdentityGovernanceService",
            service = IdentityGovernanceService.class,
            cardinality = ReferenceCardinality.MANDATORY,
            policy = ReferencePolicy.DYNAMIC,
            unbind = "unsetIdentityGovernanceService")
    protected void setIdentityGovernanceService(IdentityGovernanceService idpManager) {

        if (log.isDebugEnabled()) {
            log.debug("Setting Identity Governance Service.");
        }
        CompassOutboundProvisioningConnectorMgtDataHolder.getInstance().setIdentityGovernanceService(idpManager);
    }

    protected void unsetIdentityGovernanceService(IdentityGovernanceService idpManager) {

        if (log.isDebugEnabled()) {
            log.debug("UnSetting Identity Governance Service.");
        }
        CompassOutboundProvisioningConnectorMgtDataHolder.getInstance().setIdentityGovernanceService(null);
    }
}

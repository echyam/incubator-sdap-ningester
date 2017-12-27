/*****************************************************************************
 * Copyright (c) 2017 Jet Propulsion Laboratory,
 * California Institute of Technology.  All rights reserved
 *****************************************************************************/

package gov.nasa.jpl.nexus.ningester.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Component
public class AddTimeToSectionSpec {

    private String timeVar;

    public String getTimeVar() {
        return timeVar;
    }

    public void setTimeVar(String timeVar) {
        this.timeVar = timeVar;
    }
}

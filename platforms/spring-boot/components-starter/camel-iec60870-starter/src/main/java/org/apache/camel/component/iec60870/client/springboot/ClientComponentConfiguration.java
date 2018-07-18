/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.iec60870.client.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * IEC 60870 component used for telecontrol (supervisory control and data
 * acquisition) such as controlling electric power transmission grids and other
 * geographically widespread control systems.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.iec60870-client")
public class ClientComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the iec60870-client component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Default connection options
     */
    private ClientOptionsNestedConfiguration defaultConnectionOptions;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public ClientOptionsNestedConfiguration getDefaultConnectionOptions() {
        return defaultConnectionOptions;
    }

    public void setDefaultConnectionOptions(
            ClientOptionsNestedConfiguration defaultConnectionOptions) {
        this.defaultConnectionOptions = defaultConnectionOptions;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class ClientOptionsNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.iec60870.client.ClientOptions.class;
        private Byte causeSourceAddress;
        /**
         * Whether background scan transmissions should be ignored.
         */
        private Boolean ignoreBackgroundScan = true;

        public Byte getCauseSourceAddress() {
            return causeSourceAddress;
        }

        public void setCauseSourceAddress(Byte causeSourceAddress) {
            this.causeSourceAddress = causeSourceAddress;
        }

        public Boolean getIgnoreBackgroundScan() {
            return ignoreBackgroundScan;
        }

        public void setIgnoreBackgroundScan(Boolean ignoreBackgroundScan) {
            this.ignoreBackgroundScan = ignoreBackgroundScan;
        }
    }
}
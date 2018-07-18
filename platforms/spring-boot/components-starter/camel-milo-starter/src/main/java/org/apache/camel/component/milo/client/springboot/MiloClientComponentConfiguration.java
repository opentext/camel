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
package org.apache.camel.component.milo.client.springboot;

import java.util.Set;
import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Connect to OPC UA servers using the binary protocol for acquiring telemetry
 * data
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.milo-client")
public class MiloClientComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the milo-client component. This
     * is enabled by default.
     */
    private Boolean enabled;
    /**
     * All default options for client
     */
    private MiloClientConfigurationNestedConfiguration defaultConfiguration;
    /**
     * Default application name
     */
    private String applicationName;
    /**
     * Default application URI
     */
    private String applicationUri;
    /**
     * Default product URI
     */
    private String productUri;
    /**
     * Default reconnect timeout
     */
    private Long reconnectTimeout;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public MiloClientConfigurationNestedConfiguration getDefaultConfiguration() {
        return defaultConfiguration;
    }

    public void setDefaultConfiguration(
            MiloClientConfigurationNestedConfiguration defaultConfiguration) {
        this.defaultConfiguration = defaultConfiguration;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationUri() {
        return applicationUri;
    }

    public void setApplicationUri(String applicationUri) {
        this.applicationUri = applicationUri;
    }

    public String getProductUri() {
        return productUri;
    }

    public void setProductUri(String productUri) {
        this.productUri = productUri;
    }

    public Long getReconnectTimeout() {
        return reconnectTimeout;
    }

    public void setReconnectTimeout(Long reconnectTimeout) {
        this.reconnectTimeout = reconnectTimeout;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class MiloClientConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.milo.client.MiloClientConfiguration.class;
        private String endpointUri;
        /**
         * An alternative discovery URI
         */
        private String discoveryEndpointUri;
        /**
         * A suffix for endpoint URI when discovering
         */
        private String discoveryEndpointSuffix;
        /**
         * A virtual client id to force the creation of a new connection
         * instance
         */
        private String clientId;
        /**
         * The application name
         */
        private String applicationName = "Apache Camel adapter for Eclipse Milo";
        /**
         * The application URI
         */
        private String applicationUri = "http://camel.apache.org/EclipseMilo/Client";
        /**
         * The product URI
         */
        private String productUri = "http://camel.apache.org/EclipseMilo";
        /**
         * Request timeout in milliseconds
         */
        private Long requestTimeout;
        /**
         * Channel lifetime in milliseconds
         */
        private Long channelLifetime;
        /**
         * Session name
         */
        private String sessionName;
        /**
         * Session timeout in milliseconds
         */
        private Long sessionTimeout;
        /**
         * The maximum number of pending publish requests
         */
        private Long maxPendingPublishRequests;
        /**
         * The maximum number of bytes a response message may have
         */
        private Long maxResponseMessageSize;
        /**
         * The key store type
         */
        private String keyStoreType;
        /**
         * The name of the key in the keystore file
         */
        private String keyAlias;
        /**
         * The keystore password
         */
        private String keyStorePassword;
        /**
         * The key password
         */
        private String keyPassword;
        /**
         * A set of allowed security policy URIs. Default is to accept all and
         * use the highest.
         */
        private Set allowedSecurityPolicies;
        /**
         * Override the server reported endpoint host with the host from the
         * endpoint URI.
         */
        private Boolean overrideHost = false;

        public String getEndpointUri() {
            return endpointUri;
        }

        public void setEndpointUri(String endpointUri) {
            this.endpointUri = endpointUri;
        }

        public String getDiscoveryEndpointUri() {
            return discoveryEndpointUri;
        }

        public void setDiscoveryEndpointUri(String discoveryEndpointUri) {
            this.discoveryEndpointUri = discoveryEndpointUri;
        }

        public String getDiscoveryEndpointSuffix() {
            return discoveryEndpointSuffix;
        }

        public void setDiscoveryEndpointSuffix(String discoveryEndpointSuffix) {
            this.discoveryEndpointSuffix = discoveryEndpointSuffix;
        }

        public String getClientId() {
            return clientId;
        }

        public void setClientId(String clientId) {
            this.clientId = clientId;
        }

        public String getApplicationName() {
            return applicationName;
        }

        public void setApplicationName(String applicationName) {
            this.applicationName = applicationName;
        }

        public String getApplicationUri() {
            return applicationUri;
        }

        public void setApplicationUri(String applicationUri) {
            this.applicationUri = applicationUri;
        }

        public String getProductUri() {
            return productUri;
        }

        public void setProductUri(String productUri) {
            this.productUri = productUri;
        }

        public Long getRequestTimeout() {
            return requestTimeout;
        }

        public void setRequestTimeout(Long requestTimeout) {
            this.requestTimeout = requestTimeout;
        }

        public Long getChannelLifetime() {
            return channelLifetime;
        }

        public void setChannelLifetime(Long channelLifetime) {
            this.channelLifetime = channelLifetime;
        }

        public String getSessionName() {
            return sessionName;
        }

        public void setSessionName(String sessionName) {
            this.sessionName = sessionName;
        }

        public Long getSessionTimeout() {
            return sessionTimeout;
        }

        public void setSessionTimeout(Long sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
        }

        public Long getMaxPendingPublishRequests() {
            return maxPendingPublishRequests;
        }

        public void setMaxPendingPublishRequests(Long maxPendingPublishRequests) {
            this.maxPendingPublishRequests = maxPendingPublishRequests;
        }

        public Long getMaxResponseMessageSize() {
            return maxResponseMessageSize;
        }

        public void setMaxResponseMessageSize(Long maxResponseMessageSize) {
            this.maxResponseMessageSize = maxResponseMessageSize;
        }

        public String getKeyStoreType() {
            return keyStoreType;
        }

        public void setKeyStoreType(String keyStoreType) {
            this.keyStoreType = keyStoreType;
        }

        public String getKeyAlias() {
            return keyAlias;
        }

        public void setKeyAlias(String keyAlias) {
            this.keyAlias = keyAlias;
        }

        public String getKeyStorePassword() {
            return keyStorePassword;
        }

        public void setKeyStorePassword(String keyStorePassword) {
            this.keyStorePassword = keyStorePassword;
        }

        public String getKeyPassword() {
            return keyPassword;
        }

        public void setKeyPassword(String keyPassword) {
            this.keyPassword = keyPassword;
        }

        public Set getAllowedSecurityPolicies() {
            return allowedSecurityPolicies;
        }

        public void setAllowedSecurityPolicies(Set allowedSecurityPolicies) {
            this.allowedSecurityPolicies = allowedSecurityPolicies;
        }

        public Boolean getOverrideHost() {
            return overrideHost;
        }

        public void setOverrideHost(Boolean overrideHost) {
            this.overrideHost = overrideHost;
        }
    }
}
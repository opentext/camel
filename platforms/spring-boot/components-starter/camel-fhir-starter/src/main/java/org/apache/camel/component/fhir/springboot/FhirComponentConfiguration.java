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
package org.apache.camel.component.fhir.springboot;

import javax.annotation.Generated;
import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.client.api.IRestfulClientFactory;
import org.apache.camel.component.fhir.internal.FhirApiName;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * Represents a FHIR endpoint.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.fhir")
public class FhirComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the fhir component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use the shared configuration
     */
    private FhirConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public FhirConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            FhirConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class FhirConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.fhir.FhirConfiguration.class;
        private String serverUrl;
        private Boolean prettyPrint = false;
        /**
         * What kind of operation to perform
         */
        private FhirApiName apiName;
        /**
         * What sub operation to use for the selected operation
         */
        private String methodName;
        @NestedConfigurationProperty
        private FhirContext fhirContext;
        private Boolean forceConformanceCheck = false;
        private String username;
        private String password;
        private String accessToken;
        private Boolean log = false;
        private Boolean compress = false;
        private String sessionCookie;
        private Boolean deferModelScanning = false;
        private Integer connectionTimeout = 10000;
        private Integer socketTimeout = 10000;
        private String proxyHost;
        private String proxyPassword;
        private Integer proxyPort;
        private String proxyUser;
        private IGenericClient client;
        private IRestfulClientFactory clientFactory;

        public String getServerUrl() {
            return serverUrl;
        }

        public void setServerUrl(String serverUrl) {
            this.serverUrl = serverUrl;
        }

        public Boolean getPrettyPrint() {
            return prettyPrint;
        }

        public void setPrettyPrint(Boolean prettyPrint) {
            this.prettyPrint = prettyPrint;
        }

        public FhirApiName getApiName() {
            return apiName;
        }

        public void setApiName(FhirApiName apiName) {
            this.apiName = apiName;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public FhirContext getFhirContext() {
            return fhirContext;
        }

        public void setFhirContext(FhirContext fhirContext) {
            this.fhirContext = fhirContext;
        }

        public Boolean getForceConformanceCheck() {
            return forceConformanceCheck;
        }

        public void setForceConformanceCheck(Boolean forceConformanceCheck) {
            this.forceConformanceCheck = forceConformanceCheck;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public Boolean getLog() {
            return log;
        }

        public void setLog(Boolean log) {
            this.log = log;
        }

        public Boolean getCompress() {
            return compress;
        }

        public void setCompress(Boolean compress) {
            this.compress = compress;
        }

        public String getSessionCookie() {
            return sessionCookie;
        }

        public void setSessionCookie(String sessionCookie) {
            this.sessionCookie = sessionCookie;
        }

        public Boolean getDeferModelScanning() {
            return deferModelScanning;
        }

        public void setDeferModelScanning(Boolean deferModelScanning) {
            this.deferModelScanning = deferModelScanning;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public void setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
        }

        public Integer getSocketTimeout() {
            return socketTimeout;
        }

        public void setSocketTimeout(Integer socketTimeout) {
            this.socketTimeout = socketTimeout;
        }

        public String getProxyHost() {
            return proxyHost;
        }

        public void setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
        }

        public String getProxyPassword() {
            return proxyPassword;
        }

        public void setProxyPassword(String proxyPassword) {
            this.proxyPassword = proxyPassword;
        }

        public Integer getProxyPort() {
            return proxyPort;
        }

        public void setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
        }

        public String getProxyUser() {
            return proxyUser;
        }

        public void setProxyUser(String proxyUser) {
            this.proxyUser = proxyUser;
        }

        public IGenericClient getClient() {
            return client;
        }

        public void setClient(IGenericClient client) {
            this.client = client;
        }

        public IRestfulClientFactory getClientFactory() {
            return clientFactory;
        }

        public void setClientFactory(IRestfulClientFactory clientFactory) {
            this.clientFactory = clientFactory;
        }
    }
}
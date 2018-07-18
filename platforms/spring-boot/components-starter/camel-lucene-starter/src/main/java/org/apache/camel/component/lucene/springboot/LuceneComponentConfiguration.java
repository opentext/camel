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
package org.apache.camel.component.lucene.springboot;

import java.io.File;
import java.net.URI;
import javax.annotation.Generated;
import org.apache.camel.component.lucene.LuceneOperation;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.util.Version;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * To insert or query from Apache Lucene databases.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.lucene")
public class LuceneComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the lucene component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use a shared lucene configuration
     */
    private LuceneConfigurationNestedConfiguration config;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public LuceneConfigurationNestedConfiguration getConfig() {
        return config;
    }

    public void setConfig(LuceneConfigurationNestedConfiguration config) {
        this.config = config;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class LuceneConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.lucene.LuceneConfiguration.class;
        private URI uri;
        /**
         * The URL to the lucene server
         */
        private String host;
        /**
         * Operation to do such as insert or query.
         */
        private LuceneOperation operation;
        private String authority;
        /**
         * An optional directory containing files to be used to be analyzed and
         * added to the index at producer startup.
         */
        private File sourceDirectory;
        /**
         * A file system directory in which index files are created upon
         * analysis of the document by the specified analyzer
         */
        private File indexDirectory;
        /**
         * An Analyzer builds TokenStreams, which analyze text. It thus
         * represents a policy for extracting index terms from text. The value
         * for analyzer can be any class that extends the abstract class
         * org.apache.lucene.analysis.Analyzer. Lucene also offers a rich set of
         * analyzers out of the box
         */
        private Analyzer analyzer;
        /**
         * An integer value that limits the result set of the search operation
         */
        private Integer maxHits;
        @NestedConfigurationProperty
        private Version luceneVersion;

        public URI getUri() {
            return uri;
        }

        public void setUri(URI uri) {
            this.uri = uri;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public LuceneOperation getOperation() {
            return operation;
        }

        public void setOperation(LuceneOperation operation) {
            this.operation = operation;
        }

        public String getAuthority() {
            return authority;
        }

        public void setAuthority(String authority) {
            this.authority = authority;
        }

        public File getSourceDirectory() {
            return sourceDirectory;
        }

        public void setSourceDirectory(File sourceDirectory) {
            this.sourceDirectory = sourceDirectory;
        }

        public File getIndexDirectory() {
            return indexDirectory;
        }

        public void setIndexDirectory(File indexDirectory) {
            this.indexDirectory = indexDirectory;
        }

        public Analyzer getAnalyzer() {
            return analyzer;
        }

        public void setAnalyzer(Analyzer analyzer) {
            this.analyzer = analyzer;
        }

        public Integer getMaxHits() {
            return maxHits;
        }

        public void setMaxHits(Integer maxHits) {
            this.maxHits = maxHits;
        }

        public Version getLuceneVersion() {
            return luceneVersion;
        }

        public void setLuceneVersion(Version luceneVersion) {
            this.luceneVersion = luceneVersion;
        }
    }
}
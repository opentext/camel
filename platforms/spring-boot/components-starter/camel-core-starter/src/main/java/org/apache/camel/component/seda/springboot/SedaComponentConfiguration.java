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
package org.apache.camel.component.seda.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The seda component provides asynchronous call to another endpoint from any
 * CamelContext in the same JVM.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.seda")
public class SedaComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the seda component
     */
    private Boolean enabled;
    /**
     * Sets the default maximum capacity of the SEDA queue (i.e., the number of
     * messages it can hold).
     */
    private Integer queueSize = 1000;
    /**
     * Sets the default number of concurrent threads processing exchanges.
     */
    private Integer concurrentConsumers = 1;
    /**
     * Sets the default queue factory. The option is a
     * org.apache.camel.component
     * .seda.BlockingQueueFactory<org.apache.camel.Exchange> type.
     */
    private String defaultQueueFactory;
    /**
     * Whether a thread that sends messages to a full SEDA queue will block
     * until the queue's capacity is no longer exhausted. By default, an
     * exception will be thrown stating that the queue is full. By enabling this
     * option, the calling thread will instead block and wait until the message
     * can be accepted.
     */
    private Boolean defaultBlockWhenFull = false;
    /**
     * Whether a thread that sends messages to a full SEDA queue will block
     * until the queue's capacity is no longer exhausted. By default, an
     * exception will be thrown stating that the queue is full. By enabling this
     * option, where a configured timeout can be added to the block case.
     * Utilizing the .offer(timeout) method of the underlining java queue
     */
    private Long defaultOfferTimeout;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public Integer getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(Integer queueSize) {
        this.queueSize = queueSize;
    }

    public Integer getConcurrentConsumers() {
        return concurrentConsumers;
    }

    public void setConcurrentConsumers(Integer concurrentConsumers) {
        this.concurrentConsumers = concurrentConsumers;
    }

    public String getDefaultQueueFactory() {
        return defaultQueueFactory;
    }

    public void setDefaultQueueFactory(String defaultQueueFactory) {
        this.defaultQueueFactory = defaultQueueFactory;
    }

    public Boolean getDefaultBlockWhenFull() {
        return defaultBlockWhenFull;
    }

    public void setDefaultBlockWhenFull(Boolean defaultBlockWhenFull) {
        this.defaultBlockWhenFull = defaultBlockWhenFull;
    }

    public Long getDefaultOfferTimeout() {
        return defaultOfferTimeout;
    }

    public void setDefaultOfferTimeout(Long defaultOfferTimeout) {
        this.defaultOfferTimeout = defaultOfferTimeout;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }
}
/*
 * Copyright 2018-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.integration.support.management;

/**
 * Perform additional configuration on {@link MessageSourceMetrics}.
 * @deprecated in favor of dimensional metrics via
 * {@link org.springframework.integration.support.management.metrics.MeterFacade}.
 * Built-in metrics will be removed in a future release.
 *
 * @author Gary Russell
 * @since 5.0.2
 *
 */
@Deprecated
@FunctionalInterface
public interface MessageSourceMetricsConfigurer {

	void configure(MessageSourceMetrics metrics, String beanName);

}

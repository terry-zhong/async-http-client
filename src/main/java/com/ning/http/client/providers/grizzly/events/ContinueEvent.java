/*
 * Copyright (c) 2012-2015 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package com.ning.http.client.providers.grizzly.events;

import com.ning.http.client.providers.grizzly.HttpTransactionContext;
import org.glassfish.grizzly.filterchain.FilterChainEvent;

// ---------------------------------------------------------- Nested Classes

public final class ContinueEvent implements FilterChainEvent {
    final HttpTransactionContext context;

    // -------------------------------------------------------- Constructors
    public ContinueEvent(final HttpTransactionContext context) {
        this.context = context;
    }

    // --------------------------------------- Methods from FilterChainEvent
    @Override
    public Object type() {
        return ContinueEvent.class;
    }

    public HttpTransactionContext getContext() {
        return context;
    }
    
} // END ContinueEvent
/*
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

package org.apache.ignite.spi.discovery.zk.internal;

import org.apache.ignite.events.EventType;

/**
 *
 */
class ZkDiscoveryNodeFailEventData extends ZkDiscoveryEventData {
    /** */
    private static final long serialVersionUID = 0L;

    /** */
    private long failedNodeInternalId;

    /**
     * @param evtId Event ID.
     * @param topVer Topology version.
     * @param failedNodeInternalId Failed node ID.
     */
    ZkDiscoveryNodeFailEventData(long evtId, long topVer, long failedNodeInternalId) {
        super(evtId, EventType.EVT_NODE_FAILED, topVer);

        this.failedNodeInternalId = failedNodeInternalId;
    }

    /**
     * @return Failed node ID.
     */
    long failedNodeInternalId() {
        return failedNodeInternalId;
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return "ZkDiscoveryNodeFailEventData [" +
            "evtId=" + eventId() +
            ", topVer=" + topologyVersion() +
            ", nodeId=" + failedNodeInternalId + ']';
    }
}

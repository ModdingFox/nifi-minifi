/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.minifi.c2.api.provider.agent;

import org.apache.nifi.minifi.c2.api.provider.PersistenceProvider;
import org.apache.nifi.minifi.c2.model.AgentManifest;

/**
 * NOTE: Although this interface is intended to be an extension point, it is not yet considered stable and thus may
 * change across releases until the the C2 Server APIs mature.
 */
public interface AgentManifestPersistenceProvider extends PersistenceProvider<AgentManifest, String> {

    /**
     * Returns all agent manifests that match the IDs.
     *
     * @param agentManifestIds ids of the manifests to retrieve
     * @return a list of manifests matching the specified ids.
     *         If an id does not result in a match, nothing will be included for that id.
     */
    Iterable<AgentManifest> getAllById(Iterable<String> agentManifestIds);

}

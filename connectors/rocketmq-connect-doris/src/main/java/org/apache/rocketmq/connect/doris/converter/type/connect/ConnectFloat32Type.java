/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.rocketmq.connect.doris.converter.type.connect;

import io.openmessaging.connector.api.data.Schema;
import org.apache.rocketmq.connect.doris.converter.type.doris.DorisType;

public class ConnectFloat32Type extends AbstractConnectSchemaType {

    public static final ConnectFloat32Type INSTANCE = new ConnectFloat32Type();

    @Override
    public String[] getRegistrationKeys() {
        return new String[] {"FLOAT32"};
    }

    @Override
    public String getTypeName(Schema schema) {
        return DorisType.FLOAT;
    }

    @Override
    public boolean isNumber() {
        return true;
    }
}

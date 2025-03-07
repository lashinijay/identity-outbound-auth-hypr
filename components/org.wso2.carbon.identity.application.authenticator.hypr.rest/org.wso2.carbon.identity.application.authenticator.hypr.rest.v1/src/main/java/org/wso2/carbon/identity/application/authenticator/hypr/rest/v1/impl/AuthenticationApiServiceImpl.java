/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.application.authenticator.hypr.rest.v1.impl;

import org.wso2.carbon.identity.application.authenticator.hypr.rest.v1.AuthenticationApiService;
import org.wso2.carbon.identity.application.authenticator.hypr.rest.v1.StatusResponse;
import org.wso2.carbon.identity.application.authenticator.hypr.rest.v1.core.ServerHYPRAuthenticatorService;

import javax.ws.rs.core.Response;

/**
 * HYPR API service implementation for /hypr/v1 endpoint.
 */
public class AuthenticationApiServiceImpl implements AuthenticationApiService {

    private final ServerHYPRAuthenticatorService serverHYPRAuthenticatorService;

    public AuthenticationApiServiceImpl() {

        serverHYPRAuthenticatorService = new ServerHYPRAuthenticatorService();
    }

    @Override
    public Response getAuthenticationStatus(String sessionKey) {

        StatusResponse statusResponse = serverHYPRAuthenticatorService.getAuthenticationStatus(sessionKey);
        return Response.ok().entity(statusResponse).build();
    }
}

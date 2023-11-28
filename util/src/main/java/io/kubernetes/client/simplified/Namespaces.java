/*
Copyright 2023 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.simplified;

import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.openapi.apis.CoreV1Api;

/*
 * This class is used to overload the CoreV1Api class methods for Namespaces.
 */
public class Namespaces {
    private CoreV1Api api;
    Namespaces(CoreV1Api api){
        this.api = api;
    }

    public V1Namespace createNamespace(V1Namespace body) throws ApiException {
        return api.createNamespace(body, null, null, null, null);
    }

    public V1Status deleteNamespace(String name) throws ApiException {
        return api.deleteNamespace(name, null, null, null, null, null, null);
    }
}

/**
 * Copyright 2016-2017 Symphony Integrations - Symphony LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.symphonyoss.integration.exception;

import javax.ws.rs.core.Response.Status;

/**
 * Created by rsanchez on 03/08/16.
 */
public abstract class  ExceptionHandler {

  protected boolean unauthorizedError(int code) {
    return Status.UNAUTHORIZED.getStatusCode() == code;
  }

  protected boolean forbiddenError(int code) {
    return Status.FORBIDDEN.getStatusCode() == code;
  }
}

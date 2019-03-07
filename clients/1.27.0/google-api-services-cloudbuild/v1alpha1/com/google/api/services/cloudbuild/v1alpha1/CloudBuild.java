/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudbuild.v1alpha1;

/**
 * Service definition for CloudBuild (v1alpha1).
 *
 * <p>
 * Creates and manages builds on Google Cloud Platform.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/cloud-build/docs/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link CloudBuildRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class CloudBuild extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.27.0 of the Cloud Build API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://cloudbuild.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public CloudBuild(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  CloudBuild(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Projects collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code CloudBuild cloudbuild = new CloudBuild(...);}
   *   {@code CloudBuild.Projects.List request = cloudbuild.projects().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Projects projects() {
    return new Projects();
  }

  /**
   * The "projects" collection of methods.
   */
  public class Projects {

    /**
     * An accessor for creating requests from the WorkerPools collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code CloudBuild cloudbuild = new CloudBuild(...);}
     *   {@code CloudBuild.WorkerPools.List request = cloudbuild.workerPools().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public WorkerPools workerPools() {
      return new WorkerPools();
    }

    /**
     * The "workerPools" collection of methods.
     */
    public class WorkerPools {

      /**
       * Creates a `WorkerPool` to run the builds, and returns the new worker pool.
       *
       * This API is experimental.
       *
       * Create a request for the method "workerPools.create".
       *
       * This request holds the parameters needed by the cloudbuild server.  After setting any optional
       * parameters, call the {@link Create#execute()} method to invoke the remote operation.
       *
       * @param parent ID of the parent project.
       * @param content the {@link com.google.api.services.cloudbuild.v1alpha1.model.WorkerPool}
       * @return the request
       */
      public Create create(java.lang.String parent, com.google.api.services.cloudbuild.v1alpha1.model.WorkerPool content) throws java.io.IOException {
        Create result = new Create(parent, content);
        initialize(result);
        return result;
      }

      public class Create extends CloudBuildRequest<com.google.api.services.cloudbuild.v1alpha1.model.WorkerPool> {

        private static final String REST_PATH = "v1alpha1/{+parent}/workerPools";

        private final java.util.regex.Pattern PARENT_PATTERN =
            java.util.regex.Pattern.compile("^projects/[^/]+$");

        /**
         * Creates a `WorkerPool` to run the builds, and returns the new worker pool.
         *
         * This API is experimental.
         *
         * Create a request for the method "workerPools.create".
         *
         * This request holds the parameters needed by the the cloudbuild server.  After setting any
         * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
         * <p> {@link
         * Create#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
         * be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param parent ID of the parent project.
         * @param content the {@link com.google.api.services.cloudbuild.v1alpha1.model.WorkerPool}
         * @since 1.13
         */
        protected Create(java.lang.String parent, com.google.api.services.cloudbuild.v1alpha1.model.WorkerPool content) {
          super(CloudBuild.this, "POST", REST_PATH, content, com.google.api.services.cloudbuild.v1alpha1.model.WorkerPool.class);
          this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^projects/[^/]+$");
          }
        }

        @Override
        public Create set$Xgafv(java.lang.String $Xgafv) {
          return (Create) super.set$Xgafv($Xgafv);
        }

        @Override
        public Create setAccessToken(java.lang.String accessToken) {
          return (Create) super.setAccessToken(accessToken);
        }

        @Override
        public Create setAlt(java.lang.String alt) {
          return (Create) super.setAlt(alt);
        }

        @Override
        public Create setCallback(java.lang.String callback) {
          return (Create) super.setCallback(callback);
        }

        @Override
        public Create setFields(java.lang.String fields) {
          return (Create) super.setFields(fields);
        }

        @Override
        public Create setKey(java.lang.String key) {
          return (Create) super.setKey(key);
        }

        @Override
        public Create setOauthToken(java.lang.String oauthToken) {
          return (Create) super.setOauthToken(oauthToken);
        }

        @Override
        public Create setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Create) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Create setQuotaUser(java.lang.String quotaUser) {
          return (Create) super.setQuotaUser(quotaUser);
        }

        @Override
        public Create setUploadType(java.lang.String uploadType) {
          return (Create) super.setUploadType(uploadType);
        }

        @Override
        public Create setUploadProtocol(java.lang.String uploadProtocol) {
          return (Create) super.setUploadProtocol(uploadProtocol);
        }

        /** ID of the parent project. */
        @com.google.api.client.util.Key
        private java.lang.String parent;

        /** ID of the parent project.
         */
        public java.lang.String getParent() {
          return parent;
        }

        /** ID of the parent project. */
        public Create setParent(java.lang.String parent) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^projects/[^/]+$");
          }
          this.parent = parent;
          return this;
        }

        @Override
        public Create set(String parameterName, Object value) {
          return (Create) super.set(parameterName, value);
        }
      }
      /**
       * Deletes a `WorkerPool` by its project ID and WorkerPool name.
       *
       * This API is experimental.
       *
       * Create a request for the method "workerPools.delete".
       *
       * This request holds the parameters needed by the cloudbuild server.  After setting any optional
       * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
       *
       * @param name The field will contain name of the resource requested, for example:
      "projects/project-1/workerPools
       *        /workerpool-name"
       * @return the request
       */
      public Delete delete(java.lang.String name) throws java.io.IOException {
        Delete result = new Delete(name);
        initialize(result);
        return result;
      }

      public class Delete extends CloudBuildRequest<com.google.api.services.cloudbuild.v1alpha1.model.Empty> {

        private static final String REST_PATH = "v1alpha1/{+name}";

        private final java.util.regex.Pattern NAME_PATTERN =
            java.util.regex.Pattern.compile("^projects/[^/]+/workerPools/[^/]+$");

        /**
         * Deletes a `WorkerPool` by its project ID and WorkerPool name.
         *
         * This API is experimental.
         *
         * Create a request for the method "workerPools.delete".
         *
         * This request holds the parameters needed by the the cloudbuild server.  After setting any
         * optional parameters, call the {@link Delete#execute()} method to invoke the remote operation.
         * <p> {@link
         * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
         * be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param name The field will contain name of the resource requested, for example:
      "projects/project-1/workerPools
       *        /workerpool-name"
         * @since 1.13
         */
        protected Delete(java.lang.String name) {
          super(CloudBuild.this, "DELETE", REST_PATH, null, com.google.api.services.cloudbuild.v1alpha1.model.Empty.class);
          this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^projects/[^/]+/workerPools/[^/]+$");
          }
        }

        @Override
        public Delete set$Xgafv(java.lang.String $Xgafv) {
          return (Delete) super.set$Xgafv($Xgafv);
        }

        @Override
        public Delete setAccessToken(java.lang.String accessToken) {
          return (Delete) super.setAccessToken(accessToken);
        }

        @Override
        public Delete setAlt(java.lang.String alt) {
          return (Delete) super.setAlt(alt);
        }

        @Override
        public Delete setCallback(java.lang.String callback) {
          return (Delete) super.setCallback(callback);
        }

        @Override
        public Delete setFields(java.lang.String fields) {
          return (Delete) super.setFields(fields);
        }

        @Override
        public Delete setKey(java.lang.String key) {
          return (Delete) super.setKey(key);
        }

        @Override
        public Delete setOauthToken(java.lang.String oauthToken) {
          return (Delete) super.setOauthToken(oauthToken);
        }

        @Override
        public Delete setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Delete) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Delete setQuotaUser(java.lang.String quotaUser) {
          return (Delete) super.setQuotaUser(quotaUser);
        }

        @Override
        public Delete setUploadType(java.lang.String uploadType) {
          return (Delete) super.setUploadType(uploadType);
        }

        @Override
        public Delete setUploadProtocol(java.lang.String uploadProtocol) {
          return (Delete) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * The field will contain name of the resource requested, for example:
         * "projects/project-1/workerPools/workerpool-name"
         */
        @com.google.api.client.util.Key
        private java.lang.String name;

        /** The field will contain name of the resource requested, for example: "projects/project-1/workerPools
       /workerpool-name"
         */
        public java.lang.String getName() {
          return name;
        }

        /**
         * The field will contain name of the resource requested, for example:
         * "projects/project-1/workerPools/workerpool-name"
         */
        public Delete setName(java.lang.String name) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^projects/[^/]+/workerPools/[^/]+$");
          }
          this.name = name;
          return this;
        }

        @Override
        public Delete set(String parameterName, Object value) {
          return (Delete) super.set(parameterName, value);
        }
      }
      /**
       * Returns information about a `WorkerPool`.
       *
       * This API is experimental.
       *
       * Create a request for the method "workerPools.get".
       *
       * This request holds the parameters needed by the cloudbuild server.  After setting any optional
       * parameters, call the {@link Get#execute()} method to invoke the remote operation.
       *
       * @param name The field will contain name of the resource requested, for example:
      "projects/project-1/workerPools
       *        /workerpool-name"
       * @return the request
       */
      public Get get(java.lang.String name) throws java.io.IOException {
        Get result = new Get(name);
        initialize(result);
        return result;
      }

      public class Get extends CloudBuildRequest<com.google.api.services.cloudbuild.v1alpha1.model.WorkerPool> {

        private static final String REST_PATH = "v1alpha1/{+name}";

        private final java.util.regex.Pattern NAME_PATTERN =
            java.util.regex.Pattern.compile("^projects/[^/]+/workerPools/[^/]+$");

        /**
         * Returns information about a `WorkerPool`.
         *
         * This API is experimental.
         *
         * Create a request for the method "workerPools.get".
         *
         * This request holds the parameters needed by the the cloudbuild server.  After setting any
         * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
         * {@link Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
         * must be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param name The field will contain name of the resource requested, for example:
      "projects/project-1/workerPools
       *        /workerpool-name"
         * @since 1.13
         */
        protected Get(java.lang.String name) {
          super(CloudBuild.this, "GET", REST_PATH, null, com.google.api.services.cloudbuild.v1alpha1.model.WorkerPool.class);
          this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^projects/[^/]+/workerPools/[^/]+$");
          }
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public Get set$Xgafv(java.lang.String $Xgafv) {
          return (Get) super.set$Xgafv($Xgafv);
        }

        @Override
        public Get setAccessToken(java.lang.String accessToken) {
          return (Get) super.setAccessToken(accessToken);
        }

        @Override
        public Get setAlt(java.lang.String alt) {
          return (Get) super.setAlt(alt);
        }

        @Override
        public Get setCallback(java.lang.String callback) {
          return (Get) super.setCallback(callback);
        }

        @Override
        public Get setFields(java.lang.String fields) {
          return (Get) super.setFields(fields);
        }

        @Override
        public Get setKey(java.lang.String key) {
          return (Get) super.setKey(key);
        }

        @Override
        public Get setOauthToken(java.lang.String oauthToken) {
          return (Get) super.setOauthToken(oauthToken);
        }

        @Override
        public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Get) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Get setQuotaUser(java.lang.String quotaUser) {
          return (Get) super.setQuotaUser(quotaUser);
        }

        @Override
        public Get setUploadType(java.lang.String uploadType) {
          return (Get) super.setUploadType(uploadType);
        }

        @Override
        public Get setUploadProtocol(java.lang.String uploadProtocol) {
          return (Get) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * The field will contain name of the resource requested, for example:
         * "projects/project-1/workerPools/workerpool-name"
         */
        @com.google.api.client.util.Key
        private java.lang.String name;

        /** The field will contain name of the resource requested, for example: "projects/project-1/workerPools
       /workerpool-name"
         */
        public java.lang.String getName() {
          return name;
        }

        /**
         * The field will contain name of the resource requested, for example:
         * "projects/project-1/workerPools/workerpool-name"
         */
        public Get setName(java.lang.String name) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^projects/[^/]+/workerPools/[^/]+$");
          }
          this.name = name;
          return this;
        }

        @Override
        public Get set(String parameterName, Object value) {
          return (Get) super.set(parameterName, value);
        }
      }
      /**
       * List project's `WorkerPool`s.
       *
       * This API is experimental.
       *
       * Create a request for the method "workerPools.list".
       *
       * This request holds the parameters needed by the cloudbuild server.  After setting any optional
       * parameters, call the {@link List#execute()} method to invoke the remote operation.
       *
       * @param parent ID of the parent project.
       * @return the request
       */
      public List list(java.lang.String parent) throws java.io.IOException {
        List result = new List(parent);
        initialize(result);
        return result;
      }

      public class List extends CloudBuildRequest<com.google.api.services.cloudbuild.v1alpha1.model.ListWorkerPoolsResponse> {

        private static final String REST_PATH = "v1alpha1/{+parent}/workerPools";

        private final java.util.regex.Pattern PARENT_PATTERN =
            java.util.regex.Pattern.compile("^projects/[^/]+$");

        /**
         * List project's `WorkerPool`s.
         *
         * This API is experimental.
         *
         * Create a request for the method "workerPools.list".
         *
         * This request holds the parameters needed by the the cloudbuild server.  After setting any
         * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
         * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
         * must be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param parent ID of the parent project.
         * @since 1.13
         */
        protected List(java.lang.String parent) {
          super(CloudBuild.this, "GET", REST_PATH, null, com.google.api.services.cloudbuild.v1alpha1.model.ListWorkerPoolsResponse.class);
          this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^projects/[^/]+$");
          }
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public List set$Xgafv(java.lang.String $Xgafv) {
          return (List) super.set$Xgafv($Xgafv);
        }

        @Override
        public List setAccessToken(java.lang.String accessToken) {
          return (List) super.setAccessToken(accessToken);
        }

        @Override
        public List setAlt(java.lang.String alt) {
          return (List) super.setAlt(alt);
        }

        @Override
        public List setCallback(java.lang.String callback) {
          return (List) super.setCallback(callback);
        }

        @Override
        public List setFields(java.lang.String fields) {
          return (List) super.setFields(fields);
        }

        @Override
        public List setKey(java.lang.String key) {
          return (List) super.setKey(key);
        }

        @Override
        public List setOauthToken(java.lang.String oauthToken) {
          return (List) super.setOauthToken(oauthToken);
        }

        @Override
        public List setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (List) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public List setQuotaUser(java.lang.String quotaUser) {
          return (List) super.setQuotaUser(quotaUser);
        }

        @Override
        public List setUploadType(java.lang.String uploadType) {
          return (List) super.setUploadType(uploadType);
        }

        @Override
        public List setUploadProtocol(java.lang.String uploadProtocol) {
          return (List) super.setUploadProtocol(uploadProtocol);
        }

        /** ID of the parent project. */
        @com.google.api.client.util.Key
        private java.lang.String parent;

        /** ID of the parent project.
         */
        public java.lang.String getParent() {
          return parent;
        }

        /** ID of the parent project. */
        public List setParent(java.lang.String parent) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^projects/[^/]+$");
          }
          this.parent = parent;
          return this;
        }

        @Override
        public List set(String parameterName, Object value) {
          return (List) super.set(parameterName, value);
        }
      }
      /**
       * Update a `WorkerPool`.
       *
       * This API is experimental.
       *
       * Create a request for the method "workerPools.patch".
       *
       * This request holds the parameters needed by the cloudbuild server.  After setting any optional
       * parameters, call the {@link Patch#execute()} method to invoke the remote operation.
       *
       * @param name The field will contain name of the resource requested, for example:
      "projects/project-1/workerPools
       *        /workerpool-name"
       * @param content the {@link com.google.api.services.cloudbuild.v1alpha1.model.WorkerPool}
       * @return the request
       */
      public Patch patch(java.lang.String name, com.google.api.services.cloudbuild.v1alpha1.model.WorkerPool content) throws java.io.IOException {
        Patch result = new Patch(name, content);
        initialize(result);
        return result;
      }

      public class Patch extends CloudBuildRequest<com.google.api.services.cloudbuild.v1alpha1.model.WorkerPool> {

        private static final String REST_PATH = "v1alpha1/{+name}";

        private final java.util.regex.Pattern NAME_PATTERN =
            java.util.regex.Pattern.compile("^projects/[^/]+/workerPools/[^/]+$");

        /**
         * Update a `WorkerPool`.
         *
         * This API is experimental.
         *
         * Create a request for the method "workerPools.patch".
         *
         * This request holds the parameters needed by the the cloudbuild server.  After setting any
         * optional parameters, call the {@link Patch#execute()} method to invoke the remote operation.
         * <p> {@link
         * Patch#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
         * be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param name The field will contain name of the resource requested, for example:
      "projects/project-1/workerPools
       *        /workerpool-name"
         * @param content the {@link com.google.api.services.cloudbuild.v1alpha1.model.WorkerPool}
         * @since 1.13
         */
        protected Patch(java.lang.String name, com.google.api.services.cloudbuild.v1alpha1.model.WorkerPool content) {
          super(CloudBuild.this, "PATCH", REST_PATH, content, com.google.api.services.cloudbuild.v1alpha1.model.WorkerPool.class);
          this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^projects/[^/]+/workerPools/[^/]+$");
          }
        }

        @Override
        public Patch set$Xgafv(java.lang.String $Xgafv) {
          return (Patch) super.set$Xgafv($Xgafv);
        }

        @Override
        public Patch setAccessToken(java.lang.String accessToken) {
          return (Patch) super.setAccessToken(accessToken);
        }

        @Override
        public Patch setAlt(java.lang.String alt) {
          return (Patch) super.setAlt(alt);
        }

        @Override
        public Patch setCallback(java.lang.String callback) {
          return (Patch) super.setCallback(callback);
        }

        @Override
        public Patch setFields(java.lang.String fields) {
          return (Patch) super.setFields(fields);
        }

        @Override
        public Patch setKey(java.lang.String key) {
          return (Patch) super.setKey(key);
        }

        @Override
        public Patch setOauthToken(java.lang.String oauthToken) {
          return (Patch) super.setOauthToken(oauthToken);
        }

        @Override
        public Patch setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Patch) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Patch setQuotaUser(java.lang.String quotaUser) {
          return (Patch) super.setQuotaUser(quotaUser);
        }

        @Override
        public Patch setUploadType(java.lang.String uploadType) {
          return (Patch) super.setUploadType(uploadType);
        }

        @Override
        public Patch setUploadProtocol(java.lang.String uploadProtocol) {
          return (Patch) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * The field will contain name of the resource requested, for example:
         * "projects/project-1/workerPools/workerpool-name"
         */
        @com.google.api.client.util.Key
        private java.lang.String name;

        /** The field will contain name of the resource requested, for example: "projects/project-1/workerPools
       /workerpool-name"
         */
        public java.lang.String getName() {
          return name;
        }

        /**
         * The field will contain name of the resource requested, for example:
         * "projects/project-1/workerPools/workerpool-name"
         */
        public Patch setName(java.lang.String name) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^projects/[^/]+/workerPools/[^/]+$");
          }
          this.name = name;
          return this;
        }

        @Override
        public Patch set(String parameterName, Object value) {
          return (Patch) super.set(parameterName, value);
        }
      }

    }
  }

  /**
   * Builder for {@link CloudBuild}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link CloudBuild}. */
    @Override
    public CloudBuild build() {
      return new CloudBuild(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link CloudBuildRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setCloudBuildRequestInitializer(
        CloudBuildRequestInitializer cloudbuildRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(cloudbuildRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}

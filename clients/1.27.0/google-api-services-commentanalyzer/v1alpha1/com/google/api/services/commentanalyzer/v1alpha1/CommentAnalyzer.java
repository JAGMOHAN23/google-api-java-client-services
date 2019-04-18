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

package com.google.api.services.commentanalyzer.v1alpha1;

/**
 * Service definition for CommentAnalyzer (v1alpha1).
 *
 * <p>
 * The Perspective Comment Analyzer API provides information about the potential impact of a comment on a conversation (e.g. it can provide a score for the "toxicity" of a comment). Users can leverage the "SuggestCommentScore" method to submit corrections to improve Perspective over time. Users can set the "doNotStore" flag to ensure that all submitted comments are automatically deleted after scores are returned.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://conversationai.github.io/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link CommentAnalyzerRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class CommentAnalyzer extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.27.0 of the Perspective Comment Analyzer API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://commentanalyzer.googleapis.com/";

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
  public CommentAnalyzer(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  CommentAnalyzer(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Comments collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code CommentAnalyzer commentanalyzer = new CommentAnalyzer(...);}
   *   {@code CommentAnalyzer.Comments.List request = commentanalyzer.comments().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Comments comments() {
    return new Comments();
  }

  /**
   * The "comments" collection of methods.
   */
  public class Comments {

    /**
     * Analyzes the provided text and returns scores for requested attributes.
     *
     * Create a request for the method "comments.analyze".
     *
     * This request holds the parameters needed by the commentanalyzer server.  After setting any
     * optional parameters, call the {@link Analyze#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.commentanalyzer.v1alpha1.model.AnalyzeCommentRequest}
     * @return the request
     */
    public Analyze analyze(com.google.api.services.commentanalyzer.v1alpha1.model.AnalyzeCommentRequest content) throws java.io.IOException {
      Analyze result = new Analyze(content);
      initialize(result);
      return result;
    }

    public class Analyze extends CommentAnalyzerRequest<com.google.api.services.commentanalyzer.v1alpha1.model.AnalyzeCommentResponse> {

      private static final String REST_PATH = "v1alpha1/comments:analyze";

      /**
       * Analyzes the provided text and returns scores for requested attributes.
       *
       * Create a request for the method "comments.analyze".
       *
       * This request holds the parameters needed by the the commentanalyzer server.  After setting any
       * optional parameters, call the {@link Analyze#execute()} method to invoke the remote operation.
       * <p> {@link
       * Analyze#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.commentanalyzer.v1alpha1.model.AnalyzeCommentRequest}
       * @since 1.13
       */
      protected Analyze(com.google.api.services.commentanalyzer.v1alpha1.model.AnalyzeCommentRequest content) {
        super(CommentAnalyzer.this, "POST", REST_PATH, content, com.google.api.services.commentanalyzer.v1alpha1.model.AnalyzeCommentResponse.class);
      }

      @Override
      public Analyze set$Xgafv(java.lang.String $Xgafv) {
        return (Analyze) super.set$Xgafv($Xgafv);
      }

      @Override
      public Analyze setAccessToken(java.lang.String accessToken) {
        return (Analyze) super.setAccessToken(accessToken);
      }

      @Override
      public Analyze setAlt(java.lang.String alt) {
        return (Analyze) super.setAlt(alt);
      }

      @Override
      public Analyze setCallback(java.lang.String callback) {
        return (Analyze) super.setCallback(callback);
      }

      @Override
      public Analyze setFields(java.lang.String fields) {
        return (Analyze) super.setFields(fields);
      }

      @Override
      public Analyze setKey(java.lang.String key) {
        return (Analyze) super.setKey(key);
      }

      @Override
      public Analyze setOauthToken(java.lang.String oauthToken) {
        return (Analyze) super.setOauthToken(oauthToken);
      }

      @Override
      public Analyze setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Analyze) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Analyze setQuotaUser(java.lang.String quotaUser) {
        return (Analyze) super.setQuotaUser(quotaUser);
      }

      @Override
      public Analyze setUploadType(java.lang.String uploadType) {
        return (Analyze) super.setUploadType(uploadType);
      }

      @Override
      public Analyze setUploadProtocol(java.lang.String uploadProtocol) {
        return (Analyze) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public Analyze set(String parameterName, Object value) {
        return (Analyze) super.set(parameterName, value);
      }
    }
    /**
     * Suggest comment scores as training data.
     *
     * Create a request for the method "comments.suggestscore".
     *
     * This request holds the parameters needed by the commentanalyzer server.  After setting any
     * optional parameters, call the {@link Suggestscore#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.commentanalyzer.v1alpha1.model.SuggestCommentScoreRequest}
     * @return the request
     */
    public Suggestscore suggestscore(com.google.api.services.commentanalyzer.v1alpha1.model.SuggestCommentScoreRequest content) throws java.io.IOException {
      Suggestscore result = new Suggestscore(content);
      initialize(result);
      return result;
    }

    public class Suggestscore extends CommentAnalyzerRequest<com.google.api.services.commentanalyzer.v1alpha1.model.SuggestCommentScoreResponse> {

      private static final String REST_PATH = "v1alpha1/comments:suggestscore";

      /**
       * Suggest comment scores as training data.
       *
       * Create a request for the method "comments.suggestscore".
       *
       * This request holds the parameters needed by the the commentanalyzer server.  After setting any
       * optional parameters, call the {@link Suggestscore#execute()} method to invoke the remote
       * operation. <p> {@link
       * Suggestscore#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.commentanalyzer.v1alpha1.model.SuggestCommentScoreRequest}
       * @since 1.13
       */
      protected Suggestscore(com.google.api.services.commentanalyzer.v1alpha1.model.SuggestCommentScoreRequest content) {
        super(CommentAnalyzer.this, "POST", REST_PATH, content, com.google.api.services.commentanalyzer.v1alpha1.model.SuggestCommentScoreResponse.class);
      }

      @Override
      public Suggestscore set$Xgafv(java.lang.String $Xgafv) {
        return (Suggestscore) super.set$Xgafv($Xgafv);
      }

      @Override
      public Suggestscore setAccessToken(java.lang.String accessToken) {
        return (Suggestscore) super.setAccessToken(accessToken);
      }

      @Override
      public Suggestscore setAlt(java.lang.String alt) {
        return (Suggestscore) super.setAlt(alt);
      }

      @Override
      public Suggestscore setCallback(java.lang.String callback) {
        return (Suggestscore) super.setCallback(callback);
      }

      @Override
      public Suggestscore setFields(java.lang.String fields) {
        return (Suggestscore) super.setFields(fields);
      }

      @Override
      public Suggestscore setKey(java.lang.String key) {
        return (Suggestscore) super.setKey(key);
      }

      @Override
      public Suggestscore setOauthToken(java.lang.String oauthToken) {
        return (Suggestscore) super.setOauthToken(oauthToken);
      }

      @Override
      public Suggestscore setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Suggestscore) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Suggestscore setQuotaUser(java.lang.String quotaUser) {
        return (Suggestscore) super.setQuotaUser(quotaUser);
      }

      @Override
      public Suggestscore setUploadType(java.lang.String uploadType) {
        return (Suggestscore) super.setUploadType(uploadType);
      }

      @Override
      public Suggestscore setUploadProtocol(java.lang.String uploadProtocol) {
        return (Suggestscore) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public Suggestscore set(String parameterName, Object value) {
        return (Suggestscore) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link CommentAnalyzer}.
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

    /** Builds a new instance of {@link CommentAnalyzer}. */
    @Override
    public CommentAnalyzer build() {
      return new CommentAnalyzer(this);
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
     * Set the {@link CommentAnalyzerRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setCommentAnalyzerRequestInitializer(
        CommentAnalyzerRequestInitializer commentanalyzerRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(commentanalyzerRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}

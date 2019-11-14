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

package com.google.api.services.datacatalog.v1beta1.model;

/**
 * Request message for SearchCatalog.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1beta1SearchCatalogRequest extends com.google.api.client.json.GenericJson {

  /**
   * Specifies the ordering of results, currently supported case-sensitive choices are:
   *
   *   * `relevance`, only supports desecending   * `last_access_timestamp [asc|desc]`, defaults to
   * descending if not     specified   * `last_modified_timestamp [asc|desc]`, defaults to
   * descending if not     specified
   *
   * If not specified, defaults to `relevance` descending.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orderBy;

  /**
   * Number of results in the search page. If <=0 then defaults to 10. Max limit for page_size is
   * 1000. Throws an invalid argument for page_size > 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * Optional. Pagination token returned in an earlier SearchCatalogResponse.next_page_token, which
   * indicates that this is a continuation of a prior SearchCatalogRequest call, and that the system
   * should return the next page of data. If empty, the first page is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Required. The query string in search query syntax. The query must be non-empty.
   *
   * Query strings can be simple as "x" or more qualified as:
   *
   * * name:x * column:x * description:y
   *
   * Note: Query tokens need to have a minimum of 3 characters for substring matching to work
   * correctly. See [Data Catalog Search Syntax](/data-catalog/docs/how-to/search-reference) for
   * more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * Required. The scope of this search request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope scope;

  /**
   * Specifies the ordering of results, currently supported case-sensitive choices are:
   *
   *   * `relevance`, only supports desecending   * `last_access_timestamp [asc|desc]`, defaults to
   * descending if not     specified   * `last_modified_timestamp [asc|desc]`, defaults to
   * descending if not     specified
   *
   * If not specified, defaults to `relevance` descending.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrderBy() {
    return orderBy;
  }

  /**
   * Specifies the ordering of results, currently supported case-sensitive choices are:
   *
   *   * `relevance`, only supports desecending   * `last_access_timestamp [asc|desc]`, defaults to
   * descending if not     specified   * `last_modified_timestamp [asc|desc]`, defaults to
   * descending if not     specified
   *
   * If not specified, defaults to `relevance` descending.
   * @param orderBy orderBy or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SearchCatalogRequest setOrderBy(java.lang.String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * Number of results in the search page. If <=0 then defaults to 10. Max limit for page_size is
   * 1000. Throws an invalid argument for page_size > 1000.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Number of results in the search page. If <=0 then defaults to 10. Max limit for page_size is
   * 1000. Throws an invalid argument for page_size > 1000.
   * @param pageSize pageSize or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SearchCatalogRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Optional. Pagination token returned in an earlier SearchCatalogResponse.next_page_token, which
   * indicates that this is a continuation of a prior SearchCatalogRequest call, and that the system
   * should return the next page of data. If empty, the first page is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * Optional. Pagination token returned in an earlier SearchCatalogResponse.next_page_token, which
   * indicates that this is a continuation of a prior SearchCatalogRequest call, and that the system
   * should return the next page of data. If empty, the first page is returned.
   * @param pageToken pageToken or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SearchCatalogRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Required. The query string in search query syntax. The query must be non-empty.
   *
   * Query strings can be simple as "x" or more qualified as:
   *
   * * name:x * column:x * description:y
   *
   * Note: Query tokens need to have a minimum of 3 characters for substring matching to work
   * correctly. See [Data Catalog Search Syntax](/data-catalog/docs/how-to/search-reference) for
   * more information.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * Required. The query string in search query syntax. The query must be non-empty.
   *
   * Query strings can be simple as "x" or more qualified as:
   *
   * * name:x * column:x * description:y
   *
   * Note: Query tokens need to have a minimum of 3 characters for substring matching to work
   * correctly. See [Data Catalog Search Syntax](/data-catalog/docs/how-to/search-reference) for
   * more information.
   * @param query query or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SearchCatalogRequest setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * Required. The scope of this search request.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope getScope() {
    return scope;
  }

  /**
   * Required. The scope of this search request.
   * @param scope scope or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SearchCatalogRequest setScope(GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope scope) {
    this.scope = scope;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1beta1SearchCatalogRequest set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1beta1SearchCatalogRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1beta1SearchCatalogRequest clone() {
    return (GoogleCloudDatacatalogV1beta1SearchCatalogRequest) super.clone();
  }

}

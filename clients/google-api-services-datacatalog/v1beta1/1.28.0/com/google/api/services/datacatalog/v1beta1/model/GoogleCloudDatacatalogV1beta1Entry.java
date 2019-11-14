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
 * Entry Metadata. A Data Catalog Entry resource represents another resource in Google Cloud
 * Platform, such as a BigQuery dataset or a Cloud Pub/Sub topic. Clients can use the
 * `linked_resource` field in the Entry resource to refer to the original resource ID of the source
 * system.
 *
 * An Entry resource contains resource details, such as its schema. An Entry can also be used to
 * attach flexible metadata, such as a Tag.
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
public final class GoogleCloudDatacatalogV1beta1Entry extends com.google.api.client.json.GenericJson {

  /**
   * Specification for a group of BigQuery tables with name pattern `[prefix]YYYYMMDD`. Context:
   * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec bigqueryDateShardedSpec;

  /**
   * Specification that applies to a BigQuery table. This is only valid on entries of type `TABLE`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1beta1BigQueryTableSpec bigqueryTableSpec;

  /**
   * Entry description, which can consist of several sentences or paragraphs that describe entry
   * contents. Default value is an empty string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Display information such as title and description. A short name to identify the entry, for
   * example, "Analytics Data - Jan 2011". Default value is an empty string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Specification that applies to a Cloud Storage fileset. This is only valid on entries of type
   * FILESET.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1beta1GcsFilesetSpec gcsFilesetSpec;

  /**
   * Output only. The resource this metadata entry refers to.
   *
   * For Google Cloud Platform resources, `linked_resource` is the [full name of the
   * resource](https://cloud.google.com/apis/design/resource_names#full_resource_name). For example,
   * the `linked_resource` for a table resource from BigQuery is:
   *
   * * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkedResource;

  /**
   * The Data Catalog resource name of the entry in URL format. Example:
   *
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id}
   *
   * Note that this Entry and its child resources may not actually be stored in the location in this
   * name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Schema of the entry. An entry might not have any schema attached to it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1beta1Schema schema;

  /**
   * Output only. Timestamps about the underlying Google Cloud Platform resource, not about this
   * Data Catalog Entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1beta1SystemTimestamps sourceSystemTimestamps;

  /**
   * The type of the entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Specification for a group of BigQuery tables with name pattern `[prefix]YYYYMMDD`. Context:
   * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec getBigqueryDateShardedSpec() {
    return bigqueryDateShardedSpec;
  }

  /**
   * Specification for a group of BigQuery tables with name pattern `[prefix]YYYYMMDD`. Context:
   * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
   * @param bigqueryDateShardedSpec bigqueryDateShardedSpec or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1Entry setBigqueryDateShardedSpec(GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpec bigqueryDateShardedSpec) {
    this.bigqueryDateShardedSpec = bigqueryDateShardedSpec;
    return this;
  }

  /**
   * Specification that applies to a BigQuery table. This is only valid on entries of type `TABLE`.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1BigQueryTableSpec getBigqueryTableSpec() {
    return bigqueryTableSpec;
  }

  /**
   * Specification that applies to a BigQuery table. This is only valid on entries of type `TABLE`.
   * @param bigqueryTableSpec bigqueryTableSpec or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1Entry setBigqueryTableSpec(GoogleCloudDatacatalogV1beta1BigQueryTableSpec bigqueryTableSpec) {
    this.bigqueryTableSpec = bigqueryTableSpec;
    return this;
  }

  /**
   * Entry description, which can consist of several sentences or paragraphs that describe entry
   * contents. Default value is an empty string.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Entry description, which can consist of several sentences or paragraphs that describe entry
   * contents. Default value is an empty string.
   * @param description description or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1Entry setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Display information such as title and description. A short name to identify the entry, for
   * example, "Analytics Data - Jan 2011". Default value is an empty string.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display information such as title and description. A short name to identify the entry, for
   * example, "Analytics Data - Jan 2011". Default value is an empty string.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1Entry setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Specification that applies to a Cloud Storage fileset. This is only valid on entries of type
   * FILESET.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1GcsFilesetSpec getGcsFilesetSpec() {
    return gcsFilesetSpec;
  }

  /**
   * Specification that applies to a Cloud Storage fileset. This is only valid on entries of type
   * FILESET.
   * @param gcsFilesetSpec gcsFilesetSpec or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1Entry setGcsFilesetSpec(GoogleCloudDatacatalogV1beta1GcsFilesetSpec gcsFilesetSpec) {
    this.gcsFilesetSpec = gcsFilesetSpec;
    return this;
  }

  /**
   * Output only. The resource this metadata entry refers to.
   *
   * For Google Cloud Platform resources, `linked_resource` is the [full name of the
   * resource](https://cloud.google.com/apis/design/resource_names#full_resource_name). For example,
   * the `linked_resource` for a table resource from BigQuery is:
   *
   * * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkedResource() {
    return linkedResource;
  }

  /**
   * Output only. The resource this metadata entry refers to.
   *
   * For Google Cloud Platform resources, `linked_resource` is the [full name of the
   * resource](https://cloud.google.com/apis/design/resource_names#full_resource_name). For example,
   * the `linked_resource` for a table resource from BigQuery is:
   *
   * * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
   * @param linkedResource linkedResource or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1Entry setLinkedResource(java.lang.String linkedResource) {
    this.linkedResource = linkedResource;
    return this;
  }

  /**
   * The Data Catalog resource name of the entry in URL format. Example:
   *
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id}
   *
   * Note that this Entry and its child resources may not actually be stored in the location in this
   * name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The Data Catalog resource name of the entry in URL format. Example:
   *
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id}
   *
   * Note that this Entry and its child resources may not actually be stored in the location in this
   * name.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1Entry setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Schema of the entry. An entry might not have any schema attached to it.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1Schema getSchema() {
    return schema;
  }

  /**
   * Schema of the entry. An entry might not have any schema attached to it.
   * @param schema schema or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1Entry setSchema(GoogleCloudDatacatalogV1beta1Schema schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Output only. Timestamps about the underlying Google Cloud Platform resource, not about this
   * Data Catalog Entry.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SystemTimestamps getSourceSystemTimestamps() {
    return sourceSystemTimestamps;
  }

  /**
   * Output only. Timestamps about the underlying Google Cloud Platform resource, not about this
   * Data Catalog Entry.
   * @param sourceSystemTimestamps sourceSystemTimestamps or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1Entry setSourceSystemTimestamps(GoogleCloudDatacatalogV1beta1SystemTimestamps sourceSystemTimestamps) {
    this.sourceSystemTimestamps = sourceSystemTimestamps;
    return this;
  }

  /**
   * The type of the entry.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the entry.
   * @param type type or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1Entry setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1beta1Entry set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1beta1Entry) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1beta1Entry clone() {
    return (GoogleCloudDatacatalogV1beta1Entry) super.clone();
  }

}

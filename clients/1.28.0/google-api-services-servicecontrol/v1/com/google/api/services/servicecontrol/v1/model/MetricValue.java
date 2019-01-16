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

package com.google.api.services.servicecontrol.v1.model;

/**
 * Represents a single metric value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MetricValue extends com.google.api.client.json.GenericJson {

  /**
   * A boolean value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean boolValue;

  /**
   * A distribution value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Distribution distributionValue;

  /**
   * A double precision floating point value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double doubleValue;

  /**
   * The end of the time period over which this metric value's measurement applies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * A signed 64-bit integer value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long int64Value;

  /**
   * The labels describing the metric value. See comments on
   * google.api.servicecontrol.v1.Operation.labels for the overriding relationship.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * A money value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money moneyValue;

  /**
   * The start of the time period over which this metric value's measurement applies. The time
   * period has different semantics for different metric types (cumulative, delta, and gauge). See
   * the metric definition documentation in the service configuration for details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * A text string value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stringValue;

  /**
   * A boolean value.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBoolValue() {
    return boolValue;
  }

  /**
   * A boolean value.
   * @param boolValue boolValue or {@code null} for none
   */
  public MetricValue setBoolValue(java.lang.Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

  /**
   * A distribution value.
   * @return value or {@code null} for none
   */
  public Distribution getDistributionValue() {
    return distributionValue;
  }

  /**
   * A distribution value.
   * @param distributionValue distributionValue or {@code null} for none
   */
  public MetricValue setDistributionValue(Distribution distributionValue) {
    this.distributionValue = distributionValue;
    return this;
  }

  /**
   * A double precision floating point value.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDoubleValue() {
    return doubleValue;
  }

  /**
   * A double precision floating point value.
   * @param doubleValue doubleValue or {@code null} for none
   */
  public MetricValue setDoubleValue(java.lang.Double doubleValue) {
    this.doubleValue = doubleValue;
    return this;
  }

  /**
   * The end of the time period over which this metric value's measurement applies.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The end of the time period over which this metric value's measurement applies.
   * @param endTime endTime or {@code null} for none
   */
  public MetricValue setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * A signed 64-bit integer value.
   * @return value or {@code null} for none
   */
  public java.lang.Long getInt64Value() {
    return int64Value;
  }

  /**
   * A signed 64-bit integer value.
   * @param int64Value int64Value or {@code null} for none
   */
  public MetricValue setInt64Value(java.lang.Long int64Value) {
    this.int64Value = int64Value;
    return this;
  }

  /**
   * The labels describing the metric value. See comments on
   * google.api.servicecontrol.v1.Operation.labels for the overriding relationship.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The labels describing the metric value. See comments on
   * google.api.servicecontrol.v1.Operation.labels for the overriding relationship.
   * @param labels labels or {@code null} for none
   */
  public MetricValue setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * A money value.
   * @return value or {@code null} for none
   */
  public Money getMoneyValue() {
    return moneyValue;
  }

  /**
   * A money value.
   * @param moneyValue moneyValue or {@code null} for none
   */
  public MetricValue setMoneyValue(Money moneyValue) {
    this.moneyValue = moneyValue;
    return this;
  }

  /**
   * The start of the time period over which this metric value's measurement applies. The time
   * period has different semantics for different metric types (cumulative, delta, and gauge). See
   * the metric definition documentation in the service configuration for details.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The start of the time period over which this metric value's measurement applies. The time
   * period has different semantics for different metric types (cumulative, delta, and gauge). See
   * the metric definition documentation in the service configuration for details.
   * @param startTime startTime or {@code null} for none
   */
  public MetricValue setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * A text string value.
   * @return value or {@code null} for none
   */
  public java.lang.String getStringValue() {
    return stringValue;
  }

  /**
   * A text string value.
   * @param stringValue stringValue or {@code null} for none
   */
  public MetricValue setStringValue(java.lang.String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  @Override
  public MetricValue set(String fieldName, Object value) {
    return (MetricValue) super.set(fieldName, value);
  }

  @Override
  public MetricValue clone() {
    return (MetricValue) super.clone();
  }

}
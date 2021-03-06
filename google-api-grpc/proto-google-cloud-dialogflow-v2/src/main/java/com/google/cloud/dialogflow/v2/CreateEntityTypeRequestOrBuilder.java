// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/entity_type.proto

package com.google.cloud.dialogflow.v2;

public interface CreateEntityTypeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.CreateEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The agent to create a entity type for.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The agent to create a entity type for.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The entity type to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EntityType entity_type = 2;</code>
   */
  boolean hasEntityType();
  /**
   *
   *
   * <pre>
   * Required. The entity type to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EntityType entity_type = 2;</code>
   */
  com.google.cloud.dialogflow.v2.EntityType getEntityType();
  /**
   *
   *
   * <pre>
   * Required. The entity type to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EntityType entity_type = 2;</code>
   */
  com.google.cloud.dialogflow.v2.EntityTypeOrBuilder getEntityTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The language of entity synonyms defined in `entity_type`. If not
   * specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language)
   * are supported. Note: languages must be enabled in the agent before they can
   * be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The language of entity synonyms defined in `entity_type`. If not
   * specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language)
   * are supported. Note: languages must be enabled in the agent before they can
   * be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}

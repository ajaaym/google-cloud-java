// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation_spec_set.proto

package com.google.cloud.datalabeling.v1beta1;

public interface AnnotationSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.AnnotationSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The display name of the AnnotationSpec. Maximum of 64 characters.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The display name of the AnnotationSpec. Maximum of 64 characters.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. User-provided description of the annotation specification.
   * The description can be up to 10000 characters long.
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. User-provided description of the annotation specification.
   * The description can be up to 10000 characters long.
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}

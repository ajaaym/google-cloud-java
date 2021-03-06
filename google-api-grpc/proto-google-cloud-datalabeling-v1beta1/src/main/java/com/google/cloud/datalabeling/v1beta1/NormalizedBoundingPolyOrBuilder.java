// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation.proto

package com.google.cloud.datalabeling.v1beta1;

public interface NormalizedBoundingPolyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.NormalizedBoundingPoly)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;
   * </code>
   */
  java.util.List<com.google.cloud.datalabeling.v1beta1.NormalizedVertex>
      getNormalizedVerticesList();
  /**
   *
   *
   * <pre>
   * The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.NormalizedVertex getNormalizedVertices(int index);
  /**
   *
   *
   * <pre>
   * The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;
   * </code>
   */
  int getNormalizedVerticesCount();
  /**
   *
   *
   * <pre>
   * The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.datalabeling.v1beta1.NormalizedVertexOrBuilder>
      getNormalizedVerticesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.NormalizedVertexOrBuilder getNormalizedVerticesOrBuilder(
      int index);
}

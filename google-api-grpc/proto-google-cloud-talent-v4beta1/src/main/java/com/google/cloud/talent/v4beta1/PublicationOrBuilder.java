// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/profile.proto

package com.google.cloud.talent.v4beta1;

public interface PublicationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.Publication)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A list of author names.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>repeated string authors = 1;</code>
   */
  java.util.List<java.lang.String> getAuthorsList();
  /**
   *
   *
   * <pre>
   * Optional. A list of author names.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>repeated string authors = 1;</code>
   */
  int getAuthorsCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of author names.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>repeated string authors = 1;</code>
   */
  java.lang.String getAuthors(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of author names.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>repeated string authors = 1;</code>
   */
  com.google.protobuf.ByteString getAuthorsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The title of the publication.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string title = 2;</code>
   */
  java.lang.String getTitle();
  /**
   *
   *
   * <pre>
   * Optional. The title of the publication.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string title = 2;</code>
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * Optional. The description of the publication.
   * Number of characters allowed is 100,000.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. The description of the publication.
   * Number of characters allowed is 100,000.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The journal name of the publication.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string journal = 4;</code>
   */
  java.lang.String getJournal();
  /**
   *
   *
   * <pre>
   * Optional. The journal name of the publication.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string journal = 4;</code>
   */
  com.google.protobuf.ByteString getJournalBytes();

  /**
   *
   *
   * <pre>
   * Optional. Volume number.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string volume = 5;</code>
   */
  java.lang.String getVolume();
  /**
   *
   *
   * <pre>
   * Optional. Volume number.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string volume = 5;</code>
   */
  com.google.protobuf.ByteString getVolumeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The publisher of the journal.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string publisher = 6;</code>
   */
  java.lang.String getPublisher();
  /**
   *
   *
   * <pre>
   * Optional. The publisher of the journal.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string publisher = 6;</code>
   */
  com.google.protobuf.ByteString getPublisherBytes();

  /**
   *
   *
   * <pre>
   * Optional. The publication date.
   * </pre>
   *
   * <code>.google.type.Date publication_date = 7;</code>
   */
  boolean hasPublicationDate();
  /**
   *
   *
   * <pre>
   * Optional. The publication date.
   * </pre>
   *
   * <code>.google.type.Date publication_date = 7;</code>
   */
  com.google.type.Date getPublicationDate();
  /**
   *
   *
   * <pre>
   * Optional. The publication date.
   * </pre>
   *
   * <code>.google.type.Date publication_date = 7;</code>
   */
  com.google.type.DateOrBuilder getPublicationDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The publication type.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string publication_type = 8;</code>
   */
  java.lang.String getPublicationType();
  /**
   *
   *
   * <pre>
   * Optional. The publication type.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string publication_type = 8;</code>
   */
  com.google.protobuf.ByteString getPublicationTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. ISBN number.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string isbn = 9;</code>
   */
  java.lang.String getIsbn();
  /**
   *
   *
   * <pre>
   * Optional. ISBN number.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string isbn = 9;</code>
   */
  com.google.protobuf.ByteString getIsbnBytes();
}

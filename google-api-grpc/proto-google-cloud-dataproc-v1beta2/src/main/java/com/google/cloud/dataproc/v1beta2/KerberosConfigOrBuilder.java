// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/clusters.proto

package com.google.cloud.dataproc.v1beta2;

public interface KerberosConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.KerberosConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Flag to indicate whether to Kerberize the cluster.
   * </pre>
   *
   * <code>bool enable_kerberos = 1;</code>
   */
  boolean getEnableKerberos();

  /**
   *
   *
   * <pre>
   * Required. The Cloud Storage URI of a KMS encrypted file containing the root
   * principal password.
   * </pre>
   *
   * <code>string root_principal_password_uri = 2;</code>
   */
  java.lang.String getRootPrincipalPasswordUri();
  /**
   *
   *
   * <pre>
   * Required. The Cloud Storage URI of a KMS encrypted file containing the root
   * principal password.
   * </pre>
   *
   * <code>string root_principal_password_uri = 2;</code>
   */
  com.google.protobuf.ByteString getRootPrincipalPasswordUriBytes();

  /**
   *
   *
   * <pre>
   * Required. The uri of the KMS key used to encrypt various sensitive
   * files.
   * </pre>
   *
   * <code>string kms_key_uri = 3;</code>
   */
  java.lang.String getKmsKeyUri();
  /**
   *
   *
   * <pre>
   * Required. The uri of the KMS key used to encrypt various sensitive
   * files.
   * </pre>
   *
   * <code>string kms_key_uri = 3;</code>
   */
  com.google.protobuf.ByteString getKmsKeyUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of the keystore file used for SSL
   * encryption. If not provided, Dataproc will provide a self-signed
   * certificate.
   * </pre>
   *
   * <code>string keystore_uri = 4;</code>
   */
  java.lang.String getKeystoreUri();
  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of the keystore file used for SSL
   * encryption. If not provided, Dataproc will provide a self-signed
   * certificate.
   * </pre>
   *
   * <code>string keystore_uri = 4;</code>
   */
  com.google.protobuf.ByteString getKeystoreUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of the truststore file used for SSL
   * encryption. If not provided, Dataproc will provide a self-signed
   * certificate.
   * </pre>
   *
   * <code>string truststore_uri = 5;</code>
   */
  java.lang.String getTruststoreUri();
  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of the truststore file used for SSL
   * encryption. If not provided, Dataproc will provide a self-signed
   * certificate.
   * </pre>
   *
   * <code>string truststore_uri = 5;</code>
   */
  com.google.protobuf.ByteString getTruststoreUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * password to the user provided keystore. For the self-signed certificate,
   * this password is generated by Dataproc.
   * </pre>
   *
   * <code>string keystore_password_uri = 6;</code>
   */
  java.lang.String getKeystorePasswordUri();
  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * password to the user provided keystore. For the self-signed certificate,
   * this password is generated by Dataproc.
   * </pre>
   *
   * <code>string keystore_password_uri = 6;</code>
   */
  com.google.protobuf.ByteString getKeystorePasswordUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * password to the user provided key. For the self-signed certificate, this
   * password is generated by Dataproc.
   * </pre>
   *
   * <code>string key_password_uri = 7;</code>
   */
  java.lang.String getKeyPasswordUri();
  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * password to the user provided key. For the self-signed certificate, this
   * password is generated by Dataproc.
   * </pre>
   *
   * <code>string key_password_uri = 7;</code>
   */
  com.google.protobuf.ByteString getKeyPasswordUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * password to the user provided truststore. For the self-signed certificate,
   * this password is generated by Dataproc.
   * </pre>
   *
   * <code>string truststore_password_uri = 8;</code>
   */
  java.lang.String getTruststorePasswordUri();
  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * password to the user provided truststore. For the self-signed certificate,
   * this password is generated by Dataproc.
   * </pre>
   *
   * <code>string truststore_password_uri = 8;</code>
   */
  com.google.protobuf.ByteString getTruststorePasswordUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The remote realm the Dataproc on-cluster KDC will trust, should
   * the user enable cross realm trust.
   * </pre>
   *
   * <code>string cross_realm_trust_realm = 9;</code>
   */
  java.lang.String getCrossRealmTrustRealm();
  /**
   *
   *
   * <pre>
   * Optional. The remote realm the Dataproc on-cluster KDC will trust, should
   * the user enable cross realm trust.
   * </pre>
   *
   * <code>string cross_realm_trust_realm = 9;</code>
   */
  com.google.protobuf.ByteString getCrossRealmTrustRealmBytes();

  /**
   *
   *
   * <pre>
   * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross
   * realm trust relationship.
   * </pre>
   *
   * <code>string cross_realm_trust_kdc = 10;</code>
   */
  java.lang.String getCrossRealmTrustKdc();
  /**
   *
   *
   * <pre>
   * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross
   * realm trust relationship.
   * </pre>
   *
   * <code>string cross_realm_trust_kdc = 10;</code>
   */
  com.google.protobuf.ByteString getCrossRealmTrustKdcBytes();

  /**
   *
   *
   * <pre>
   * Optional. The admin server (IP or hostname) for the remote trusted realm in
   * a cross realm trust relationship.
   * </pre>
   *
   * <code>string cross_realm_trust_admin_server = 11;</code>
   */
  java.lang.String getCrossRealmTrustAdminServer();
  /**
   *
   *
   * <pre>
   * Optional. The admin server (IP or hostname) for the remote trusted realm in
   * a cross realm trust relationship.
   * </pre>
   *
   * <code>string cross_realm_trust_admin_server = 11;</code>
   */
  com.google.protobuf.ByteString getCrossRealmTrustAdminServerBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * shared password between the on-cluster Kerberos realm and the remote
   * trusted realm, in a cross realm trust relationship.
   * </pre>
   *
   * <code>string cross_realm_trust_shared_password_uri = 12;</code>
   */
  java.lang.String getCrossRealmTrustSharedPasswordUri();
  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * shared password between the on-cluster Kerberos realm and the remote
   * trusted realm, in a cross realm trust relationship.
   * </pre>
   *
   * <code>string cross_realm_trust_shared_password_uri = 12;</code>
   */
  com.google.protobuf.ByteString getCrossRealmTrustSharedPasswordUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * master key of the KDC database.
   * </pre>
   *
   * <code>string kdc_db_key_uri = 13;</code>
   */
  java.lang.String getKdcDbKeyUri();
  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * master key of the KDC database.
   * </pre>
   *
   * <code>string kdc_db_key_uri = 13;</code>
   */
  com.google.protobuf.ByteString getKdcDbKeyUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The lifetime of the ticket granting ticket, in hours.
   * If not specified, or user specifies 0, then default value 10
   * will be used.
   * </pre>
   *
   * <code>int32 tgt_lifetime_hours = 14;</code>
   */
  int getTgtLifetimeHours();
}

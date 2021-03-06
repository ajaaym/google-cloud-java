/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import static com.google.cloud.compute.v1.AcceleratorTypeClient.AggregatedListAcceleratorTypesPagedResponse;
import static com.google.cloud.compute.v1.AcceleratorTypeClient.ListAcceleratorTypesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.compute.v1.stub.AcceleratorTypeStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link AcceleratorTypeClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (https://www.googleapis.com/compute/v1/projects/) and default
 *       port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getAcceleratorType to 30 seconds:
 *
 * <pre>
 * <code>
 * AcceleratorTypeSettings.Builder acceleratorTypeSettingsBuilder =
 *     AcceleratorTypeSettings.newBuilder();
 * acceleratorTypeSettingsBuilder.getAcceleratorTypeSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * AcceleratorTypeSettings acceleratorTypeSettings = acceleratorTypeSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AcceleratorTypeSettings extends ClientSettings<AcceleratorTypeSettings> {
  /** Returns the object with the settings used for calls to aggregatedListAcceleratorTypes. */
  public PagedCallSettings<
          AggregatedListAcceleratorTypesHttpRequest,
          AcceleratorTypeAggregatedList,
          AggregatedListAcceleratorTypesPagedResponse>
      aggregatedListAcceleratorTypesSettings() {
    return ((AcceleratorTypeStubSettings) getStubSettings())
        .aggregatedListAcceleratorTypesSettings();
  }

  /** Returns the object with the settings used for calls to getAcceleratorType. */
  public UnaryCallSettings<GetAcceleratorTypeHttpRequest, AcceleratorType>
      getAcceleratorTypeSettings() {
    return ((AcceleratorTypeStubSettings) getStubSettings()).getAcceleratorTypeSettings();
  }

  /** Returns the object with the settings used for calls to listAcceleratorTypes. */
  public PagedCallSettings<
          ListAcceleratorTypesHttpRequest, AcceleratorTypeList, ListAcceleratorTypesPagedResponse>
      listAcceleratorTypesSettings() {
    return ((AcceleratorTypeStubSettings) getStubSettings()).listAcceleratorTypesSettings();
  }

  public static final AcceleratorTypeSettings create(AcceleratorTypeStubSettings stub)
      throws IOException {
    return new AcceleratorTypeSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return AcceleratorTypeStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return AcceleratorTypeStubSettings.getDefaultEndpoint();
  }
  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return AcceleratorTypeStubSettings.getDefaultServicePort();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return AcceleratorTypeStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return AcceleratorTypeStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return AcceleratorTypeStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return AcceleratorTypeStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return AcceleratorTypeStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected AcceleratorTypeSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for AcceleratorTypeSettings. */
  public static class Builder extends ClientSettings.Builder<AcceleratorTypeSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(AcceleratorTypeStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(AcceleratorTypeStubSettings.newBuilder());
    }

    protected Builder(AcceleratorTypeSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(AcceleratorTypeStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public AcceleratorTypeStubSettings.Builder getStubSettingsBuilder() {
      return ((AcceleratorTypeStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to aggregatedListAcceleratorTypes. */
    public PagedCallSettings.Builder<
            AggregatedListAcceleratorTypesHttpRequest,
            AcceleratorTypeAggregatedList,
            AggregatedListAcceleratorTypesPagedResponse>
        aggregatedListAcceleratorTypesSettings() {
      return getStubSettingsBuilder().aggregatedListAcceleratorTypesSettings();
    }

    /** Returns the builder for the settings used for calls to getAcceleratorType. */
    public UnaryCallSettings.Builder<GetAcceleratorTypeHttpRequest, AcceleratorType>
        getAcceleratorTypeSettings() {
      return getStubSettingsBuilder().getAcceleratorTypeSettings();
    }

    /** Returns the builder for the settings used for calls to listAcceleratorTypes. */
    public PagedCallSettings.Builder<
            ListAcceleratorTypesHttpRequest, AcceleratorTypeList, ListAcceleratorTypesPagedResponse>
        listAcceleratorTypesSettings() {
      return getStubSettingsBuilder().listAcceleratorTypesSettings();
    }

    @Override
    public AcceleratorTypeSettings build() throws IOException {
      return new AcceleratorTypeSettings(this);
    }
  }
}

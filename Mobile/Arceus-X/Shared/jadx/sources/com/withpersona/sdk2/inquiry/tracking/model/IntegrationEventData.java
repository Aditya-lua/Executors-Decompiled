package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0006\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "state", "Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;", "url", "", "isAuthTabEnabled", "", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;Ljava/lang/String;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getState", "()Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;", "getUrl", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "copy", "(Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;Ljava/lang/String;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;", "equals", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final /* data */ class IntegrationEventData implements TrackingEventData {

    @Nullable
    private final Boolean isAuthTabEnabled;

    @Nullable
    private final TrackingMetadata metadata;

    @Nullable
    private final IntegrationState state;

    @Nullable
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public IntegrationEventData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ IntegrationEventData copy$default(IntegrationEventData integrationEventData, IntegrationState integrationState, String str, Boolean bool, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            integrationState = integrationEventData.state;
        }
        if ((i10 & 2) != 0) {
            str = integrationEventData.url;
        }
        if ((i10 & 4) != 0) {
            bool = integrationEventData.isAuthTabEnabled;
        }
        if ((i10 & 8) != 0) {
            trackingMetadata = integrationEventData.metadata;
        }
        return integrationEventData.copy(integrationState, str, bool, trackingMetadata);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IntegrationState getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsAuthTabEnabled() {
        return this.isAuthTabEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final IntegrationEventData copy(@Nullable IntegrationState state, @Nullable String url, @Nullable Boolean isAuthTabEnabled, @Nullable TrackingMetadata metadata) {
        return new IntegrationEventData(state, url, isAuthTabEnabled, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegrationEventData)) {
            return false;
        }
        IntegrationEventData integrationEventData = (IntegrationEventData) other;
        return this.state == integrationEventData.state && Intrinsics.m31980c(this.url, integrationEventData.url) && Intrinsics.m31980c(this.isAuthTabEnabled, integrationEventData.isAuthTabEnabled) && Intrinsics.m31980c(this.metadata, integrationEventData.metadata);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    @Nullable
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final IntegrationState getState() {
        return this.state;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        IntegrationState integrationState = this.state;
        int iHashCode = (integrationState == null ? 0 : integrationState.hashCode()) * 31;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isAuthTabEnabled;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode3 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAuthTabEnabled() {
        return this.isAuthTabEnabled;
    }

    @NotNull
    public String toString() {
        return "IntegrationEventData(state=" + this.state + ", url=" + this.url + ", isAuthTabEnabled=" + this.isAuthTabEnabled + ", metadata=" + this.metadata + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public IntegrationEventData(@Nullable IntegrationState integrationState, @Nullable String str, @Nullable Boolean bool, @Nullable TrackingMetadata trackingMetadata) {
        this.state = integrationState;
        this.url = str;
        this.isAuthTabEnabled = bool;
        this.metadata = trackingMetadata;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
      (wrap com.withpersona.sdk2.inquiry.tracking.model.IntegrationState:?: TERNARY null = ((wrap int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.IntegrationState) : (r2v0 com.withpersona.sdk2.inquiry.tracking.model.IntegrationState))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
      (wrap com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata:?: TERNARY null = ((wrap int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata) : (r5v0 com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata))
     A[MD:(com.withpersona.sdk2.inquiry.tracking.model.IntegrationState, java.lang.String, java.lang.Boolean, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void (m)] (LINE:7) call: com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData.<init>(com.withpersona.sdk2.inquiry.tracking.model.IntegrationState, java.lang.String, java.lang.Boolean, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void type: THIS */
    public /* synthetic */ IntegrationEventData(IntegrationState integrationState, String str, Boolean bool, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : integrationState, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : trackingMetadata);
    }
}

package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.g;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J^\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "phase", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;", "status", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanStatus;", "durationMs", "", "authMethod", "", "chipAuthStatus", "dataGroupType", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getPhase", "()Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;", "getStatus", "()Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanStatus;", "getDurationMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAuthMethod", "()Ljava/lang/String;", "getChipAuthStatus", "getDataGroupType", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final /* data */ class NfcScanEventData implements TrackingEventData {

    @Nullable
    private final String authMethod;

    @Nullable
    private final String chipAuthStatus;

    @Nullable
    private final String dataGroupType;

    @Nullable
    private final Long durationMs;

    @Nullable
    private final TrackingMetadata metadata;

    @NotNull
    private final NfcScanPhase phase;

    @NotNull
    private final NfcScanStatus status;

    public NfcScanEventData(@NotNull NfcScanPhase nfcScanPhase, @NotNull NfcScanStatus nfcScanStatus, @g(name = "duration_ms") @Nullable Long l10, @g(name = "auth_method") @Nullable String str, @g(name = "chip_auth_status") @Nullable String str2, @g(name = "data_group_type") @Nullable String str3, @Nullable TrackingMetadata trackingMetadata) {
        nfcScanPhase.getClass();
        nfcScanStatus.getClass();
        this.phase = nfcScanPhase;
        this.status = nfcScanStatus;
        this.durationMs = l10;
        this.authMethod = str;
        this.chipAuthStatus = str2;
        this.dataGroupType = str3;
        this.metadata = trackingMetadata;
    }

    public static /* synthetic */ NfcScanEventData copy$default(NfcScanEventData nfcScanEventData, NfcScanPhase nfcScanPhase, NfcScanStatus nfcScanStatus, Long l10, String str, String str2, String str3, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nfcScanPhase = nfcScanEventData.phase;
        }
        if ((i10 & 2) != 0) {
            nfcScanStatus = nfcScanEventData.status;
        }
        if ((i10 & 4) != 0) {
            l10 = nfcScanEventData.durationMs;
        }
        if ((i10 & 8) != 0) {
            str = nfcScanEventData.authMethod;
        }
        if ((i10 & 16) != 0) {
            str2 = nfcScanEventData.chipAuthStatus;
        }
        if ((i10 & 32) != 0) {
            str3 = nfcScanEventData.dataGroupType;
        }
        if ((i10 & 64) != 0) {
            trackingMetadata = nfcScanEventData.metadata;
        }
        String str4 = str3;
        TrackingMetadata trackingMetadata2 = trackingMetadata;
        String str5 = str2;
        Long l11 = l10;
        return nfcScanEventData.copy(nfcScanPhase, nfcScanStatus, l11, str, str5, str4, trackingMetadata2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NfcScanPhase getPhase() {
        return this.phase;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NfcScanStatus getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getDurationMs() {
        return this.durationMs;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAuthMethod() {
        return this.authMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChipAuthStatus() {
        return this.chipAuthStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDataGroupType() {
        return this.dataGroupType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final NfcScanEventData copy(@NotNull NfcScanPhase phase, @NotNull NfcScanStatus status, @g(name = "duration_ms") @Nullable Long durationMs, @g(name = "auth_method") @Nullable String authMethod, @g(name = "chip_auth_status") @Nullable String chipAuthStatus, @g(name = "data_group_type") @Nullable String dataGroupType, @Nullable TrackingMetadata metadata) {
        phase.getClass();
        status.getClass();
        return new NfcScanEventData(phase, status, durationMs, authMethod, chipAuthStatus, dataGroupType, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcScanEventData)) {
            return false;
        }
        NfcScanEventData nfcScanEventData = (NfcScanEventData) other;
        return this.phase == nfcScanEventData.phase && this.status == nfcScanEventData.status && Intrinsics.c(this.durationMs, nfcScanEventData.durationMs) && Intrinsics.c(this.authMethod, nfcScanEventData.authMethod) && Intrinsics.c(this.chipAuthStatus, nfcScanEventData.chipAuthStatus) && Intrinsics.c(this.dataGroupType, nfcScanEventData.dataGroupType) && Intrinsics.c(this.metadata, nfcScanEventData.metadata);
    }

    @Nullable
    public final String getAuthMethod() {
        return this.authMethod;
    }

    @Nullable
    public final String getChipAuthStatus() {
        return this.chipAuthStatus;
    }

    @Nullable
    public final String getDataGroupType() {
        return this.dataGroupType;
    }

    @Nullable
    public final Long getDurationMs() {
        return this.durationMs;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    @Nullable
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final NfcScanPhase getPhase() {
        return this.phase;
    }

    @NotNull
    public final NfcScanStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() + (this.phase.hashCode() * 31)) * 31;
        Long l10 = this.durationMs;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.authMethod;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.chipAuthStatus;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dataGroupType;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode5 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NfcScanEventData(phase=" + this.phase + ", status=" + this.status + ", durationMs=" + this.durationMs + ", authMethod=" + this.authMethod + ", chipAuthStatus=" + this.chipAuthStatus + ", dataGroupType=" + this.dataGroupType + ", metadata=" + this.metadata + ")";
    }

    public /* synthetic */ NfcScanEventData(NfcScanPhase nfcScanPhase, NfcScanStatus nfcScanStatus, Long l10, String str, String str2, String str3, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nfcScanPhase, nfcScanStatus, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : trackingMetadata);
    }
}

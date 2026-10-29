package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.g;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "reason", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;", "durationMs", "", "errorDescription", "", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;Ljava/lang/Long;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getReason", "()Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;", "getDurationMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getErrorDescription", "()Ljava/lang/String;", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "copy", "(Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;Ljava/lang/Long;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndEventData;", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final /* data */ class InquiryEndEventData implements TrackingEventData {

    @Nullable
    private final Long durationMs;

    @Nullable
    private final String errorDescription;

    @Nullable
    private final TrackingMetadata metadata;

    @Nullable
    private final InquiryEndReason reason;

    public InquiryEndEventData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ InquiryEndEventData copy$default(InquiryEndEventData inquiryEndEventData, InquiryEndReason inquiryEndReason, Long l10, String str, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inquiryEndReason = inquiryEndEventData.reason;
        }
        if ((i10 & 2) != 0) {
            l10 = inquiryEndEventData.durationMs;
        }
        if ((i10 & 4) != 0) {
            str = inquiryEndEventData.errorDescription;
        }
        if ((i10 & 8) != 0) {
            trackingMetadata = inquiryEndEventData.metadata;
        }
        return inquiryEndEventData.copy(inquiryEndReason, l10, str, trackingMetadata);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final InquiryEndReason getReason() {
        return this.reason;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getDurationMs() {
        return this.durationMs;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final InquiryEndEventData copy(@Nullable InquiryEndReason reason, @g(name = "duration_ms") @Nullable Long durationMs, @g(name = "error_description") @Nullable String errorDescription, @Nullable TrackingMetadata metadata) {
        return new InquiryEndEventData(reason, durationMs, errorDescription, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InquiryEndEventData)) {
            return false;
        }
        InquiryEndEventData inquiryEndEventData = (InquiryEndEventData) other;
        return this.reason == inquiryEndEventData.reason && Intrinsics.c(this.durationMs, inquiryEndEventData.durationMs) && Intrinsics.c(this.errorDescription, inquiryEndEventData.errorDescription) && Intrinsics.c(this.metadata, inquiryEndEventData.metadata);
    }

    @Nullable
    public final Long getDurationMs() {
        return this.durationMs;
    }

    @Nullable
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    @Nullable
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final InquiryEndReason getReason() {
        return this.reason;
    }

    public int hashCode() {
        InquiryEndReason inquiryEndReason = this.reason;
        int iHashCode = (inquiryEndReason == null ? 0 : inquiryEndReason.hashCode()) * 31;
        Long l10 = this.durationMs;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.errorDescription;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode3 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InquiryEndEventData(reason=" + this.reason + ", durationMs=" + this.durationMs + ", errorDescription=" + this.errorDescription + ", metadata=" + this.metadata + ")";
    }

    public InquiryEndEventData(@Nullable InquiryEndReason inquiryEndReason, @g(name = "duration_ms") @Nullable Long l10, @g(name = "error_description") @Nullable String str, @Nullable TrackingMetadata trackingMetadata) {
        this.reason = inquiryEndReason;
        this.durationMs = l10;
        this.errorDescription = str;
        this.metadata = trackingMetadata;
    }

    public /* synthetic */ InquiryEndEventData(InquiryEndReason inquiryEndReason, Long l10, String str, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : inquiryEndReason, (i10 & 2) != 0 ? null : l10, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : trackingMetadata);
    }
}

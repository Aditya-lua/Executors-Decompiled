package com.withpersona.sdk2.inquiry.tracking.model;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.g;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "govIdCaptureButtonType", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getGovIdCaptureButtonType", "()Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final /* data */ class GovernmentIdButtonEventData implements TrackingEventData {

    @NotNull
    private final GovIdCaptureButtonType govIdCaptureButtonType;

    @Nullable
    private final TrackingMetadata metadata;

    public GovernmentIdButtonEventData(@g(name = Payload.TYPE) @NotNull GovIdCaptureButtonType govIdCaptureButtonType, @Nullable TrackingMetadata trackingMetadata) {
        govIdCaptureButtonType.getClass();
        this.govIdCaptureButtonType = govIdCaptureButtonType;
        this.metadata = trackingMetadata;
    }

    public static /* synthetic */ GovernmentIdButtonEventData copy$default(GovernmentIdButtonEventData governmentIdButtonEventData, GovIdCaptureButtonType govIdCaptureButtonType, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            govIdCaptureButtonType = governmentIdButtonEventData.govIdCaptureButtonType;
        }
        if ((i10 & 2) != 0) {
            trackingMetadata = governmentIdButtonEventData.metadata;
        }
        return governmentIdButtonEventData.copy(govIdCaptureButtonType, trackingMetadata);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GovIdCaptureButtonType getGovIdCaptureButtonType() {
        return this.govIdCaptureButtonType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final GovernmentIdButtonEventData copy(@g(name = Payload.TYPE) @NotNull GovIdCaptureButtonType govIdCaptureButtonType, @Nullable TrackingMetadata metadata) {
        govIdCaptureButtonType.getClass();
        return new GovernmentIdButtonEventData(govIdCaptureButtonType, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdButtonEventData)) {
            return false;
        }
        GovernmentIdButtonEventData governmentIdButtonEventData = (GovernmentIdButtonEventData) other;
        return this.govIdCaptureButtonType == governmentIdButtonEventData.govIdCaptureButtonType && Intrinsics.c(this.metadata, governmentIdButtonEventData.metadata);
    }

    @NotNull
    public final GovIdCaptureButtonType getGovIdCaptureButtonType() {
        return this.govIdCaptureButtonType;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    @Nullable
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        int iHashCode = this.govIdCaptureButtonType.hashCode() * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode + (trackingMetadata == null ? 0 : trackingMetadata.hashCode());
    }

    @NotNull
    public String toString() {
        return "GovernmentIdButtonEventData(govIdCaptureButtonType=" + this.govIdCaptureButtonType + ", metadata=" + this.metadata + ")";
    }

    public /* synthetic */ GovernmentIdButtonEventData(GovIdCaptureButtonType govIdCaptureButtonType, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(govIdCaptureButtonType, (i10 & 2) != 0 ? null : trackingMetadata);
    }
}

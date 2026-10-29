package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.g;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "poseType", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "captureMethod", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureMethod;", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureMethod;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getPoseType", "()Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "getCaptureMethod", "()Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureMethod;", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final /* data */ class SelfiePoseEventData implements TrackingEventData {

    @NotNull
    private final SelfieCaptureMethod captureMethod;

    @Nullable
    private final TrackingMetadata metadata;

    @NotNull
    private final SelfiePoseType poseType;

    public SelfiePoseEventData(@g(name = "pose") @NotNull SelfiePoseType selfiePoseType, @g(name = "capture_method") @NotNull SelfieCaptureMethod selfieCaptureMethod, @Nullable TrackingMetadata trackingMetadata) {
        selfiePoseType.getClass();
        selfieCaptureMethod.getClass();
        this.poseType = selfiePoseType;
        this.captureMethod = selfieCaptureMethod;
        this.metadata = trackingMetadata;
    }

    public static /* synthetic */ SelfiePoseEventData copy$default(SelfiePoseEventData selfiePoseEventData, SelfiePoseType selfiePoseType, SelfieCaptureMethod selfieCaptureMethod, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            selfiePoseType = selfiePoseEventData.poseType;
        }
        if ((i10 & 2) != 0) {
            selfieCaptureMethod = selfiePoseEventData.captureMethod;
        }
        if ((i10 & 4) != 0) {
            trackingMetadata = selfiePoseEventData.metadata;
        }
        return selfiePoseEventData.copy(selfiePoseType, selfieCaptureMethod, trackingMetadata);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SelfiePoseType getPoseType() {
        return this.poseType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SelfieCaptureMethod getCaptureMethod() {
        return this.captureMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final SelfiePoseEventData copy(@g(name = "pose") @NotNull SelfiePoseType poseType, @g(name = "capture_method") @NotNull SelfieCaptureMethod captureMethod, @Nullable TrackingMetadata metadata) {
        poseType.getClass();
        captureMethod.getClass();
        return new SelfiePoseEventData(poseType, captureMethod, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfiePoseEventData)) {
            return false;
        }
        SelfiePoseEventData selfiePoseEventData = (SelfiePoseEventData) other;
        return this.poseType == selfiePoseEventData.poseType && this.captureMethod == selfiePoseEventData.captureMethod && Intrinsics.c(this.metadata, selfiePoseEventData.metadata);
    }

    @NotNull
    public final SelfieCaptureMethod getCaptureMethod() {
        return this.captureMethod;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    @Nullable
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final SelfiePoseType getPoseType() {
        return this.poseType;
    }

    public int hashCode() {
        int iHashCode = (this.captureMethod.hashCode() + (this.poseType.hashCode() * 31)) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode + (trackingMetadata == null ? 0 : trackingMetadata.hashCode());
    }

    @NotNull
    public String toString() {
        return "SelfiePoseEventData(poseType=" + this.poseType + ", captureMethod=" + this.captureMethod + ", metadata=" + this.metadata + ")";
    }

    public /* synthetic */ SelfiePoseEventData(SelfiePoseType selfiePoseType, SelfieCaptureMethod selfieCaptureMethod, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(selfiePoseType, selfieCaptureMethod, (i10 & 4) != 0 ? null : trackingMetadata);
    }
}

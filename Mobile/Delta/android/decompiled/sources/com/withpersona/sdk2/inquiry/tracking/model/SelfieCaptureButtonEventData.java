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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "selfieCaptureButtonType", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getSelfieCaptureButtonType", "()Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final /* data */ class SelfieCaptureButtonEventData implements TrackingEventData {

    @Nullable
    private final TrackingMetadata metadata;

    @NotNull
    private final SelfieCaptureButtonType selfieCaptureButtonType;

    public SelfieCaptureButtonEventData(@g(name = Payload.TYPE) @NotNull SelfieCaptureButtonType selfieCaptureButtonType, @Nullable TrackingMetadata trackingMetadata) {
        selfieCaptureButtonType.getClass();
        this.selfieCaptureButtonType = selfieCaptureButtonType;
        this.metadata = trackingMetadata;
    }

    public static /* synthetic */ SelfieCaptureButtonEventData copy$default(SelfieCaptureButtonEventData selfieCaptureButtonEventData, SelfieCaptureButtonType selfieCaptureButtonType, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            selfieCaptureButtonType = selfieCaptureButtonEventData.selfieCaptureButtonType;
        }
        if ((i10 & 2) != 0) {
            trackingMetadata = selfieCaptureButtonEventData.metadata;
        }
        return selfieCaptureButtonEventData.copy(selfieCaptureButtonType, trackingMetadata);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SelfieCaptureButtonType getSelfieCaptureButtonType() {
        return this.selfieCaptureButtonType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final SelfieCaptureButtonEventData copy(@g(name = Payload.TYPE) @NotNull SelfieCaptureButtonType selfieCaptureButtonType, @Nullable TrackingMetadata metadata) {
        selfieCaptureButtonType.getClass();
        return new SelfieCaptureButtonEventData(selfieCaptureButtonType, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieCaptureButtonEventData)) {
            return false;
        }
        SelfieCaptureButtonEventData selfieCaptureButtonEventData = (SelfieCaptureButtonEventData) other;
        return this.selfieCaptureButtonType == selfieCaptureButtonEventData.selfieCaptureButtonType && Intrinsics.c(this.metadata, selfieCaptureButtonEventData.metadata);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    @Nullable
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final SelfieCaptureButtonType getSelfieCaptureButtonType() {
        return this.selfieCaptureButtonType;
    }

    public int hashCode() {
        int iHashCode = this.selfieCaptureButtonType.hashCode() * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode + (trackingMetadata == null ? 0 : trackingMetadata.hashCode());
    }

    @NotNull
    public String toString() {
        return "SelfieCaptureButtonEventData(selfieCaptureButtonType=" + this.selfieCaptureButtonType + ", metadata=" + this.metadata + ")";
    }

    public /* synthetic */ SelfieCaptureButtonEventData(SelfieCaptureButtonType selfieCaptureButtonType, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(selfieCaptureButtonType, (i10 & 2) != 0 ? null : trackingMetadata);
    }
}

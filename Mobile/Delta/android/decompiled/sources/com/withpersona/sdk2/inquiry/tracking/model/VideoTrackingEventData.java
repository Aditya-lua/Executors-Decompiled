package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/VideoTrackingEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "stepName", "", "videoCaptureMethod", "errorMsg", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getStepName", "()Ljava/lang/String;", "getVideoCaptureMethod", "getErrorMsg", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final /* data */ class VideoTrackingEventData implements TrackingEventData {

    @Nullable
    private final String errorMsg;

    @Nullable
    private final TrackingMetadata metadata;

    @Nullable
    private final String stepName;

    @Nullable
    private final String videoCaptureMethod;

    public VideoTrackingEventData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable TrackingMetadata trackingMetadata) {
        this.stepName = str;
        this.videoCaptureMethod = str2;
        this.errorMsg = str3;
        this.metadata = trackingMetadata;
    }

    public static /* synthetic */ VideoTrackingEventData copy$default(VideoTrackingEventData videoTrackingEventData, String str, String str2, String str3, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = videoTrackingEventData.stepName;
        }
        if ((i10 & 2) != 0) {
            str2 = videoTrackingEventData.videoCaptureMethod;
        }
        if ((i10 & 4) != 0) {
            str3 = videoTrackingEventData.errorMsg;
        }
        if ((i10 & 8) != 0) {
            trackingMetadata = videoTrackingEventData.metadata;
        }
        return videoTrackingEventData.copy(str, str2, str3, trackingMetadata);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStepName() {
        return this.stepName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVideoCaptureMethod() {
        return this.videoCaptureMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final VideoTrackingEventData copy(@Nullable String stepName, @Nullable String videoCaptureMethod, @Nullable String errorMsg, @Nullable TrackingMetadata metadata) {
        return new VideoTrackingEventData(stepName, videoCaptureMethod, errorMsg, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoTrackingEventData)) {
            return false;
        }
        VideoTrackingEventData videoTrackingEventData = (VideoTrackingEventData) other;
        return Intrinsics.c(this.stepName, videoTrackingEventData.stepName) && Intrinsics.c(this.videoCaptureMethod, videoTrackingEventData.videoCaptureMethod) && Intrinsics.c(this.errorMsg, videoTrackingEventData.errorMsg) && Intrinsics.c(this.metadata, videoTrackingEventData.metadata);
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    @Nullable
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final String getStepName() {
        return this.stepName;
    }

    @Nullable
    public final String getVideoCaptureMethod() {
        return this.videoCaptureMethod;
    }

    public int hashCode() {
        String str = this.stepName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.videoCaptureMethod;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMsg;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode3 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VideoTrackingEventData(stepName=" + this.stepName + ", videoCaptureMethod=" + this.videoCaptureMethod + ", errorMsg=" + this.errorMsg + ", metadata=" + this.metadata + ")";
    }

    public /* synthetic */ VideoTrackingEventData(String str, String str2, String str3, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : trackingMetadata);
    }
}

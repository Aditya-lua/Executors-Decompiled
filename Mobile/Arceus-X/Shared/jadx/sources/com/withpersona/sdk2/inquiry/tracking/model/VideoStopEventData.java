package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003Jn\u0010&\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\bHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "stepName", "", "pageName", "captureMethod", "assetId", "elapsedTime", "", "chunksLength", "blobSize", "", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getStepName", "()Ljava/lang/String;", "getPageName", "getCaptureMethod", "getAssetId", "getElapsedTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChunksLength", "getBlobSize", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopEventData;", "equals", "", "other", "", "hashCode", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final /* data */ class VideoStopEventData implements TrackingEventData {

    @Nullable
    private final String assetId;

    @Nullable
    private final Double blobSize;

    @Nullable
    private final String captureMethod;

    @Nullable
    private final Integer chunksLength;

    @Nullable
    private final Integer elapsedTime;

    @Nullable
    private final TrackingMetadata metadata;

    @Nullable
    private final String pageName;

    @Nullable
    private final String stepName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public VideoStopEventData(@InterfaceC11872g(name = "step_name") @Nullable String str, @InterfaceC11872g(name = "page_name") @Nullable String str2, @InterfaceC11872g(name = "capture_method") @Nullable String str3, @InterfaceC11872g(name = "asset_id") @Nullable String str4, @InterfaceC11872g(name = "elapsed_time") @Nullable Integer num, @InterfaceC11872g(name = "chunks_length") @Nullable Integer num2, @InterfaceC11872g(name = "blob_size") @Nullable Double d10, @Nullable TrackingMetadata trackingMetadata) {
        this.stepName = str;
        this.pageName = str2;
        this.captureMethod = str3;
        this.assetId = str4;
        this.elapsedTime = num;
        this.chunksLength = num2;
        this.blobSize = d10;
        this.metadata = trackingMetadata;
    }

    public static /* synthetic */ VideoStopEventData copy$default(VideoStopEventData videoStopEventData, String str, String str2, String str3, String str4, Integer num, Integer num2, Double d10, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = videoStopEventData.stepName;
        }
        if ((i10 & 2) != 0) {
            str2 = videoStopEventData.pageName;
        }
        if ((i10 & 4) != 0) {
            str3 = videoStopEventData.captureMethod;
        }
        if ((i10 & 8) != 0) {
            str4 = videoStopEventData.assetId;
        }
        if ((i10 & 16) != 0) {
            num = videoStopEventData.elapsedTime;
        }
        if ((i10 & 32) != 0) {
            num2 = videoStopEventData.chunksLength;
        }
        if ((i10 & 64) != 0) {
            d10 = videoStopEventData.blobSize;
        }
        if ((i10 & 128) != 0) {
            trackingMetadata = videoStopEventData.metadata;
        }
        Double d11 = d10;
        TrackingMetadata trackingMetadata2 = trackingMetadata;
        Integer num3 = num;
        Integer num4 = num2;
        return videoStopEventData.copy(str, str2, str3, str4, num3, num4, d11, trackingMetadata2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStepName() {
        return this.stepName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCaptureMethod() {
        return this.captureMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAssetId() {
        return this.assetId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getElapsedTime() {
        return this.elapsedTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getChunksLength() {
        return this.chunksLength;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getBlobSize() {
        return this.blobSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final VideoStopEventData copy(@InterfaceC11872g(name = "step_name") @Nullable String stepName, @InterfaceC11872g(name = "page_name") @Nullable String pageName, @InterfaceC11872g(name = "capture_method") @Nullable String captureMethod, @InterfaceC11872g(name = "asset_id") @Nullable String assetId, @InterfaceC11872g(name = "elapsed_time") @Nullable Integer elapsedTime, @InterfaceC11872g(name = "chunks_length") @Nullable Integer chunksLength, @InterfaceC11872g(name = "blob_size") @Nullable Double blobSize, @Nullable TrackingMetadata metadata) {
        return new VideoStopEventData(stepName, pageName, captureMethod, assetId, elapsedTime, chunksLength, blobSize, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoStopEventData)) {
            return false;
        }
        VideoStopEventData videoStopEventData = (VideoStopEventData) other;
        return Intrinsics.m31980c(this.stepName, videoStopEventData.stepName) && Intrinsics.m31980c(this.pageName, videoStopEventData.pageName) && Intrinsics.m31980c(this.captureMethod, videoStopEventData.captureMethod) && Intrinsics.m31980c(this.assetId, videoStopEventData.assetId) && Intrinsics.m31980c(this.elapsedTime, videoStopEventData.elapsedTime) && Intrinsics.m31980c(this.chunksLength, videoStopEventData.chunksLength) && Intrinsics.m31980c(this.blobSize, videoStopEventData.blobSize) && Intrinsics.m31980c(this.metadata, videoStopEventData.metadata);
    }

    @Nullable
    public final String getAssetId() {
        return this.assetId;
    }

    @Nullable
    public final Double getBlobSize() {
        return this.blobSize;
    }

    @Nullable
    public final String getCaptureMethod() {
        return this.captureMethod;
    }

    @Nullable
    public final Integer getChunksLength() {
        return this.chunksLength;
    }

    @Nullable
    public final Integer getElapsedTime() {
        return this.elapsedTime;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    @Nullable
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final String getPageName() {
        return this.pageName;
    }

    @Nullable
    public final String getStepName() {
        return this.stepName;
    }

    public int hashCode() {
        String str = this.stepName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pageName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.captureMethod;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.assetId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.elapsedTime;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.chunksLength;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d10 = this.blobSize;
        int iHashCode7 = (iHashCode6 + (d10 == null ? 0 : d10.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode7 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VideoStopEventData(stepName=" + this.stepName + ", pageName=" + this.pageName + ", captureMethod=" + this.captureMethod + ", assetId=" + this.assetId + ", elapsedTime=" + this.elapsedTime + ", chunksLength=" + this.chunksLength + ", blobSize=" + this.blobSize + ", metadata=" + this.metadata + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
      (r2v0 java.lang.String)
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0006: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
      (wrap java.lang.Integer:?: TERNARY null = ((wrap int:0x0010: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
      (wrap java.lang.Integer:?: TERNARY null = ((wrap int:0x0015: ARITH (r10v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
      (wrap java.lang.Double:?: TERNARY null = ((wrap int:0x001a: ARITH (r10v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r8v0 java.lang.Double))
      (wrap com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata:?: TERNARY null = ((wrap int:0x001f: ARITH (r10v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata) : (r9v0 com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata))
     A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Double, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void (m)] (LINE:10) call: com.withpersona.sdk2.inquiry.tracking.model.VideoStopEventData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Double, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void type: THIS */
    public /* synthetic */ VideoStopEventData(String str, String str2, String str3, String str4, Integer num, Integer num2, Double d10, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : num2, (i10 & 64) != 0 ? null : d10, (i10 & 128) != 0 ? null : trackingMetadata);
    }
}

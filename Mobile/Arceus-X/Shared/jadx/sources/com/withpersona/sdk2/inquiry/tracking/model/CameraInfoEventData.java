package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003Jb\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "label", "", "position", "size", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;", "frameRate", "", "aspectRatio", "debugData", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;Ljava/lang/Double;Ljava/lang/Double;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getLabel", "()Ljava/lang/String;", "getPosition", "getSize", "()Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;", "getFrameRate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAspectRatio", "getDebugData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;Ljava/lang/Double;Ljava/lang/Double;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final /* data */ class CameraInfoEventData implements TrackingEventData {

    @Nullable
    private final Double aspectRatio;

    @Nullable
    private final CameraDebugData debugData;

    @Nullable
    private final Double frameRate;

    @Nullable
    private final String label;

    @Nullable
    private final TrackingMetadata metadata;

    @Nullable
    private final String position;

    @Nullable
    private final CameraSize size;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CameraInfoEventData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ CameraInfoEventData copy$default(CameraInfoEventData cameraInfoEventData, String str, String str2, CameraSize cameraSize, Double d10, Double d11, CameraDebugData cameraDebugData, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cameraInfoEventData.label;
        }
        if ((i10 & 2) != 0) {
            str2 = cameraInfoEventData.position;
        }
        if ((i10 & 4) != 0) {
            cameraSize = cameraInfoEventData.size;
        }
        if ((i10 & 8) != 0) {
            d10 = cameraInfoEventData.frameRate;
        }
        if ((i10 & 16) != 0) {
            d11 = cameraInfoEventData.aspectRatio;
        }
        if ((i10 & 32) != 0) {
            cameraDebugData = cameraInfoEventData.debugData;
        }
        if ((i10 & 64) != 0) {
            trackingMetadata = cameraInfoEventData.metadata;
        }
        CameraDebugData cameraDebugData2 = cameraDebugData;
        TrackingMetadata trackingMetadata2 = trackingMetadata;
        Double d12 = d11;
        CameraSize cameraSize2 = cameraSize;
        return cameraInfoEventData.copy(str, str2, cameraSize2, d10, d12, cameraDebugData2, trackingMetadata2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CameraSize getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getFrameRate() {
        return this.frameRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getAspectRatio() {
        return this.aspectRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CameraDebugData getDebugData() {
        return this.debugData;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final CameraInfoEventData copy(@Nullable String label, @Nullable String position, @Nullable CameraSize size, @InterfaceC11872g(name = "frame_rate") @Nullable Double frameRate, @InterfaceC11872g(name = "aspect_ratio") @Nullable Double aspectRatio, @InterfaceC11872g(name = "debug_data") @Nullable CameraDebugData debugData, @Nullable TrackingMetadata metadata) {
        return new CameraInfoEventData(label, position, size, frameRate, aspectRatio, debugData, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraInfoEventData)) {
            return false;
        }
        CameraInfoEventData cameraInfoEventData = (CameraInfoEventData) other;
        return Intrinsics.m31980c(this.label, cameraInfoEventData.label) && Intrinsics.m31980c(this.position, cameraInfoEventData.position) && Intrinsics.m31980c(this.size, cameraInfoEventData.size) && Intrinsics.m31980c(this.frameRate, cameraInfoEventData.frameRate) && Intrinsics.m31980c(this.aspectRatio, cameraInfoEventData.aspectRatio) && Intrinsics.m31980c(this.debugData, cameraInfoEventData.debugData) && Intrinsics.m31980c(this.metadata, cameraInfoEventData.metadata);
    }

    @Nullable
    public final Double getAspectRatio() {
        return this.aspectRatio;
    }

    @Nullable
    public final CameraDebugData getDebugData() {
        return this.debugData;
    }

    @Nullable
    public final Double getFrameRate() {
        return this.frameRate;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    @Nullable
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    public final CameraSize getSize() {
        return this.size;
    }

    public int hashCode() {
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.position;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CameraSize cameraSize = this.size;
        int iHashCode3 = (iHashCode2 + (cameraSize == null ? 0 : cameraSize.hashCode())) * 31;
        Double d10 = this.frameRate;
        int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.aspectRatio;
        int iHashCode5 = (iHashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        CameraDebugData cameraDebugData = this.debugData;
        int iHashCode6 = (iHashCode5 + (cameraDebugData == null ? 0 : cameraDebugData.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode6 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CameraInfoEventData(label=" + this.label + ", position=" + this.position + ", size=" + this.size + ", frameRate=" + this.frameRate + ", aspectRatio=" + this.aspectRatio + ", debugData=" + this.debugData + ", metadata=" + this.metadata + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CameraInfoEventData(@Nullable String str, @Nullable String str2, @Nullable CameraSize cameraSize, @InterfaceC11872g(name = "frame_rate") @Nullable Double d10, @InterfaceC11872g(name = "aspect_ratio") @Nullable Double d11, @InterfaceC11872g(name = "debug_data") @Nullable CameraDebugData cameraDebugData, @Nullable TrackingMetadata trackingMetadata) {
        this.label = str;
        this.position = str2;
        this.size = cameraSize;
        this.frameRate = d10;
        this.aspectRatio = d11;
        this.debugData = cameraDebugData;
        this.metadata = trackingMetadata;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
      (wrap com.withpersona.sdk2.inquiry.tracking.model.CameraSize:?: TERNARY null = ((wrap int:0x000b: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.CameraSize) : (r4v0 com.withpersona.sdk2.inquiry.tracking.model.CameraSize))
      (wrap java.lang.Double:?: TERNARY null = ((wrap int:0x0010: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r5v0 java.lang.Double))
      (wrap java.lang.Double:?: TERNARY null = ((wrap int:0x0015: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r6v0 java.lang.Double))
      (wrap com.withpersona.sdk2.inquiry.tracking.model.CameraDebugData:?: TERNARY null = ((wrap int:0x001a: ARITH (r9v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.CameraDebugData) : (r7v0 com.withpersona.sdk2.inquiry.tracking.model.CameraDebugData))
      (wrap com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata:?: TERNARY null = ((wrap int:0x001f: ARITH (r9v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata) : (r8v0 com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata))
     A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.CameraSize, java.lang.Double, java.lang.Double, com.withpersona.sdk2.inquiry.tracking.model.CameraDebugData, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void (m)] (LINE:10) call: com.withpersona.sdk2.inquiry.tracking.model.CameraInfoEventData.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.CameraSize, java.lang.Double, java.lang.Double, com.withpersona.sdk2.inquiry.tracking.model.CameraDebugData, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void type: THIS */
    public /* synthetic */ CameraInfoEventData(String str, String str2, CameraSize cameraSize, Double d10, Double d11, CameraDebugData cameraDebugData, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : cameraSize, (i10 & 8) != 0 ? null : d10, (i10 & 16) != 0 ? null : d11, (i10 & 32) != 0 ? null : cameraDebugData, (i10 & 64) != 0 ? null : trackingMetadata);
    }
}

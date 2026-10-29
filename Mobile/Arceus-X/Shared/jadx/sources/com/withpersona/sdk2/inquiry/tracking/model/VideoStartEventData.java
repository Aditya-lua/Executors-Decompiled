package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStartEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "stepName", "", "pageName", "captureMethod", "attempt", "", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getStepName", "()Ljava/lang/String;", "getPageName", "getCaptureMethod", "getAttempt", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStartEventData;", "equals", "", "other", "", "hashCode", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final /* data */ class VideoStartEventData implements TrackingEventData {

    @Nullable
    private final Integer attempt;

    @Nullable
    private final String captureMethod;

    @Nullable
    private final TrackingMetadata metadata;

    @Nullable
    private final String pageName;

    @Nullable
    private final String stepName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public VideoStartEventData(@InterfaceC11872g(name = "step_name") @Nullable String str, @InterfaceC11872g(name = "page_name") @Nullable String str2, @InterfaceC11872g(name = "capture_method") @Nullable String str3, @Nullable Integer num, @Nullable TrackingMetadata trackingMetadata) {
        this.stepName = str;
        this.pageName = str2;
        this.captureMethod = str3;
        this.attempt = num;
        this.metadata = trackingMetadata;
    }

    public static /* synthetic */ VideoStartEventData copy$default(VideoStartEventData videoStartEventData, String str, String str2, String str3, Integer num, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = videoStartEventData.stepName;
        }
        if ((i10 & 2) != 0) {
            str2 = videoStartEventData.pageName;
        }
        if ((i10 & 4) != 0) {
            str3 = videoStartEventData.captureMethod;
        }
        if ((i10 & 8) != 0) {
            num = videoStartEventData.attempt;
        }
        if ((i10 & 16) != 0) {
            trackingMetadata = videoStartEventData.metadata;
        }
        TrackingMetadata trackingMetadata2 = trackingMetadata;
        String str4 = str3;
        return videoStartEventData.copy(str, str2, str4, num, trackingMetadata2);
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
    public final Integer getAttempt() {
        return this.attempt;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final VideoStartEventData copy(@InterfaceC11872g(name = "step_name") @Nullable String stepName, @InterfaceC11872g(name = "page_name") @Nullable String pageName, @InterfaceC11872g(name = "capture_method") @Nullable String captureMethod, @Nullable Integer attempt, @Nullable TrackingMetadata metadata) {
        return new VideoStartEventData(stepName, pageName, captureMethod, attempt, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoStartEventData)) {
            return false;
        }
        VideoStartEventData videoStartEventData = (VideoStartEventData) other;
        return Intrinsics.m31980c(this.stepName, videoStartEventData.stepName) && Intrinsics.m31980c(this.pageName, videoStartEventData.pageName) && Intrinsics.m31980c(this.captureMethod, videoStartEventData.captureMethod) && Intrinsics.m31980c(this.attempt, videoStartEventData.attempt) && Intrinsics.m31980c(this.metadata, videoStartEventData.metadata);
    }

    @Nullable
    public final Integer getAttempt() {
        return this.attempt;
    }

    @Nullable
    public final String getCaptureMethod() {
        return this.captureMethod;
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
        Integer num = this.attempt;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode4 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VideoStartEventData(stepName=" + this.stepName + ", pageName=" + this.pageName + ", captureMethod=" + this.captureMethod + ", attempt=" + this.attempt + ", metadata=" + this.metadata + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
      (r2v0 java.lang.String)
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0006: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
      (wrap java.lang.Integer:?: TERNARY null = ((wrap int:0x000b: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
      (wrap com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata:?: TERNARY null = ((wrap int:0x0010: ARITH (r7v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata) : (r6v0 com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata))
     A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void (m)] (LINE:7) call: com.withpersona.sdk2.inquiry.tracking.model.VideoStartEventData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void type: THIS */
    public /* synthetic */ VideoStartEventData(String str, String str2, String str3, Integer num, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : trackingMetadata);
    }
}

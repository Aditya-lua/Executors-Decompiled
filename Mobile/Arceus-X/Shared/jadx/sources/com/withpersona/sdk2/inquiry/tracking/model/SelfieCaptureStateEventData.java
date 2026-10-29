package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "selfieCaptureState", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;", "captureMethod", "", "pose", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getSelfieCaptureState", "()Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;", "getCaptureMethod", "()Ljava/lang/String;", "getPose", "()Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final /* data */ class SelfieCaptureStateEventData implements TrackingEventData {

    @Nullable
    private final String captureMethod;

    @Nullable
    private final TrackingMetadata metadata;

    @Nullable
    private final SelfiePoseType pose;

    @NotNull
    private final SelfieCaptureState selfieCaptureState;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SelfieCaptureStateEventData(@InterfaceC11872g(name = "state") @NotNull SelfieCaptureState selfieCaptureState, @InterfaceC11872g(name = "capture_method") @Nullable String str, @InterfaceC11872g(name = "pose") @Nullable SelfiePoseType selfiePoseType, @Nullable TrackingMetadata trackingMetadata) {
        selfieCaptureState.getClass();
        this.selfieCaptureState = selfieCaptureState;
        this.captureMethod = str;
        this.pose = selfiePoseType;
        this.metadata = trackingMetadata;
    }

    public static /* synthetic */ SelfieCaptureStateEventData copy$default(SelfieCaptureStateEventData selfieCaptureStateEventData, SelfieCaptureState selfieCaptureState, String str, SelfiePoseType selfiePoseType, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            selfieCaptureState = selfieCaptureStateEventData.selfieCaptureState;
        }
        if ((i10 & 2) != 0) {
            str = selfieCaptureStateEventData.captureMethod;
        }
        if ((i10 & 4) != 0) {
            selfiePoseType = selfieCaptureStateEventData.pose;
        }
        if ((i10 & 8) != 0) {
            trackingMetadata = selfieCaptureStateEventData.metadata;
        }
        return selfieCaptureStateEventData.copy(selfieCaptureState, str, selfiePoseType, trackingMetadata);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SelfieCaptureState getSelfieCaptureState() {
        return this.selfieCaptureState;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCaptureMethod() {
        return this.captureMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SelfiePoseType getPose() {
        return this.pose;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final SelfieCaptureStateEventData copy(@InterfaceC11872g(name = "state") @NotNull SelfieCaptureState selfieCaptureState, @InterfaceC11872g(name = "capture_method") @Nullable String captureMethod, @InterfaceC11872g(name = "pose") @Nullable SelfiePoseType pose, @Nullable TrackingMetadata metadata) {
        selfieCaptureState.getClass();
        return new SelfieCaptureStateEventData(selfieCaptureState, captureMethod, pose, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieCaptureStateEventData)) {
            return false;
        }
        SelfieCaptureStateEventData selfieCaptureStateEventData = (SelfieCaptureStateEventData) other;
        return this.selfieCaptureState == selfieCaptureStateEventData.selfieCaptureState && Intrinsics.m31980c(this.captureMethod, selfieCaptureStateEventData.captureMethod) && this.pose == selfieCaptureStateEventData.pose && Intrinsics.m31980c(this.metadata, selfieCaptureStateEventData.metadata);
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
    public final SelfiePoseType getPose() {
        return this.pose;
    }

    @NotNull
    public final SelfieCaptureState getSelfieCaptureState() {
        return this.selfieCaptureState;
    }

    public int hashCode() {
        int iHashCode = this.selfieCaptureState.hashCode() * 31;
        String str = this.captureMethod;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SelfiePoseType selfiePoseType = this.pose;
        int iHashCode3 = (iHashCode2 + (selfiePoseType == null ? 0 : selfiePoseType.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode3 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SelfieCaptureStateEventData(selfieCaptureState=" + this.selfieCaptureState + ", captureMethod=" + this.captureMethod + ", pose=" + this.pose + ", metadata=" + this.metadata + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (r1v0 com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState)
      (r2v0 java.lang.String)
      (r3v0 com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseType)
      (wrap com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata) : (r4v0 com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata))
     A[MD:(com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState, java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseType, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void (m)] (LINE:6) call: com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData.<init>(com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState, java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseType, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void type: THIS */
    public /* synthetic */ SelfieCaptureStateEventData(SelfieCaptureState selfieCaptureState, String str, SelfiePoseType selfiePoseType, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(selfieCaptureState, str, selfiePoseType, (i10 & 8) != 0 ? null : trackingMetadata);
    }
}

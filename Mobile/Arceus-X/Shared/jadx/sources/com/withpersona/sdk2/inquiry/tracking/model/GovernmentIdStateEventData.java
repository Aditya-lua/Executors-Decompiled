package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "govIdCaptureState", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;", "captureMethod", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;", "side", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getGovIdCaptureState", "()Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;", "getCaptureMethod", "()Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;", "getSide", "()Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final /* data */ class GovernmentIdStateEventData implements TrackingEventData {

    @Nullable
    private final GovIdCaptureMethod captureMethod;

    @NotNull
    private final GovIdCaptureState govIdCaptureState;

    @Nullable
    private final TrackingMetadata metadata;

    @Nullable
    private final GovIdCaptureSide side;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GovernmentIdStateEventData(@InterfaceC11872g(name = "state") @NotNull GovIdCaptureState govIdCaptureState, @InterfaceC11872g(name = "capture_method") @Nullable GovIdCaptureMethod govIdCaptureMethod, @InterfaceC11872g(name = "side") @Nullable GovIdCaptureSide govIdCaptureSide, @Nullable TrackingMetadata trackingMetadata) {
        govIdCaptureState.getClass();
        this.govIdCaptureState = govIdCaptureState;
        this.captureMethod = govIdCaptureMethod;
        this.side = govIdCaptureSide;
        this.metadata = trackingMetadata;
    }

    public static /* synthetic */ GovernmentIdStateEventData copy$default(GovernmentIdStateEventData governmentIdStateEventData, GovIdCaptureState govIdCaptureState, GovIdCaptureMethod govIdCaptureMethod, GovIdCaptureSide govIdCaptureSide, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            govIdCaptureState = governmentIdStateEventData.govIdCaptureState;
        }
        if ((i10 & 2) != 0) {
            govIdCaptureMethod = governmentIdStateEventData.captureMethod;
        }
        if ((i10 & 4) != 0) {
            govIdCaptureSide = governmentIdStateEventData.side;
        }
        if ((i10 & 8) != 0) {
            trackingMetadata = governmentIdStateEventData.metadata;
        }
        return governmentIdStateEventData.copy(govIdCaptureState, govIdCaptureMethod, govIdCaptureSide, trackingMetadata);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GovIdCaptureState getGovIdCaptureState() {
        return this.govIdCaptureState;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GovIdCaptureMethod getCaptureMethod() {
        return this.captureMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GovIdCaptureSide getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final GovernmentIdStateEventData copy(@InterfaceC11872g(name = "state") @NotNull GovIdCaptureState govIdCaptureState, @InterfaceC11872g(name = "capture_method") @Nullable GovIdCaptureMethod captureMethod, @InterfaceC11872g(name = "side") @Nullable GovIdCaptureSide side, @Nullable TrackingMetadata metadata) {
        govIdCaptureState.getClass();
        return new GovernmentIdStateEventData(govIdCaptureState, captureMethod, side, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdStateEventData)) {
            return false;
        }
        GovernmentIdStateEventData governmentIdStateEventData = (GovernmentIdStateEventData) other;
        return this.govIdCaptureState == governmentIdStateEventData.govIdCaptureState && this.captureMethod == governmentIdStateEventData.captureMethod && this.side == governmentIdStateEventData.side && Intrinsics.m31980c(this.metadata, governmentIdStateEventData.metadata);
    }

    @Nullable
    public final GovIdCaptureMethod getCaptureMethod() {
        return this.captureMethod;
    }

    @NotNull
    public final GovIdCaptureState getGovIdCaptureState() {
        return this.govIdCaptureState;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    @Nullable
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final GovIdCaptureSide getSide() {
        return this.side;
    }

    public int hashCode() {
        int iHashCode = this.govIdCaptureState.hashCode() * 31;
        GovIdCaptureMethod govIdCaptureMethod = this.captureMethod;
        int iHashCode2 = (iHashCode + (govIdCaptureMethod == null ? 0 : govIdCaptureMethod.hashCode())) * 31;
        GovIdCaptureSide govIdCaptureSide = this.side;
        int iHashCode3 = (iHashCode2 + (govIdCaptureSide == null ? 0 : govIdCaptureSide.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode3 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GovernmentIdStateEventData(govIdCaptureState=" + this.govIdCaptureState + ", captureMethod=" + this.captureMethod + ", side=" + this.side + ", metadata=" + this.metadata + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
      (r2v0 com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState)
      (r3v0 com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod)
      (wrap com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureSide:?: TERNARY null = ((wrap int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureSide) : (r4v0 com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureSide))
      (wrap com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata:?: TERNARY null = ((wrap int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata) : (r5v0 com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata))
     A[MD:(com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState, com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod, com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureSide, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void (m)] (LINE:6) call: com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData.<init>(com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState, com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod, com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureSide, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void type: THIS */
    public /* synthetic */ GovernmentIdStateEventData(GovIdCaptureState govIdCaptureState, GovIdCaptureMethod govIdCaptureMethod, GovIdCaptureSide govIdCaptureSide, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(govIdCaptureState, govIdCaptureMethod, (i10 & 4) != 0 ? null : govIdCaptureSide, (i10 & 8) != 0 ? null : trackingMetadata);
    }
}

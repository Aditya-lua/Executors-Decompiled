package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006%"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "intendedPose", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "actualPose", "pitch", "", "yaw", "roll", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;FFFLcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getIntendedPose", "()Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "getActualPose", "getPitch", "()F", "getYaw", "getRoll", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final /* data */ class SelfiePoseDetectEventData implements TrackingEventData {

    @NotNull
    private final SelfiePoseType actualPose;

    @NotNull
    private final SelfiePoseType intendedPose;

    @Nullable
    private final TrackingMetadata metadata;
    private final float pitch;
    private final float roll;
    private final float yaw;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SelfiePoseDetectEventData(@InterfaceC11872g(name = "intended_pose") @NotNull SelfiePoseType selfiePoseType, @InterfaceC11872g(name = "actual_pose") @NotNull SelfiePoseType selfiePoseType2, @InterfaceC11872g(name = "pitch") float f10, @InterfaceC11872g(name = "yaw") float f11, @InterfaceC11872g(name = "roll") float f12, @Nullable TrackingMetadata trackingMetadata) {
        selfiePoseType.getClass();
        selfiePoseType2.getClass();
        this.intendedPose = selfiePoseType;
        this.actualPose = selfiePoseType2;
        this.pitch = f10;
        this.yaw = f11;
        this.roll = f12;
        this.metadata = trackingMetadata;
    }

    public static /* synthetic */ SelfiePoseDetectEventData copy$default(SelfiePoseDetectEventData selfiePoseDetectEventData, SelfiePoseType selfiePoseType, SelfiePoseType selfiePoseType2, float f10, float f11, float f12, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            selfiePoseType = selfiePoseDetectEventData.intendedPose;
        }
        if ((i10 & 2) != 0) {
            selfiePoseType2 = selfiePoseDetectEventData.actualPose;
        }
        if ((i10 & 4) != 0) {
            f10 = selfiePoseDetectEventData.pitch;
        }
        if ((i10 & 8) != 0) {
            f11 = selfiePoseDetectEventData.yaw;
        }
        if ((i10 & 16) != 0) {
            f12 = selfiePoseDetectEventData.roll;
        }
        if ((i10 & 32) != 0) {
            trackingMetadata = selfiePoseDetectEventData.metadata;
        }
        float f13 = f12;
        TrackingMetadata trackingMetadata2 = trackingMetadata;
        return selfiePoseDetectEventData.copy(selfiePoseType, selfiePoseType2, f10, f11, f13, trackingMetadata2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SelfiePoseType getIntendedPose() {
        return this.intendedPose;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SelfiePoseType getActualPose() {
        return this.actualPose;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getPitch() {
        return this.pitch;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getYaw() {
        return this.yaw;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getRoll() {
        return this.roll;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final SelfiePoseDetectEventData copy(@InterfaceC11872g(name = "intended_pose") @NotNull SelfiePoseType intendedPose, @InterfaceC11872g(name = "actual_pose") @NotNull SelfiePoseType actualPose, @InterfaceC11872g(name = "pitch") float pitch, @InterfaceC11872g(name = "yaw") float yaw, @InterfaceC11872g(name = "roll") float roll, @Nullable TrackingMetadata metadata) {
        intendedPose.getClass();
        actualPose.getClass();
        return new SelfiePoseDetectEventData(intendedPose, actualPose, pitch, yaw, roll, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfiePoseDetectEventData)) {
            return false;
        }
        SelfiePoseDetectEventData selfiePoseDetectEventData = (SelfiePoseDetectEventData) other;
        return this.intendedPose == selfiePoseDetectEventData.intendedPose && this.actualPose == selfiePoseDetectEventData.actualPose && Float.compare(this.pitch, selfiePoseDetectEventData.pitch) == 0 && Float.compare(this.yaw, selfiePoseDetectEventData.yaw) == 0 && Float.compare(this.roll, selfiePoseDetectEventData.roll) == 0 && Intrinsics.m31980c(this.metadata, selfiePoseDetectEventData.metadata);
    }

    @NotNull
    public final SelfiePoseType getActualPose() {
        return this.actualPose;
    }

    @NotNull
    public final SelfiePoseType getIntendedPose() {
        return this.intendedPose;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    @Nullable
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public final float getPitch() {
        return this.pitch;
    }

    public final float getRoll() {
        return this.roll;
    }

    public final float getYaw() {
        return this.yaw;
    }

    public int hashCode() {
        int iHashCode = (Float.hashCode(this.roll) + ((Float.hashCode(this.yaw) + ((Float.hashCode(this.pitch) + ((this.actualPose.hashCode() + (this.intendedPose.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode + (trackingMetadata == null ? 0 : trackingMetadata.hashCode());
    }

    @NotNull
    public String toString() {
        return "SelfiePoseDetectEventData(intendedPose=" + this.intendedPose + ", actualPose=" + this.actualPose + ", pitch=" + this.pitch + ", yaw=" + this.yaw + ", roll=" + this.roll + ", metadata=" + this.metadata + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
      (r8v0 com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseType)
      (r9v0 com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseType)
      (r10v0 float)
      (r11v0 float)
      (r12v0 float)
      (wrap com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata:?: TERNARY null = ((wrap int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata) : (r13v0 com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata))
     A[MD:(com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseType, com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseType, float, float, float, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void (m)] (LINE:8) call: com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseDetectEventData.<init>(com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseType, com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseType, float, float, float, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void type: THIS */
    public /* synthetic */ SelfiePoseDetectEventData(SelfiePoseType selfiePoseType, SelfiePoseType selfiePoseType2, float f10, float f11, float f12, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(selfiePoseType, selfiePoseType2, f10, f11, f12, (i10 & 32) != 0 ? null : trackingMetadata);
    }
}

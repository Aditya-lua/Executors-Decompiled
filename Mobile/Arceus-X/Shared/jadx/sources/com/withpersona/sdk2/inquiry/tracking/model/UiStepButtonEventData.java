package com.withpersona.sdk2.inquiry.tracking.model;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", Payload.TYPE, "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", "buttonName", "", "stepName", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getType", "()Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", "getButtonName", "()Ljava/lang/String;", "getStepName", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final /* data */ class UiStepButtonEventData implements TrackingEventData {

    @Nullable
    private final String buttonName;

    @Nullable
    private final TrackingMetadata metadata;

    @Nullable
    private final String stepName;

    @Nullable
    private final UiStepButtonType type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public UiStepButtonEventData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ UiStepButtonEventData copy$default(UiStepButtonEventData uiStepButtonEventData, UiStepButtonType uiStepButtonType, String str, String str2, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uiStepButtonType = uiStepButtonEventData.type;
        }
        if ((i10 & 2) != 0) {
            str = uiStepButtonEventData.buttonName;
        }
        if ((i10 & 4) != 0) {
            str2 = uiStepButtonEventData.stepName;
        }
        if ((i10 & 8) != 0) {
            trackingMetadata = uiStepButtonEventData.metadata;
        }
        return uiStepButtonEventData.copy(uiStepButtonType, str, str2, trackingMetadata);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UiStepButtonType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStepName() {
        return this.stepName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final UiStepButtonEventData copy(@Nullable UiStepButtonType type, @InterfaceC11872g(name = "button_name") @Nullable String buttonName, @InterfaceC11872g(name = "step_name") @Nullable String stepName, @Nullable TrackingMetadata metadata) {
        return new UiStepButtonEventData(type, buttonName, stepName, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiStepButtonEventData)) {
            return false;
        }
        UiStepButtonEventData uiStepButtonEventData = (UiStepButtonEventData) other;
        return this.type == uiStepButtonEventData.type && Intrinsics.m31980c(this.buttonName, uiStepButtonEventData.buttonName) && Intrinsics.m31980c(this.stepName, uiStepButtonEventData.stepName) && Intrinsics.m31980c(this.metadata, uiStepButtonEventData.metadata);
    }

    @Nullable
    public final String getButtonName() {
        return this.buttonName;
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
    public final UiStepButtonType getType() {
        return this.type;
    }

    public int hashCode() {
        UiStepButtonType uiStepButtonType = this.type;
        int iHashCode = (uiStepButtonType == null ? 0 : uiStepButtonType.hashCode()) * 31;
        String str = this.buttonName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stepName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode3 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UiStepButtonEventData(type=" + this.type + ", buttonName=" + this.buttonName + ", stepName=" + this.stepName + ", metadata=" + this.metadata + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public UiStepButtonEventData(@Nullable UiStepButtonType uiStepButtonType, @InterfaceC11872g(name = "button_name") @Nullable String str, @InterfaceC11872g(name = "step_name") @Nullable String str2, @Nullable TrackingMetadata trackingMetadata) {
        this.type = uiStepButtonType;
        this.buttonName = str;
        this.stepName = str2;
        this.metadata = trackingMetadata;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
      (wrap com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType:?: TERNARY null = ((wrap int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType) : (r2v0 com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
      (wrap com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata:?: TERNARY null = ((wrap int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata) : (r5v0 com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata))
     A[MD:(com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void (m)] (LINE:7) call: com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonEventData.<init>(com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void type: THIS */
    public /* synthetic */ UiStepButtonEventData(UiStepButtonType uiStepButtonType, String str, String str2, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : uiStepButtonType, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : trackingMetadata);
    }
}

package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "pageName", "", "stepName", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getPageName", "()Ljava/lang/String;", "getStepName", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final /* data */ class TrackingUiEvent implements TrackingEventData {

    @Nullable
    private final TrackingMetadata metadata;

    @Nullable
    private final String pageName;

    @Nullable
    private final String stepName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TrackingUiEvent(@Nullable String str, @Nullable String str2, @Nullable TrackingMetadata trackingMetadata) {
        this.pageName = str;
        this.stepName = str2;
        this.metadata = trackingMetadata;
    }

    public static /* synthetic */ TrackingUiEvent copy$default(TrackingUiEvent trackingUiEvent, String str, String str2, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = trackingUiEvent.pageName;
        }
        if ((i10 & 2) != 0) {
            str2 = trackingUiEvent.stepName;
        }
        if ((i10 & 4) != 0) {
            trackingMetadata = trackingUiEvent.metadata;
        }
        return trackingUiEvent.copy(str, str2, trackingMetadata);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStepName() {
        return this.stepName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final TrackingUiEvent copy(@Nullable String pageName, @Nullable String stepName, @Nullable TrackingMetadata metadata) {
        return new TrackingUiEvent(pageName, stepName, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackingUiEvent)) {
            return false;
        }
        TrackingUiEvent trackingUiEvent = (TrackingUiEvent) other;
        return Intrinsics.m31980c(this.pageName, trackingUiEvent.pageName) && Intrinsics.m31980c(this.stepName, trackingUiEvent.stepName) && Intrinsics.m31980c(this.metadata, trackingUiEvent.metadata);
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
        String str = this.pageName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stepName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode2 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TrackingUiEvent(pageName=" + this.pageName + ", stepName=" + this.stepName + ", metadata=" + this.metadata + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (r1v0 java.lang.String)
      (r2v0 java.lang.String)
      (wrap com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata) : (r3v0 com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata))
     A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.tracking.model.TrackingUiEvent.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void type: THIS */
    public /* synthetic */ TrackingUiEvent(String str, String str2, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : trackingMetadata);
    }
}

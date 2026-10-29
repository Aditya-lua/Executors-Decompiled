package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/DebugLogEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "category", "", "message", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getCategory", "()Ljava/lang/String;", "getMessage", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final /* data */ class DebugLogEventData implements TrackingEventData {

    @Nullable
    private final String category;

    @Nullable
    private final String message;

    @Nullable
    private final TrackingMetadata metadata;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DebugLogEventData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ DebugLogEventData copy$default(DebugLogEventData debugLogEventData, String str, String str2, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = debugLogEventData.category;
        }
        if ((i10 & 2) != 0) {
            str2 = debugLogEventData.message;
        }
        if ((i10 & 4) != 0) {
            trackingMetadata = debugLogEventData.metadata;
        }
        return debugLogEventData.copy(str, str2, trackingMetadata);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final DebugLogEventData copy(@Nullable String category, @Nullable String message, @Nullable TrackingMetadata metadata) {
        return new DebugLogEventData(category, message, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DebugLogEventData)) {
            return false;
        }
        DebugLogEventData debugLogEventData = (DebugLogEventData) other;
        return Intrinsics.m31980c(this.category, debugLogEventData.category) && Intrinsics.m31980c(this.message, debugLogEventData.message) && Intrinsics.m31980c(this.metadata, debugLogEventData.metadata);
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    @Nullable
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        String str = this.category;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode2 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DebugLogEventData(category=" + this.category + ", message=" + this.message + ", metadata=" + this.metadata + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public DebugLogEventData(@Nullable String str, @Nullable String str2, @Nullable TrackingMetadata trackingMetadata) {
        this.category = str;
        this.message = str2;
        this.metadata = trackingMetadata;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
      (wrap com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata:?: TERNARY null = ((wrap int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata) : (r4v0 com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata))
     A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void (m)] (LINE:6) call: com.withpersona.sdk2.inquiry.tracking.model.DebugLogEventData.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void type: THIS */
    public /* synthetic */ DebugLogEventData(String str, String str2, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : trackingMetadata);
    }
}

package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jx\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u000eHÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00065"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "phase", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;", "category", "", "errorMessage", "errorType", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorType;", "durationMs", "", "authMethod", "dataGroupType", "cardStatusWord", "", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getPhase", "()Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;", "getCategory", "()Ljava/lang/String;", "getErrorMessage", "getErrorType", "()Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorType;", "getDurationMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAuthMethod", "getDataGroupType", "getCardStatusWord", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "equals", "", "other", "", "hashCode", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final /* data */ class NfcErrorEventData implements TrackingEventData {

    @Nullable
    private final String authMethod;

    @Nullable
    private final Integer cardStatusWord;

    @Nullable
    private final String category;

    @Nullable
    private final String dataGroupType;

    @Nullable
    private final Long durationMs;

    @Nullable
    private final String errorMessage;

    @Nullable
    private final NfcErrorType errorType;

    @Nullable
    private final TrackingMetadata metadata;

    @NotNull
    private final NfcScanPhase phase;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NfcErrorEventData(@NotNull NfcScanPhase nfcScanPhase, @Nullable String str, @InterfaceC11872g(name = "error_message") @Nullable String str2, @InterfaceC11872g(name = "error_type") @Nullable NfcErrorType nfcErrorType, @InterfaceC11872g(name = "duration_ms") @Nullable Long l10, @InterfaceC11872g(name = "auth_method") @Nullable String str3, @InterfaceC11872g(name = "data_group_type") @Nullable String str4, @InterfaceC11872g(name = "card_status_word") @Nullable Integer num, @Nullable TrackingMetadata trackingMetadata) {
        nfcScanPhase.getClass();
        this.phase = nfcScanPhase;
        this.category = str;
        this.errorMessage = str2;
        this.errorType = nfcErrorType;
        this.durationMs = l10;
        this.authMethod = str3;
        this.dataGroupType = str4;
        this.cardStatusWord = num;
        this.metadata = trackingMetadata;
    }

    public static /* synthetic */ NfcErrorEventData copy$default(NfcErrorEventData nfcErrorEventData, NfcScanPhase nfcScanPhase, String str, String str2, NfcErrorType nfcErrorType, Long l10, String str3, String str4, Integer num, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nfcScanPhase = nfcErrorEventData.phase;
        }
        if ((i10 & 2) != 0) {
            str = nfcErrorEventData.category;
        }
        if ((i10 & 4) != 0) {
            str2 = nfcErrorEventData.errorMessage;
        }
        if ((i10 & 8) != 0) {
            nfcErrorType = nfcErrorEventData.errorType;
        }
        if ((i10 & 16) != 0) {
            l10 = nfcErrorEventData.durationMs;
        }
        if ((i10 & 32) != 0) {
            str3 = nfcErrorEventData.authMethod;
        }
        if ((i10 & 64) != 0) {
            str4 = nfcErrorEventData.dataGroupType;
        }
        if ((i10 & 128) != 0) {
            num = nfcErrorEventData.cardStatusWord;
        }
        if ((i10 & 256) != 0) {
            trackingMetadata = nfcErrorEventData.metadata;
        }
        Integer num2 = num;
        TrackingMetadata trackingMetadata2 = trackingMetadata;
        String str5 = str3;
        String str6 = str4;
        Long l11 = l10;
        String str7 = str2;
        return nfcErrorEventData.copy(nfcScanPhase, str, str7, nfcErrorType, l11, str5, str6, num2, trackingMetadata2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NfcScanPhase getPhase() {
        return this.phase;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final NfcErrorType getErrorType() {
        return this.errorType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getDurationMs() {
        return this.durationMs;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAuthMethod() {
        return this.authMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDataGroupType() {
        return this.dataGroupType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getCardStatusWord() {
        return this.cardStatusWord;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final NfcErrorEventData copy(@NotNull NfcScanPhase phase, @Nullable String category, @InterfaceC11872g(name = "error_message") @Nullable String errorMessage, @InterfaceC11872g(name = "error_type") @Nullable NfcErrorType errorType, @InterfaceC11872g(name = "duration_ms") @Nullable Long durationMs, @InterfaceC11872g(name = "auth_method") @Nullable String authMethod, @InterfaceC11872g(name = "data_group_type") @Nullable String dataGroupType, @InterfaceC11872g(name = "card_status_word") @Nullable Integer cardStatusWord, @Nullable TrackingMetadata metadata) {
        phase.getClass();
        return new NfcErrorEventData(phase, category, errorMessage, errorType, durationMs, authMethod, dataGroupType, cardStatusWord, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcErrorEventData)) {
            return false;
        }
        NfcErrorEventData nfcErrorEventData = (NfcErrorEventData) other;
        return this.phase == nfcErrorEventData.phase && Intrinsics.m31980c(this.category, nfcErrorEventData.category) && Intrinsics.m31980c(this.errorMessage, nfcErrorEventData.errorMessage) && this.errorType == nfcErrorEventData.errorType && Intrinsics.m31980c(this.durationMs, nfcErrorEventData.durationMs) && Intrinsics.m31980c(this.authMethod, nfcErrorEventData.authMethod) && Intrinsics.m31980c(this.dataGroupType, nfcErrorEventData.dataGroupType) && Intrinsics.m31980c(this.cardStatusWord, nfcErrorEventData.cardStatusWord) && Intrinsics.m31980c(this.metadata, nfcErrorEventData.metadata);
    }

    @Nullable
    public final String getAuthMethod() {
        return this.authMethod;
    }

    @Nullable
    public final Integer getCardStatusWord() {
        return this.cardStatusWord;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getDataGroupType() {
        return this.dataGroupType;
    }

    @Nullable
    public final Long getDurationMs() {
        return this.durationMs;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final NfcErrorType getErrorType() {
        return this.errorType;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    @Nullable
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final NfcScanPhase getPhase() {
        return this.phase;
    }

    public int hashCode() {
        int iHashCode = this.phase.hashCode() * 31;
        String str = this.category;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        NfcErrorType nfcErrorType = this.errorType;
        int iHashCode4 = (iHashCode3 + (nfcErrorType == null ? 0 : nfcErrorType.hashCode())) * 31;
        Long l10 = this.durationMs;
        int iHashCode5 = (iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str3 = this.authMethod;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dataGroupType;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.cardStatusWord;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode8 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NfcErrorEventData(phase=" + this.phase + ", category=" + this.category + ", errorMessage=" + this.errorMessage + ", errorType=" + this.errorType + ", durationMs=" + this.durationMs + ", authMethod=" + this.authMethod + ", dataGroupType=" + this.dataGroupType + ", cardStatusWord=" + this.cardStatusWord + ", metadata=" + this.metadata + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
      (r2v0 com.withpersona.sdk2.inquiry.tracking.model.NfcScanPhase)
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0006: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
      (wrap com.withpersona.sdk2.inquiry.tracking.model.NfcErrorType:?: TERNARY null = ((wrap int:0x000b: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.NfcErrorType) : (r5v0 com.withpersona.sdk2.inquiry.tracking.model.NfcErrorType))
      (wrap java.lang.Long:?: TERNARY null = ((wrap int:0x0010: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0015: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001a: ARITH (r11v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
      (wrap java.lang.Integer:?: TERNARY null = ((wrap int:0x001f: ARITH (r11v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
      (wrap com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata:?: TERNARY null = ((wrap int:0x0024: ARITH (r11v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata) : (r10v0 com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata))
     A[MD:(com.withpersona.sdk2.inquiry.tracking.model.NfcScanPhase, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.NfcErrorType, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void (m)] (LINE:11) call: com.withpersona.sdk2.inquiry.tracking.model.NfcErrorEventData.<init>(com.withpersona.sdk2.inquiry.tracking.model.NfcScanPhase, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.NfcErrorType, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata):void type: THIS */
    public /* synthetic */ NfcErrorEventData(NfcScanPhase nfcScanPhase, String str, String str2, NfcErrorType nfcErrorType, Long l10, String str3, String str4, Integer num, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nfcScanPhase, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : nfcErrorType, (i10 & 16) != 0 ? null : l10, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : num, (i10 & 256) != 0 ? null : trackingMetadata);
    }
}

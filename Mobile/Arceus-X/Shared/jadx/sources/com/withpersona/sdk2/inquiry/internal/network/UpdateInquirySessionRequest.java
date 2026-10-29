package com.withpersona.sdk2.inquiry.internal.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0004\n\u000b\f\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\r"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;", "data", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;", "()Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;", "b", "Data", "Attributes", "AppdomeThreatEvent", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class UpdateInquirySessionRequest {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Data data;

    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\f\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\n¨\u0006\r"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$AppdomeThreatEvent;", "", "", "name", "timestamp", "reasonData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "c", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class AppdomeThreatEvent {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String timestamp;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String reasonData;

        public AppdomeThreatEvent(@NotNull String name, @NotNull String timestamp, @NotNull String reasonData) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(reasonData, "reasonData");
            this.name = name;
            this.timestamp = timestamp;
            this.reasonData = reasonData;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getReasonData() {
            return this.reasonData;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }
    }

    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u0014\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b\u0018\u0010%R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006'"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Attributes;", "", "", "gpsLongitude", "gpsLatitude", "", "gpsPrecision", "", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$AppdomeThreatEvent;", "appdomeThreatEvents", "silentNetworkAuthenticationCode", "silentNetworkAuthenticationErrorName", "silentNetworkAuthenticationErrorMessage", "", "timeSinceBootMs", "totalMemoryBytes", "availableStorageBytes", "phoneCallStatus", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "a", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "b", "c", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "g", "f", "i", "h", "Ljava/lang/Long;", "j", "()Ljava/lang/Long;", "k", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Attributes {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final Double gpsLongitude;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Double gpsLatitude;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final String gpsPrecision;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final List<AppdomeThreatEvent> appdomeThreatEvents;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public final String silentNetworkAuthenticationCode;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public final String silentNetworkAuthenticationErrorName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public final String silentNetworkAuthenticationErrorMessage;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public final Long timeSinceBootMs;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public final Long totalMemoryBytes;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public final Long availableStorageBytes;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public final String phoneCallStatus;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Attributes() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final List<AppdomeThreatEvent> m18681a() {
            return this.appdomeThreatEvents;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Long getAvailableStorageBytes() {
            return this.availableStorageBytes;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Double getGpsLatitude() {
            return this.gpsLatitude;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Double getGpsLongitude() {
            return this.gpsLongitude;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getGpsPrecision() {
            return this.gpsPrecision;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getPhoneCallStatus() {
            return this.phoneCallStatus;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getSilentNetworkAuthenticationCode() {
            return this.silentNetworkAuthenticationCode;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSilentNetworkAuthenticationErrorMessage() {
            return this.silentNetworkAuthenticationErrorMessage;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getSilentNetworkAuthenticationErrorName() {
            return this.silentNetworkAuthenticationErrorName;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final Long getTimeSinceBootMs() {
            return this.timeSinceBootMs;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final Long getTotalMemoryBytes() {
            return this.totalMemoryBytes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Attributes(@Nullable Double d10, @Nullable Double d11, @Nullable String str, @Nullable List<AppdomeThreatEvent> list, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable String str5) {
            this.gpsLongitude = d10;
            this.gpsLatitude = d11;
            this.gpsPrecision = str;
            this.appdomeThreatEvents = list;
            this.silentNetworkAuthenticationCode = str2;
            this.silentNetworkAuthenticationErrorName = str3;
            this.silentNetworkAuthenticationErrorMessage = str4;
            this.timeSinceBootMs = l10;
            this.totalMemoryBytes = l11;
            this.availableStorageBytes = l12;
            this.phoneCallStatus = str5;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0046: CONSTRUCTOR 
          (wrap java.lang.Double:?: TERNARY null = ((wrap int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r2v0 java.lang.Double))
          (wrap java.lang.Double:?: TERNARY null = ((wrap int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r3v0 java.lang.Double))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
          (wrap java.util.List:?: TERNARY null = ((wrap int:0x0010: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0015: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001a: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001f: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
          (wrap java.lang.Long:?: TERNARY null = ((wrap int:0x0024: ARITH (r13v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r9v0 java.lang.Long))
          (wrap java.lang.Long:?: TERNARY null = ((wrap int:0x0029: ARITH (r13v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r10v0 java.lang.Long))
          (wrap java.lang.Long:?: TERNARY null = ((wrap int:0x002e: ARITH (r13v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r11v0 java.lang.Long))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0033: ARITH (r13v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
         A[MD:(java.lang.Double, java.lang.Double, java.lang.String, java.util.List<com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest$AppdomeThreatEvent>, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String):void (m)] (LINE:14) call: com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest.Attributes.<init>(java.lang.Double, java.lang.Double, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String):void type: THIS */
        public /* synthetic */ Attributes(Double d10, Double d11, String str, List list, String str2, String str3, String str4, Long l10, Long l11, Long l12, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : d10, (i10 & 2) != 0 ? null : d11, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : l10, (i10 & 256) != 0 ? null : l11, (i10 & 512) != 0 ? null : l12, (i10 & 1024) != 0 ? null : str5);
        }
    }

    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Attributes;", "attributes", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Attributes;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Attributes;", "()Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Attributes;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Data {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Attributes attributes;

        public Data(@NotNull Attributes attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.attributes = attributes;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Attributes getAttributes() {
            return this.attributes;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0019\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;", "", "<init>", "()V", "", "gpsLongitude", "gpsLatitude", "", "gpsPrecision", "", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$AppdomeThreatEvent;", "appdomeThreatEvents", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "d", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "silentNetworkAuthenticationCode", "silentNetworkAuthenticationErrorName", "silentNetworkAuthenticationErrorMessage", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "", "timeSinceBootMs", "totalMemoryBytes", "availableStorageBytes", "phoneCallStatus", "a", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ UpdateInquirySessionRequest m18693c(Companion companion, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                str3 = null;
            }
            return companion.m18695b(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final UpdateInquirySessionRequest m18694a(@Nullable Long timeSinceBootMs, @Nullable Long totalMemoryBytes, @Nullable Long availableStorageBytes, @Nullable String phoneCallStatus) {
            return new UpdateInquirySessionRequest(new Data(new Attributes(null, null, null, null, null, null, null, timeSinceBootMs, totalMemoryBytes, availableStorageBytes, phoneCallStatus, 127, null)));
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final UpdateInquirySessionRequest m18695b(@Nullable String silentNetworkAuthenticationCode, @Nullable String silentNetworkAuthenticationErrorName, @Nullable String silentNetworkAuthenticationErrorMessage) {
            return new UpdateInquirySessionRequest(new Data(new Attributes(null, null, null, null, silentNetworkAuthenticationCode, silentNetworkAuthenticationErrorName, silentNetworkAuthenticationErrorMessage, null, null, null, null, 1935, null)));
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final UpdateInquirySessionRequest m18696d(@Nullable Double gpsLongitude, @Nullable Double gpsLatitude, @Nullable String gpsPrecision, @Nullable List<AppdomeThreatEvent> appdomeThreatEvents) {
            return new UpdateInquirySessionRequest(new Data(new Attributes(gpsLongitude, gpsLatitude, gpsPrecision, appdomeThreatEvents, null, null, null, null, null, null, null, 2032, null)));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public UpdateInquirySessionRequest(@NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Data getData() {
        return this.data;
    }
}

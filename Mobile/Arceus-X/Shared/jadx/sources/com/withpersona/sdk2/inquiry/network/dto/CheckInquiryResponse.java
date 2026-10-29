package com.withpersona.sdk2.inquiry.network.dto;

import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0015\u0016\u0017\u0018\u0019B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "", "data", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;", "token", "", "included", "", "Lcom/withpersona/sdk2/inquiry/network/dto/Included;", "meta", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Meta;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Meta;)V", "getData", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;", "getToken", "()Ljava/lang/String;", "getIncluded", "()Ljava/util/List;", "getMeta", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Meta;", "Meta", "Data", "Attributes", "WaitForTransitionConfig", "PollingMode", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class CheckInquiryResponse {

    @NotNull
    private final Data data;

    @Nullable
    private final List<Included> included;

    @Nullable
    private final Meta meta;

    @Nullable
    private final String token;

    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;", "", "selectedCountryCode", "", NotificationCompat.CATEGORY_STATUS, "nextStep", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "fields", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "waitForTransitionConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;", "environment", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;Ljava/lang/String;Ljava/lang/String;)V", "getSelectedCountryCode", "()Ljava/lang/String;", "getStatus", "getNextStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "getFields", "()Ljava/util/Map;", "getWaitForTransitionConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;", "getEnvironment", "getRedirectUri", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Attributes {

        @Nullable
        private final String environment;

        @Nullable
        private final Map<String, InquiryField> fields;

        @NotNull
        private final NextStep nextStep;

        @Nullable
        private final String redirectUri;

        @Nullable
        private final String selectedCountryCode;

        @Nullable
        private final String status;

        @NotNull
        private final WaitForTransitionConfig waitForTransitionConfig;

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.network.dto.InquiryField> */
        /* JADX WARN: Multi-variable type inference failed */
        public Attributes(@Nullable String str, @Nullable String str2, @NotNull NextStep nextStep, @Nullable Map<String, ? extends InquiryField> map, @InterfaceC11872g(name = "waitForTransition") @NotNull WaitForTransitionConfig waitForTransitionConfig, @Nullable String str3, @Nullable String str4) {
            Intrinsics.checkNotNullParameter(nextStep, "nextStep");
            Intrinsics.checkNotNullParameter(waitForTransitionConfig, "waitForTransitionConfig");
            this.selectedCountryCode = str;
            this.status = str2;
            this.nextStep = nextStep;
            this.fields = map;
            this.waitForTransitionConfig = waitForTransitionConfig;
            this.environment = str3;
            this.redirectUri = str4;
        }

        @Nullable
        public final String getEnvironment() {
            return this.environment;
        }

        @Nullable
        public final Map<String, InquiryField> getFields() {
            return this.fields;
        }

        @NotNull
        public final NextStep getNextStep() {
            return this.nextStep;
        }

        @Nullable
        public final String getRedirectUri() {
            return this.redirectUri;
        }

        @Nullable
        public final String getSelectedCountryCode() {
            return this.selectedCountryCode;
        }

        @Nullable
        public final String getStatus() {
            return this.status;
        }

        @NotNull
        public final WaitForTransitionConfig getWaitForTransitionConfig() {
            return this.waitForTransitionConfig;
        }
    }

    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "", "<init>", "(Ljava/lang/String;I)V", "Blocking", "Background", "None", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum PollingMode {
        Blocking,
        Background,
        None;

        private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

        @NotNull
        public static InterfaceC10707a<PollingMode> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;", "", "intervalMs", "", "maxAttempts", "pollingMode", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;)V", "getIntervalMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMaxAttempts", "getPollingMode", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class WaitForTransitionConfig {

        @Nullable
        private final Long intervalMs;

        @Nullable
        private final Long maxAttempts;

        @NotNull
        private final PollingMode pollingMode;

        public WaitForTransitionConfig(@Nullable Long l10, @Nullable Long l11, @NotNull PollingMode pollingMode) {
            Intrinsics.checkNotNullParameter(pollingMode, "pollingMode");
            this.intervalMs = l10;
            this.maxAttempts = l11;
            this.pollingMode = pollingMode;
        }

        @Nullable
        public final Long getIntervalMs() {
            return this.intervalMs;
        }

        @Nullable
        public final Long getMaxAttempts() {
            return this.maxAttempts;
        }

        @NotNull
        public final PollingMode getPollingMode() {
            return this.pollingMode;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.Included> */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckInquiryResponse(@NotNull Data data, @Nullable String str, @Nullable List<? extends Included> list, @Nullable Meta meta) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.token = str;
        this.included = list;
        this.meta = meta;
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    @Nullable
    public final List<Included> getIncluded() {
        return this.included;
    }

    @Nullable
    public final Meta getMeta() {
        return this.meta;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Meta;", "", "accessToken", "", "trackingEventsUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getTrackingEventsUrl", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Meta {

        @Nullable
        private final String accessToken;

        @Nullable
        private final String trackingEventsUrl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Meta(@Nullable String str, @Nullable String str2) {
            this.accessToken = str;
            this.trackingEventsUrl = str2;
        }

        @Nullable
        public final String getAccessToken() {
            return this.accessToken;
        }

        @Nullable
        public final String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (r1v0 java.lang.String)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
         A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:4) call: com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse.Meta.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Meta(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2);
        }
    }

    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;", "", "id", "", Payload.TYPE, "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;)V", "getId", "()Ljava/lang/String;", "getType", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Data {

        @NotNull
        private final Attributes attributes;

        @NotNull
        private final String id;

        @NotNull
        private final String type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Data(@NotNull String id2, @NotNull String type, @NotNull Attributes attributes) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.id = id2;
            this.type = type;
            this.attributes = attributes;
        }

        @NotNull
        public final Attributes getAttributes() {
            return this.attributes;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
          (r9v0 java.lang.String)
          (r10v0 java.lang.String)
          (wrap com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$Attributes:?: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$Attributes:0x0018: CONSTRUCTOR 
          (null java.lang.String)
          (null java.lang.String)
          (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$Unknown:0x0006: SGET  A[WRAPPED] (LINE:6) com.withpersona.sdk2.inquiry.network.dto.NextStep.Unknown.INSTANCE com.withpersona.sdk2.inquiry.network.dto.NextStep$Unknown)
          (null java.util.Map)
          (wrap com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$WaitForTransitionConfig:0x000d: CONSTRUCTOR 
          (null java.lang.Long)
          (null java.lang.Long)
          (wrap com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$PollingMode:0x000a: SGET  A[WRAPPED] (LINE:8) com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse.PollingMode.None com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$PollingMode)
         A[MD:(java.lang.Long, java.lang.Long, com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$PollingMode):void (m), WRAPPED] (LINE:9) call: com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse.WaitForTransitionConfig.<init>(java.lang.Long, java.lang.Long, com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$PollingMode):void type: CONSTRUCTOR)
          (null java.lang.String)
          (null java.lang.String)
         A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.NextStep, java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.network.dto.InquiryField>, com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$WaitForTransitionConfig, java.lang.String, java.lang.String):void (m), WRAPPED] (LINE:10) call: com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse.Attributes.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.NextStep, java.util.Map, com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$WaitForTransitionConfig, java.lang.String, java.lang.String):void type: CONSTRUCTOR) : (r11v0 com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$Attributes))
         A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$Attributes):void (m)] (LINE:11) call: com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse.Data.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$Attributes):void type: THIS */
        public /* synthetic */ Data(String str, String str2, Attributes attributes, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? new Attributes(null, null, NextStep.Unknown.INSTANCE, null, new WaitForTransitionConfig(null, null, PollingMode.None), null, null) : attributes);
        }
    }
}

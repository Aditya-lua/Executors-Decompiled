package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.network.dto.InquirySessionData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "data", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse$Metadata;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse$Metadata;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "()Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "b", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse$Metadata;", "()Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse$Metadata;", "Metadata", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class ExchangeOneTimeLinkCodeResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final InquirySessionData data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Metadata meta;

    public ExchangeOneTimeLinkCodeResponse(@Nullable InquirySessionData inquirySessionData, @Nullable Metadata metadata) {
        this.data = inquirySessionData;
        this.meta = metadata;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final InquirySessionData getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Metadata getMeta() {
        return this.meta;
    }

    @kotlin.Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse$Metadata;", "", "", "accessToken", "trackingEventsUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class Metadata {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final String accessToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Metadata(@Nullable String str, @Nullable String str2) {
            this.accessToken = str;
            this.trackingEventsUrl = str2;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) other;
            return Intrinsics.m31980c(this.accessToken, metadata.accessToken) && Intrinsics.m31980c(this.trackingEventsUrl, metadata.trackingEventsUrl);
        }

        public int hashCode() {
            String str = this.accessToken;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.trackingEventsUrl;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Metadata(accessToken=" + this.accessToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (r1v0 java.lang.String)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
         A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:4) call: com.withpersona.sdk2.inquiry.internal.network.ExchangeOneTimeLinkCodeResponse.Metadata.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Metadata(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2);
        }
    }
}

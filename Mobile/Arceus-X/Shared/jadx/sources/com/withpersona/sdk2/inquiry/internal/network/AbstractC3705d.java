package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/d;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/d$a;", "Lcom/withpersona/sdk2/inquiry/internal/network/d$b;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC3705d {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.d$a, reason: from toString */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/d$a;", "Lcom/withpersona/sdk2/inquiry/internal/network/d;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Error extends AbstractC3705d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final InternalErrorInfo cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull InternalErrorInfo cause) {
            super(null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final InternalErrorInfo getCause() {
            return this.cause;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.m31980c(this.cause, ((Error) other).cause);
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(cause=" + this.cause + ")";
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.d$b, reason: from toString */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/d$b;", "Lcom/withpersona/sdk2/inquiry/internal/network/d;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "trackingEventsUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "d", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Success extends AbstractC3705d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String sessionToken;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String inquiryId, @Nullable String str, @Nullable InquirySessionConfig inquirySessionConfig, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            this.inquiryId = inquiryId;
            this.sessionToken = str;
            this.inquirySessionConfig = inquirySessionConfig;
            this.trackingEventsUrl = str2;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.m31980c(this.inquiryId, success.inquiryId) && Intrinsics.m31980c(this.sessionToken, success.sessionToken) && Intrinsics.m31980c(this.inquirySessionConfig, success.inquirySessionConfig) && Intrinsics.m31980c(this.trackingEventsUrl, success.trackingEventsUrl);
        }

        public int hashCode() {
            int iHashCode = this.inquiryId.hashCode() * 31;
            String str = this.sessionToken;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            InquirySessionConfig inquirySessionConfig = this.inquirySessionConfig;
            int iHashCode3 = (iHashCode2 + (inquirySessionConfig == null ? 0 : inquirySessionConfig.hashCode())) * 31;
            String str2 = this.trackingEventsUrl;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Success(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", inquirySessionConfig=" + this.inquirySessionConfig + ", trackingEventsUrl=" + this.trackingEventsUrl + ")";
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.network.d.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC3705d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC3705d() {
    }
}

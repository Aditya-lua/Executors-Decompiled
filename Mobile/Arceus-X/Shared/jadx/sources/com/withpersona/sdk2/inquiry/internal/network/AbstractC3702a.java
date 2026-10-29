package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/a;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/a$a;", "Lcom/withpersona/sdk2/inquiry/internal/network/a$b;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC3702a {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.a$a, reason: from toString */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/a$a;", "Lcom/withpersona/sdk2/inquiry/internal/network/a;", "", "debugMessage", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Error extends AbstractC3702a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final String debugMessage;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final InternalErrorInfo cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@Nullable String str, @NotNull InternalErrorInfo cause) {
            super(null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.debugMessage = str;
            this.cause = cause;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final InternalErrorInfo getCause() {
            return this.cause;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDebugMessage() {
            return this.debugMessage;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.m31980c(this.debugMessage, error.debugMessage) && Intrinsics.m31980c(this.cause, error.cause);
        }

        public int hashCode() {
            String str = this.debugMessage;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.cause.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(debugMessage=" + this.debugMessage + ", cause=" + this.cause + ")";
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.a$b, reason: from toString */
    @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u001d\u0010\r¨\u0006!"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/a$b;", "Lcom/withpersona/sdk2/inquiry/internal/network/a;", "", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "nextStep", "fallbackSessionToken", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "inquirySession", "redirectUri", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "getNextStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "c", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "()Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "e", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Success extends AbstractC3702a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final NextStep nextStep;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        public final String fallbackSessionToken;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        public final InquirySessionDataWrapper inquirySession;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
          (r2v0 java.lang.String)
          (r3v0 com.withpersona.sdk2.inquiry.network.dto.NextStep)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
          (wrap com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper:?: TERNARY null = ((wrap int:0x0006: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper) : (r5v0 com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r7v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
         A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.NextStep, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper, java.lang.String):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.network.a.b.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.NextStep, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Success(String str, NextStep nextStep, String str2, InquirySessionDataWrapper inquirySessionDataWrapper, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, nextStep, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : inquirySessionDataWrapper, (i10 & 16) != 0 ? null : str3);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFallbackSessionToken() {
            return this.fallbackSessionToken;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final InquirySessionDataWrapper getInquirySession() {
            return this.inquirySession;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getRedirectUri() {
            return this.redirectUri;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.m31980c(this.inquiryId, success.inquiryId) && Intrinsics.m31980c(this.nextStep, success.nextStep) && Intrinsics.m31980c(this.fallbackSessionToken, success.fallbackSessionToken) && Intrinsics.m31980c(this.inquirySession, success.inquirySession) && Intrinsics.m31980c(this.redirectUri, success.redirectUri);
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.nextStep.hashCode()) * 31;
            String str = this.fallbackSessionToken;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            InquirySessionDataWrapper inquirySessionDataWrapper = this.inquirySession;
            int iHashCode3 = (iHashCode2 + (inquirySessionDataWrapper == null ? 0 : inquirySessionDataWrapper.hashCode())) * 31;
            String str2 = this.redirectUri;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Success(inquiryId=" + this.inquiryId + ", nextStep=" + this.nextStep + ", fallbackSessionToken=" + this.fallbackSessionToken + ", inquirySession=" + this.inquirySession + ", redirectUri=" + this.redirectUri + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String inquiryId, @NotNull NextStep nextStep, @Nullable String str, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(nextStep, "nextStep");
            this.inquiryId = inquiryId;
            this.nextStep = nextStep;
            this.fallbackSessionToken = str;
            this.inquirySession = inquirySessionDataWrapper;
            this.redirectUri = str2;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.network.a.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC3702a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC3702a() {
    }
}

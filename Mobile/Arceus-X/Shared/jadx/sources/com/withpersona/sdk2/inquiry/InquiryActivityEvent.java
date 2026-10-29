package com.withpersona.sdk2.inquiry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;", "", "CancelInquiry", "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;", "inquiry-dynamic-feature_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InquiryActivityEvent {

    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;", "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;", "skipBackendCall", "", "<init>", "(Z)V", "getSkipBackendCall", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "inquiry-dynamic-feature_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class CancelInquiry implements InquiryActivityEvent {
        private final boolean skipBackendCall;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public CancelInquiry() {
            this(false, 1, null);
        }

        public static /* synthetic */ CancelInquiry copy$default(CancelInquiry cancelInquiry, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = cancelInquiry.skipBackendCall;
            }
            return cancelInquiry.copy(z10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getSkipBackendCall() {
            return this.skipBackendCall;
        }

        @NotNull
        public final CancelInquiry copy(boolean skipBackendCall) {
            return new CancelInquiry(skipBackendCall);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CancelInquiry) && this.skipBackendCall == ((CancelInquiry) other).skipBackendCall;
        }

        public final boolean getSkipBackendCall() {
            return this.skipBackendCall;
        }

        public int hashCode() {
            return Boolean.hashCode(this.skipBackendCall);
        }

        @NotNull
        public String toString() {
            return "CancelInquiry(skipBackendCall=" + this.skipBackendCall + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public CancelInquiry(boolean z10) {
            this.skipBackendCall = z10;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (wrap boolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
         A[MD:(boolean):void (m)] (LINE:3) call: com.withpersona.sdk2.inquiry.InquiryActivityEvent.CancelInquiry.<init>(boolean):void type: THIS */
        public /* synthetic */ CancelInquiry(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }
    }
}

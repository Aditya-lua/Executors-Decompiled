package com.withpersona.sdk2.inquiry.internal.network;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest$Meta;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest$Meta;", "()Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest$Meta;", "Meta", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class VerifyDeviceIntegrityRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Meta meta;

    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest$Meta;", "", "", "packageName", "integrityToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Meta {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final String packageName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String integrityToken;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        public Meta() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIntegrityToken() {
            return this.integrityToken;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPackageName() {
            return this.packageName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Meta(@Nullable String str, @Nullable String str2) {
            this.packageName = str;
            this.integrityToken = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
         A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.internal.network.VerifyDeviceIntegrityRequest.Meta.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Meta(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public VerifyDeviceIntegrityRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public VerifyDeviceIntegrityRequest(@Nullable Meta meta) {
        this.meta = meta;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (wrap com.withpersona.sdk2.inquiry.internal.network.VerifyDeviceIntegrityRequest$Meta:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.internal.network.VerifyDeviceIntegrityRequest$Meta) : (r1v0 com.withpersona.sdk2.inquiry.internal.network.VerifyDeviceIntegrityRequest$Meta))
     A[MD:(com.withpersona.sdk2.inquiry.internal.network.VerifyDeviceIntegrityRequest$Meta):void (m)] (LINE:3) call: com.withpersona.sdk2.inquiry.internal.network.VerifyDeviceIntegrityRequest.<init>(com.withpersona.sdk2.inquiry.internal.network.VerifyDeviceIntegrityRequest$Meta):void type: THIS */
    public /* synthetic */ VerifyDeviceIntegrityRequest(Meta meta, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : meta);
    }
}

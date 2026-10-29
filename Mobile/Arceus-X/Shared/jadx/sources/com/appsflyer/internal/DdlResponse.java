package com.appsflyer.internal;

import com.appsflyer.share.deeplink.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.appsflyer.internal.AFa1gSDK, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, m31665d2 = {"Lcom/appsflyer/internal/AFa1gSDK;", "", "", "p0", "Lcom/appsflyer/share/deeplink/DeepLink;", "p1", "<init>", "(ZLcom/appsflyer/share/deeplink/DeepLink;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AFLogger", "Z", "AFKeystoreWrapper", "Lcom/appsflyer/share/deeplink/DeepLink;", "unregisterClient"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final /* data */ class DdlResponse {

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata and from toString */
    @Nullable
    public final DeepLink deepLink;

    /* JADX INFO: renamed from: AFLogger, reason: from kotlin metadata and from toString */
    public final boolean secondPing;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DdlResponse(boolean z10, @Nullable DeepLink deepLink) {
        this.secondPing = z10;
        this.deepLink = deepLink;
    }

    public final boolean equals(@Nullable Object p8) {
        if (this == p8) {
            return true;
        }
        if (!(p8 instanceof DdlResponse)) {
            return false;
        }
        DdlResponse ddlResponse = (DdlResponse) p8;
        return this.secondPing == ddlResponse.secondPing && Intrinsics.m31980c(this.deepLink, ddlResponse.deepLink);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.secondPing) * 31;
        DeepLink deepLink = this.deepLink;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @NotNull
    public final String toString() {
        return "DdlResponse(secondPing=" + this.secondPing + ", deepLink=" + this.deepLink + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
      (wrap boolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
      (wrap com.appsflyer.share.deeplink.DeepLink:?: TERNARY null = ((wrap int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.appsflyer.share.deeplink.DeepLink) : (r2v0 com.appsflyer.share.deeplink.DeepLink))
     A[MD:(boolean, com.appsflyer.share.deeplink.DeepLink):void (m)] (LINE:2) call: com.appsflyer.internal.AFa1gSDK.<init>(boolean, com.appsflyer.share.deeplink.DeepLink):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ DdlResponse(boolean z10, DeepLink deepLink, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? null : deepLink);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public DdlResponse() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}

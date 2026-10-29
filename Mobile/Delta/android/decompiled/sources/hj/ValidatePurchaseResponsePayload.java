package hj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hj.b, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, d2 = {"Lhj/b;", "", "", "userId", "", "checkoutSessionId", "Lcom/roblox/client/purchase/a$d;", "failureReason", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lcom/roblox/client/purchase/a$d;)V", "", "e", "()Z", "d", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "Lcom/roblox/client/purchase/a$d;", "()Lcom/roblox/client/purchase/a$d;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ValidatePurchaseResponsePayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Long userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String checkoutSessionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final com.roblox.client.purchase.a.d failureReason;

    public ValidatePurchaseResponsePayload(@Nullable Long l10, @Nullable String str, @Nullable com.roblox.client.purchase.a.d dVar) {
        this.userId = l10;
        this.checkoutSessionId = str;
        this.failureReason = dVar;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCheckoutSessionId() {
        return this.checkoutSessionId;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.roblox.client.purchase.a.d getFailureReason() {
        return this.failureReason;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    @NotNull
    public final String d() {
        String strValueOf;
        Long l10 = this.userId;
        return (l10 == null || (strValueOf = String.valueOf(l10.longValue())) == null) ? "" : strValueOf;
    }

    public final boolean e() {
        Long l10 = this.userId;
        return l10 != null && l10.longValue() > 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidatePurchaseResponsePayload)) {
            return false;
        }
        ValidatePurchaseResponsePayload validatePurchaseResponsePayload = (ValidatePurchaseResponsePayload) other;
        return Intrinsics.c(this.userId, validatePurchaseResponsePayload.userId) && Intrinsics.c(this.checkoutSessionId, validatePurchaseResponsePayload.checkoutSessionId) && this.failureReason == validatePurchaseResponsePayload.failureReason;
    }

    public int hashCode() {
        Long l10 = this.userId;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        String str = this.checkoutSessionId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.roblox.client.purchase.a.d dVar = this.failureReason;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ValidatePurchaseResponsePayload(userId=" + this.userId + ", checkoutSessionId=" + this.checkoutSessionId + ", failureReason=" + this.failureReason + ")";
    }
}

package fj;

import ej.PurchaseInfoV2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fj.a, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0014B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b$\u0010\rR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b%\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001f\u0010\u0013¨\u0006&"}, d2 = {"Lfj/a;", "", "", "productId", "", "userId", "", "isInAppPurchase", "isSubscriptionPurchase", "checkoutSessionId", "<init>", "(Ljava/lang/String;JZZLjava/lang/String;)V", "i", "()Z", "Lej/i;", "j", "()Lej/i;", "f", "e", "()Ljava/lang/String;", "a", "(Ljava/lang/String;JZZLjava/lang/String;)Lfj/a;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "J", "d", "()J", "Z", "g", "h", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrentPurchaseContext {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final CurrentPurchaseContext f16621g = new CurrentPurchaseContext(null, 0, true, false, null, 16, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String productId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long userId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isInAppPurchase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isSubscriptionPurchase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String checkoutSessionId;

    public CurrentPurchaseContext(@Nullable String str, long j10, boolean z10, boolean z11, @Nullable String str2) {
        this.productId = str;
        this.userId = j10;
        this.isInAppPurchase = z10;
        this.isSubscriptionPurchase = z11;
        this.checkoutSessionId = str2;
    }

    @NotNull
    public final CurrentPurchaseContext a(@Nullable String productId, long userId, boolean isInAppPurchase, boolean isSubscriptionPurchase, @Nullable String checkoutSessionId) {
        return new CurrentPurchaseContext(productId, userId, isInAppPurchase, isSubscriptionPurchase, checkoutSessionId);
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCheckoutSessionId() {
        return this.checkoutSessionId;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    @NotNull
    public final String e() {
        return String.valueOf(this.userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentPurchaseContext)) {
            return false;
        }
        CurrentPurchaseContext currentPurchaseContext = (CurrentPurchaseContext) other;
        return Intrinsics.c(this.productId, currentPurchaseContext.productId) && this.userId == currentPurchaseContext.userId && this.isInAppPurchase == currentPurchaseContext.isInAppPurchase && this.isSubscriptionPurchase == currentPurchaseContext.isSubscriptionPurchase && Intrinsics.c(this.checkoutSessionId, currentPurchaseContext.checkoutSessionId);
    }

    public final boolean f() {
        return this.userId > 0;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsInAppPurchase() {
        return this.isInAppPurchase;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsSubscriptionPurchase() {
        return this.isSubscriptionPurchase;
    }

    public int hashCode() {
        String str = this.productId;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.userId)) * 31) + Boolean.hashCode(this.isInAppPurchase)) * 31) + Boolean.hashCode(this.isSubscriptionPurchase)) * 31;
        String str2 = this.checkoutSessionId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean i() {
        return f();
    }

    @NotNull
    public final PurchaseInfoV2 j() {
        long j10 = this.userId;
        String str = this.productId;
        if (str == null) {
            str = "";
        }
        return new PurchaseInfoV2(j10, str, this.isInAppPurchase);
    }

    @NotNull
    public String toString() {
        return "CurrentPurchaseContext(productId=" + this.productId + ", userId=" + this.userId + ", isInAppPurchase=" + this.isInAppPurchase + ", isSubscriptionPurchase=" + this.isSubscriptionPurchase + ", checkoutSessionId=" + this.checkoutSessionId + ")";
    }

    public /* synthetic */ CurrentPurchaseContext(String str, long j10, boolean z10, boolean z11, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : str2);
    }
}

package com.appsflyer.share;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0017\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, m31665d2 = {"Lcom/appsflyer/share/AFPurchaseDetails;", "", "Lcom/appsflyer/share/AFPurchaseType;", "purchaseType", "", "purchaseToken", "productId", "<init>", "(Lcom/appsflyer/share/AFPurchaseType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/appsflyer/share/AFPurchaseType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/appsflyer/share/AFPurchaseType;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/share/AFPurchaseDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/appsflyer/share/AFPurchaseType;", "getPurchaseType", "Ljava/lang/String;", "getPurchaseToken", "getProductId"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final /* data */ class AFPurchaseDetails {

    @NotNull
    private final String productId;

    @NotNull
    private final String purchaseToken;

    @NotNull
    private final AFPurchaseType purchaseType;

    public AFPurchaseDetails(@NotNull AFPurchaseType aFPurchaseType, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(aFPurchaseType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.purchaseType = aFPurchaseType;
        this.purchaseToken = str;
        this.productId = str2;
    }

    public static /* synthetic */ AFPurchaseDetails copy$default(AFPurchaseDetails aFPurchaseDetails, AFPurchaseType aFPurchaseType, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aFPurchaseType = aFPurchaseDetails.purchaseType;
        }
        if ((i10 & 2) != 0) {
            str = aFPurchaseDetails.purchaseToken;
        }
        if ((i10 & 4) != 0) {
            str2 = aFPurchaseDetails.productId;
        }
        return aFPurchaseDetails.copy(aFPurchaseType, str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AFPurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final AFPurchaseDetails copy(@NotNull AFPurchaseType purchaseType, @NotNull String purchaseToken, @NotNull String productId) {
        Intrinsics.checkNotNullParameter(purchaseType, "");
        Intrinsics.checkNotNullParameter(purchaseToken, "");
        Intrinsics.checkNotNullParameter(productId, "");
        return new AFPurchaseDetails(purchaseType, purchaseToken, productId);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AFPurchaseDetails)) {
            return false;
        }
        AFPurchaseDetails aFPurchaseDetails = (AFPurchaseDetails) other;
        return this.purchaseType == aFPurchaseDetails.purchaseType && Intrinsics.m31980c(this.purchaseToken, aFPurchaseDetails.purchaseToken) && Intrinsics.m31980c(this.productId, aFPurchaseDetails.productId);
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @NotNull
    public final AFPurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final int hashCode() {
        return (((this.purchaseType.hashCode() * 31) + this.purchaseToken.hashCode()) * 31) + this.productId.hashCode();
    }

    @NotNull
    public final String toString() {
        return "AFPurchaseDetails(purchaseType=" + this.purchaseType + ", purchaseToken=" + this.purchaseToken + ", productId=" + this.productId + ")";
    }
}

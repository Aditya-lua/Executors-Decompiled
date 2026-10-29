package com.roblox.client.purchase.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;", "", "providerPayload", "Lcom/roblox/client/purchase/model/ProviderPayload;", "<init>", "(Lcom/roblox/client/purchase/model/ProviderPayload;)V", "getProviderPayload", "()Lcom/roblox/client/purchase/model/ProviderPayload;", "setProviderPayload", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class PurchaseVerificationResponse {

    @SerializedName("providerPayload")
    @Nullable
    private ProviderPayload providerPayload;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseVerificationResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PurchaseVerificationResponse copy$default(PurchaseVerificationResponse purchaseVerificationResponse, ProviderPayload providerPayload, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            providerPayload = purchaseVerificationResponse.providerPayload;
        }
        return purchaseVerificationResponse.copy(providerPayload);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProviderPayload getProviderPayload() {
        return this.providerPayload;
    }

    @NotNull
    public final PurchaseVerificationResponse copy(@Nullable ProviderPayload providerPayload) {
        return new PurchaseVerificationResponse(providerPayload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PurchaseVerificationResponse) && Intrinsics.m31980c(this.providerPayload, ((PurchaseVerificationResponse) other).providerPayload);
    }

    @Nullable
    public final ProviderPayload getProviderPayload() {
        return this.providerPayload;
    }

    public int hashCode() {
        ProviderPayload providerPayload = this.providerPayload;
        if (providerPayload == null) {
            return 0;
        }
        return providerPayload.hashCode();
    }

    public final void setProviderPayload(@Nullable ProviderPayload providerPayload) {
        this.providerPayload = providerPayload;
    }

    @NotNull
    public String toString() {
        return "PurchaseVerificationResponse(providerPayload=" + this.providerPayload + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public PurchaseVerificationResponse(@Nullable ProviderPayload providerPayload) {
        this.providerPayload = providerPayload;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (wrap com.roblox.client.purchase.model.ProviderPayload:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.roblox.client.purchase.model.ProviderPayload) : (r1v0 com.roblox.client.purchase.model.ProviderPayload))
     A[MD:(com.roblox.client.purchase.model.ProviderPayload):void (m)] (LINE:4) call: com.roblox.client.purchase.model.PurchaseVerificationResponse.<init>(com.roblox.client.purchase.model.ProviderPayload):void type: THIS */
    public /* synthetic */ PurchaseVerificationResponse(ProviderPayload providerPayload, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : providerPayload);
    }
}

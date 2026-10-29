package fj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fj.i0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, m31665d2 = {"Lfj/i0;", "", "", "providerProductId", "productType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class C5629i0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String providerProductId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String productType;

    public C5629i0(@NotNull String providerProductId, @NotNull String productType) {
        Intrinsics.checkNotNullParameter(providerProductId, "providerProductId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.providerProductId = providerProductId;
        this.productType = productType;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getProviderProductId() {
        return this.providerProductId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C5629i0)) {
            return false;
        }
        C5629i0 c5629i0 = (C5629i0) other;
        return Intrinsics.m31980c(this.providerProductId, c5629i0.providerProductId) && Intrinsics.m31980c(this.productType, c5629i0.productType);
    }

    public int hashCode() {
        return (this.providerProductId.hashCode() * 31) + this.productType.hashCode();
    }

    @NotNull
    public String toString() {
        return "{ productType: " + this.productType + ", providerProductId: " + this.providerProductId + " }";
    }
}

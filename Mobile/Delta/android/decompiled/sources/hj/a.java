package hj;

import com.roblox.client.purchase.model.ProviderPayload;
import com.roblox.client.purchase.model.PurchaseVerificationResponse;
import gk.m;
import gk.p;
import jg.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\b¨\u0006\n"}, d2 = {"", "Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;", "a", "(Ljava/lang/String;)Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;", "", "Lcom/roblox/client/purchase/model/ProviderPayload;", "b", "([J)Lcom/roblox/client/purchase/model/ProviderPayload;", "Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;", "EMPTY_PURCHASE_VERIFICATION_RESPONSE", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final PurchaseVerificationResponse f19319a = new PurchaseVerificationResponse(null, 1, null);

    @NotNull
    public static final PurchaseVerificationResponse a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            PurchaseVerificationResponse purchaseVerificationResponse = (PurchaseVerificationResponse) m.a(str, PurchaseVerificationResponse.class);
            return purchaseVerificationResponse == null ? f19319a : purchaseVerificationResponse;
        } catch (u unused) {
            p.e("rbx.purchaseflow", "Unable to parse response " + str);
            return f19319a;
        }
    }

    @NotNull
    public static final ProviderPayload b(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new ProviderPayload(kotlin.collections.m.i0(jArr));
    }
}

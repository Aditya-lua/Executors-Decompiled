package p174hj;

import com.roblox.client.purchase.model.ProviderPayload;
import com.roblox.client.purchase.model.PurchaseVerificationResponse;
import kg.C7605u;
import kotlin.Metadata;
import kotlin.collections.C7693m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p151gk.C6121n;
import p151gk.C6124q;

/* JADX INFO: renamed from: hj.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\b¨\u0006\n"}, m31665d2 = {"", "Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;", "a", "(Ljava/lang/String;)Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;", "", "Lcom/roblox/client/purchase/model/ProviderPayload;", "b", "([J)Lcom/roblox/client/purchase/model/ProviderPayload;", "Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;", "EMPTY_PURCHASE_VERIFICATION_RESPONSE", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6410a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PurchaseVerificationResponse f24340a = new PurchaseVerificationResponse(null, 1, null);

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final PurchaseVerificationResponse m27992a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            PurchaseVerificationResponse purchaseVerificationResponse = (PurchaseVerificationResponse) C6121n.m27044a(str, PurchaseVerificationResponse.class);
            return purchaseVerificationResponse == null ? f24340a : purchaseVerificationResponse;
        } catch (C7605u unused) {
            C6124q.m27060e("rbx.purchaseflow", "Unable to parse response " + str);
            return f24340a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ProviderPayload m27993b(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new ProviderPayload(C7693m.m31866i0(jArr));
    }
}

package fj;

import com.roblox.client.purchase.model.ProviderPayload;
import com.roblox.client.purchase.model.PurchaseVerificationResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfj/m0;", "", "a", "(Lfj/m0;)Ljava/lang/String;", "Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;", "b", "(Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)Lfj/m0;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n0 {
    @NotNull
    public static final String a(@NotNull RobloxPurchaseInfo robloxPurchaseInfo) {
        Intrinsics.checkNotNullParameter(robloxPurchaseInfo, "<this>");
        return gk.m.c(robloxPurchaseInfo);
    }

    @NotNull
    public static final RobloxPurchaseInfo b(@NotNull PurchaseVerificationResponse purchaseVerificationResponse) {
        String[] strArr;
        List<Long> granted_asset_ids;
        Intrinsics.checkNotNullParameter(purchaseVerificationResponse, "<this>");
        ProviderPayload providerPayload = purchaseVerificationResponse.getProviderPayload();
        if (providerPayload == null || (granted_asset_ids = providerPayload.getGranted_asset_ids()) == null) {
            strArr = null;
        } else {
            List<Long> list = granted_asset_ids;
            ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
        }
        return new RobloxPurchaseInfo(strArr, null);
    }
}

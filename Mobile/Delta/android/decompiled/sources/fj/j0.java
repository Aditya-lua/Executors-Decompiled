package fj;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006\u001a\u0011\u0010\u000f\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0006\u001a!\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0006\u001a\u0019\u0010\u0017\u001a\u00020\u0015*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u0019\u001a\u00020\u0001*\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lv7/k;", "", "e", "(Lv7/k;)Ljava/lang/String;", "Lcom/android/billingclient/api/e;", "c", "(Lcom/android/billingclient/api/e;)Ljava/lang/String;", "", "f", "(Lcom/android/billingclient/api/e;)F", "", "priceAmountMicros", "g", "(J)F", "b", "d", "", "offerIds", "h", "(Lcom/android/billingclient/api/e;Ljava/util/Collection;)Ljava/lang/String;", "a", "", "isSubscription", "i", "(Lcom/android/billingclient/api/e;Z)Z", "j", "(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j0 {
    @Nullable
    public static final String a(@NotNull com.android.billingclient.api.e eVar) {
        Object next;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        List<com.android.billingclient.api.e.C0114e> listF = eVar.f();
        if (listF != null) {
            Iterator<T> it = listF.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((com.android.billingclient.api.e.C0114e) next).a() != null);
            com.android.billingclient.api.e.C0114e c0114e = (com.android.billingclient.api.e.C0114e) next;
            if (c0114e != null) {
                return c0114e.b();
            }
        }
        return null;
    }

    @NotNull
    public static final String b(@NotNull com.android.billingclient.api.e eVar) {
        String strD;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        com.android.billingclient.api.e.b bVarB = eVar.b();
        return (bVarB == null || (strD = bVarB.d()) == null) ? "" : strD;
    }

    @NotNull
    public static final String c(@NotNull com.android.billingclient.api.e eVar) {
        String strA;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        com.android.billingclient.api.e.b bVarB = eVar.b();
        return (bVarB == null || (strA = bVarB.a()) == null) ? "" : strA;
    }

    @NotNull
    public static final String d(@NotNull com.android.billingclient.api.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        List<com.android.billingclient.api.e.C0114e> listF = eVar.f();
        Intrinsics.checkNotNull(listF);
        String strB = ((com.android.billingclient.api.e.C0114e) CollectionsKt.d0(listF)).b();
        Intrinsics.checkNotNullExpressionValue(strB, "getOfferToken(...)");
        return strB;
    }

    @NotNull
    public static final String e(@NotNull v7.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        String strB = kVar.b();
        if (strB != null) {
            return strB;
        }
        String strG = kVar.g();
        Intrinsics.checkNotNullExpressionValue(strG, "getPurchaseToken(...)");
        return strG;
    }

    public static final float f(@NotNull com.android.billingclient.api.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        com.android.billingclient.api.e.b bVarB = eVar.b();
        if (bVarB != null) {
            return g(bVarB.c());
        }
        return 0.0f;
    }

    public static final float g(long j10) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j10);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf.movePointLeft(6).floatValue();
    }

    @Nullable
    public static final String h(@NotNull com.android.billingclient.api.e eVar, @NotNull Collection<String> offerIds) {
        List<com.android.billingclient.api.e.C0114e> listF;
        Object next;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(offerIds, "offerIds");
        if (offerIds.isEmpty() || (listF = eVar.f()) == null) {
            return null;
        }
        Set setQ0 = CollectionsKt.Q0(offerIds);
        Iterator<T> it = listF.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            com.android.billingclient.api.e.C0114e c0114e = (com.android.billingclient.api.e.C0114e) next;
            if (c0114e.a() != null && CollectionsKt.W(setQ0, c0114e.a())) {
                break;
            }
        }
        com.android.billingclient.api.e.C0114e c0114e2 = (com.android.billingclient.api.e.C0114e) next;
        if (c0114e2 != null) {
            return c0114e2.b();
        }
        return null;
    }

    public static final boolean i(@NotNull com.android.billingclient.api.e eVar, boolean z10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (z10) {
            return eVar.f() != null;
        }
        return eVar.b() != null;
    }

    @NotNull
    public static final String j(@Nullable com.android.billingclient.api.e eVar, boolean z10) {
        String str;
        if (eVar == null) {
            return "null";
        }
        if (z10) {
            List<com.android.billingclient.api.e.C0114e> listF = eVar.f();
            str = "subscriptionOfferDetails?.size: " + (listF != null ? Integer.valueOf(listF.size()) : null);
        } else {
            str = "oneTimePurchaseOfferDetails: " + eVar.b();
        }
        return "ProductDetails{ productId: " + eVar.d() + ", isSubscription: " + z10 + ", " + str + " }";
    }
}

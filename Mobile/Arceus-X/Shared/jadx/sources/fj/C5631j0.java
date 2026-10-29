package fj;

import com.android.billingclient.api.C1749e;
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
import p486v7.C12052k;

/* JADX INFO: renamed from: fj.j0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006\u001a\u0011\u0010\u000f\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0006\u001a!\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0006\u001a\u0019\u0010\u0017\u001a\u00020\u0015*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u0019\u001a\u00020\u0001*\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lv7/k;", "", "e", "(Lv7/k;)Ljava/lang/String;", "Lcom/android/billingclient/api/e;", "c", "(Lcom/android/billingclient/api/e;)Ljava/lang/String;", "", "f", "(Lcom/android/billingclient/api/e;)F", "", "priceAmountMicros", "g", "(J)F", "b", "d", "", "offerIds", "h", "(Lcom/android/billingclient/api/e;Ljava/util/Collection;)Ljava/lang/String;", "a", "", "isSubscription", "i", "(Lcom/android/billingclient/api/e;Z)Z", "j", "(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5631j0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m25475a(@NotNull C1749e c1749e) {
        Object next;
        Intrinsics.checkNotNullParameter(c1749e, "<this>");
        List<C1749e.e> listM8620f = c1749e.m8620f();
        if (listM8620f != null) {
            Iterator<T> it = listM8620f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((C1749e.e) next).m8634a() != null);
            C1749e.e eVar = (C1749e.e) next;
            if (eVar != null) {
                return eVar.m8635b();
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m25476b(@NotNull C1749e c1749e) {
        String strM8627d;
        Intrinsics.checkNotNullParameter(c1749e, "<this>");
        C1749e.b bVarM8616b = c1749e.m8616b();
        return (bVarM8616b == null || (strM8627d = bVarM8616b.m8627d()) == null) ? "" : strM8627d;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m25477c(@NotNull C1749e c1749e) {
        String strM8624a;
        Intrinsics.checkNotNullParameter(c1749e, "<this>");
        C1749e.b bVarM8616b = c1749e.m8616b();
        return (bVarM8616b == null || (strM8624a = bVarM8616b.m8624a()) == null) ? "" : strM8624a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m25478d(@NotNull C1749e c1749e) {
        Intrinsics.checkNotNullParameter(c1749e, "<this>");
        List<C1749e.e> listM8620f = c1749e.m8620f();
        Intrinsics.checkNotNull(listM8620f);
        String strM8635b = ((C1749e.e) CollectionsKt.m31706d0(listM8620f)).m8635b();
        Intrinsics.checkNotNullExpressionValue(strM8635b, "getOfferToken(...)");
        return strM8635b;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m25479e(@NotNull C12052k c12052k) {
        Intrinsics.checkNotNullParameter(c12052k, "<this>");
        String strM44881b = c12052k.m44881b();
        if (strM44881b != null) {
            return strM44881b;
        }
        String strM44886g = c12052k.m44886g();
        Intrinsics.checkNotNullExpressionValue(strM44886g, "getPurchaseToken(...)");
        return strM44886g;
    }

    /* JADX INFO: renamed from: f */
    public static final float m25480f(@NotNull C1749e c1749e) {
        Intrinsics.checkNotNullParameter(c1749e, "<this>");
        C1749e.b bVarM8616b = c1749e.m8616b();
        if (bVarM8616b != null) {
            return m25481g(bVarM8616b.m8626c());
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public static final float m25481g(long j10) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j10);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf.movePointLeft(6).floatValue();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final String m25482h(@NotNull C1749e c1749e, @NotNull Collection<String> offerIds) {
        List<C1749e.e> listM8620f;
        Object next;
        Intrinsics.checkNotNullParameter(c1749e, "<this>");
        Intrinsics.checkNotNullParameter(offerIds, "offerIds");
        if (offerIds.isEmpty() || (listM8620f = c1749e.m8620f()) == null) {
            return null;
        }
        Set setQ0 = CollectionsKt.m31691Q0(offerIds);
        Iterator<T> it = listM8620f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C1749e.e eVar = (C1749e.e) next;
            if (eVar.m8634a() != null && CollectionsKt.m31699W(setQ0, eVar.m8634a())) {
                break;
            }
        }
        C1749e.e eVar2 = (C1749e.e) next;
        if (eVar2 != null) {
            return eVar2.m8635b();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m25483i(@NotNull C1749e c1749e, boolean z10) {
        Intrinsics.checkNotNullParameter(c1749e, "<this>");
        if (z10) {
            return c1749e.m8620f() != null;
        }
        return c1749e.m8616b() != null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m25484j(@Nullable C1749e c1749e, boolean z10) {
        String str;
        if (c1749e == null) {
            return "null";
        }
        if (z10) {
            List<C1749e.e> listM8620f = c1749e.m8620f();
            str = "subscriptionOfferDetails?.size: " + (listM8620f != null ? Integer.valueOf(listM8620f.size()) : null);
        } else {
            str = "oneTimePurchaseOfferDetails: " + c1749e.m8616b();
        }
        return "ProductDetails{ productId: " + c1749e.m8618d() + ", isSubscription: " + z10 + ", " + str + " }";
    }
}

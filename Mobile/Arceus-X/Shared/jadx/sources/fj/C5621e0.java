package fj;

import com.android.billingclient.api.C1749e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p486v7.C12052k;
import th.C11659h;

/* JADX INFO: renamed from: fj.e0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0010\u001a\u0013\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\b\u001a\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\b\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001f\u0010 \"\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"!\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0003\"\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"\"!\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b)\u0010\u0003¨\u0006+"}, m31665d2 = {"", "", "e", "()Ljava/util/List;", "f", "productId", "", "m", "(Ljava/lang/String;)Z", "l", "Lv7/k;", "purchase", "o", "(Lv7/k;)Z", "n", "Lcom/android/billingclient/api/e;", "Lcom/android/billingclient/api/e$e;", "d", "(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e$e;", "Lcom/android/billingclient/api/e$c;", "c", "(Lcom/android/billingclient/api/e$e;)Lcom/android/billingclient/api/e$c;", "productDetails", "isSubscriptionPurchase", "i", "(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;", "g", "", "h", "(Lcom/android/billingclient/api/e;Z)J", "currentProductId", "p", "(Ljava/lang/String;Ljava/lang/String;)Z", "a", "Ljava/util/List;", "IN_APP_PRODUCT_LIST", "b", "Ljt/h;", "j", "serverInAppProductList", "SUBSCRIPTION_PRODUCT_LIST", "k", "serverSubscriptionProductList", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5621e0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final List<String> f21557a = C7699p.m31895n("com.roblox.client.robux40", "com.roblox.robloxmobile.premium80robux", "com.roblox.robloxmobile.premium160robux", "com.roblox.robloxmobile.premium240robux", "com.roblox.robloxmobile.premium320robux", "com.roblox.robloxmobile.premium400robux", "com.roblox.robloxmobile.premium800robux", "com.roblox.robloxmobile.premium1700robux", "com.roblox.robloxmobile.premium4500robux", "com.roblox.robloxmobile.premium10000robux", "com.roblox.robloxmobile.premium88subscribed", "com.roblox.robloxmobile.premium175subscribed", "com.roblox.robloxmobile.premium265subscribed", "com.roblox.robloxmobile.premium350subscribed", "com.roblox.robloxmobile.premium440subscribed2", "com.roblox.robloxmobile.premium880subscribed", "com.roblox.robloxmobile.premium1870subscribed", "com.roblox.robloxmobile.premium4950subscribed", "com.roblox.robloxmobile.premium11000subscribed");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final InterfaceC7341h f21558b = C7342i.m30456b(new Function0() { // from class: fj.c0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C5621e0.m25464q();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final List<String> f21559c = C7699p.m31895n("com.roblox.robloxmobile.robloxpremium450", "com.roblox.robloxmobile.robloxpremium1000", "com.roblox.robloxmobile.robloxpremium2200");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final InterfaceC7341h f21560d = C7342i.m30456b(new Function0() { // from class: fj.d0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C5621e0.m25465r();
        }
    });

    /* JADX INFO: renamed from: c */
    public static final C1749e.c m25450c(C1749e.e eVar) {
        List<C1749e.c> listM8633a = eVar.m8636c().m8633a();
        Intrinsics.checkNotNullExpressionValue(listM8633a, "getPricingPhaseList(...)");
        Object objD0 = CollectionsKt.m31706d0(listM8633a);
        Intrinsics.checkNotNullExpressionValue(objD0, "first(...)");
        return (C1749e.c) objD0;
    }

    /* JADX INFO: renamed from: d */
    public static final C1749e.e m25451d(C1749e c1749e) {
        List<C1749e.e> listM8620f = c1749e.m8620f();
        Intrinsics.checkNotNull(listM8620f);
        Object objD0 = CollectionsKt.m31706d0(listM8620f);
        Intrinsics.checkNotNullExpressionValue(objD0, "first(...)");
        return (C1749e.e) objD0;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final List<String> m25452e() {
        return m25457j();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final List<String> m25453f() {
        return m25458k();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m25454g(@NotNull C1749e productDetails, boolean z10) {
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        if (z10) {
            String strM8630a = m25450c(m25451d(productDetails)).m8630a();
            Intrinsics.checkNotNull(strM8630a);
            return strM8630a;
        }
        C1749e.b bVarM8616b = productDetails.m8616b();
        Intrinsics.checkNotNull(bVarM8616b);
        String strM8624a = bVarM8616b.m8624a();
        Intrinsics.checkNotNull(strM8624a);
        return strM8624a;
    }

    /* JADX INFO: renamed from: h */
    public static final long m25455h(@NotNull C1749e productDetails, boolean z10) {
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        if (z10) {
            return m25450c(m25451d(productDetails)).m8631b();
        }
        C1749e.b bVarM8616b = productDetails.m8616b();
        Intrinsics.checkNotNull(bVarM8616b);
        return bVarM8616b.m8626c();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m25456i(@NotNull C1749e productDetails, boolean z10) {
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        if (z10) {
            String strM8632c = m25450c(m25451d(productDetails)).m8632c();
            Intrinsics.checkNotNull(strM8632c);
            return strM8632c;
        }
        C1749e.b bVarM8616b = productDetails.m8616b();
        Intrinsics.checkNotNull(bVarM8616b);
        String strM8627d = bVarM8616b.m8627d();
        Intrinsics.checkNotNull(strM8627d);
        return strM8627d;
    }

    /* JADX INFO: renamed from: j */
    public static final List<String> m25457j() {
        return (List) f21558b.getValue();
    }

    /* JADX INFO: renamed from: k */
    public static final List<String> m25458k() {
        return (List) f21560d.getValue();
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m25459l(@NotNull String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return StringsKt.split$default(productId, new String[]{"."}, false, 0, 6, null).contains("nonconsumable");
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m25460m(@NotNull String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return StringsKt.split$default(productId, new String[]{"."}, false, 0, 6, null).contains("playpoints");
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m25461n(@NotNull String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return m25453f().contains(productId);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX INFO: renamed from: o */
    public static final boolean m25462o(@NotNull C12052k purchase) {
        boolean z10;
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        String strM25427j = C5614b.m25427j(purchase);
        if (m25452e().contains(strM25427j)) {
            z10 = true;
        } else {
            Intrinsics.checkNotNull(strM25427j);
            if (m25460m(strM25427j)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        Intrinsics.checkNotNull(strM25427j);
        return m25461n(strM25427j) || !z10;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m25463p(@Nullable String str, @Nullable String str2) {
        if (str2 == null || str == null) {
            return false;
        }
        return Intrinsics.m31980c(str2, str);
    }

    /* JADX INFO: renamed from: q */
    public static final List m25464q() {
        String strMo43478K3 = C11659h.m43403a().mo43478K3();
        return (strMo43478K3 == null || strMo43478K3.length() == 0) ? f21557a : StringsKt.split$default(strMo43478K3, new String[]{","}, false, 0, 6, null);
    }

    /* JADX INFO: renamed from: r */
    public static final List m25465r() {
        String strMo43440F0 = C11659h.m43403a().mo43440F0();
        return (strMo43440F0 == null || strMo43440F0.length() == 0) ? f21559c : StringsKt.split$default(strMo43440F0, new String[]{","}, false, 0, 6, null);
    }
}

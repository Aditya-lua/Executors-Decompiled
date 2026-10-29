package p486v7;

import android.text.TextUtils;
import com.android.billingclient.api.C1746b;
import com.android.billingclient.api.C1748d;
import com.android.billingclient.api.C1752h;
import com.google.android.gms.internal.play_billing.AbstractC2582n0;
import com.google.android.gms.internal.play_billing.C2571m0;
import com.google.android.gms.internal.play_billing.EnumC2644s7;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: v7.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC12050j0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC12055l f42619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f42620b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f42621c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1746b f42622d;

    public CallableC12050j0(C1746b c1746b, InterfaceC12055l interfaceC12055l, String str, boolean z10) {
        this.f42619a = interfaceC12055l;
        this.f42620b = str;
        this.f42621c = z10;
        Objects.requireNonNull(c1746b);
        this.f42622d = c1746b;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1746b c1746b = this.f42622d;
        if (!c1746b.m8542j0(C12057l1.m44891b())) {
            EnumC2644s7 enumC2644s7 = EnumC2644s7.SERVICE_CONNECTION_NOT_READY;
            C1748d c1748d = C1752h.f6764j;
            c1746b.m8548q0(enumC2644s7, 9, c1748d);
            this.f42619a.mo25471a(c1748d, AbstractC2582n0.m11599k());
            return null;
        }
        String str = this.f42620b;
        if (TextUtils.isEmpty(str)) {
            C2571m0.m11565m("BillingClient", "Please provide a valid product type.");
            EnumC2644s7 enumC2644s8 = EnumC2644s7.EMPTY_PRODUCT_TYPE;
            C1748d c1748d2 = C1752h.f6759e;
            c1746b.m8548q0(enumC2644s8, 9, c1748d2);
            this.f42619a.mo25471a(c1748d2, AbstractC2582n0.m11599k());
            return null;
        }
        C12093x1 c12093x1M8546o0 = c1746b.m8546o0(str, this.f42621c, 9);
        if (c12093x1M8546o0.m44939b() != null) {
            this.f42619a.mo25471a(c12093x1M8546o0.m44938a(), c12093x1M8546o0.m44939b());
            return null;
        }
        this.f42619a.mo25471a(c12093x1M8546o0.m44938a(), AbstractC2582n0.m11599k());
        return null;
    }
}

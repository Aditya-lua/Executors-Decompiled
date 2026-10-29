package p486v7;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.internal.play_billing.AbstractC2637s0;

/* JADX INFO: renamed from: v7.t */
/* JADX INFO: loaded from: classes.dex */
public final class C12079t {

    /* JADX INFO: renamed from: a */
    public final Context f42670a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC12058m f42671b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12048i1 f42672c;

    /* JADX INFO: renamed from: f */
    public boolean f42675f;

    /* JADX INFO: renamed from: g */
    public AbstractC2637s0 f42676g = AbstractC2637s0.m11707k();

    /* JADX INFO: renamed from: d */
    public final C12076s f42673d = new C12076s(this, true);

    /* JADX INFO: renamed from: e */
    public final C12076s f42674e = new C12076s(this, false);

    public C12079t(Context context, InterfaceC12058m interfaceC12058m, InterfaceC12069p1 interfaceC12069p1, InterfaceC12023c0 interfaceC12023c0, InterfaceC12070q interfaceC12070q, InterfaceC12042h interfaceC12042h, InterfaceC12048i1 interfaceC12048i1) {
        this.f42670a = context;
        this.f42671b = interfaceC12058m;
        this.f42672c = interfaceC12048i1;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ InterfaceC12023c0 m44929a(C12079t c12079t) {
        c12079t.getClass();
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ InterfaceC12042h m44931c(C12079t c12079t) {
        c12079t.getClass();
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ InterfaceC12070q m44933f(C12079t c12079t) {
        c12079t.getClass();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC12058m m44935e() {
        return this.f42671b;
    }

    /* JADX INFO: renamed from: h */
    public final void m44936h(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f42675f = z10;
        C12076s c12076s = this.f42674e;
        Context context = this.f42670a;
        c12076s.m44926a(context, intentFilter2);
        if (this.f42675f) {
            this.f42673d.m44927b(context, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f42673d.m44926a(context, intentFilter);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m44937i(AbstractC2637s0 abstractC2637s0) {
        this.f42676g = abstractC2637s0;
    }
}

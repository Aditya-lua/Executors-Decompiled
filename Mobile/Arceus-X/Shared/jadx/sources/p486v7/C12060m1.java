package p486v7;

import android.content.Context;
import com.android.billingclient.api.C1748d;
import com.google.android.gms.internal.play_billing.C2447a8;
import com.google.android.gms.internal.play_billing.C2480d8;
import com.google.android.gms.internal.play_billing.C2491e8;
import com.google.android.gms.internal.play_billing.C2492e9;
import com.google.android.gms.internal.play_billing.C2524h8;
import com.google.android.gms.internal.play_billing.C2536i9;
import com.google.android.gms.internal.play_billing.C2545j7;
import com.google.android.gms.internal.play_billing.C2567l7;
import com.google.android.gms.internal.play_billing.C2571m0;
import com.google.android.gms.internal.play_billing.C2580m9;
import com.google.android.gms.internal.play_billing.C2589n7;
import com.google.android.gms.internal.play_billing.C2611p7;
import com.google.android.gms.internal.play_billing.C2612p8;
import com.google.android.gms.internal.play_billing.C2622q7;
import com.google.android.gms.internal.play_billing.C2666u7;
import com.google.android.gms.internal.play_billing.C2678v8;
import com.google.android.gms.internal.play_billing.C2699x7;
import com.google.android.gms.internal.play_billing.C2700x8;
import com.google.android.gms.internal.play_billing.EnumC2721z7;

/* JADX INFO: renamed from: v7.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C12060m1 implements InterfaceC12048i1 {

    /* JADX INFO: renamed from: b */
    public C2524h8 f42635b;

    /* JADX INFO: renamed from: c */
    public final C12066o1 f42636c;

    public C12060m1(Context context, C2524h8 c2524h8) {
        this.f42636c = new C12066o1(context);
        this.f42635b = c2524h8;
    }

    @Override // p486v7.InterfaceC12048i1
    /* JADX INFO: renamed from: a */
    public final void mo44866a(C2580m9 c2580m9) {
        if (c2580m9 == null) {
            return;
        }
        try {
            C2678v8 c2678v8M11837D = C2700x8.m11837D();
            c2678v8M11837D.m11808t(this.f42635b);
            c2678v8M11837D.m11810w(c2580m9);
            this.f42636c.m44907a((C2700x8) c2678v8M11837D.m11645i());
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // p486v7.InterfaceC12048i1
    /* JADX INFO: renamed from: b */
    public final void mo44867b(C2567l7 c2567l7, int i10, long j10, boolean z10) {
        C2524h8 c2524h8;
        try {
            C2491e8 c2491e8 = (C2491e8) this.f42635b.m11757s();
            c2491e8.m11389q(i10);
            this.f42635b = (C2524h8) c2491e8.m11645i();
            C2545j7 c2545j7 = (C2545j7) c2567l7.m11757s();
            C2612p8 c2612p8 = (C2612p8) c2567l7.m11551H().m11757s();
            c2612p8.m11671o(z10);
            c2545j7.m11513r(c2612p8);
            C2567l7 c2567l8 = (C2567l7) c2545j7.m11645i();
            if (j10 == 0) {
                c2524h8 = this.f42635b;
            } else {
                C2491e8 c2491e9 = (C2491e8) this.f42635b.m11757s();
                c2491e9.m11391s(j10);
                c2524h8 = (C2524h8) c2491e9.m11645i();
            }
            m44897o(c2567l8, c2524h8);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // p486v7.InterfaceC12048i1
    /* JADX INFO: renamed from: c */
    public final void mo44868c(C2611p7 c2611p7) {
        try {
            m44898p(c2611p7, this.f42635b);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // p486v7.InterfaceC12048i1
    /* JADX INFO: renamed from: d */
    public final void mo44869d(C2492e9 c2492e9) {
        try {
            C2678v8 c2678v8M11837D = C2700x8.m11837D();
            c2678v8M11837D.m11808t(this.f42635b);
            C2447a8 c2447a8M11367B = C2480d8.m11367B();
            c2447a8M11367B.m11265q("ProxyBillingBroadcastReceiver");
            c2447a8M11367B.m11267s(2);
            c2447a8M11367B.m11266r(c2492e9);
            c2678v8M11837D.m11806r(c2447a8M11367B);
            this.f42636c.m44907a((C2700x8) c2678v8M11837D.m11645i());
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // p486v7.InterfaceC12048i1
    /* JADX INFO: renamed from: e */
    public final void mo44870e(C2611p7 c2611p7, int i10) {
        try {
            C2491e8 c2491e8 = (C2491e8) this.f42635b.m11757s();
            c2491e8.m11389q(i10);
            this.f42635b = (C2524h8) c2491e8.m11645i();
            mo44868c(c2611p7);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // p486v7.InterfaceC12048i1
    /* JADX INFO: renamed from: f */
    public final void mo44871f(C1748d c1748d, long j10) {
        C2524h8 c2524h8;
        try {
            C2447a8 c2447a8M11367B = C2480d8.m11367B();
            c2447a8M11367B.m11267s(4);
            c2447a8M11367B.m11263o(EnumC2721z7.IN_APP_BILLING_RESULT_UPDATE_ACTION);
            if (c1748d != null) {
                C2622q7 c2622q7M11790C = C2666u7.m11790C();
                c2622q7M11790C.m11693t(c1748d.m8610c());
                c2622q7M11790C.m11689p(c1748d.m8608a());
                c2447a8M11367B.m11264p(c2622q7M11790C);
            }
            C2678v8 c2678v8M11837D = C2700x8.m11837D();
            if (j10 == 0) {
                c2524h8 = this.f42635b;
            } else {
                C2491e8 c2491e8 = (C2491e8) this.f42635b.m11757s();
                c2491e8.m11391s(j10);
                c2524h8 = (C2524h8) c2491e8.m11645i();
            }
            c2678v8M11837D.m11808t(c2524h8);
            c2678v8M11837D.m11806r(c2447a8M11367B);
            this.f42636c.m44907a((C2700x8) c2678v8M11837D.m11645i());
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // p486v7.InterfaceC12048i1
    /* JADX INFO: renamed from: g */
    public final void mo44872g(C2611p7 c2611p7, long j10, boolean z10) {
        C2524h8 c2524h8;
        try {
            C2589n7 c2589n7 = (C2589n7) c2611p7.m11757s();
            C2612p8 c2612p8 = (C2612p8) c2611p7.m11670E().m11757s();
            c2612p8.m11671o(z10);
            c2589n7.m11622q(c2612p8);
            C2611p7 c2611p8 = (C2611p7) c2589n7.m11645i();
            if (j10 == 0) {
                c2524h8 = this.f42635b;
            } else {
                C2491e8 c2491e8 = (C2491e8) this.f42635b.m11757s();
                c2491e8.m11391s(j10);
                c2524h8 = (C2524h8) c2491e8.m11645i();
            }
            m44898p(c2611p8, c2524h8);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // p486v7.InterfaceC12048i1
    /* JADX INFO: renamed from: h */
    public final void mo44873h(long j10) {
        C2524h8 c2524h8;
        try {
            C2447a8 c2447a8M11367B = C2480d8.m11367B();
            c2447a8M11367B.m11267s(4);
            c2447a8M11367B.m11263o(EnumC2721z7.PLAY_BILLING_ACTIVITY_CREATED_ACTION);
            C2480d8 c2480d8 = (C2480d8) c2447a8M11367B.m11645i();
            C2678v8 c2678v8M11837D = C2700x8.m11837D();
            if (j10 == 0) {
                c2524h8 = this.f42635b;
            } else {
                C2491e8 c2491e8 = (C2491e8) this.f42635b.m11757s();
                c2491e8.m11391s(j10);
                c2524h8 = (C2524h8) c2491e8.m11645i();
            }
            c2678v8M11837D.m11808t(c2524h8);
            c2678v8M11837D.m11807s(c2480d8);
            this.f42636c.m44907a((C2700x8) c2678v8M11837D.m11645i());
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // p486v7.InterfaceC12048i1
    /* JADX INFO: renamed from: i */
    public final void mo44874i(C2536i9 c2536i9) {
        try {
            C12066o1 c12066o1 = this.f42636c;
            C2678v8 c2678v8M11837D = C2700x8.m11837D();
            c2678v8M11837D.m11808t(this.f42635b);
            c2678v8M11837D.m11809v(c2536i9);
            c12066o1.m44907a((C2700x8) c2678v8M11837D.m11645i());
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // p486v7.InterfaceC12048i1
    /* JADX INFO: renamed from: j */
    public final void mo44875j(C2567l7 c2567l7) {
        try {
            m44897o(c2567l7, this.f42635b);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // p486v7.InterfaceC12048i1
    /* JADX INFO: renamed from: k */
    public final void mo44876k(C2567l7 c2567l7, int i10) {
        try {
            C2491e8 c2491e8 = (C2491e8) this.f42635b.m11757s();
            c2491e8.m11389q(i10);
            this.f42635b = (C2524h8) c2491e8.m11645i();
            mo44875j(c2567l7);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // p486v7.InterfaceC12048i1
    /* JADX INFO: renamed from: l */
    public final void mo44877l(C2567l7 c2567l7, long j10, boolean z10) {
        C2524h8 c2524h8;
        try {
            C2545j7 c2545j7 = (C2545j7) c2567l7.m11757s();
            C2612p8 c2612p8 = (C2612p8) c2567l7.m11551H().m11757s();
            c2612p8.m11671o(z10);
            c2545j7.m11513r(c2612p8);
            C2567l7 c2567l8 = (C2567l7) c2545j7.m11645i();
            if (j10 == 0) {
                c2524h8 = this.f42635b;
            } else {
                C2491e8 c2491e8 = (C2491e8) this.f42635b.m11757s();
                c2491e8.m11391s(j10);
                c2524h8 = (C2524h8) c2491e8.m11645i();
            }
            m44897o(c2567l8, c2524h8);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // p486v7.InterfaceC12048i1
    /* JADX INFO: renamed from: m */
    public final void mo44878m(C2699x7 c2699x7) {
        try {
            C2678v8 c2678v8M11837D = C2700x8.m11837D();
            c2678v8M11837D.m11808t(this.f42635b);
            c2678v8M11837D.m11805q(c2699x7);
            this.f42636c.m44907a((C2700x8) c2678v8M11837D.m11645i());
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // p486v7.InterfaceC12048i1
    /* JADX INFO: renamed from: n */
    public final void mo44879n(C2567l7 c2567l7, int i10, long j10) {
        try {
            C2491e8 c2491e8 = (C2491e8) this.f42635b.m11757s();
            c2491e8.m11389q(i10);
            C2524h8 c2524h8 = (C2524h8) c2491e8.m11645i();
            this.f42635b = c2524h8;
            if (j10 != 0) {
                C2491e8 c2491e9 = (C2491e8) c2524h8.m11757s();
                c2491e9.m11391s(j10);
                c2524h8 = (C2524h8) c2491e9.m11645i();
            }
            m44897o(c2567l7, c2524h8);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m44897o(C2567l7 c2567l7, C2524h8 c2524h8) {
        if (c2567l7 == null) {
            return;
        }
        try {
            C2678v8 c2678v8M11837D = C2700x8.m11837D();
            c2678v8M11837D.m11808t(c2524h8);
            c2678v8M11837D.m11803o(c2567l7);
            this.f42636c.m44907a((C2700x8) c2678v8M11837D.m11645i());
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m44898p(C2611p7 c2611p7, C2524h8 c2524h8) {
        if (c2611p7 == null) {
            return;
        }
        try {
            C2678v8 c2678v8M11837D = C2700x8.m11837D();
            c2678v8M11837D.m11808t(c2524h8);
            c2678v8M11837D.m11804p(c2611p7);
            this.f42636c.m44907a((C2700x8) c2678v8M11837D.m11645i());
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to log.", th2);
        }
    }
}

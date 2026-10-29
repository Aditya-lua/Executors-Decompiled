package v7;

import android.content.Context;
import com.google.android.gms.internal.play_billing.a8;
import com.google.android.gms.internal.play_billing.d8;
import com.google.android.gms.internal.play_billing.e8;
import com.google.android.gms.internal.play_billing.e9;
import com.google.android.gms.internal.play_billing.h8;
import com.google.android.gms.internal.play_billing.i9;
import com.google.android.gms.internal.play_billing.j7;
import com.google.android.gms.internal.play_billing.l7;
import com.google.android.gms.internal.play_billing.m9;
import com.google.android.gms.internal.play_billing.n7;
import com.google.android.gms.internal.play_billing.p7;
import com.google.android.gms.internal.play_billing.p8;
import com.google.android.gms.internal.play_billing.q7;
import com.google.android.gms.internal.play_billing.u7;
import com.google.android.gms.internal.play_billing.v8;
import com.google.android.gms.internal.play_billing.x7;
import com.google.android.gms.internal.play_billing.x8;
import com.google.android.gms.internal.play_billing.z7;

/* JADX INFO: loaded from: classes.dex */
public final class m1 implements i1 {
    public h8 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1 f32812c;

    public m1(Context context, h8 h8Var) {
        this.f32812c = new o1(context);
        this.b = h8Var;
    }

    @Override // v7.i1
    public final void a(m9 m9Var) {
        if (m9Var == null) {
            return;
        }
        try {
            v8 v8VarD = x8.D();
            v8VarD.t(this.b);
            v8VarD.w(m9Var);
            this.f32812c.a((x8) v8VarD.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void b(l7 l7Var, int i10, long j10, boolean z10) {
        h8 h8Var;
        try {
            e8 e8Var = (e8) this.b.s();
            e8Var.q(i10);
            this.b = (h8) e8Var.i();
            j7 j7Var = (j7) l7Var.s();
            p8 p8Var = (p8) l7Var.H().s();
            p8Var.o(z10);
            j7Var.r(p8Var);
            l7 l7Var2 = (l7) j7Var.i();
            if (j10 == 0) {
                h8Var = this.b;
            } else {
                e8 e8Var2 = (e8) this.b.s();
                e8Var2.s(j10);
                h8Var = (h8) e8Var2.i();
            }
            o(l7Var2, h8Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void c(p7 p7Var) {
        try {
            p(p7Var, this.b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void d(e9 e9Var) {
        try {
            v8 v8VarD = x8.D();
            v8VarD.t(this.b);
            a8 a8VarB = d8.B();
            a8VarB.q("ProxyBillingBroadcastReceiver");
            a8VarB.s(2);
            a8VarB.r(e9Var);
            v8VarD.r(a8VarB);
            this.f32812c.a((x8) v8VarD.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void e(p7 p7Var, int i10) {
        try {
            e8 e8Var = (e8) this.b.s();
            e8Var.q(i10);
            this.b = (h8) e8Var.i();
            c(p7Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void f(com.android.billingclient.api.d dVar, long j10) {
        h8 h8Var;
        try {
            a8 a8VarB = d8.B();
            a8VarB.s(4);
            a8VarB.o(z7.IN_APP_BILLING_RESULT_UPDATE_ACTION);
            if (dVar != null) {
                q7 q7VarC = u7.C();
                q7VarC.t(dVar.c());
                q7VarC.p(dVar.a());
                a8VarB.p(q7VarC);
            }
            v8 v8VarD = x8.D();
            if (j10 == 0) {
                h8Var = this.b;
            } else {
                e8 e8Var = (e8) this.b.s();
                e8Var.s(j10);
                h8Var = (h8) e8Var.i();
            }
            v8VarD.t(h8Var);
            v8VarD.r(a8VarB);
            this.f32812c.a((x8) v8VarD.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void g(p7 p7Var, long j10, boolean z10) {
        h8 h8Var;
        try {
            n7 n7Var = (n7) p7Var.s();
            p8 p8Var = (p8) p7Var.E().s();
            p8Var.o(z10);
            n7Var.q(p8Var);
            p7 p7Var2 = (p7) n7Var.i();
            if (j10 == 0) {
                h8Var = this.b;
            } else {
                e8 e8Var = (e8) this.b.s();
                e8Var.s(j10);
                h8Var = (h8) e8Var.i();
            }
            p(p7Var2, h8Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void h(long j10) {
        h8 h8Var;
        try {
            a8 a8VarB = d8.B();
            a8VarB.s(4);
            a8VarB.o(z7.PLAY_BILLING_ACTIVITY_CREATED_ACTION);
            d8 d8Var = (d8) a8VarB.i();
            v8 v8VarD = x8.D();
            if (j10 == 0) {
                h8Var = this.b;
            } else {
                e8 e8Var = (e8) this.b.s();
                e8Var.s(j10);
                h8Var = (h8) e8Var.i();
            }
            v8VarD.t(h8Var);
            v8VarD.s(d8Var);
            this.f32812c.a((x8) v8VarD.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void i(i9 i9Var) {
        try {
            o1 o1Var = this.f32812c;
            v8 v8VarD = x8.D();
            v8VarD.t(this.b);
            v8VarD.v(i9Var);
            o1Var.a((x8) v8VarD.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void j(l7 l7Var) {
        try {
            o(l7Var, this.b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void k(l7 l7Var, int i10) {
        try {
            e8 e8Var = (e8) this.b.s();
            e8Var.q(i10);
            this.b = (h8) e8Var.i();
            j(l7Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void l(l7 l7Var, long j10, boolean z10) {
        h8 h8Var;
        try {
            j7 j7Var = (j7) l7Var.s();
            p8 p8Var = (p8) l7Var.H().s();
            p8Var.o(z10);
            j7Var.r(p8Var);
            l7 l7Var2 = (l7) j7Var.i();
            if (j10 == 0) {
                h8Var = this.b;
            } else {
                e8 e8Var = (e8) this.b.s();
                e8Var.s(j10);
                h8Var = (h8) e8Var.i();
            }
            o(l7Var2, h8Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void m(x7 x7Var) {
        try {
            v8 v8VarD = x8.D();
            v8VarD.t(this.b);
            v8VarD.q(x7Var);
            this.f32812c.a((x8) v8VarD.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void n(l7 l7Var, int i10, long j10) {
        try {
            e8 e8Var = (e8) this.b.s();
            e8Var.q(i10);
            h8 h8Var = (h8) e8Var.i();
            this.b = h8Var;
            if (j10 != 0) {
                e8 e8Var2 = (e8) h8Var.s();
                e8Var2.s(j10);
                h8Var = (h8) e8Var2.i();
            }
            o(l7Var, h8Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void o(l7 l7Var, h8 h8Var) {
        if (l7Var == null) {
            return;
        }
        try {
            v8 v8VarD = x8.D();
            v8VarD.t(h8Var);
            v8VarD.o(l7Var);
            this.f32812c.a((x8) v8VarD.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void p(p7 p7Var, h8 h8Var) {
        if (p7Var == null) {
            return;
        }
        try {
            v8 v8VarD = x8.D();
            v8VarD.t(h8Var);
            v8VarD.p(p7Var);
            this.f32812c.a((x8) v8VarD.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }
}

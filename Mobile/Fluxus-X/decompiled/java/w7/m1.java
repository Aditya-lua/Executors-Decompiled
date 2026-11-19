package w7;

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
    public final o1 f35629c;

    public m1(Context context, h8 h8Var) {
        this.f35629c = new o1(context);
        this.b = h8Var;
    }

    @Override // w7.i1
    public final void a(m9 m9Var) {
        if (m9Var == null) {
            return;
        }
        try {
            v8 v8VarD = x8.D();
            v8VarD.v(this.b);
            v8VarD.y(m9Var);
            this.f35629c.a((x8) v8VarD.k());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // w7.i1
    public final void b(l7 l7Var, int i10, long j10, boolean z10) {
        h8 h8Var;
        try {
            e8 e8Var = (e8) this.b.s();
            e8Var.s(i10);
            this.b = (h8) e8Var.k();
            j7 j7Var = (j7) l7Var.s();
            p8 p8Var = (p8) l7Var.H().s();
            p8Var.q(z10);
            j7Var.t(p8Var);
            l7 l7Var2 = (l7) j7Var.k();
            if (j10 == 0) {
                h8Var = this.b;
            } else {
                e8 e8Var2 = (e8) this.b.s();
                e8Var2.u(j10);
                h8Var = (h8) e8Var2.k();
            }
            o(l7Var2, h8Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // w7.i1
    public final void c(p7 p7Var) {
        try {
            p(p7Var, this.b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // w7.i1
    public final void d(e9 e9Var) {
        try {
            v8 v8VarD = x8.D();
            v8VarD.v(this.b);
            a8 a8VarB = d8.B();
            a8VarB.s("ProxyBillingBroadcastReceiver");
            a8VarB.u(2);
            a8VarB.t(e9Var);
            v8VarD.t(a8VarB);
            this.f35629c.a((x8) v8VarD.k());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // w7.i1
    public final void e(p7 p7Var, int i10) {
        try {
            e8 e8Var = (e8) this.b.s();
            e8Var.s(i10);
            this.b = (h8) e8Var.k();
            c(p7Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // w7.i1
    public final void f(com.android.billingclient.api.d dVar, long j10) {
        h8 h8Var;
        try {
            a8 a8VarB = d8.B();
            a8VarB.u(4);
            a8VarB.q(z7.IN_APP_BILLING_RESULT_UPDATE_ACTION);
            if (dVar != null) {
                q7 q7VarC = u7.C();
                q7VarC.v(dVar.c());
                q7VarC.r(dVar.a());
                a8VarB.r(q7VarC);
            }
            v8 v8VarD = x8.D();
            if (j10 == 0) {
                h8Var = this.b;
            } else {
                e8 e8Var = (e8) this.b.s();
                e8Var.u(j10);
                h8Var = (h8) e8Var.k();
            }
            v8VarD.v(h8Var);
            v8VarD.t(a8VarB);
            this.f35629c.a((x8) v8VarD.k());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // w7.i1
    public final void g(p7 p7Var, long j10, boolean z10) {
        h8 h8Var;
        try {
            n7 n7Var = (n7) p7Var.s();
            p8 p8Var = (p8) p7Var.E().s();
            p8Var.q(z10);
            n7Var.s(p8Var);
            p7 p7Var2 = (p7) n7Var.k();
            if (j10 == 0) {
                h8Var = this.b;
            } else {
                e8 e8Var = (e8) this.b.s();
                e8Var.u(j10);
                h8Var = (h8) e8Var.k();
            }
            p(p7Var2, h8Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // w7.i1
    public final void h(long j10) {
        h8 h8Var;
        try {
            a8 a8VarB = d8.B();
            a8VarB.u(4);
            a8VarB.q(z7.PLAY_BILLING_ACTIVITY_CREATED_ACTION);
            d8 d8Var = (d8) a8VarB.k();
            v8 v8VarD = x8.D();
            if (j10 == 0) {
                h8Var = this.b;
            } else {
                e8 e8Var = (e8) this.b.s();
                e8Var.u(j10);
                h8Var = (h8) e8Var.k();
            }
            v8VarD.v(h8Var);
            v8VarD.u(d8Var);
            this.f35629c.a((x8) v8VarD.k());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // w7.i1
    public final void i(i9 i9Var) {
        try {
            o1 o1Var = this.f35629c;
            v8 v8VarD = x8.D();
            v8VarD.v(this.b);
            v8VarD.x(i9Var);
            o1Var.a((x8) v8VarD.k());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // w7.i1
    public final void j(l7 l7Var) {
        try {
            o(l7Var, this.b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // w7.i1
    public final void k(l7 l7Var, int i10) {
        try {
            e8 e8Var = (e8) this.b.s();
            e8Var.s(i10);
            this.b = (h8) e8Var.k();
            j(l7Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // w7.i1
    public final void l(l7 l7Var, long j10, boolean z10) {
        h8 h8Var;
        try {
            j7 j7Var = (j7) l7Var.s();
            p8 p8Var = (p8) l7Var.H().s();
            p8Var.q(z10);
            j7Var.t(p8Var);
            l7 l7Var2 = (l7) j7Var.k();
            if (j10 == 0) {
                h8Var = this.b;
            } else {
                e8 e8Var = (e8) this.b.s();
                e8Var.u(j10);
                h8Var = (h8) e8Var.k();
            }
            o(l7Var2, h8Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // w7.i1
    public final void m(x7 x7Var) {
        try {
            v8 v8VarD = x8.D();
            v8VarD.v(this.b);
            v8VarD.s(x7Var);
            this.f35629c.a((x8) v8VarD.k());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // w7.i1
    public final void n(l7 l7Var, int i10, long j10) {
        try {
            e8 e8Var = (e8) this.b.s();
            e8Var.s(i10);
            h8 h8Var = (h8) e8Var.k();
            this.b = h8Var;
            if (j10 != 0) {
                e8 e8Var2 = (e8) h8Var.s();
                e8Var2.u(j10);
                h8Var = (h8) e8Var2.k();
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
            v8VarD.v(h8Var);
            v8VarD.q(l7Var);
            this.f35629c.a((x8) v8VarD.k());
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
            v8VarD.v(h8Var);
            v8VarD.r(p7Var);
            this.f35629c.a((x8) v8VarD.k());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }
}

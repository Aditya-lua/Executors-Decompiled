package v7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.f9;
import com.google.android.gms.internal.play_billing.i9;
import com.google.android.gms.internal.play_billing.j7;
import com.google.android.gms.internal.play_billing.l7;
import com.google.android.gms.internal.play_billing.m9;
import com.google.android.gms.internal.play_billing.n7;
import com.google.android.gms.internal.play_billing.n9;
import com.google.android.gms.internal.play_billing.p7;
import com.google.android.gms.internal.play_billing.p9;
import com.google.android.gms.internal.play_billing.q7;
import com.google.android.gms.internal.play_billing.s7;
import com.google.android.gms.internal.play_billing.u7;
import com.google.android.gms.internal.play_billing.x7;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f32823a;
    public final com.google.android.gms.internal.play_billing.z b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.z f32824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.b f32826e;

    public /* synthetic */ p0(com.android.billingclient.api.b bVar, d dVar, int i10, s0 s0Var) {
        Objects.requireNonNull(bVar);
        this.f32826e = bVar;
        this.b = com.google.android.gms.internal.play_billing.z.c(bVar.M);
        this.f32824c = com.google.android.gms.internal.play_billing.z.c(bVar.M);
        this.f32823a = dVar;
        this.f32825d = i10;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x017f A[EDGE_INSN: B:152:0x017f->B:77:0x017f BREAK  A[LOOP:0: B:29:0x00a9->B:74:0x015e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x0140, please report this as an issue */
    public static /* synthetic */ Object a(p0 p0Var) {
        Bundle bundle;
        com.google.android.gms.internal.play_billing.f fVar;
        int i10;
        long j10;
        long j11;
        com.android.billingclient.api.b bVar = p0Var.f32826e;
        synchronized (bVar.f5070a) {
            try {
                if (bVar.b != 3) {
                    int i11 = 0;
                    boolean z10 = true;
                    boolean z11 = bVar.b == 1;
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                        com.google.android.gms.internal.play_billing.m0.c(bundle, bVar.f5071c, bVar.f5072d, bVar.L.longValue());
                    }
                    s7 s7Var = s7.REASON_UNSPECIFIED;
                    synchronized (bVar.f5070a) {
                        fVar = bVar.f5077i;
                    }
                    if (fVar != null) {
                        String packageName = p0Var.f32826e.f5075g.getPackageName();
                        try {
                            if (fVar.V(25, packageName, "inapp") != 0) {
                                Bundle bundle2 = bundle;
                                boolean z12 = z11;
                                int iV = 3;
                                int i12 = 28;
                                while (true) {
                                    if (i12 < 3) {
                                        i12 = 0;
                                        break;
                                    }
                                    try {
                                        com.google.android.gms.internal.play_billing.m0.l("BillingClient", "trying subs apiVersion: " + i12);
                                        iV = bundle2 == null ? fVar.V(i12, packageName, "subs") : fVar.W1(i12, packageName, "subs", bundle2);
                                        if (iV == 0) {
                                            com.google.android.gms.internal.play_billing.m0.l("BillingClient", "highestLevelSupportedForSubs: " + i12);
                                            break;
                                        }
                                        i12--;
                                    } catch (Exception e10) {
                                        p0Var.m(e10, z12);
                                        return null;
                                    }
                                }
                                com.android.billingclient.api.b bVar2 = p0Var.f32826e;
                                bVar2.f5080l = i12 >= 5;
                                if (i12 < 3) {
                                    z10 = false;
                                }
                                bVar2.f5079k = z10;
                                if (i12 < 3) {
                                    s7Var = s7.SUBSCRIPTIONS_NOT_SUPPORTED;
                                    com.google.android.gms.internal.play_billing.m0.l("BillingClient", "In-app billing API does not support subscription on this device.");
                                }
                                for (int i13 = 28; i13 >= 3; i13--) {
                                    com.google.android.gms.internal.play_billing.m0.l("BillingClient", "trying inapp apiVersion: " + i13);
                                    iV = bundle2 == null ? fVar.V(i13, packageName, "inapp") : fVar.W1(i13, packageName, "inapp", bundle2);
                                    if (iV == 0) {
                                        bVar2.f5081m = i13;
                                        com.google.android.gms.internal.play_billing.m0.l("BillingClient", "mHighestLevelSupportedForInApp: " + bVar2.f5081m);
                                        break;
                                    }
                                }
                                com.android.billingclient.api.b.N(bVar2, bVar2.f5081m);
                                if (bVar2.f5081m < 3) {
                                    s7Var = s7.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                    com.google.android.gms.internal.play_billing.m0.m("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                }
                                com.android.billingclient.api.b.P(bVar2, iV);
                                if (iV == 0) {
                                    p0Var.j(z12, 0);
                                    p0Var.k(com.android.billingclient.api.h.f5172i);
                                    return null;
                                }
                                com.android.billingclient.api.d dVar = com.android.billingclient.api.h.b;
                                p0Var.i(dVar, s7Var, null, z12, 0);
                                p0Var.k(dVar);
                                return null;
                            }
                            com.android.billingclient.api.b bVar3 = p0Var.f32826e;
                            long jB = f2.b(bVar3.f5075g);
                            long jC = f2.c(bVar3.f5075g);
                            double dA = f2.a(bVar3.f5075g);
                            boolean z13 = z11;
                            long jD = f2.d(bVar3.f5075g);
                            Exception e11 = null;
                            while (true) {
                                long j12 = i11;
                                if (j12 > jB) {
                                    i10 = i11;
                                    break;
                                }
                                j10 = jC;
                                try {
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(z13);
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putString("callingPackage", bVar3.f5075g.getPackageName());
                                        j11 = jD;
                                        try {
                                            com.google.android.gms.internal.play_billing.m0.c(bundle3, bVar3.f5071c, bVar3.f5072d, bVar3.L.longValue());
                                            if (bVar3.F != null && bVar3.F.a()) {
                                                bundle3.putBoolean("enablePendingPurchases", true);
                                            }
                                            if (bVar3.F != null) {
                                                try {
                                                    if (bVar3.F.b()) {
                                                        try {
                                                            bundle3.putBoolean("enablePendingPurchaseForSubscriptions", true);
                                                        } catch (Exception e12) {
                                                            e11 = e12;
                                                            i10 = i11;
                                                            if (j12 == jB) {
                                                                p0Var.l(e11, z13, i10);
                                                                return null;
                                                            }
                                                            com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Transient error during initialize(), retrying in " + j10 + "ms", e11);
                                                            try {
                                                                Thread.sleep(j10);
                                                                long j13 = j11;
                                                                i11 = i10 + 1;
                                                                jC = (long) Math.min(j10 * dA, j13);
                                                                jD = j13;
                                                                fVar = fVar;
                                                            } catch (InterruptedException e13) {
                                                                Thread.currentThread().interrupt();
                                                                p0Var.l(e13, z13, i10);
                                                                return null;
                                                            }
                                                        }
                                                    }
                                                } catch (Exception e14) {
                                                    e11 = e14;
                                                }
                                            }
                                            i10 = i11;
                                            try {
                                                try {
                                                    try {
                                                        fVar.E1(25, bVar3.f5075g.getPackageName(), bundle3, new q0(bVar3, p0Var, boolValueOf, i10, null));
                                                        return null;
                                                    } catch (Exception e15) {
                                                        e11 = e15;
                                                        if (j12 == jB) {
                                                            p0Var.l(e11, z13, i10);
                                                            return null;
                                                        }
                                                        com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Transient error during initialize(), retrying in " + j10 + "ms", e11);
                                                        Thread.sleep(j10);
                                                        long j14 = j11;
                                                        i11 = i10 + 1;
                                                        jC = (long) Math.min(j10 * dA, j14);
                                                        jD = j14;
                                                        fVar = fVar;
                                                    }
                                                } catch (Exception e16) {
                                                    e11 = e16;
                                                    if (j12 == jB) {
                                                        p0Var.l(e11, z13, i10);
                                                        return null;
                                                    }
                                                    com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Transient error during initialize(), retrying in " + j10 + "ms", e11);
                                                    Thread.sleep(j10);
                                                    long j15 = j11;
                                                    i11 = i10 + 1;
                                                    jC = (long) Math.min(j10 * dA, j15);
                                                    jD = j15;
                                                    fVar = fVar;
                                                }
                                            } catch (SecurityException e17) {
                                                e = e17;
                                                p0Var.l(e, z13, i10);
                                                return null;
                                            }
                                        } catch (Exception e18) {
                                            e11 = e18;
                                            i10 = i11;
                                        }
                                    } catch (SecurityException e19) {
                                        e = e19;
                                        i10 = i11;
                                    }
                                } catch (Exception e20) {
                                    e11 = e20;
                                    i10 = i11;
                                    j11 = jD;
                                }
                                long j16 = j11;
                                i11 = i10 + 1;
                                jC = (long) Math.min(j10 * dA, j16);
                                jD = j16;
                                fVar = fVar;
                            }
                            p0Var.l(e11, z13, i10);
                            return null;
                        } catch (Exception e21) {
                            p0Var.m(e21, z11);
                            return null;
                        }
                    }
                    com.android.billingclient.api.b bVar4 = p0Var.f32826e;
                    bVar4.f0(0);
                    int i14 = p0Var.f32825d;
                    s7 s7Var2 = s7.SERVICE_RESET_TO_NULL;
                    com.android.billingclient.api.d dVar2 = com.android.billingclient.api.h.f5173j;
                    bVar4.e0(s7Var2, dVar2, i14);
                    p0Var.k(dVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return null;
    }

    public static /* synthetic */ void b(p0 p0Var) {
        com.android.billingclient.api.b bVar = p0Var.f32826e;
        bVar.f0(0);
        s7 s7Var = s7.EXECUTE_ASYNC_TIMEOUT;
        com.android.billingclient.api.d dVar = com.android.billingclient.api.h.f5174k;
        bVar.e0(s7Var, dVar, p0Var.f32825d);
        p0Var.k(dVar);
    }

    public final void f() {
        synchronized (this.f32826e.f5070a) {
            com.google.android.gms.internal.play_billing.z zVar = this.b;
            zVar.d();
            zVar.e();
        }
    }

    public final boolean g() {
        return this.f32825d > 0;
    }

    public final Long h(boolean z10) {
        try {
            if (z10) {
                synchronized (this.f32826e.f5070a) {
                    try {
                        com.google.android.gms.internal.play_billing.z zVar = this.b;
                        if (!zVar.g()) {
                            return null;
                        }
                        zVar.f();
                        return Long.valueOf(zVar.a(TimeUnit.MILLISECONDS));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            synchronized (this.f32826e.f5070a) {
                try {
                    com.google.android.gms.internal.play_billing.z zVar2 = this.f32824c;
                    if (!zVar2.g()) {
                        return null;
                    }
                    zVar2.f();
                    return Long.valueOf(zVar2.a(TimeUnit.MILLISECONDS));
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception getting connection establishment duration.", th4);
        }
        com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception getting connection establishment duration.", th4);
        return null;
    }

    public final void i(com.android.billingclient.api.d dVar, s7 s7Var, String str, boolean z10, int i10) {
        try {
            q7 q7VarC = u7.C();
            q7VarC.t(dVar.c());
            q7VarC.p(dVar.a());
            q7VarC.s(s7Var);
            q7VarC.q(i10);
            if (str != null) {
                q7VarC.o(str);
            }
            Long lH = h(z10);
            if (!z10) {
                f9 f9VarB = i9.B();
                f9VarB.o(q7VarC);
                if (lH != null) {
                    f9VarB.p(lH.longValue());
                }
                this.f32826e.f5076h.i((i9) f9VarB.i());
                return;
            }
            n9 n9VarB = p9.B();
            int i11 = this.f32825d;
            n9VarB.o(i11 > 0);
            n9VarB.p(i11);
            n9VarB.r(i10);
            if (lH != null) {
                n9VarB.q(lH.longValue());
            }
            com.android.billingclient.api.b bVar = this.f32826e;
            j7 j7VarE = l7.E();
            j7VarE.p(q7VarC);
            j7VarE.t(6);
            j7VarE.s(n9VarB);
            bVar.b0((l7) j7VarE.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    public final void j(boolean z10, int i10) {
        try {
            Long lH = h(z10);
            if (!z10) {
                f9 f9VarB = i9.B();
                q7 q7VarC = u7.C();
                q7VarC.t(0);
                q7VarC.q(i10);
                f9VarB.o(q7VarC);
                if (lH != null) {
                    f9VarB.p(lH.longValue());
                }
                this.f32826e.f5076h.i((i9) f9VarB.i());
                return;
            }
            n7 n7VarC = p7.C();
            n7VarC.s(6);
            n9 n9VarB = p9.B();
            int i11 = this.f32825d;
            n9VarB.o(i11 > 0);
            n9VarB.p(i11);
            n9VarB.r(i10);
            if (lH != null) {
                n9VarB.q(lH.longValue());
            }
            com.android.billingclient.api.b bVar = this.f32826e;
            n7VarC.r(n9VarB);
            bVar.d0((p7) n7VarC.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    public final void k(com.android.billingclient.api.d dVar) {
        com.android.billingclient.api.b bVar = this.f32826e;
        synchronized (bVar.f5070a) {
            try {
                if (bVar.b == 3) {
                    return;
                }
                try {
                    this.f32823a.a(dVar);
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception while calling onBillingSetupFinished.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void l(Exception exc, boolean z10, int i10) {
        s7 s7Var;
        com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception while invoking initialize AIDL method", exc);
        if (exc instanceof DeadObjectException) {
            s7Var = s7.INITIALIZE_DEAD_OBJECT_EXCEPTION;
        } else if (exc instanceof RemoteException) {
            s7Var = s7.INITIALIZE_REMOTE_EXCEPTION;
        } else {
            s7Var = exc instanceof SecurityException ? s7.INITIALIZE_SECURITY_EXCEPTION : s7.INITIALIZE_SERVICE_CALL_EXCEPTION;
        }
        s7 s7Var2 = s7Var;
        String strA = h1.a(exc);
        this.f32826e.f0(0);
        i(com.android.billingclient.api.b.F0(exc), s7Var2, strA, z10, i10);
        k(com.android.billingclient.api.b.F0(exc));
    }

    public final void m(Exception exc, boolean z10) {
        s7 s7Var;
        com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception while checking if billing is supported; try to reconnect", exc);
        if (exc instanceof DeadObjectException) {
            s7Var = s7.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION;
        } else if (exc instanceof RemoteException) {
            s7Var = s7.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION;
        } else {
            s7Var = exc instanceof SecurityException ? s7.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : s7.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
        }
        s7 s7Var2 = s7Var;
        String strA = s7Var2.equals(s7.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? h1.a(exc) : null;
        this.f32826e.f0(0);
        i(com.android.billingclient.api.b.F0(exc), s7Var2, strA, z10, 0);
        k(com.android.billingclient.api.b.F0(exc));
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.m0.m("BillingClient", "Billing service died.");
        try {
            com.android.billingclient.api.b bVar = this.f32826e;
            if (com.android.billingclient.api.b.T(bVar)) {
                i1 i1Var = bVar.f5076h;
                j7 j7VarE = l7.E();
                j7VarE.t(6);
                q7 q7VarC = u7.C();
                q7VarC.s(s7.BINDING_DIED);
                j7VarE.p(q7VarC);
                n9 n9VarB = p9.B();
                int i10 = this.f32825d;
                n9VarB.o(i10 > 0);
                n9VarB.p(i10);
                j7VarE.s(n9VarB);
                i1Var.j((l7) j7VarE.i());
            } else {
                bVar.f5076h.m(x7.C());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Unable to log.", th2);
        }
        com.android.billingclient.api.b bVar2 = this.f32826e;
        synchronized (bVar2.f5070a) {
            if (bVar2.b != 3 && bVar2.b != 0) {
                bVar2.f0(0);
                bVar2.h0();
                try {
                    this.f32823a.b();
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.m0.l("BillingClient", "Billing service connected.");
        com.android.billingclient.api.b bVar = this.f32826e;
        synchronized (bVar.f5070a) {
            try {
                if (bVar.b == 3) {
                    return;
                }
                bVar.f5077i = com.google.android.gms.internal.play_billing.e.u2(iBinder);
                if (com.android.billingclient.api.b.o(new Callable() { // from class: v7.n0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        p0.a(this.f32814a);
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: v7.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        p0.b(this.f32817a);
                    }
                }, bVar.Y(), bVar.n()) == null) {
                    int i10 = this.f32825d;
                    com.android.billingclient.api.d dVarX = bVar.x();
                    bVar.e0(s7.MISSING_RESULT_FROM_EXECUTE_ASYNC, dVarX, i10);
                    k(dVarX);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.m0.m("BillingClient", "Billing service disconnected.");
        try {
            com.android.billingclient.api.b bVar = this.f32826e;
            if (com.android.billingclient.api.b.T(bVar)) {
                i1 i1Var = bVar.f5076h;
                j7 j7VarE = l7.E();
                j7VarE.t(6);
                q7 q7VarC = u7.C();
                q7VarC.s(s7.SERVICE_DISCONNECTED);
                j7VarE.p(q7VarC);
                n9 n9VarB = p9.B();
                int i10 = this.f32825d;
                n9VarB.o(i10 > 0);
                n9VarB.p(i10);
                j7VarE.s(n9VarB);
                i1Var.j((l7) j7VarE.i());
            } else {
                bVar.f5076h.a(m9.C());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Unable to log.", th2);
        }
        com.android.billingclient.api.b bVar2 = this.f32826e;
        synchronized (bVar2.f5070a) {
            try {
                com.google.android.gms.internal.play_billing.z zVar = this.f32824c;
                zVar.d();
                zVar.e();
                if (bVar2.b == 3) {
                    return;
                }
                bVar2.f0(0);
                try {
                    this.f32823a.b();
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}

package l9;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class t1 extends i implements DialogInterface.OnCancelListener {
    public volatile boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f23085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f23086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.c f23087e;

    public t1(j jVar, j9.c cVar) {
        super(jVar);
        this.f23085c = new AtomicReference(null);
        this.f23086d = new bb.j(Looper.getMainLooper());
        this.f23087e = cVar;
    }

    public static final int p(q1 q1Var) {
        if (q1Var == null) {
            return -1;
        }
        return q1Var.a();
    }

    @Override // l9.i
    public final void e(int i10, int i11, Intent intent) {
        q1 q1Var = (q1) this.f23085c.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int iG = this.f23087e.g(b());
                if (iG == 0) {
                    o();
                    return;
                } else {
                    if (q1Var == null) {
                        return;
                    }
                    if (q1Var.b().w3() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            o();
            return;
        } else if (i11 == 0) {
            if (q1Var != null) {
                l(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, q1Var.b().toString()), p(q1Var));
                return;
            }
            return;
        }
        if (q1Var != null) {
            l(q1Var.b(), q1Var.a());
        }
    }

    @Override // l9.i
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f23085c.set(bundle.getBoolean("resolving_error", false) ? new q1(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // l9.i
    public final void i(Bundle bundle) {
        super.i(bundle);
        q1 q1Var = (q1) this.f23085c.get();
        if (q1Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", q1Var.a());
        bundle.putInt("failed_status", q1Var.b().w3());
        bundle.putParcelable("failed_resolution", q1Var.b().y3());
    }

    @Override // l9.i
    public void j() {
        super.j();
        this.b = true;
    }

    @Override // l9.i
    public void k() {
        super.k();
        this.b = false;
    }

    public final void l(ConnectionResult connectionResult, int i10) {
        this.f23085c.set(null);
        m(connectionResult, i10);
    }

    public abstract void m(ConnectionResult connectionResult, int i10);

    public abstract void n();

    public final void o() {
        this.f23085c.set(null);
        n();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new ConnectionResult(13, null), p((q1) this.f23085c.get()));
    }

    public final void s(ConnectionResult connectionResult, int i10) {
        AtomicReference atomicReference;
        q1 q1Var = new q1(connectionResult, i10);
        do {
            atomicReference = this.f23085c;
            if (p1.t.a(atomicReference, null, q1Var)) {
                this.f23086d.post(new s1(this, q1Var));
                return;
            }
        } while (atomicReference.get() == null);
    }
}

package wa;

import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class l0 extends m9.u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f35719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(m0 m0Var, k0 k0Var) {
        super(null, false, 28901);
        this.f35719d = m0Var;
    }

    @Override // m9.u
    public final /* bridge */ /* synthetic */ void d(l9.a.b bVar, tb.k kVar) {
        nf.a aVarI2 = ((nf.e) ((q0) bVar).getService()).i2(new j0(this, kVar), this.f35719d.f35720a);
        int i10 = aVarI2 == null ? 2 : aVarI2.f25509f;
        boolean z10 = true;
        m0 m0Var = null;
        if (i10 == 3) {
            if (r0.b(4)) {
                Log.i("AppIndex", "Queue was full. API call will be retried.");
            }
            if (kVar.e(null)) {
                synchronized (this.f35719d.f35721c.f35723c) {
                    try {
                        n0 n0Var = this.f35719d.f35721c;
                        if (n0Var.f35724d == 0) {
                            m0Var = (m0) n0Var.f35723c.peek();
                            o9.s.p(m0Var == this.f35719d);
                        } else {
                            n0Var.f35724d = 2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            if (i10 != 1) {
                String str = "API call failed. Status code: " + i10;
                if (r0.b(6)) {
                    Log.e("AppIndex", str);
                }
                if (kVar.e(null)) {
                    this.f35719d.b.b(new w8.c("Indexing error."));
                }
            }
            synchronized (this.f35719d.f35721c.f35723c) {
                if (((m0) this.f35719d.f35721c.f35723c.poll()) != this.f35719d) {
                    z10 = false;
                }
                o9.s.p(z10);
                m0Var = (m0) this.f35719d.f35721c.f35723c.peek();
                this.f35719d.f35721c.f35724d = 0;
            }
        }
        if (m0Var != null) {
            m0Var.d();
        }
    }
}

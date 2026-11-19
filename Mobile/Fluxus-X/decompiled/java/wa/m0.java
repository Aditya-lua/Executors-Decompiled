package wa;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nf.g f35720a;
    public final tb.k b = new tb.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f35721c;

    public m0(n0 n0Var, nf.g gVar) {
        this.f35721c = n0Var;
        this.f35720a = gVar;
    }

    public final Task a() {
        return this.b.a();
    }

    public final void d() {
        synchronized (this.f35721c.f35723c) {
            o9.s.p(this.f35721c.f35724d == 0);
            this.f35721c.f35724d = 1;
        }
        this.f35721c.f35722a.D(new l0(this, null)).d(this.f35721c, new tb.f() { // from class: wa.i0
            @Override // tb.f
            public final void onFailure(Exception exc) {
                this.f35712a.e(exc);
            }
        });
    }

    public final /* synthetic */ void e(Exception exc) {
        m0 m0Var;
        synchronized (this.f35721c.f35723c) {
            try {
                if (this.f35721c.f35723c.peek() == this) {
                    this.f35721c.f35723c.remove();
                    this.f35721c.f35724d = 0;
                    m0Var = (m0) this.f35721c.f35723c.peek();
                } else {
                    m0Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.b.d(exc);
        if (m0Var != null) {
            m0Var.d();
        }
    }
}

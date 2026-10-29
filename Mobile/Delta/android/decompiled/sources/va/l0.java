package va;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appindexing.internal.zzg;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f32897a;
    public final sb.k b = new sb.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f32898c;

    public l0(m0 m0Var, zzg zzgVar) {
        this.f32898c = m0Var;
        this.f32897a = zzgVar;
    }

    public final Task a() {
        return this.b.a();
    }

    public final void d() {
        synchronized (this.f32898c.f32900c) {
            n9.m.p(this.f32898c.f32901d == 0);
            this.f32898c.f32901d = 1;
        }
        this.f32898c.f32899a.D(new k0(this, null)).d(this.f32898c, new sb.f() { // from class: va.h0
            @Override // sb.f
            public final void onFailure(Exception exc) {
                this.f32888a.e(exc);
            }
        });
    }

    public final /* synthetic */ void e(Exception exc) {
        l0 l0Var;
        synchronized (this.f32898c.f32900c) {
            try {
                if (this.f32898c.f32900c.peek() == this) {
                    this.f32898c.f32900c.remove();
                    this.f32898c.f32901d = 0;
                    l0Var = (l0) this.f32898c.f32900c.peek();
                } else {
                    l0Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.b.d(exc);
        if (l0Var != null) {
            l0Var.d();
        }
    }
}

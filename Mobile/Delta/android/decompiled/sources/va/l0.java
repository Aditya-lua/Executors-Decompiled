package va;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appindexing.internal.zzg;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f33465a;
    public final sb.k b = new sb.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f33466c;

    public l0(m0 m0Var, zzg zzgVar) {
        this.f33466c = m0Var;
        this.f33465a = zzgVar;
    }

    public final Task a() {
        return this.b.a();
    }

    public final void d() {
        synchronized (this.f33466c.f33468c) {
            n9.m.p(this.f33466c.f33469d == 0);
            this.f33466c.f33469d = 1;
        }
        this.f33466c.f33467a.D(new k0(this, null)).d(this.f33466c, new sb.f() { // from class: va.h0
            @Override // sb.f
            public final void onFailure(Exception exc) {
                this.f33456a.e(exc);
            }
        });
    }

    public final /* synthetic */ void e(Exception exc) {
        l0 l0Var;
        synchronized (this.f33466c.f33468c) {
            try {
                if (this.f33466c.f33468c.peek() == this) {
                    this.f33466c.f33468c.remove();
                    this.f33466c.f33469d = 0;
                    l0Var = (l0) this.f33466c.f33468c.peek();
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

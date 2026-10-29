package va;

import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.appindexing.internal.zza;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class k0 extends l9.u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f32895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(l0 l0Var, j0 j0Var) {
        super(null, false, 28901);
        this.f32895d = l0Var;
    }

    @Override // l9.u
    public final /* bridge */ /* synthetic */ void d(k9.a.b bVar, sb.k kVar) {
        zza zzaVarQ0 = ((kf.d) ((p0) bVar).getService()).q0(new i0(this, kVar), this.f32895d.f32897a);
        int i10 = zzaVarQ0 == null ? 2 : zzaVarQ0.f8682f;
        boolean z10 = true;
        l0 l0Var = null;
        if (i10 == 3) {
            if (q0.b(4)) {
                Log.i("AppIndex", "Queue was full. API call will be retried.");
            }
            if (kVar.e(null)) {
                synchronized (this.f32895d.f32898c.f32900c) {
                    try {
                        m0 m0Var = this.f32895d.f32898c;
                        if (m0Var.f32901d == 0) {
                            l0Var = (l0) m0Var.f32900c.peek();
                            n9.m.p(l0Var == this.f32895d);
                        } else {
                            m0Var.f32901d = 2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            if (i10 != 1) {
                String str = "API call failed. Status code: " + i10;
                if (q0.b(6)) {
                    Log.e("AppIndex", str);
                }
                if (kVar.e(null)) {
                    this.f32895d.b.b(new v8.c("Indexing error."));
                }
            }
            synchronized (this.f32895d.f32898c.f32900c) {
                if (((l0) this.f32895d.f32898c.f32900c.poll()) != this.f32895d) {
                    z10 = false;
                }
                n9.m.p(z10);
                l0Var = (l0) this.f32895d.f32898c.f32900c.peek();
                this.f32895d.f32898c.f32901d = 0;
            }
        }
        if (l0Var != null) {
            l0Var.d();
        }
    }
}

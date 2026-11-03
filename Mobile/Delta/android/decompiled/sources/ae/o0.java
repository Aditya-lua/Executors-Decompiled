package ae;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.u0 f451a;
    public final be.u0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final be.u0 f452c;

    public o0(be.u0 u0Var, be.u0 u0Var2, be.u0 u0Var3) {
        this.f451a = u0Var;
        this.b = u0Var2;
        this.f452c = u0Var3;
    }

    @Override // ae.b
    public final Task<Integer> a(@NonNull d dVar) {
        return g().a(dVar);
    }

    @Override // ae.b
    public final void b(@NonNull f fVar) {
        g().b(fVar);
    }

    @Override // ae.b
    public final void c(@NonNull f fVar) {
        g().c(fVar);
    }

    @Override // ae.b
    @NonNull
    public final Task<Void> d(List<String> list) {
        return g().d(list);
    }

    @Override // ae.b
    @NonNull
    public final Set<String> e() {
        return g().e();
    }

    @Override // ae.b
    @NonNull
    public final Task<Void> f(List<String> list) {
        return g().f(list);
    }

    public final b g() {
        return this.f452c.zza() != null ? (b) this.b.zza() : (b) this.f451a.zza();
    }
}

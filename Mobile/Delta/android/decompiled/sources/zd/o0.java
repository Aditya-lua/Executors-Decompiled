package zd;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ae.u0 f37495a;
    public final ae.u0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ae.u0 f37496c;

    public o0(ae.u0 u0Var, ae.u0 u0Var2, ae.u0 u0Var3) {
        this.f37495a = u0Var;
        this.b = u0Var2;
        this.f37496c = u0Var3;
    }

    @Override // zd.b
    public final void a(@NonNull f fVar) {
        g().a(fVar);
    }

    @Override // zd.b
    public final Task<Integer> b(@NonNull d dVar) {
        return g().b(dVar);
    }

    @Override // zd.b
    public final void c(@NonNull f fVar) {
        g().c(fVar);
    }

    @Override // zd.b
    @NonNull
    public final Task<Void> d(List<String> list) {
        return g().d(list);
    }

    @Override // zd.b
    @NonNull
    public final Set<String> e() {
        return g().e();
    }

    @Override // zd.b
    @NonNull
    public final Task<Void> f(List<String> list) {
        return g().f(list);
    }

    public final b g() {
        return this.f37496c.zza() != null ? (b) this.b.zza() : (b) this.f37495a.zza();
    }
}

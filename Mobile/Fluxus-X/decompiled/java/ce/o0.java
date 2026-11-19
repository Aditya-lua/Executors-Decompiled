package ce;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final de.u0 f4998a;
    public final de.u0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final de.u0 f4999c;

    public o0(de.u0 u0Var, de.u0 u0Var2, de.u0 u0Var3) {
        this.f4998a = u0Var;
        this.b = u0Var2;
        this.f4999c = u0Var3;
    }

    @Override // ce.b
    @NonNull
    public final Task<Void> a(List<String> list) {
        return g().a(list);
    }

    @Override // ce.b
    @NonNull
    public final Set<String> b() {
        return g().b();
    }

    @Override // ce.b
    public final void c(@NonNull f fVar) {
        g().c(fVar);
    }

    @Override // ce.b
    public final Task<Integer> d(@NonNull d dVar) {
        return g().d(dVar);
    }

    @Override // ce.b
    @NonNull
    public final Task<Void> e(List<String> list) {
        return g().e(list);
    }

    @Override // ce.b
    public final void f(@NonNull f fVar) {
        g().f(fVar);
    }

    public final b g() {
        return this.f4999c.zza() != null ? (b) this.b.zza() : (b) this.f4998a.zza();
    }
}

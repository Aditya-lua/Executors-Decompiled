package td;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f32306a;
    public final t0 b;

    public z(n0 n0Var, t0 t0Var) {
        this.f32306a = n0Var;
        this.b = t0Var;
    }

    @Override // td.c
    public final Task<c.InterfaceC0578c> a(final c.a aVar) {
        long jB = aVar.b();
        aVar.a();
        return this.f32306a.d(jB, 0).o(new sb.j() { // from class: td.y
            @Override // sb.j
            public final Task then(Object obj) {
                return this.f32304a.b(aVar, (Long) obj);
            }
        });
    }

    public final /* synthetic */ Task b(c.a aVar, Long l10) {
        final long jB = aVar.b();
        final long jLongValue = l10.longValue();
        aVar.a();
        final t0 t0Var = this.b;
        final int i10 = 0;
        return sb.m.f(new c.InterfaceC0578c(jB, jLongValue, i10) { // from class: td.s0
            public final /* synthetic */ long b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f32295c;

            @Override // td.c.InterfaceC0578c
            public final Task a(c.d dVar) {
                return this.f32294a.a(this.b, this.f32295c, 0, dVar);
            }
        });
    }
}

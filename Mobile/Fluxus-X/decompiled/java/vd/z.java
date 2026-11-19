package vd;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f34340a;
    public final t0 b;

    public z(n0 n0Var, t0 t0Var) {
        this.f34340a = n0Var;
        this.b = t0Var;
    }

    @Override // vd.c
    public final Task<c.InterfaceC0700c> a(final c.a aVar) {
        long jB = aVar.b();
        aVar.a();
        return this.f34340a.d(jB, 0).o(new tb.j() { // from class: vd.y
            @Override // tb.j
            public final Task then(Object obj) {
                return this.f34338a.b(aVar, (Long) obj);
            }
        });
    }

    public final /* synthetic */ Task b(c.a aVar, Long l10) {
        final long jB = aVar.b();
        final long jLongValue = l10.longValue();
        aVar.a();
        final t0 t0Var = this.b;
        final int i10 = 0;
        return tb.m.f(new c.InterfaceC0700c(jB, jLongValue, i10) { // from class: vd.s0
            public final /* synthetic */ long b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f34329c;

            @Override // vd.c.InterfaceC0700c
            public final Task a(c.d dVar) {
                return this.f34328a.a(this.b, this.f34329c, 0, dVar);
            }
        });
    }
}

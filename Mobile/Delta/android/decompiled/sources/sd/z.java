package sd;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f30697a;
    public final t0 b;

    public z(n0 n0Var, t0 t0Var) {
        this.f30697a = n0Var;
        this.b = t0Var;
    }

    @Override // sd.c
    public final Task<c.InterfaceC0543c> a(final c.a aVar) {
        long jB = aVar.b();
        aVar.a();
        return this.f30697a.d(jB, 0).o(new sb.j() { // from class: sd.y
            @Override // sb.j
            public final Task then(Object obj) {
                return this.f30695a.b(aVar, (Long) obj);
            }
        });
    }

    public final /* synthetic */ Task b(c.a aVar, Long l10) {
        final long jB = aVar.b();
        final long jLongValue = l10.longValue();
        aVar.a();
        final t0 t0Var = this.b;
        final int i10 = 0;
        return sb.m.f(new c.InterfaceC0543c(jB, jLongValue, i10) { // from class: sd.s0
            public final /* synthetic */ long b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f30686c;

            @Override // sd.c.InterfaceC0543c
            public final Task a(c.d dVar) {
                return this.f30685a.a(this.b, this.f30686c, 0, dVar);
            }
        });
    }
}

package td;

import com.google.android.gms.tasks.Task;
import sb.C11268m;
import sb.InterfaceC11262j;

/* JADX INFO: renamed from: td.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C11634z implements InterfaceC11571c {

    /* JADX INFO: renamed from: a */
    public final C11605n0 f41037a;

    /* JADX INFO: renamed from: b */
    public final C11623t0 f41038b;

    public C11634z(C11605n0 c11605n0, C11623t0 c11623t0) {
        this.f41037a = c11605n0;
        this.f41038b = c11623t0;
    }

    @Override // td.InterfaceC11571c
    /* JADX INFO: renamed from: a */
    public final Task<InterfaceC11571c.c> mo43242a(final InterfaceC11571c.a aVar) {
        long jMo43245b = aVar.mo43245b();
        aVar.mo43244a();
        return this.f41037a.m43277d(jMo43245b, 0).mo11901o(new InterfaceC11262j() { // from class: td.y
            @Override // sb.InterfaceC11262j
            public final Task then(Object obj) {
                return this.f41033a.m43288b(aVar, (Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Task m43288b(InterfaceC11571c.a aVar, Long l10) {
        final long jMo43245b = aVar.mo43245b();
        final long jLongValue = l10.longValue();
        aVar.mo43244a();
        final C11623t0 c11623t0 = this.f41038b;
        final int i10 = 0;
        return C11268m.m42336f(new InterfaceC11571c.c(jMo43245b, jLongValue, i10) { // from class: td.s0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f41020b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ long f41021c;

            @Override // td.InterfaceC11571c.c
            /* JADX INFO: renamed from: a */
            public final Task mo43249a(InterfaceC11571c.d dVar) {
                return this.f41019a.m43283a(this.f41020b, this.f41021c, 0, dVar);
            }
        });
    }
}

package b1;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import me.x;
import n0.c2;
import n0.l0;
import n0.l1;

/* JADX INFO: loaded from: classes.dex */
public class p extends c2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.a f3823c;

    public p(l0 l0Var, g.a aVar) {
        super(l0Var);
        this.f3823c = aVar;
    }

    @Override // n0.c2, n0.l0
    public x<List<Void>> f(final List<l1> list, int i10, int i11) {
        x2.g.b(list.size() == 1, "Only support one capture config.");
        final x<m0.m> xVarM = m(i10, 1);
        return r0.n.k(Collections.singletonList(r0.d.c(xVarM).g(new r0.a() { // from class: b1.m
            @Override // r0.a
            public final x apply(Object obj) {
                return ((m0.m) xVarM.get()).a();
            }
        }, q0.c.b()).g(new r0.a() { // from class: b1.n
            @Override // r0.a
            public final x apply(Object obj) {
                p pVar = this.f3821a;
                List list2 = list;
                return pVar.f3823c.a(pVar.s((l1) list2.get(0)), pVar.t((l1) list2.get(0)));
            }
        }, q0.c.b()).g(new r0.a() { // from class: b1.o
            @Override // r0.a
            public final x apply(Object obj) {
                return ((m0.m) xVarM.get()).b();
            }
        }, q0.c.b())));
    }

    public final int s(l1 l1Var) {
        Integer num = (Integer) l1Var.g().h(l1.f24729j, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int t(l1 l1Var) {
        Integer num = (Integer) l1Var.g().h(l1.f24728i, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}

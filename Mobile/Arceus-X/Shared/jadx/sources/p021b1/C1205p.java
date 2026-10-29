package p021b1;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import ne.InterfaceFutureC9440x;
import p281m0.InterfaceC8308m;
import p296n0.C8733c2;
import p296n0.C8785l1;
import p296n0.InterfaceC8784l0;
import p366q0.C10417c;
import p397r0.C10763d;
import p397r0.C10773n;
import p397r0.InterfaceC10760a;
import p533x2.C12637g;

/* JADX INFO: renamed from: b1.p */
/* JADX INFO: loaded from: classes.dex */
public class C1205p extends C8733c2 {

    /* JADX INFO: renamed from: c */
    public final C1196g.a f5008c;

    public C1205p(InterfaceC8784l0 interfaceC8784l0, C1196g.a aVar) {
        super(interfaceC8784l0);
        this.f5008c = aVar;
    }

    @Override // p296n0.C8733c2, p296n0.InterfaceC8784l0
    /* JADX INFO: renamed from: f */
    public InterfaceFutureC9440x<List<Void>> mo6745f(final List<C8785l1> list, int i10, int i11) {
        C12637g.m47070b(list.size() == 1, "Only support one capture config.");
        final InterfaceFutureC9440x<InterfaceC8308m> interfaceFutureC9440xMo35018m = mo35018m(i10, 1);
        return C10773n.m40988k(Collections.singletonList(C10763d.m40973c(interfaceFutureC9440xMo35018m).m40977g(new InterfaceC10760a() { // from class: b1.m
            @Override // p397r0.InterfaceC10760a
            public final InterfaceFutureC9440x apply(Object obj) {
                return ((InterfaceC8308m) interfaceFutureC9440xMo35018m.get()).mo33779a();
            }
        }, C10417c.m40081b()).m40977g(new InterfaceC10760a() { // from class: b1.n
            @Override // p397r0.InterfaceC10760a
            public final InterfaceFutureC9440x apply(Object obj) {
                C1205p c1205p = this.f5005a;
                List list2 = list;
                return c1205p.f5008c.mo6645a(c1205p.m6746s((C8785l1) list2.get(0)), c1205p.m6747t((C8785l1) list2.get(0)));
            }
        }, C10417c.m40081b()).m40977g(new InterfaceC10760a() { // from class: b1.o
            @Override // p397r0.InterfaceC10760a
            public final InterfaceFutureC9440x apply(Object obj) {
                return ((InterfaceC8308m) interfaceFutureC9440xMo35018m.get()).mo33780b();
            }
        }, C10417c.m40081b())));
    }

    /* JADX INFO: renamed from: s */
    public final int m6746s(C8785l1 c8785l1) {
        Integer num = (Integer) c8785l1.m35244g().mo35030h(C8785l1.f31944j, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: t */
    public final int m6747t(C8785l1 c8785l1) {
        Integer num = (Integer) c8785l1.m35244g().mo35030h(C8785l1.f31943i, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}

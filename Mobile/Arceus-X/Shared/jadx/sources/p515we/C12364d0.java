package p515we;

import java.util.concurrent.atomic.AtomicReference;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.C10218d0;

/* JADX INFO: renamed from: we.d0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C12364d0 {

    /* JADX INFO: renamed from: b */
    public static final C12364d0 f44219b = (C12364d0) C12392r0.m46444a(new C12392r0.a() { // from class: we.b0
        @Override // p515we.C12392r0.a
        public final Object get() {
            return C12364d0.m46237b();
        }
    });

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C12390q0> f44220a = new AtomicReference<>(new C12390q0.b().m46436e());

    /* JADX INFO: renamed from: b */
    public static C12364d0 m46237b() {
        C12364d0 c12364d0 = new C12364d0();
        c12364d0.m46246k(AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: we.c0
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return ((C12387p) abstractC10231l).m46419b(c10218d0);
            }
        }, C12387p.class, C12380l0.class));
        return c12364d0;
    }

    /* JADX INFO: renamed from: c */
    public static C12364d0 m46238c() {
        return f44219b;
    }

    /* JADX INFO: renamed from: d */
    public <SerializationT extends InterfaceC12388p0> boolean m46239d(SerializationT serializationt) {
        return this.f44220a.get().m46426e(serializationt);
    }

    /* JADX INFO: renamed from: e */
    public <SerializationT extends InterfaceC12388p0> boolean m46240e(SerializationT serializationt) {
        return this.f44220a.get().m46427f(serializationt);
    }

    /* JADX INFO: renamed from: f */
    public <SerializationT extends InterfaceC12388p0> AbstractC10231l m46241f(SerializationT serializationt, C10218d0 c10218d0) {
        return this.f44220a.get().m46428g(serializationt, c10218d0);
    }

    /* JADX INFO: renamed from: g */
    public AbstractC10231l m46242g(C12380l0 c12380l0, C10218d0 c10218d0) {
        return !m46239d(c12380l0) ? new C12387p(c12380l0, c10218d0) : m46241f(c12380l0, c10218d0);
    }

    /* JADX INFO: renamed from: h */
    public <SerializationT extends InterfaceC12388p0> AbstractC10243x m46243h(SerializationT serializationt) {
        return this.f44220a.get().m46429h(serializationt);
    }

    /* JADX INFO: renamed from: i */
    public AbstractC10243x m46244i(C12382m0 c12382m0) {
        return !m46240e(c12382m0) ? new C12389q(c12382m0) : m46243h(c12382m0);
    }

    /* JADX INFO: renamed from: j */
    public synchronized <SerializationT extends InterfaceC12388p0> void m46245j(AbstractC12381m<SerializationT> abstractC12381m) {
        this.f44220a.set(new C12390q0.b(this.f44220a.get()).m46437f(abstractC12381m).m46436e());
    }

    /* JADX INFO: renamed from: k */
    public synchronized <KeyT extends AbstractC10231l, SerializationT extends InterfaceC12388p0> void m46246k(AbstractC12383n<KeyT, SerializationT> abstractC12383n) {
        this.f44220a.set(new C12390q0.b(this.f44220a.get()).m46438g(abstractC12383n).m46436e());
    }

    /* JADX INFO: renamed from: l */
    public synchronized <SerializationT extends InterfaceC12388p0> void m46247l(AbstractC12368f0<SerializationT> abstractC12368f0) {
        this.f44220a.set(new C12390q0.b(this.f44220a.get()).m46439h(abstractC12368f0).m46436e());
    }

    /* JADX INFO: renamed from: m */
    public synchronized <ParametersT extends AbstractC10243x, SerializationT extends InterfaceC12388p0> void m46248m(AbstractC12370g0<ParametersT, SerializationT> abstractC12370g0) {
        this.f44220a.set(new C12390q0.b(this.f44220a.get()).m46440i(abstractC12370g0).m46436e());
    }

    /* JADX INFO: renamed from: n */
    public <KeyT extends AbstractC10231l, SerializationT extends InterfaceC12388p0> SerializationT m46249n(KeyT keyt, Class<SerializationT> cls, C10218d0 c10218d0) {
        return (SerializationT) this.f44220a.get().m46430i(keyt, cls, c10218d0);
    }

    /* JADX INFO: renamed from: o */
    public <ParametersT extends AbstractC10243x, SerializationT extends InterfaceC12388p0> SerializationT m46250o(ParametersT parameterst, Class<SerializationT> cls) {
        return (SerializationT) this.f44220a.get().m46431j(parameterst, cls);
    }
}

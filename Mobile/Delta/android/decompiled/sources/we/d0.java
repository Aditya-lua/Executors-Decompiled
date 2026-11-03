package we;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {
    public static final d0 b = (d0) r0.a(new r0.a() { // from class: we.b0
        @Override // we.r0.a
        public final Object get() {
            return d0.b();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<q0> f34374a = new AtomicReference<>(new q0.b().e());

    public static d0 b() {
        d0 d0Var = new d0();
        d0Var.k(n.a(new n.b() { // from class: we.c0
            @Override // we.n.b
            public final p0 a(pe.l lVar, pe.d0 d0Var2) {
                return ((p) lVar).b(d0Var2);
            }
        }, p.class, l0.class));
        return d0Var;
    }

    public static d0 c() {
        return b;
    }

    public <SerializationT extends p0> boolean d(SerializationT serializationt) {
        return this.f34374a.get().e(serializationt);
    }

    public <SerializationT extends p0> boolean e(SerializationT serializationt) {
        return this.f34374a.get().f(serializationt);
    }

    public <SerializationT extends p0> pe.l f(SerializationT serializationt, pe.d0 d0Var) {
        return this.f34374a.get().g(serializationt, d0Var);
    }

    public pe.l g(l0 l0Var, pe.d0 d0Var) {
        return !d(l0Var) ? new p(l0Var, d0Var) : f(l0Var, d0Var);
    }

    public <SerializationT extends p0> pe.x h(SerializationT serializationt) {
        return this.f34374a.get().h(serializationt);
    }

    public pe.x i(m0 m0Var) {
        return !e(m0Var) ? new q(m0Var) : h(m0Var);
    }

    public synchronized <SerializationT extends p0> void j(m<SerializationT> mVar) {
        this.f34374a.set(new q0.b(this.f34374a.get()).f(mVar).e());
    }

    public synchronized <KeyT extends pe.l, SerializationT extends p0> void k(n<KeyT, SerializationT> nVar) {
        this.f34374a.set(new q0.b(this.f34374a.get()).g(nVar).e());
    }

    public synchronized <SerializationT extends p0> void l(f0<SerializationT> f0Var) {
        this.f34374a.set(new q0.b(this.f34374a.get()).h(f0Var).e());
    }

    public synchronized <ParametersT extends pe.x, SerializationT extends p0> void m(g0<ParametersT, SerializationT> g0Var) {
        this.f34374a.set(new q0.b(this.f34374a.get()).i(g0Var).e());
    }

    public <KeyT extends pe.l, SerializationT extends p0> SerializationT n(KeyT keyt, Class<SerializationT> cls, pe.d0 d0Var) {
        return (SerializationT) this.f34374a.get().i(keyt, cls, d0Var);
    }

    public <ParametersT extends pe.x, SerializationT extends p0> SerializationT o(ParametersT parameterst, Class<SerializationT> cls) {
        return (SerializationT) this.f34374a.get().j(parameterst, cls);
    }
}

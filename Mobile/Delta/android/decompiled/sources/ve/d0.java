package ve;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {
    public static final d0 b = (d0) r0.a(new r0.a() { // from class: ve.b0
        @Override // ve.r0.a
        public final Object get() {
            return d0.b();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<q0> f32920a = new AtomicReference<>(new q0.b().e());

    public static d0 b() {
        d0 d0Var = new d0();
        d0Var.k(n.a(new n.b() { // from class: ve.c0
            @Override // ve.n.b
            public final p0 a(oe.l lVar, oe.d0 d0Var2) {
                return ((p) lVar).b(d0Var2);
            }
        }, p.class, l0.class));
        return d0Var;
    }

    public static d0 c() {
        return b;
    }

    public <SerializationT extends p0> boolean d(SerializationT serializationt) {
        return this.f32920a.get().e(serializationt);
    }

    public <SerializationT extends p0> boolean e(SerializationT serializationt) {
        return this.f32920a.get().f(serializationt);
    }

    public <SerializationT extends p0> oe.l f(SerializationT serializationt, oe.d0 d0Var) {
        return this.f32920a.get().g(serializationt, d0Var);
    }

    public oe.l g(l0 l0Var, oe.d0 d0Var) {
        return !d(l0Var) ? new p(l0Var, d0Var) : f(l0Var, d0Var);
    }

    public <SerializationT extends p0> oe.x h(SerializationT serializationt) {
        return this.f32920a.get().h(serializationt);
    }

    public oe.x i(m0 m0Var) {
        return !e(m0Var) ? new q(m0Var) : h(m0Var);
    }

    public synchronized <SerializationT extends p0> void j(m<SerializationT> mVar) {
        this.f32920a.set(new q0.b(this.f32920a.get()).f(mVar).e());
    }

    public synchronized <KeyT extends oe.l, SerializationT extends p0> void k(n<KeyT, SerializationT> nVar) {
        this.f32920a.set(new q0.b(this.f32920a.get()).g(nVar).e());
    }

    public synchronized <SerializationT extends p0> void l(f0<SerializationT> f0Var) {
        this.f32920a.set(new q0.b(this.f32920a.get()).h(f0Var).e());
    }

    public synchronized <ParametersT extends oe.x, SerializationT extends p0> void m(g0<ParametersT, SerializationT> g0Var) {
        this.f32920a.set(new q0.b(this.f32920a.get()).i(g0Var).e());
    }

    public <KeyT extends oe.l, SerializationT extends p0> SerializationT n(KeyT keyt, Class<SerializationT> cls, oe.d0 d0Var) {
        return (SerializationT) this.f32920a.get().i(keyt, cls, d0Var);
    }

    public <ParametersT extends oe.x, SerializationT extends p0> SerializationT o(ParametersT parameterst, Class<SerializationT> cls) {
        return (SerializationT) this.f32920a.get().j(parameterst, cls);
    }
}

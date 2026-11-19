package ye;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {
    public static final d0 b = (d0) r0.a(new r0.a() { // from class: ye.b0
        @Override // ye.r0.a
        public final Object get() {
            return d0.b();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<q0> f37731a = new AtomicReference<>(new q0.b().e());

    public static d0 b() {
        d0 d0Var = new d0();
        d0Var.k(n.a(new n.b() { // from class: ye.c0
            @Override // ye.n.b
            public final p0 a(re.l lVar, re.d0 d0Var2) {
                return ((p) lVar).b(d0Var2);
            }
        }, p.class, l0.class));
        return d0Var;
    }

    public static d0 c() {
        return b;
    }

    public <SerializationT extends p0> boolean d(SerializationT serializationt) {
        return this.f37731a.get().e(serializationt);
    }

    public <SerializationT extends p0> boolean e(SerializationT serializationt) {
        return this.f37731a.get().f(serializationt);
    }

    public <SerializationT extends p0> re.l f(SerializationT serializationt, re.d0 d0Var) {
        return this.f37731a.get().g(serializationt, d0Var);
    }

    public re.l g(l0 l0Var, re.d0 d0Var) {
        return !d(l0Var) ? new p(l0Var, d0Var) : f(l0Var, d0Var);
    }

    public <SerializationT extends p0> re.x h(SerializationT serializationt) {
        return this.f37731a.get().h(serializationt);
    }

    public re.x i(m0 m0Var) {
        return !e(m0Var) ? new q(m0Var) : h(m0Var);
    }

    public synchronized <SerializationT extends p0> void j(m<SerializationT> mVar) {
        this.f37731a.set(new q0.b(this.f37731a.get()).f(mVar).e());
    }

    public synchronized <KeyT extends re.l, SerializationT extends p0> void k(n<KeyT, SerializationT> nVar) {
        this.f37731a.set(new q0.b(this.f37731a.get()).g(nVar).e());
    }

    public synchronized <SerializationT extends p0> void l(f0<SerializationT> f0Var) {
        this.f37731a.set(new q0.b(this.f37731a.get()).h(f0Var).e());
    }

    public synchronized <ParametersT extends re.x, SerializationT extends p0> void m(g0<ParametersT, SerializationT> g0Var) {
        this.f37731a.set(new q0.b(this.f37731a.get()).i(g0Var).e());
    }

    public <KeyT extends re.l, SerializationT extends p0> SerializationT n(KeyT keyt, Class<SerializationT> cls, re.d0 d0Var) {
        return (SerializationT) this.f37731a.get().i(keyt, cls, d0Var);
    }

    public <ParametersT extends re.x, SerializationT extends p0> SerializationT o(ParametersT parameterst, Class<SerializationT> cls) {
        return (SerializationT) this.f37731a.get().j(parameterst, cls);
    }
}

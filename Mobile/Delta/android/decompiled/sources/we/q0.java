package we;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<d, n<?, ?>> f34456a;
    public final Map<c, m<?>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<d, g0<?, ?>> f34457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<c, f0<?>> f34458d;

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<? extends p0> f34462a;
        public final ef.a b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f34462a.equals(this.f34462a) && cVar.b.equals(this.b);
        }

        public int hashCode() {
            return Objects.hash(this.f34462a, this.b);
        }

        public String toString() {
            return this.f34462a.getSimpleName() + ", object identifier: " + this.b;
        }

        public c(Class<? extends p0> cls, ef.a aVar) {
            this.f34462a = cls;
            this.b = aVar;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f34463a;
        public final Class<? extends p0> b;

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f34463a.equals(this.f34463a) && dVar.b.equals(this.b);
        }

        public int hashCode() {
            return Objects.hash(this.f34463a, this.b);
        }

        public String toString() {
            return this.f34463a.getSimpleName() + " with serialization type: " + this.b.getSimpleName();
        }

        public d(Class<?> cls, Class<? extends p0> cls2) {
            this.f34463a = cls;
            this.b = cls2;
        }
    }

    public <SerializationT extends p0> boolean e(SerializationT serializationt) {
        return this.b.containsKey(new c(serializationt.getClass(), serializationt.a()));
    }

    public <SerializationT extends p0> boolean f(SerializationT serializationt) {
        return this.f34458d.containsKey(new c(serializationt.getClass(), serializationt.a()));
    }

    public <SerializationT extends p0> pe.l g(SerializationT serializationt, pe.d0 d0Var) throws GeneralSecurityException {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.b.containsKey(cVar)) {
            return this.b.get(cVar).d(serializationt, d0Var);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    public <SerializationT extends p0> pe.x h(SerializationT serializationt) throws GeneralSecurityException {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.f34458d.containsKey(cVar)) {
            return this.f34458d.get(cVar).d(serializationt);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + cVar + " available");
    }

    public <KeyT extends pe.l, SerializationT extends p0> SerializationT i(KeyT keyt, Class<SerializationT> cls, pe.d0 d0Var) throws GeneralSecurityException {
        d dVar = new d(keyt.getClass(), cls);
        if (this.f34456a.containsKey(dVar)) {
            return (SerializationT) this.f34456a.get(dVar).d(keyt, d0Var);
        }
        throw new GeneralSecurityException("No Key serializer for " + dVar + " available");
    }

    public <ParametersT extends pe.x, SerializationT extends p0> SerializationT j(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        d dVar = new d(parameterst.getClass(), cls);
        if (this.f34457c.containsKey(dVar)) {
            return (SerializationT) this.f34457c.get(dVar).d(parameterst);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + dVar + " available");
    }

    public q0(b bVar) {
        this.f34456a = new HashMap(bVar.f34459a);
        this.b = new HashMap(bVar.b);
        this.f34457c = new HashMap(bVar.f34460c);
        this.f34458d = new HashMap(bVar.f34461d);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<d, n<?, ?>> f34459a;
        public final Map<c, m<?>> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<d, g0<?, ?>> f34460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<c, f0<?>> f34461d;

        public b() {
            this.f34459a = new HashMap();
            this.b = new HashMap();
            this.f34460c = new HashMap();
            this.f34461d = new HashMap();
        }

        public q0 e() {
            return new q0(this);
        }

        public <SerializationT extends p0> b f(m<SerializationT> mVar) throws GeneralSecurityException {
            c cVar = new c(mVar.c(), mVar.b());
            if (!this.b.containsKey(cVar)) {
                this.b.put(cVar, mVar);
                return this;
            }
            m<?> mVar2 = this.b.get(cVar);
            if (mVar2.equals(mVar) && mVar.equals(mVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public <KeyT extends pe.l, SerializationT extends p0> b g(n<KeyT, SerializationT> nVar) throws GeneralSecurityException {
            d dVar = new d(nVar.b(), nVar.c());
            if (!this.f34459a.containsKey(dVar)) {
                this.f34459a.put(dVar, nVar);
                return this;
            }
            n<?, ?> nVar2 = this.f34459a.get(dVar);
            if (nVar2.equals(nVar) && nVar.equals(nVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public <SerializationT extends p0> b h(f0<SerializationT> f0Var) throws GeneralSecurityException {
            c cVar = new c(f0Var.c(), f0Var.b());
            if (!this.f34461d.containsKey(cVar)) {
                this.f34461d.put(cVar, f0Var);
                return this;
            }
            f0<?> f0Var2 = this.f34461d.get(cVar);
            if (f0Var2.equals(f0Var) && f0Var.equals(f0Var2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public <ParametersT extends pe.x, SerializationT extends p0> b i(g0<ParametersT, SerializationT> g0Var) throws GeneralSecurityException {
            d dVar = new d(g0Var.b(), g0Var.c());
            if (!this.f34460c.containsKey(dVar)) {
                this.f34460c.put(dVar, g0Var);
                return this;
            }
            g0<?, ?> g0Var2 = this.f34460c.get(dVar);
            if (g0Var2.equals(g0Var) && g0Var.equals(g0Var2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public b(q0 q0Var) {
            this.f34459a = new HashMap(q0Var.f34456a);
            this.b = new HashMap(q0Var.b);
            this.f34460c = new HashMap(q0Var.f34457c);
            this.f34461d = new HashMap(q0Var.f34458d);
        }
    }
}

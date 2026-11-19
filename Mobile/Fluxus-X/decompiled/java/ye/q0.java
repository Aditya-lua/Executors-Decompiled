package ye;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<d, n<?, ?>> f37813a;
    public final Map<c, m<?>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<d, g0<?, ?>> f37814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<c, f0<?>> f37815d;

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<? extends p0> f37819a;
        public final gf.a b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f37819a.equals(this.f37819a) && cVar.b.equals(this.b);
        }

        public int hashCode() {
            return Objects.hash(this.f37819a, this.b);
        }

        public String toString() {
            return this.f37819a.getSimpleName() + ", object identifier: " + this.b;
        }

        public c(Class<? extends p0> cls, gf.a aVar) {
            this.f37819a = cls;
            this.b = aVar;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f37820a;
        public final Class<? extends p0> b;

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f37820a.equals(this.f37820a) && dVar.b.equals(this.b);
        }

        public int hashCode() {
            return Objects.hash(this.f37820a, this.b);
        }

        public String toString() {
            return this.f37820a.getSimpleName() + " with serialization type: " + this.b.getSimpleName();
        }

        public d(Class<?> cls, Class<? extends p0> cls2) {
            this.f37820a = cls;
            this.b = cls2;
        }
    }

    public <SerializationT extends p0> boolean e(SerializationT serializationt) {
        return this.b.containsKey(new c(serializationt.getClass(), serializationt.a()));
    }

    public <SerializationT extends p0> boolean f(SerializationT serializationt) {
        return this.f37815d.containsKey(new c(serializationt.getClass(), serializationt.a()));
    }

    public <SerializationT extends p0> re.l g(SerializationT serializationt, re.d0 d0Var) throws GeneralSecurityException {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.b.containsKey(cVar)) {
            return this.b.get(cVar).d(serializationt, d0Var);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    public <SerializationT extends p0> re.x h(SerializationT serializationt) throws GeneralSecurityException {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.f37815d.containsKey(cVar)) {
            return this.f37815d.get(cVar).d(serializationt);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + cVar + " available");
    }

    public <KeyT extends re.l, SerializationT extends p0> SerializationT i(KeyT keyt, Class<SerializationT> cls, re.d0 d0Var) throws GeneralSecurityException {
        d dVar = new d(keyt.getClass(), cls);
        if (this.f37813a.containsKey(dVar)) {
            return (SerializationT) this.f37813a.get(dVar).d(keyt, d0Var);
        }
        throw new GeneralSecurityException("No Key serializer for " + dVar + " available");
    }

    public <ParametersT extends re.x, SerializationT extends p0> SerializationT j(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        d dVar = new d(parameterst.getClass(), cls);
        if (this.f37814c.containsKey(dVar)) {
            return (SerializationT) this.f37814c.get(dVar).d(parameterst);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + dVar + " available");
    }

    public q0(b bVar) {
        this.f37813a = new HashMap(bVar.f37816a);
        this.b = new HashMap(bVar.b);
        this.f37814c = new HashMap(bVar.f37817c);
        this.f37815d = new HashMap(bVar.f37818d);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<d, n<?, ?>> f37816a;
        public final Map<c, m<?>> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<d, g0<?, ?>> f37817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<c, f0<?>> f37818d;

        public b() {
            this.f37816a = new HashMap();
            this.b = new HashMap();
            this.f37817c = new HashMap();
            this.f37818d = new HashMap();
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

        public <KeyT extends re.l, SerializationT extends p0> b g(n<KeyT, SerializationT> nVar) throws GeneralSecurityException {
            d dVar = new d(nVar.b(), nVar.c());
            if (!this.f37816a.containsKey(dVar)) {
                this.f37816a.put(dVar, nVar);
                return this;
            }
            n<?, ?> nVar2 = this.f37816a.get(dVar);
            if (nVar2.equals(nVar) && nVar.equals(nVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public <SerializationT extends p0> b h(f0<SerializationT> f0Var) throws GeneralSecurityException {
            c cVar = new c(f0Var.c(), f0Var.b());
            if (!this.f37818d.containsKey(cVar)) {
                this.f37818d.put(cVar, f0Var);
                return this;
            }
            f0<?> f0Var2 = this.f37818d.get(cVar);
            if (f0Var2.equals(f0Var) && f0Var.equals(f0Var2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public <ParametersT extends re.x, SerializationT extends p0> b i(g0<ParametersT, SerializationT> g0Var) throws GeneralSecurityException {
            d dVar = new d(g0Var.b(), g0Var.c());
            if (!this.f37817c.containsKey(dVar)) {
                this.f37817c.put(dVar, g0Var);
                return this;
            }
            g0<?, ?> g0Var2 = this.f37817c.get(dVar);
            if (g0Var2.equals(g0Var) && g0Var.equals(g0Var2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public b(q0 q0Var) {
            this.f37816a = new HashMap(q0Var.f37813a);
            this.b = new HashMap(q0Var.b);
            this.f37817c = new HashMap(q0Var.f37814c);
            this.f37818d = new HashMap(q0Var.f37815d);
        }
    }
}

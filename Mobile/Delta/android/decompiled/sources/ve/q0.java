package ve;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<d, n<?, ?>> f33002a;
    public final Map<c, m<?>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<d, g0<?, ?>> f33003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<c, f0<?>> f33004d;

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<? extends p0> f33008a;
        public final df.a b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f33008a.equals(this.f33008a) && cVar.b.equals(this.b);
        }

        public int hashCode() {
            return Objects.hash(this.f33008a, this.b);
        }

        public String toString() {
            return this.f33008a.getSimpleName() + ", object identifier: " + this.b;
        }

        public c(Class<? extends p0> cls, df.a aVar) {
            this.f33008a = cls;
            this.b = aVar;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f33009a;
        public final Class<? extends p0> b;

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f33009a.equals(this.f33009a) && dVar.b.equals(this.b);
        }

        public int hashCode() {
            return Objects.hash(this.f33009a, this.b);
        }

        public String toString() {
            return this.f33009a.getSimpleName() + " with serialization type: " + this.b.getSimpleName();
        }

        public d(Class<?> cls, Class<? extends p0> cls2) {
            this.f33009a = cls;
            this.b = cls2;
        }
    }

    public <SerializationT extends p0> boolean e(SerializationT serializationt) {
        return this.b.containsKey(new c(serializationt.getClass(), serializationt.a()));
    }

    public <SerializationT extends p0> boolean f(SerializationT serializationt) {
        return this.f33004d.containsKey(new c(serializationt.getClass(), serializationt.a()));
    }

    public <SerializationT extends p0> oe.l g(SerializationT serializationt, oe.d0 d0Var) throws GeneralSecurityException {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.b.containsKey(cVar)) {
            return this.b.get(cVar).d(serializationt, d0Var);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    public <SerializationT extends p0> oe.x h(SerializationT serializationt) throws GeneralSecurityException {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.f33004d.containsKey(cVar)) {
            return this.f33004d.get(cVar).d(serializationt);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + cVar + " available");
    }

    public <KeyT extends oe.l, SerializationT extends p0> SerializationT i(KeyT keyt, Class<SerializationT> cls, oe.d0 d0Var) throws GeneralSecurityException {
        d dVar = new d(keyt.getClass(), cls);
        if (this.f33002a.containsKey(dVar)) {
            return (SerializationT) this.f33002a.get(dVar).d(keyt, d0Var);
        }
        throw new GeneralSecurityException("No Key serializer for " + dVar + " available");
    }

    public <ParametersT extends oe.x, SerializationT extends p0> SerializationT j(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        d dVar = new d(parameterst.getClass(), cls);
        if (this.f33003c.containsKey(dVar)) {
            return (SerializationT) this.f33003c.get(dVar).d(parameterst);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + dVar + " available");
    }

    public q0(b bVar) {
        this.f33002a = new HashMap(bVar.f33005a);
        this.b = new HashMap(bVar.b);
        this.f33003c = new HashMap(bVar.f33006c);
        this.f33004d = new HashMap(bVar.f33007d);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<d, n<?, ?>> f33005a;
        public final Map<c, m<?>> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<d, g0<?, ?>> f33006c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<c, f0<?>> f33007d;

        public b() {
            this.f33005a = new HashMap();
            this.b = new HashMap();
            this.f33006c = new HashMap();
            this.f33007d = new HashMap();
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

        public <KeyT extends oe.l, SerializationT extends p0> b g(n<KeyT, SerializationT> nVar) throws GeneralSecurityException {
            d dVar = new d(nVar.b(), nVar.c());
            if (!this.f33005a.containsKey(dVar)) {
                this.f33005a.put(dVar, nVar);
                return this;
            }
            n<?, ?> nVar2 = this.f33005a.get(dVar);
            if (nVar2.equals(nVar) && nVar.equals(nVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public <SerializationT extends p0> b h(f0<SerializationT> f0Var) throws GeneralSecurityException {
            c cVar = new c(f0Var.c(), f0Var.b());
            if (!this.f33007d.containsKey(cVar)) {
                this.f33007d.put(cVar, f0Var);
                return this;
            }
            f0<?> f0Var2 = this.f33007d.get(cVar);
            if (f0Var2.equals(f0Var) && f0Var.equals(f0Var2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public <ParametersT extends oe.x, SerializationT extends p0> b i(g0<ParametersT, SerializationT> g0Var) throws GeneralSecurityException {
            d dVar = new d(g0Var.b(), g0Var.c());
            if (!this.f33006c.containsKey(dVar)) {
                this.f33006c.put(dVar, g0Var);
                return this;
            }
            g0<?, ?> g0Var2 = this.f33006c.get(dVar);
            if (g0Var2.equals(g0Var) && g0Var.equals(g0Var2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public b(q0 q0Var) {
            this.f33005a = new HashMap(q0Var.f33002a);
            this.b = new HashMap(q0Var.b);
            this.f33006c = new HashMap(q0Var.f33003c);
            this.f33007d = new HashMap(q0Var.f33004d);
        }
    }
}

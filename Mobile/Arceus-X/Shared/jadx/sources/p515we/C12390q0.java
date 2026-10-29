package p515we;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p102ef.C5109a;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.C10218d0;

/* JADX INFO: renamed from: we.q0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C12390q0 {

    /* JADX INFO: renamed from: a */
    public final Map<d, AbstractC12383n<?, ?>> f44330a;

    /* JADX INFO: renamed from: b */
    public final Map<c, AbstractC12381m<?>> f44331b;

    /* JADX INFO: renamed from: c */
    public final Map<d, AbstractC12370g0<?, ?>> f44332c;

    /* JADX INFO: renamed from: d */
    public final Map<c, AbstractC12368f0<?>> f44333d;

    /* JADX INFO: renamed from: we.q0$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final Class<? extends InterfaceC12388p0> f44338a;

        /* JADX INFO: renamed from: b */
        public final C5109a f44339b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f44338a.equals(this.f44338a) && cVar.f44339b.equals(this.f44339b);
        }

        public int hashCode() {
            return Objects.hash(this.f44338a, this.f44339b);
        }

        public String toString() {
            return this.f44338a.getSimpleName() + ", object identifier: " + this.f44339b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(Class<? extends InterfaceC12388p0> cls, C5109a c5109a) {
            this.f44338a = cls;
            this.f44339b = c5109a;
        }
    }

    /* JADX INFO: renamed from: we.q0$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final Class<?> f44340a;

        /* JADX INFO: renamed from: b */
        public final Class<? extends InterfaceC12388p0> f44341b;

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f44340a.equals(this.f44340a) && dVar.f44341b.equals(this.f44341b);
        }

        public int hashCode() {
            return Objects.hash(this.f44340a, this.f44341b);
        }

        public String toString() {
            return this.f44340a.getSimpleName() + " with serialization type: " + this.f44341b.getSimpleName();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public d(Class<?> cls, Class<? extends InterfaceC12388p0> cls2) {
            this.f44340a = cls;
            this.f44341b = cls2;
        }
    }

    /* JADX INFO: renamed from: e */
    public <SerializationT extends InterfaceC12388p0> boolean m46426e(SerializationT serializationt) {
        return this.f44331b.containsKey(new c(serializationt.getClass(), serializationt.mo46392a()));
    }

    /* JADX INFO: renamed from: f */
    public <SerializationT extends InterfaceC12388p0> boolean m46427f(SerializationT serializationt) {
        return this.f44333d.containsKey(new c(serializationt.getClass(), serializationt.mo46392a()));
    }

    /* JADX INFO: renamed from: g */
    public <SerializationT extends InterfaceC12388p0> AbstractC10231l m46428g(SerializationT serializationt, C10218d0 c10218d0) throws GeneralSecurityException {
        c cVar = new c(serializationt.getClass(), serializationt.mo46392a());
        if (this.f44331b.containsKey(cVar)) {
            return this.f44331b.get(cVar).mo46401d(serializationt, c10218d0);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    /* JADX INFO: renamed from: h */
    public <SerializationT extends InterfaceC12388p0> AbstractC10243x m46429h(SerializationT serializationt) throws GeneralSecurityException {
        c cVar = new c(serializationt.getClass(), serializationt.mo46392a());
        if (this.f44333d.containsKey(cVar)) {
            return this.f44333d.get(cVar).mo46300d(serializationt);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + cVar + " available");
    }

    /* JADX INFO: renamed from: i */
    public <KeyT extends AbstractC10231l, SerializationT extends InterfaceC12388p0> SerializationT m46430i(KeyT keyt, Class<SerializationT> cls, C10218d0 c10218d0) throws GeneralSecurityException {
        d dVar = new d(keyt.getClass(), cls);
        if (this.f44330a.containsKey(dVar)) {
            return (SerializationT) this.f44330a.get(dVar).mo46408d(keyt, c10218d0);
        }
        throw new GeneralSecurityException("No Key serializer for " + dVar + " available");
    }

    /* JADX INFO: renamed from: j */
    public <ParametersT extends AbstractC10243x, SerializationT extends InterfaceC12388p0> SerializationT m46431j(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        d dVar = new d(parameterst.getClass(), cls);
        if (this.f44332c.containsKey(dVar)) {
            return (SerializationT) this.f44332c.get(dVar).mo46318d(parameterst);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + dVar + " available");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12390q0(b bVar) {
        this.f44330a = new HashMap(bVar.f44334a);
        this.f44331b = new HashMap(bVar.f44335b);
        this.f44332c = new HashMap(bVar.f44336c);
        this.f44333d = new HashMap(bVar.f44337d);
    }

    /* JADX INFO: renamed from: we.q0$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Map<d, AbstractC12383n<?, ?>> f44334a;

        /* JADX INFO: renamed from: b */
        public final Map<c, AbstractC12381m<?>> f44335b;

        /* JADX INFO: renamed from: c */
        public final Map<d, AbstractC12370g0<?, ?>> f44336c;

        /* JADX INFO: renamed from: d */
        public final Map<c, AbstractC12368f0<?>> f44337d;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
            this.f44334a = new HashMap();
            this.f44335b = new HashMap();
            this.f44336c = new HashMap();
            this.f44337d = new HashMap();
        }

        /* JADX INFO: renamed from: e */
        public C12390q0 m46436e() {
            return new C12390q0(this);
        }

        /* JADX INFO: renamed from: f */
        public <SerializationT extends InterfaceC12388p0> b m46437f(AbstractC12381m<SerializationT> abstractC12381m) throws GeneralSecurityException {
            c cVar = new c(abstractC12381m.m46400c(), abstractC12381m.m46399b());
            if (!this.f44335b.containsKey(cVar)) {
                this.f44335b.put(cVar, abstractC12381m);
                return this;
            }
            AbstractC12381m<?> abstractC12381m2 = this.f44335b.get(cVar);
            if (abstractC12381m2.equals(abstractC12381m) && abstractC12381m.equals(abstractC12381m2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        /* JADX INFO: renamed from: g */
        public <KeyT extends AbstractC10231l, SerializationT extends InterfaceC12388p0> b m46438g(AbstractC12383n<KeyT, SerializationT> abstractC12383n) throws GeneralSecurityException {
            d dVar = new d(abstractC12383n.m46406b(), abstractC12383n.m46407c());
            if (!this.f44334a.containsKey(dVar)) {
                this.f44334a.put(dVar, abstractC12383n);
                return this;
            }
            AbstractC12383n<?, ?> abstractC12383n2 = this.f44334a.get(dVar);
            if (abstractC12383n2.equals(abstractC12383n) && abstractC12383n.equals(abstractC12383n2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        /* JADX INFO: renamed from: h */
        public <SerializationT extends InterfaceC12388p0> b m46439h(AbstractC12368f0<SerializationT> abstractC12368f0) throws GeneralSecurityException {
            c cVar = new c(abstractC12368f0.m46299c(), abstractC12368f0.m46298b());
            if (!this.f44337d.containsKey(cVar)) {
                this.f44337d.put(cVar, abstractC12368f0);
                return this;
            }
            AbstractC12368f0<?> abstractC12368f1 = this.f44337d.get(cVar);
            if (abstractC12368f1.equals(abstractC12368f0) && abstractC12368f0.equals(abstractC12368f1)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        /* JADX INFO: renamed from: i */
        public <ParametersT extends AbstractC10243x, SerializationT extends InterfaceC12388p0> b m46440i(AbstractC12370g0<ParametersT, SerializationT> abstractC12370g0) throws GeneralSecurityException {
            d dVar = new d(abstractC12370g0.m46316b(), abstractC12370g0.m46317c());
            if (!this.f44336c.containsKey(dVar)) {
                this.f44336c.put(dVar, abstractC12370g0);
                return this;
            }
            AbstractC12370g0<?, ?> abstractC12370g1 = this.f44336c.get(dVar);
            if (abstractC12370g1.equals(abstractC12370g0) && abstractC12370g0.equals(abstractC12370g1)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public b(C12390q0 c12390q0) {
            this.f44334a = new HashMap(c12390q0.f44330a);
            this.f44335b = new HashMap(c12390q0.f44331b);
            this.f44336c = new HashMap(c12390q0.f44332c);
            this.f44337d = new HashMap(c12390q0.f44333d);
        }
    }
}

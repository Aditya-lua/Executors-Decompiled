package we;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<c, h0<?, ?>> f34414a;
    public final Map<Class<?>, k0<?, ?>> b;

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f34416a;
        public final Class<?> b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f34416a.equals(this.f34416a) && cVar.b.equals(this.b);
        }

        public int hashCode() {
            return Objects.hash(this.f34416a, this.b);
        }

        public String toString() {
            return this.f34416a.getSimpleName() + " with primitive type: " + this.b.getSimpleName();
        }

        public c(Class<?> cls, Class<?> cls2) {
            this.f34416a = cls;
            this.b = cls2;
        }
    }

    public static b c() {
        return new b();
    }

    public static b d(i0 i0Var) {
        return new b();
    }

    public Class<?> e(Class<?> cls) throws GeneralSecurityException {
        if (this.b.containsKey(cls)) {
            return this.b.get(cls).c();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public <KeyT extends pe.l, PrimitiveT> PrimitiveT f(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        c cVar = new c(keyt.getClass(), cls);
        if (this.f34414a.containsKey(cVar)) {
            return (PrimitiveT) this.f34414a.get(cVar).a(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available");
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT g(j0<InputPrimitiveT> j0Var, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        if (!this.b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        k0<?, ?> k0Var = this.b.get(cls);
        if (j0Var.f().equals(k0Var.c()) && k0Var.c().equals(j0Var.f())) {
            return (WrapperPrimitiveT) k0Var.b(j0Var);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<c, h0<?, ?>> f34415a;
        public final Map<Class<?>, k0<?, ?>> b;

        public i0 c() {
            return new i0(this);
        }

        public <KeyT extends pe.l, PrimitiveT> b d(h0<KeyT, PrimitiveT> h0Var) throws GeneralSecurityException {
            if (h0Var == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c cVar = new c(h0Var.c(), h0Var.d());
            if (!this.f34415a.containsKey(cVar)) {
                this.f34415a.put(cVar, h0Var);
                return this;
            }
            h0<?, ?> h0Var2 = this.f34415a.get(cVar);
            if (h0Var2.equals(h0Var) && h0Var.equals(h0Var2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + cVar);
        }

        public <InputPrimitiveT, WrapperPrimitiveT> b e(k0<InputPrimitiveT, WrapperPrimitiveT> k0Var) throws GeneralSecurityException {
            if (k0Var == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class<WrapperPrimitiveT> clsA = k0Var.a();
            if (!this.b.containsKey(clsA)) {
                this.b.put(clsA, k0Var);
                return this;
            }
            k0<?, ?> k0Var2 = this.b.get(clsA);
            if (k0Var2.equals(k0Var) && k0Var.equals(k0Var2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsA);
        }

        public b() {
            this.f34415a = new HashMap();
            this.b = new HashMap();
        }

        public b(i0 i0Var) {
            this.f34415a = new HashMap(i0Var.f34414a);
            this.b = new HashMap(i0Var.b);
        }
    }

    public i0(b bVar) {
        this.f34414a = new HashMap(bVar.f34415a);
        this.b = new HashMap(bVar.b);
    }
}

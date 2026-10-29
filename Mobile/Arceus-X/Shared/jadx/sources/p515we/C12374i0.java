package p515we;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import pe.AbstractC10231l;

/* JADX INFO: renamed from: we.i0 */
/* JADX INFO: loaded from: classes2.dex */
public class C12374i0 {

    /* JADX INFO: renamed from: a */
    public final Map<c, AbstractC12372h0<?, ?>> f44275a;

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, InterfaceC12378k0<?, ?>> f44276b;

    /* JADX INFO: renamed from: we.i0$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final Class<?> f44279a;

        /* JADX INFO: renamed from: b */
        public final Class<?> f44280b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f44279a.equals(this.f44279a) && cVar.f44280b.equals(this.f44280b);
        }

        public int hashCode() {
            return Objects.hash(this.f44279a, this.f44280b);
        }

        public String toString() {
            return this.f44279a.getSimpleName() + " with primitive type: " + this.f44280b.getSimpleName();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(Class<?> cls, Class<?> cls2) {
            this.f44279a = cls;
            this.f44280b = cls2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static b m46345c() {
        return new b();
    }

    /* JADX INFO: renamed from: d */
    public static b m46346d(C12374i0 c12374i0) {
        return new b();
    }

    /* JADX INFO: renamed from: e */
    public Class<?> m46347e(Class<?> cls) throws GeneralSecurityException {
        if (this.f44276b.containsKey(cls)) {
            return this.f44276b.get(cls).mo7285c();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    /* JADX INFO: renamed from: f */
    public <KeyT extends AbstractC10231l, PrimitiveT> PrimitiveT m46348f(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        c cVar = new c(keyt.getClass(), cls);
        if (this.f44275a.containsKey(cVar)) {
            return (PrimitiveT) this.f44275a.get(cVar).mo46325a(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available");
    }

    /* JADX INFO: renamed from: g */
    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT m46349g(C12376j0<InputPrimitiveT> c12376j0, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        if (!this.f44276b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        InterfaceC12378k0<?, ?> interfaceC12378k0 = this.f44276b.get(cls);
        if (c12376j0.m46365f().equals(interfaceC12378k0.mo7285c()) && interfaceC12378k0.mo7285c().equals(c12376j0.m46365f())) {
            return (WrapperPrimitiveT) interfaceC12378k0.mo7284b(c12376j0);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }

    /* JADX INFO: renamed from: we.i0$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Map<c, AbstractC12372h0<?, ?>> f44277a;

        /* JADX INFO: renamed from: b */
        public final Map<Class<?>, InterfaceC12378k0<?, ?>> f44278b;

        /* JADX INFO: renamed from: c */
        public C12374i0 m46352c() {
            return new C12374i0(this);
        }

        /* JADX INFO: renamed from: d */
        public <KeyT extends AbstractC10231l, PrimitiveT> b m46353d(AbstractC12372h0<KeyT, PrimitiveT> abstractC12372h0) throws GeneralSecurityException {
            if (abstractC12372h0 == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c cVar = new c(abstractC12372h0.m46326c(), abstractC12372h0.m46327d());
            if (!this.f44277a.containsKey(cVar)) {
                this.f44277a.put(cVar, abstractC12372h0);
                return this;
            }
            AbstractC12372h0<?, ?> abstractC12372h1 = this.f44277a.get(cVar);
            if (abstractC12372h1.equals(abstractC12372h0) && abstractC12372h0.equals(abstractC12372h1)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + cVar);
        }

        /* JADX INFO: renamed from: e */
        public <InputPrimitiveT, WrapperPrimitiveT> b m46354e(InterfaceC12378k0<InputPrimitiveT, WrapperPrimitiveT> interfaceC12378k0) throws GeneralSecurityException {
            if (interfaceC12378k0 == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class<WrapperPrimitiveT> clsMo7283a = interfaceC12378k0.mo7283a();
            if (!this.f44278b.containsKey(clsMo7283a)) {
                this.f44278b.put(clsMo7283a, interfaceC12378k0);
                return this;
            }
            InterfaceC12378k0<?, ?> interfaceC12378k1 = this.f44278b.get(clsMo7283a);
            if (interfaceC12378k1.equals(interfaceC12378k0) && interfaceC12378k0.equals(interfaceC12378k1)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsMo7283a);
        }

        public b() {
            this.f44277a = new HashMap();
            this.f44278b = new HashMap();
        }

        public b(C12374i0 c12374i0) {
            this.f44277a = new HashMap(c12374i0.f44275a);
            this.f44278b = new HashMap(c12374i0.f44276b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12374i0(b bVar) {
        this.f44275a = new HashMap(bVar.f44277a);
        this.f44276b = new HashMap(bVar.f44278b);
    }
}

package p296n0;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p002a1.C0054c;
import p347p0.C10107w;

/* JADX INFO: renamed from: n0.n1 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8795n1 {

    /* JADX INFO: renamed from: n0.n1$a */
    public static abstract class a<T> {
        /* JADX INFO: renamed from: a */
        public static <T> a<T> m35291a(String str, Class<?> cls) {
            return m35292b(str, cls, null);
        }

        /* JADX INFO: renamed from: b */
        public static <T> a<T> m35292b(String str, Class<?> cls, Object obj) {
            return new C8772j(str, cls, obj);
        }

        /* JADX INFO: renamed from: c */
        public abstract String mo35216c();

        /* JADX INFO: renamed from: d */
        public abstract Object mo35217d();

        /* JADX INFO: renamed from: e */
        public abstract Class<T> mo35218e();
    }

    /* JADX INFO: renamed from: n0.n1$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo24213a(a<?> aVar);
    }

    /* JADX INFO: renamed from: n0.n1$c */
    public enum c {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    /* JADX INFO: renamed from: L */
    static InterfaceC8795n1 m35288L(InterfaceC8795n1 interfaceC8795n1, InterfaceC8795n1 interfaceC8795n2) {
        if (interfaceC8795n1 == null && interfaceC8795n2 == null) {
            return C8734c3.m35021i0();
        }
        C8846x2 c8846x2M35506l0 = interfaceC8795n2 != null ? C8846x2.m35506l0(interfaceC8795n2) : C8846x2.m35505k0();
        if (interfaceC8795n1 != null) {
            Iterator<a<?>> it = interfaceC8795n1.mo35024b().iterator();
            while (it.hasNext()) {
                m35289P(c8846x2M35506l0, interfaceC8795n2, interfaceC8795n1, it.next());
            }
        }
        return C8734c3.m35022j0(c8846x2M35506l0);
    }

    /* JADX INFO: renamed from: P */
    static void m35289P(C8846x2 c8846x2, InterfaceC8795n1 interfaceC8795n1, InterfaceC8795n1 interfaceC8795n2, a<?> aVar) {
        if (!Objects.equals(aVar, InterfaceC8769i2.f31890u)) {
            c8846x2.mo35472D(aVar, interfaceC8795n2.mo35029g(aVar), interfaceC8795n2.mo35027e(aVar));
            return;
        }
        C0054c c0054c = (C0054c) interfaceC8795n2.mo35030h(aVar, null);
        c8846x2.mo35472D(aVar, interfaceC8795n2.mo35029g(aVar), C10107w.m39004a((C0054c) interfaceC8795n1.mo35030h(aVar, null), c0054c));
    }

    /* JADX INFO: renamed from: y */
    static boolean m35290y(c cVar, c cVar2) {
        c cVar3 = c.REQUIRED;
        return cVar == cVar3 && cVar2 == cVar3;
    }

    /* JADX INFO: renamed from: a */
    boolean mo35023a(a<?> aVar);

    /* JADX INFO: renamed from: b */
    Set<a<?>> mo35024b();

    /* JADX INFO: renamed from: c */
    <ValueT> ValueT mo35025c(a<ValueT> aVar, c cVar);

    /* JADX INFO: renamed from: d */
    void mo35026d(String str, b bVar);

    /* JADX INFO: renamed from: e */
    <ValueT> ValueT mo35027e(a<ValueT> aVar);

    /* JADX INFO: renamed from: f */
    Set<c> mo35028f(a<?> aVar);

    /* JADX INFO: renamed from: g */
    c mo35029g(a<?> aVar);

    /* JADX INFO: renamed from: h */
    <ValueT> ValueT mo35030h(a<ValueT> aVar, ValueT valuet);
}

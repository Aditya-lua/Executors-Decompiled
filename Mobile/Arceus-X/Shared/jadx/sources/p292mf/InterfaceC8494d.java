package p292mf;

import java.util.Set;
import p575yf.InterfaceC13188b;

/* JADX INFO: renamed from: mf.d */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC8494d {
    /* JADX INFO: renamed from: a */
    default <T> T mo34304a(Class<T> cls) {
        return (T) mo34309f(C8497e0.m34316b(cls));
    }

    /* JADX INFO: renamed from: b */
    default <T> Set<T> mo34305b(C8497e0<T> c8497e0) {
        return mo34308e(c8497e0).get();
    }

    /* JADX INFO: renamed from: c */
    <T> InterfaceC13188b<T> mo34306c(C8497e0<T> c8497e0);

    /* JADX INFO: renamed from: d */
    default <T> Set<T> m34307d(Class<T> cls) {
        return mo34305b(C8497e0.m34316b(cls));
    }

    /* JADX INFO: renamed from: e */
    <T> InterfaceC13188b<Set<T>> mo34308e(C8497e0<T> c8497e0);

    /* JADX INFO: renamed from: f */
    default <T> T mo34309f(C8497e0<T> c8497e0) {
        InterfaceC13188b<T> interfaceC13188bMo34306c = mo34306c(c8497e0);
        if (interfaceC13188bMo34306c == null) {
            return null;
        }
        return interfaceC13188bMo34306c.get();
    }

    /* JADX INFO: renamed from: g */
    default <T> InterfaceC13188b<T> mo34310g(Class<T> cls) {
        return mo34306c(C8497e0.m34316b(cls));
    }
}

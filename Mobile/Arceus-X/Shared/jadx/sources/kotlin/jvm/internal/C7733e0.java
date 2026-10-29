package kotlin.jvm.internal;

import hu.InterfaceC6567c;
import hu.InterfaceC6569e;
import hu.InterfaceC6570f;
import hu.InterfaceC6571g;
import hu.InterfaceC6572h;
import hu.InterfaceC6573i;
import hu.InterfaceC6574j;
import hu.InterfaceC6575k;
import hu.InterfaceC6577m;
import java.util.List;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: kotlin.jvm.internal.e0 */
/* JADX INFO: loaded from: classes2.dex */
public class C7733e0 {
    /* JADX INFO: renamed from: a */
    public InterfaceC6571g m32014a(C7742j c7742j) {
        return c7742j;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC6567c m32015b(Class cls) {
        return new C7734f(cls);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC6570f m32016c(Class cls, String str) {
        return new C7750q(cls, str);
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC6572h m32017d(AbstractC7747n abstractC7747n) {
        return abstractC7747n;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC6573i m32018e(AbstractC7751r abstractC7751r) {
        return abstractC7751r;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC6574j m32019f(AbstractC7753t abstractC7753t) {
        return abstractC7753t;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC6575k m32020g(AbstractC7755v abstractC7755v) {
        return abstractC7755v;
    }

    /* JADX INFO: renamed from: h */
    public String m32021h(InterfaceC7740i interfaceC7740i) {
        String string = interfaceC7740i.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: i */
    public String m32022i(AbstractC7746m abstractC7746m) {
        return m32021h(abstractC7746m);
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC6577m m32023j(InterfaceC6569e interfaceC6569e, List<KTypeProjection> list, boolean z10) {
        return new C7743j0(interfaceC6569e, list, z10);
    }
}

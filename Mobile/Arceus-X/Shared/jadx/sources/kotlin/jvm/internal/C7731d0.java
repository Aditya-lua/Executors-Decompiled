package kotlin.jvm.internal;

import hu.InterfaceC6567c;
import hu.InterfaceC6570f;
import hu.InterfaceC6571g;
import hu.InterfaceC6572h;
import hu.InterfaceC6573i;
import hu.InterfaceC6574j;
import hu.InterfaceC6575k;
import hu.InterfaceC6577m;
import java.util.Collections;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: kotlin.jvm.internal.d0 */
/* JADX INFO: loaded from: classes2.dex */
public class C7731d0 {

    /* JADX INFO: renamed from: a */
    public static final C7733e0 f29427a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC6567c[] f29428b;

    static {
        C7733e0 c7733e0 = null;
        try {
            c7733e0 = (C7733e0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c7733e0 == null) {
            c7733e0 = new C7733e0();
        }
        f29427a = c7733e0;
        f29428b = new InterfaceC6567c[0];
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC6571g m32001a(C7742j c7742j) {
        return f29427a.m32014a(c7742j);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC6567c m32002b(Class cls) {
        return f29427a.m32015b(cls);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC6570f m32003c(Class cls) {
        return f29427a.m32016c(cls, "");
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC6572h m32004d(AbstractC7747n abstractC7747n) {
        return f29427a.m32017d(abstractC7747n);
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC6577m m32005e(Class cls) {
        return f29427a.m32023j(m32002b(cls), Collections.EMPTY_LIST, true);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC6573i m32006f(AbstractC7751r abstractC7751r) {
        return f29427a.m32018e(abstractC7751r);
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC6574j m32007g(AbstractC7753t abstractC7753t) {
        return f29427a.m32019f(abstractC7753t);
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC6575k m32008h(AbstractC7755v abstractC7755v) {
        return f29427a.m32020g(abstractC7755v);
    }

    /* JADX INFO: renamed from: i */
    public static String m32009i(InterfaceC7740i interfaceC7740i) {
        return f29427a.m32021h(interfaceC7740i);
    }

    /* JADX INFO: renamed from: j */
    public static String m32010j(AbstractC7746m abstractC7746m) {
        return f29427a.m32022i(abstractC7746m);
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC6577m m32011k(Class cls) {
        return f29427a.m32023j(m32002b(cls), Collections.EMPTY_LIST, false);
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC6577m m32012l(Class cls, KTypeProjection kTypeProjection) {
        return f29427a.m32023j(m32002b(cls), Collections.singletonList(kTypeProjection), false);
    }
}

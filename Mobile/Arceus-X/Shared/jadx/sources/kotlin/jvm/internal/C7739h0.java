package kotlin.jvm.internal;

import au.InterfaceC1170a;
import au.InterfaceC1171b;
import au.InterfaceC1172c;
import au.InterfaceC1173d;
import au.InterfaceC1174e;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p229jt.InterfaceC7330b;
import p615zt.InterfaceC14044a;
import p615zt.InterfaceC14045b;
import p615zt.InterfaceC14046c;
import p615zt.InterfaceC14047d;
import p615zt.InterfaceC14048e;
import p615zt.InterfaceC14049f;
import p615zt.InterfaceC14050g;
import p615zt.InterfaceC14051h;
import p615zt.InterfaceC14052i;
import p615zt.InterfaceC14053j;
import p615zt.InterfaceC14054k;
import p615zt.InterfaceC14055l;
import p615zt.InterfaceC14056m;
import p615zt.InterfaceC14057n;
import p615zt.InterfaceC14058o;
import p615zt.InterfaceC14059p;
import p615zt.InterfaceC14060q;
import p615zt.InterfaceC14061r;
import p615zt.InterfaceC14062s;
import p615zt.InterfaceC14063t;

/* JADX INFO: renamed from: kotlin.jvm.internal.h0 */
/* JADX INFO: loaded from: classes2.dex */
public class C7739h0 {
    /* JADX INFO: renamed from: a */
    public static Collection m32036a(Object obj) {
        if ((obj instanceof InterfaceC1170a) && !(obj instanceof InterfaceC1171b)) {
            m32050o(obj, "kotlin.collections.MutableCollection");
        }
        return m32041f(obj);
    }

    /* JADX INFO: renamed from: b */
    public static Iterable m32037b(Object obj) {
        if ((obj instanceof InterfaceC1170a) && !(obj instanceof InterfaceC1172c)) {
            m32050o(obj, "kotlin.collections.MutableIterable");
        }
        return m32042g(obj);
    }

    /* JADX INFO: renamed from: c */
    public static List m32038c(Object obj) {
        if ((obj instanceof InterfaceC1170a) && !(obj instanceof InterfaceC1173d)) {
            m32050o(obj, "kotlin.collections.MutableList");
        }
        return m32043h(obj);
    }

    /* JADX INFO: renamed from: d */
    public static Map m32039d(Object obj) {
        if ((obj instanceof InterfaceC1170a) && !(obj instanceof InterfaceC1174e)) {
            m32050o(obj, "kotlin.collections.MutableMap");
        }
        return m32044i(obj);
    }

    /* JADX INFO: renamed from: e */
    public static Object m32040e(Object obj, int i10) {
        if (obj != null && !m32046k(obj, i10)) {
            m32050o(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    /* JADX INFO: renamed from: f */
    public static Collection m32041f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw m32049n(e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Iterable m32042g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw m32049n(e10);
        }
    }

    /* JADX INFO: renamed from: h */
    public static List m32043h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw m32049n(e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public static Map m32044i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw m32049n(e10);
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m32045j(Object obj) {
        if (obj instanceof InterfaceC7740i) {
            return ((InterfaceC7740i) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof InterfaceC14057n) {
            return 3;
        }
        if (obj instanceof InterfaceC14058o) {
            return 4;
        }
        if (obj instanceof InterfaceC14059p) {
            return 5;
        }
        if (obj instanceof InterfaceC14060q) {
            return 6;
        }
        if (obj instanceof InterfaceC14061r) {
            return 7;
        }
        if (obj instanceof InterfaceC14062s) {
            return 8;
        }
        if (obj instanceof InterfaceC14063t) {
            return 9;
        }
        if (obj instanceof InterfaceC14044a) {
            return 10;
        }
        if (obj instanceof InterfaceC14045b) {
            return 11;
        }
        if (obj instanceof InterfaceC14046c) {
            return 12;
        }
        if (obj instanceof InterfaceC14047d) {
            return 13;
        }
        if (obj instanceof InterfaceC14048e) {
            return 14;
        }
        if (obj instanceof InterfaceC14049f) {
            return 15;
        }
        if (obj instanceof InterfaceC14050g) {
            return 16;
        }
        if (obj instanceof InterfaceC14051h) {
            return 17;
        }
        if (obj instanceof InterfaceC14052i) {
            return 18;
        }
        if (obj instanceof InterfaceC14053j) {
            return 19;
        }
        if (obj instanceof InterfaceC14054k) {
            return 20;
        }
        if (obj instanceof InterfaceC14055l) {
            return 21;
        }
        return obj instanceof InterfaceC14056m ? 22 : -1;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m32046k(Object obj, int i10) {
        return (obj instanceof InterfaceC7330b) && m32045j(obj) == i10;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m32047l(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof InterfaceC1170a) || (obj instanceof InterfaceC1174e);
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static <T extends Throwable> T m32048m(T t8) {
        return (T) Intrinsics.m31988k(t8, C7739h0.class.getName());
    }

    /* JADX INFO: renamed from: n */
    public static ClassCastException m32049n(ClassCastException classCastException) {
        throw ((ClassCastException) m32048m(classCastException));
    }

    /* JADX INFO: renamed from: o */
    public static void m32050o(Object obj, String str) {
        m32051p((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* JADX INFO: renamed from: p */
    public static void m32051p(String str) {
        throw m32049n(new ClassCastException(str));
    }
}

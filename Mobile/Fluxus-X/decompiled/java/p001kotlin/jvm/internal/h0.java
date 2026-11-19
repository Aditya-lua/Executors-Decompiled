package p001kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import pu.f;
import pu.g;
import pu.h;
import pu.i;
import pu.j;
import pu.k;
import pu.l;
import pu.m;
import pu.n;
import pu.o;
import pu.p;
import pu.q;
import pu.r;
import pu.s;
import pu.t;
import qu.a;
import qu.b;
import qu.c;
import qu.d;
import qu.e;

/* JADX INFO: loaded from: classes2.dex */
public class h0 {
    public static Collection a(Object obj) {
        if ((obj instanceof a) && !(obj instanceof b)) {
            o(obj, "kotlin.collections.MutableCollection");
        }
        return f(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof a) && !(obj instanceof c)) {
            o(obj, "kotlin.collections.MutableIterable");
        }
        return g(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof a) && !(obj instanceof d)) {
            o(obj, "kotlin.collections.MutableList");
        }
        return h(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof a) && !(obj instanceof e)) {
            o(obj, "kotlin.collections.MutableMap");
        }
        return i(obj);
    }

    public static Object e(Object obj, int i10) {
        if (obj != null && !k(obj, i10)) {
            o(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw n(e10);
        }
    }

    public static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw n(e10);
        }
    }

    public static List h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw n(e10);
        }
    }

    public static Map i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw n(e10);
        }
    }

    public static int j(Object obj) {
        if (obj instanceof i) {
            return ((i) obj).getArity();
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
        if (obj instanceof n) {
            return 3;
        }
        if (obj instanceof o) {
            return 4;
        }
        if (obj instanceof p) {
            return 5;
        }
        if (obj instanceof q) {
            return 6;
        }
        if (obj instanceof r) {
            return 7;
        }
        if (obj instanceof s) {
            return 8;
        }
        if (obj instanceof t) {
            return 9;
        }
        if (obj instanceof pu.a) {
            return 10;
        }
        if (obj instanceof pu.b) {
            return 11;
        }
        if (obj instanceof pu.c) {
            return 12;
        }
        if (obj instanceof pu.d) {
            return 13;
        }
        if (obj instanceof pu.e) {
            return 14;
        }
        if (obj instanceof f) {
            return 15;
        }
        if (obj instanceof g) {
            return 16;
        }
        if (obj instanceof h) {
            return 17;
        }
        if (obj instanceof i) {
            return 18;
        }
        if (obj instanceof j) {
            return 19;
        }
        if (obj instanceof k) {
            return 20;
        }
        if (obj instanceof l) {
            return 21;
        }
        return obj instanceof m ? 22 : -1;
    }

    public static boolean k(Object obj, int i10) {
        return (obj instanceof zt.b) && j(obj) == i10;
    }

    public static boolean l(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof a) || (obj instanceof e);
        }
        return false;
    }

    public static <T extends Throwable> T m(T t8) {
        return (T) Intrinsics.k(t8, h0.class.getName());
    }

    public static ClassCastException n(ClassCastException classCastException) {
        throw ((ClassCastException) m(classCastException));
    }

    public static void o(Object obj, String str) {
        p((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void p(String str) {
        throw n(new ClassCastException(str));
    }
}

package is;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jt.s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.jvm.internal.f0;
import ks.SingleNestedValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\t\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005*\b\u0012\u0004\u0012\u00020\u00120\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005*\b\u0012\u0004\u0012\u00020\u00120\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005*\b\u0012\u0004\u0012\u00020\u00120\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0011R*\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018¨\u0006\u001a"}, d2 = {"Lis/d;", "", "<init>", "()V", "key", "", "a", "(Ljava/lang/Object;)Ljava/util/List;", "", "value", "", "c", "(I)[Ljava/lang/Object;", "", "b", "(D)[Ljava/lang/Object;", "f", "(Ljava/util/List;)Ljava/util/List;", "", "d", "e", "Ljava/io/Serializable;", "g", "", "Ljava/util/Map;", "tableOfTruth", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f20850a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<Object, List<Object>> tableOfTruth;

    static {
        d dVar = new d();
        f20850a = dVar;
        Boolean bool = Boolean.TRUE;
        f0 f0Var = new f0(2);
        f0Var.a(bool);
        f0Var.b(dVar.c(1));
        Pair pairA = s.a(bool, p.n(f0Var.d(new Object[f0Var.c()])));
        Boolean bool2 = Boolean.FALSE;
        f0 f0Var2 = new f0(7);
        f0Var2.a(bool2);
        f0Var2.b(dVar.c(0));
        f0Var2.a("");
        f0Var2.a(p.k());
        f0Var2.a(new SingleNestedValue(p.k()));
        f0Var2.a(new SingleNestedValue(""));
        f0Var2.a(new SingleNestedValue(null));
        Pair pairA2 = s.a(bool2, p.n(f0Var2.d(new Object[f0Var2.c()])));
        f0 f0Var3 = new f0(2);
        f0Var3.a(bool);
        f0Var3.b(dVar.c(1));
        Pair pairA3 = s.a(1, p.n(f0Var3.d(new Object[f0Var3.c()])));
        f0 f0Var4 = new f0(7);
        f0Var4.a(bool2);
        f0Var4.b(dVar.c(0));
        f0Var4.a("");
        f0Var4.a(p.k());
        f0Var4.a(new SingleNestedValue(p.k()));
        f0Var4.a(new SingleNestedValue(""));
        f0Var4.a(new SingleNestedValue(null));
        Pair pairA4 = s.a(0, p.n(f0Var4.d(new Object[f0Var4.c()])));
        Pair pairA5 = s.a("true", o.d("true"));
        Pair pairA6 = s.a("false", o.d("false"));
        Double dValueOf = Double.valueOf(1.0d);
        Pair pairA7 = s.a("1", p.n(bool, 1, dValueOf, "1", new SingleNestedValue(1), new SingleNestedValue(dValueOf), new SingleNestedValue("1")));
        Double dValueOf2 = Double.valueOf(0.0d);
        Pair pairA8 = s.a("0", p.n(bool2, 0, dValueOf2, "0", new SingleNestedValue(0), new SingleNestedValue(dValueOf2), new SingleNestedValue("0")));
        Pair pairA9 = s.a("", p.n(bool2, 0, "", p.k(), new SingleNestedValue(p.k()), new SingleNestedValue(""), new SingleNestedValue(null)));
        Pair pairA10 = s.a(null, o.d(null));
        Pair pairA11 = s.a(p.k(), p.n(bool2, 0, dValueOf2, ""));
        Pair pairA12 = s.a(new SingleNestedValue(null), p.n(bool2, 0, dValueOf2, ""));
        Pair pairA13 = s.a(new SingleNestedValue(""), p.n(bool2, 0, dValueOf2, ""));
        Pair pairA14 = s.a(new SingleNestedValue(p.k()), p.n(bool2, 0, dValueOf2, ""));
        Pair pairA15 = s.a(new SingleNestedValue(0), p.n(bool2, 0, dValueOf2, "0"));
        Pair pairA16 = s.a(new SingleNestedValue(1), p.n(bool, 1, dValueOf, "1"));
        Pair pairA17 = s.a(new SingleNestedValue("1"), p.n(bool, 1, dValueOf, "1"));
        Pair pairA18 = s.a(new SingleNestedValue("0"), p.n(bool2, 0, dValueOf2, "0"));
        Pair pairA19 = s.a(new SingleNestedValue(dValueOf2), p.n(bool2, 0, dValueOf2, "0"));
        Pair pairA20 = s.a(new SingleNestedValue(dValueOf), p.n(bool, 1, dValueOf, "1"));
        Pair pairA21 = s.a(new SingleNestedValue("1.0"), p.n(bool, 1, dValueOf));
        Pair pairA22 = s.a(new SingleNestedValue("0.0"), p.n(bool2, 0, dValueOf2));
        Pair pairA23 = s.a(dValueOf, p.n(dValueOf, new SingleNestedValue(dValueOf), new SingleNestedValue(1), new SingleNestedValue("1.0"), "1", 1, bool, "1.0"));
        Pair pairA24 = s.a("1.0", p.n("1.0", dValueOf, 1, bool));
        f0 f0Var5 = new f0(4);
        f0Var5.b(dVar.b(0.0d));
        f0Var5.a(bool2);
        f0Var5.a(p.k());
        f0Var5.a(new SingleNestedValue(p.k()));
        tableOfTruth = k0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, pairA17, pairA18, pairA19, pairA20, pairA21, pairA22, pairA23, pairA24, s.a(dValueOf2, p.n(f0Var5.d(new Object[f0Var5.c()]))), s.a("0.0", p.n("0.0", dValueOf2, 0, bool2)));
    }

    @Nullable
    public final List<Object> a(@Nullable Object key) {
        return tableOfTruth.get(key);
    }

    public final Object[] b(double value) {
        return f(g(e(o.d(Double.valueOf(value))))).toArray(new Object[0]);
    }

    public final Object[] c(int value) {
        return f(g(d(o.d(Integer.valueOf(value))))).toArray(new Object[0]);
    }

    public final List<Number> d(List<? extends Number> list) {
        List<? extends Number> list2 = list;
        List<? extends Number> list3 = list;
        ArrayList arrayList = new ArrayList(q.u(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it.next()).doubleValue()));
        }
        return CollectionsKt.w0(list2, arrayList);
    }

    public final List<Number> e(List<? extends Number> list) {
        List<? extends Number> list2 = list;
        List<? extends Number> list3 = list;
        ArrayList arrayList = new ArrayList(q.u(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) it.next()).intValue()));
        }
        return CollectionsKt.w0(list2, arrayList);
    }

    public final List<Object> f(List<? extends Object> list) {
        List<? extends Object> list2 = list;
        List<? extends Object> list3 = list;
        ArrayList arrayList = new ArrayList(q.u(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(new SingleNestedValue(it.next()));
        }
        return CollectionsKt.w0(list2, arrayList);
    }

    public final List<Serializable> g(List<? extends Number> list) {
        List<? extends Number> list2 = list;
        List<? extends Number> list3 = list;
        ArrayList arrayList = new ArrayList(q.u(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Number) it.next()).toString());
        }
        return CollectionsKt.w0(list2, arrayList);
    }
}

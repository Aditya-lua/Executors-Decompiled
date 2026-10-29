package is;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7690k0;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.C7735f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7352s;
import p254ks.SingleNestedValue;

/* JADX INFO: renamed from: is.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\t\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005*\b\u0012\u0004\u0012\u00020\u00120\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005*\b\u0012\u0004\u0012\u00020\u00120\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005*\b\u0012\u0004\u0012\u00020\u00120\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0011R*\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018¨\u0006\u001a"}, m31665d2 = {"Lis/d;", "", "<init>", "()V", "key", "", "a", "(Ljava/lang/Object;)Ljava/util/List;", "", "value", "", "c", "(I)[Ljava/lang/Object;", "", "b", "(D)[Ljava/lang/Object;", "f", "(Ljava/util/List;)Ljava/util/List;", "", "d", "e", "Ljava/io/Serializable;", "g", "", "Ljava/util/Map;", "tableOfTruth", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6970d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C6970d f27234a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<Object, List<Object>> tableOfTruth;

    static {
        C6970d c6970d = new C6970d();
        f27234a = c6970d;
        Boolean bool = Boolean.TRUE;
        C7735f0 c7735f0 = new C7735f0(2);
        c7735f0.m32030a(bool);
        c7735f0.m32031b(c6970d.m29346c(1));
        Pair pairM30477a = C7352s.m30477a(bool, C7699p.m31895n(c7735f0.m32033d(new Object[c7735f0.m32032c()])));
        Boolean bool2 = Boolean.FALSE;
        C7735f0 c7735f1 = new C7735f0(7);
        c7735f1.m32030a(bool2);
        c7735f1.m32031b(c6970d.m29346c(0));
        c7735f1.m32030a("");
        c7735f1.m32030a(C7699p.m31892k());
        c7735f1.m32030a(new SingleNestedValue(C7699p.m31892k()));
        c7735f1.m32030a(new SingleNestedValue(""));
        c7735f1.m32030a(new SingleNestedValue(null));
        Pair pairM30477a2 = C7352s.m30477a(bool2, C7699p.m31895n(c7735f1.m32033d(new Object[c7735f1.m32032c()])));
        C7735f0 c7735f2 = new C7735f0(2);
        c7735f2.m32030a(bool);
        c7735f2.m32031b(c6970d.m29346c(1));
        Pair pairM30477a3 = C7352s.m30477a(1, C7699p.m31895n(c7735f2.m32033d(new Object[c7735f2.m32032c()])));
        C7735f0 c7735f3 = new C7735f0(7);
        c7735f3.m32030a(bool2);
        c7735f3.m32031b(c6970d.m29346c(0));
        c7735f3.m32030a("");
        c7735f3.m32030a(C7699p.m31892k());
        c7735f3.m32030a(new SingleNestedValue(C7699p.m31892k()));
        c7735f3.m32030a(new SingleNestedValue(""));
        c7735f3.m32030a(new SingleNestedValue(null));
        Pair pairM30477a4 = C7352s.m30477a(0, C7699p.m31895n(c7735f3.m32033d(new Object[c7735f3.m32032c()])));
        Pair pairM30477a5 = C7352s.m30477a("true", C7697o.m31878d("true"));
        Pair pairM30477a6 = C7352s.m30477a("false", C7697o.m31878d("false"));
        Double dValueOf = Double.valueOf(1.0d);
        Pair pairM30477a7 = C7352s.m30477a("1", C7699p.m31895n(bool, 1, dValueOf, "1", new SingleNestedValue(1), new SingleNestedValue(dValueOf), new SingleNestedValue("1")));
        Double dValueOf2 = Double.valueOf(0.0d);
        Pair pairM30477a8 = C7352s.m30477a("0", C7699p.m31895n(bool2, 0, dValueOf2, "0", new SingleNestedValue(0), new SingleNestedValue(dValueOf2), new SingleNestedValue("0")));
        Pair pairM30477a9 = C7352s.m30477a("", C7699p.m31895n(bool2, 0, "", C7699p.m31892k(), new SingleNestedValue(C7699p.m31892k()), new SingleNestedValue(""), new SingleNestedValue(null)));
        Pair pairM30477a10 = C7352s.m30477a(null, C7697o.m31878d(null));
        Pair pairM30477a11 = C7352s.m30477a(C7699p.m31892k(), C7699p.m31895n(bool2, 0, dValueOf2, ""));
        Pair pairM30477a12 = C7352s.m30477a(new SingleNestedValue(null), C7699p.m31895n(bool2, 0, dValueOf2, ""));
        Pair pairM30477a13 = C7352s.m30477a(new SingleNestedValue(""), C7699p.m31895n(bool2, 0, dValueOf2, ""));
        Pair pairM30477a14 = C7352s.m30477a(new SingleNestedValue(C7699p.m31892k()), C7699p.m31895n(bool2, 0, dValueOf2, ""));
        Pair pairM30477a15 = C7352s.m30477a(new SingleNestedValue(0), C7699p.m31895n(bool2, 0, dValueOf2, "0"));
        Pair pairM30477a16 = C7352s.m30477a(new SingleNestedValue(1), C7699p.m31895n(bool, 1, dValueOf, "1"));
        Pair pairM30477a17 = C7352s.m30477a(new SingleNestedValue("1"), C7699p.m31895n(bool, 1, dValueOf, "1"));
        Pair pairM30477a18 = C7352s.m30477a(new SingleNestedValue("0"), C7699p.m31895n(bool2, 0, dValueOf2, "0"));
        Pair pairM30477a19 = C7352s.m30477a(new SingleNestedValue(dValueOf2), C7699p.m31895n(bool2, 0, dValueOf2, "0"));
        Pair pairM30477a20 = C7352s.m30477a(new SingleNestedValue(dValueOf), C7699p.m31895n(bool, 1, dValueOf, "1"));
        Pair pairM30477a21 = C7352s.m30477a(new SingleNestedValue("1.0"), C7699p.m31895n(bool, 1, dValueOf));
        Pair pairM30477a22 = C7352s.m30477a(new SingleNestedValue("0.0"), C7699p.m31895n(bool2, 0, dValueOf2));
        Pair pairM30477a23 = C7352s.m30477a(dValueOf, C7699p.m31895n(dValueOf, new SingleNestedValue(dValueOf), new SingleNestedValue(1), new SingleNestedValue("1.0"), "1", 1, bool, "1.0"));
        Pair pairM30477a24 = C7352s.m30477a("1.0", C7699p.m31895n("1.0", dValueOf, 1, bool));
        C7735f0 c7735f4 = new C7735f0(4);
        c7735f4.m32031b(c6970d.m29345b(0.0d));
        c7735f4.m32030a(bool2);
        c7735f4.m32030a(C7699p.m31892k());
        c7735f4.m32030a(new SingleNestedValue(C7699p.m31892k()));
        tableOfTruth = C7690k0.m31798m(pairM30477a, pairM30477a2, pairM30477a3, pairM30477a4, pairM30477a5, pairM30477a6, pairM30477a7, pairM30477a8, pairM30477a9, pairM30477a10, pairM30477a11, pairM30477a12, pairM30477a13, pairM30477a14, pairM30477a15, pairM30477a16, pairM30477a17, pairM30477a18, pairM30477a19, pairM30477a20, pairM30477a21, pairM30477a22, pairM30477a23, pairM30477a24, C7352s.m30477a(dValueOf2, C7699p.m31895n(c7735f4.m32033d(new Object[c7735f4.m32032c()]))), C7352s.m30477a("0.0", C7699p.m31895n("0.0", dValueOf2, 0, bool2)));
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final List<Object> m29344a(@Nullable Object key) {
        return tableOfTruth.get(key);
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m29345b(double value) {
        return m29349f(m29350g(m29348e(C7697o.m31878d(Double.valueOf(value))))).toArray(new Object[0]);
    }

    /* JADX INFO: renamed from: c */
    public final Object[] m29346c(int value) {
        return m29349f(m29350g(m29347d(C7697o.m31878d(Integer.valueOf(value))))).toArray(new Object[0]);
    }

    /* JADX INFO: renamed from: d */
    public final List<Number> m29347d(List<? extends Number> list) {
        List<? extends Number> list2 = list;
        List<? extends Number> list3 = list;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it.next()).doubleValue()));
        }
        return CollectionsKt.m31725w0(list2, arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final List<Number> m29348e(List<? extends Number> list) {
        List<? extends Number> list2 = list;
        List<? extends Number> list3 = list;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) it.next()).intValue()));
        }
        return CollectionsKt.m31725w0(list2, arrayList);
    }

    /* JADX INFO: renamed from: f */
    public final List<Object> m29349f(List<? extends Object> list) {
        List<? extends Object> list2 = list;
        List<? extends Object> list3 = list;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(new SingleNestedValue(it.next()));
        }
        return CollectionsKt.m31725w0(list2, arrayList);
    }

    /* JADX INFO: renamed from: g */
    public final List<Serializable> m29350g(List<? extends Number> list) {
        List<? extends Number> list2 = list;
        List<? extends Number> list3 = list;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Number) it.next()).toString());
        }
        return CollectionsKt.m31725w0(list2, arrayList);
    }
}

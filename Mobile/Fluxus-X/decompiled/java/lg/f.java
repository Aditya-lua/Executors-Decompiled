package lg;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import ng.f0;
import ng.h0;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final lg.e A = lg.e.f22086d;
    public static final String B = null;
    public static final lg.d C = lg.c.f22079a;
    public static final z D = y.f22152a;
    public static final z E = y.b;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final x f22090z = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal<Map<sg.a<?>, a0<?>>> f22091a;
    public final ConcurrentMap<sg.a<?>, a0<?>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ng.v f22092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final og.e f22093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b0> f22094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ng.w f22095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lg.d f22096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<Type, h<?>> f22097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f22098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f22099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f22100k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f22101l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final lg.e f22102m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x f22103n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f22104o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f22105p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f22106q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f22107r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f22108s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v f22109t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List<b0> f22110u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<b0> f22111v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z f22112w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z f22113x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<w> f22114y;

    public class a extends a0<Number> {
        public a() {
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double read(tg.a aVar) throws IOException {
            if (aVar.Q() != tg.b.NULL) {
                return Double.valueOf(aVar.y());
            }
            aVar.K();
            return null;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.s();
                return;
            }
            double dDoubleValue = number.doubleValue();
            f.d(dDoubleValue);
            cVar.N(dDoubleValue);
        }
    }

    public class b extends a0<Number> {
        public b() {
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float read(tg.a aVar) throws IOException {
            if (aVar.Q() != tg.b.NULL) {
                return Float.valueOf((float) aVar.y());
            }
            aVar.K();
            return null;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.s();
                return;
            }
            float fFloatValue = number.floatValue();
            f.d(fFloatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(fFloatValue);
            }
            cVar.T(number);
        }
    }

    public class c extends a0<Number> {
        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number read(tg.a aVar) throws IOException {
            if (aVar.Q() != tg.b.NULL) {
                return Long.valueOf(aVar.A());
            }
            aVar.K();
            return null;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.s();
            } else {
                cVar.Y(number.toString());
            }
        }
    }

    public class d extends a0<AtomicLong> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f22117a;

        public d(a0 a0Var) {
            this.f22117a = a0Var;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicLong read(tg.a aVar) {
            return new AtomicLong(((Number) this.f22117a.read(aVar)).longValue());
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, AtomicLong atomicLong) {
            this.f22117a.write(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    public class e extends a0<AtomicLongArray> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f22118a;

        public e(a0 a0Var) {
            this.f22118a = a0Var;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray read(tg.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.p()) {
                arrayList.add(Long.valueOf(((Number) this.f22118a.read(aVar)).longValue()));
            }
            aVar.g();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // lg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(tg.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.d();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f22118a.write(cVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            cVar.g();
        }
    }

    /* JADX INFO: renamed from: lg.f$f, reason: collision with other inner class name */
    public static class C0427f<T> extends og.m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a0<T> f22119a = null;

        private a0<T> b() {
            a0<T> a0Var = this.f22119a;
            if (a0Var != null) {
                return a0Var;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // og.m
        public a0<T> a() {
            return b();
        }

        public void c(a0<T> a0Var) {
            if (this.f22119a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f22119a = a0Var;
        }

        @Override // lg.a0
        public T read(tg.a aVar) {
            return b().read(aVar);
        }

        @Override // lg.a0
        public void write(tg.c cVar, T t8) {
            b().write(cVar, t8);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f() {
        ng.w wVar = ng.w.f25567g;
        lg.d dVar = C;
        Map map = Collections.EMPTY_MAP;
        lg.e eVar = A;
        x xVar = f22090z;
        v vVar = v.f22143a;
        String str = B;
        List list = Collections.EMPTY_LIST;
        this(wVar, dVar, map, false, false, false, true, eVar, xVar, false, true, vVar, str, 2, 2, list, list, list, D, E, list);
    }

    public static void a(Object obj, tg.a aVar) {
        if (obj != null) {
            try {
                if (aVar.Q() == tg.b.END_DOCUMENT) {
                } else {
                    throw new u("JSON document was not fully consumed.");
                }
            } catch (tg.d e10) {
                throw new u(e10);
            } catch (IOException e11) {
                throw new m(e11);
            }
        }
    }

    public static a0<AtomicLong> b(a0<Number> a0Var) {
        return new d(a0Var).nullSafe();
    }

    public static a0<AtomicLongArray> c(a0<Number> a0Var) {
        return new e(a0Var).nullSafe();
    }

    public static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static a0<Number> o(v vVar) {
        return vVar == v.f22143a ? og.p.f28212t : new c();
    }

    public final a0<Number> e(boolean z10) {
        return z10 ? og.p.f28214v : new a();
    }

    public final a0<Number> f(boolean z10) {
        return z10 ? og.p.f28213u : new b();
    }

    public <T> T g(Reader reader, sg.a<T> aVar) {
        tg.a aVarP = p(reader);
        T t8 = (T) k(aVarP, aVar);
        a(t8, aVarP);
        return t8;
    }

    public <T> T h(String str, Class<T> cls) {
        return (T) j(str, sg.a.a(cls));
    }

    public <T> T i(String str, Type type) {
        return (T) j(str, sg.a.b(type));
    }

    public <T> T j(String str, sg.a<T> aVar) {
        if (str == null) {
            return null;
        }
        return (T) g(new StringReader(str), aVar);
    }

    public <T> T k(tg.a aVar, sg.a<T> aVar2) {
        boolean z10;
        x xVarO = aVar.o();
        x xVar = this.f22103n;
        if (xVar != null) {
            aVar.e0(xVar);
        } else if (aVar.o() == x.LEGACY_STRICT) {
            aVar.e0(x.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        aVar.Q();
                        z10 = false;
                        try {
                            a0<T> a0VarM = m(aVar2);
                            T t8 = a0VarM.read(aVar);
                            Class clsB = f0.b(aVar2.c());
                            if (t8 != null && !clsB.isInstance(t8)) {
                                throw new ClassCastException("Type adapter '" + a0VarM + "' returned wrong type; requested " + aVar2.c() + " but got instance of " + t8.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            aVar.e0(xVarO);
                            return t8;
                        } catch (EOFException e10) {
                            e = e10;
                            if (!z10) {
                                throw new u(e);
                            }
                            aVar.e0(xVarO);
                            return null;
                        }
                    } catch (EOFException e11) {
                        e = e11;
                        z10 = true;
                    }
                } catch (IOException e12) {
                    throw new u(e12);
                }
            } catch (AssertionError e13) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e13.getMessage(), e13);
            } catch (IllegalStateException e14) {
                throw new u(e14);
            }
        } catch (Throwable th2) {
            aVar.e0(xVarO);
            throw th2;
        }
    }

    public <T> a0<T> l(Class<T> cls) {
        return m(sg.a.a(cls));
    }

    public <T> a0<T> m(sg.a<T> aVar) {
        boolean z10;
        Objects.requireNonNull(aVar, "type must not be null");
        a0<T> a0Var = (a0) this.b.get(aVar);
        if (a0Var != null) {
            return a0Var;
        }
        Map<? extends sg.a<?>, ? extends a0<?>> map = this.f22091a.get();
        if (map == null) {
            map = new HashMap<>();
            this.f22091a.set((Map<sg.a<?>, a0<?>>) map);
            z10 = true;
        } else {
            a0<T> a0Var2 = (a0) map.get(aVar);
            if (a0Var2 != null) {
                return a0Var2;
            }
            z10 = false;
        }
        try {
            C0427f c0427f = new C0427f();
            map.put(aVar, c0427f);
            Iterator<b0> it = this.f22094e.iterator();
            a0<T> a0VarCreate = null;
            while (it.hasNext()) {
                a0VarCreate = it.next().create(this, aVar);
                if (a0VarCreate != null) {
                    c0427f.c(a0VarCreate);
                    map.put(aVar, a0VarCreate);
                    break;
                }
            }
            if (z10) {
                this.f22091a.remove();
            }
            if (a0VarCreate != null) {
                if (z10) {
                    this.b.putAll(map);
                }
                return a0VarCreate;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + aVar);
        } catch (Throwable th2) {
            if (z10) {
                this.f22091a.remove();
            }
            throw th2;
        }
    }

    public <T> a0<T> n(b0 b0Var, sg.a<T> aVar) {
        Objects.requireNonNull(b0Var, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        if (this.f22093d.d(aVar, b0Var)) {
            b0Var = this.f22093d;
        }
        boolean z10 = false;
        for (b0 b0Var2 : this.f22094e) {
            if (z10) {
                a0<T> a0VarCreate = b0Var2.create(this, aVar);
                if (a0VarCreate != null) {
                    return a0VarCreate;
                }
            } else if (b0Var2 == b0Var) {
                z10 = true;
            }
        }
        if (!z10) {
            return m(aVar);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
    }

    public tg.a p(Reader reader) {
        tg.a aVar = new tg.a(reader);
        x xVar = this.f22103n;
        if (xVar == null) {
            xVar = x.LEGACY_STRICT;
        }
        aVar.e0(xVar);
        return aVar;
    }

    public tg.c q(Writer writer) throws IOException {
        if (this.f22100k) {
            writer.write(")]}'\n");
        }
        tg.c cVar = new tg.c(writer);
        cVar.A(this.f22102m);
        cVar.E(this.f22101l);
        x xVar = this.f22103n;
        if (xVar == null) {
            xVar = x.LEGACY_STRICT;
        }
        cVar.K(xVar);
        cVar.I(this.f22098i);
        return cVar;
    }

    public String r(Object obj) {
        return obj == null ? t(n.f22140a) : s(obj, obj.getClass());
    }

    public String s(Object obj, Type type) {
        StringBuilder sb2 = new StringBuilder();
        u(obj, type, sb2);
        return sb2.toString();
    }

    public String t(l lVar) {
        StringBuilder sb2 = new StringBuilder();
        w(lVar, sb2);
        return sb2.toString();
    }

    public String toString() {
        return "{serializeNulls:" + this.f22098i + ",factories:" + this.f22094e + ",instanceCreators:" + this.f22092c + "}";
    }

    public void u(Object obj, Type type, Appendable appendable) {
        try {
            v(obj, type, q(h0.c(appendable)));
        } catch (IOException e10) {
            throw new m(e10);
        }
    }

    public void v(Object obj, Type type, tg.c cVar) {
        a0 a0VarM = m(sg.a.b(type));
        x xVarM = cVar.m();
        x xVar = this.f22103n;
        if (xVar != null) {
            cVar.K(xVar);
        } else if (cVar.m() == x.LEGACY_STRICT) {
            cVar.K(x.LENIENT);
        }
        boolean zN = cVar.n();
        boolean zK = cVar.k();
        cVar.E(this.f22101l);
        cVar.I(this.f22098i);
        try {
            try {
                try {
                    a0VarM.write(cVar, obj);
                    cVar.K(xVarM);
                    cVar.E(zN);
                    cVar.I(zK);
                } catch (AssertionError e10) {
                    throw new AssertionError("AssertionError (GSON 2.13.2): " + e10.getMessage(), e10);
                }
            } catch (IOException e11) {
                throw new m(e11);
            }
        } catch (Throwable th2) {
            cVar.K(xVarM);
            cVar.E(zN);
            cVar.I(zK);
            throw th2;
        }
    }

    public void w(l lVar, Appendable appendable) {
        try {
            x(lVar, q(h0.c(appendable)));
        } catch (IOException e10) {
            throw new m(e10);
        }
    }

    public void x(l lVar, tg.c cVar) {
        x xVarM = cVar.m();
        boolean zN = cVar.n();
        boolean zK = cVar.k();
        cVar.E(this.f22101l);
        cVar.I(this.f22098i);
        x xVar = this.f22103n;
        if (xVar != null) {
            cVar.K(xVar);
        } else if (cVar.m() == x.LEGACY_STRICT) {
            cVar.K(x.LENIENT);
        }
        try {
            try {
                h0.b(lVar, cVar);
                cVar.K(xVarM);
                cVar.E(zN);
                cVar.I(zK);
            } catch (IOException e10) {
                throw new m(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e11.getMessage(), e11);
            }
        } catch (Throwable th2) {
            cVar.K(xVarM);
            cVar.E(zN);
            cVar.I(zK);
            throw th2;
        }
    }

    public l y(Object obj) {
        return obj == null ? n.f22140a : z(obj, obj.getClass());
    }

    public l z(Object obj, Type type) {
        og.h hVar = new og.h();
        v(obj, type, hVar);
        return hVar.d0();
    }

    public f(ng.w wVar, lg.d dVar, Map<Type, h<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, lg.e eVar, x xVar, boolean z14, boolean z15, v vVar, String str, int i10, int i11, List<b0> list, List<b0> list2, List<b0> list3, z zVar, z zVar2, List<w> list4) {
        this.f22091a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        this.f22095f = wVar;
        this.f22096g = dVar;
        this.f22097h = map;
        ng.v vVar2 = new ng.v(map, z15, list4);
        this.f22092c = vVar2;
        this.f22098i = z10;
        this.f22099j = z11;
        this.f22100k = z12;
        this.f22101l = z13;
        this.f22102m = eVar;
        this.f22103n = xVar;
        this.f22104o = z14;
        this.f22105p = z15;
        this.f22109t = vVar;
        this.f22106q = str;
        this.f22107r = i10;
        this.f22108s = i11;
        this.f22110u = list;
        this.f22111v = list2;
        this.f22112w = zVar;
        this.f22113x = zVar2;
        this.f22114y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(og.p.W);
        arrayList.add(og.k.a(zVar));
        arrayList.add(wVar);
        arrayList.addAll(list3);
        arrayList.add(og.p.C);
        arrayList.add(og.p.f28205m);
        arrayList.add(og.p.f28199g);
        arrayList.add(og.p.f28201i);
        arrayList.add(og.p.f28203k);
        a0<Number> a0VarO = o(vVar);
        arrayList.add(og.p.a(Long.TYPE, Long.class, a0VarO));
        arrayList.add(og.p.a(Double.TYPE, Double.class, e(z14)));
        arrayList.add(og.p.a(Float.TYPE, Float.class, f(z14)));
        arrayList.add(og.j.a(zVar2));
        arrayList.add(og.p.f28207o);
        arrayList.add(og.p.f28209q);
        arrayList.add(og.p.b(AtomicLong.class, b(a0VarO)));
        arrayList.add(og.p.b(AtomicLongArray.class, c(a0VarO)));
        arrayList.add(og.p.f28211s);
        arrayList.add(og.p.f28216x);
        arrayList.add(og.p.E);
        arrayList.add(og.p.G);
        arrayList.add(og.p.b(BigDecimal.class, og.p.f28218z));
        arrayList.add(og.p.b(BigInteger.class, og.p.A));
        arrayList.add(og.p.b(ng.a0.class, og.p.B));
        arrayList.add(og.p.I);
        arrayList.add(og.p.K);
        arrayList.add(og.p.O);
        arrayList.add(og.p.Q);
        arrayList.add(og.p.U);
        arrayList.add(og.p.M);
        arrayList.add(og.p.f28196d);
        arrayList.add(og.c.f28126c);
        arrayList.add(og.p.S);
        if (rg.d.f30704a) {
            arrayList.add(rg.d.f30707e);
            arrayList.add(rg.d.f30706d);
            arrayList.add(rg.d.f30708f);
        }
        arrayList.add(og.a.f28122c);
        arrayList.add(og.p.b);
        arrayList.add(new og.b(vVar2));
        arrayList.add(new og.i(vVar2, z11));
        og.e eVar2 = new og.e(vVar2);
        this.f22093d = eVar2;
        arrayList.add(eVar2);
        arrayList.add(og.p.X);
        arrayList.add(new og.l(vVar2, dVar, wVar, eVar2, list4));
        this.f22094e = Collections.unmodifiableList(arrayList);
    }
}

package hn;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hn.h.e f18441a = new c();
    public static final hn.h<Boolean> b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hn.h<Byte> f18442c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hn.h<Character> f18443d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hn.h<Double> f18444e = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final hn.h<Float> f18445f = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final hn.h<Integer> f18446g = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final hn.h<Long> f18447h = new j();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final hn.h<Short> f18448i = new k();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final hn.h<String> f18449j = new a();

    public class a extends hn.h<String> {
        @Override // hn.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String fromJson(hn.m mVar) {
            return mVar.s();
        }

        @Override // hn.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, String str) {
            tVar.Q(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18450a;

        static {
            int[] iArr = new int[hn.m.c.values().length];
            f18450a = iArr;
            try {
                iArr[hn.m.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18450a[hn.m.c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18450a[hn.m.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18450a[hn.m.c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18450a[hn.m.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18450a[hn.m.c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class c implements hn.h.e {
        @Override // hn.h.e
        public hn.h<?> create(Type type, Set<? extends Annotation> set, w wVar) throws NoSuchMethodException {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return y.b;
            }
            if (type == Byte.TYPE) {
                return y.f18442c;
            }
            if (type == Character.TYPE) {
                return y.f18443d;
            }
            if (type == Double.TYPE) {
                return y.f18444e;
            }
            if (type == Float.TYPE) {
                return y.f18445f;
            }
            if (type == Integer.TYPE) {
                return y.f18446g;
            }
            if (type == Long.TYPE) {
                return y.f18447h;
            }
            if (type == Short.TYPE) {
                return y.f18448i;
            }
            if (type == Boolean.class) {
                return y.b.nullSafe();
            }
            if (type == Byte.class) {
                return y.f18442c.nullSafe();
            }
            if (type == Character.class) {
                return y.f18443d.nullSafe();
            }
            if (type == Double.class) {
                return y.f18444e.nullSafe();
            }
            if (type == Float.class) {
                return y.f18445f.nullSafe();
            }
            if (type == Integer.class) {
                return y.f18446g.nullSafe();
            }
            if (type == Long.class) {
                return y.f18447h.nullSafe();
            }
            if (type == Short.class) {
                return y.f18448i.nullSafe();
            }
            if (type == String.class) {
                return y.f18449j.nullSafe();
            }
            if (type == Object.class) {
                return new m(wVar).nullSafe();
            }
            Class<?> clsG = a0.g(type);
            hn.h<?> hVarD = jn.c.d(wVar, type, clsG);
            if (hVarD != null) {
                return hVarD;
            }
            if (clsG.isEnum()) {
                return new l(clsG).nullSafe();
            }
            return null;
        }
    }

    public class d extends hn.h<Boolean> {
        @Override // hn.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean fromJson(hn.m mVar) {
            return Boolean.valueOf(mVar.h());
        }

        @Override // hn.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Boolean bool) {
            tVar.T(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    public class e extends hn.h<Byte> {
        @Override // hn.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte fromJson(hn.m mVar) {
            return Byte.valueOf((byte) y.a(mVar, "a byte", -128, 255));
        }

        @Override // hn.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Byte b) {
            tVar.K(b.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    public class f extends hn.h<Character> {
        @Override // hn.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character fromJson(hn.m mVar) {
            String strS = mVar.s();
            if (strS.length() <= 1) {
                return Character.valueOf(strS.charAt(0));
            }
            throw new hn.j(String.format("Expected %s but was %s at path %s", "a char", '\"' + strS + '\"', mVar.x()));
        }

        @Override // hn.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Character ch2) {
            tVar.Q(ch2.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    public class g extends hn.h<Double> {
        @Override // hn.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double fromJson(hn.m mVar) {
            return Double.valueOf(mVar.k());
        }

        @Override // hn.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Double d10) {
            tVar.I(d10.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    public class h extends hn.h<Float> {
        @Override // hn.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float fromJson(hn.m mVar) {
            float fK = (float) mVar.k();
            if (mVar.g() || !Float.isInfinite(fK)) {
                return Float.valueOf(fK);
            }
            throw new hn.j("JSON forbids NaN and infinities: " + fK + " at path " + mVar.x());
        }

        @Override // hn.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Float f10) {
            f10.getClass();
            tVar.O(f10);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    public class i extends hn.h<Integer> {
        @Override // hn.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer fromJson(hn.m mVar) {
            return Integer.valueOf(mVar.m());
        }

        @Override // hn.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Integer num) {
            tVar.K(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    public class j extends hn.h<Long> {
        @Override // hn.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long fromJson(hn.m mVar) {
            return Long.valueOf(mVar.n());
        }

        @Override // hn.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Long l10) {
            tVar.K(l10.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    public class k extends hn.h<Short> {
        @Override // hn.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Short fromJson(hn.m mVar) {
            return Short.valueOf((short) y.a(mVar, "a short", -32768, 32767));
        }

        @Override // hn.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Short sh2) {
            tVar.K(sh2.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    public static final class l<T extends Enum<T>> extends hn.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f18451a;
        public final String[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T[] f18452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final hn.m.b f18453d;

        public l(Class<T> cls) {
            this.f18451a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f18452c = enumConstants;
                this.b = new String[enumConstants.length];
                int i10 = 0;
                while (true) {
                    T[] tArr = this.f18452c;
                    if (i10 >= tArr.length) {
                        this.f18453d = hn.m.b.a(this.b);
                        return;
                    } else {
                        String strName = tArr[i10].name();
                        this.b[i10] = jn.c.n(strName, cls.getField(strName));
                        i10++;
                    }
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError("Missing field in " + cls.getName(), e10);
            }
        }

        @Override // hn.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public T fromJson(hn.m mVar) {
            int iK = mVar.K(this.f18453d);
            if (iK != -1) {
                return this.f18452c[iK];
            }
            String strX = mVar.x();
            throw new hn.j("Expected one of " + Arrays.asList(this.b) + " but was " + mVar.s() + " at path " + strX);
        }

        @Override // hn.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, T t8) {
            tVar.Q(this.b[t8.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f18451a.getName() + ")";
        }
    }

    public static final class m extends hn.h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f18454a;
        public final hn.h<List> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final hn.h<Map> f18455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final hn.h<String> f18456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final hn.h<Double> f18457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final hn.h<Boolean> f18458f;

        public m(w wVar) {
            this.f18454a = wVar;
            this.b = wVar.c(List.class);
            this.f18455c = wVar.c(Map.class);
            this.f18456d = wVar.c(String.class);
            this.f18457e = wVar.c(Double.class);
            this.f18458f = wVar.c(Boolean.class);
        }

        public final Class<?> a(Class<?> cls) {
            if (Map.class.isAssignableFrom(cls)) {
                return Map.class;
            }
            return Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // hn.h
        public Object fromJson(hn.m mVar) {
            switch (b.f18450a[mVar.w().ordinal()]) {
                case 1:
                    return this.b.fromJson(mVar);
                case 2:
                    return this.f18455c.fromJson(mVar);
                case 3:
                    return this.f18456d.fromJson(mVar);
                case 4:
                    return this.f18457e.fromJson(mVar);
                case 5:
                    return this.f18458f.fromJson(mVar);
                case 6:
                    return mVar.p();
                default:
                    throw new IllegalStateException("Expected a value but was " + mVar.w() + " at path " + mVar.x());
            }
        }

        @Override // hn.h
        public void toJson(t tVar, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls != Object.class) {
                this.f18454a.e(a(cls), jn.c.f20815a).toJson(tVar, obj);
            } else {
                tVar.c();
                tVar.g();
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    public static int a(hn.m mVar, String str, int i10, int i11) {
        int iM = mVar.m();
        if (iM < i10 || iM > i11) {
            throw new hn.j(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(iM), mVar.x()));
        }
        return iM;
    }
}

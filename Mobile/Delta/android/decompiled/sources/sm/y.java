package sm;

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
    public static final sm.h.e f31686a = new c();
    public static final sm.h<Boolean> b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sm.h<Byte> f31687c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final sm.h<Character> f31688d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final sm.h<Double> f31689e = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final sm.h<Float> f31690f = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final sm.h<Integer> f31691g = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final sm.h<Long> f31692h = new j();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final sm.h<Short> f31693i = new k();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final sm.h<String> f31694j = new a();

    public class a extends sm.h<String> {
        @Override // sm.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String fromJson(sm.m mVar) {
            return mVar.r();
        }

        @Override // sm.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, String str) {
            tVar.M(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31695a;

        static {
            int[] iArr = new int[sm.m.c.values().length];
            f31695a = iArr;
            try {
                iArr[sm.m.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31695a[sm.m.c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31695a[sm.m.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31695a[sm.m.c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31695a[sm.m.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31695a[sm.m.c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class c implements sm.h.e {
        @Override // sm.h.e
        public sm.h<?> create(Type type, Set<? extends Annotation> set, w wVar) throws NoSuchMethodException {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return y.b;
            }
            if (type == Byte.TYPE) {
                return y.f31687c;
            }
            if (type == Character.TYPE) {
                return y.f31688d;
            }
            if (type == Double.TYPE) {
                return y.f31689e;
            }
            if (type == Float.TYPE) {
                return y.f31690f;
            }
            if (type == Integer.TYPE) {
                return y.f31691g;
            }
            if (type == Long.TYPE) {
                return y.f31692h;
            }
            if (type == Short.TYPE) {
                return y.f31693i;
            }
            if (type == Boolean.class) {
                return y.b.nullSafe();
            }
            if (type == Byte.class) {
                return y.f31687c.nullSafe();
            }
            if (type == Character.class) {
                return y.f31688d.nullSafe();
            }
            if (type == Double.class) {
                return y.f31689e.nullSafe();
            }
            if (type == Float.class) {
                return y.f31690f.nullSafe();
            }
            if (type == Integer.class) {
                return y.f31691g.nullSafe();
            }
            if (type == Long.class) {
                return y.f31692h.nullSafe();
            }
            if (type == Short.class) {
                return y.f31693i.nullSafe();
            }
            if (type == String.class) {
                return y.f31694j.nullSafe();
            }
            if (type == Object.class) {
                return new m(wVar).nullSafe();
            }
            Class<?> clsG = a0.g(type);
            sm.h<?> hVarD = um.c.d(wVar, type, clsG);
            if (hVarD != null) {
                return hVarD;
            }
            if (clsG.isEnum()) {
                return new l(clsG).nullSafe();
            }
            return null;
        }
    }

    public class d extends sm.h<Boolean> {
        @Override // sm.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean fromJson(sm.m mVar) {
            return Boolean.valueOf(mVar.h());
        }

        @Override // sm.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Boolean bool) {
            tVar.U(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    public class e extends sm.h<Byte> {
        @Override // sm.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte fromJson(sm.m mVar) {
            return Byte.valueOf((byte) y.a(mVar, "a byte", -128, 255));
        }

        @Override // sm.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Byte b) {
            tVar.H(b.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    public class f extends sm.h<Character> {
        @Override // sm.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character fromJson(sm.m mVar) {
            String strR = mVar.r();
            if (strR.length() <= 1) {
                return Character.valueOf(strR.charAt(0));
            }
            throw new sm.j(String.format("Expected %s but was %s at path %s", "a char", '\"' + strR + '\"', mVar.getPath()));
        }

        @Override // sm.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Character ch2) {
            tVar.M(ch2.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    public class g extends sm.h<Double> {
        @Override // sm.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double fromJson(sm.m mVar) {
            return Double.valueOf(mVar.j());
        }

        @Override // sm.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Double d10) {
            tVar.F(d10.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    public class h extends sm.h<Float> {
        @Override // sm.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float fromJson(sm.m mVar) {
            float fJ = (float) mVar.j();
            if (mVar.g() || !Float.isInfinite(fJ)) {
                return Float.valueOf(fJ);
            }
            throw new sm.j("JSON forbids NaN and infinities: " + fJ + " at path " + mVar.getPath());
        }

        @Override // sm.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Float f10) {
            f10.getClass();
            tVar.L(f10);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    public class i extends sm.h<Integer> {
        @Override // sm.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer fromJson(sm.m mVar) {
            return Integer.valueOf(mVar.l());
        }

        @Override // sm.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Integer num) {
            tVar.H(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    public class j extends sm.h<Long> {
        @Override // sm.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long fromJson(sm.m mVar) {
            return Long.valueOf(mVar.m());
        }

        @Override // sm.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Long l10) {
            tVar.H(l10.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    public class k extends sm.h<Short> {
        @Override // sm.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Short fromJson(sm.m mVar) {
            return Short.valueOf((short) y.a(mVar, "a short", -32768, 32767));
        }

        @Override // sm.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Short sh2) {
            tVar.H(sh2.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    public static final class l<T extends Enum<T>> extends sm.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f31696a;
        public final String[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T[] f31697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final sm.m.b f31698d;

        public l(Class<T> cls) {
            this.f31696a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f31697c = enumConstants;
                this.b = new String[enumConstants.length];
                int i10 = 0;
                while (true) {
                    T[] tArr = this.f31697c;
                    if (i10 >= tArr.length) {
                        this.f31698d = sm.m.b.a(this.b);
                        return;
                    } else {
                        String strName = tArr[i10].name();
                        this.b[i10] = um.c.m(strName, cls.getField(strName));
                        i10++;
                    }
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError("Missing field in " + cls.getName(), e10);
            }
        }

        @Override // sm.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public T fromJson(sm.m mVar) {
            int iH = mVar.H(this.f31698d);
            if (iH != -1) {
                return this.f31697c[iH];
            }
            String path = mVar.getPath();
            throw new sm.j("Expected one of " + Arrays.asList(this.b) + " but was " + mVar.r() + " at path " + path);
        }

        @Override // sm.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, T t8) {
            tVar.M(this.b[t8.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f31696a.getName() + ")";
        }
    }

    public static final class m extends sm.h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f31699a;
        public final sm.h<List> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final sm.h<Map> f31700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final sm.h<String> f31701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final sm.h<Double> f31702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final sm.h<Boolean> f31703f;

        public m(w wVar) {
            this.f31699a = wVar;
            this.b = wVar.c(List.class);
            this.f31700c = wVar.c(Map.class);
            this.f31701d = wVar.c(String.class);
            this.f31702e = wVar.c(Double.class);
            this.f31703f = wVar.c(Boolean.class);
        }

        public final Class<?> a(Class<?> cls) {
            if (Map.class.isAssignableFrom(cls)) {
                return Map.class;
            }
            return Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // sm.h
        public Object fromJson(sm.m mVar) {
            switch (b.f31695a[mVar.u().ordinal()]) {
                case 1:
                    return this.b.fromJson(mVar);
                case 2:
                    return this.f31700c.fromJson(mVar);
                case 3:
                    return this.f31701d.fromJson(mVar);
                case 4:
                    return this.f31702e.fromJson(mVar);
                case 5:
                    return this.f31703f.fromJson(mVar);
                case 6:
                    return mVar.o();
                default:
                    throw new IllegalStateException("Expected a value but was " + mVar.u() + " at path " + mVar.getPath());
            }
        }

        @Override // sm.h
        public void toJson(t tVar, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls != Object.class) {
                this.f31699a.e(a(cls), um.c.f33128a).toJson(tVar, obj);
            } else {
                tVar.c();
                tVar.g();
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    public static int a(sm.m mVar, String str, int i10, int i11) {
        int iL = mVar.l();
        if (iL < i10 || iL > i11) {
            throw new sm.j(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(iL), mVar.getPath()));
        }
        return iL;
    }
}

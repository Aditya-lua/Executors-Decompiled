package um;

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
    public static final um.h.e f32496a = new c();
    public static final um.h<Boolean> b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final um.h<Byte> f32497c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final um.h<Character> f32498d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final um.h<Double> f32499e = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final um.h<Float> f32500f = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final um.h<Integer> f32501g = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final um.h<Long> f32502h = new j();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final um.h<Short> f32503i = new k();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final um.h<String> f32504j = new a();

    public class a extends um.h<String> {
        @Override // um.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String fromJson(um.m mVar) {
            return mVar.r();
        }

        @Override // um.h
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
        public static final /* synthetic */ int[] f32505a;

        static {
            int[] iArr = new int[um.m.c.values().length];
            f32505a = iArr;
            try {
                iArr[um.m.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32505a[um.m.c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32505a[um.m.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32505a[um.m.c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32505a[um.m.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32505a[um.m.c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class c implements um.h.e {
        @Override // um.h.e
        public um.h<?> create(Type type, Set<? extends Annotation> set, w wVar) throws NoSuchMethodException {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return y.b;
            }
            if (type == Byte.TYPE) {
                return y.f32497c;
            }
            if (type == Character.TYPE) {
                return y.f32498d;
            }
            if (type == Double.TYPE) {
                return y.f32499e;
            }
            if (type == Float.TYPE) {
                return y.f32500f;
            }
            if (type == Integer.TYPE) {
                return y.f32501g;
            }
            if (type == Long.TYPE) {
                return y.f32502h;
            }
            if (type == Short.TYPE) {
                return y.f32503i;
            }
            if (type == Boolean.class) {
                return y.b.nullSafe();
            }
            if (type == Byte.class) {
                return y.f32497c.nullSafe();
            }
            if (type == Character.class) {
                return y.f32498d.nullSafe();
            }
            if (type == Double.class) {
                return y.f32499e.nullSafe();
            }
            if (type == Float.class) {
                return y.f32500f.nullSafe();
            }
            if (type == Integer.class) {
                return y.f32501g.nullSafe();
            }
            if (type == Long.class) {
                return y.f32502h.nullSafe();
            }
            if (type == Short.class) {
                return y.f32503i.nullSafe();
            }
            if (type == String.class) {
                return y.f32504j.nullSafe();
            }
            if (type == Object.class) {
                return new m(wVar).nullSafe();
            }
            Class<?> clsG = a0.g(type);
            um.h<?> hVarD = wm.c.d(wVar, type, clsG);
            if (hVarD != null) {
                return hVarD;
            }
            if (clsG.isEnum()) {
                return new l(clsG).nullSafe();
            }
            return null;
        }
    }

    public class d extends um.h<Boolean> {
        @Override // um.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean fromJson(um.m mVar) {
            return Boolean.valueOf(mVar.h());
        }

        @Override // um.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Boolean bool) {
            tVar.U(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    public class e extends um.h<Byte> {
        @Override // um.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte fromJson(um.m mVar) {
            return Byte.valueOf((byte) y.a(mVar, "a byte", -128, 255));
        }

        @Override // um.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Byte b) {
            tVar.H(b.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    public class f extends um.h<Character> {
        @Override // um.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character fromJson(um.m mVar) {
            String strR = mVar.r();
            if (strR.length() <= 1) {
                return Character.valueOf(strR.charAt(0));
            }
            throw new um.j(String.format("Expected %s but was %s at path %s", "a char", '\"' + strR + '\"', mVar.getPath()));
        }

        @Override // um.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Character ch2) {
            tVar.M(ch2.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    public class g extends um.h<Double> {
        @Override // um.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double fromJson(um.m mVar) {
            return Double.valueOf(mVar.j());
        }

        @Override // um.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Double d10) {
            tVar.F(d10.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    public class h extends um.h<Float> {
        @Override // um.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float fromJson(um.m mVar) {
            float fJ = (float) mVar.j();
            if (mVar.g() || !Float.isInfinite(fJ)) {
                return Float.valueOf(fJ);
            }
            throw new um.j("JSON forbids NaN and infinities: " + fJ + " at path " + mVar.getPath());
        }

        @Override // um.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Float f10) {
            f10.getClass();
            tVar.L(f10);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    public class i extends um.h<Integer> {
        @Override // um.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer fromJson(um.m mVar) {
            return Integer.valueOf(mVar.l());
        }

        @Override // um.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Integer num) {
            tVar.H(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    public class j extends um.h<Long> {
        @Override // um.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long fromJson(um.m mVar) {
            return Long.valueOf(mVar.m());
        }

        @Override // um.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Long l10) {
            tVar.H(l10.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    public class k extends um.h<Short> {
        @Override // um.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Short fromJson(um.m mVar) {
            return Short.valueOf((short) y.a(mVar, "a short", -32768, 32767));
        }

        @Override // um.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Short sh2) {
            tVar.H(sh2.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    public static final class l<T extends Enum<T>> extends um.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f32506a;
        public final String[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T[] f32507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final um.m.b f32508d;

        public l(Class<T> cls) {
            this.f32506a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f32507c = enumConstants;
                this.b = new String[enumConstants.length];
                int i10 = 0;
                while (true) {
                    T[] tArr = this.f32507c;
                    if (i10 >= tArr.length) {
                        this.f32508d = um.m.b.a(this.b);
                        return;
                    } else {
                        String strName = tArr[i10].name();
                        this.b[i10] = wm.c.m(strName, cls.getField(strName));
                        i10++;
                    }
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError("Missing field in " + cls.getName(), e10);
            }
        }

        @Override // um.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public T fromJson(um.m mVar) {
            int iH = mVar.H(this.f32508d);
            if (iH != -1) {
                return this.f32507c[iH];
            }
            String path = mVar.getPath();
            throw new um.j("Expected one of " + Arrays.asList(this.b) + " but was " + mVar.r() + " at path " + path);
        }

        @Override // um.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, T t8) {
            tVar.M(this.b[t8.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f32506a.getName() + ")";
        }
    }

    public static final class m extends um.h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f32509a;
        public final um.h<List> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final um.h<Map> f32510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final um.h<String> f32511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final um.h<Double> f32512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final um.h<Boolean> f32513f;

        public m(w wVar) {
            this.f32509a = wVar;
            this.b = wVar.c(List.class);
            this.f32510c = wVar.c(Map.class);
            this.f32511d = wVar.c(String.class);
            this.f32512e = wVar.c(Double.class);
            this.f32513f = wVar.c(Boolean.class);
        }

        public final Class<?> a(Class<?> cls) {
            if (Map.class.isAssignableFrom(cls)) {
                return Map.class;
            }
            return Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // um.h
        public Object fromJson(um.m mVar) {
            switch (b.f32505a[mVar.u().ordinal()]) {
                case 1:
                    return this.b.fromJson(mVar);
                case 2:
                    return this.f32510c.fromJson(mVar);
                case 3:
                    return this.f32511d.fromJson(mVar);
                case 4:
                    return this.f32512e.fromJson(mVar);
                case 5:
                    return this.f32513f.fromJson(mVar);
                case 6:
                    return mVar.o();
                default:
                    throw new IllegalStateException("Expected a value but was " + mVar.u() + " at path " + mVar.getPath());
            }
        }

        @Override // um.h
        public void toJson(t tVar, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls != Object.class) {
                this.f32509a.e(a(cls), wm.c.f34444a).toJson(tVar, obj);
            } else {
                tVar.c();
                tVar.g();
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    public static int a(um.m mVar, String str, int i10, int i11) {
        int iL = mVar.l();
        if (iL < i10 || iL > i11) {
            throw new um.j(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(iL), mVar.getPath()));
        }
        return iL;
    }
}

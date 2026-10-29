package p471um;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p522wm.C12494c;

/* JADX INFO: renamed from: um.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C11890y {

    /* JADX INFO: renamed from: a */
    public static final AbstractC11873h.e f42228a = new c();

    /* JADX INFO: renamed from: b */
    public static final AbstractC11873h<Boolean> f42229b = new d();

    /* JADX INFO: renamed from: c */
    public static final AbstractC11873h<Byte> f42230c = new e();

    /* JADX INFO: renamed from: d */
    public static final AbstractC11873h<Character> f42231d = new f();

    /* JADX INFO: renamed from: e */
    public static final AbstractC11873h<Double> f42232e = new g();

    /* JADX INFO: renamed from: f */
    public static final AbstractC11873h<Float> f42233f = new h();

    /* JADX INFO: renamed from: g */
    public static final AbstractC11873h<Integer> f42234g = new i();

    /* JADX INFO: renamed from: h */
    public static final AbstractC11873h<Long> f42235h = new j();

    /* JADX INFO: renamed from: i */
    public static final AbstractC11873h<Short> f42236i = new k();

    /* JADX INFO: renamed from: j */
    public static final AbstractC11873h<String> f42237j = new a();

    /* JADX INFO: renamed from: um.y$a */
    public class a extends AbstractC11873h<String> {
        /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String fromJson(AbstractC11878m abstractC11878m) {
            return abstractC11878m.mo44338r();
        }

        /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC11885t abstractC11885t, String str) {
            abstractC11885t.mo44367M(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* JADX INFO: renamed from: um.y$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f42238a;

        static {
            int[] iArr = new int[AbstractC11878m.c.values().length];
            f42238a = iArr;
            try {
                iArr[AbstractC11878m.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42238a[AbstractC11878m.c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42238a[AbstractC11878m.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42238a[AbstractC11878m.c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42238a[AbstractC11878m.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42238a[AbstractC11878m.c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: um.y$c */
    public class c implements AbstractC11873h.e {
        /* JADX DEBUG: Type inference failed for r2v4. Raw type applied. Possible types: um.h<T>, um.h<?> */
        @Override // p471um.AbstractC11873h.e
        public AbstractC11873h<?> create(Type type, Set<? extends Annotation> set, C11888w c11888w) throws NoSuchMethodException {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return C11890y.f42229b;
            }
            if (type == Byte.TYPE) {
                return C11890y.f42230c;
            }
            if (type == Character.TYPE) {
                return C11890y.f42231d;
            }
            if (type == Double.TYPE) {
                return C11890y.f42232e;
            }
            if (type == Float.TYPE) {
                return C11890y.f42233f;
            }
            if (type == Integer.TYPE) {
                return C11890y.f42234g;
            }
            if (type == Long.TYPE) {
                return C11890y.f42235h;
            }
            if (type == Short.TYPE) {
                return C11890y.f42236i;
            }
            if (type == Boolean.class) {
                return C11890y.f42229b.nullSafe();
            }
            if (type == Byte.class) {
                return C11890y.f42230c.nullSafe();
            }
            if (type == Character.class) {
                return C11890y.f42231d.nullSafe();
            }
            if (type == Double.class) {
                return C11890y.f42232e.nullSafe();
            }
            if (type == Float.class) {
                return C11890y.f42233f.nullSafe();
            }
            if (type == Integer.class) {
                return C11890y.f42234g.nullSafe();
            }
            if (type == Long.class) {
                return C11890y.f42235h.nullSafe();
            }
            if (type == Short.class) {
                return C11890y.f42236i.nullSafe();
            }
            if (type == String.class) {
                return C11890y.f42237j.nullSafe();
            }
            if (type == Object.class) {
                return new m(c11888w).nullSafe();
            }
            Class<?> clsM44295g = C11866a0.m44295g(type);
            AbstractC11873h<?> abstractC11873hM46791d = C12494c.m46791d(c11888w, type, clsM44295g);
            if (abstractC11873hM46791d != null) {
                return abstractC11873hM46791d;
            }
            if (clsM44295g.isEnum()) {
                return new l(clsM44295g).nullSafe();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: um.y$d */
    public class d extends AbstractC11873h<Boolean> {
        /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean fromJson(AbstractC11878m abstractC11878m) {
            return Boolean.valueOf(abstractC11878m.mo44331h());
        }

        /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC11885t abstractC11885t, Boolean bool) {
            abstractC11885t.mo44368U(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* JADX INFO: renamed from: um.y$e */
    public class e extends AbstractC11873h<Byte> {
        /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte fromJson(AbstractC11878m abstractC11878m) {
            return Byte.valueOf((byte) C11890y.m44450a(abstractC11878m, "a byte", -128, 255));
        }

        /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC11885t abstractC11885t, Byte b) {
            abstractC11885t.mo44364H(b.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* JADX INFO: renamed from: um.y$f */
    public class f extends AbstractC11873h<Character> {
        /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character fromJson(AbstractC11878m abstractC11878m) {
            String strMo44338r = abstractC11878m.mo44338r();
            if (strMo44338r.length() <= 1) {
                return Character.valueOf(strMo44338r.charAt(0));
            }
            throw new C11875j(String.format("Expected %s but was %s at path %s", "a char", '\"' + strMo44338r + '\"', abstractC11878m.getPath()));
        }

        /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC11885t abstractC11885t, Character ch2) {
            abstractC11885t.mo44367M(ch2.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* JADX INFO: renamed from: um.y$g */
    public class g extends AbstractC11873h<Double> {
        /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double fromJson(AbstractC11878m abstractC11878m) {
            return Double.valueOf(abstractC11878m.mo44332j());
        }

        /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC11885t abstractC11885t, Double d10) {
            abstractC11885t.mo44363F(d10.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* JADX INFO: renamed from: um.y$h */
    public class h extends AbstractC11873h<Float> {
        /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float fromJson(AbstractC11878m abstractC11878m) {
            float fMo44332j = (float) abstractC11878m.mo44332j();
            if (abstractC11878m.m44330g() || !Float.isInfinite(fMo44332j)) {
                return Float.valueOf(fMo44332j);
            }
            throw new C11875j("JSON forbids NaN and infinities: " + fMo44332j + " at path " + abstractC11878m.getPath());
        }

        /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC11885t abstractC11885t, Float f10) {
            f10.getClass();
            abstractC11885t.mo44366L(f10);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* JADX INFO: renamed from: um.y$i */
    public class i extends AbstractC11873h<Integer> {
        /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer fromJson(AbstractC11878m abstractC11878m) {
            return Integer.valueOf(abstractC11878m.mo44333l());
        }

        /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC11885t abstractC11885t, Integer num) {
            abstractC11885t.mo44364H(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* JADX INFO: renamed from: um.y$j */
    public class j extends AbstractC11873h<Long> {
        /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long fromJson(AbstractC11878m abstractC11878m) {
            return Long.valueOf(abstractC11878m.mo44334m());
        }

        /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC11885t abstractC11885t, Long l10) {
            abstractC11885t.mo44364H(l10.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* JADX INFO: renamed from: um.y$k */
    public class k extends AbstractC11873h<Short> {
        /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Short fromJson(AbstractC11878m abstractC11878m) {
            return Short.valueOf((short) C11890y.m44450a(abstractC11878m, "a short", -32768, 32767));
        }

        /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC11885t abstractC11885t, Short sh2) {
            abstractC11885t.mo44364H(sh2.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* JADX INFO: renamed from: um.y$l */
    public static final class l<T extends Enum<T>> extends AbstractC11873h<T> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f42239a;

        /* JADX INFO: renamed from: b */
        public final String[] f42240b;

        /* JADX INFO: renamed from: c */
        public final T[] f42241c;

        /* JADX INFO: renamed from: d */
        public final AbstractC11878m.b f42242d;

        public l(Class<T> cls) {
            this.f42239a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f42241c = enumConstants;
                this.f42240b = new String[enumConstants.length];
                int i10 = 0;
                while (true) {
                    T[] tArr = this.f42241c;
                    if (i10 >= tArr.length) {
                        this.f42242d = AbstractC11878m.b.m44343a(this.f42240b);
                        return;
                    } else {
                        String strName = tArr[i10].name();
                        this.f42240b[i10] = C12494c.m46800m(strName, cls.getField(strName));
                        i10++;
                    }
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError("Missing field in " + cls.getName(), e10);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public T fromJson(AbstractC11878m abstractC11878m) {
            int iMo44317H = abstractC11878m.mo44317H(this.f42242d);
            if (iMo44317H != -1) {
                return this.f42241c[iMo44317H];
            }
            String path = abstractC11878m.getPath();
            throw new C11875j("Expected one of " + Arrays.asList(this.f42240b) + " but was " + abstractC11878m.mo44338r() + " at path " + path);
        }

        /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
        @Override // p471um.AbstractC11873h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC11885t abstractC11885t, T t8) {
            abstractC11885t.mo44367M(this.f42240b[t8.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f42239a.getName() + ")";
        }
    }

    /* JADX INFO: renamed from: um.y$m */
    public static final class m extends AbstractC11873h<Object> {

        /* JADX INFO: renamed from: a */
        public final C11888w f42243a;

        /* JADX INFO: renamed from: b */
        public final AbstractC11873h<List> f42244b;

        /* JADX INFO: renamed from: c */
        public final AbstractC11873h<Map> f42245c;

        /* JADX INFO: renamed from: d */
        public final AbstractC11873h<String> f42246d;

        /* JADX INFO: renamed from: e */
        public final AbstractC11873h<Double> f42247e;

        /* JADX INFO: renamed from: f */
        public final AbstractC11873h<Boolean> f42248f;

        public m(C11888w c11888w) {
            this.f42243a = c11888w;
            this.f42244b = c11888w.m44436c(List.class);
            this.f42245c = c11888w.m44436c(Map.class);
            this.f42246d = c11888w.m44436c(String.class);
            this.f42247e = c11888w.m44436c(Double.class);
            this.f42248f = c11888w.m44436c(Boolean.class);
        }

        /* JADX INFO: renamed from: a */
        public final Class<?> m44471a(Class<?> cls) {
            if (Map.class.isAssignableFrom(cls)) {
                return Map.class;
            }
            return Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // p471um.AbstractC11873h
        public Object fromJson(AbstractC11878m abstractC11878m) {
            switch (b.f42238a[abstractC11878m.mo44339u().ordinal()]) {
                case 1:
                    return this.f42244b.fromJson(abstractC11878m);
                case 2:
                    return this.f42245c.fromJson(abstractC11878m);
                case 3:
                    return this.f42246d.fromJson(abstractC11878m);
                case 4:
                    return this.f42247e.fromJson(abstractC11878m);
                case 5:
                    return this.f42248f.fromJson(abstractC11878m);
                case 6:
                    return abstractC11878m.mo44336o();
                default:
                    throw new IllegalStateException("Expected a value but was " + abstractC11878m.mo44339u() + " at path " + abstractC11878m.getPath());
            }
        }

        @Override // p471um.AbstractC11873h
        public void toJson(AbstractC11885t abstractC11885t, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls != Object.class) {
                this.f42243a.m44438e(m44471a(cls), C12494c.f44656a).toJson(abstractC11885t, obj);
            } else {
                abstractC11885t.mo44374c();
                abstractC11885t.mo44378g();
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m44450a(AbstractC11878m abstractC11878m, String str, int i10, int i11) {
        int iMo44333l = abstractC11878m.mo44333l();
        if (iMo44333l < i10 || iMo44333l > i11) {
            throw new C11875j(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(iMo44333l), abstractC11878m.getPath()));
        }
        return iMo44333l;
    }
}

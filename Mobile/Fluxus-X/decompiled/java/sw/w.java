package sw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mv.f0;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f32048a;
    public final Method b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mv.z f32049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f32050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f32051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mv.y f32052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mv.b0 f32053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f32054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f32055i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f32056j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s<?>[] f32057k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f32058l;

    public static final class a {

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final Pattern f32059y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final Pattern f32060z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f32061a;
        public final Class<?> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f32062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Annotation[] f32063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Annotation[][] f32064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Type[] f32065f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f32066g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f32067h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f32068i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f32069j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f32070k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f32071l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f32072m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f32073n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f32074o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f32075p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f32076q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f32077r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public String f32078s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public mv.y f32079t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public mv.b0 f32080u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Set<String> f32081v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public s<?>[] f32082w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f32083x;

        public a(y yVar, Class<?> cls, Method method) {
            this.f32061a = yVar;
            this.b = cls;
            this.f32062c = method;
            this.f32063d = method.getAnnotations();
            this.f32065f = method.getGenericParameterTypes();
            this.f32064e = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        public static Set<String> h(String str) {
            Matcher matcher = f32059y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        public w b() {
            for (Annotation annotation : this.f32063d) {
                e(annotation);
            }
            if (this.f32074o == null) {
                throw c0.n(this.f32062c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f32075p) {
                if (this.f32077r) {
                    throw c0.n(this.f32062c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f32076q) {
                    throw c0.n(this.f32062c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f32064e.length;
            this.f32082w = new s[length];
            int i10 = length - 1;
            int i11 = 0;
            while (i11 < length) {
                this.f32082w[i11] = f(i11, this.f32065f[i11], this.f32064e[i11], i11 == i10);
                i11++;
            }
            if (this.f32078s == null && !this.f32073n) {
                throw c0.n(this.f32062c, "Missing either @%s URL or @Url parameter.", this.f32074o);
            }
            boolean z10 = this.f32076q;
            if (!z10 && !this.f32077r && !this.f32075p && this.f32068i) {
                throw c0.n(this.f32062c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z10 && !this.f32066g) {
                throw c0.n(this.f32062c, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f32077r || this.f32067h) {
                return new w(this);
            }
            throw c0.n(this.f32062c, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        public final mv.y c(String[] strArr, boolean z10) {
            mv.y.a aVar = new mv.y.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw c0.n(this.f32062c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f32080u = mv.b0.e(strTrim);
                    } catch (IllegalArgumentException e10) {
                        throw c0.o(this.f32062c, e10, "Malformed content type: %s", strTrim);
                    }
                } else if (z10) {
                    aVar.e(strSubstring, strTrim);
                } else {
                    aVar.a(strSubstring, strTrim);
                }
            }
            return aVar.f();
        }

        public final void d(String str, String str2, boolean z10) {
            String str3 = this.f32074o;
            if (str3 != null) {
                throw c0.n(this.f32062c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f32074o = str;
            this.f32075p = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f32059y.matcher(strSubstring).find()) {
                    throw c0.n(this.f32062c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f32078s = str2;
            this.f32081v = h(str2);
        }

        public final void e(Annotation annotation) {
            if (annotation instanceof vw.b) {
                d("DELETE", ((vw.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof vw.f) {
                d("GET", ((vw.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof vw.g) {
                d("HEAD", ((vw.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof vw.n) {
                d("PATCH", ((vw.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof vw.o) {
                d("POST", ((vw.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof vw.p) {
                d("PUT", ((vw.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof vw.m) {
                d("OPTIONS", ((vw.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof vw.h) {
                vw.h hVar = (vw.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof vw.k) {
                vw.k kVar = (vw.k) annotation;
                String[] strArrValue = kVar.value();
                if (strArrValue.length == 0) {
                    throw c0.n(this.f32062c, "@Headers annotation is empty.", new Object[0]);
                }
                this.f32079t = c(strArrValue, kVar.allowUnsafeNonAsciiValues());
                return;
            }
            if (annotation instanceof vw.l) {
                if (this.f32076q) {
                    throw c0.n(this.f32062c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f32077r = true;
            } else if (annotation instanceof vw.e) {
                if (this.f32077r) {
                    throw c0.n(this.f32062c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f32076q = true;
            }
        }

        public final s<?> f(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            s<?> sVar;
            if (annotationArr != null) {
                sVar = null;
                for (Annotation annotation : annotationArr) {
                    s<?> sVarG = g(i10, type, annotationArr, annotation);
                    if (sVarG != null) {
                        if (sVar != null) {
                            throw c0.p(this.f32062c, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        sVar = sVarG;
                    }
                }
            } else {
                sVar = null;
            }
            if (sVar != null) {
                return sVar;
            }
            if (z10) {
                try {
                    if (c0.h(type) == eu.b.class) {
                        this.f32083x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw c0.p(this.f32062c, i10, "No Retrofit annotation found.", new Object[0]);
        }

        public final s<?> g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof vw.y) {
                j(i10, type);
                if (this.f32073n) {
                    throw c0.p(this.f32062c, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f32069j) {
                    throw c0.p(this.f32062c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f32070k) {
                    throw c0.p(this.f32062c, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f32071l) {
                    throw c0.p(this.f32062c, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f32072m) {
                    throw c0.p(this.f32062c, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f32078s != null) {
                    throw c0.p(this.f32062c, i10, "@Url cannot be used with @%s URL", this.f32074o);
                }
                this.f32073n = true;
                if (type == mv.z.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new s.p(this.f32062c, i10);
                }
                throw c0.p(this.f32062c, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof vw.s) {
                j(i10, type);
                if (this.f32070k) {
                    throw c0.p(this.f32062c, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f32071l) {
                    throw c0.p(this.f32062c, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f32072m) {
                    throw c0.p(this.f32062c, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f32073n) {
                    throw c0.p(this.f32062c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f32078s == null) {
                    throw c0.p(this.f32062c, i10, "@Path can only be used with relative url on @%s", this.f32074o);
                }
                this.f32069j = true;
                vw.s sVar = (vw.s) annotation;
                String strValue = sVar.value();
                i(i10, strValue);
                return new s.k(this.f32062c, i10, strValue, this.f32061a.j(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof vw.t) {
                j(i10, type);
                vw.t tVar = (vw.t) annotation;
                String strValue2 = tVar.value();
                boolean zEncoded = tVar.encoded();
                Class<?> clsH = c0.h(type);
                this.f32070k = true;
                if (!Iterable.class.isAssignableFrom(clsH)) {
                    if (!clsH.isArray()) {
                        return new s.l(strValue2, this.f32061a.j(type, annotationArr), zEncoded);
                    }
                    return new s.l(strValue2, this.f32061a.j(a(clsH.getComponentType()), annotationArr), zEncoded).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.l(strValue2, this.f32061a.j(c0.g(0, (ParameterizedType) type), annotationArr), zEncoded).c();
                }
                throw c0.p(this.f32062c, i10, clsH.getSimpleName() + " must include generic type (e.g., " + clsH.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof vw.v) {
                j(i10, type);
                boolean zEncoded2 = ((vw.v) annotation).encoded();
                Class<?> clsH2 = c0.h(type);
                this.f32071l = true;
                if (!Iterable.class.isAssignableFrom(clsH2)) {
                    if (!clsH2.isArray()) {
                        return new s.n(this.f32061a.j(type, annotationArr), zEncoded2);
                    }
                    return new s.n(this.f32061a.j(a(clsH2.getComponentType()), annotationArr), zEncoded2).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.n(this.f32061a.j(c0.g(0, (ParameterizedType) type), annotationArr), zEncoded2).c();
                }
                throw c0.p(this.f32062c, i10, clsH2.getSimpleName() + " must include generic type (e.g., " + clsH2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof vw.u) {
                j(i10, type);
                Class<?> clsH3 = c0.h(type);
                this.f32072m = true;
                if (!Map.class.isAssignableFrom(clsH3)) {
                    throw c0.p(this.f32062c, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeI = c0.i(type, clsH3, Map.class);
                if (!(typeI instanceof ParameterizedType)) {
                    throw c0.p(this.f32062c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeI;
                Type typeG = c0.g(0, parameterizedType);
                if (String.class == typeG) {
                    return new s.m(this.f32062c, i10, this.f32061a.j(c0.g(1, parameterizedType), annotationArr), ((vw.u) annotation).encoded());
                }
                throw c0.p(this.f32062c, i10, "@QueryMap keys must be of type String: " + typeG, new Object[0]);
            }
            if (annotation instanceof vw.i) {
                j(i10, type);
                vw.i iVar = (vw.i) annotation;
                String strValue3 = iVar.value();
                Class<?> clsH4 = c0.h(type);
                if (!Iterable.class.isAssignableFrom(clsH4)) {
                    if (!clsH4.isArray()) {
                        return new s.f(strValue3, this.f32061a.j(type, annotationArr), iVar.allowUnsafeNonAsciiValues());
                    }
                    return new s.f(strValue3, this.f32061a.j(a(clsH4.getComponentType()), annotationArr), iVar.allowUnsafeNonAsciiValues()).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.f(strValue3, this.f32061a.j(c0.g(0, (ParameterizedType) type), annotationArr), iVar.allowUnsafeNonAsciiValues()).c();
                }
                throw c0.p(this.f32062c, i10, clsH4.getSimpleName() + " must include generic type (e.g., " + clsH4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof vw.j) {
                if (type == mv.y.class) {
                    return new s.h(this.f32062c, i10);
                }
                j(i10, type);
                Class<?> clsH5 = c0.h(type);
                if (!Map.class.isAssignableFrom(clsH5)) {
                    throw c0.p(this.f32062c, i10, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                }
                Type typeI2 = c0.i(type, clsH5, Map.class);
                if (!(typeI2 instanceof ParameterizedType)) {
                    throw c0.p(this.f32062c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                Type typeG2 = c0.g(0, parameterizedType2);
                if (String.class == typeG2) {
                    return new s.g(this.f32062c, i10, this.f32061a.j(c0.g(1, parameterizedType2), annotationArr), ((vw.j) annotation).allowUnsafeNonAsciiValues());
                }
                throw c0.p(this.f32062c, i10, "@HeaderMap keys must be of type String: " + typeG2, new Object[0]);
            }
            if (annotation instanceof vw.c) {
                j(i10, type);
                if (!this.f32076q) {
                    throw c0.p(this.f32062c, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                vw.c cVar = (vw.c) annotation;
                String strValue4 = cVar.value();
                boolean zEncoded3 = cVar.encoded();
                this.f32066g = true;
                Class<?> clsH6 = c0.h(type);
                if (!Iterable.class.isAssignableFrom(clsH6)) {
                    if (!clsH6.isArray()) {
                        return new s.d(strValue4, this.f32061a.j(type, annotationArr), zEncoded3);
                    }
                    return new s.d(strValue4, this.f32061a.j(a(clsH6.getComponentType()), annotationArr), zEncoded3).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.d(strValue4, this.f32061a.j(c0.g(0, (ParameterizedType) type), annotationArr), zEncoded3).c();
                }
                throw c0.p(this.f32062c, i10, clsH6.getSimpleName() + " must include generic type (e.g., " + clsH6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof vw.d) {
                j(i10, type);
                if (!this.f32076q) {
                    throw c0.p(this.f32062c, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsH7 = c0.h(type);
                if (!Map.class.isAssignableFrom(clsH7)) {
                    throw c0.p(this.f32062c, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeI3 = c0.i(type, clsH7, Map.class);
                if (!(typeI3 instanceof ParameterizedType)) {
                    throw c0.p(this.f32062c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                Type typeG3 = c0.g(0, parameterizedType3);
                if (String.class == typeG3) {
                    h hVarJ = this.f32061a.j(c0.g(1, parameterizedType3), annotationArr);
                    this.f32066g = true;
                    return new s.e(this.f32062c, i10, hVarJ, ((vw.d) annotation).encoded());
                }
                throw c0.p(this.f32062c, i10, "@FieldMap keys must be of type String: " + typeG3, new Object[0]);
            }
            if (!(annotation instanceof vw.q)) {
                if (annotation instanceof vw.r) {
                    j(i10, type);
                    if (!this.f32077r) {
                        throw c0.p(this.f32062c, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f32067h = true;
                    Class<?> clsH8 = c0.h(type);
                    if (!Map.class.isAssignableFrom(clsH8)) {
                        throw c0.p(this.f32062c, i10, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeI4 = c0.i(type, clsH8, Map.class);
                    if (!(typeI4 instanceof ParameterizedType)) {
                        throw c0.p(this.f32062c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                    Type typeG4 = c0.g(0, parameterizedType4);
                    if (String.class == typeG4) {
                        Type typeG5 = c0.g(1, parameterizedType4);
                        if (mv.c0.c.class.isAssignableFrom(c0.h(typeG5))) {
                            throw c0.p(this.f32062c, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new s.j(this.f32062c, i10, this.f32061a.h(typeG5, annotationArr, this.f32063d), ((vw.r) annotation).encoding());
                    }
                    throw c0.p(this.f32062c, i10, "@PartMap keys must be of type String: " + typeG4, new Object[0]);
                }
                if (annotation instanceof vw.a) {
                    j(i10, type);
                    if (this.f32076q || this.f32077r) {
                        throw c0.p(this.f32062c, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f32068i) {
                        throw c0.p(this.f32062c, i10, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        h hVarH = this.f32061a.h(type, annotationArr, this.f32063d);
                        this.f32068i = true;
                        return new s.c(this.f32062c, i10, hVarH);
                    } catch (RuntimeException e10) {
                        throw c0.q(this.f32062c, e10, i10, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof vw.x)) {
                    return null;
                }
                j(i10, type);
                Class<?> clsA = a(c0.h(type));
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    s<?> sVar2 = this.f32082w[i11];
                    if ((sVar2 instanceof s.q) && ((s.q) sVar2).f32031a.equals(clsA)) {
                        throw c0.p(this.f32062c, i10, "@Tag type " + clsA.getName() + " is duplicate of " + t.b.a(this.f32062c, i11) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new s.q(clsA);
            }
            j(i10, type);
            if (!this.f32077r) {
                throw c0.p(this.f32062c, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            vw.q qVar = (vw.q) annotation;
            this.f32067h = true;
            String strValue5 = qVar.value();
            Class<?> clsH9 = c0.h(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsH9)) {
                    if (clsH9.isArray()) {
                        if (mv.c0.c.class.isAssignableFrom(clsH9.getComponentType())) {
                            return s.o.f32029a.b();
                        }
                        throw c0.p(this.f32062c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (mv.c0.c.class.isAssignableFrom(clsH9)) {
                        return s.o.f32029a;
                    }
                    throw c0.p(this.f32062c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (mv.c0.c.class.isAssignableFrom(c0.h(c0.g(0, (ParameterizedType) type)))) {
                        return s.o.f32029a.c();
                    }
                    throw c0.p(this.f32062c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw c0.p(this.f32062c, i10, clsH9.getSimpleName() + " must include generic type (e.g., " + clsH9.getSimpleName() + "<String>)", new Object[0]);
            }
            mv.y yVarF = mv.y.f("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
            if (!Iterable.class.isAssignableFrom(clsH9)) {
                if (!clsH9.isArray()) {
                    if (mv.c0.c.class.isAssignableFrom(clsH9)) {
                        throw c0.p(this.f32062c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new s.i(this.f32062c, i10, yVarF, this.f32061a.h(type, annotationArr, this.f32063d));
                }
                Class<?> clsA2 = a(clsH9.getComponentType());
                if (mv.c0.c.class.isAssignableFrom(clsA2)) {
                    throw c0.p(this.f32062c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new s.i(this.f32062c, i10, yVarF, this.f32061a.h(clsA2, annotationArr, this.f32063d)).b();
            }
            if (type instanceof ParameterizedType) {
                Type typeG6 = c0.g(0, (ParameterizedType) type);
                if (mv.c0.c.class.isAssignableFrom(c0.h(typeG6))) {
                    throw c0.p(this.f32062c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new s.i(this.f32062c, i10, yVarF, this.f32061a.h(typeG6, annotationArr, this.f32063d)).c();
            }
            throw c0.p(this.f32062c, i10, clsH9.getSimpleName() + " must include generic type (e.g., " + clsH9.getSimpleName() + "<String>)", new Object[0]);
        }

        public final void i(int i10, String str) {
            if (!f32060z.matcher(str).matches()) {
                throw c0.p(this.f32062c, i10, "@Path parameter name must match %s. Found: %s", f32059y.pattern(), str);
            }
            if (!this.f32081v.contains(str)) {
                throw c0.p(this.f32062c, i10, "URL \"%s\" does not contain \"{%s}\".", this.f32078s, str);
            }
        }

        public final void j(int i10, Type type) {
            if (c0.j(type)) {
                throw c0.p(this.f32062c, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public w(a aVar) {
        this.f32048a = aVar.b;
        this.b = aVar.f32062c;
        this.f32049c = aVar.f32061a.f32087c;
        this.f32050d = aVar.f32074o;
        this.f32051e = aVar.f32078s;
        this.f32052f = aVar.f32079t;
        this.f32053g = aVar.f32080u;
        this.f32054h = aVar.f32075p;
        this.f32055i = aVar.f32076q;
        this.f32056j = aVar.f32077r;
        this.f32057k = aVar.f32082w;
        this.f32058l = aVar.f32083x;
    }

    public static w b(y yVar, Class<?> cls, Method method) {
        return new a(yVar, cls, method).b();
    }

    public f0 a(Object obj, Object[] objArr) {
        s<?>[] sVarArr = this.f32057k;
        int length = objArr.length;
        if (length != sVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + sVarArr.length + ")");
        }
        v vVar = new v(this.f32050d, this.f32049c, this.f32051e, this.f32052f, this.f32053g, this.f32054h, this.f32055i, this.f32056j);
        if (this.f32058l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            sVarArr[i10].a(vVar, objArr[i10]);
        }
        return vVar.k().r(o.class, new o(this.f32048a, obj, this.b, arrayList)).b();
    }
}

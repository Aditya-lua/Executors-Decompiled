package hv;

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
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f19949a;
    public final Method b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HttpUrl f19950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Headers f19953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MediaType f19954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19957j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s<?>[] f19958k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f19959l;

    public static final class a {

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final Pattern f19960y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final Pattern f19961z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f19962a;
        public final Class<?> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f19963c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Annotation[] f19964d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Annotation[][] f19965e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Type[] f19966f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f19967g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f19968h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f19969i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f19970j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f19971k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f19972l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f19973m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f19974n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f19975o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f19976p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f19977q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f19978r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public String f19979s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Headers f19980t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public MediaType f19981u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Set<String> f19982v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public s<?>[] f19983w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f19984x;

        public a(y yVar, Class<?> cls, Method method) {
            this.f19962a = yVar;
            this.b = cls;
            this.f19963c = method;
            this.f19964d = method.getAnnotations();
            this.f19966f = method.getGenericParameterTypes();
            this.f19965e = method.getParameterAnnotations();
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
            Matcher matcher = f19960y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        public w b() {
            for (Annotation annotation : this.f19964d) {
                e(annotation);
            }
            if (this.f19975o == null) {
                throw c0.n(this.f19963c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f19976p) {
                if (this.f19978r) {
                    throw c0.n(this.f19963c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f19977q) {
                    throw c0.n(this.f19963c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f19965e.length;
            this.f19983w = new s[length];
            int i10 = length - 1;
            int i11 = 0;
            while (i11 < length) {
                this.f19983w[i11] = f(i11, this.f19966f[i11], this.f19965e[i11], i11 == i10);
                i11++;
            }
            if (this.f19979s == null && !this.f19974n) {
                throw c0.n(this.f19963c, "Missing either @%s URL or @Url parameter.", this.f19975o);
            }
            boolean z10 = this.f19977q;
            if (!z10 && !this.f19978r && !this.f19976p && this.f19969i) {
                throw c0.n(this.f19963c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z10 && !this.f19967g) {
                throw c0.n(this.f19963c, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f19978r || this.f19968h) {
                return new w(this);
            }
            throw c0.n(this.f19963c, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        public final Headers c(String[] strArr, boolean z10) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw c0.n(this.f19963c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f19981u = MediaType.get(strTrim);
                    } catch (IllegalArgumentException e10) {
                        throw c0.o(this.f19963c, e10, "Malformed content type: %s", strTrim);
                    }
                } else if (z10) {
                    builder.addUnsafeNonAscii(strSubstring, strTrim);
                } else {
                    builder.add(strSubstring, strTrim);
                }
            }
            return builder.build();
        }

        public final void d(String str, String str2, boolean z10) {
            String str3 = this.f19975o;
            if (str3 != null) {
                throw c0.n(this.f19963c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f19975o = str;
            this.f19976p = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f19960y.matcher(strSubstring).find()) {
                    throw c0.n(this.f19963c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f19979s = str2;
            this.f19982v = h(str2);
        }

        public final void e(Annotation annotation) {
            if (annotation instanceof kv.b) {
                d("DELETE", ((kv.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof kv.f) {
                d("GET", ((kv.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof kv.g) {
                d("HEAD", ((kv.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof kv.n) {
                d("PATCH", ((kv.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof kv.o) {
                d("POST", ((kv.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof kv.p) {
                d("PUT", ((kv.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof kv.m) {
                d("OPTIONS", ((kv.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof kv.h) {
                kv.h hVar = (kv.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof kv.k) {
                kv.k kVar = (kv.k) annotation;
                String[] strArrValue = kVar.value();
                if (strArrValue.length == 0) {
                    throw c0.n(this.f19963c, "@Headers annotation is empty.", new Object[0]);
                }
                this.f19980t = c(strArrValue, kVar.allowUnsafeNonAsciiValues());
                return;
            }
            if (annotation instanceof kv.l) {
                if (this.f19977q) {
                    throw c0.n(this.f19963c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f19978r = true;
            } else if (annotation instanceof kv.e) {
                if (this.f19978r) {
                    throw c0.n(this.f19963c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f19977q = true;
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
                            throw c0.p(this.f19963c, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
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
                    if (c0.h(type) == lt.b.class) {
                        this.f19984x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw c0.p(this.f19963c, i10, "No Retrofit annotation found.", new Object[0]);
        }

        public final s<?> g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof kv.y) {
                j(i10, type);
                if (this.f19974n) {
                    throw c0.p(this.f19963c, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f19970j) {
                    throw c0.p(this.f19963c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f19971k) {
                    throw c0.p(this.f19963c, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f19972l) {
                    throw c0.p(this.f19963c, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f19973m) {
                    throw c0.p(this.f19963c, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f19979s != null) {
                    throw c0.p(this.f19963c, i10, "@Url cannot be used with @%s URL", this.f19975o);
                }
                this.f19974n = true;
                if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new s.p(this.f19963c, i10);
                }
                throw c0.p(this.f19963c, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof kv.s) {
                j(i10, type);
                if (this.f19971k) {
                    throw c0.p(this.f19963c, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f19972l) {
                    throw c0.p(this.f19963c, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f19973m) {
                    throw c0.p(this.f19963c, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f19974n) {
                    throw c0.p(this.f19963c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f19979s == null) {
                    throw c0.p(this.f19963c, i10, "@Path can only be used with relative url on @%s", this.f19975o);
                }
                this.f19970j = true;
                kv.s sVar = (kv.s) annotation;
                String strValue = sVar.value();
                i(i10, strValue);
                return new s.k(this.f19963c, i10, strValue, this.f19962a.j(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof kv.t) {
                j(i10, type);
                kv.t tVar = (kv.t) annotation;
                String strValue2 = tVar.value();
                boolean zEncoded = tVar.encoded();
                Class<?> clsH = c0.h(type);
                this.f19971k = true;
                if (!Iterable.class.isAssignableFrom(clsH)) {
                    if (!clsH.isArray()) {
                        return new s.l(strValue2, this.f19962a.j(type, annotationArr), zEncoded);
                    }
                    return new s.l(strValue2, this.f19962a.j(a(clsH.getComponentType()), annotationArr), zEncoded).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.l(strValue2, this.f19962a.j(c0.g(0, (ParameterizedType) type), annotationArr), zEncoded).c();
                }
                throw c0.p(this.f19963c, i10, clsH.getSimpleName() + " must include generic type (e.g., " + clsH.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof kv.v) {
                j(i10, type);
                boolean zEncoded2 = ((kv.v) annotation).encoded();
                Class<?> clsH2 = c0.h(type);
                this.f19972l = true;
                if (!Iterable.class.isAssignableFrom(clsH2)) {
                    if (!clsH2.isArray()) {
                        return new s.n(this.f19962a.j(type, annotationArr), zEncoded2);
                    }
                    return new s.n(this.f19962a.j(a(clsH2.getComponentType()), annotationArr), zEncoded2).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.n(this.f19962a.j(c0.g(0, (ParameterizedType) type), annotationArr), zEncoded2).c();
                }
                throw c0.p(this.f19963c, i10, clsH2.getSimpleName() + " must include generic type (e.g., " + clsH2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof kv.u) {
                j(i10, type);
                Class<?> clsH3 = c0.h(type);
                this.f19973m = true;
                if (!Map.class.isAssignableFrom(clsH3)) {
                    throw c0.p(this.f19963c, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeI = c0.i(type, clsH3, Map.class);
                if (!(typeI instanceof ParameterizedType)) {
                    throw c0.p(this.f19963c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeI;
                Type typeG = c0.g(0, parameterizedType);
                if (String.class == typeG) {
                    return new s.m(this.f19963c, i10, this.f19962a.j(c0.g(1, parameterizedType), annotationArr), ((kv.u) annotation).encoded());
                }
                throw c0.p(this.f19963c, i10, "@QueryMap keys must be of type String: " + typeG, new Object[0]);
            }
            if (annotation instanceof kv.i) {
                j(i10, type);
                kv.i iVar = (kv.i) annotation;
                String strValue3 = iVar.value();
                Class<?> clsH4 = c0.h(type);
                if (!Iterable.class.isAssignableFrom(clsH4)) {
                    if (!clsH4.isArray()) {
                        return new s.f(strValue3, this.f19962a.j(type, annotationArr), iVar.allowUnsafeNonAsciiValues());
                    }
                    return new s.f(strValue3, this.f19962a.j(a(clsH4.getComponentType()), annotationArr), iVar.allowUnsafeNonAsciiValues()).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.f(strValue3, this.f19962a.j(c0.g(0, (ParameterizedType) type), annotationArr), iVar.allowUnsafeNonAsciiValues()).c();
                }
                throw c0.p(this.f19963c, i10, clsH4.getSimpleName() + " must include generic type (e.g., " + clsH4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof kv.j) {
                if (type == Headers.class) {
                    return new s.h(this.f19963c, i10);
                }
                j(i10, type);
                Class<?> clsH5 = c0.h(type);
                if (!Map.class.isAssignableFrom(clsH5)) {
                    throw c0.p(this.f19963c, i10, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                }
                Type typeI2 = c0.i(type, clsH5, Map.class);
                if (!(typeI2 instanceof ParameterizedType)) {
                    throw c0.p(this.f19963c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                Type typeG2 = c0.g(0, parameterizedType2);
                if (String.class == typeG2) {
                    return new s.g(this.f19963c, i10, this.f19962a.j(c0.g(1, parameterizedType2), annotationArr), ((kv.j) annotation).allowUnsafeNonAsciiValues());
                }
                throw c0.p(this.f19963c, i10, "@HeaderMap keys must be of type String: " + typeG2, new Object[0]);
            }
            if (annotation instanceof kv.c) {
                j(i10, type);
                if (!this.f19977q) {
                    throw c0.p(this.f19963c, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                kv.c cVar = (kv.c) annotation;
                String strValue4 = cVar.value();
                boolean zEncoded3 = cVar.encoded();
                this.f19967g = true;
                Class<?> clsH6 = c0.h(type);
                if (!Iterable.class.isAssignableFrom(clsH6)) {
                    if (!clsH6.isArray()) {
                        return new s.d(strValue4, this.f19962a.j(type, annotationArr), zEncoded3);
                    }
                    return new s.d(strValue4, this.f19962a.j(a(clsH6.getComponentType()), annotationArr), zEncoded3).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.d(strValue4, this.f19962a.j(c0.g(0, (ParameterizedType) type), annotationArr), zEncoded3).c();
                }
                throw c0.p(this.f19963c, i10, clsH6.getSimpleName() + " must include generic type (e.g., " + clsH6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof kv.d) {
                j(i10, type);
                if (!this.f19977q) {
                    throw c0.p(this.f19963c, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsH7 = c0.h(type);
                if (!Map.class.isAssignableFrom(clsH7)) {
                    throw c0.p(this.f19963c, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeI3 = c0.i(type, clsH7, Map.class);
                if (!(typeI3 instanceof ParameterizedType)) {
                    throw c0.p(this.f19963c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                Type typeG3 = c0.g(0, parameterizedType3);
                if (String.class == typeG3) {
                    h hVarJ = this.f19962a.j(c0.g(1, parameterizedType3), annotationArr);
                    this.f19967g = true;
                    return new s.e(this.f19963c, i10, hVarJ, ((kv.d) annotation).encoded());
                }
                throw c0.p(this.f19963c, i10, "@FieldMap keys must be of type String: " + typeG3, new Object[0]);
            }
            if (!(annotation instanceof kv.q)) {
                if (annotation instanceof kv.r) {
                    j(i10, type);
                    if (!this.f19978r) {
                        throw c0.p(this.f19963c, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f19968h = true;
                    Class<?> clsH8 = c0.h(type);
                    if (!Map.class.isAssignableFrom(clsH8)) {
                        throw c0.p(this.f19963c, i10, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeI4 = c0.i(type, clsH8, Map.class);
                    if (!(typeI4 instanceof ParameterizedType)) {
                        throw c0.p(this.f19963c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                    Type typeG4 = c0.g(0, parameterizedType4);
                    if (String.class == typeG4) {
                        Type typeG5 = c0.g(1, parameterizedType4);
                        if (MultipartBody.Part.class.isAssignableFrom(c0.h(typeG5))) {
                            throw c0.p(this.f19963c, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new s.j(this.f19963c, i10, this.f19962a.h(typeG5, annotationArr, this.f19964d), ((kv.r) annotation).encoding());
                    }
                    throw c0.p(this.f19963c, i10, "@PartMap keys must be of type String: " + typeG4, new Object[0]);
                }
                if (annotation instanceof kv.a) {
                    j(i10, type);
                    if (this.f19977q || this.f19978r) {
                        throw c0.p(this.f19963c, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f19969i) {
                        throw c0.p(this.f19963c, i10, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        h hVarH = this.f19962a.h(type, annotationArr, this.f19964d);
                        this.f19969i = true;
                        return new s.c(this.f19963c, i10, hVarH);
                    } catch (RuntimeException e10) {
                        throw c0.q(this.f19963c, e10, i10, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof kv.x)) {
                    return null;
                }
                j(i10, type);
                Class<?> clsA = a(c0.h(type));
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    s<?> sVar2 = this.f19983w[i11];
                    if ((sVar2 instanceof s.q) && ((s.q) sVar2).f19933a.equals(clsA)) {
                        throw c0.p(this.f19963c, i10, "@Tag type " + clsA.getName() + " is duplicate of " + t.b.a(this.f19963c, i11) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new s.q(clsA);
            }
            j(i10, type);
            if (!this.f19978r) {
                throw c0.p(this.f19963c, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            kv.q qVar = (kv.q) annotation;
            this.f19968h = true;
            String strValue5 = qVar.value();
            Class<?> clsH9 = c0.h(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsH9)) {
                    if (clsH9.isArray()) {
                        if (MultipartBody.Part.class.isAssignableFrom(clsH9.getComponentType())) {
                            return s.o.f19931a.b();
                        }
                        throw c0.p(this.f19963c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (MultipartBody.Part.class.isAssignableFrom(clsH9)) {
                        return s.o.f19931a;
                    }
                    throw c0.p(this.f19963c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (MultipartBody.Part.class.isAssignableFrom(c0.h(c0.g(0, (ParameterizedType) type)))) {
                        return s.o.f19931a.c();
                    }
                    throw c0.p(this.f19963c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw c0.p(this.f19963c, i10, clsH9.getSimpleName() + " must include generic type (e.g., " + clsH9.getSimpleName() + "<String>)", new Object[0]);
            }
            Headers headersOf = Headers.of("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
            if (!Iterable.class.isAssignableFrom(clsH9)) {
                if (!clsH9.isArray()) {
                    if (MultipartBody.Part.class.isAssignableFrom(clsH9)) {
                        throw c0.p(this.f19963c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new s.i(this.f19963c, i10, headersOf, this.f19962a.h(type, annotationArr, this.f19964d));
                }
                Class<?> clsA2 = a(clsH9.getComponentType());
                if (MultipartBody.Part.class.isAssignableFrom(clsA2)) {
                    throw c0.p(this.f19963c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new s.i(this.f19963c, i10, headersOf, this.f19962a.h(clsA2, annotationArr, this.f19964d)).b();
            }
            if (type instanceof ParameterizedType) {
                Type typeG6 = c0.g(0, (ParameterizedType) type);
                if (MultipartBody.Part.class.isAssignableFrom(c0.h(typeG6))) {
                    throw c0.p(this.f19963c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new s.i(this.f19963c, i10, headersOf, this.f19962a.h(typeG6, annotationArr, this.f19964d)).c();
            }
            throw c0.p(this.f19963c, i10, clsH9.getSimpleName() + " must include generic type (e.g., " + clsH9.getSimpleName() + "<String>)", new Object[0]);
        }

        public final void i(int i10, String str) {
            if (!f19961z.matcher(str).matches()) {
                throw c0.p(this.f19963c, i10, "@Path parameter name must match %s. Found: %s", f19960y.pattern(), str);
            }
            if (!this.f19982v.contains(str)) {
                throw c0.p(this.f19963c, i10, "URL \"%s\" does not contain \"{%s}\".", this.f19979s, str);
            }
        }

        public final void j(int i10, Type type) {
            if (c0.j(type)) {
                throw c0.p(this.f19963c, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public w(a aVar) {
        this.f19949a = aVar.b;
        this.b = aVar.f19963c;
        this.f19950c = aVar.f19962a.f19988c;
        this.f19951d = aVar.f19975o;
        this.f19952e = aVar.f19979s;
        this.f19953f = aVar.f19980t;
        this.f19954g = aVar.f19981u;
        this.f19955h = aVar.f19976p;
        this.f19956i = aVar.f19977q;
        this.f19957j = aVar.f19978r;
        this.f19958k = aVar.f19983w;
        this.f19959l = aVar.f19984x;
    }

    public static w b(y yVar, Class<?> cls, Method method) {
        return new a(yVar, cls, method).b();
    }

    public Request a(Object obj, Object[] objArr) {
        s<?>[] sVarArr = this.f19958k;
        int length = objArr.length;
        if (length != sVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + sVarArr.length + ")");
        }
        v vVar = new v(this.f19951d, this.f19950c, this.f19952e, this.f19953f, this.f19954g, this.f19955h, this.f19956i, this.f19957j);
        if (this.f19959l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            sVarArr[i10].a(vVar, objArr[i10]);
        }
        return vVar.k().tag((Class<? super o>) o.class, new o(this.f19949a, obj, this.b, arrayList)).build();
    }
}

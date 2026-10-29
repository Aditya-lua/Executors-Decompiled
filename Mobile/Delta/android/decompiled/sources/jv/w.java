package jv;

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
    public final Class<?> f21939a;
    public final Method b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HttpUrl f21940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Headers f21943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MediaType f21944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f21945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f21947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s<?>[] f21948k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f21949l;

    public static final class a {

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final Pattern f21950y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final Pattern f21951z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f21952a;
        public final Class<?> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f21953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Annotation[] f21954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Annotation[][] f21955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Type[] f21956f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f21957g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f21958h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f21959i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f21960j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f21961k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f21962l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f21963m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f21964n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f21965o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f21966p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f21967q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f21968r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public String f21969s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Headers f21970t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public MediaType f21971u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Set<String> f21972v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public s<?>[] f21973w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f21974x;

        public a(y yVar, Class<?> cls, Method method) {
            this.f21952a = yVar;
            this.b = cls;
            this.f21953c = method;
            this.f21954d = method.getAnnotations();
            this.f21956f = method.getGenericParameterTypes();
            this.f21955e = method.getParameterAnnotations();
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
            Matcher matcher = f21950y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        public w b() {
            for (Annotation annotation : this.f21954d) {
                e(annotation);
            }
            if (this.f21965o == null) {
                throw c0.n(this.f21953c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f21966p) {
                if (this.f21968r) {
                    throw c0.n(this.f21953c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f21967q) {
                    throw c0.n(this.f21953c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f21955e.length;
            this.f21973w = new s[length];
            int i10 = length - 1;
            int i11 = 0;
            while (i11 < length) {
                this.f21973w[i11] = f(i11, this.f21956f[i11], this.f21955e[i11], i11 == i10);
                i11++;
            }
            if (this.f21969s == null && !this.f21964n) {
                throw c0.n(this.f21953c, "Missing either @%s URL or @Url parameter.", this.f21965o);
            }
            boolean z10 = this.f21967q;
            if (!z10 && !this.f21968r && !this.f21966p && this.f21959i) {
                throw c0.n(this.f21953c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z10 && !this.f21957g) {
                throw c0.n(this.f21953c, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f21968r || this.f21958h) {
                return new w(this);
            }
            throw c0.n(this.f21953c, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        public final Headers c(String[] strArr, boolean z10) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw c0.n(this.f21953c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f21971u = MediaType.get(strTrim);
                    } catch (IllegalArgumentException e10) {
                        throw c0.o(this.f21953c, e10, "Malformed content type: %s", strTrim);
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
            String str3 = this.f21965o;
            if (str3 != null) {
                throw c0.n(this.f21953c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f21965o = str;
            this.f21966p = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f21950y.matcher(strSubstring).find()) {
                    throw c0.n(this.f21953c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f21969s = str2;
            this.f21972v = h(str2);
        }

        public final void e(Annotation annotation) {
            if (annotation instanceof mv.b) {
                d("DELETE", ((mv.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof mv.f) {
                d("GET", ((mv.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof mv.g) {
                d("HEAD", ((mv.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof mv.n) {
                d("PATCH", ((mv.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof mv.o) {
                d("POST", ((mv.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof mv.p) {
                d("PUT", ((mv.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof mv.m) {
                d("OPTIONS", ((mv.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof mv.h) {
                mv.h hVar = (mv.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof mv.k) {
                mv.k kVar = (mv.k) annotation;
                String[] strArrValue = kVar.value();
                if (strArrValue.length == 0) {
                    throw c0.n(this.f21953c, "@Headers annotation is empty.", new Object[0]);
                }
                this.f21970t = c(strArrValue, kVar.allowUnsafeNonAsciiValues());
                return;
            }
            if (annotation instanceof mv.l) {
                if (this.f21967q) {
                    throw c0.n(this.f21953c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f21968r = true;
            } else if (annotation instanceof mv.e) {
                if (this.f21968r) {
                    throw c0.n(this.f21953c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f21967q = true;
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
                            throw c0.p(this.f21953c, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
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
                    if (c0.h(type) == nt.b.class) {
                        this.f21974x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw c0.p(this.f21953c, i10, "No Retrofit annotation found.", new Object[0]);
        }

        public final s<?> g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof mv.y) {
                j(i10, type);
                if (this.f21964n) {
                    throw c0.p(this.f21953c, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f21960j) {
                    throw c0.p(this.f21953c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f21961k) {
                    throw c0.p(this.f21953c, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f21962l) {
                    throw c0.p(this.f21953c, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f21963m) {
                    throw c0.p(this.f21953c, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f21969s != null) {
                    throw c0.p(this.f21953c, i10, "@Url cannot be used with @%s URL", this.f21965o);
                }
                this.f21964n = true;
                if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new s.p(this.f21953c, i10);
                }
                throw c0.p(this.f21953c, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof mv.s) {
                j(i10, type);
                if (this.f21961k) {
                    throw c0.p(this.f21953c, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f21962l) {
                    throw c0.p(this.f21953c, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f21963m) {
                    throw c0.p(this.f21953c, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f21964n) {
                    throw c0.p(this.f21953c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f21969s == null) {
                    throw c0.p(this.f21953c, i10, "@Path can only be used with relative url on @%s", this.f21965o);
                }
                this.f21960j = true;
                mv.s sVar = (mv.s) annotation;
                String strValue = sVar.value();
                i(i10, strValue);
                return new s.k(this.f21953c, i10, strValue, this.f21952a.j(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof mv.t) {
                j(i10, type);
                mv.t tVar = (mv.t) annotation;
                String strValue2 = tVar.value();
                boolean zEncoded = tVar.encoded();
                Class<?> clsH = c0.h(type);
                this.f21961k = true;
                if (!Iterable.class.isAssignableFrom(clsH)) {
                    if (!clsH.isArray()) {
                        return new s.l(strValue2, this.f21952a.j(type, annotationArr), zEncoded);
                    }
                    return new s.l(strValue2, this.f21952a.j(a(clsH.getComponentType()), annotationArr), zEncoded).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.l(strValue2, this.f21952a.j(c0.g(0, (ParameterizedType) type), annotationArr), zEncoded).c();
                }
                throw c0.p(this.f21953c, i10, clsH.getSimpleName() + " must include generic type (e.g., " + clsH.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof mv.v) {
                j(i10, type);
                boolean zEncoded2 = ((mv.v) annotation).encoded();
                Class<?> clsH2 = c0.h(type);
                this.f21962l = true;
                if (!Iterable.class.isAssignableFrom(clsH2)) {
                    if (!clsH2.isArray()) {
                        return new s.n(this.f21952a.j(type, annotationArr), zEncoded2);
                    }
                    return new s.n(this.f21952a.j(a(clsH2.getComponentType()), annotationArr), zEncoded2).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.n(this.f21952a.j(c0.g(0, (ParameterizedType) type), annotationArr), zEncoded2).c();
                }
                throw c0.p(this.f21953c, i10, clsH2.getSimpleName() + " must include generic type (e.g., " + clsH2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof mv.u) {
                j(i10, type);
                Class<?> clsH3 = c0.h(type);
                this.f21963m = true;
                if (!Map.class.isAssignableFrom(clsH3)) {
                    throw c0.p(this.f21953c, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeI = c0.i(type, clsH3, Map.class);
                if (!(typeI instanceof ParameterizedType)) {
                    throw c0.p(this.f21953c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeI;
                Type typeG = c0.g(0, parameterizedType);
                if (String.class == typeG) {
                    return new s.m(this.f21953c, i10, this.f21952a.j(c0.g(1, parameterizedType), annotationArr), ((mv.u) annotation).encoded());
                }
                throw c0.p(this.f21953c, i10, "@QueryMap keys must be of type String: " + typeG, new Object[0]);
            }
            if (annotation instanceof mv.i) {
                j(i10, type);
                mv.i iVar = (mv.i) annotation;
                String strValue3 = iVar.value();
                Class<?> clsH4 = c0.h(type);
                if (!Iterable.class.isAssignableFrom(clsH4)) {
                    if (!clsH4.isArray()) {
                        return new s.f(strValue3, this.f21952a.j(type, annotationArr), iVar.allowUnsafeNonAsciiValues());
                    }
                    return new s.f(strValue3, this.f21952a.j(a(clsH4.getComponentType()), annotationArr), iVar.allowUnsafeNonAsciiValues()).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.f(strValue3, this.f21952a.j(c0.g(0, (ParameterizedType) type), annotationArr), iVar.allowUnsafeNonAsciiValues()).c();
                }
                throw c0.p(this.f21953c, i10, clsH4.getSimpleName() + " must include generic type (e.g., " + clsH4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof mv.j) {
                if (type == Headers.class) {
                    return new s.h(this.f21953c, i10);
                }
                j(i10, type);
                Class<?> clsH5 = c0.h(type);
                if (!Map.class.isAssignableFrom(clsH5)) {
                    throw c0.p(this.f21953c, i10, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                }
                Type typeI2 = c0.i(type, clsH5, Map.class);
                if (!(typeI2 instanceof ParameterizedType)) {
                    throw c0.p(this.f21953c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                Type typeG2 = c0.g(0, parameterizedType2);
                if (String.class == typeG2) {
                    return new s.g(this.f21953c, i10, this.f21952a.j(c0.g(1, parameterizedType2), annotationArr), ((mv.j) annotation).allowUnsafeNonAsciiValues());
                }
                throw c0.p(this.f21953c, i10, "@HeaderMap keys must be of type String: " + typeG2, new Object[0]);
            }
            if (annotation instanceof mv.c) {
                j(i10, type);
                if (!this.f21967q) {
                    throw c0.p(this.f21953c, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                mv.c cVar = (mv.c) annotation;
                String strValue4 = cVar.value();
                boolean zEncoded3 = cVar.encoded();
                this.f21957g = true;
                Class<?> clsH6 = c0.h(type);
                if (!Iterable.class.isAssignableFrom(clsH6)) {
                    if (!clsH6.isArray()) {
                        return new s.d(strValue4, this.f21952a.j(type, annotationArr), zEncoded3);
                    }
                    return new s.d(strValue4, this.f21952a.j(a(clsH6.getComponentType()), annotationArr), zEncoded3).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.d(strValue4, this.f21952a.j(c0.g(0, (ParameterizedType) type), annotationArr), zEncoded3).c();
                }
                throw c0.p(this.f21953c, i10, clsH6.getSimpleName() + " must include generic type (e.g., " + clsH6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof mv.d) {
                j(i10, type);
                if (!this.f21967q) {
                    throw c0.p(this.f21953c, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsH7 = c0.h(type);
                if (!Map.class.isAssignableFrom(clsH7)) {
                    throw c0.p(this.f21953c, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeI3 = c0.i(type, clsH7, Map.class);
                if (!(typeI3 instanceof ParameterizedType)) {
                    throw c0.p(this.f21953c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                Type typeG3 = c0.g(0, parameterizedType3);
                if (String.class == typeG3) {
                    h hVarJ = this.f21952a.j(c0.g(1, parameterizedType3), annotationArr);
                    this.f21957g = true;
                    return new s.e(this.f21953c, i10, hVarJ, ((mv.d) annotation).encoded());
                }
                throw c0.p(this.f21953c, i10, "@FieldMap keys must be of type String: " + typeG3, new Object[0]);
            }
            if (!(annotation instanceof mv.q)) {
                if (annotation instanceof mv.r) {
                    j(i10, type);
                    if (!this.f21968r) {
                        throw c0.p(this.f21953c, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f21958h = true;
                    Class<?> clsH8 = c0.h(type);
                    if (!Map.class.isAssignableFrom(clsH8)) {
                        throw c0.p(this.f21953c, i10, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeI4 = c0.i(type, clsH8, Map.class);
                    if (!(typeI4 instanceof ParameterizedType)) {
                        throw c0.p(this.f21953c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                    Type typeG4 = c0.g(0, parameterizedType4);
                    if (String.class == typeG4) {
                        Type typeG5 = c0.g(1, parameterizedType4);
                        if (MultipartBody.Part.class.isAssignableFrom(c0.h(typeG5))) {
                            throw c0.p(this.f21953c, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new s.j(this.f21953c, i10, this.f21952a.h(typeG5, annotationArr, this.f21954d), ((mv.r) annotation).encoding());
                    }
                    throw c0.p(this.f21953c, i10, "@PartMap keys must be of type String: " + typeG4, new Object[0]);
                }
                if (annotation instanceof mv.a) {
                    j(i10, type);
                    if (this.f21967q || this.f21968r) {
                        throw c0.p(this.f21953c, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f21959i) {
                        throw c0.p(this.f21953c, i10, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        h hVarH = this.f21952a.h(type, annotationArr, this.f21954d);
                        this.f21959i = true;
                        return new s.c(this.f21953c, i10, hVarH);
                    } catch (RuntimeException e10) {
                        throw c0.q(this.f21953c, e10, i10, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof mv.x)) {
                    return null;
                }
                j(i10, type);
                Class<?> clsA = a(c0.h(type));
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    s<?> sVar2 = this.f21973w[i11];
                    if ((sVar2 instanceof s.q) && ((s.q) sVar2).f21923a.equals(clsA)) {
                        throw c0.p(this.f21953c, i10, "@Tag type " + clsA.getName() + " is duplicate of " + t.b.a(this.f21953c, i11) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new s.q(clsA);
            }
            j(i10, type);
            if (!this.f21968r) {
                throw c0.p(this.f21953c, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            mv.q qVar = (mv.q) annotation;
            this.f21958h = true;
            String strValue5 = qVar.value();
            Class<?> clsH9 = c0.h(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsH9)) {
                    if (clsH9.isArray()) {
                        if (MultipartBody.Part.class.isAssignableFrom(clsH9.getComponentType())) {
                            return s.o.f21921a.b();
                        }
                        throw c0.p(this.f21953c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (MultipartBody.Part.class.isAssignableFrom(clsH9)) {
                        return s.o.f21921a;
                    }
                    throw c0.p(this.f21953c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (MultipartBody.Part.class.isAssignableFrom(c0.h(c0.g(0, (ParameterizedType) type)))) {
                        return s.o.f21921a.c();
                    }
                    throw c0.p(this.f21953c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw c0.p(this.f21953c, i10, clsH9.getSimpleName() + " must include generic type (e.g., " + clsH9.getSimpleName() + "<String>)", new Object[0]);
            }
            Headers headersOf = Headers.of("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
            if (!Iterable.class.isAssignableFrom(clsH9)) {
                if (!clsH9.isArray()) {
                    if (MultipartBody.Part.class.isAssignableFrom(clsH9)) {
                        throw c0.p(this.f21953c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new s.i(this.f21953c, i10, headersOf, this.f21952a.h(type, annotationArr, this.f21954d));
                }
                Class<?> clsA2 = a(clsH9.getComponentType());
                if (MultipartBody.Part.class.isAssignableFrom(clsA2)) {
                    throw c0.p(this.f21953c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new s.i(this.f21953c, i10, headersOf, this.f21952a.h(clsA2, annotationArr, this.f21954d)).b();
            }
            if (type instanceof ParameterizedType) {
                Type typeG6 = c0.g(0, (ParameterizedType) type);
                if (MultipartBody.Part.class.isAssignableFrom(c0.h(typeG6))) {
                    throw c0.p(this.f21953c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new s.i(this.f21953c, i10, headersOf, this.f21952a.h(typeG6, annotationArr, this.f21954d)).c();
            }
            throw c0.p(this.f21953c, i10, clsH9.getSimpleName() + " must include generic type (e.g., " + clsH9.getSimpleName() + "<String>)", new Object[0]);
        }

        public final void i(int i10, String str) {
            if (!f21951z.matcher(str).matches()) {
                throw c0.p(this.f21953c, i10, "@Path parameter name must match %s. Found: %s", f21950y.pattern(), str);
            }
            if (!this.f21972v.contains(str)) {
                throw c0.p(this.f21953c, i10, "URL \"%s\" does not contain \"{%s}\".", this.f21969s, str);
            }
        }

        public final void j(int i10, Type type) {
            if (c0.j(type)) {
                throw c0.p(this.f21953c, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public w(a aVar) {
        this.f21939a = aVar.b;
        this.b = aVar.f21953c;
        this.f21940c = aVar.f21952a.f21978c;
        this.f21941d = aVar.f21965o;
        this.f21942e = aVar.f21969s;
        this.f21943f = aVar.f21970t;
        this.f21944g = aVar.f21971u;
        this.f21945h = aVar.f21966p;
        this.f21946i = aVar.f21967q;
        this.f21947j = aVar.f21968r;
        this.f21948k = aVar.f21973w;
        this.f21949l = aVar.f21974x;
    }

    public static w b(y yVar, Class<?> cls, Method method) {
        return new a(yVar, cls, method).b();
    }

    public Request a(Object obj, Object[] objArr) {
        s<?>[] sVarArr = this.f21948k;
        int length = objArr.length;
        if (length != sVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + sVarArr.length + ")");
        }
        v vVar = new v(this.f21941d, this.f21940c, this.f21942e, this.f21943f, this.f21944g, this.f21945h, this.f21946i, this.f21947j);
        if (this.f21949l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            sVarArr[i10].a(vVar, objArr[i10]);
        }
        return vVar.k().tag((Class<? super o>) o.class, new o(this.f21939a, obj, this.b, arrayList)).build();
    }
}

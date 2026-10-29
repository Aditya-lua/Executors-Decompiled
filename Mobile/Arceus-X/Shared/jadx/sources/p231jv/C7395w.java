package p231jv;

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
import mv.InterfaceC8692a;
import mv.InterfaceC8693b;
import mv.InterfaceC8694c;
import mv.InterfaceC8695d;
import mv.InterfaceC8696e;
import mv.InterfaceC8697f;
import mv.InterfaceC8698g;
import mv.InterfaceC8699h;
import mv.InterfaceC8700i;
import mv.InterfaceC8701j;
import mv.InterfaceC8702k;
import mv.InterfaceC8703l;
import mv.InterfaceC8704m;
import mv.InterfaceC8705n;
import mv.InterfaceC8706o;
import mv.InterfaceC8707p;
import mv.InterfaceC8708q;
import mv.InterfaceC8709r;
import mv.InterfaceC8710s;
import mv.InterfaceC8711t;
import mv.InterfaceC8712u;
import mv.InterfaceC8713v;
import mv.InterfaceC8715x;
import mv.InterfaceC8716y;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: jv.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C7395w {

    /* JADX INFO: renamed from: a */
    public final Class<?> f28425a;

    /* JADX INFO: renamed from: b */
    public final Method f28426b;

    /* JADX INFO: renamed from: c */
    public final HttpUrl f28427c;

    /* JADX INFO: renamed from: d */
    public final String f28428d;

    /* JADX INFO: renamed from: e */
    public final String f28429e;

    /* JADX INFO: renamed from: f */
    public final Headers f28430f;

    /* JADX INFO: renamed from: g */
    public final MediaType f28431g;

    /* JADX INFO: renamed from: h */
    public final boolean f28432h;

    /* JADX INFO: renamed from: i */
    public final boolean f28433i;

    /* JADX INFO: renamed from: j */
    public final boolean f28434j;

    /* JADX INFO: renamed from: k */
    public final AbstractC7391s<?>[] f28435k;

    /* JADX INFO: renamed from: l */
    public final boolean f28436l;

    /* JADX INFO: renamed from: jv.w$a */
    public static final class a {

        /* JADX INFO: renamed from: y */
        public static final Pattern f28437y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: z */
        public static final Pattern f28438z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: a */
        public final C7397y f28439a;

        /* JADX INFO: renamed from: b */
        public final Class<?> f28440b;

        /* JADX INFO: renamed from: c */
        public final Method f28441c;

        /* JADX INFO: renamed from: d */
        public final Annotation[] f28442d;

        /* JADX INFO: renamed from: e */
        public final Annotation[][] f28443e;

        /* JADX INFO: renamed from: f */
        public final Type[] f28444f;

        /* JADX INFO: renamed from: g */
        public boolean f28445g;

        /* JADX INFO: renamed from: h */
        public boolean f28446h;

        /* JADX INFO: renamed from: i */
        public boolean f28447i;

        /* JADX INFO: renamed from: j */
        public boolean f28448j;

        /* JADX INFO: renamed from: k */
        public boolean f28449k;

        /* JADX INFO: renamed from: l */
        public boolean f28450l;

        /* JADX INFO: renamed from: m */
        public boolean f28451m;

        /* JADX INFO: renamed from: n */
        public boolean f28452n;

        /* JADX INFO: renamed from: o */
        public String f28453o;

        /* JADX INFO: renamed from: p */
        public boolean f28454p;

        /* JADX INFO: renamed from: q */
        public boolean f28455q;

        /* JADX INFO: renamed from: r */
        public boolean f28456r;

        /* JADX INFO: renamed from: s */
        public String f28457s;

        /* JADX INFO: renamed from: t */
        public Headers f28458t;

        /* JADX INFO: renamed from: u */
        public MediaType f28459u;

        /* JADX INFO: renamed from: v */
        public Set<String> f28460v;

        /* JADX INFO: renamed from: w */
        public AbstractC7391s<?>[] f28461w;

        /* JADX INFO: renamed from: x */
        public boolean f28462x;

        public a(C7397y c7397y, Class<?> cls, Method method) {
            this.f28439a = c7397y;
            this.f28440b = cls;
            this.f28441c = method;
            this.f28442d = method.getAnnotations();
            this.f28444f = method.getGenericParameterTypes();
            this.f28443e = method.getParameterAnnotations();
        }

        /* JADX INFO: renamed from: a */
        public static Class<?> m30639a(Class<?> cls) {
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

        /* JADX INFO: renamed from: h */
        public static Set<String> m30640h(String str) {
            Matcher matcher = f28437y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* JADX INFO: renamed from: b */
        public C7395w m30641b() {
            for (Annotation annotation : this.f28442d) {
                m30644e(annotation);
            }
            if (this.f28453o == null) {
                throw C7375c0.m30563n(this.f28441c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f28454p) {
                if (this.f28456r) {
                    throw C7375c0.m30563n(this.f28441c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f28455q) {
                    throw C7375c0.m30563n(this.f28441c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f28443e.length;
            this.f28461w = new AbstractC7391s[length];
            int i10 = length - 1;
            int i11 = 0;
            while (i11 < length) {
                this.f28461w[i11] = m30645f(i11, this.f28444f[i11], this.f28443e[i11], i11 == i10);
                i11++;
            }
            if (this.f28457s == null && !this.f28452n) {
                throw C7375c0.m30563n(this.f28441c, "Missing either @%s URL or @Url parameter.", this.f28453o);
            }
            boolean z10 = this.f28455q;
            if (!z10 && !this.f28456r && !this.f28454p && this.f28447i) {
                throw C7375c0.m30563n(this.f28441c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z10 && !this.f28445g) {
                throw C7375c0.m30563n(this.f28441c, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f28456r || this.f28446h) {
                return new C7395w(this);
            }
            throw C7375c0.m30563n(this.f28441c, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        /* JADX INFO: renamed from: c */
        public final Headers m30642c(String[] strArr, boolean z10) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw C7375c0.m30563n(this.f28441c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f28459u = MediaType.get(strTrim);
                    } catch (IllegalArgumentException e10) {
                        throw C7375c0.m30564o(this.f28441c, e10, "Malformed content type: %s", strTrim);
                    }
                } else if (z10) {
                    builder.addUnsafeNonAscii(strSubstring, strTrim);
                } else {
                    builder.add(strSubstring, strTrim);
                }
            }
            return builder.build();
        }

        /* JADX INFO: renamed from: d */
        public final void m30643d(String str, String str2, boolean z10) {
            String str3 = this.f28453o;
            if (str3 != null) {
                throw C7375c0.m30563n(this.f28441c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f28453o = str;
            this.f28454p = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f28437y.matcher(strSubstring).find()) {
                    throw C7375c0.m30563n(this.f28441c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f28457s = str2;
            this.f28460v = m30640h(str2);
        }

        /* JADX INFO: renamed from: e */
        public final void m30644e(Annotation annotation) {
            if (annotation instanceof InterfaceC8693b) {
                m30643d("DELETE", ((InterfaceC8693b) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC8697f) {
                m30643d("GET", ((InterfaceC8697f) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC8698g) {
                m30643d("HEAD", ((InterfaceC8698g) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC8705n) {
                m30643d("PATCH", ((InterfaceC8705n) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC8706o) {
                m30643d("POST", ((InterfaceC8706o) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC8707p) {
                m30643d("PUT", ((InterfaceC8707p) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC8704m) {
                m30643d("OPTIONS", ((InterfaceC8704m) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC8699h) {
                InterfaceC8699h interfaceC8699h = (InterfaceC8699h) annotation;
                m30643d(interfaceC8699h.method(), interfaceC8699h.path(), interfaceC8699h.hasBody());
                return;
            }
            if (annotation instanceof InterfaceC8702k) {
                InterfaceC8702k interfaceC8702k = (InterfaceC8702k) annotation;
                String[] strArrValue = interfaceC8702k.value();
                if (strArrValue.length == 0) {
                    throw C7375c0.m30563n(this.f28441c, "@Headers annotation is empty.", new Object[0]);
                }
                this.f28458t = m30642c(strArrValue, interfaceC8702k.allowUnsafeNonAsciiValues());
                return;
            }
            if (annotation instanceof InterfaceC8703l) {
                if (this.f28455q) {
                    throw C7375c0.m30563n(this.f28441c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f28456r = true;
            } else if (annotation instanceof InterfaceC8696e) {
                if (this.f28456r) {
                    throw C7375c0.m30563n(this.f28441c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f28455q = true;
            }
        }

        /* JADX INFO: renamed from: f */
        public final AbstractC7391s<?> m30645f(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            AbstractC7391s<?> abstractC7391s;
            if (annotationArr != null) {
                abstractC7391s = null;
                for (Annotation annotation : annotationArr) {
                    AbstractC7391s<?> abstractC7391sM30646g = m30646g(i10, type, annotationArr, annotation);
                    if (abstractC7391sM30646g != null) {
                        if (abstractC7391s != null) {
                            throw C7375c0.m30565p(this.f28441c, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        abstractC7391s = abstractC7391sM30646g;
                    }
                }
            } else {
                abstractC7391s = null;
            }
            if (abstractC7391s != null) {
                return abstractC7391s;
            }
            if (z10) {
                try {
                    if (C7375c0.m30557h(type) == InterfaceC9557b.class) {
                        this.f28462x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw C7375c0.m30565p(this.f28441c, i10, "No Retrofit annotation found.", new Object[0]);
        }

        /* JADX INFO: renamed from: g */
        public final AbstractC7391s<?> m30646g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof InterfaceC8716y) {
                m30648j(i10, type);
                if (this.f28452n) {
                    throw C7375c0.m30565p(this.f28441c, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f28448j) {
                    throw C7375c0.m30565p(this.f28441c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f28449k) {
                    throw C7375c0.m30565p(this.f28441c, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f28450l) {
                    throw C7375c0.m30565p(this.f28441c, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f28451m) {
                    throw C7375c0.m30565p(this.f28441c, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f28457s != null) {
                    throw C7375c0.m30565p(this.f28441c, i10, "@Url cannot be used with @%s URL", this.f28453o);
                }
                this.f28452n = true;
                if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new AbstractC7391s.p(this.f28441c, i10);
                }
                throw C7375c0.m30565p(this.f28441c, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof InterfaceC8710s) {
                m30648j(i10, type);
                if (this.f28449k) {
                    throw C7375c0.m30565p(this.f28441c, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f28450l) {
                    throw C7375c0.m30565p(this.f28441c, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f28451m) {
                    throw C7375c0.m30565p(this.f28441c, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f28452n) {
                    throw C7375c0.m30565p(this.f28441c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f28457s == null) {
                    throw C7375c0.m30565p(this.f28441c, i10, "@Path can only be used with relative url on @%s", this.f28453o);
                }
                this.f28448j = true;
                InterfaceC8710s interfaceC8710s = (InterfaceC8710s) annotation;
                String strValue = interfaceC8710s.value();
                m30647i(i10, strValue);
                return new AbstractC7391s.k(this.f28441c, i10, strValue, this.f28439a.m30668j(type, annotationArr), interfaceC8710s.encoded());
            }
            if (annotation instanceof InterfaceC8711t) {
                m30648j(i10, type);
                InterfaceC8711t interfaceC8711t = (InterfaceC8711t) annotation;
                String strValue2 = interfaceC8711t.value();
                boolean zEncoded = interfaceC8711t.encoded();
                Class<?> clsM30557h = C7375c0.m30557h(type);
                this.f28449k = true;
                if (!Iterable.class.isAssignableFrom(clsM30557h)) {
                    if (!clsM30557h.isArray()) {
                        return new AbstractC7391s.l(strValue2, this.f28439a.m30668j(type, annotationArr), zEncoded);
                    }
                    return new AbstractC7391s.l(strValue2, this.f28439a.m30668j(m30639a(clsM30557h.getComponentType()), annotationArr), zEncoded).m30612b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC7391s.l(strValue2, this.f28439a.m30668j(C7375c0.m30556g(0, (ParameterizedType) type), annotationArr), zEncoded).m30613c();
                }
                throw C7375c0.m30565p(this.f28441c, i10, clsM30557h.getSimpleName() + " must include generic type (e.g., " + clsM30557h.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC8713v) {
                m30648j(i10, type);
                boolean zEncoded2 = ((InterfaceC8713v) annotation).encoded();
                Class<?> clsM30557h2 = C7375c0.m30557h(type);
                this.f28450l = true;
                if (!Iterable.class.isAssignableFrom(clsM30557h2)) {
                    if (!clsM30557h2.isArray()) {
                        return new AbstractC7391s.n(this.f28439a.m30668j(type, annotationArr), zEncoded2);
                    }
                    return new AbstractC7391s.n(this.f28439a.m30668j(m30639a(clsM30557h2.getComponentType()), annotationArr), zEncoded2).m30612b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC7391s.n(this.f28439a.m30668j(C7375c0.m30556g(0, (ParameterizedType) type), annotationArr), zEncoded2).m30613c();
                }
                throw C7375c0.m30565p(this.f28441c, i10, clsM30557h2.getSimpleName() + " must include generic type (e.g., " + clsM30557h2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC8712u) {
                m30648j(i10, type);
                Class<?> clsM30557h3 = C7375c0.m30557h(type);
                this.f28451m = true;
                if (!Map.class.isAssignableFrom(clsM30557h3)) {
                    throw C7375c0.m30565p(this.f28441c, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeM30558i = C7375c0.m30558i(type, clsM30557h3, Map.class);
                if (!(typeM30558i instanceof ParameterizedType)) {
                    throw C7375c0.m30565p(this.f28441c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeM30558i;
                Type typeM30556g = C7375c0.m30556g(0, parameterizedType);
                if (String.class == typeM30556g) {
                    return new AbstractC7391s.m(this.f28441c, i10, this.f28439a.m30668j(C7375c0.m30556g(1, parameterizedType), annotationArr), ((InterfaceC8712u) annotation).encoded());
                }
                throw C7375c0.m30565p(this.f28441c, i10, "@QueryMap keys must be of type String: " + typeM30556g, new Object[0]);
            }
            if (annotation instanceof InterfaceC8700i) {
                m30648j(i10, type);
                InterfaceC8700i interfaceC8700i = (InterfaceC8700i) annotation;
                String strValue3 = interfaceC8700i.value();
                Class<?> clsM30557h4 = C7375c0.m30557h(type);
                if (!Iterable.class.isAssignableFrom(clsM30557h4)) {
                    if (!clsM30557h4.isArray()) {
                        return new AbstractC7391s.f(strValue3, this.f28439a.m30668j(type, annotationArr), interfaceC8700i.allowUnsafeNonAsciiValues());
                    }
                    return new AbstractC7391s.f(strValue3, this.f28439a.m30668j(m30639a(clsM30557h4.getComponentType()), annotationArr), interfaceC8700i.allowUnsafeNonAsciiValues()).m30612b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC7391s.f(strValue3, this.f28439a.m30668j(C7375c0.m30556g(0, (ParameterizedType) type), annotationArr), interfaceC8700i.allowUnsafeNonAsciiValues()).m30613c();
                }
                throw C7375c0.m30565p(this.f28441c, i10, clsM30557h4.getSimpleName() + " must include generic type (e.g., " + clsM30557h4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC8701j) {
                if (type == Headers.class) {
                    return new AbstractC7391s.h(this.f28441c, i10);
                }
                m30648j(i10, type);
                Class<?> clsM30557h5 = C7375c0.m30557h(type);
                if (!Map.class.isAssignableFrom(clsM30557h5)) {
                    throw C7375c0.m30565p(this.f28441c, i10, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                }
                Type typeM30558i2 = C7375c0.m30558i(type, clsM30557h5, Map.class);
                if (!(typeM30558i2 instanceof ParameterizedType)) {
                    throw C7375c0.m30565p(this.f28441c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeM30558i2;
                Type typeM30556g2 = C7375c0.m30556g(0, parameterizedType2);
                if (String.class == typeM30556g2) {
                    return new AbstractC7391s.g(this.f28441c, i10, this.f28439a.m30668j(C7375c0.m30556g(1, parameterizedType2), annotationArr), ((InterfaceC8701j) annotation).allowUnsafeNonAsciiValues());
                }
                throw C7375c0.m30565p(this.f28441c, i10, "@HeaderMap keys must be of type String: " + typeM30556g2, new Object[0]);
            }
            if (annotation instanceof InterfaceC8694c) {
                m30648j(i10, type);
                if (!this.f28455q) {
                    throw C7375c0.m30565p(this.f28441c, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                InterfaceC8694c interfaceC8694c = (InterfaceC8694c) annotation;
                String strValue4 = interfaceC8694c.value();
                boolean zEncoded3 = interfaceC8694c.encoded();
                this.f28445g = true;
                Class<?> clsM30557h6 = C7375c0.m30557h(type);
                if (!Iterable.class.isAssignableFrom(clsM30557h6)) {
                    if (!clsM30557h6.isArray()) {
                        return new AbstractC7391s.d(strValue4, this.f28439a.m30668j(type, annotationArr), zEncoded3);
                    }
                    return new AbstractC7391s.d(strValue4, this.f28439a.m30668j(m30639a(clsM30557h6.getComponentType()), annotationArr), zEncoded3).m30612b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC7391s.d(strValue4, this.f28439a.m30668j(C7375c0.m30556g(0, (ParameterizedType) type), annotationArr), zEncoded3).m30613c();
                }
                throw C7375c0.m30565p(this.f28441c, i10, clsM30557h6.getSimpleName() + " must include generic type (e.g., " + clsM30557h6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC8695d) {
                m30648j(i10, type);
                if (!this.f28455q) {
                    throw C7375c0.m30565p(this.f28441c, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsM30557h7 = C7375c0.m30557h(type);
                if (!Map.class.isAssignableFrom(clsM30557h7)) {
                    throw C7375c0.m30565p(this.f28441c, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeM30558i3 = C7375c0.m30558i(type, clsM30557h7, Map.class);
                if (!(typeM30558i3 instanceof ParameterizedType)) {
                    throw C7375c0.m30565p(this.f28441c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeM30558i3;
                Type typeM30556g3 = C7375c0.m30556g(0, parameterizedType3);
                if (String.class == typeM30556g3) {
                    InterfaceC7380h interfaceC7380hM30668j = this.f28439a.m30668j(C7375c0.m30556g(1, parameterizedType3), annotationArr);
                    this.f28445g = true;
                    return new AbstractC7391s.e(this.f28441c, i10, interfaceC7380hM30668j, ((InterfaceC8695d) annotation).encoded());
                }
                throw C7375c0.m30565p(this.f28441c, i10, "@FieldMap keys must be of type String: " + typeM30556g3, new Object[0]);
            }
            if (!(annotation instanceof InterfaceC8708q)) {
                if (annotation instanceof InterfaceC8709r) {
                    m30648j(i10, type);
                    if (!this.f28456r) {
                        throw C7375c0.m30565p(this.f28441c, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f28446h = true;
                    Class<?> clsM30557h8 = C7375c0.m30557h(type);
                    if (!Map.class.isAssignableFrom(clsM30557h8)) {
                        throw C7375c0.m30565p(this.f28441c, i10, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeM30558i4 = C7375c0.m30558i(type, clsM30557h8, Map.class);
                    if (!(typeM30558i4 instanceof ParameterizedType)) {
                        throw C7375c0.m30565p(this.f28441c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeM30558i4;
                    Type typeM30556g4 = C7375c0.m30556g(0, parameterizedType4);
                    if (String.class == typeM30556g4) {
                        Type typeM30556g5 = C7375c0.m30556g(1, parameterizedType4);
                        if (MultipartBody.Part.class.isAssignableFrom(C7375c0.m30557h(typeM30556g5))) {
                            throw C7375c0.m30565p(this.f28441c, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new AbstractC7391s.j(this.f28441c, i10, this.f28439a.m30666h(typeM30556g5, annotationArr, this.f28442d), ((InterfaceC8709r) annotation).encoding());
                    }
                    throw C7375c0.m30565p(this.f28441c, i10, "@PartMap keys must be of type String: " + typeM30556g4, new Object[0]);
                }
                if (annotation instanceof InterfaceC8692a) {
                    m30648j(i10, type);
                    if (this.f28455q || this.f28456r) {
                        throw C7375c0.m30565p(this.f28441c, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f28447i) {
                        throw C7375c0.m30565p(this.f28441c, i10, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        InterfaceC7380h interfaceC7380hM30666h = this.f28439a.m30666h(type, annotationArr, this.f28442d);
                        this.f28447i = true;
                        return new AbstractC7391s.c(this.f28441c, i10, interfaceC7380hM30666h);
                    } catch (RuntimeException e10) {
                        throw C7375c0.m30566q(this.f28441c, e10, i10, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof InterfaceC8715x)) {
                    return null;
                }
                m30648j(i10, type);
                Class<?> clsM30639a = m30639a(C7375c0.m30557h(type));
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    AbstractC7391s<?> abstractC7391s = this.f28461w[i11];
                    if ((abstractC7391s instanceof AbstractC7391s.q) && ((AbstractC7391s.q) abstractC7391s).f28406a.equals(clsM30639a)) {
                        throw C7375c0.m30565p(this.f28441c, i10, "@Tag type " + clsM30639a.getName() + " is duplicate of " + C7392t.f28408b.mo30621a(this.f28441c, i11) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new AbstractC7391s.q(clsM30639a);
            }
            m30648j(i10, type);
            if (!this.f28456r) {
                throw C7375c0.m30565p(this.f28441c, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            InterfaceC8708q interfaceC8708q = (InterfaceC8708q) annotation;
            this.f28446h = true;
            String strValue5 = interfaceC8708q.value();
            Class<?> clsM30557h9 = C7375c0.m30557h(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsM30557h9)) {
                    if (clsM30557h9.isArray()) {
                        if (MultipartBody.Part.class.isAssignableFrom(clsM30557h9.getComponentType())) {
                            return AbstractC7391s.o.f28403a.m30612b();
                        }
                        throw C7375c0.m30565p(this.f28441c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (MultipartBody.Part.class.isAssignableFrom(clsM30557h9)) {
                        return AbstractC7391s.o.f28403a;
                    }
                    throw C7375c0.m30565p(this.f28441c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (MultipartBody.Part.class.isAssignableFrom(C7375c0.m30557h(C7375c0.m30556g(0, (ParameterizedType) type)))) {
                        return AbstractC7391s.o.f28403a.m30613c();
                    }
                    throw C7375c0.m30565p(this.f28441c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw C7375c0.m30565p(this.f28441c, i10, clsM30557h9.getSimpleName() + " must include generic type (e.g., " + clsM30557h9.getSimpleName() + "<String>)", new Object[0]);
            }
            Headers headersM38576of = Headers.m38576of("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", interfaceC8708q.encoding());
            if (!Iterable.class.isAssignableFrom(clsM30557h9)) {
                if (!clsM30557h9.isArray()) {
                    if (MultipartBody.Part.class.isAssignableFrom(clsM30557h9)) {
                        throw C7375c0.m30565p(this.f28441c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new AbstractC7391s.i(this.f28441c, i10, headersM38576of, this.f28439a.m30666h(type, annotationArr, this.f28442d));
                }
                Class<?> clsM30639a2 = m30639a(clsM30557h9.getComponentType());
                if (MultipartBody.Part.class.isAssignableFrom(clsM30639a2)) {
                    throw C7375c0.m30565p(this.f28441c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new AbstractC7391s.i(this.f28441c, i10, headersM38576of, this.f28439a.m30666h(clsM30639a2, annotationArr, this.f28442d)).m30612b();
            }
            if (type instanceof ParameterizedType) {
                Type typeM30556g6 = C7375c0.m30556g(0, (ParameterizedType) type);
                if (MultipartBody.Part.class.isAssignableFrom(C7375c0.m30557h(typeM30556g6))) {
                    throw C7375c0.m30565p(this.f28441c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new AbstractC7391s.i(this.f28441c, i10, headersM38576of, this.f28439a.m30666h(typeM30556g6, annotationArr, this.f28442d)).m30613c();
            }
            throw C7375c0.m30565p(this.f28441c, i10, clsM30557h9.getSimpleName() + " must include generic type (e.g., " + clsM30557h9.getSimpleName() + "<String>)", new Object[0]);
        }

        /* JADX INFO: renamed from: i */
        public final void m30647i(int i10, String str) {
            if (!f28438z.matcher(str).matches()) {
                throw C7375c0.m30565p(this.f28441c, i10, "@Path parameter name must match %s. Found: %s", f28437y.pattern(), str);
            }
            if (!this.f28460v.contains(str)) {
                throw C7375c0.m30565p(this.f28441c, i10, "URL \"%s\" does not contain \"{%s}\".", this.f28457s, str);
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m30648j(int i10, Type type) {
            if (C7375c0.m30559j(type)) {
                throw C7375c0.m30565p(this.f28441c, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public C7395w(a aVar) {
        this.f28425a = aVar.f28440b;
        this.f28426b = aVar.f28441c;
        this.f28427c = aVar.f28439a.f28468c;
        this.f28428d = aVar.f28453o;
        this.f28429e = aVar.f28457s;
        this.f28430f = aVar.f28458t;
        this.f28431g = aVar.f28459u;
        this.f28432h = aVar.f28454p;
        this.f28433i = aVar.f28455q;
        this.f28434j = aVar.f28456r;
        this.f28435k = aVar.f28461w;
        this.f28436l = aVar.f28462x;
    }

    /* JADX INFO: renamed from: b */
    public static C7395w m30637b(C7397y c7397y, Class<?> cls, Method method) {
        return new a(c7397y, cls, method).m30641b();
    }

    /* JADX INFO: renamed from: a */
    public Request m30638a(Object obj, Object[] objArr) {
        AbstractC7391s<?>[] abstractC7391sArr = this.f28435k;
        int length = objArr.length;
        if (length != abstractC7391sArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + abstractC7391sArr.length + ")");
        }
        C7394v c7394v = new C7394v(this.f28428d, this.f28427c, this.f28429e, this.f28430f, this.f28431g, this.f28432h, this.f28433i, this.f28434j);
        if (this.f28436l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            abstractC7391sArr[i10].mo30611a(c7394v, objArr[i10]);
        }
        return c7394v.m30634k().tag((Class<? super C7387o>) C7387o.class, new C7387o(this.f28425a, obj, this.f28426b, arrayList)).build();
    }
}

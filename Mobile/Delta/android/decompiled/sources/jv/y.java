package jv;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<Method, Object> f21977a = new ConcurrentHashMap<>();
    public final Call.Factory b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HttpUrl f21978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<h.a> f21979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e.a> f21981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f21983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21984i;

    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f21985a = new Object[0];
        public final /* synthetic */ Class b;

        public a(Class cls) {
            this.b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f21985a;
            }
            u uVar = t.b;
            return uVar.c(method) ? uVar.b(method, this.b, obj, objArr) : y.this.c(this.b, method).a(obj, objArr);
        }
    }

    public y(Call.Factory factory, HttpUrl httpUrl, List<h.a> list, int i10, List<e.a> list2, int i11, Executor executor, boolean z10) {
        this.b = factory;
        this.f21978c = httpUrl;
        this.f21979d = list;
        this.f21980e = i10;
        this.f21981f = list2;
        this.f21982g = i11;
        this.f21983h = executor;
        this.f21984i = z10;
    }

    public e<?, ?> a(Type type, Annotation[] annotationArr) {
        return e(null, type, annotationArr);
    }

    public <T> T b(Class<T> cls) {
        k(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public z<?> c(Class<?> cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.f21977a.get(method);
            if (objPutIfAbsent instanceof z) {
                return (z) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.f21977a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                z<?> zVarB = z.b(this, cls, method);
                                this.f21977a.put(method, zVarB);
                                return zVarB;
                            } catch (Throwable th2) {
                                this.f21977a.remove(method);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.f21977a.get(method);
                    if (obj2 != null) {
                        return (z) obj2;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public b d() {
        return new b(this);
    }

    public e<?, ?> e(e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f21981f.indexOf(aVar) + 1;
        int size = this.f21981f.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            e<?, ?> eVarA = this.f21981f.get(i10).a(type, annotationArr, this);
            if (eVarA != null) {
                return eVarA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f21981f.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f21981f.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f21981f.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<T, RequestBody> f(h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f21979d.indexOf(aVar) + 1;
        int size = this.f21979d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            h<T, RequestBody> hVar = (h<T, RequestBody>) this.f21979d.get(i10).c(type, annotationArr, annotationArr2, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f21979d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f21979d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f21979d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<ResponseBody, T> g(h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f21979d.indexOf(aVar) + 1;
        int size = this.f21979d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            h<ResponseBody, T> hVar = (h<ResponseBody, T>) this.f21979d.get(i10).d(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f21979d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f21979d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f21979d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<T, RequestBody> h(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return f(null, type, annotationArr, annotationArr2);
    }

    public <T> h<ResponseBody, T> i(Type type, Annotation[] annotationArr) {
        return g(null, type, annotationArr);
    }

    public <T> h<T, String> j(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f21979d.size();
        for (int i10 = 0; i10 < size; i10++) {
            h<T, String> hVar = (h<T, String>) this.f21979d.get(i10).e(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        return jv.b.d.f21830a;
    }

    public final void k(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f21984i) {
            u uVar = t.b;
            for (Method method : cls.getDeclaredMethods()) {
                if (!uVar.c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    c(cls, method);
                }
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Call.Factory f21987a;
        public HttpUrl b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<h.a> f21988c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<e.a> f21989d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Executor f21990e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f21991f;

        public b() {
        }

        public b a(e.a aVar) {
            List<e.a> list = this.f21989d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(h.a aVar) {
            List<h.a> list = this.f21988c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return d(HttpUrl.get(str));
        }

        public b d(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            List<String> listPathSegments = httpUrl.pathSegments();
            if ("".equals(listPathSegments.get(listPathSegments.size() - 1))) {
                this.b = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        public y e() {
            if (this.b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            Call.Factory okHttpClient = this.f21987a;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            Call.Factory factory = okHttpClient;
            Executor executor = this.f21990e;
            if (executor == null) {
                executor = t.f21924a;
            }
            Executor executor2 = executor;
            c cVar = t.f21925c;
            ArrayList arrayList = new ArrayList(this.f21989d);
            List<? extends e.a> listA = cVar.a(executor2);
            arrayList.addAll(listA);
            List<? extends h.a> listB = cVar.b();
            int size = listB.size();
            ArrayList arrayList2 = new ArrayList(this.f21988c.size() + 1 + size);
            arrayList2.add(new jv.b());
            arrayList2.addAll(this.f21988c);
            arrayList2.addAll(listB);
            return new y(factory, this.b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listA.size(), executor2, this.f21991f);
        }

        public b f(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.f21987a = factory;
            return this;
        }

        public b g(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return f(okHttpClient);
        }

        public b(y yVar) {
            this.f21987a = yVar.b;
            this.b = yVar.f21978c;
            int size = yVar.f21979d.size() - yVar.f21980e;
            for (int i10 = 1; i10 < size; i10++) {
                this.f21988c.add(yVar.f21979d.get(i10));
            }
            int size2 = yVar.f21981f.size() - yVar.f21982g;
            for (int i11 = 0; i11 < size2; i11++) {
                this.f21989d.add(yVar.f21981f.get(i11));
            }
            this.f21990e = yVar.f21983h;
            this.f21991f = yVar.f21984i;
        }
    }
}

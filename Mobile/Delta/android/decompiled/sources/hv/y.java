package hv;

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
    public final ConcurrentHashMap<Method, Object> f19987a = new ConcurrentHashMap<>();
    public final Call.Factory b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HttpUrl f19988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<h.a> f19989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e.a> f19991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f19993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19994i;

    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f19995a = new Object[0];
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
                objArr = this.f19995a;
            }
            u uVar = t.b;
            return uVar.c(method) ? uVar.b(method, this.b, obj, objArr) : y.this.c(this.b, method).a(obj, objArr);
        }
    }

    public y(Call.Factory factory, HttpUrl httpUrl, List<h.a> list, int i10, List<e.a> list2, int i11, Executor executor, boolean z10) {
        this.b = factory;
        this.f19988c = httpUrl;
        this.f19989d = list;
        this.f19990e = i10;
        this.f19991f = list2;
        this.f19992g = i11;
        this.f19993h = executor;
        this.f19994i = z10;
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
            Object objPutIfAbsent = this.f19987a.get(method);
            if (objPutIfAbsent instanceof z) {
                return (z) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.f19987a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                z<?> zVarB = z.b(this, cls, method);
                                this.f19987a.put(method, zVarB);
                                return zVarB;
                            } catch (Throwable th2) {
                                this.f19987a.remove(method);
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
                    Object obj2 = this.f19987a.get(method);
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
        int iIndexOf = this.f19991f.indexOf(aVar) + 1;
        int size = this.f19991f.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            e<?, ?> eVarA = this.f19991f.get(i10).a(type, annotationArr, this);
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
                sb2.append(this.f19991f.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f19991f.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f19991f.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<T, RequestBody> f(h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f19989d.indexOf(aVar) + 1;
        int size = this.f19989d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            h<T, RequestBody> hVar = (h<T, RequestBody>) this.f19989d.get(i10).c(type, annotationArr, annotationArr2, this);
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
                sb2.append(this.f19989d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f19989d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f19989d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<ResponseBody, T> g(h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f19989d.indexOf(aVar) + 1;
        int size = this.f19989d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            h<ResponseBody, T> hVar = (h<ResponseBody, T>) this.f19989d.get(i10).d(type, annotationArr, this);
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
                sb2.append(this.f19989d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f19989d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f19989d.get(iIndexOf).getClass().getName());
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
        int size = this.f19989d.size();
        for (int i10 = 0; i10 < size; i10++) {
            h<T, String> hVar = (h<T, String>) this.f19989d.get(i10).e(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        return hv.b.d.f19840a;
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
        if (this.f19994i) {
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
        public Call.Factory f19997a;
        public HttpUrl b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<h.a> f19998c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<e.a> f19999d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Executor f20000e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f20001f;

        public b() {
        }

        public b a(e.a aVar) {
            List<e.a> list = this.f19999d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(h.a aVar) {
            List<h.a> list = this.f19998c;
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
            Call.Factory okHttpClient = this.f19997a;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            Call.Factory factory = okHttpClient;
            Executor executor = this.f20000e;
            if (executor == null) {
                executor = t.f19934a;
            }
            Executor executor2 = executor;
            c cVar = t.f19935c;
            ArrayList arrayList = new ArrayList(this.f19999d);
            List<? extends e.a> listA = cVar.a(executor2);
            arrayList.addAll(listA);
            List<? extends h.a> listB = cVar.b();
            int size = listB.size();
            ArrayList arrayList2 = new ArrayList(this.f19998c.size() + 1 + size);
            arrayList2.add(new hv.b());
            arrayList2.addAll(this.f19998c);
            arrayList2.addAll(listB);
            return new y(factory, this.b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listA.size(), executor2, this.f20001f);
        }

        public b f(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.f19997a = factory;
            return this;
        }

        public b g(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return f(okHttpClient);
        }

        public b(y yVar) {
            this.f19997a = yVar.b;
            this.b = yVar.f19988c;
            int size = yVar.f19989d.size() - yVar.f19990e;
            for (int i10 = 1; i10 < size; i10++) {
                this.f19998c.add(yVar.f19989d.get(i10));
            }
            int size2 = yVar.f19991f.size() - yVar.f19992g;
            for (int i11 = 0; i11 < size2; i11++) {
                this.f19999d.add(yVar.f19991f.get(i11));
            }
            this.f20000e = yVar.f19993h;
            this.f20001f = yVar.f19994i;
        }
    }
}

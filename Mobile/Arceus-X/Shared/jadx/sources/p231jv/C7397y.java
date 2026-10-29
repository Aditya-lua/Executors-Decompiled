package p231jv;

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

/* JADX INFO: renamed from: jv.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C7397y {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap<Method, Object> f28466a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public final Call.Factory f28467b;

    /* JADX INFO: renamed from: c */
    public final HttpUrl f28468c;

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC7380h.a> f28469d;

    /* JADX INFO: renamed from: e */
    public final int f28470e;

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC7377e.a> f28471f;

    /* JADX INFO: renamed from: g */
    public final int f28472g;

    /* JADX INFO: renamed from: h */
    public final Executor f28473h;

    /* JADX INFO: renamed from: i */
    public final boolean f28474i;

    /* JADX INFO: renamed from: jv.y$a */
    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final Object[] f28475a = new Object[0];

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Class f28476b;

        public a(Class cls) {
            this.f28476b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f28475a;
            }
            C7393u c7393u = C7392t.f28408b;
            return c7393u.mo30623c(method) ? c7393u.mo30622b(method, this.f28476b, obj, objArr) : C7397y.this.m30661c(this.f28476b, method).mo30592a(obj, objArr);
        }
    }

    public C7397y(Call.Factory factory, HttpUrl httpUrl, List<InterfaceC7380h.a> list, int i10, List<InterfaceC7377e.a> list2, int i11, Executor executor, boolean z10) {
        this.f28467b = factory;
        this.f28468c = httpUrl;
        this.f28469d = list;
        this.f28470e = i10;
        this.f28471f = list2;
        this.f28472g = i11;
        this.f28473h = executor;
        this.f28474i = z10;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC7377e<?, ?> m30659a(Type type, Annotation[] annotationArr) {
        return m30663e(null, type, annotationArr);
    }

    /* JADX INFO: renamed from: b */
    public <T> T m30660b(Class<T> cls) {
        m30669k(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* JADX INFO: renamed from: c */
    public AbstractC7398z<?> m30661c(Class<?> cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.f28466a.get(method);
            if (objPutIfAbsent instanceof AbstractC7398z) {
                return (AbstractC7398z) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.f28466a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                AbstractC7398z<?> abstractC7398zM30677b = AbstractC7398z.m30677b(this, cls, method);
                                this.f28466a.put(method, abstractC7398zM30677b);
                                return abstractC7398zM30677b;
                            } catch (Throwable th2) {
                                this.f28466a.remove(method);
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
                    Object obj2 = this.f28466a.get(method);
                    if (obj2 != null) {
                        return (AbstractC7398z) obj2;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public b m30662d() {
        return new b(this);
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC7377e<?, ?> m30663e(InterfaceC7377e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f28471f.indexOf(aVar) + 1;
        int size = this.f28471f.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC7377e<?, ?> interfaceC7377eMo30576a = this.f28471f.get(i10).mo30576a(type, annotationArr, this);
            if (interfaceC7377eMo30576a != null) {
                return interfaceC7377eMo30576a;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f28471f.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f28471f.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f28471f.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: f */
    public <T> InterfaceC7380h<T, RequestBody> m30664f(InterfaceC7380h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f28469d.indexOf(aVar) + 1;
        int size = this.f28469d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC7380h<T, RequestBody> interfaceC7380h = (InterfaceC7380h<T, RequestBody>) this.f28469d.get(i10).mo30538c(type, annotationArr, annotationArr2, this);
            if (interfaceC7380h != null) {
                return interfaceC7380h;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f28469d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f28469d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f28469d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: g */
    public <T> InterfaceC7380h<ResponseBody, T> m30665g(InterfaceC7380h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f28469d.indexOf(aVar) + 1;
        int size = this.f28469d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC7380h<ResponseBody, T> interfaceC7380h = (InterfaceC7380h<ResponseBody, T>) this.f28469d.get(i10).mo30539d(type, annotationArr, this);
            if (interfaceC7380h != null) {
                return interfaceC7380h;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f28469d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f28469d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f28469d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: h */
    public <T> InterfaceC7380h<T, RequestBody> m30666h(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m30664f(null, type, annotationArr, annotationArr2);
    }

    /* JADX INFO: renamed from: i */
    public <T> InterfaceC7380h<ResponseBody, T> m30667i(Type type, Annotation[] annotationArr) {
        return m30665g(null, type, annotationArr);
    }

    /* JADX INFO: renamed from: j */
    public <T> InterfaceC7380h<T, String> m30668j(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f28469d.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC7380h<T, String> interfaceC7380h = (InterfaceC7380h<T, String>) this.f28469d.get(i10).m30581e(type, annotationArr, this);
            if (interfaceC7380h != null) {
                return interfaceC7380h;
            }
        }
        return C7372b.d.f28282a;
    }

    /* JADX INFO: renamed from: k */
    public final void m30669k(Class<?> cls) {
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
        if (this.f28474i) {
            C7393u c7393u = C7392t.f28408b;
            for (Method method : cls.getDeclaredMethods()) {
                if (!c7393u.mo30623c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    m30661c(cls, method);
                }
            }
        }
    }

    /* JADX INFO: renamed from: jv.y$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public Call.Factory f28478a;

        /* JADX INFO: renamed from: b */
        public HttpUrl f28479b;

        /* JADX INFO: renamed from: c */
        public final List<InterfaceC7380h.a> f28480c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final List<InterfaceC7377e.a> f28481d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public Executor f28482e;

        /* JADX INFO: renamed from: f */
        public boolean f28483f;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public b m30670a(InterfaceC7377e.a aVar) {
            List<InterfaceC7377e.a> list = this.f28481d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public b m30671b(InterfaceC7380h.a aVar) {
            List<InterfaceC7380h.a> list = this.f28480c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m30672c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return m30673d(HttpUrl.get(str));
        }

        /* JADX INFO: renamed from: d */
        public b m30673d(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            List<String> listPathSegments = httpUrl.pathSegments();
            if ("".equals(listPathSegments.get(listPathSegments.size() - 1))) {
                this.f28479b = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        /* JADX INFO: renamed from: e */
        public C7397y m30674e() {
            if (this.f28479b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            Call.Factory okHttpClient = this.f28478a;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            Call.Factory factory = okHttpClient;
            Executor executor = this.f28482e;
            if (executor == null) {
                executor = C7392t.f28407a;
            }
            Executor executor2 = executor;
            C7374c c7374c = C7392t.f28409c;
            ArrayList arrayList = new ArrayList(this.f28481d);
            List<? extends InterfaceC7377e.a> listMo30548a = c7374c.mo30548a(executor2);
            arrayList.addAll(listMo30548a);
            List<? extends InterfaceC7380h.a> listMo30549b = c7374c.mo30549b();
            int size = listMo30549b.size();
            ArrayList arrayList2 = new ArrayList(this.f28480c.size() + 1 + size);
            arrayList2.add(new C7372b());
            arrayList2.addAll(this.f28480c);
            arrayList2.addAll(listMo30549b);
            return new C7397y(factory, this.f28479b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listMo30548a.size(), executor2, this.f28483f);
        }

        /* JADX INFO: renamed from: f */
        public b m30675f(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.f28478a = factory;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m30676g(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return m30675f(okHttpClient);
        }

        public b(C7397y c7397y) {
            this.f28478a = c7397y.f28467b;
            this.f28479b = c7397y.f28468c;
            int size = c7397y.f28469d.size() - c7397y.f28470e;
            for (int i10 = 1; i10 < size; i10++) {
                this.f28480c.add(c7397y.f28469d.get(i10));
            }
            int size2 = c7397y.f28471f.size() - c7397y.f28472g;
            for (int i11 = 0; i11 < size2; i11++) {
                this.f28481d.add(c7397y.f28471f.get(i11));
            }
            this.f28482e = c7397y.f28473h;
            this.f28483f = c7397y.f28474i;
        }
    }
}

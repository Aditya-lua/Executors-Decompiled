package sw;

import com.github.luben.zstd.BuildConfig;
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
import mv.d0;
import mv.g0;
import mv.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<Method, Object> f32086a = new ConcurrentHashMap<>();
    public final mv.e.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mv.z f32087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<h.a> f32088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e.a> f32090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f32091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f32092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f32093i;

    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f32094a = new Object[0];
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
                objArr = this.f32094a;
            }
            u uVar = t.b;
            return uVar.c(method) ? uVar.b(method, this.b, obj, objArr) : y.this.c(this.b, method).a(obj, objArr);
        }
    }

    public y(mv.e.a aVar, mv.z zVar, List<h.a> list, int i10, List<e.a> list2, int i11, Executor executor, boolean z10) {
        this.b = aVar;
        this.f32087c = zVar;
        this.f32088d = list;
        this.f32089e = i10;
        this.f32090f = list2;
        this.f32091g = i11;
        this.f32092h = executor;
        this.f32093i = z10;
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
            Object objPutIfAbsent = this.f32086a.get(method);
            if (objPutIfAbsent instanceof z) {
                return (z) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.f32086a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                z<?> zVarB = z.b(this, cls, method);
                                this.f32086a.put(method, zVarB);
                                return zVarB;
                            } catch (Throwable th2) {
                                this.f32086a.remove(method);
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
                    Object obj2 = this.f32086a.get(method);
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
        int iIndexOf = this.f32090f.indexOf(aVar) + 1;
        int size = this.f32090f.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            e<?, ?> eVarA = this.f32090f.get(i10).a(type, annotationArr, this);
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
                sb2.append(this.f32090f.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f32090f.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f32090f.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<T, g0> f(h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f32088d.indexOf(aVar) + 1;
        int size = this.f32088d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            h<T, g0> hVar = (h<T, g0>) this.f32088d.get(i10).c(type, annotationArr, annotationArr2, this);
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
                sb2.append(this.f32088d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f32088d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f32088d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<i0, T> g(h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f32088d.indexOf(aVar) + 1;
        int size = this.f32088d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            h<i0, T> hVar = (h<i0, T>) this.f32088d.get(i10).d(type, annotationArr, this);
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
                sb2.append(this.f32088d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f32088d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f32088d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<T, g0> h(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return f(null, type, annotationArr, annotationArr2);
    }

    public <T> h<i0, T> i(Type type, Annotation[] annotationArr) {
        return g(null, type, annotationArr);
    }

    public <T> h<T, String> j(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f32088d.size();
        for (int i10 = 0; i10 < size; i10++) {
            h<T, String> hVar = (h<T, String>) this.f32088d.get(i10).e(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        return sw.b.d.f31937a;
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
        if (this.f32093i) {
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
        public mv.e.a f32096a;
        public mv.z b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<h.a> f32097c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<e.a> f32098d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Executor f32099e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f32100f;

        public b() {
        }

        public b a(e.a aVar) {
            List<e.a> list = this.f32098d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(h.a aVar) {
            List<h.a> list = this.f32097c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return d(mv.z.g(str));
        }

        public b d(mv.z zVar) {
            Objects.requireNonNull(zVar, "baseUrl == null");
            List<String> listL = zVar.l();
            if (BuildConfig.FLAVOR.equals(listL.get(listL.size() - 1))) {
                this.b = zVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + zVar);
        }

        public y e() {
            if (this.b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            mv.e.a d0Var = this.f32096a;
            if (d0Var == null) {
                d0Var = new d0();
            }
            mv.e.a aVar = d0Var;
            Executor executor = this.f32099e;
            if (executor == null) {
                executor = t.f32032a;
            }
            Executor executor2 = executor;
            c cVar = t.f32033c;
            ArrayList arrayList = new ArrayList(this.f32098d);
            List<? extends e.a> listA = cVar.a(executor2);
            arrayList.addAll(listA);
            List<? extends h.a> listB = cVar.b();
            int size = listB.size();
            ArrayList arrayList2 = new ArrayList(this.f32097c.size() + 1 + size);
            arrayList2.add(new sw.b());
            arrayList2.addAll(this.f32097c);
            arrayList2.addAll(listB);
            return new y(aVar, this.b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listA.size(), executor2, this.f32100f);
        }

        public b f(mv.e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f32096a = aVar;
            return this;
        }

        public b g(d0 d0Var) {
            Objects.requireNonNull(d0Var, "client == null");
            return f(d0Var);
        }

        public b(y yVar) {
            this.f32096a = yVar.b;
            this.b = yVar.f32087c;
            int size = yVar.f32088d.size() - yVar.f32089e;
            for (int i10 = 1; i10 < size; i10++) {
                this.f32097c.add(yVar.f32088d.get(i10));
            }
            int size2 = yVar.f32090f.size() - yVar.f32091g;
            for (int i11 = 0; i11 < size2; i11++) {
                this.f32098d.add(yVar.f32090f.get(i11));
            }
            this.f32099e = yVar.f32092h;
            this.f32100f = yVar.f32093i;
        }
    }
}

package fv;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<Class<?>, List<l>> f17288d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a[] f17289e = new a[4];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<gv.b> f17290a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17291c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<l> f17292a = new ArrayList();
        public final Map<Class, Object> b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, Class> f17293c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final StringBuilder f17294d = new StringBuilder(128);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Class<?> f17295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Class<?> f17296f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f17297g;

        public boolean a(Method method, Class<?> cls) {
            Object objPut = this.b.put(cls, method);
            if (objPut == null) {
                return true;
            }
            if (objPut instanceof Method) {
                if (!b((Method) objPut, cls)) {
                    throw new IllegalStateException();
                }
                this.b.put(cls, this);
            }
            return b(method, cls);
        }

        public final boolean b(Method method, Class<?> cls) {
            this.f17294d.setLength(0);
            this.f17294d.append(method.getName());
            StringBuilder sb2 = this.f17294d;
            sb2.append('>');
            sb2.append(cls.getName());
            String string = this.f17294d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class clsPut = this.f17293c.put(string, declaringClass);
            if (clsPut == null || clsPut.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f17293c.put(string, clsPut);
            return false;
        }

        public void c(Class<?> cls) {
            this.f17296f = cls;
            this.f17295e = cls;
            this.f17297g = false;
        }

        public void d() {
            if (this.f17297g) {
                this.f17296f = null;
                return;
            }
            Class<? super Object> superclass = this.f17296f.getSuperclass();
            this.f17296f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                this.f17296f = null;
            }
        }

        public void e() {
            this.f17292a.clear();
            this.b.clear();
            this.f17293c.clear();
            this.f17294d.setLength(0);
            this.f17295e = null;
            this.f17296f = null;
            this.f17297g = false;
        }
    }

    public m(List<gv.b> list, boolean z10, boolean z11) {
        this.f17290a = list;
        this.b = z10;
        this.f17291c = z11;
    }

    public List<l> a(Class<?> cls) {
        Map<Class<?>, List<l>> map = f17288d;
        List<l> list = map.get(cls);
        if (list != null) {
            return list;
        }
        List<l> listC = this.f17291c ? c(cls) : b(cls);
        if (!listC.isEmpty()) {
            map.put(cls, listC);
            return listC;
        }
        throw new e("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }

    public final List<l> b(Class<?> cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f17296f != null) {
            f(aVarG);
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    public final List<l> c(Class<?> cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f17296f != null) {
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    public final void d(a aVar) {
        Method[] methods;
        try {
            methods = aVar.f17296f.getDeclaredMethods();
        } catch (Throwable unused) {
            methods = aVar.f17296f.getMethods();
            aVar.f17297g = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    j jVar = (j) method.getAnnotation(j.class);
                    if (jVar != null) {
                        Class<?> cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            aVar.f17292a.add(new l(method, cls, jVar.threadMode(), jVar.priority(), jVar.sticky()));
                        }
                    }
                } else if (this.b && method.isAnnotationPresent(j.class)) {
                    throw new e("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.b && method.isAnnotationPresent(j.class)) {
                throw new e((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    public final List<l> e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f17292a);
        aVar.e();
        synchronized (f17289e) {
            for (int i10 = 0; i10 < 4; i10++) {
                try {
                    a[] aVarArr = f17289e;
                    if (aVarArr[i10] == null) {
                        aVarArr[i10] = aVar;
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    public final gv.a f(a aVar) {
        aVar.getClass();
        List<gv.b> list = this.f17290a;
        if (list == null) {
            return null;
        }
        Iterator<gv.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(aVar.f17296f);
        }
        return null;
    }

    public final a g() {
        synchronized (f17289e) {
            for (int i10 = 0; i10 < 4; i10++) {
                try {
                    a[] aVarArr = f17289e;
                    a aVar = aVarArr[i10];
                    if (aVar != null) {
                        aVarArr[i10] = null;
                        return aVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new a();
        }
    }
}

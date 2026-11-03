package dv;

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
    public static final Map<Class<?>, List<l>> f15484d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a[] f15485e = new a[4];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<ev.b> f15486a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15487c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<l> f15488a = new ArrayList();
        public final Map<Class, Object> b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, Class> f15489c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final StringBuilder f15490d = new StringBuilder(128);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Class<?> f15491e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Class<?> f15492f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f15493g;

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
            this.f15490d.setLength(0);
            this.f15490d.append(method.getName());
            StringBuilder sb2 = this.f15490d;
            sb2.append('>');
            sb2.append(cls.getName());
            String string = this.f15490d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class clsPut = this.f15489c.put(string, declaringClass);
            if (clsPut == null || clsPut.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f15489c.put(string, clsPut);
            return false;
        }

        public void c(Class<?> cls) {
            this.f15492f = cls;
            this.f15491e = cls;
            this.f15493g = false;
        }

        public void d() {
            if (this.f15493g) {
                this.f15492f = null;
                return;
            }
            Class<? super Object> superclass = this.f15492f.getSuperclass();
            this.f15492f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                this.f15492f = null;
            }
        }

        public void e() {
            this.f15488a.clear();
            this.b.clear();
            this.f15489c.clear();
            this.f15490d.setLength(0);
            this.f15491e = null;
            this.f15492f = null;
            this.f15493g = false;
        }
    }

    public m(List<ev.b> list, boolean z10, boolean z11) {
        this.f15486a = list;
        this.b = z10;
        this.f15487c = z11;
    }

    public List<l> a(Class<?> cls) {
        Map<Class<?>, List<l>> map = f15484d;
        List<l> list = map.get(cls);
        if (list != null) {
            return list;
        }
        List<l> listC = this.f15487c ? c(cls) : b(cls);
        if (!listC.isEmpty()) {
            map.put(cls, listC);
            return listC;
        }
        throw new e("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }

    public final List<l> b(Class<?> cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f15492f != null) {
            f(aVarG);
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    public final List<l> c(Class<?> cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f15492f != null) {
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    public final void d(a aVar) {
        Method[] methods;
        try {
            methods = aVar.f15492f.getDeclaredMethods();
        } catch (Throwable unused) {
            methods = aVar.f15492f.getMethods();
            aVar.f15493g = true;
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
                            aVar.f15488a.add(new l(method, cls, jVar.threadMode(), jVar.priority(), jVar.sticky()));
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
        ArrayList arrayList = new ArrayList(aVar.f15488a);
        aVar.e();
        synchronized (f15485e) {
            for (int i10 = 0; i10 < 4; i10++) {
                try {
                    a[] aVarArr = f15485e;
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

    public final ev.a f(a aVar) {
        aVar.getClass();
        List<ev.b> list = this.f15486a;
        if (list == null) {
            return null;
        }
        Iterator<ev.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(aVar.f15492f);
        }
        return null;
    }

    public final a g() {
        synchronized (f15485e) {
            for (int i10 = 0; i10 < 4; i10++) {
                try {
                    a[] aVarArr = f15485e;
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

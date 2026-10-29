package p138fv;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p153gv.InterfaceC6246a;
import p153gv.InterfaceC6247b;

/* JADX INFO: renamed from: fv.m */
/* JADX INFO: loaded from: classes2.dex */
public class C5850m {

    /* JADX INFO: renamed from: d */
    public static final Map<Class<?>, List<C5849l>> f22306d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final a[] f22307e = new a[4];

    /* JADX INFO: renamed from: a */
    public List<InterfaceC6247b> f22308a;

    /* JADX INFO: renamed from: b */
    public final boolean f22309b;

    /* JADX INFO: renamed from: c */
    public final boolean f22310c;

    /* JADX INFO: renamed from: fv.m$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final List<C5849l> f22311a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final Map<Class, Object> f22312b = new HashMap();

        /* JADX INFO: renamed from: c */
        public final Map<String, Class> f22313c = new HashMap();

        /* JADX INFO: renamed from: d */
        public final StringBuilder f22314d = new StringBuilder(128);

        /* JADX INFO: renamed from: e */
        public Class<?> f22315e;

        /* JADX INFO: renamed from: f */
        public Class<?> f22316f;

        /* JADX INFO: renamed from: g */
        public boolean f22317g;

        /* JADX INFO: renamed from: a */
        public boolean m26235a(Method method, Class<?> cls) {
            Object objPut = this.f22312b.put(cls, method);
            if (objPut == null) {
                return true;
            }
            if (objPut instanceof Method) {
                if (!m26236b((Method) objPut, cls)) {
                    throw new IllegalStateException();
                }
                this.f22312b.put(cls, this);
            }
            return m26236b(method, cls);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m26236b(Method method, Class<?> cls) {
            this.f22314d.setLength(0);
            this.f22314d.append(method.getName());
            StringBuilder sb2 = this.f22314d;
            sb2.append('>');
            sb2.append(cls.getName());
            String string = this.f22314d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class clsPut = this.f22313c.put(string, declaringClass);
            if (clsPut == null || clsPut.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f22313c.put(string, clsPut);
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void m26237c(Class<?> cls) {
            this.f22316f = cls;
            this.f22315e = cls;
            this.f22317g = false;
        }

        /* JADX INFO: renamed from: d */
        public void m26238d() {
            if (this.f22317g) {
                this.f22316f = null;
                return;
            }
            Class<? super Object> superclass = this.f22316f.getSuperclass();
            this.f22316f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                this.f22316f = null;
            }
        }

        /* JADX INFO: renamed from: e */
        public void m26239e() {
            this.f22311a.clear();
            this.f22312b.clear();
            this.f22313c.clear();
            this.f22314d.setLength(0);
            this.f22315e = null;
            this.f22316f = null;
            this.f22317g = false;
        }
    }

    public C5850m(List<InterfaceC6247b> list, boolean z10, boolean z11) {
        this.f22308a = list;
        this.f22309b = z10;
        this.f22310c = z11;
    }

    /* JADX INFO: renamed from: a */
    public List<C5849l> m26228a(Class<?> cls) {
        Map<Class<?>, List<C5849l>> map = f22306d;
        List<C5849l> list = map.get(cls);
        if (list != null) {
            return list;
        }
        List<C5849l> listM26230c = this.f22310c ? m26230c(cls) : m26229b(cls);
        if (!listM26230c.isEmpty()) {
            map.put(cls, listM26230c);
            return listM26230c;
        }
        throw new C5842e("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }

    /* JADX INFO: renamed from: b */
    public final List<C5849l> m26229b(Class<?> cls) {
        a aVarM26234g = m26234g();
        aVarM26234g.m26237c(cls);
        while (aVarM26234g.f22316f != null) {
            m26233f(aVarM26234g);
            m26231d(aVarM26234g);
            aVarM26234g.m26238d();
        }
        return m26232e(aVarM26234g);
    }

    /* JADX INFO: renamed from: c */
    public final List<C5849l> m26230c(Class<?> cls) {
        a aVarM26234g = m26234g();
        aVarM26234g.m26237c(cls);
        while (aVarM26234g.f22316f != null) {
            m26231d(aVarM26234g);
            aVarM26234g.m26238d();
        }
        return m26232e(aVarM26234g);
    }

    /* JADX INFO: renamed from: d */
    public final void m26231d(a aVar) {
        Method[] methods;
        try {
            methods = aVar.f22316f.getDeclaredMethods();
        } catch (Throwable unused) {
            methods = aVar.f22316f.getMethods();
            aVar.f22317g = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    InterfaceC5847j interfaceC5847j = (InterfaceC5847j) method.getAnnotation(InterfaceC5847j.class);
                    if (interfaceC5847j != null) {
                        Class<?> cls = parameterTypes[0];
                        if (aVar.m26235a(method, cls)) {
                            aVar.f22311a.add(new C5849l(method, cls, interfaceC5847j.threadMode(), interfaceC5847j.priority(), interfaceC5847j.sticky()));
                        }
                    }
                } else if (this.f22309b && method.isAnnotationPresent(InterfaceC5847j.class)) {
                    throw new C5842e("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.f22309b && method.isAnnotationPresent(InterfaceC5847j.class)) {
                throw new C5842e((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final List<C5849l> m26232e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f22311a);
        aVar.m26239e();
        synchronized (f22307e) {
            for (int i10 = 0; i10 < 4; i10++) {
                try {
                    a[] aVarArr = f22307e;
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

    /* JADX INFO: renamed from: f */
    public final InterfaceC6246a m26233f(a aVar) {
        aVar.getClass();
        List<InterfaceC6247b> list = this.f22308a;
        if (list == null) {
            return null;
        }
        Iterator<InterfaceC6247b> it = list.iterator();
        while (it.hasNext()) {
            it.next().m27449a(aVar.f22316f);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final a m26234g() {
        synchronized (f22307e) {
            for (int i10 = 0; i10 < 4; i10++) {
                try {
                    a[] aVarArr = f22307e;
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

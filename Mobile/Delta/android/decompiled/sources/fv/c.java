package fv;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static String f17236q = "EventBus";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static volatile c f17237r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f17238s = new d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Map<Class<?>, List<Class<?>>> f17239t = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, CopyOnWriteArrayList<n>> f17240a;
    public final Map<Object, List<Class<?>>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, Object> f17241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal<C0315c> f17242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f17243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fv.b f17244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fv.a f17245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f17246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ExecutorService f17247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f17248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f17249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f17250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f17251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f17252n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f17253o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f17254p;

    public class a extends ThreadLocal<C0315c> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0315c initialValue() {
            return new C0315c();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17256a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f17256a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17256a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17256a[ThreadMode.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17256a[ThreadMode.ASYNC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: fv.c$c, reason: collision with other inner class name */
    public static final class C0315c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Object> f17257a = new ArrayList();
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public n f17259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f17260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f17261f;
    }

    public c() {
        this(f17238s);
    }

    public static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static d b() {
        return new d();
    }

    public static c d() {
        if (f17237r == null) {
            synchronized (c.class) {
                try {
                    if (f17237r == null) {
                        f17237r = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f17237r;
    }

    public static List<Class<?>> i(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = f17239t;
        synchronized (map) {
            try {
                arrayList = map.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        a(arrayList, superclass.getInterfaces());
                    }
                    f17239t.put(cls, arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public final void c(n nVar, Object obj) {
        if (obj != null) {
            m(nVar, obj, Looper.getMainLooper() == Looper.myLooper());
        }
    }

    public ExecutorService e() {
        return this.f17247i;
    }

    public final void f(n nVar, Object obj, Throwable th2) {
        if (!(obj instanceof k)) {
            if (this.f17248j) {
                throw new e("Invoking subscriber failed", th2);
            }
            if (this.f17249k) {
                Log.e(f17236q, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + nVar.f17298a.getClass(), th2);
            }
            if (this.f17251m) {
                j(new k(this, th2, obj, nVar.f17298a));
                return;
            }
            return;
        }
        if (this.f17249k) {
            Log.e(f17236q, "SubscriberExceptionEvent subscriber " + nVar.f17298a.getClass() + " threw an exception", th2);
            k kVar = (k) obj;
            Log.e(f17236q, "Initial event " + kVar.f17281c + " caused exception in " + kVar.f17282d, kVar.b);
        }
    }

    public void g(h hVar) {
        Object obj = hVar.f17277a;
        n nVar = hVar.b;
        h.b(hVar);
        if (nVar.f17299c) {
            h(nVar, obj);
        }
    }

    public void h(n nVar, Object obj) {
        try {
            nVar.b.f17283a.invoke(nVar.f17298a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            f(nVar, obj, e11.getCause());
        }
    }

    public void j(Object obj) {
        C0315c c0315c = this.f17242d.get();
        List<Object> list = c0315c.f17257a;
        list.add(obj);
        if (c0315c.b) {
            return;
        }
        c0315c.f17258c = Looper.getMainLooper() == Looper.myLooper();
        c0315c.b = true;
        if (c0315c.f17261f) {
            throw new e("Internal error. Abort state was not reset");
        }
        while (!list.isEmpty()) {
            try {
                k(list.remove(0), c0315c);
            } catch (Throwable th2) {
                c0315c.b = false;
                c0315c.f17258c = false;
                throw th2;
            }
        }
        c0315c.b = false;
        c0315c.f17258c = false;
    }

    public final void k(Object obj, C0315c c0315c) {
        boolean zL;
        Class<?> cls = obj.getClass();
        if (this.f17253o) {
            List<Class<?>> listI = i(cls);
            int size = listI.size();
            zL = false;
            for (int i10 = 0; i10 < size; i10++) {
                zL |= l(obj, c0315c, listI.get(i10));
            }
        } else {
            zL = l(obj, c0315c, cls);
        }
        if (zL) {
            return;
        }
        if (this.f17250l) {
            Log.d(f17236q, "No subscribers registered for event " + cls);
        }
        if (!this.f17252n || cls == g.class || cls == k.class) {
            return;
        }
        j(new g(this, obj));
    }

    public final boolean l(Object obj, C0315c c0315c, Class<?> cls) {
        CopyOnWriteArrayList<n> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f17240a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (n nVar : copyOnWriteArrayList) {
            c0315c.f17260e = obj;
            c0315c.f17259d = nVar;
            try {
                m(nVar, obj, c0315c.f17258c);
                boolean z10 = c0315c.f17261f;
                c0315c.f17260e = null;
                c0315c.f17259d = null;
                c0315c.f17261f = false;
                if (z10) {
                    return true;
                }
            } catch (Throwable th2) {
                c0315c.f17260e = null;
                c0315c.f17259d = null;
                c0315c.f17261f = false;
                throw th2;
            }
        }
        return true;
    }

    public final void m(n nVar, Object obj, boolean z10) {
        int i10 = b.f17256a[nVar.b.b.ordinal()];
        if (i10 == 1) {
            h(nVar, obj);
            return;
        }
        if (i10 == 2) {
            if (z10) {
                h(nVar, obj);
                return;
            } else {
                this.f17243e.a(nVar, obj);
                return;
            }
        }
        if (i10 == 3) {
            if (z10) {
                this.f17244f.a(nVar, obj);
                return;
            } else {
                h(nVar, obj);
                return;
            }
        }
        if (i10 == 4) {
            this.f17245g.a(nVar, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + nVar.b.b);
    }

    public void n(Object obj) {
        List<l> listA = this.f17246h.a(obj.getClass());
        synchronized (this) {
            try {
                Iterator<l> it = listA.iterator();
                while (it.hasNext()) {
                    o(obj, it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o(Object obj, l lVar) {
        Class<?> cls = lVar.f17284c;
        n nVar = new n(obj, lVar);
        CopyOnWriteArrayList<n> copyOnWriteArrayList = this.f17240a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f17240a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(nVar)) {
            throw new e("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i10 = 0; i10 <= size; i10++) {
            if (i10 == size || lVar.f17285d > copyOnWriteArrayList.get(i10).b.f17285d) {
                copyOnWriteArrayList.add(i10, nVar);
                break;
            }
        }
        List<Class<?>> arrayList = this.b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (lVar.f17286e) {
            if (!this.f17253o) {
                c(nVar, this.f17241c.get(cls));
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.f17241c.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    c(nVar, entry.getValue());
                }
            }
        }
    }

    public synchronized void p(Object obj) {
        try {
            List<Class<?>> list = this.b.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    q(obj, it.next());
                }
                this.b.remove(obj);
            } else {
                Log.w(f17236q, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void q(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<n> copyOnWriteArrayList = this.f17240a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                n nVar = copyOnWriteArrayList.get(i10);
                if (nVar.f17298a == obj) {
                    nVar.f17299c = false;
                    copyOnWriteArrayList.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f17254p + ", eventInheritance=" + this.f17253o + "]";
    }

    public c(d dVar) {
        this.f17242d = new a();
        this.f17240a = new HashMap();
        this.b = new HashMap();
        this.f17241c = new ConcurrentHashMap();
        this.f17243e = new f(this, Looper.getMainLooper(), 10);
        this.f17244f = new fv.b(this);
        this.f17245g = new fv.a(this);
        List<gv.b> list = dVar.f17271j;
        this.f17254p = list != null ? list.size() : 0;
        this.f17246h = new m(dVar.f17271j, dVar.f17269h, dVar.f17268g);
        this.f17249k = dVar.f17263a;
        this.f17250l = dVar.b;
        this.f17251m = dVar.f17264c;
        this.f17252n = dVar.f17265d;
        this.f17248j = dVar.f17266e;
        this.f17253o = dVar.f17267f;
        this.f17247i = dVar.f17270i;
    }
}

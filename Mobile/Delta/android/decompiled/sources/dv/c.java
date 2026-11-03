package dv;

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
    public static String f15432q = "EventBus";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static volatile c f15433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f15434s = new d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Map<Class<?>, List<Class<?>>> f15435t = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, CopyOnWriteArrayList<n>> f15436a;
    public final Map<Object, List<Class<?>>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, Object> f15437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal<C0291c> f15438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f15439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dv.b f15440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dv.a f15441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f15442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ExecutorService f15443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f15444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f15445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f15446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f15447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f15448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f15449o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f15450p;

    public class a extends ThreadLocal<C0291c> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0291c initialValue() {
            return new C0291c();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15452a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f15452a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15452a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15452a[ThreadMode.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15452a[ThreadMode.ASYNC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: dv.c$c, reason: collision with other inner class name */
    public static final class C0291c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Object> f15453a = new ArrayList();
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public n f15455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f15456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f15457f;
    }

    public c() {
        this(f15434s);
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
        if (f15433r == null) {
            synchronized (c.class) {
                try {
                    if (f15433r == null) {
                        f15433r = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f15433r;
    }

    public static List<Class<?>> i(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = f15435t;
        synchronized (map) {
            try {
                arrayList = map.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        a(arrayList, superclass.getInterfaces());
                    }
                    f15435t.put(cls, arrayList);
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
        return this.f15443i;
    }

    public final void f(n nVar, Object obj, Throwable th2) {
        if (!(obj instanceof k)) {
            if (this.f15444j) {
                throw new e("Invoking subscriber failed", th2);
            }
            if (this.f15445k) {
                Log.e(f15432q, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + nVar.f15494a.getClass(), th2);
            }
            if (this.f15447m) {
                j(new k(this, th2, obj, nVar.f15494a));
                return;
            }
            return;
        }
        if (this.f15445k) {
            Log.e(f15432q, "SubscriberExceptionEvent subscriber " + nVar.f15494a.getClass() + " threw an exception", th2);
            k kVar = (k) obj;
            Log.e(f15432q, "Initial event " + kVar.f15477c + " caused exception in " + kVar.f15478d, kVar.b);
        }
    }

    public void g(h hVar) {
        Object obj = hVar.f15473a;
        n nVar = hVar.b;
        h.b(hVar);
        if (nVar.f15495c) {
            h(nVar, obj);
        }
    }

    public void h(n nVar, Object obj) {
        try {
            nVar.b.f15479a.invoke(nVar.f15494a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            f(nVar, obj, e11.getCause());
        }
    }

    public void j(Object obj) {
        C0291c c0291c = this.f15438d.get();
        List<Object> list = c0291c.f15453a;
        list.add(obj);
        if (c0291c.b) {
            return;
        }
        c0291c.f15454c = Looper.getMainLooper() == Looper.myLooper();
        c0291c.b = true;
        if (c0291c.f15457f) {
            throw new e("Internal error. Abort state was not reset");
        }
        while (!list.isEmpty()) {
            try {
                k(list.remove(0), c0291c);
            } catch (Throwable th2) {
                c0291c.b = false;
                c0291c.f15454c = false;
                throw th2;
            }
        }
        c0291c.b = false;
        c0291c.f15454c = false;
    }

    public final void k(Object obj, C0291c c0291c) {
        boolean zL;
        Class<?> cls = obj.getClass();
        if (this.f15449o) {
            List<Class<?>> listI = i(cls);
            int size = listI.size();
            zL = false;
            for (int i10 = 0; i10 < size; i10++) {
                zL |= l(obj, c0291c, listI.get(i10));
            }
        } else {
            zL = l(obj, c0291c, cls);
        }
        if (zL) {
            return;
        }
        if (this.f15446l) {
            Log.d(f15432q, "No subscribers registered for event " + cls);
        }
        if (!this.f15448n || cls == g.class || cls == k.class) {
            return;
        }
        j(new g(this, obj));
    }

    public final boolean l(Object obj, C0291c c0291c, Class<?> cls) {
        CopyOnWriteArrayList<n> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f15436a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (n nVar : copyOnWriteArrayList) {
            c0291c.f15456e = obj;
            c0291c.f15455d = nVar;
            try {
                m(nVar, obj, c0291c.f15454c);
                boolean z10 = c0291c.f15457f;
                c0291c.f15456e = null;
                c0291c.f15455d = null;
                c0291c.f15457f = false;
                if (z10) {
                    return true;
                }
            } catch (Throwable th2) {
                c0291c.f15456e = null;
                c0291c.f15455d = null;
                c0291c.f15457f = false;
                throw th2;
            }
        }
        return true;
    }

    public final void m(n nVar, Object obj, boolean z10) {
        int i10 = b.f15452a[nVar.b.b.ordinal()];
        if (i10 == 1) {
            h(nVar, obj);
            return;
        }
        if (i10 == 2) {
            if (z10) {
                h(nVar, obj);
                return;
            } else {
                this.f15439e.a(nVar, obj);
                return;
            }
        }
        if (i10 == 3) {
            if (z10) {
                this.f15440f.a(nVar, obj);
                return;
            } else {
                h(nVar, obj);
                return;
            }
        }
        if (i10 == 4) {
            this.f15441g.a(nVar, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + nVar.b.b);
    }

    public void n(Object obj) {
        List<l> listA = this.f15442h.a(obj.getClass());
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
        Class<?> cls = lVar.f15480c;
        n nVar = new n(obj, lVar);
        CopyOnWriteArrayList<n> copyOnWriteArrayList = this.f15436a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f15436a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(nVar)) {
            throw new e("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i10 = 0; i10 <= size; i10++) {
            if (i10 == size || lVar.f15481d > copyOnWriteArrayList.get(i10).b.f15481d) {
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
        if (lVar.f15482e) {
            if (!this.f15449o) {
                c(nVar, this.f15437c.get(cls));
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.f15437c.entrySet()) {
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
                Log.w(f15432q, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void q(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<n> copyOnWriteArrayList = this.f15436a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                n nVar = copyOnWriteArrayList.get(i10);
                if (nVar.f15494a == obj) {
                    nVar.f15495c = false;
                    copyOnWriteArrayList.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f15450p + ", eventInheritance=" + this.f15449o + "]";
    }

    public c(d dVar) {
        this.f15438d = new a();
        this.f15436a = new HashMap();
        this.b = new HashMap();
        this.f15437c = new ConcurrentHashMap();
        this.f15439e = new f(this, Looper.getMainLooper(), 10);
        this.f15440f = new dv.b(this);
        this.f15441g = new dv.a(this);
        List<ev.b> list = dVar.f15467j;
        this.f15450p = list != null ? list.size() : 0;
        this.f15442h = new m(dVar.f15467j, dVar.f15465h, dVar.f15464g);
        this.f15445k = dVar.f15459a;
        this.f15446l = dVar.b;
        this.f15447m = dVar.f15460c;
        this.f15448n = dVar.f15461d;
        this.f15444j = dVar.f15462e;
        this.f15449o = dVar.f15463f;
        this.f15443i = dVar.f15466i;
    }
}

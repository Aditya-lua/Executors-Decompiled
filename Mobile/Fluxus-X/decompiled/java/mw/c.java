package mw;

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
    public static String f24813q = "EventBus";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static volatile c f24814r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f24815s = new d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Map<Class<?>, List<Class<?>>> f24816t = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, CopyOnWriteArrayList<n>> f24817a;
    public final Map<Object, List<Class<?>>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, Object> f24818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal<C0488c> f24819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f24820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mw.b f24821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mw.a f24822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f24823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ExecutorService f24824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f24825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f24826k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f24827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f24828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f24829n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f24830o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f24831p;

    public class a extends ThreadLocal<C0488c> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0488c initialValue() {
            return new C0488c();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24833a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f24833a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24833a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24833a[ThreadMode.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24833a[ThreadMode.ASYNC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: mw.c$c, reason: collision with other inner class name */
    public static final class C0488c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Object> f24834a = new ArrayList();
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f24835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public n f24836d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f24837e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f24838f;
    }

    public c() {
        this(f24815s);
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
        if (f24814r == null) {
            synchronized (c.class) {
                try {
                    if (f24814r == null) {
                        f24814r = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f24814r;
    }

    public static List<Class<?>> i(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = f24816t;
        synchronized (map) {
            try {
                arrayList = map.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        a(arrayList, superclass.getInterfaces());
                    }
                    f24816t.put(cls, arrayList);
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
        return this.f24824i;
    }

    public final void f(n nVar, Object obj, Throwable th2) {
        if (!(obj instanceof k)) {
            if (this.f24825j) {
                throw new e("Invoking subscriber failed", th2);
            }
            if (this.f24826k) {
                Log.e(f24813q, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + nVar.f24875a.getClass(), th2);
            }
            if (this.f24828m) {
                j(new k(this, th2, obj, nVar.f24875a));
                return;
            }
            return;
        }
        if (this.f24826k) {
            Log.e(f24813q, "SubscriberExceptionEvent subscriber " + nVar.f24875a.getClass() + " threw an exception", th2);
            k kVar = (k) obj;
            Log.e(f24813q, "Initial event " + kVar.f24858c + " caused exception in " + kVar.f24859d, kVar.b);
        }
    }

    public void g(h hVar) {
        Object obj = hVar.f24854a;
        n nVar = hVar.b;
        h.b(hVar);
        if (nVar.f24876c) {
            h(nVar, obj);
        }
    }

    public void h(n nVar, Object obj) {
        try {
            nVar.b.f24860a.invoke(nVar.f24875a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            f(nVar, obj, e11.getCause());
        }
    }

    public void j(Object obj) {
        C0488c c0488c = this.f24819d.get();
        List<Object> list = c0488c.f24834a;
        list.add(obj);
        if (c0488c.b) {
            return;
        }
        c0488c.f24835c = Looper.getMainLooper() == Looper.myLooper();
        c0488c.b = true;
        if (c0488c.f24838f) {
            throw new e("Internal error. Abort state was not reset");
        }
        while (!list.isEmpty()) {
            try {
                k(list.remove(0), c0488c);
            } catch (Throwable th2) {
                c0488c.b = false;
                c0488c.f24835c = false;
                throw th2;
            }
        }
        c0488c.b = false;
        c0488c.f24835c = false;
    }

    public final void k(Object obj, C0488c c0488c) {
        boolean zL;
        Class<?> cls = obj.getClass();
        if (this.f24830o) {
            List<Class<?>> listI = i(cls);
            int size = listI.size();
            zL = false;
            for (int i10 = 0; i10 < size; i10++) {
                zL |= l(obj, c0488c, listI.get(i10));
            }
        } else {
            zL = l(obj, c0488c, cls);
        }
        if (zL) {
            return;
        }
        if (this.f24827l) {
            Log.d(f24813q, "No subscribers registered for event " + cls);
        }
        if (!this.f24829n || cls == g.class || cls == k.class) {
            return;
        }
        j(new g(this, obj));
    }

    public final boolean l(Object obj, C0488c c0488c, Class<?> cls) {
        CopyOnWriteArrayList<n> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f24817a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (n nVar : copyOnWriteArrayList) {
            c0488c.f24837e = obj;
            c0488c.f24836d = nVar;
            try {
                m(nVar, obj, c0488c.f24835c);
                boolean z10 = c0488c.f24838f;
                c0488c.f24837e = null;
                c0488c.f24836d = null;
                c0488c.f24838f = false;
                if (z10) {
                    return true;
                }
            } catch (Throwable th2) {
                c0488c.f24837e = null;
                c0488c.f24836d = null;
                c0488c.f24838f = false;
                throw th2;
            }
        }
        return true;
    }

    public final void m(n nVar, Object obj, boolean z10) {
        int i10 = b.f24833a[nVar.b.b.ordinal()];
        if (i10 == 1) {
            h(nVar, obj);
            return;
        }
        if (i10 == 2) {
            if (z10) {
                h(nVar, obj);
                return;
            } else {
                this.f24820e.a(nVar, obj);
                return;
            }
        }
        if (i10 == 3) {
            if (z10) {
                this.f24821f.a(nVar, obj);
                return;
            } else {
                h(nVar, obj);
                return;
            }
        }
        if (i10 == 4) {
            this.f24822g.a(nVar, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + nVar.b.b);
    }

    public void n(Object obj) {
        List<l> listA = this.f24823h.a(obj.getClass());
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
        Class<?> cls = lVar.f24861c;
        n nVar = new n(obj, lVar);
        CopyOnWriteArrayList<n> copyOnWriteArrayList = this.f24817a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f24817a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(nVar)) {
            throw new e("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i10 = 0; i10 <= size; i10++) {
            if (i10 == size || lVar.f24862d > copyOnWriteArrayList.get(i10).b.f24862d) {
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
        if (lVar.f24863e) {
            if (!this.f24830o) {
                c(nVar, this.f24818c.get(cls));
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.f24818c.entrySet()) {
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
                Log.w(f24813q, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void q(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<n> copyOnWriteArrayList = this.f24817a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                n nVar = copyOnWriteArrayList.get(i10);
                if (nVar.f24875a == obj) {
                    nVar.f24876c = false;
                    copyOnWriteArrayList.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f24831p + ", eventInheritance=" + this.f24830o + "]";
    }

    public c(d dVar) {
        this.f24819d = new a();
        this.f24817a = new HashMap();
        this.b = new HashMap();
        this.f24818c = new ConcurrentHashMap();
        this.f24820e = new f(this, Looper.getMainLooper(), 10);
        this.f24821f = new mw.b(this);
        this.f24822g = new mw.a(this);
        List<nw.b> list = dVar.f24848j;
        this.f24831p = list != null ? list.size() : 0;
        this.f24823h = new m(dVar.f24848j, dVar.f24846h, dVar.f24845g);
        this.f24826k = dVar.f24840a;
        this.f24827l = dVar.b;
        this.f24828m = dVar.f24841c;
        this.f24829n = dVar.f24842d;
        this.f24825j = dVar.f24843e;
        this.f24830o = dVar.f24844f;
        this.f24824i = dVar.f24847i;
    }
}

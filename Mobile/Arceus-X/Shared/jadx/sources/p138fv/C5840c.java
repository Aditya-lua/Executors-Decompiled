package p138fv;

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
import p153gv.InterfaceC6247b;

/* JADX INFO: renamed from: fv.c */
/* JADX INFO: loaded from: classes2.dex */
public class C5840c {

    /* JADX INFO: renamed from: q */
    public static String f22245q = "EventBus";

    /* JADX INFO: renamed from: r */
    public static volatile C5840c f22246r;

    /* JADX INFO: renamed from: s */
    public static final C5841d f22247s = new C5841d();

    /* JADX INFO: renamed from: t */
    public static final Map<Class<?>, List<Class<?>>> f22248t = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, CopyOnWriteArrayList<C5851n>> f22249a;

    /* JADX INFO: renamed from: b */
    public final Map<Object, List<Class<?>>> f22250b;

    /* JADX INFO: renamed from: c */
    public final Map<Class<?>, Object> f22251c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal<c> f22252d;

    /* JADX INFO: renamed from: e */
    public final HandlerC5843f f22253e;

    /* JADX INFO: renamed from: f */
    public final RunnableC5839b f22254f;

    /* JADX INFO: renamed from: g */
    public final RunnableC5838a f22255g;

    /* JADX INFO: renamed from: h */
    public final C5850m f22256h;

    /* JADX INFO: renamed from: i */
    public final ExecutorService f22257i;

    /* JADX INFO: renamed from: j */
    public final boolean f22258j;

    /* JADX INFO: renamed from: k */
    public final boolean f22259k;

    /* JADX INFO: renamed from: l */
    public final boolean f22260l;

    /* JADX INFO: renamed from: m */
    public final boolean f22261m;

    /* JADX INFO: renamed from: n */
    public final boolean f22262n;

    /* JADX INFO: renamed from: o */
    public final boolean f22263o;

    /* JADX INFO: renamed from: p */
    public final int f22264p;

    /* JADX INFO: renamed from: fv.c$a */
    public class a extends ThreadLocal<c> {
        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c initialValue() {
            return new c();
        }
    }

    /* JADX INFO: renamed from: fv.c$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22266a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f22266a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22266a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22266a[ThreadMode.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22266a[ThreadMode.ASYNC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: fv.c$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final List<Object> f22267a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public boolean f22268b;

        /* JADX INFO: renamed from: c */
        public boolean f22269c;

        /* JADX INFO: renamed from: d */
        public C5851n f22270d;

        /* JADX INFO: renamed from: e */
        public Object f22271e;

        /* JADX INFO: renamed from: f */
        public boolean f22272f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5840c() {
        this(f22247s);
    }

    /* JADX INFO: renamed from: a */
    public static void m26202a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m26202a(list, cls.getInterfaces());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C5841d m26203b() {
        return new C5841d();
    }

    /* JADX INFO: renamed from: d */
    public static C5840c m26204d() {
        if (f22246r == null) {
            synchronized (C5840c.class) {
                try {
                    if (f22246r == null) {
                        f22246r = new C5840c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f22246r;
    }

    /* JADX INFO: renamed from: i */
    public static List<Class<?>> m26205i(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = f22248t;
        synchronized (map) {
            try {
                arrayList = map.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        m26202a(arrayList, superclass.getInterfaces());
                    }
                    f22248t.put(cls, arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final void m26206c(C5851n c5851n, Object obj) {
        if (obj != null) {
            m26214m(c5851n, obj, Looper.getMainLooper() == Looper.myLooper());
        }
    }

    /* JADX INFO: renamed from: e */
    public ExecutorService m26207e() {
        return this.f22257i;
    }

    /* JADX INFO: renamed from: f */
    public final void m26208f(C5851n c5851n, Object obj, Throwable th2) {
        if (!(obj instanceof C5848k)) {
            if (this.f22258j) {
                throw new C5842e("Invoking subscriber failed", th2);
            }
            if (this.f22259k) {
                Log.e(f22245q, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + c5851n.f22318a.getClass(), th2);
            }
            if (this.f22261m) {
                m26211j(new C5848k(this, th2, obj, c5851n.f22318a));
                return;
            }
            return;
        }
        if (this.f22259k) {
            Log.e(f22245q, "SubscriberExceptionEvent subscriber " + c5851n.f22318a.getClass() + " threw an exception", th2);
            C5848k c5848k = (C5848k) obj;
            Log.e(f22245q, "Initial event " + c5848k.f22298c + " caused exception in " + c5848k.f22299d, c5848k.f22297b);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m26209g(C5845h c5845h) {
        Object obj = c5845h.f22291a;
        C5851n c5851n = c5845h.f22292b;
        C5845h.m26223b(c5845h);
        if (c5851n.f22320c) {
            m26210h(c5851n, obj);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m26210h(C5851n c5851n, Object obj) {
        try {
            c5851n.f22319b.f22300a.invoke(c5851n.f22318a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            m26208f(c5851n, obj, e11.getCause());
        }
    }

    /* JADX INFO: renamed from: j */
    public void m26211j(Object obj) {
        c cVar = this.f22252d.get();
        List<Object> list = cVar.f22267a;
        list.add(obj);
        if (cVar.f22268b) {
            return;
        }
        cVar.f22269c = Looper.getMainLooper() == Looper.myLooper();
        cVar.f22268b = true;
        if (cVar.f22272f) {
            throw new C5842e("Internal error. Abort state was not reset");
        }
        while (!list.isEmpty()) {
            try {
                m26212k(list.remove(0), cVar);
            } catch (Throwable th2) {
                cVar.f22268b = false;
                cVar.f22269c = false;
                throw th2;
            }
        }
        cVar.f22268b = false;
        cVar.f22269c = false;
    }

    /* JADX INFO: renamed from: k */
    public final void m26212k(Object obj, c cVar) {
        boolean zM26213l;
        Class<?> cls = obj.getClass();
        if (this.f22263o) {
            List<Class<?>> listM26205i = m26205i(cls);
            int size = listM26205i.size();
            zM26213l = false;
            for (int i10 = 0; i10 < size; i10++) {
                zM26213l |= m26213l(obj, cVar, listM26205i.get(i10));
            }
        } else {
            zM26213l = m26213l(obj, cVar, cls);
        }
        if (zM26213l) {
            return;
        }
        if (this.f22260l) {
            Log.d(f22245q, "No subscribers registered for event " + cls);
        }
        if (!this.f22262n || cls == C5844g.class || cls == C5848k.class) {
            return;
        }
        m26211j(new C5844g(this, obj));
    }

    /* JADX INFO: renamed from: l */
    public final boolean m26213l(Object obj, c cVar, Class<?> cls) {
        CopyOnWriteArrayList<C5851n> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f22249a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (C5851n c5851n : copyOnWriteArrayList) {
            cVar.f22271e = obj;
            cVar.f22270d = c5851n;
            try {
                m26214m(c5851n, obj, cVar.f22269c);
                boolean z10 = cVar.f22272f;
                cVar.f22271e = null;
                cVar.f22270d = null;
                cVar.f22272f = false;
                if (z10) {
                    return true;
                }
            } catch (Throwable th2) {
                cVar.f22271e = null;
                cVar.f22270d = null;
                cVar.f22272f = false;
                throw th2;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m26214m(C5851n c5851n, Object obj, boolean z10) {
        int i10 = b.f22266a[c5851n.f22319b.f22301b.ordinal()];
        if (i10 == 1) {
            m26210h(c5851n, obj);
            return;
        }
        if (i10 == 2) {
            if (z10) {
                m26210h(c5851n, obj);
                return;
            } else {
                this.f22253e.m26221a(c5851n, obj);
                return;
            }
        }
        if (i10 == 3) {
            if (z10) {
                this.f22254f.m26201a(c5851n, obj);
                return;
            } else {
                m26210h(c5851n, obj);
                return;
            }
        }
        if (i10 == 4) {
            this.f22255g.m26200a(c5851n, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + c5851n.f22319b.f22301b);
    }

    /* JADX INFO: renamed from: n */
    public void m26215n(Object obj) {
        List<C5849l> listM26228a = this.f22256h.m26228a(obj.getClass());
        synchronized (this) {
            try {
                Iterator<C5849l> it = listM26228a.iterator();
                while (it.hasNext()) {
                    m26216o(obj, it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m26216o(Object obj, C5849l c5849l) {
        Class<?> cls = c5849l.f22302c;
        C5851n c5851n = new C5851n(obj, c5849l);
        CopyOnWriteArrayList<C5851n> copyOnWriteArrayList = this.f22249a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f22249a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(c5851n)) {
            throw new C5842e("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i10 = 0; i10 <= size; i10++) {
            if (i10 == size || c5849l.f22303d > copyOnWriteArrayList.get(i10).f22319b.f22303d) {
                copyOnWriteArrayList.add(i10, c5851n);
                break;
            }
        }
        List<Class<?>> arrayList = this.f22250b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f22250b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (c5849l.f22304e) {
            if (!this.f22263o) {
                m26206c(c5851n, this.f22251c.get(cls));
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.f22251c.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    m26206c(c5851n, entry.getValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public synchronized void m26217p(Object obj) {
        try {
            List<Class<?>> list = this.f22250b.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    m26218q(obj, it.next());
                }
                this.f22250b.remove(obj);
            } else {
                Log.w(f22245q, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m26218q(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<C5851n> copyOnWriteArrayList = this.f22249a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                C5851n c5851n = copyOnWriteArrayList.get(i10);
                if (c5851n.f22318a == obj) {
                    c5851n.f22320c = false;
                    copyOnWriteArrayList.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f22264p + ", eventInheritance=" + this.f22263o + "]";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5840c(C5841d c5841d) {
        this.f22252d = new a();
        this.f22249a = new HashMap();
        this.f22250b = new HashMap();
        this.f22251c = new ConcurrentHashMap();
        this.f22253e = new HandlerC5843f(this, Looper.getMainLooper(), 10);
        this.f22254f = new RunnableC5839b(this);
        this.f22255g = new RunnableC5838a(this);
        List<InterfaceC6247b> list = c5841d.f22283j;
        this.f22264p = list != null ? list.size() : 0;
        this.f22256h = new C5850m(c5841d.f22283j, c5841d.f22281h, c5841d.f22280g);
        this.f22259k = c5841d.f22274a;
        this.f22260l = c5841d.f22275b;
        this.f22261m = c5841d.f22276c;
        this.f22262n = c5841d.f22277d;
        this.f22258j = c5841d.f22278e;
        this.f22263o = c5841d.f22279f;
        this.f22257i = c5841d.f22282i;
    }
}

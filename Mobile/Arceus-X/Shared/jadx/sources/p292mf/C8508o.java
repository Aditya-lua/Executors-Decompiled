package p292mf;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p348p1.C10146t;
import p380qf.InterfaceC10577a;
import p490vf.InterfaceC12166c;
import p490vf.InterfaceC12167d;
import p575yf.InterfaceC13188b;

/* JADX INFO: renamed from: mf.o */
/* JADX INFO: loaded from: classes2.dex */
public class C8508o implements InterfaceC8494d, InterfaceC10577a {

    /* JADX INFO: renamed from: i */
    public static final InterfaceC13188b<Set<Object>> f31240i = new InterfaceC13188b() { // from class: mf.k
        @Override // p575yf.InterfaceC13188b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* JADX INFO: renamed from: a */
    public final Map<C8492c<?>, InterfaceC13188b<?>> f31241a;

    /* JADX INFO: renamed from: b */
    public final Map<C8497e0<?>, InterfaceC13188b<?>> f31242b;

    /* JADX INFO: renamed from: c */
    public final Map<C8497e0<?>, C8518y<?>> f31243c;

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC13188b<ComponentRegistrar>> f31244d;

    /* JADX INFO: renamed from: e */
    public Set<String> f31245e;

    /* JADX INFO: renamed from: f */
    public final C8515v f31246f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference<Boolean> f31247g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC8502i f31248h;

    /* JADX INFO: renamed from: mf.o$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Executor f31249a;

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC13188b<ComponentRegistrar>> f31250b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final List<C8492c<?>> f31251c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public InterfaceC8502i f31252d = InterfaceC8502i.f31232a;

        public b(Executor executor) {
            this.f31249a = executor;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ ComponentRegistrar m34338a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        /* JADX INFO: renamed from: b */
        public b m34339b(C8492c<?> c8492c) {
            this.f31251c.add(c8492c);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m34340c(final ComponentRegistrar componentRegistrar) {
            this.f31250b.add(new InterfaceC13188b() { // from class: mf.p
                @Override // p575yf.InterfaceC13188b
                public final Object get() {
                    return C8508o.b.m34338a(componentRegistrar);
                }
            });
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m34341d(Collection<InterfaceC13188b<ComponentRegistrar>> collection) {
            this.f31250b.addAll(collection);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C8508o m34342e() {
            return new C8508o(this.f31249a, this.f31250b, this.f31251c, this.f31252d);
        }

        /* JADX INFO: renamed from: f */
        public b m34343f(InterfaceC8502i interfaceC8502i) {
            this.f31252d = interfaceC8502i;
            return this;
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m34324h(C8508o c8508o, C8492c c8492c) {
        c8508o.getClass();
        return c8492c.m34282h().create(new C8499f0(c8492c, c8508o));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ ComponentRegistrar m34326j(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    /* JADX INFO: renamed from: l */
    public static b m34328l(Executor executor) {
        return new b(executor);
    }

    /* JADX INFO: renamed from: p */
    public static <T> List<T> m34329p(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public static Iterable<InterfaceC13188b<ComponentRegistrar>> m34330u(Iterable<ComponentRegistrar> iterable) {
        ArrayList arrayList = new ArrayList();
        for (final ComponentRegistrar componentRegistrar : iterable) {
            arrayList.add(new InterfaceC13188b() { // from class: mf.j
                @Override // p575yf.InterfaceC13188b
                public final Object get() {
                    return C8508o.m34326j(componentRegistrar);
                }
            });
        }
        return arrayList;
    }

    @Override // p292mf.InterfaceC8494d
    /* JADX INFO: renamed from: c */
    public synchronized <T> InterfaceC13188b<T> mo34306c(C8497e0<T> c8497e0) {
        C8495d0.m34313c(c8497e0, "Null interface requested.");
        return (InterfaceC13188b) this.f31242b.get(c8497e0);
    }

    @Override // p292mf.InterfaceC8494d
    /* JADX INFO: renamed from: e */
    public synchronized <T> InterfaceC13188b<Set<T>> mo34308e(C8497e0<T> c8497e0) {
        C8518y<?> c8518y = this.f31243c.get(c8497e0);
        if (c8518y != null) {
            return c8518y;
        }
        return (InterfaceC13188b<Set<T>>) f31240i;
    }

    /* JADX INFO: renamed from: m */
    public final void m34331m(List<C8492c<?>> list) {
        int i10;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<InterfaceC13188b<ComponentRegistrar>> it = this.f31244d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f31248h.mo29953a(componentRegistrar));
                        it.remove();
                    }
                } catch (C8516w e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator<C8492c<?>> it2 = list.iterator();
            while (true) {
                i10 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Object[] array = it2.next().m34284j().toArray();
                int length = array.length;
                while (i10 < length) {
                    Object obj = array[i10];
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f31245e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f31245e.add(obj.toString());
                    }
                    i10++;
                }
            }
            if (this.f31241a.isEmpty()) {
                C8510q.m34344a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f31241a.keySet());
                arrayList2.addAll(list);
                C8510q.m34344a(arrayList2);
            }
            for (final C8492c<?> c8492c : list) {
                this.f31241a.put(c8492c, new C8517x(new InterfaceC13188b() { // from class: mf.l
                    @Override // p575yf.InterfaceC13188b
                    public final Object get() {
                        return C8508o.m34324h(this.f31234a, c8492c);
                    }
                }));
            }
            arrayList.addAll(m34336s(list));
            arrayList.addAll(m34337t());
            m34335r();
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
        m34334q();
    }

    /* JADX INFO: renamed from: n */
    public final void m34332n(Map<C8492c<?>, InterfaceC13188b<?>> map, boolean z10) {
        for (Map.Entry<C8492c<?>, InterfaceC13188b<?>> entry : map.entrySet()) {
            C8492c<?> key = entry.getKey();
            InterfaceC13188b<?> value = entry.getValue();
            if (key.m34286n() || (key.m34287o() && z10)) {
                value.get();
            }
        }
        this.f31246f.m34372e();
    }

    /* JADX INFO: renamed from: o */
    public void m34333o(boolean z10) {
        HashMap map;
        if (C10146t.m39085a(this.f31247g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f31241a);
            }
            m34332n(map, z10);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m34334q() {
        Boolean bool = this.f31247g.get();
        if (bool != null) {
            m34332n(this.f31241a, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m34335r() {
        for (C8492c<?> c8492c : this.f31241a.keySet()) {
            for (C8511r c8511r : c8492c.m34281g()) {
                if (c8511r.m34367f() && !this.f31243c.containsKey(c8511r.m34363b())) {
                    this.f31243c.put(c8511r.m34363b(), C8518y.m34375b(Collections.EMPTY_SET));
                } else if (this.f31242b.containsKey(c8511r.m34363b())) {
                    continue;
                } else {
                    if (c8511r.m34366e()) {
                        throw new C8519z(String.format("Unsatisfied dependency for component %s: %s", c8492c, c8511r.m34363b()));
                    }
                    if (!c8511r.m34367f()) {
                        this.f31242b.put(c8511r.m34363b(), C8493c0.m34302c());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final List<Runnable> m34336s(List<C8492c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C8492c<?> c8492c : list) {
            if (c8492c.m34288p()) {
                final InterfaceC13188b<?> interfaceC13188b = this.f31241a.get(c8492c);
                for (C8497e0<? super Object> c8497e0 : c8492c.m34284j()) {
                    if (this.f31242b.containsKey(c8497e0)) {
                        final C8493c0 c8493c0 = (C8493c0) this.f31242b.get(c8497e0);
                        arrayList.add(new Runnable() { // from class: mf.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                c8493c0.m34303d(interfaceC13188b);
                            }
                        });
                    } else {
                        this.f31242b.put(c8497e0, interfaceC13188b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public final List<Runnable> m34337t() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<C8492c<?>, InterfaceC13188b<?>> entry : this.f31241a.entrySet()) {
            C8492c<?> key = entry.getKey();
            if (!key.m34288p()) {
                InterfaceC13188b<?> value = entry.getValue();
                for (C8497e0<? super Object> c8497e0 : key.m34284j()) {
                    if (!map.containsKey(c8497e0)) {
                        map.put(c8497e0, new HashSet());
                    }
                    ((Set) map.get(c8497e0)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f31243c.containsKey(entry2.getKey())) {
                final C8518y<?> c8518y = this.f31243c.get(entry2.getKey());
                for (final InterfaceC13188b interfaceC13188b : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: mf.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            c8518y.m34376a(interfaceC13188b);
                        }
                    });
                }
            } else {
                this.f31243c.put((C8497e0) entry2.getKey(), C8518y.m34375b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public C8508o(Executor executor, Iterable<ComponentRegistrar> iterable, C8492c<?>... c8492cArr) {
        this(executor, m34330u(iterable), Arrays.asList(c8492cArr), InterfaceC8502i.f31232a);
    }

    public C8508o(Executor executor, Iterable<InterfaceC13188b<ComponentRegistrar>> iterable, Collection<C8492c<?>> collection, InterfaceC8502i interfaceC8502i) {
        this.f31241a = new HashMap();
        this.f31242b = new HashMap();
        this.f31243c = new HashMap();
        this.f31245e = new HashSet();
        this.f31247g = new AtomicReference<>();
        C8515v c8515v = new C8515v(executor);
        this.f31246f = c8515v;
        this.f31248h = interfaceC8502i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8492c.m34280q(c8515v, C8515v.class, InterfaceC12167d.class, InterfaceC12166c.class));
        arrayList.add(C8492c.m34280q(this, InterfaceC10577a.class, new Class[0]));
        for (C8492c<?> c8492c : collection) {
            if (c8492c != null) {
                arrayList.add(c8492c);
            }
        }
        this.f31244d = m34329p(iterable);
        m34331m(arrayList);
    }
}

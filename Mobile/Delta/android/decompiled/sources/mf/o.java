package mf;

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

/* JADX INFO: loaded from: classes2.dex */
public class o implements d, qf.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final yf.b<Set<Object>> f24735i = new yf.b() { // from class: mf.k
        @Override // yf.b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<c<?>, yf.b<?>> f24736a;
    public final Map<e0<?>, yf.b<?>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<e0<?>, y<?>> f24737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<yf.b<ComponentRegistrar>> f24738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set<String> f24739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f24740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<Boolean> f24741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f24742h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f24743a;
        public final List<yf.b<ComponentRegistrar>> b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<c<?>> f24744c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public i f24745d = i.f24730a;

        public b(Executor executor) {
            this.f24743a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c<?> cVar) {
            this.f24744c.add(cVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.b.add(new yf.b() { // from class: mf.p
                @Override // yf.b
                public final Object get() {
                    return o.b.a(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection<yf.b<ComponentRegistrar>> collection) {
            this.b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f24743a, this.b, this.f24744c, this.f24745d);
        }

        public b f(i iVar) {
            this.f24745d = iVar;
            return this;
        }
    }

    public static /* synthetic */ Object h(o oVar, c cVar) {
        oVar.getClass();
        return cVar.h().create(new f0(cVar, oVar));
    }

    public static /* synthetic */ ComponentRegistrar j(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    public static b l(Executor executor) {
        return new b(executor);
    }

    public static <T> List<T> p(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Iterable<yf.b<ComponentRegistrar>> u(Iterable<ComponentRegistrar> iterable) {
        ArrayList arrayList = new ArrayList();
        for (final ComponentRegistrar componentRegistrar : iterable) {
            arrayList.add(new yf.b() { // from class: mf.j
                @Override // yf.b
                public final Object get() {
                    return o.j(componentRegistrar);
                }
            });
        }
        return arrayList;
    }

    @Override // mf.d
    public synchronized <T> yf.b<T> c(e0<T> e0Var) {
        d0.c(e0Var, "Null interface requested.");
        return (yf.b) this.b.get(e0Var);
    }

    @Override // mf.d
    public synchronized <T> yf.b<Set<T>> e(e0<T> e0Var) {
        y<?> yVar = this.f24737c.get(e0Var);
        if (yVar != null) {
            return yVar;
        }
        return (yf.b<Set<T>>) f24735i;
    }

    public final void m(List<c<?>> list) {
        int i10;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<yf.b<ComponentRegistrar>> it = this.f24738d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f24742h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator<c<?>> it2 = list.iterator();
            while (true) {
                i10 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Object[] array = it2.next().j().toArray();
                int length = array.length;
                while (i10 < length) {
                    Object obj = array[i10];
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f24739e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f24739e.add(obj.toString());
                    }
                    i10++;
                }
            }
            if (this.f24736a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f24736a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            for (final c<?> cVar : list) {
                this.f24736a.put(cVar, new x(new yf.b() { // from class: mf.l
                    @Override // yf.b
                    public final Object get() {
                        return o.h(this.f24732a, cVar);
                    }
                }));
            }
            arrayList.addAll(s(list));
            arrayList.addAll(t());
            r();
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
        q();
    }

    public final void n(Map<c<?>, yf.b<?>> map, boolean z10) {
        for (Map.Entry<c<?>, yf.b<?>> entry : map.entrySet()) {
            c<?> key = entry.getKey();
            yf.b<?> value = entry.getValue();
            if (key.n() || (key.o() && z10)) {
                value.get();
            }
        }
        this.f24740f.d();
    }

    public void o(boolean z10) {
        HashMap map;
        if (p1.t.a(this.f24741g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f24736a);
            }
            n(map, z10);
        }
    }

    public final void q() {
        Boolean bool = this.f24741g.get();
        if (bool != null) {
            n(this.f24736a, bool.booleanValue());
        }
    }

    public final void r() {
        for (c<?> cVar : this.f24736a.keySet()) {
            for (r rVar : cVar.g()) {
                if (rVar.f() && !this.f24737c.containsKey(rVar.b())) {
                    this.f24737c.put(rVar.b(), y.b(Collections.EMPTY_SET));
                } else if (this.b.containsKey(rVar.b())) {
                    continue;
                } else {
                    if (rVar.e()) {
                        throw new z(String.format("Unsatisfied dependency for component %s: %s", cVar, rVar.b()));
                    }
                    if (!rVar.f()) {
                        this.b.put(rVar.b(), c0.c());
                    }
                }
            }
        }
    }

    public final List<Runnable> s(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c<?> cVar : list) {
            if (cVar.p()) {
                final yf.b<?> bVar = this.f24736a.get(cVar);
                for (e0<? super Object> e0Var : cVar.j()) {
                    if (this.b.containsKey(e0Var)) {
                        final c0 c0Var = (c0) this.b.get(e0Var);
                        arrayList.add(new Runnable() { // from class: mf.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0Var.d(bVar);
                            }
                        });
                    } else {
                        this.b.put(e0Var, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Runnable> t() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<c<?>, yf.b<?>> entry : this.f24736a.entrySet()) {
            c<?> key = entry.getKey();
            if (!key.p()) {
                yf.b<?> value = entry.getValue();
                for (e0<? super Object> e0Var : key.j()) {
                    if (!map.containsKey(e0Var)) {
                        map.put(e0Var, new HashSet());
                    }
                    ((Set) map.get(e0Var)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f24737c.containsKey(entry2.getKey())) {
                final y<?> yVar = this.f24737c.get(entry2.getKey());
                for (final yf.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: mf.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            yVar.a(bVar);
                        }
                    });
                }
            } else {
                this.f24737c.put((e0) entry2.getKey(), y.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Deprecated
    public o(Executor executor, Iterable<ComponentRegistrar> iterable, c<?>... cVarArr) {
        this(executor, u(iterable), Arrays.asList(cVarArr), i.f24730a);
    }

    public o(Executor executor, Iterable<yf.b<ComponentRegistrar>> iterable, Collection<c<?>> collection, i iVar) {
        this.f24736a = new HashMap();
        this.b = new HashMap();
        this.f24737c = new HashMap();
        this.f24739e = new HashSet();
        this.f24741g = new AtomicReference<>();
        v vVar = new v(executor);
        this.f24740f = vVar;
        this.f24742h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.q(vVar, v.class, vf.d.class, vf.c.class));
        arrayList.add(c.q(this, qf.a.class, new Class[0]));
        for (c<?> cVar : collection) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f24738d = p(iterable);
        m(arrayList);
    }
}

package of;

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
public class o implements d, sf.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ag.b<Set<Object>> f28098i = new ag.b() { // from class: of.k
        @Override // ag.b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<c<?>, ag.b<?>> f28099a;
    public final Map<e0<?>, ag.b<?>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<e0<?>, y<?>> f28100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<ag.b<ComponentRegistrar>> f28101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set<String> f28102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f28103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<Boolean> f28104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f28105h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f28106a;
        public final List<ag.b<ComponentRegistrar>> b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<c<?>> f28107c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public i f28108d = i.f28093a;

        public b(Executor executor) {
            this.f28106a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c<?> cVar) {
            this.f28107c.add(cVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.b.add(new ag.b() { // from class: of.p
                @Override // ag.b
                public final Object get() {
                    return o.b.a(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection<ag.b<ComponentRegistrar>> collection) {
            this.b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f28106a, this.b, this.f28107c, this.f28108d);
        }

        public b f(i iVar) {
            this.f28108d = iVar;
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

    public static Iterable<ag.b<ComponentRegistrar>> u(Iterable<ComponentRegistrar> iterable) {
        ArrayList arrayList = new ArrayList();
        for (final ComponentRegistrar componentRegistrar : iterable) {
            arrayList.add(new ag.b() { // from class: of.j
                @Override // ag.b
                public final Object get() {
                    return o.j(componentRegistrar);
                }
            });
        }
        return arrayList;
    }

    @Override // of.d
    public synchronized <T> ag.b<Set<T>> b(e0<T> e0Var) {
        y<?> yVar = this.f28100c.get(e0Var);
        if (yVar != null) {
            return yVar;
        }
        return (ag.b<Set<T>>) f28098i;
    }

    @Override // of.d
    public synchronized <T> ag.b<T> g(e0<T> e0Var) {
        d0.c(e0Var, "Null interface requested.");
        return (ag.b) this.b.get(e0Var);
    }

    public final void m(List<c<?>> list) {
        int i10;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<ag.b<ComponentRegistrar>> it = this.f28101d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f28105h.a(componentRegistrar));
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
                        if (this.f28102e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f28102e.add(obj.toString());
                    }
                    i10++;
                }
            }
            if (this.f28099a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f28099a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            for (final c<?> cVar : list) {
                this.f28099a.put(cVar, new x(new ag.b() { // from class: of.l
                    @Override // ag.b
                    public final Object get() {
                        return o.h(this.f28095a, cVar);
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

    public final void n(Map<c<?>, ag.b<?>> map, boolean z10) {
        for (Map.Entry<c<?>, ag.b<?>> entry : map.entrySet()) {
            c<?> key = entry.getKey();
            ag.b<?> value = entry.getValue();
            if (key.n() || (key.o() && z10)) {
                value.get();
            }
        }
        this.f28103f.d();
    }

    public void o(boolean z10) {
        HashMap map;
        if (p1.t.a(this.f28104g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f28099a);
            }
            n(map, z10);
        }
    }

    public final void q() {
        Boolean bool = this.f28104g.get();
        if (bool != null) {
            n(this.f28099a, bool.booleanValue());
        }
    }

    public final void r() {
        for (c<?> cVar : this.f28099a.keySet()) {
            for (r rVar : cVar.g()) {
                if (rVar.f() && !this.f28100c.containsKey(rVar.b())) {
                    this.f28100c.put(rVar.b(), y.b(Collections.EMPTY_SET));
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
                final ag.b<?> bVar = this.f28099a.get(cVar);
                for (e0<? super Object> e0Var : cVar.j()) {
                    if (this.b.containsKey(e0Var)) {
                        final c0 c0Var = (c0) this.b.get(e0Var);
                        arrayList.add(new Runnable() { // from class: of.m
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
        for (Map.Entry<c<?>, ag.b<?>> entry : this.f28099a.entrySet()) {
            c<?> key = entry.getKey();
            if (!key.p()) {
                ag.b<?> value = entry.getValue();
                for (e0<? super Object> e0Var : key.j()) {
                    if (!map.containsKey(e0Var)) {
                        map.put(e0Var, new HashSet());
                    }
                    ((Set) map.get(e0Var)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f28100c.containsKey(entry2.getKey())) {
                final y<?> yVar = this.f28100c.get(entry2.getKey());
                for (final ag.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: of.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            yVar.a(bVar);
                        }
                    });
                }
            } else {
                this.f28100c.put((e0) entry2.getKey(), y.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Deprecated
    public o(Executor executor, Iterable<ComponentRegistrar> iterable, c<?>... cVarArr) {
        this(executor, u(iterable), Arrays.asList(cVarArr), i.f28093a);
    }

    public o(Executor executor, Iterable<ag.b<ComponentRegistrar>> iterable, Collection<c<?>> collection, i iVar) {
        this.f28099a = new HashMap();
        this.b = new HashMap();
        this.f28100c = new HashMap();
        this.f28102e = new HashSet();
        this.f28104g = new AtomicReference<>();
        v vVar = new v(executor);
        this.f28103f = vVar;
        this.f28105h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.q(vVar, v.class, xf.d.class, xf.c.class));
        arrayList.add(c.q(this, sf.a.class, new Class[0]));
        for (c<?> cVar : collection) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f28101d = p(iterable);
        m(arrayList);
    }
}

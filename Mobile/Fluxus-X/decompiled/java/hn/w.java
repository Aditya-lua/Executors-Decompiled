package hn;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<h.e> f18428e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h.e> f18429a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadLocal<d> f18430c = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Object, h<?>> f18431d = new LinkedHashMap();

    public class a implements h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f18432a;
        public final /* synthetic */ h b;

        public a(Type type, h hVar) {
            this.f18432a = type;
            this.b = hVar;
        }

        @Override // hn.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
            if (set.isEmpty() && jn.c.w(this.f18432a, type)) {
                return this.b;
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<h.e> f18433a = new ArrayList();
        public int b = 0;

        public b a(h.e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("factory == null");
            }
            List<h.e> list = this.f18433a;
            int i10 = this.b;
            this.b = i10 + 1;
            list.add(i10, eVar);
            return this;
        }

        public b b(Object obj) {
            if (obj != null) {
                return a(hn.a.c(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }

        public <T> b c(Type type, h<T> hVar) {
            return a(w.h(type, hVar));
        }

        public w d() {
            return new w(this);
        }
    }

    public static final class c<T> extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f18434a;
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f18435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public h<T> f18436d;

        public c(Type type, String str, Object obj) {
            this.f18434a = type;
            this.b = str;
            this.f18435c = obj;
        }

        @Override // hn.h
        public T fromJson(m mVar) {
            h<T> hVar = this.f18436d;
            if (hVar != null) {
                return hVar.fromJson(mVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // hn.h
        public void toJson(t tVar, T t8) {
            h<T> hVar = this.f18436d;
            if (hVar == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            hVar.toJson(tVar, t8);
        }

        public String toString() {
            h<T> hVar = this.f18436d;
            return hVar != null ? hVar.toString() : super.toString();
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<c<?>> f18437a = new ArrayList();
        public final Deque<c<?>> b = new ArrayDeque();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f18438c;

        public d() {
        }

        public <T> void a(h<T> hVar) {
            this.b.getLast().f18436d = hVar;
        }

        public IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
            if (!this.f18438c) {
                this.f18438c = true;
                if (this.b.size() != 1 || this.b.getFirst().b != null) {
                    StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator<c<?>> itDescendingIterator = this.b.descendingIterator();
                    while (itDescendingIterator.hasNext()) {
                        c<?> next = itDescendingIterator.next();
                        sb2.append("\nfor ");
                        sb2.append(next.f18434a);
                        if (next.b != null) {
                            sb2.append(' ');
                            sb2.append(next.b);
                        }
                    }
                    return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }

        public void c(boolean z10) {
            this.b.removeLast();
            if (this.b.isEmpty()) {
                w.this.f18430c.remove();
                if (z10) {
                    synchronized (w.this.f18431d) {
                        try {
                            int size = this.f18437a.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                c<?> cVar = this.f18437a.get(i10);
                                h<T> hVar = (h) w.this.f18431d.put(cVar.f18435c, cVar.f18436d);
                                if (hVar != 0) {
                                    cVar.f18436d = hVar;
                                    w.this.f18431d.put(cVar.f18435c, hVar);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }

        public <T> h<T> d(Type type, String str, Object obj) {
            int size = this.f18437a.size();
            for (int i10 = 0; i10 < size; i10++) {
                c<?> cVar = this.f18437a.get(i10);
                if (cVar.f18435c.equals(obj)) {
                    this.b.add(cVar);
                    h<T> hVar = (h<T>) cVar.f18436d;
                    return hVar != null ? hVar : cVar;
                }
            }
            c<?> cVar2 = new c<>(type, str, obj);
            this.f18437a.add(cVar2);
            this.b.add(cVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f18428e = arrayList;
        arrayList.add(y.f18441a);
        arrayList.add(e.b);
        arrayList.add(v.f18426c);
        arrayList.add(hn.b.f18319c);
        arrayList.add(x.f18440a);
        arrayList.add(hn.d.f18327d);
    }

    public w(b bVar) {
        int size = bVar.f18433a.size();
        List<h.e> list = f18428e;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(bVar.f18433a);
        arrayList.addAll(list);
        this.f18429a = Collections.unmodifiableList(arrayList);
        this.b = bVar.b;
    }

    public static <T> h.e h(Type type, h<T> hVar) {
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        }
        if (hVar != null) {
            return new a(type, hVar);
        }
        throw new IllegalArgumentException("jsonAdapter == null");
    }

    public <T> h<T> c(Class<T> cls) {
        return e(cls, jn.c.f20815a);
    }

    public <T> h<T> d(Type type) {
        return e(type, jn.c.f20815a);
    }

    public <T> h<T> e(Type type, Set<? extends Annotation> set) {
        return f(type, set, null);
    }

    public <T> h<T> f(Type type, Set<? extends Annotation> set, String str) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeP = jn.c.p(jn.c.a(type));
        Object objG = g(typeP, set);
        synchronized (this.f18431d) {
            try {
                h<T> hVar = (h) this.f18431d.get(objG);
                if (hVar != null) {
                    return hVar;
                }
                d dVar = this.f18430c.get();
                if (dVar == null) {
                    dVar = new d();
                    this.f18430c.set(dVar);
                }
                h<T> hVarD = dVar.d(typeP, str, objG);
                try {
                    if (hVarD != null) {
                        dVar.c(false);
                        return hVarD;
                    }
                    try {
                        int size = this.f18429a.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            h<T> hVar2 = (h<T>) this.f18429a.get(i10).create(typeP, set, this);
                            if (hVar2 != null) {
                                dVar.a(hVar2);
                                dVar.c(true);
                                return hVar2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + jn.c.u(typeP, set));
                    } catch (IllegalArgumentException e10) {
                        throw dVar.b(e10);
                    }
                } catch (Throwable th2) {
                    dVar.c(false);
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final Object g(Type type, Set<? extends Annotation> set) {
        return set.isEmpty() ? type : Arrays.asList(type, set);
    }

    public <T> h<T> i(h.e eVar, Type type, Set<? extends Annotation> set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeP = jn.c.p(jn.c.a(type));
        int iIndexOf = this.f18429a.indexOf(eVar);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + eVar);
        }
        int size = this.f18429a.size();
        for (int i10 = iIndexOf + 1; i10 < size; i10++) {
            h<T> hVar = (h<T>) this.f18429a.get(i10).create(typeP, set, this);
            if (hVar != null) {
                return hVar;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + jn.c.u(typeP, set));
    }
}

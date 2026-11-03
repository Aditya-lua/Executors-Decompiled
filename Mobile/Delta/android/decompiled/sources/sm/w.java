package sm;

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
    public static final List<h.e> f31673e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h.e> f31674a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadLocal<d> f31675c = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Object, h<?>> f31676d = new LinkedHashMap();

    public class a implements h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f31677a;
        public final /* synthetic */ h b;

        public a(Type type, h hVar) {
            this.f31677a = type;
            this.b = hVar;
        }

        @Override // sm.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
            if (set.isEmpty() && um.c.w(this.f31677a, type)) {
                return this.b;
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<h.e> f31678a = new ArrayList();
        public int b = 0;

        public b a(Object obj) {
            if (obj != null) {
                return c(sm.a.c(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }

        public <T> b b(Type type, h<T> hVar) {
            return c(w.h(type, hVar));
        }

        public b c(h.e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("factory == null");
            }
            List<h.e> list = this.f31678a;
            int i10 = this.b;
            this.b = i10 + 1;
            list.add(i10, eVar);
            return this;
        }

        public w d() {
            return new w(this);
        }
    }

    public static final class c<T> extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f31679a;
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f31680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public h<T> f31681d;

        public c(Type type, String str, Object obj) {
            this.f31679a = type;
            this.b = str;
            this.f31680c = obj;
        }

        @Override // sm.h
        public T fromJson(m mVar) {
            h<T> hVar = this.f31681d;
            if (hVar != null) {
                return hVar.fromJson(mVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // sm.h
        public void toJson(t tVar, T t8) {
            h<T> hVar = this.f31681d;
            if (hVar == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            hVar.toJson(tVar, t8);
        }

        public String toString() {
            h<T> hVar = this.f31681d;
            return hVar != null ? hVar.toString() : super.toString();
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<c<?>> f31682a = new ArrayList();
        public final Deque<c<?>> b = new ArrayDeque();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f31683c;

        public d() {
        }

        public <T> void a(h<T> hVar) {
            this.b.getLast().f31681d = hVar;
        }

        public IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
            if (!this.f31683c) {
                this.f31683c = true;
                if (this.b.size() != 1 || this.b.getFirst().b != null) {
                    StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator<c<?>> itDescendingIterator = this.b.descendingIterator();
                    while (itDescendingIterator.hasNext()) {
                        c<?> next = itDescendingIterator.next();
                        sb2.append("\nfor ");
                        sb2.append(next.f31679a);
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
                w.this.f31675c.remove();
                if (z10) {
                    synchronized (w.this.f31676d) {
                        try {
                            int size = this.f31682a.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                c<?> cVar = this.f31682a.get(i10);
                                h<T> hVar = (h) w.this.f31676d.put(cVar.f31680c, cVar.f31681d);
                                if (hVar != 0) {
                                    cVar.f31681d = hVar;
                                    w.this.f31676d.put(cVar.f31680c, hVar);
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
            int size = this.f31682a.size();
            for (int i10 = 0; i10 < size; i10++) {
                c<?> cVar = this.f31682a.get(i10);
                if (cVar.f31680c.equals(obj)) {
                    this.b.add(cVar);
                    h<T> hVar = (h<T>) cVar.f31681d;
                    return hVar != null ? hVar : cVar;
                }
            }
            c<?> cVar2 = new c<>(type, str, obj);
            this.f31682a.add(cVar2);
            this.b.add(cVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f31673e = arrayList;
        arrayList.add(y.f31686a);
        arrayList.add(e.b);
        arrayList.add(v.f31671c);
        arrayList.add(sm.b.f31564c);
        arrayList.add(x.f31685a);
        arrayList.add(sm.d.f31572d);
    }

    public w(b bVar) {
        int size = bVar.f31678a.size();
        List<h.e> list = f31673e;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(bVar.f31678a);
        arrayList.addAll(list);
        this.f31674a = Collections.unmodifiableList(arrayList);
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
        return e(cls, um.c.f33128a);
    }

    public <T> h<T> d(Type type) {
        return e(type, um.c.f33128a);
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
        Type typeP = um.c.p(um.c.a(type));
        Object objG = g(typeP, set);
        synchronized (this.f31676d) {
            try {
                h<T> hVar = (h) this.f31676d.get(objG);
                if (hVar != null) {
                    return hVar;
                }
                d dVar = this.f31675c.get();
                if (dVar == null) {
                    dVar = new d();
                    this.f31675c.set(dVar);
                }
                h<T> hVarD = dVar.d(typeP, str, objG);
                try {
                    if (hVarD != null) {
                        dVar.c(false);
                        return hVarD;
                    }
                    try {
                        int size = this.f31674a.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            h<T> hVar2 = (h<T>) this.f31674a.get(i10).create(typeP, set, this);
                            if (hVar2 != null) {
                                dVar.a(hVar2);
                                dVar.c(true);
                                return hVar2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + um.c.u(typeP, set));
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
        Type typeP = um.c.p(um.c.a(type));
        int iIndexOf = this.f31674a.indexOf(eVar);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + eVar);
        }
        int size = this.f31674a.size();
        for (int i10 = iIndexOf + 1; i10 < size; i10++) {
            h<T> hVar = (h<T>) this.f31674a.get(i10).create(typeP, set, this);
            if (hVar != null) {
                return hVar;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + um.c.u(typeP, set));
    }
}
